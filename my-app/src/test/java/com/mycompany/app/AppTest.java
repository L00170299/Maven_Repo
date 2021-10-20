package com.mycompany.app;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void shouldAnswerWithFalse()
    {
        assertFalse( false );
    }

    @Test
    public void testNumber10() {
        assertEquals(11, App.getNumber10());
    }

    @Test
    public void testHelloWorld() {
        assertEquals("Hello World!", App.getHelloWorld());
    }
}
