package com.jeonhoeun.domain.testsample

import io.kotest.core.spec.Spec
import io.kotest.core.spec.style.FunSpec
import io.kotest.core.test.TestCase
import io.kotest.matchers.shouldBe

class BeforeSpecAndTestSample : FunSpec(){

    //called only one time for this spec
    override fun beforeSpec(spec: Spec) {
        super.beforeSpec(spec)
        println("beforeSpec")
    }

    //called every test
    override fun beforeTest(testCase: TestCase) {
        super.beforeTest(testCase)
        println("beforeTest")
    }

    init{
        test("first test"){
            val data = 1+1
            data shouldBe 2
        }

        test("second test"){
            val data = 2+2
            data shouldBe 4
        }
    }
}