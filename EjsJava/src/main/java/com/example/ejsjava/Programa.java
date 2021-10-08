package com.example.ejsjava;

import java.util.ArrayList;
import java.util.List;

public class Programa {
    private String tipo;
    private Long horaInicio;
    private Long horaFinal;

    public Programa(String tipo, Long horaInicio, Long horaFinal) {
        this.tipo = tipo;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Long getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Long horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Long getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(Long horaFinal) {
        this.horaFinal = horaFinal;
    }

    @Override
    public String toString() {
        return "Programa{" +
                "tipo='" + tipo + '\'' +
                ", horaInicio=" + horaInicio +
                ", horaFinal=" + horaFinal +
                '}';
    }

    static Long PROGRAMACION[]={6L, 10L, 12L, 15L, 17L, 20L, 22L, 24L };
    static String TIPO[] = {"NOTICIAS", "MAGAZINE", "MUSICA", "NOTICIAS", "MAGAZINE", "NOTICIAS", "MAGAZINE", "MUSICA"};


    public static void main(String[] args){

        List<Programa> horario = new ArrayList<>();
        int horaIni = 0;
        int horaFin = 1;
        for(int i=0; i<TIPO.length-1; i++){
                horario.add(new Programa (TIPO[i], PROGRAMACION[horaIni], PROGRAMACION[horaFin]));
                horaIni++;
                horaFin++;
        }
        horaFin = 0;
        horario.add(new Programa (TIPO[TIPO.length-1], PROGRAMACION[horaIni], PROGRAMACION[horaFin]));
        horaIni = 0;


        System.out.println(horario.toString());
    }
}
