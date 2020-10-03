
package clases;

import javax.swing.JOptionPane;


public class Arte extends ActividadExtra{
   private int  opcArte;
    
    private static final String dia = "Domingo";
    private static final String hora = "9:00-11:00am";
     private static String nomProfe="Victor";
     private String nombreArte;
     Alumno alumno;
    public Arte() {
        
        
    }
    public void establecerAlumno(Alumno alumno){
        this.alumno=alumno;
    }
     public void setNombreArte(String nombreArte){
         this.nombreArte=nombreArte;
     }
    public void elegirArte(){
        opcArte=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Arte: "+"\n"+
                "1. Pintura"+"\n"+
                "2. Dibujo"+"\n"+
                "3. Grafitty"+"\n"));
        if(opcArte==1){
            JOptionPane.showMessageDialog(null, "Se elegio Pintura");
            this.nombreArte="Pintura";
        }else if(opcArte==2){
            JOptionPane.showMessageDialog(null,"Se elegio Dibujo");
            this.nombreArte="Dibujo";
        }else if(opcArte==3){
            JOptionPane.showMessageDialog(null, "Se elegio Fotografia");
            this.nombreArte="Fotografia";
        }
    }
}
