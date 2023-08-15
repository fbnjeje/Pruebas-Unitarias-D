package com.example.pruebasunitarias;
public class operacin {
    public String suma(String numero1,String numero2){
        int resultado = Integer.parseInt(numero1) + Integer.parseInt(numero2);
        return  String.valueOf(resultado);
    };
    public String rests(String numero1, String numero2){
        int resultado = Integer.parseInt(numero1) - Integer.parseInt(numero2);
        String res = Integer.toString(resultado);
        return  res ;
    };

    public String multiplication(String numero1, String numero2){
        int resultado = Integer.valueOf(numero1) * Integer.valueOf(numero2);
        return  String.valueOf(resultado);
    };


}
