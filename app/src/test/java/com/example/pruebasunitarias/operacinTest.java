package com.example.pruebasunitarias;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class operacinTest {

    private operacin mOperacin;

    @Before
    public void setUp(){
        mOperacin = new operacin();
    };

    @Test
    public void operationNotNull(){
    assertNotNull(mOperacin);
    }

    @Test
    public void suma() {
        assertEquals("7",mOperacin.suma("3","4"));
    }

    @Test
    public void resta() {
        assertEquals("-1",mOperacin.rests("2","3"));
    }

    @Test
    public void multiplicar() {
        assertEquals("6",mOperacin.multiplication("2","3"));
    }

}