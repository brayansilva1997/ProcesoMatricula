
package clases;

import javax.swing.JOptionPane;


public class Apoderado{
    
    private String nombre;
    private String direccion;
    private String telefono;
    private String dni;
    private String parentesco;
    Alumno alumno;

   public void establecerAlumno(Alumno a){
       this.alumno=a;
   }
    public Apoderado(){
        llenarDatosApoderado();
    }

    public Apoderado(String nombre, String direccion, String telefono, String dni, String parentesco, Alumno alumno) {
        
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dni = dni;
        this.parentesco = parentesco;
        this.alumno = alumno;
    }
    
    public void mostrarDatosApoderado(){
        
    }
    public void llenarDatosApoderado(){
        
        
        
        nombre=JOptionPane.showInputDialog(null,"Ingrese nombreApoderado: ");
        direccion=JOptionPane.showInputDialog(null,"Ingrese direccion Apoderado:");
        telefono=JOptionPane.showInputDialog(null,"Ingrese telefono Apoderado: ");
        dni=JOptionPane.showInputDialog(null,"Ingrese dni: ");
        parentesco=JOptionPane.showInputDialog(null,"Ingrese parentesco: ");
       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
    
  
}
