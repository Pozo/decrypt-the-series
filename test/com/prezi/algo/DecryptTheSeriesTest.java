package com.prezi.algo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DecryptTheSeriesTest {
    private ArrayList<Integer> numbers = new ArrayList<Integer>();
    @Before
    public void setUp() throws Exception {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testDecrypt() throws Exception {
        numbers.add(5);
        numbers.add(2);
        numbers.add(-2);
        numbers.add(6);
        numbers.add(-6);
        DecryptTheSeries dts = new DecryptTheSeries(numbers);

        assertEquals(3,dts.decrypt());
    }
}