package com.example.ejsjava;

import java.util.ArrayList;
import java.util.List;

public class ProgramaSesion {

    static long FECHA[]={1289001000000L , 1289002000000L , 1289004000000L , 1289006000000L , 1289007000000L, 1289008000000L , 128900900000L , 1289011000000L , 1289013000000L , 1289016000000L};
    static String USUARIO[] = {"carchimp", "tudela", "arcano", "totencar", "ramporo", "tudela", "arcano", "carchimp", "tudela", "totencar"};

    public static void main(String[] args) {

        //Llenar lista con inicios de sesión
        List<Login> sesiones = new ArrayList<>();
        for(int i=0; i<USUARIO.length; i++){
            sesiones.add(new Login(FECHA[i], USUARIO[i]));
        }

        System.out.println(sesiones.toString());
        System.out.println(sesiones.get(0).conectadoAntesDe(sesiones.get(1)));
    }
}
