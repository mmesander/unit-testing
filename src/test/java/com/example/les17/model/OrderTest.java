package com.example.les17.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    @DisplayName("Should be good amount")
    void calculateAmount() {
        // arrange
        Order order = new Order("Corsair Vengeance K75 Lux", 199.99, 4);
        double expectedResult = 199.99 * 4;

        // act
        double result = order.calculateAmount();

        // assert
        assertEquals(expectedResult, result);
    }
}