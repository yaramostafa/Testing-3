package com.company;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    public static Main x;
    public static Alarm y;

    // Make sure class DigitalWatch extends AlarmModStub
    @Nested
    class BottomUp {
        @BeforeAll
        public static void init(){
            x = new Main();
            y = new Alarm();
        }

        @Test
        public void testam() {
            assertFalse(y.checkA());
            assertFalse(y.unsetA());
            assertTrue(y.setA());
            assertTrue(y.checkA());
            assertTrue(y.setA());
            assertFalse(y.setA());
            assertTrue(y.unsetA());
        }


        @Test
        public void testdw1(){
            assertTrue(x.input('t'));
        }

        @Test
        public void testdw2(){
            assertTrue(x.input('a'));
        }

        @Test
        public void testdw3(){
            assertTrue(x.input('s'));
        }

        @Test
        public void testdw4(){
            assertTrue(x.input('c'));
        }

        @Test
        public void testdw5(){
            assertTrue(x.input('s'));
        }

        @Test
        public void testdw6(){
            assertTrue(x.input('u'));
        }

        @Test
        public void testdw7(){
            assertTrue(x.input('t'));
        }

        @Test
        public void testdw8(){
            assertTrue(x.input('s'));
        }

        @Test
        public void testdw9(){
            assertTrue(x.input('s'));
        }

        @Test
        public void testdw10(){
            assertTrue(x.input('m'));
        }

        @Test
        public void testdw11(){
            assertTrue(x.input('D'));
        }

        @Test
        public void testdw12(){
            assertTrue(x.input('M'));
        }

        @Test
        public void testdw13(){
            assertTrue(x.input('Y'));
        }

        @Test
        public void testdw14(){
            assertTrue(x.input('t'));
        }
    }

    // Make sure class DigitalWatch extends AlarmModStub
    @Nested
    class TopDown{
        @BeforeAll
        public static void init(){
            x = new Main();
            y = new Alarm();
        }


        @Test
        public void testdw1(){
            assertTrue(x.input('t'));
        }

        @Test
        public void testdw2(){
            assertTrue(x.input('a'));
        }


        @Test
        public void testdw4(){
            assertTrue(x.input('s'));
        }

        @Test
        public void testdw5(){
            assertTrue(x.input('c'));
        }

        @Test
        public void testdw6(){
            assertTrue(x.input('t'));
        }

        @Test
        public void testdw7(){
            assertTrue(x.input('s'));
        }

        @Test
        public void testdw8(){
            assertTrue(x.input('s'));
        }

        @Test
        public void testdw9(){
            assertTrue(x.input('m'));
        }

        @Test
        public void testdw10(){
            assertTrue(x.input('D'));
        }

        @Test
        public void testdw11(){
            assertTrue(x.input('M'));
        }

        @Test
        public void testdw12(){
            assertTrue(x.input('Y'));
        }

        @Test
        public void testdw13(){
            assertTrue(x.input('t'));
        }

        @Test
        public void testam(){
            assertFalse(y.checkA());
            assertFalse(y.unsetA());
            assertTrue(y.setA());
            assertTrue(y.checkA());
            assertTrue(y.setA());
            assertFalse(y.setA());
            assertTrue(y.unsetA());
        }

    }}