package com.xgl.parser.elem

import xml.{MalformedAttributeException, Node}

trait PositionDataSource {
  val positionDataMap: Map[Int, Position]
  def recoverPositionDef(id:Int) = positionDataMap(id)
}

trait PositionDataSourceAndCollector extends XGLParserNode with PositionDataSource {
  lazy val parsedPositionDefs = (xgl \ "P").filterNot(_ \ "@ID" isEmpty).map(node => ((node \ "@ID").text.toInt -> new Position(node))) toMap
}

trait PositionParent extends XGLParserNode with PositionDataSource {
  lazy val position: Position = {
    val ref = xgl \ "PREF"
    if (!ref.isEmpty) recoverPositionDef(ref.text.trim().toInt)
    else (xgl \ "P").find(_.attribute("ID").isEmpty) match {
      case None => throw new MalformedAttributeException("Missing position deffinition")
      case Some(meshNode) => new Position(meshNode)
    }
  }
}

class Position(val xgl: Node) extends XGLVactorParserNode {}