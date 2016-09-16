/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author lguerrer17
 */
public class Hora {

    private int hora;
    private int minutos;
    private int segundos;

    public Hora() {
        this.hora = 00;
        this.minutos = 00;
        this.segundos = 00;
    }

    public Hora(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public String validarhora() {
        String aux;
        if ((this.getHora() <= 23) && (this.getMinutos() <= 59) && (this.getSegundos() <= 59)) {
            aux = "La hora es correcta";
        } else {
            aux = "La hora es incorrecta";
        }
        return aux;
    }

    public String mostrarhora() {
        String a;
        a = "La hora es: " + this.getHora() + " : " + this.getMinutos() + " : " + this.getSegundos();
        return a;
    }

    public String horasiuales(Hora h2) {
        String b;
        if (this.getHora() == h2.getHora() && this.getMinutos() == h2.getMinutos() && this.getSegundos() == h2.getSegundos()) {
            b = "Las horas coinciden";
        } else {
            b = "Las horas no coinciden";
        }
        return b;
    }

    public String compararhoras(Hora h2) {
        String res = null;
        if (this.getHora() > h2.getHora()) {
            res = "La primera hora es mayor que la segunda";
        } else if (this.getHora() == h2.hora && this.getMinutos() > h2.getMinutos()) {
            res = "La Primera hora es mayor que la segunda";
        } else if (this.getHora() == h2.hora && this.getMinutos() == h2.minutos && this.getSegundos() > h2.getSegundos()) {
            res = "La primera hora es mayor que la segunda";
        } else if (this.getHora() < h2.getHora()) {
            res = "La primera hora es menor que la segunda";
        } else if (this.getHora() == h2.hora && this.getMinutos() < h2.getMinutos()) {
            res = "La primera hora es menor que la segunda";
        } else if (this.getHora() == h2.hora && this.getMinutos() == h2.hora && this.getSegundos() < h2.getSegundos()) {
            res = "La primera hora es menor que la segunda";
        }
        return res;

    }

}
