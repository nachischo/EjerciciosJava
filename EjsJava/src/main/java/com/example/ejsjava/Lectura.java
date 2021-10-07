package com.example.ejsjava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lectura {

    private long fecha = 00000000000000;
    private String habitacion = "";
    private int temperatura = 0;

    public Lectura(long fecha, String habitacion, int temperatura) {
        this.fecha = fecha;
        this.habitacion = habitacion;
        this.temperatura = temperatura;
    }

    public long getFecha() {
        return fecha;
    }

    public void setFecha(long fecha) {
        this.fecha = fecha;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "Lectura{" +
                "fecha=" + fecha +
                ", habitacion='" + habitacion + '\'' +
                ", temperatura=" + temperatura +
                '}';
    }

    static long FECHA[]={1288122023000L, 1288122023000L, 1288122223000L, 1288122223000L, 1288122223000L, 1288122623000L, 1288122623000L, 1288122623000L };
    static String HABITACION[] = {"cocina", "baño", "cocina", "baño", "comedor", "cocina", "baño", "comedor"};
    static int TEMPERATURA[] = {18, 19, 17, 19, 17, 19, 22, 22};

    public static double media(List lect, String hab){
        List<Integer> posiciones= new ArrayList<>();
        double media = 0.0;

        if(hab.equals("cocina")){
            for(int i=0;i< HABITACION.length;i++){
                if(HABITACION[i].equals("cocina")){
                    posiciones.add(i);
                }
            }

            for(int i=0;i< posiciones.size();i++){
                media += TEMPERATURA[posiciones.get(i)];
            }
            return media/ posiciones.size();
        }
        else if(hab.equals("baño")){
            for(int i=0;i< HABITACION.length;i++){
                if(HABITACION[i].equals("baño")){
                    posiciones.add(i);
                }
            }

            for(int i=0;i< posiciones.size();i++){
                media += TEMPERATURA[posiciones.get(i)];
            }
            return media/ posiciones.size();
        }
        else if(hab.equals("comedor")){
            for(int i=0;i< HABITACION.length;i++){
                if(HABITACION[i].equals("comedor")){
                    posiciones.add(i);
                }
            }

            for(int i=0;i< posiciones.size();i++){
                media += TEMPERATURA[posiciones.get(i)];
            }
            return media/ posiciones.size();
        }
        else{
            return 0.0;
        }
    }

    public static void main(String[] args){
        List<Lectura> lecturas= new ArrayList<>();
        for(int i=0;i< FECHA.length; i++){
            lecturas.add(new Lectura(FECHA[i], HABITACION[i], TEMPERATURA[i]));
        }

        Set<String> habitaciones = new HashSet<>();
        for(int i=0;i< HABITACION.length; i++){
            habitaciones.add(HABITACION[i]);
        }



        System.out.println(habitaciones);
        System.out.println(lecturas.toString());
        System.out.println(media(lecturas, "cocina"));
        System.out.println(media(lecturas, "baño"));
        System.out.println(media(lecturas, "comedor"));
    }

}
