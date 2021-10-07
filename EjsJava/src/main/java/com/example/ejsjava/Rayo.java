package com.example.ejsjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Rayo {

    private long tiempo;
    private String ciudad;
    private int intensidad;

    public Rayo(long tiempo, String ciudad, int intensidad) {
        this.tiempo = tiempo;
        this.ciudad = ciudad;
        this.intensidad = intensidad;
    }

    public long getTiempo() {
        return tiempo;
    }

    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(int intensidad) {
        this.intensidad = intensidad;
    }

    @Override
    public String toString() {
        return "Rayo{" +
                "tiempo=" + tiempo +
                ", ciudad='" + ciudad + '\'' +
                ", intensidad=" + intensidad +
                '}';
    }

    static long TIEMPO[] = {2L, 4L, 5L, 6L, 9L, 12L, 14L, 16L};
    static String CIUDAD[] = {"Gandia", "Oliva", "Ibi", "Gandia", "Ibi", "Oliva", "Ibi", "Ibi"};
    static int INTENSIDAD[] = {1, 2, 2, 1, 2, 3, 1, 2};


    public static void main(String[] args){

        //Lista con todos los elementos de tipo Rayo
        List<Rayo> caidas = new ArrayList<>();
        for(int i=0; i<TIEMPO.length; i++){
            caidas.add(new Rayo(TIEMPO[i], CIUDAD[i], INTENSIDAD[i]));
        }


        //Conjunto con las diferentes ciudades
        Set<String> ciudades= new HashSet<>();
        for(int i=0; i<CIUDAD.length; i++){
            ciudades.add(CIUDAD[i]);
        }

        //Periodo medio de caida de rayos por ciudad
        Map<String,Double> periodoMedioCaidaRayos = new HashMap<>();
        List<String> diferentesCiudades = new ArrayList<>();
        for (String t : ciudades) {
            diferentesCiudades.add(t);
        }

        for(int i=0;i< diferentesCiudades.size();i++) {
            periodoMedioCaidaRayos.put(diferentesCiudades.get(i), 0.0);
        }

        double mediaCiudad = 0.0;
        int cuantosRegistrosTiempo = 0;
        for(int i=0;i< diferentesCiudades.size();i++) {
            for (int j = 0; j < caidas.size(); j++) {
                if(caidas.get(j).getCiudad().equals(diferentesCiudades.get(i))) {
                    cuantosRegistrosTiempo = cuantosRegistrosTiempo + 1;
                    System.out.println(cuantosRegistrosTiempo + ". " + diferentesCiudades.get(i) + ": " + (double)caidas.get(j).getTiempo());
                    mediaCiudad = mediaCiudad += (double)caidas.get(j).getTiempo();

                }
            }
            mediaCiudad = mediaCiudad/cuantosRegistrosTiempo;
            periodoMedioCaidaRayos.put(diferentesCiudades.get(i), mediaCiudad);
            mediaCiudad = 0.0;
            cuantosRegistrosTiempo = 0;
        }


        System.out.println(caidas.toString());
        System.out.println(ciudades);
        System.out.println(periodoMedioCaidaRayos.toString());

    }
}



