package com.example.level4

class Calculator {
    fun calculate(num1: Double, num2: Double, operation: AbstractOperation): Double {
        return operation.operate(num1, num2)
    }
}

fun main() {
    val calculator = Calculator()

    var num1: Double?
    var basicOp: Char?
    var num2: Double?

    do {
        num1 = readLine()?.trim()?.toDoubleOrNull()
        basicOp = readLine()?.trim()?.singleOrNull()
        num2 = readLine()?.trim()?.toDoubleOrNull()

        if (num1 == null || basicOp == null || num2 == null) {
            println("잘못된 입력입니다. 입력을 다시 확인해주세요.")
            // 입력 다시 받기
            readLine()?.trim()?.toDoubleOrNull()
            readLine()?.trim()?.singleOrNull()
            readLine()?.trim()?.toDoubleOrNull()
        } else {
            when (basicOp) {
                '+' -> println("$num1 + $num2 = ${calculator.calculate(num1, num2, AddOperation())}입니다.")
                '-' -> println("$num1 - $num2 = ${calculator.calculate(num1, num2, SubtractOperation())}입니다.")
                '*' -> println("$num1 * $num2 = ${calculator.calculate(num1, num2, MultiplyOperation())}입니다.")
                '/' -> println("$num1 / $num2 = ${calculator.calculate(num1, num2, DivideOperation())}입니다.")
                else -> {
                    println("잘못된 연산자입니다.")
                    readLine()?.trim()?.toDoubleOrNull()
                    readLine()?.trim()?.singleOrNull()
                    readLine()?.trim()?.toDoubleOrNull()
                }
            }
        }
        println("다른 연산을 하시겠습니까? (y/n)")
    } while (readLine()?.trim()?.toLowerCase() == "y")
}