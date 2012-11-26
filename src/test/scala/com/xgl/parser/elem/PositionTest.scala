package com.xgl.parser.elem

import org.scalatest.{FunSpec, FunSuite}
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

/**
 * Created with IntelliJ IDEA.
 * User: yt
 * Date: 11/26/12
 * Time: 12:03 PM
 */
@RunWith(classOf[JUnitRunner])
class PositionTest extends FunSpec {

  describe("Position parsing") {
    it("<P>-1.0,-0.5,0.0</P>") {
      val position = new Position(<P>-1.0,-0.5,0.0</P>)
      assert(position.x === -1.0)
      assert(position.y === -0.5)
      assert(position.z ===  0.0)
    }

    it("""<P ID="0">-1.0,-0.5,0.0</P>""") {
      val position = new Position(<P ID="0">-1.0,-0.5,0.0</P>)
      assert(position.x === -1.0)
      assert(position.y === -0.5)
      assert(position.z ===  0.0)
    }
  }

}
