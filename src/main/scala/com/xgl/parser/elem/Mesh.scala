package com.xgl.parser.elem

import scala.xml.Node
import scala.collection.JavaConversions.seqAsJavaList

trait MeshDataSource {
  val meshDataMap: Map[Int, Mesh]
  def recoverMeshDef(id: Int) = meshDataMap(id)
}

trait MeshDataSourceAndCollector extends XGLParserNode with MeshDataSource {
  lazy val parsedMeshDefs = (xgl \ "MESH").filterNot(_ \ "@ID" isEmpty).map(node => ((node \ "@ID").text.toInt -> new Mesh(node))) toMap
}

trait MeshParentWithDefines extends XGLParserNode with MeshDataSource {
  lazy val mesh: Mesh = {
    val ref = xgl \ "MESHREF"
    if (!ref.isEmpty) recoverMeshDef(ref.text.trim().toInt)
    else (xgl \ "MESH").find(_.attribute("ID").isEmpty) match {
      case None => null
      case Some(meshNode) => new Mesh(meshNode)
    }
  }
}

class Mesh(val xgl: Node) extends FacesParent with PositionDataSourceAndCollector {
  override lazy val positionDataMap = parsedPositionDefs
  def facesCollection(): java.util.List[Face] = seqAsJavaList(faces)
}