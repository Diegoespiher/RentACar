/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectorentacar;

/**
 *
 * @author frank
 */
public class Solicitud {
        private vehiculo dato;
    private cliente datoC;
    private int dias;
    private int anio;
    private int mes;
    private int dia;
    private String marca;
    private String modelo;
    private String extras;
    private String anioVehiculo;

    public Solicitud(vehiculo dato, cliente datoC, int dias, int anio, int mes,
            int dia, String marca, String modelo, String anioVehiculo) {
        this.dato = dato;
        this.datoC = datoC;
        this.dias = dias;
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
        this.marca = marca;
        this.modelo = modelo;
        this.anioVehiculo = anioVehiculo;
    }

    public vehiculo getDato() {
        return dato;
    }

    public cliente getDatoC() {
        return datoC;
    }

    public int getDias() {
        return dias;
    }

    public int getAnio() {
        return anio;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getAnioVehiculo() {
        return anioVehiculo;
    }

    public void setDato(vehiculo dato) {
        this.dato = dato;
    }

    public void setDatoC(cliente datoC) {
        this.datoC = datoC;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnioVehiculo(String anioVehiculo) {
        this.anioVehiculo = anioVehiculo;
    }
    
}
