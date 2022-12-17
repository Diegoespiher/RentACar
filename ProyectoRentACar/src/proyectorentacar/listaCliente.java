/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectorentacar;

/**
 *
 * @author Luis Diego
 */
public class listaCliente {
    private nodoCliente cabeza;

   public void inserta(cliente p){
        if(cabeza==null){
            cabeza = new nodoCliente(p);
        }else if(p.getId()<cabeza.getDato().getId()){
            nodoCliente aux = new nodoCliente(p);
            aux.setNext(cabeza);
            cabeza=aux;
        }else if(cabeza.getNext()==null){
            cabeza.setNext(new nodoCliente(p));
        }else{
           nodoCliente aux = cabeza;
           while (aux.getNext() != null &&
                   aux.getNext().getDato().getId()
                   <p.getId()){
               aux=aux.getNext();
           }
           nodoCliente temp = new nodoCliente(p);
           temp.setNext(aux.getNext());
           aux.setNext(temp);
        } 
    }
    
    public cliente existe(int id) {
        cliente esta2 = null;
        if (cabeza != null) {
            nodoCliente aux = cabeza;

            while (aux != null && aux.getDato().getId() < id) {
                aux = aux.getNext();
            }
            if (aux != null && aux.getDato().getId() == id) {
                esta2 = aux.getDato();
            }
        }
        return esta2;
    }
    
    public boolean existe2(int id) {
        boolean esta3 = false;
        if (cabeza != null) {
            nodoCliente aux = cabeza;

            while (aux != null && aux.getDato().getId() < id) {
                aux = aux.getNext();
            }
            esta3 = (aux != null && aux.getDato().getId() == id);
        }
        return esta3;
    }

    
    public void modifica (cliente p) {
        if (cabeza != null) {
            nodoCliente aux = cabeza;
            
            while (aux != null && aux.getDato().getId() < p.getId()) {
                aux = aux. getNext ();
            }
            
            if (aux != null && aux. getDato () .getId () == p.getId ()){
                aux.getDato().setNombre(p.getNombre()) ; 
                aux.getDato().setNacimiento(p.getNacimiento()) ;
                aux.getDato().setCorreo(p.getCorreo()) ;
                aux.getDato().setCategoria(p.getCategoria()) ;
            }
        }
    } 
    
    public void elimina (int id) {
        
        if (cabeza != null) { 
            if (cabeza.getDato().getId() == id) 
            {
                cabeza = cabeza.getNext();
            } 
            else {
                nodoCliente aux = cabeza; 
                
                while (aux. getNext () != null &&
                    aux.getNext () .getDato () .getId() < id) {
                    aux = aux.getNext () ;
                }
                
               
                if (aux.getNext () != null &&
                aux.getNext () .getDato () .getId () == id) {
                    aux. setNext (aux.getNext () .getNext ());
                }
            }
        }
    }
    
    public cliente extrae (int id) {
        cliente p = null;
        
        if (cabeza != null) { 
            if (cabeza.getDato () .getId () == id) {
                cabeza = cabeza. getNext () ;
            } else {
                nodoCliente aux = cabeza;
                
                while (aux. getNext () !=
                        null && aux.getNext() .getDato(). getId()
                < id){
                    aux = aux. getNext () ;
                   
                }
               
                if (aux. getNext () != 
                        null && aux. getNext () .getDato () .getId() == id) {
                    p = aux. getNext () .getDato () ;
                    //aux. setNext (aux.getNext () .getNext () ) ;
                }
            }
        }
        return p;
    }
    
    @Override
    public String toString(){
        nodoCliente aux = cabeza;
        String s="Lista: \n";
        while(aux!=null){
            s+=aux+"\n";
            aux=aux.getNext();
        }
        return s;
    }
    
}
