package com.xgl.parser.elem

trait XGLVactorParserNode extends XGLParserNode {
    private lazy val points = xgl.text.split(",")
    lazy val x = points(0).trim().toFloat
    lazy val y = points(1).trim().toFloat
    lazy val z = points(2).trim().toFloat
    override def toString() = "(%f, %f, %f)".format(x, y, z)
}