package com.xgl.parser

import scala.xml.XML
import com.xgl.parser.elem.World

class XGLParser(val src : String) {
  lazy val world = new World(XML.loadString(src))
  
  def parse(): World = world
}