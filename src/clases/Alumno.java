
package clases;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Alumno {
    private String idAlumno;
    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;
    Apoderado apoderado;
    LinkedList <Curso> cursos = new LinkedList<>();
    Curso curso;
    ActividadExtra actividad = new ActividadExtra();
    Arte a;
    Musica m;
    Deporte d;

    public Arte getA() {
        return a;
    }

    public void setA(Arte a) {
        this.a = a;
    }

    public Musica getM() {
        return m;
    }

    public void setM(Musica m) {
        this.m = m;
    }

    public Deporte getD() {
        return d;
    }

    public void setD(Deporte d) {
        this.d = d;
    }

    
    public void ContadorCursos(){
        if(cursos.size()!=6){
            JOptionPane.showMessageDialog(null, "No puede exceder la cantidad de cursos (6)");
        }
    }
    public void llenarDatos(){
        idAlumno=JOptionPane.showInputDialog("Ingrese idAlumno:");
        nombre=JOptionPane.showInputDialog("Ingrese nombre:");
        apellido=JOptionPane.showInputDialog("Ingrese apellido:");
        edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad:"));
        sexo=JOptionPane.showInputDialog("Ingrese sexo:");
    }
    
    public void agregarCurso(Curso c){
        this.cursos.add(c);
    }
    
//    private String codApoderado;
//    private String nombre;
//    private String direccion;
//    private String telefono;
//    private String dni;
//    private String parentesco;
    
    
    
    public Alumno() {
        
    }
    
    public void establecerApoderado(Apoderado a){
        this.apoderado=a;
    }

    public String getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(String idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Apoderado getApoderado() {
        return apoderado;
    }

    public void setApoderado(Apoderado apoderado) {
        this.apoderado = apoderado;
    }

    public LinkedList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(LinkedList<Curso> cursos) {
        this.cursos = cursos;
    }

    public ActividadExtra getActividad() {
        return actividad;
    }

    public void setActividad(ActividadExtra actividad) {
        this.actividad = actividad;
    }
    
    public void mostrarDatosAlumno(){
         JOptionPane.showMessageDialog(null,"\tDatos del Alumno"+"\n "+
                "Nombre: "+this.getNombre()+"\n"+
                "Apellido: "+this.getApellido()+"\n"+
                "Sexo: "+this.getSexo()+"\n"+
                "Id: "+this.getIdAlumno());
    }
    
    
}
