package com.example.ejsjava;

public class Login {
    private Long fecha;
    private String nombreUsuario;

    public Login(Long fecha, String nombreUsuario) {
        this.fecha = fecha;
        this.nombreUsuario = nombreUsuario;
    }

    public Long getFecha() {
        return fecha;
    }

    public void setFecha(Long fecha) {
        this.fecha = fecha;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    @Override
    public String toString() {
        return "Login{" +
                "fecha=" + fecha +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                '}';
    }

    public boolean conectadoAntesDe(Login otro){
        if(this.getFecha()<otro.getFecha()){
            return true;
        }
        else{
            return false;
        }
    }
}
