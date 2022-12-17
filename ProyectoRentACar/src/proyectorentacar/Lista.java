/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectorentacar;

import javax.swing.JOptionPane;

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
public void modifica (vehiculo p) {
        if (cabeza != null) {
            Nodo aux = cabeza;
            
            while (aux != null && aux.getDato().getPlaca() != p.getPlaca()) {
                aux = aux. getNext ();
            }
            
            if (aux != null && aux. getDato () .getPlaca () == p.getPlaca ()){
                aux.getDato().setMarca(p.getMarca()); 
                aux.getDato().setModelo(p.getMarca());
                aux.getDato().setAnio(p.getAnio()) ;
                aux.getDato().setColor(p.getColor()) ;
                aux.getDato().setCilindrada(p.getCilindrada()) ;
                aux.getDato().setCombustible(p.getCombustible()) ;
                aux.getDato().setPasajeros(p.getPasajeros()) ;
                aux.getDato().setPrecio(p.getPrecio()) ;
                aux.getDato().setExtras(p.getExtras()) ;
                aux.getDato().setEstado(p.getEstado()) ;
            }
        }
    } 
    
    public void elimina (int placa) {
        
        if (cabeza != null) { 
            if (cabeza.getDato().getPlaca() == placa) 
            {
                cabeza = cabeza.getNext();
            } 
            else {
                Nodo aux = cabeza; 
                
                while (aux. getNext () != null &&
                    aux.getNext () .getDato () .getPlaca() != placa) {
                    aux = aux.getNext () ;
                }
                
               
                if (aux.getNext () != null &&
                aux.getNext () .getDato () .getPlaca () == placa) {
                    aux. setNext (aux.getNext () .getNext ());
                }
            }
        }
    }
    public void consultar (Lista lista){
        while(true){
            int option =Integer.parseInt(JOptionPane.showInputDialog("**MENU DE "
                + "CONSULTA**\n 1. Consultar lista completa \n 2. "
                + "Consultar por número de placa \n 3. "+ "Salir "
                + "\n ->Ingrese la "
                + "opción que desea: "));
            switch(option){
                case 1:
                    System.out.println("-----------------lista de vehiculos-----------------");
                    System.out.println(lista);
                    System.out.println("----------------------------------------------------");
                    break;
                case 2:
                    int placa = Integer.parseInt(JOptionPane.showInputDialog("Digite el "
                            + "numero de placa que desea consultar: "));
                    if (cabeza != null) { //Si hay algo en la lista buscarlo
                        Nodo aux = cabeza;
                        while (aux.getNext() != null
                                && aux.getNext().getDato().getPlaca() != placa) {
                            aux = aux.getNext();
                        }
                        if (aux.getNext() != null
                                && aux.getNext().getDato().getPlaca() == placa) {
                            System.out.println(aux.getNext()); //cambio las referencias
                        }
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }
        
    }
    
    public vehiculo existe(int id) {
        vehiculo esta = null;
        int j=0;
        // Busca en lista, y retorna true si una persona tiene el id
        // en la lista
        if (cabeza != null) {
            // Si hay algo en la lista buscaré
            Nodo aux = cabeza;
            // utilizo aux como indice

            // Mientras no se acabe la lista y el elemento
            // de la lista sea menor que el buscado
            while (aux != null && aux.getDato().getPlaca() > id) {
                aux = aux.getNext();// avanzo en la lista
                j++;
            }

            // verdadero si lo encontró
            if (aux != null && aux.getDato().getPlaca() == id){
                esta = aux.getDato();
            }
        }

        return esta;
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
