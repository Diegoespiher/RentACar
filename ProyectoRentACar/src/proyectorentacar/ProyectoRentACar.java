/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectorentacar;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Diego & Esteban
 */
public class ProyectoRentACar {

   
    public static void main(String[] args) {
        //Main
        listaCliente laLista = new listaCliente();
        Lista lista1 = new Lista();
        
        
        
        while (true) {
            int option = Integer.parseInt(JOptionPane.showInputDialog("**MENU "
                    + "DEL "
                    + "Rent A Car**\n 1. Registrar vehiculo \n 2. "
                    + "Modificar/Eliminar vehículo \n "
                    + "3. Consultar lista de vehiculos registrados  \n 4.  "
                    + "Registrar cliente \n 5.  Modificar información del "
                    + "cliente "
                    + "\n 6. "
                    + "Consultar información de cliente \n 7. Eliminar "
                    + "información de cliente \n 8. Solicitar alquiler de "
                    + "vehiculo \n 9. Asignar vehículos a solicitudes de "
                    + "alquiler \n 10. Consultar solicitudes de alquileres "
                    + "registrados \n 11. Devolución de vehículo \n 12. "
                    + "Ánalisis de datos \n 13. Salir"
                    + "\n ->Ingrese la "
                    + "opción que desea: "));
            switch (option) {
                case 1:
                    String placa = JOptionPane.showInputDialog(
                            "Placa del Vehiculo: ");
                    String marca = JOptionPane.showInputDialog("Marca del "
                            + "Vehiculo: ");
                    String modelo = JOptionPane.showInputDialog("Modelo del "
                            + "Vehiculo: ");
                    int anio = Integer.parseInt(JOptionPane.showInputDialog("Año "
                            + "del Vehiculo: "));
                    String color = JOptionPane.showInputDialog("Color del "
                            + "Vehiculo: ");
                    String cilindrada = JOptionPane.showInputDialog("Cilindrada"
                            + " del Vehiculo: ");
                    String combustible = JOptionPane.showInputDialog(""
                            + "Combustibles del Vehiculo: ");
                    int capacidad = Integer.parseInt(JOptionPane.showInputDialog(
                            "Capacidad de pasajeros del Vehiculo: "));
                    int precio = Integer.parseInt(JOptionPane.showInputDialog(
                            "Precio del Vehiculo: "));
                    String extras = JOptionPane.showInputDialog(""
                            + "Extras del Vehiculo: ");
                    String asociado = JOptionPane.showInputDialog(""
                            + "Asociado del Vehiculo (Disponible, Alquilado,"
                            + " En reparación, Fuera de circulación): ");
                    lista1.inserta(new vehiculo(placa, marca, modelo, anio, color,
                            cilindrada, combustible, capacidad, precio,
                            extras, asociado));
                    break;
                case 2:
                    String placaM = JOptionPane.showInputDialog(
                            "Placa del Vehiculo: ");
                    String marcaM = JOptionPane.showInputDialog("Marca del "
                            + "Vehiculo: ");
                    String modeloM = JOptionPane.showInputDialog("Modelo del "
                            + "Vehiculo: ");
                    int anioM = Integer.parseInt(JOptionPane.showInputDialog("Año "
                            + "del Vehiculo: "));
                    String colorM = JOptionPane.showInputDialog("Color del "
                            + "Vehiculo: ");
                    String cilindradaM = JOptionPane.showInputDialog("Cilindrada"
                            + " del Vehiculo: ");
                    String combustibleM = JOptionPane.showInputDialog(""
                            + "Combustibles del Vehiculo: ");
                    int capacidadM = Integer.parseInt(JOptionPane.showInputDialog(
                            "Capacidad de pasajeros del Vehiculo: "));
                    int precioM = Integer.parseInt(JOptionPane.showInputDialog(
                            "Precio del Vehiculo: "));
                    String extrasM = JOptionPane.showInputDialog(""
                            + "Extras del Vehiculo: ");
                    String estadoM = JOptionPane.showInputDialog(""
                            + "Estado del Vehiculo (Disponible, Alquilado,"
                            + " En reparación, Fuera de circulación): ");
                    lista1.modifica(new vehiculo(placaM, marcaM, modeloM, anioM,
                            colorM,cilindradaM, combustibleM, capacidadM, 
                            precioM, extrasM, estadoM));
                    break;
                case 3:
                    String placaC = JOptionPane.showInputDialog(
                            "Placa del Vehiculo: ");
                    //consulta....incompleto el progama debe dar la opcion de 
                    //ver todos ls carros o ver uno en especifico
                   
                    break;
                case 4:
                    int cedula = Integer.parseInt(JOptionPane.showInputDialog(
                            "Cedula del Cliente: "));
                    String nombre = JOptionPane.showInputDialog("Nombre del "
                            + "Cliente: ");
                    String nacimiento = JOptionPane.showInputDialog("Fecha de "
                            + "nacimiento del Cliente: ");
                    String correo = JOptionPane.showInputDialog("Correo del "
                            + "Cliente: ");
                    String categoria = JOptionPane.showInputDialog("Categoria"
                            + " del Cliente (Bronce, Plata, Oro, Zafiro): ");
                    laLista.inserta(new cliente(cedula, nombre, nacimiento, 
                            correo, categoria));
                    break;
                case 5:
                    int cedulaM = Integer.parseInt(JOptionPane.showInputDialog(
                            "Cedula del Cliente: "));
                    String nombreM = JOptionPane.showInputDialog("Nombre del "
                            + "Cliente: ");
                    String nacimientoM = JOptionPane.showInputDialog("Fecha de "
                            + "nacimiento del Cliente: ");
                    String correoM = JOptionPane.showInputDialog("Correo del "
                            + "Cliente: ");
                    String categoriaM = JOptionPane.showInputDialog("Categoria"
                            + " del Cliente (Bronce, Plata, Oro, Zafiro): ");
                    laLista.modifica(new cliente(cedulaM, nombreM, nacimientoM, 
                            correoM, categoriaM));
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, laLista);
                    int cedula6 = Integer.parseInt(JOptionPane.showInputDialog(
                            "Cedula del Cliente: "));
                    //Incompleto!!
                    //mostar toda la informcación del mismo, alquilres realizados (mostrar la 
                    //fecha numero de placa y cantidad de dias del alquiler
                    //JOptionPane.showMessageDialog(null,laLista.extrae(cedula6));
                    //orden cronologoico (más antiguo al más reciente)
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, laLista);
                    int cedula7 = Integer.parseInt(JOptionPane.showInputDialog(
                            "Cedula del Cliente: "));
                    //preguntar si tiene alquileres pendientes y si no, aplicar codgo de extrae.
                    break;
                case 8:
                    int cedulaA = Integer.parseInt(JOptionPane.showInputDialog(
                            "Cedula del Cliente: "));
                    int dias = Integer.parseInt(JOptionPane.showInputDialog(
                            "Cantidad de dias que se alquilará el vehiculo: "));
                     int pasajeros = Integer.parseInt(JOptionPane.showInputDialog(
                            "Cantidad de pasajeros: "));
                     String marcaA = JOptionPane.showInputDialog("Marca del "
                            + "Vehiculo: ");
                    String modeloA = JOptionPane.showInputDialog("Modelo del "
                            + "Vehiculo: ");
                    int anioA = Integer.parseInt(JOptionPane.showInputDialog("Año "
                            + "del Vehiculo: "));
                    String extrasA = JOptionPane.showInputDialog(""
                            + "Extras del Vehiculo: ");
                    if(dias>=30){
                        //buscar cliente por cedula 
                        String cat = laLista.buscar(cedulaA).getCategoria;
                        if(cat== "plata"){
                            laLista.buscar(cedulaA).setCategoria="oro";
                        }else if(cat == "oro"){
                            laLista.buscar(cedulaA).setCategoria="zafiro";
                        }else {
                            laLista.buscar(cedulaA).setCategoria="plata";
                        }
                    }
        
                    break;
                case 9:
                    
                    break;
                case 10:
                    
                    break;
                case 11:
                    
                    break;
                case 12:
                    
                    break;
                case 13:
                    System.exit(0);
            }
        
        
        
        //System.out.println("--------------------------------------ESPI----------------------------------------------");
        //listaCliente laLista = new listaCliente();
        //laLista.inserta(new cliente(22, "Juan", "Juan", "Juan", "Juan"));
        ///laLista.inserta(new cliente(11, "Juan", "Juan", "Juan", "Juan"));
        ///laLista.inserta(new cliente(15, "Juan", "Juan", "Juan", "Juan"));
        ///laLista.inserta(new cliente(66, "Juan", "Juan", "Juan", "Juan"));
        //laLista.inserta(new cliente(75, "Juan", "Juan", "Juan", "Juan"));
       

        // System.out.println(laLista.extrae(30).getNombre());
        // laLista.elimina(5);
        // System.out.println("Existe? "+laLista.existe(20));
        //System.out.println(laLista);

        //System.out.println("-------Modificada------");

        //laLista.modifica(new cliente(15, "Didier", "uno", "uno", "uno"));
        // laLista.modifica(new Persona(15, 65));
        //System.out.println(laLista);
        //System.out.println("-------Elimina------");
        //laLista.elimina(15);
        //System.out.println(laLista);
        //laLista.extrae(5);
        //System.out.println("-------Extrae------");
        //System.out.println(laLista.extrae(75));
        //System.out.println("--------------------------------------EAAV----------------------------------------------");
        //Lista lista = new Lista();
        //lista.inserta(new vehiculo("GHD-456", "Ferrari", 2000, "Rojo", 
         //   "6000cc", "Gasolina", 2, 500000, "extras"));
        
       // System.out.println(lista);
        //System.out.println("-------Modificada------");
        //lista.modifica(new vehiculo("XXXXX", "XXXXXX", 111111, "XXXXX", 
        //    "XXXXXXXX", "XXXXXXXXX", 1, 111111111, "XXXXXX"));
        //System.out.println("-------Elimina------");
        //System.out.println("GHD-555");
        //lista.elimina("GHD-555");
        //System.out.println(lista);
        //lista.consultar(lista);
        //System.out.println("----------------------------------------------------------------------------------------");
    }
        
        
    }
    }
