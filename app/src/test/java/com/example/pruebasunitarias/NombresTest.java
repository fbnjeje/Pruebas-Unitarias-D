package com.example.pruebasunitarias;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NombresTest {


    private MainActivity.Nombres mNombres;

    @Before
    public void setUp(){
        mNombres = new MainActivity.Nombres();
    };

    @Test
    public void operationNotNull(){
        assertNotNull(mNombres);
    }

    @Test
    public void mark() {
        assertEquals("Mark Zuckerberg",mNombres.Jim("Mark","Zuckerberg"));
    }

    @Test
    public void elon() {
        assertEquals("Elon Musk",mNombres.Jim("Elon","Musk"));
    }

    @Test
    public void jim() {
        assertEquals("Jim Carrey",mNombres.Jim("Jim","Carrey"));
    }
}