package com.ravi.cal.Calculator;

import com.ravi.cal.RaviCalculator.Calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
	
	Calculator cal = new Calculator(3, 2);
	
    @Test
    public void twoAndThreeIsFive() throws Exception {
    	assertEquals(cal.addFucn(3, 2),5);
    }

    @Test
    public void threeMinusTwoIsOne() throws Exception {
        assertEquals(cal.subFucn(3, 2),1);
    }
    
    @Test
    public void threeXThreeIsNine() throws Exception {
        assertEquals(cal.mulFucn(3, 2), 6);
    }
   
}
