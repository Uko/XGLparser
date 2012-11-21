package com.xgl.parser.elem

import scala.xml.Node

trait NormalDataSource {
  val normalDataMap: Map[Int, Normal]
  def recoverNormalDef(id:Int) = normalDataMap(id)
}

trait NormalDataSourceAndCollector extends XGLParserNode with NormalDataSource {
  lazy val parsedNormalDefs = (xgl \ "N").filterNot(_ \ "@ID" isEmpty).map(node => ((node \ "@ID").text.toInt -> new Normal(node))) toMap
}

trait NormalParent extends XGLParserNode with NormalDataSource {
  lazy val normal: Normal = {
    val ref = xgl \ "NREF"
    if (!ref.isEmpty) recoverNormalDef(ref.text.trim().toInt)
    else (xgl \ "N").find(_.attribute("ID").isEmpty) match {
      case None => null
      case Some(meshNode) => new Normal(meshNode)
    }
  }
}

class Normal(val xgl: Node) extends XGLVactorParserNode {
    
}