package com.xgl.parser.elem

import scala.xml.Node
import collection.JavaConversions.seqAsJavaList

trait FacesParent extends XGLParserNode {
  val positionDataMap: Map[Int, Position]
  val normalDataMap: Map[Int, Normal]
  lazy val faces = xgl \ "F" map(new Face(_, positionDataMap, normalDataMap))
  lazy val facesCollection = seqAsJavaList(faces)
}

class Face(val xgl: Node, val positionDataMap: Map[Int, Position], val normalDataMap: Map[Int, Normal])
  extends PositionDataSource with NormalDataSource {

  private def vertex(i: Int) = new FaceVertex((xgl \ s"FV$i")(0), positionDataMap, normalDataMap)
  val vertex1 = vertex(1)
  val vertex2 = vertex(2)
  val vertex3 = vertex(3)

  lazy val allNormalsSet = vertex1.normalSet && vertex2.normalSet && vertex3.normalSet
}

class FaceVertex(val xgl: Node, val positionDataMap: Map[Int, Position], val normalDataMap: Map[Int, Normal])
  extends PositionParent with PositionDataSource with NormalParent with NormalDataSource{

  lazy val normalSet = normal != null
}