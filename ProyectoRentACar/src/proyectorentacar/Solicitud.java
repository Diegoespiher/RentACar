/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectorentacar;

/**
 *
 * @author EAAV
 */
public class Solicitud {
<<<<<<< Updated upstream
    //private vehiculo dato;
=======

    
>>>>>>> Stashed changes
    private cliente datoC;
    private int dias;
    private int anio;
    private int mes;
    private int dia;
    private String marca;
    private String modelo;
    private String extras;
    private int anioVehiculo;
    private String estado;
    private vehiculo dato;

    public Solicitud(cliente datoC, int dias, int anio, int mes, int dia, String marca, String modelo, String extras, int anioVehiculo) {
        this.datoC = datoC;
        this.dias = dias;
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
        this.marca = marca;
        this.modelo = modelo;
        this.extras = extras;
        this.anioVehiculo = anioVehiculo;
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

    public int getAnioVehiculo() {
        return anioVehiculo;
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

    public void setAnioVehiculo(int anioVehiculo) {
        this.anioVehiculo = anioVehiculo;
    }

    public String getEstado() {
        return estado;
    }

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
<<<<<<< Updated upstream
    
=======

    public void setDatoV(vehiculo datoV) {
        this.datoV = datoV;
    }

    public vehiculo getDatoV() {
        return datoV;
    }

    public void setDato(vehiculo dato) {
        this.dato = dato;
    }

    public vehiculo getDato() {
        return dato;
    }

>>>>>>> Stashed changes
}
