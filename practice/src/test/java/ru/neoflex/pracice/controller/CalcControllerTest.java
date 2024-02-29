package ru.neoflex.pracice.controller;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalcControllerTest {
    @Test
    public void testAdd() {
        CalcController calcController = new CalcController();
        int result = calcController.Sum (5,7);
        assertEquals  (12, result);
    }

    @Test
    public void testDiff (){
        CalcController calcController = new CalcController();
        int result = calcController.Diff(7,5);
        assertEquals (2, result);
    }
}
