package com.codeworks.kata;


import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Date;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AppTest {
    final Date start = new Date();

    @Test
    public void T001_Simple() {
        Assert.assertEquals("abba",  App.findBiggestPalindrome("abba"));
    }

    @Test
    public void T002_Simple() {
        Assert.assertEquals("aba",  App.findBiggestPalindrome("paba"));
    }

    @Test
    public void T003_Empty() {
        Assert.assertEquals("",  App.findBiggestPalindrome(""));
    }

    @Test
    public void T004_SingleCharacter() {
        Assert.assertEquals("t",  App.findBiggestPalindrome("t"));
    }

    @Test
    public void T005_Medium() {
        Assert.assertEquals("azertytreza",  App.findBiggestPalindrome("tdexpazertytrezaskhbiyb"));
    }

    @Test
    public void T006_Medium() {
        Assert.assertEquals("kayak",  App.findBiggestPalindrome("kayakstkayak"));
    }

    @Test
    public void T007_Medium() {
        Assert.assertEquals("a",  App.findBiggestPalindrome("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void T008_Long() {
        Assert.assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",  App.findBiggestPalindrome("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
    }

    @Test
    public void T009_Long() {
        Assert.assertEquals("a",  App.findBiggestPalindrome("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"));
    }
}


