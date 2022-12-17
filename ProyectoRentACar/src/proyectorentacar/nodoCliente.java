/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectorentacar;

/**
 *
 * @author Luis Diego
 */
public class nodoCliente {

    private cliente dato;
    private nodoCliente next;

    public nodoCliente(cliente dato) {
        this.dato = dato;
    }

    public void setDato(cliente dato) {
        this.dato = dato;
    }

    public void setNext(nodoCliente next) {
        this.next = next;
    }

    public cliente getDato() {
        return dato;
    }

    public nodoCliente getNext() {
        return next;
    }

    @Override
    public String toString() {
        return dato + " ";
    }

}
