/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectorentacar;

/**
 *
 * @author Luis Diego & Esteban
 */
public class ProyectoRentACar {

   
    public static void main(String[] args) {
        //Main
        System.out.println("--------------------------------------ESPI----------------------------------------------");
        listaCliente laLista = new listaCliente();
        laLista.inserta(new cliente(22, "Juan", "Juan", "Juan", "Juan"));
        laLista.inserta(new cliente(11, "Juan", "Juan", "Juan", "Juan"));
        laLista.inserta(new cliente(15, "Juan", "Juan", "Juan", "Juan"));
        laLista.inserta(new cliente(66, "Juan", "Juan", "Juan", "Juan"));
        laLista.inserta(new cliente(75, "Juan", "Juan", "Juan", "Juan"));
       

        // System.out.println(laLista.extrae(30).getNombre());
        // laLista.elimina(5);
        // System.out.println("Existe? "+laLista.existe(20));
        System.out.println(laLista);

        System.out.println("-------Modificada------");

        laLista.modifica(new cliente(15, "Didier", "uno", "uno", "uno"));
        // laLista.modifica(new Persona(15, 65));
        System.out.println(laLista);
        System.out.println("-------Elimina------");
        //laLista.elimina(5);
        //System.out.println(laLista);
        //laLista.extrae(5);
        System.out.println(laLista.extrae(75));
        System.out.println("--------------------------------------EAAV----------------------------------------------");
        Lista lista = new Lista();
        lista.inserta(new vehiculo("GHD-456", "Ferrari", 2000, "Rojo", 
            "6000cc", "Gasolina", 2, 500000, "extras"));
        lista.inserta(new vehiculo("GHD-456", "Ferrari", 2000, "Rojo", 
            "6000cc", "Gasolina", 2, 500000, "extras"));
        lista.inserta(new vehiculo("GHD-456", "Ferrari", 2000, "Rojo", 
            "6000cc", "Gasolina", 2, 500000, "extras"));
        lista.inserta(new vehiculo("GHD-555", "Ferrari", 2000, "Rojo", 
            "6000cc", "Gasolina", 2, 500000, "extras"));
        lista.inserta(new vehiculo("GHD-456", "Ferrari", 2000, "Rojo", 
            "6000cc", "Gasolina", 2, 500000, "extras"));
        System.out.println(lista);
        System.out.println("-------Modificada------");
        lista.modifica(new vehiculo("XXXXX", "XXXXXX", 111111, "XXXXX", 
            "XXXXXXXX", "XXXXXXXXX", 1, 111111111, "XXXXXX"));
        System.out.println("-------Elimina------");
        System.out.println("GHD-555");
        lista.elimina("GHD-555");
        System.out.println(lista);
        lista.consultar(lista);
        System.out.println("----------------------------------------------------------------------------------------");
    }
        
        
    }
