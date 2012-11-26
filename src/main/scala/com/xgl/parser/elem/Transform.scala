package com.xgl.parser.elem

import xml.{MalformedAttributeException, Node}


/**
 * Created with IntelliJ IDEA.
 * User: yt
 * Date: 11/23/12
 * Time: 2:41 PM
 */

trait TransformParent extends XGLParserNode {
  lazy val transform: Option[Transform] = xgl \ "TRANSFORM" match {
    case Seq() => None
    case Seq(transformNode) => Some(new Transform(transformNode))
  }

}

class Transform(val xgl: Node)  {
  lazy val forward: Forward = xgl \ "FORWARD" match {
    case Seq() => throw new MalformedAttributeException("Missing 'FORWARD' deffinition in 'TRANSFORM'")
    case Seq(forwardNode) => new Forward(forwardNode)
  }
  lazy val up: Up = xgl \ "UP" match {
    case Seq() => throw new MalformedAttributeException("Missing 'UP' deffinition in 'TRANSFORM'")
    case Seq(upNode) => new Up(upNode)
  }
  lazy val position: TransformPosition = xgl \ "POSITION" match {
    case Seq() => throw new MalformedAttributeException("Missing 'POSITION' deffinition in 'TRANSFORM'")
    case Seq(positionNode) => new TransformPosition(positionNode)
  }
}

class Forward(val xgl: Node) extends XGLVactorParserNode {

}

class Up(val xgl: Node) extends XGLVactorParserNode {

}

class TransformPosition(val xgl: Node) extends XGLVactorParserNode {

}