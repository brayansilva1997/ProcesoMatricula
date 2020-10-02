
package clases;

import java.util.LinkedList;
import javax.swing.JOptionPane;


public class Curso {
    
    String nombreCurso;
    String [] horario;
    String []dias;
    int opc;
    
    LinkedList <Alumno> alumnos = new LinkedList<>();

   

    public void setAlumnos(LinkedList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void agregarAlumno(Alumno alumno){
        this.alumnos.add(alumno);
    }
    
   
    public Curso() {
    
      
        
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String[] getHorario() {
        return horario;
    }

    public void setHorario(String[] horario) {
        this.horario = horario;
    }

    public String[] getDias() {
        return dias;
    }

    public void setDias(String[] dias) {
        this.dias = dias;
    }

    public int getOpc() {
        return opc;
    }

    public void setOpc(int opc) {
        this.opc = opc;
    }

    public void elegirCurso(){
        System.out.println("hhhhh");
        opc= Integer.parseInt(JOptionPane.showInputDialog(null,"Cursos: "+"\n"+
                "1. Matematica   Horario: Lunes 7:00-9:00am - Martes 7:00-9:00am - Jueves 9:00-11:00am"+"\n"+
                "2. Comunicacion Horario: Lunes 9:00-11:00am - Miercoles 7:00-11:00"+"\n"+
                "3. CTA          Horario: Martes 9:00-1:00pm - Jueves 11:00-1:00pm"+"\n"+
                "4. Ingles       Horario: Lunes 11:00-1:00pm - Lunes 11:00-1:00pm"+"\n"+
                "5. Religion     Horario: Jueves 7:00-9:00am - Viernes 7:00-9:00am"+"\n"+
                "6. Psicologia   Horario: Viernes 9:00-1:00pm"));
        if(opc==1){
            JOptionPane.showMessageDialog(null, "Eligio Matematica");
            this.setNombreCurso("Matematica");
            //horarios
            String[]diasMate={"Lunes","Martes","Jueves"};
            this.setDias(diasMate);
            String[]horarioMate={"7:00-9:00am","9:00-11:00am","9:00-11:00am"};
            this.setHorario(horarioMate);
        }else if(opc==2){
            JOptionPane.showMessageDialog(null, "Eligio Comunicacion");
            this.setNombreCurso("Comunicacion");
            //horarios
            String[]diasComunicacion={"Lunes","Miercoles"};
            this.setDias(diasComunicacion);
            String[]horarioComunicacion={"9:00-11:00am","7:00-11:00am"};
            this.setHorario(horarioComunicacion); 
        }
    }
    public void elegirCurso(int i){
        int opc=i;
        System.out.println("hhhhh");
        /*
        opc= Integer.parseInt(JOptionPane.showInputDialog(null,"Cursos: "+"\n"+
                "1. Matematica   Horario: Lunes 7:00-9:00am - Martes 7:00-9:00am - Jueves 9:00-11:00am"+"\n"+
                "2. Comunicacion Horario: Lunes 9:00-11:00am - Miercoles 7:00-11:00"+"\n"+
                "3. CTA          Horario: Martes 9:00-1:00pm - Jueves 11:00-1:00pm"+"\n"+
                "4. Ingles       Horario: Lunes 11:00-1:00pm - Lunes 11:00-1:00pm"+"\n"+
                "5. Religion     Horario: Jueves 7:00-9:00am - Viernes 7:00-9:00am"+"\n"+
                "6. Psicologia   Horario: Viernes 9:00-1:00pm"));
        */
        if(opc==1){
            JOptionPane.showMessageDialog(null, "Eligio Matematica");
            this.setNombreCurso("Matematica");
            //horarios
            String[]diasMate={"Lunes","Martes","Jueves"};
            this.setDias(diasMate);
            String[]horarioMate={"7:00-9:00am","9:00-11:00am","9:00-11:00am"};
            this.setHorario(horarioMate);

        }else if(opc==2){
            JOptionPane.showMessageDialog(null, "Eligio Comunicacion");
            this.setNombreCurso("Comunicacion");
            //horarios
            String[]diasComunicacion={"Lunes","Miercoles"};
            this.setDias(diasComunicacion);
            String[]horarioComunicacion={"9:00-11:00am","7:00-11:00am"};
            this.setHorario(horarioComunicacion); 
        }
        
        
    }
    public void muestrameCurso(){
      String mostrartodo="DATOS DEL CURSO \n"+" Dias: \n"+" ";
      for(int i=0;i<dias.length;i++){
          mostrartodo = mostrartodo + dias[i];
      }
      mostrartodo=mostrartodo+"\nHoras: \n"+" ";
      for(int j=0;j<horario.length;j++){
          mostrartodo=mostrartodo + horario[j];
      }
      JOptionPane.showMessageDialog(null, mostrartodo);
    }
    
    
}
