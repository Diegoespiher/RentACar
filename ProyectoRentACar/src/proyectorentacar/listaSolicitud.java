/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectorentacar;

import javax.swing.JOptionPane;

/**
 *
 * @author frank
 */
public class listaSolicitud {
    private NodoS cabeza;
    private NodoS ultimo;
    
    public void inserta(Solicitud p){
        if(cabeza==null){
            cabeza = new NodoS(p);
            ultimo = cabeza;
        }else if(p.getAnio()>cabeza.getDato().getAnio()){
            NodoS aux = new NodoS(p);
            aux.setNext(cabeza);
            cabeza=aux;
        }else if(ultimo.getDato().getAnio() >= p.getAnio()){
            ultimo.setNext(new NodoS(p));
            ultimo = ultimo.getNext();
        }else{
           NodoS aux = cabeza;
           while (aux.getNext().getDato().getAnio() > p.getAnio()){
               aux=aux.getNext();
           }
           NodoS temp = new NodoS(p);
           temp.setNext(aux.getNext());
           temp.setBack(aux);
           aux.setNext(temp);
           temp.getNext().setBack(temp); //nuevo
        }
        ultimo.setNext(cabeza);
        cabeza.setBack(ultimo); 
    }
    public Solicitud existe(int id) {
        cliente esta2 = null;
        if (cabeza != null) {
            NodoS aux = cabeza;

            while (aux != null && aux.getDato().getId() < id) {
                aux = aux.getNext();
            }
            if (aux != null && aux.getDato().getId() == id) {
                esta2 = aux.getDato();
            }
        }
        return esta2;

    
    @Override
    public String toString(){
        NodoS aux = cabeza;
        String s="Lista: ";
        if (aux != null){
            s+=aux+", ";
            aux=aux.getNext();
            while(aux != cabeza){
                s+=aux+", ";
                aux=aux.getNext();
            }
        } else{
            s+="vacia";
        }
        return s;
    }
}
