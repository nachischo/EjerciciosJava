package com.example.ejsjava;

import java.util.HashSet;
import java.util.Set;

public class Unidades {
    static int NUMEROS[] = {7, 77, 21, 28, 48, 42, 49, 56, 62, 70};

    public static void main(String[] args){
        Set<Integer> unidades = new HashSet<Integer>();

        for(int i=0;i<NUMEROS.length;i++){
                unidades.add(NUMEROS[i] % 10);
        }


        System.out.println(unidades.toString());

    }
}
