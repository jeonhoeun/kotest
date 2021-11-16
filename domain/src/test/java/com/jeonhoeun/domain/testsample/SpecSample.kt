package com.jeonhoeun.domain.testsample

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.core.spec.style.FunSpec
import io.kotest.core.spec.style.ShouldSpec
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.startWith
import kotlin.math.roundToInt

class FunSpecSample : FunSpec({
    test("String length test") {
        "this".length shouldBe 4
        "".length shouldBe 0
    }
})

class StringSpecSample : StringSpec({
    "String length test"{
        "hello".length shouldBe 5
    }
})

class ShouldSpecSample : ShouldSpec({
    context("string.length"){
        should("return the length of string"){
            "test".length shouldBe 4
        }
    }

    context("sample"){
        val sample = "abc"
        sample should startWith("ab")
    }
})

class BehaviorSpecSample : BehaviorSpec({
    given("100점이 만점"){
        val totalMarks = 100
        `when`("score"){
            and("over 90"){
                val obtainedValue = 92
                then("grade is A"){
                    gradeCalculate(obtainedValue,totalMarks) shouldBe "A"
                }
            }
            and("80~89"){
                val obtainedValue = 88
                then("grade is B"){
                    gradeCalculate(obtainedValue,totalMarks) shouldBe "B"
                }
            }
        }
    }
})

fun gradeCalculate(obtainedValue:Int, total:Int) : String{
    val per = getPer(obtainedValue,total)
    return when{
        per >= 90 ->"A"
        per in 80..89->"B"
        per in 70..79->"C"
        per in 60..69->"D"
        else->"F"
    }

}

fun getPer(obtainedValue: Int,total: Int) : Int{
    return( obtainedValue/total.toFloat()*100).roundToInt()
}