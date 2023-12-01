package com.example.level2

class Calculator {

    fun add(num1: Double, num2: Double): Double {
        return num1 + num2
    }

    fun subtract(num1: Double, num2: Double): Double {
        return num1 - num2
    }

    fun multiply(num1: Double, num2: Double): Double {
        return num1 * num2
    }

    fun divide(num1: Double, num2: Double): Double {
        if (num2 != 0.0) {
            return num1 / num2
        } else {
            throw ArithmeticException("0으로 나눌 수 없습니다.")
        }
    }

    fun remainder(num1: Double, num2: Double): Double {
        if (num2 != 0.0) {
            return num1 % num2
        } else {
            throw ArithmeticException("0으로 나눌 수 없습니다.")
        }
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
                '+' -> println(calculator.add(num1, num2))
                '-' -> println(calculator.subtract(num1, num2))
                '*' -> println(calculator.multiply(num1, num2))
                '/' -> println(calculator.divide(num1, num2))
                '%' -> println(calculator.remainder(num1, num2))
                else -> {
                    println("잘못된 연산자입니다.")
                    // 입력 다시 받기
                    readLine()?.trim()?.toDoubleOrNull()
                    readLine()?.trim()?.singleOrNull()
                    readLine()?.trim()?.toDoubleOrNull()
                }
            }
        }
        println("다른 연산을 하시겠습니까? (y/n)")
    } while (readLine()?.trim()?.toLowerCase() == "y")
}
