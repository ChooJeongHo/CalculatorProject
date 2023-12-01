package com.example.level3

class Calculator {
    fun addOperation(num1: Double, num2: Double, addOperation: AddOperation): Double {
        return addOperation.operate(num1, num2)
    }
    fun subtractOperation(num1: Double, num2: Double, subtractOperation: SubtractOperation): Double {
        return subtractOperation.operate(num1, num2)
    }
    fun multiplyOperation(num1: Double, num2: Double, multiplyOperation: MultiplyOperation): Double {
        return multiplyOperation.operate(num1, num2)
    }

    fun divideOperation(num1: Double, num2: Double, divideOperation: DivideOperation): Double {
        return divideOperation.operate(num1, num2)
    }

}

fun main() {
    val calculator = Calculator()

    var num1: Double?
    var operator: Char?
    var num2: Double?

    do {
        num1 = readLine()?.trim()?.toDoubleOrNull()
        operator = readLine()?.trim()?.singleOrNull()
        num2 = readLine()?.trim()?.toDoubleOrNull()

        if (num1 == null || operator == null || num2 == null) {
            println("잘못된 입력입니다. 입력을 다시 확인해주세요.")
            // 입력 다시 받기
            readLine()?.trim()?.toDoubleOrNull()
            readLine()?.trim()?.singleOrNull()
            readLine()?.trim()?.toDoubleOrNull()
        } else {
            when (operator) {
                '+' -> println("$num1 + $num2 = ${calculator.addOperation(num1, num2, AddOperation())}입니다.")
                '-' -> println("$num1 - $num2 = ${calculator.subtractOperation(num1, num2, SubtractOperation())}입니다.")
                '*' -> println("$num1 * $num2 = ${calculator.multiplyOperation(num1, num2, MultiplyOperation())}입니다.")
                '/' -> println("$num1 / $num2 = ${calculator.divideOperation(num1, num2, DivideOperation())}입니다.")
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