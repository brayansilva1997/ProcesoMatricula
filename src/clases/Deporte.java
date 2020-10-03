
package clases;

import javax.swing.JOptionPane;


public class Deporte extends ActividadExtra{
    private int  opcDeporte;
    
    private static final String dia = "Sabado";
    private static final String hora = "9:00-11:00am";
     private static String nomProfe="Victor";
     private String nombreDeporte;
     Alumno alumno;
    public Deporte() {
        
        
    }
    public void establecerAlumno(Alumno alumno){
        this.alumno=alumno;
    }
     public void setNombreDeporte(String nombreDeporte){
         this.nombreDeporte=nombreDeporte;
     }
    public void elegirDeporte(){
        opcDeporte=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Deporte: "+"\n"+
                "1. Futbol"+"\n"+
                "2. Natacion"+"\n"+
                "3. Atletismo"+"\n"));
        if(opcDeporte==1){
            JOptionPane.showMessageDialog(null, "Se elegio Futbol");
            this.nombreDeporte="Futbol";
        }else if(opcDeporte==2){
            JOptionPane.showMessageDialog(null,"Se elegio Natacion");
            this.nombreDeporte="Natacion";
        }else if(opcDeporte==3){
            JOptionPane.showMessageDialog(null, "Se elegio Atletismo");
            this.nombreDeporte="Atletismo";
        }
    }
     
}
