package com.theironyard;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lindseyringwald on 8/21/16.
 */
public class MainTest {
    @Test
    public void sleepIn() throws Exception {
        assertEquals(true, Main.sleepIn(true, true));
        assertEquals(true, Main.sleepIn(false, true));
        assertEquals(false, Main.sleepIn(true, false));
        assertEquals(true, Main.sleepIn(false, false));
    }

    @Test
    public void monkeyTrouble() throws Exception {
        assertEquals(true, Main.monkeyTrouble(true, true));
        assertEquals(true, Main.monkeyTrouble(false, false));
        assertEquals(false, Main.monkeyTrouble(true, false));
        assertEquals(false, Main.monkeyTrouble(false, true));
    }

    @Test
    public void sumDouble() throws Exception {
        assertEquals(12, Main.sumDouble(5, 7));
        assertEquals(28, Main.sumDouble(7, 7));
    }

    @Test
    public void makes10() throws Exception {
        assertEquals(true, Main.makes10(10, 2));
        assertEquals(true, Main.makes10(2, 10));
        assertEquals(true, Main.makes10(4, 6));
        assertEquals(false, Main.makes10(6, 2));
        assertEquals(false, Main.makes10(12, 2));
    }

    @Test
    public void posNeg() throws Exception {
        assertEquals(true, Main.posNeg(-2, -3, true));
        assertEquals(false, Main.posNeg(-2, 2, true));
        assertEquals(false, Main.posNeg(2, 2, true));
        assertEquals(true, Main.posNeg(-2, 2, false));
        assertEquals(true, Main.posNeg(2, -2, false));
        assertEquals(false, Main.posNeg(2, 2, false));
        assertEquals(false, Main.posNeg(-2, -2, false));
    }

    @Test
    public void notString() throws Exception {
        assertEquals("not a thing", Main.notString("not a thing"));
        assertEquals("not a", Main.notString("a"));
    }

    @Test
    public void missingChar() throws Exception {
        assertEquals("Lidsey", Main.missingChar("Lindsey", 2));
    }

    @Test
    public void backAround() throws Exception {
        assertEquals("yLindseyy", Main.backAround("Lindsey"));

    }

    @Test
    public void or35() throws Exception {
        assertEquals(true, Main.or35(9));
        assertEquals(true, Main.or35(10));
        assertEquals(false, Main.or35(11));
    }

    @Test
    public void front22() throws Exception {
        assertEquals("ababcab", Main.front22("abc"));
        assertEquals("aaa", Main.front22("a"));
    }

    @Test
    public void startHi() throws Exception {
        assertEquals(false, Main.startHi("a"));
        assertEquals(true, Main.startHi("hilda"));
        assertEquals(false, Main.startHi("Sue"));
    }

    @Test
    public void icyHot() throws Exception {
        assertEquals(true, Main.icyHot(-10, 110));
        assertEquals(true, Main.icyHot(110, -10));
        assertEquals(false, Main.icyHot(110, 110));
        assertEquals(false, Main.icyHot(-100, -110));

    }

    @Test
    public void in1020() throws Exception {
        assertEquals(true, Main.in1020(15, 0));
        assertEquals(true, Main.in1020(0, 15));
        assertEquals(false, Main.in1020(0, 0));
    }

}