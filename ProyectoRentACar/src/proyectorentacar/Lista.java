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
public class Lista {
    private Nodo cabeza;
    private Nodo ultimo;
    
    public void inserta(vehiculo p){
        if(cabeza==null){
            cabeza = new Nodo(p);
            ultimo = cabeza;
        }else if(p.getAnio()>cabeza.getDato().getAnio()){
            Nodo aux = new Nodo(p);
            aux.setNext(cabeza);
            cabeza=aux;
        }else if(ultimo.getDato().getAnio() >= p.getAnio()){
            ultimo.setNext(new Nodo(p));
            ultimo = ultimo.getNext();
        }else{
           Nodo aux = cabeza;
           while (aux.getNext().getDato().getAnio() > p.getAnio()){
               aux=aux.getNext();
           }
           Nodo temp = new Nodo(p);
           temp.setNext(aux.getNext());
           temp.setBack(aux);
           aux.setNext(temp);
           temp.getNext().setBack(temp); //nuevo
        }
        ultimo.setNext(cabeza);
        cabeza.setBack(ultimo); 
    }    
    @Override
    public String toString(){
        Nodo aux = cabeza;
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
