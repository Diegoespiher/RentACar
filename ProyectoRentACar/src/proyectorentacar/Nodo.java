/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectorentacar;

/**
 *
 * @author EAAV
 */
public class Nodo {
    private vehiculo dato;
    private Nodo next;
    private Nodo back;
    
    @Override
    public String toString(){
        return "Nodo{"+"dato="+dato+'}';
    }
    
    public Nodo(vehiculo dato){
        this.dato=dato;
    }

    public vehiculo getDato() {
        return dato;
    }

    public void setDato(vehiculo dato) {
        this.dato = dato;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Nodo getBack() {
        return back;
    }

    public void setBack(Nodo back) {
        this.back = back;
    }
}
