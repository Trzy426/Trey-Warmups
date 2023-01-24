package com.galvanize;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClosetTest {
        private Closet closet;

        @BeforeEach
        public void setUp() {
            closet = new Closet();

        }
        @Test
    public void checkCloset(){
            int actual = closet.getInventory();
            int expected = 0;
            assertEquals(expected,actual);
        }
        @Test
    public void addToCloset(){
            closet.addClothing(1);
            int actual = closet.getInventory();
            int expected = 1;
            assertEquals(expected,actual);
        }
        @Test
    public void removeFromCloset(){
            closet.addClothing(3);
        closet.removeClothing(1);
        int actual = closet.getInventory();
        int expected = 2;
        assertEquals(expected,actual);
    }
}
