package com.xgl.parser.elem

import scala.xml.Node

trait PositionDataSource {
  val positionDataMap: Map[Int, Position]
  def recoverPositionDef(id:Int) = positionDataMap(id)
}

trait PositionDataSourceAndCollector extends XGLParserNode with PositionDataSource {
  lazy val parsedPositionDefs = (xgl \ "P").filterNot(_ \ "@ID" isEmpty).map(node => ((node \ "@ID").text.toInt -> new Position(node))) toMap
}

trait PositionParent extends XGLParserNode with PositionDataSource {
  lazy val position: Option[Position] = {
    val ref = xgl \ "PREF"
    if (!ref.isEmpty) Some(recoverPositionDef(ref.text.trim().toInt))
    else (xgl \ "P").find(_.attribute("ID").isEmpty) match {
      case None => None
      case Some(meshNode) => Some(new Position(meshNode))
    }
  }
}

class Position(val xgl: Node) extends XGLVactorParserNode {
    
}