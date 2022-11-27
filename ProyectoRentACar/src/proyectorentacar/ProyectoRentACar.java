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
        
    }
        
        
    }
