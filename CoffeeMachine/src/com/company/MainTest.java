package com.company;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    public static Main x;
    public static Main y;
    @BeforeAll
    public static void init(){
        x = new Main();
        y = new Main();
    }
    // Make sure class CoffeeMachine extends CoffeeStorage
    @Nested
    class BottomUp{
        @Test
        public void testC(){
            assertFalse(y.useBeans());
            assertFalse(y.useWater());
            assertFalse(y.useMilk());
            assertFalse(y.useIce());
            y.addBeans(1);
            y.addWater(1);
            y.addMilk(1);
            y.addIce(1);
            assertTrue(y.useBeans());
            assertTrue(y.useWater());
            assertTrue(y.useMilk());
            assertTrue(y.useIce());
        }


        @Test
        public void testCM1(){
            assertFalse(x.input('c'));
        }

        @Test
        public void testCM2(){
            assertFalse(x.input('l'));
        }

        @Test
        public void testCM3(){assertFalse(x.input('m'));}

        @Test
        public void testCM4(){
            assertTrue(x.input('r'));
        }

        @Test
        public void testCM5(){
            assertTrue(x.input('s'));
        }

        @Test
        public void testCM6(){
            assertTrue(x.input('m'));
        }

        @Test
        public void testCM7(){
            assertTrue(x.input('w'));
        }

        @Test
        public void testCM8(){
            assertTrue(x.input('b'));
        }

        @Test
        public void testCM9(){
            assertTrue(x.input('p'));
        }
    }

}
