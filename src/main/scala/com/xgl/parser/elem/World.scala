package com.xgl.parser.elem

import scala.xml.Elem
import scala.collection.JavaConversions.seqAsJavaList


class World(val xgl: Elem) extends MeshParentWithDefines with MeshDataSourceAndCollector with XObjectsParentWithDefines with XObjectDataSourceAndCollector {
  override lazy val meshDataMap = parsedMeshDefs
  override lazy val objectDataMap = parsedXObjectDefs
  def objectsCollection(): java.util.List[XObject] = seqAsJavaList(objects)
}