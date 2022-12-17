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
    private NodoS cima;
    private int largo;

    public listaSolicitud() {
        this.cima = null;
        this.largo = 0;
    }
    
    public boolean Vacia(){ return cima == null;}
    
    public int tamanio(){ return this.largo;}
    
    public void push(Solicitud p){
        NodoS newNodoS = new NodoS();
        newNodoS.setDato(p);
        
        if (this.Vacia()){
            this.cima = newNodoS;
        }
        else if (p.getDatoC().getCategoria() == "Zafiro"){
            newNodoS.setNext(this.cima);
            this.cima = newNodoS;
        } else if (p.getDatoC().getCategoria()== "Oro"){
            
            newNodoS.setNext(this.cima);
            this.cima = newNodoS;
        }else if (p.getDatoC().getCategoria()== "Plata"){
            
        }
        this.largo++;
    }
    
    public void pop(){
        if (!Vacia()) {
            // Asigna como primer node al siguiente de la pila.
            this.cima = this.cima.getNext();
            // Decrementa el contador del tamaÃ±o de la pila
            this.largo--;
        }
    }
    
    public boolean search(String categoria) {
        // Crea una copia de la pila.
        NodoS aux = cima;
        // Bandera para verificar si exist el elemento a search.
        boolean exist = false;
        // Recorre la pila hasta llegar encontrar el node o llegar al final
        // de la pila.
        while (exist != true && aux != null) {
            // Compara si el value del node es igual que al de reference.
            if (categoria == aux.getDato().getDatoC().getCategoria()) {
                // Cambia el value de la bandera.
                exist = true;
            } else {
                // Avanza al siguiente node.
                aux = aux.getNext();
            }
        }
        // Retorna el value de la bandera.
        return exist;
    }
    
    public boolean search2() {
        // Crea una copia de la pila.
        NodoS aux = cima;
        // Bandera para verificar si exist el elemento a search.
        boolean exist2 = false;
        // Recorre la pila hasta llegar encontrar el node o llegar al final
        // de la pila.
        while (exist2 != true && aux != null) {
            // Compara si el value del node es igual que al de reference.
            if ("Registrado" == aux.getDato().getEstado()) {
                // Cambia el value de la bandera.
                exist2 = true;
            } else {
                // Avanza al siguiente node.
                aux = aux.getNext();
            }
        }
        // Retorna el value de la bandera.
        return exist2;
    }
    
        public void pushModificado(String categoria, Solicitud p){
        // Consulta si el value exist en la pila.
        if (search(categoria)) {
            // Crea una pila auxiliar para guardar los valuees que se 
            // vayan desapilando de la pila original.
            NodoS cimapPilaAux = null;
            // Recoore la pila hasta llegar al node que tenga el value
            // igual que el de reference.
            while(categoria != cima.getDato().getDatoC().getCategoria()){
                // Crea un node temporal para agregarlos a la pila auxiliar.
                NodoS temp = new NodoS();
                // Ingresa el value al node temporal.
                temp.setDato(cima.getDato());
                // Consulta si la pila auxiliar no a sido inicializada.
                if(cimapPilaAux == null){
                    // Inicializa la pila auxiliar.
                    cimapPilaAux = temp;
                }
                // Caso contrario si la pila auxiliar ya contiene elementos
                // los agrega al start.
                else{
                    temp.setNext(cimapPilaAux);
                    cimapPilaAux = temp;
                }
                // Elimina el node del tope de la pila hasta llegar al node
                // que se desea eliminar.
                push(p);
            }
            // Elimina el node que coincide con el de reference.
            push(p);
            // Regresa los valuees de la pila auxiliar a la pila original
            // mientras la pila auxiliar tenga elementos.
            while(cimapPilaAux != null){
                // Utiliza el metodo push para regresar los elementos a 
                // la pila original.
                push(cimapPilaAux.getDato());
                // Avansa al siguiente node de la pila auxiliar.
                cimapPilaAux = cimapPilaAux.getNext();
            }
            // Libera la memoria utilizada por la pila auxiliar.
            cimapPilaAux = null;
        }
        else{
            System.out.println("El nodo indicado no existe");
        }
    } 
        public void listar(){
        // Crea una copia de la pila.
        NodoS aux = cima;
        // Recorre la pila hasta el ultimo node.
        while(aux != null){
            System.out.println("|\t" + aux.getDato() + "\t|");
            System.out.println("-----------------");
            aux = aux.getNext();
        }
    }
}
