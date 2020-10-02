
package clases;

import javax.swing.JOptionPane;

public class Musica extends ActividadExtra{
    private int  opcMusica;
    
    private static final String dia = "Domingo";
    private static final String hora = "11:00-1:00pm";
     private static String nomProfe="Harol";
     private String nombreMusica;
     Alumno alumno;
    public Musica() {
        
        
    }
     
    public void elegirMusica(){
        opcMusica=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar Instrumento: "+"\n"+
                "1. Guitarra"+"\n"+
                "2. Piano"+"\n"+
                "3. Flauta"+"\n"));
        if(opcMusica==1){
            JOptionPane.showMessageDialog(null, "Se elegio Guitarra");
            this.nombreMusica="Guitarra";
        }else if(opcMusica==2){
            JOptionPane.showMessageDialog(null,"Se elegio Piano");
            this.nombreMusica="Piano";
        }else if(opcMusica==3){
            JOptionPane.showMessageDialog(null, "Se elegio Flauta");
            this.nombreMusica="Flauta";
        }
    }
}
