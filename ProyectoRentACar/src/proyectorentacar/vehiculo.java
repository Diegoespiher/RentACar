/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectorentacar;

/**
 *
 * @author EAAV/////////////////////////////////////BORRAR//////////////////////////////////////////////////////////////
 */
public class vehiculo {
    private String placa;
    private String marca;
    private int anio;
    private String color;
    private String cilindrada;
    private String combustible;
    private int pasajeros;
    private int precio;
    private String extras;

    public vehiculo(String placa, String marca, int anio, String color, 
            String cilindrada, String combustible, int pasajeros, int precio, 
            String extras) {
        this.placa = placa;
        this.marca = marca;
        this.anio = anio;
        this.color = color;
        this.cilindrada = cilindrada;
        this.combustible = combustible;
        this.pasajeros = pasajeros;
        this.precio = precio;
        this.extras = extras;
    }
    public vehiculo(){}

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnio() {
        return anio;
    }

    public String getColor() {
        return color;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public String getCombustible() {
        return combustible;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public int getPrecio() {
        return precio;
    }

    public String getExtras() {
        return extras;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

    @Override
    public String toString() {
        return "vehiculo{" + "placa=" + placa + ", marca=" + marca + ", "
                + "anio=" + anio + ", color=" + color + ", "
                + "cilindrada=" + cilindrada + ", combustible=" + combustible 
                + ", pasajeros=" + pasajeros + ", precio=" + precio + ", "
                + "extras=" + extras + '}';
    }
    
}
