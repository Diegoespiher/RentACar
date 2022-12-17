/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectorentacar;

/**
 *
 * @author Luis Diego
 */
public class cliente {
    private int Id;
    private String nombre;
    private String nacimiento;
    private String correo;
    private String categoria;
   // private int opcion;

    public cliente(int Id, String nombre, String nacimiento, 
            String correo, String categoria) {
        this.Id = Id;
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.correo = correo;
        this.categoria = categoria;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getId() {
        return Id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Cliente" + " cédula= " + Id + ", nombre= " + nombre +
                ", nacimiento= " + nacimiento + ", correo= " + correo +
                ", categoria= " + categoria +".";
    }
    
}
