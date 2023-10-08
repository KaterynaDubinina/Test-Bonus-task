package org.example.app.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    private BonusService service;

    @BeforeEach
    void setUp() {
        service = new BonusService();
    }

    @Test
    void test_Bonus_Service_With_Expected_Result() {
        assertEquals(2.2, service.calcBonus(22));
    }

    @Test
    void test_Bonus_Service_With_Unexpected_Result() {
        assertNotEquals(7.7, service.calcBonus(22));
    }

    @Test
    @DisplayName("Test bonus service with incorrect sales input")
    void test_Bonus_Service_With_Incorrect_Sales_Value() {
        assertEquals("Incorrect value!", service.getRes(-22));

    }

    @AfterEach
    void tearDown() {
        service = null;
    }
}