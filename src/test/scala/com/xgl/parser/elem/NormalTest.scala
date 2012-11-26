package com.xgl.parser.elem

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FunSpec, FunSuite}

/**
 * Created with IntelliJ IDEA.
 * User: yt
 * Date: 11/26/12
 * Time: 3:08 PM
 */
@RunWith(classOf[JUnitRunner])
class NormalTest extends FunSpec {

  describe("Normal parsing") {
    it("<N>-1.0,0.0,0.0</N>") {
      val position = new Position(<N>-1.0,0.0,0.0</N>)
      assert(position.x === -1.0)
      assert(position.y ===  0.0)
      assert(position.z ===  0.0)
    }

    it("""<N ID="0">-1.0,0.0,0.0</N>""") {
      val position = new Position(<N ID="0">-1.0,0.0,0.0</N>)
      assert(position.x === -1.0)
      assert(position.y ===  0.0)
      assert(position.z ===  0.0)
    }
  }
}
