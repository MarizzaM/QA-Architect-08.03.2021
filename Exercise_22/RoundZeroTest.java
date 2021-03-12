package com.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoundZeroTest {
//round_up
    @Test
    public void test_round_up_for_neg(){
        RoundZero roundZero = new RoundZero();

        assertEquals(roundZero.round_up(TestData.test_round_up_for_neg_x),
                TestData.test_result_exit_from_boundary_values);
    }
    @Test
    public void test_round_up_to_zero(){
        RoundZero roundZero = new RoundZero();

        assertEquals(roundZero.round_up(TestData.test_round_up_to_zero_x),
                TestData.test_result_0);
    }
    @Test
    public void test_round_up_to_1_min_value(){
        RoundZero roundZero = new RoundZero();

        assertEquals(roundZero.round_up(TestData.test_round_up_to_1_min_value_x),
                TestData.test_result_1);
    }
    @Test
    public void test_round_up_to_1_max_value(){
        RoundZero roundZero = new RoundZero();

        assertEquals(roundZero.round_up(TestData.test_round_up_to_1_max_value_x),
                TestData.test_result_1);
    }
    @Test
    public void test_round_up_for_bigger_1(){
        RoundZero roundZero = new RoundZero();

        assertEquals(roundZero.round_up(TestData.test_round_up_for_bigger_1_x),
                TestData.test_result_exit_from_boundary_values);
    }
//round_down
    @Test
    public void test_round_down_for_neg(){
        RoundZero roundZero = new RoundZero();

        assertEquals(roundZero.round_down(TestData.test_round_down_for_neg_x),
                TestData.test_result_exit_from_boundary_values);
    }
    @Test
    public void test_round_down_to_0_min_value(){
        RoundZero roundZero = new RoundZero();

        assertEquals(roundZero.round_down(TestData.test_round_down_to_0_min_value_x),
                TestData.test_result_0);
    }
    @Test
    public void test_round_down_to_0_max_value(){
        RoundZero roundZero = new RoundZero();

        assertEquals(roundZero.round_down(TestData.test_round_down_to_0_max_value_x),
                TestData.test_result_0);
    }
    @Test
    public void test_round_down_to_1(){
        RoundZero roundZero = new RoundZero();

        assertEquals(roundZero.round_down(TestData.test_round_down_to_1_x),
                TestData.test_result_1);
    }
    @Test
    public void test_round_down_for_bigger_1(){
        RoundZero roundZero = new RoundZero();

        assertEquals(roundZero.round_down(TestData.test_round_down_for_bigger_1_x),
                TestData.test_result_exit_from_boundary_values);
    }

// round
    @Test
    public void round_down_for_neg(){
        RoundZero roundZero = new RoundZero();

        assertEquals(roundZero.round(TestData.test_round_for_neg_x),
                TestData.test_result_exit_from_boundary_values);
    }
    @Test
    public void test_round_to_0_min_value(){
        RoundZero roundZero = new RoundZero();

        assertEquals(roundZero.round(TestData.test_round_to_0_min_value_x),
                TestData.test_result_0);
    }
    @Test
    public void test_round_to_0_max_value() {
        RoundZero roundZero = new RoundZero();

        assertEquals(roundZero.round(TestData.test_round_to_0_max_value_x),
                TestData.test_result_0);
    }
    @Test
    public void test_round_to_1_min_value(){
        RoundZero roundZero = new RoundZero();

        assertEquals(roundZero.round(TestData.test_round_to_1_min_value_x),
                TestData.test_result_1);
    }
    @Test
    public void test_round_to_1_max_value(){
        RoundZero roundZero = new RoundZero();

        assertEquals(roundZero.round(TestData.test_round_to_1_max_value_x),
                TestData.test_result_1);
    }
    @Test
    public void test_round_for_bigger_1(){
        RoundZero roundZero = new RoundZero();

        assertEquals(roundZero.round(TestData.test_round_for_bigger_1_x),
                TestData.test_result_exit_from_boundary_values);
    }
}
