package com.huaxu.core.ci.junit.lineCoverage;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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

    @Test
    public void testConcurrentThread() {
        ExecutorService service = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 20; i++) {
            service.execute(()->{
                for (int k = 0; k < 5; k++) {
                    System.out.println(k);
                }
            });
        }
    }
}