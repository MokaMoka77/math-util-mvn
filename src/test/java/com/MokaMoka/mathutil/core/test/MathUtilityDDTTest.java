/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.MokaMoka.mathutil.core.test;

import com.tuan.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author ACER
 */
public class MathUtilityDDTTest {

    public MathUtilityDDTTest() {
    }

    @ParameterizedTest
    @MethodSource("initData")
    public void verifyFactorialGivenRightArgumentReturnOk(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }

    //Ta cần chuẩn bị bọo dâta để nhồi vào cái hàm qua 2 tham số
    // đã chừa sẵn
    //kỹ thuật phân tách data kiểm thử ra khỏi câu lệnh cho nhanh
    //để data ở riêng mọt chỗ, từ từ fill vào hàm so sánh
    //kì thuật này gọi là DDT, Data Driven Testing
    //Data thường sẽ để ở mảng 2 chiều
    //1 cái là đầu vào n, 1 cái là đầu ra expected 
    //và có nhiều cặp như thế
    // kĩ thuật này còn gọi là tham số kiểm thử
    //đưa data vào qua tham số hàm
    //mảng 2 chiều này sẽ nhồi vào hàm dưới
    

    public static Object[][] initData() {
        Object[][] dataSet = {{0, 1},
                            {1, 1},
                            {3, 6},
                            {4,24},
                            {5, 120}};
        return dataSet;
    }
}
