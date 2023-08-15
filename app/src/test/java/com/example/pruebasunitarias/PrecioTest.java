package com.example.pruebasunitarias;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PrecioTest {



    private Precio mPrecio;


    @Before
    public void setUp(){
        mPrecio = new Precio();
    };

    @Test
    public void operationNotNull(){
        assertNotNull(mPrecio);
    }


    @Test
    public void valor1() {
        assertEquals("El numero 1 es mayor que el 2do numero",mPrecio.valor1(4,2));
    };

    @Test
    public void valor2() {
        assertEquals("el numero 3 es menor que num 4 ",mPrecio.valor2(2,6));
    }

    @Test
    public void valor3() {
        assertEquals("los numeros son iguales",mPrecio.valor3(6,6));
    }
}