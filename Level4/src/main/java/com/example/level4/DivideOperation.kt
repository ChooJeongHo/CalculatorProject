package com.example.level4

class DivideOperation : AbstractOperation(){
    override fun operate(num1: Double, num2: Double): Double {
        if (num2 != 0.0) {
            return num1 / num2
        } else {
            throw ArithmeticException("0으로 나눌 수 없습니다.")
        }
    }
}