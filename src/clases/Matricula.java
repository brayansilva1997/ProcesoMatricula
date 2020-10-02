
package clases;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.JOptionPane;


public class Matricula {
    
     private static final int costoMatricula = 200;
     private static final int costoPensión = 350;
     LinkedList<Alumno> alumnos = new LinkedList<>();

     public String mostrarListadeAlumnos(){
         String date = "";
         for(int i=0;i<alumnos.size();i++){
             date = date +String.valueOf(i+1)+". "+alumnos.get(i).getNombre()+"-"+"id:"+alumnos.get(i).getIdAlumno()+" - "+alumnos.get(i).getApellido()+" - "+alumnos.get(i).getSexo()+" \n";
         }
         return date;
     }
     
    public String ElementoBuscado(int indice){
        String date=" ";
        if(indice!=-1){
            date = date +" Datos del alumno: "+"\n"+
                    "Su nombre es: "+alumnos.get(indice).getNombre()+"\n"
                +"Su apellido eS: "+alumnos.get(indice).getApellido()+"\n"+
                    "Su Id es: "+alumnos.get(indice).getIdAlumno()+"\n"+
                    "Su sexo es: "+alumnos.get(indice).getSexo()+"\n"+
                    "Su edad es: "+alumnos.get(indice).getEdad()+"\n";
        }else{
            date = date + "No existe un alumno con ese codigo";
        }
        return date;
    } 
    public Matricula() {
    }

    public static int getCostoMatricula() {
        return costoMatricula;
    }

    public static int getCostoPensión() {
        return costoPensión;
    }

    public  LinkedList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(LinkedList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    
  public void agregarAlumno(Alumno alumno)  {
    
    this.alumnos.add(alumno);
      
}
  
   public int BuscarAlumno(String id){
        int indice = 0;
        int i=0;
        boolean band = false;
        while((i<alumnos.size())&&(band == false)){
            if(alumnos.get(i).getIdAlumno().equalsIgnoreCase(id)){
                band = true;
                indice=i;
            }
            i++;
        }
        
        if(band==false){
            indice=-1;
            JOptionPane.showMessageDialog(null, "no se encontro alumno");
        }
        
        return indice;
    }
   
}