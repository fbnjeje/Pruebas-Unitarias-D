package com.example.pruebasunitarias;

public class Precio {


    String res,res1,res2,res4 = null;


    public String valor1(int num1, int num2){


        if (num1>num2){
            String res = "El numero 1 es mayor que el 2do numero";
            return res;
        }else{
            String res  = "dato Incorrecto";
            return res;
        }

    };

    public String valor2(int num3,int num4) {
        if (num3 < num4) {
            String res4 = "el numero 3 es menor que num 4 ";
            return res4;
        } else {
            res4 = "dato Incorrecto";
            return res4;

        }
    }
    public String valor3 (int num5,int num6){
        if (num5 == num6){
            String res2 = "los numeros son iguales";
            return res2;

        }else{
            String res2  = "dato Incorrecto";
            return res2;
        }
    }
}
