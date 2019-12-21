package com.huaxu.core.junit.lineCoverage;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("a")
public class LineTests {

    @Tag("a")
    @Test
    @DisplayName("line spring demo")
    public void testingCation(){
        System.out.println("tag a.....");
    }

    @Tag("b")
    @Test
    public void testingTagA(){
        System.out.println("tag a.....");
    }

    @Tag("b")
    @Test
    public void testingTag(){
        System.out.println("tag b....");
    }
}