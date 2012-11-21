package com.xgl.parser.elem

import scala.xml.Node
import collection.JavaConversions.seqAsJavaList

trait XObjectDataSource {
  val objectDataMap: Map[Int, XObject]
  def recoverXObjectDef(id: Int) = objectDataMap(id)
}

trait XObjectDataSourceAndCollector extends XGLParserNode with XObjectDataSource {
  val meshDataMap:  Map[Int, Mesh]
  lazy val parsedXObjectDefs = (xgl \ "OBJECT").filterNot(_ \ "@ID" isEmpty).map(node => ((node \ "@ID").text.toInt -> new XObject(node, meshDataMap, objectDataMap))) toMap
}

trait XObjectsParentWithDefines extends XGLParserNode with XObjectDataSource {
  val meshDataMap:  Map[Int, Mesh]
  lazy val objects: Seq[XObject] = (xgl \ "OBJECTREF" map (node => recoverXObjectDef(node.text.trim().toInt))) ++ ((xgl \ "OBJECT").filter(_ \ "@ID" isEmpty) map (new XObject(_, meshDataMap, objectDataMap)))
  lazy val objectsCollection = seqAsJavaList(objects)
}

class XObject(val xgl: Node, val parentMeshDataMap: Map[Int, Mesh], val parentXObjectDataMap: Map[Int, XObject])
  extends MeshParentWithDefines with MeshDataSourceAndCollector with XObjectsParentWithDefines with XObjectDataSourceAndCollector {

  override lazy val meshDataMap = parsedMeshDefs ++ parentMeshDataMap
  override lazy val objectDataMap = parsedXObjectDefs ++ parentXObjectDataMap
}