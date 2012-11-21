package com.xgl.parser.elem

import scala.xml.Node

trait FacesParent extends XGLParserNode {
  val positionDataMap: Map[Int, Position]
  lazy val faces = xgl \ "F" map(new Face(_, positionDataMap))
}

class Face(val xgl: Node, val positionDataMap: Map[Int, Position]) extends PositionDataSource {
    private def vertex(i: Int) = new FaceVertex((xgl \ s"FV$i")(0), positionDataMap)
    val vertex1 = vertex(1)
    val vertex2 = vertex(2)
    val vertex3 = vertex(3)
}

class FaceVertex(val xgl: Node, val positionDataMap: Map[Int, Position]) extends PositionParent with PositionDataSource {
  
}