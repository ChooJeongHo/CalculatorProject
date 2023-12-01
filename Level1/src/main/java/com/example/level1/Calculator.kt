package com.example.level1

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
}

fun main() {
    val calculator = Calculator()

    val num1 = readLine()?.trim()?.toDoubleOrNull()
    val operator = readLine()?.trim()?.singleOrNull()
    val num2 = readLine()?.trim()?.toDoubleOrNull()

    if (num1 != null && operator != null && num2 != null) {
        when (operator) {
            '+' -> println(calculator.add(num1, num2))
            '-' -> println(calculator.subtract(num1, num2))
            '*' -> println(calculator.multiply(num1, num2))
            '/' -> println(calculator.divide(num1, num2))
            else -> {
                println("잘못된 연산자입니다.")
            }
        }
    } else {
        println("입력이 올바르지 않습니다.")
    }
}