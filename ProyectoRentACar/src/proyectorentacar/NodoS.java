/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectorentacar;

/**
 *
 * @author frank
 */
public class NodoS {
    private Solicitud dato;
        private NodoS next;
 private NodoS back;
    public NodoS(Solicitud dato) {
        this.dato = dato;
    }

    public void setBack(NodoS back) {
        this.back = back;
    }

    public NodoS getBack() {
        return back;
    }

    public void setDato(Solicitud dato) {
        this.dato = dato;
    }

    public void setNext(NodoS next) {
        this.next = next;
    }

    public Solicitud getDato() {
        return dato;
    }

    public NodoS getNext() {
        return next;
    }


    @Override
    public String toString() {
        return  dato + " ";
    }
}
