
package clases;

import java.util.HashSet;
import javax.swing.JOptionPane;


public class Principal{
    static int opcion;
    public static Matricula matricula = new Matricula();
    
    public static void main(String[] args) {
        try{
            Menu();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
   
    public static void elegircurso(Alumno alum){
        int opc;
        int opc2;
            opc= Integer.parseInt(JOptionPane.showInputDialog("Elegir opcion: "+"\n"+
                   "1.Agregar Curso \n"+
                   "2.Borrar Curso"+"\n"+
                   "3. No deseo agregar curso"));
           if(opc==1){
               System.out.println("Se elegio 1");
                Curso curso = new Curso();
                curso.elegirCurso();
                alum.agregarCurso(curso);
               
               opc2=Integer.parseInt(JOptionPane.showInputDialog(null,"Desea elegir otro curso: ? \n "+
                       "1. Si \n"+
                       "2. No \n"));
               switch(opc2){
                   case 1: elegircurso(alum);
                            break;
                   case 2:  JOptionPane.showMessageDialog(null, "Elegio no");
                            Menu();
                            break;
               }
               
           
        
        
    }
    }
    
     public static void Menu(){
        opcion= Integer.parseInt(JOptionPane.showInputDialog(null,"Menu: "+"\n"+
                "1. Agregar Alumno"+"\n"+
                "2. Buscar Alumno"+"\n"+
                "3. Mostrar datos de Alumno"+"\n"+
                "4. Eliminar Alumno"+"\n"+
                "5. Modificar datos de Alumno+ \n"+
                "6. Salir"));
        
        if(opcion==1){
           Alumno alum = new Alumno();
           alum.llenarDatos();
         //  alum.llenarDatos();
           matricula.agregarAlumno(alum);
           JOptionPane.showMessageDialog(null, "Alumno Registrado");
           int opcElegirCurso;
           opcElegirCurso=Integer.parseInt(JOptionPane.showInputDialog(null,"Desea elegir sus cursos? \n"
                   + "1.Si \n"
                   +"2. No \n"));
           if(opcElegirCurso==1){
                elegircurso(alum);
           }else{
               //Menu();
           }
            
           
           if(opcion==6){
               
           }
           
            

        }else if(opcion==2){
         String idAlumno = JOptionPane.showInputDialog(null, "Ingresar id de Alumno: ");
         int indice;
         indice=matricula.BuscarAlumno(idAlumno);
         if(indice==-1){
             JOptionPane.showMessageDialog(null,"No se encontro al alumno");
         }else{
             JOptionPane.showMessageDialog(null, "Se encontro al alumno");
             int opc;
            opc=Integer.parseInt(JOptionPane.showInputDialog(null,"Desea saber los datos del alumno: + \n"+
                    "1. Si "+"\n"+
                    "2. No "+"\n"));
            switch(opc){
                case 1: 
                    String date = matricula.ElementoBuscado(indice);
                    JOptionPane.showMessageDialog(null, date);
                    Menu();
                    break;
                case 2: JOptionPane.showMessageDialog(null, "Eligio NO");
                    Menu();
                    break;
            }
             
         }
            
        }else if(opcion==3){
            JOptionPane.showMessageDialog(null, "Elegio Mostrar Datos del alumno ");
            int indice;
            String date;
            String id;
            id =JOptionPane.showInputDialog(null,"Ingresa el Id del alumno a mostrar: ");
            indice = matricula.BuscarAlumno(id);
             date = matricula.ElementoBuscado(indice);
            JOptionPane.showMessageDialog(null, date);
            Menu();
        }else if(opcion==4){
            JOptionPane.showMessageDialog(null, "Elegio opcion eliminar alumno");
            String date=matricula.mostrarListadeAlumnos();
            int eleccionAlumno;
            eleccionAlumno=Integer.parseInt(JOptionPane.showInputDialog(null,date));
            matricula.alumnos.remove(eleccionAlumno-1);
            
            Menu();
        }else if(opcion==5){
            JOptionPane.showMessageDialog(null, "Elegio opcion Modificar datos Alumno");
            String date=matricula.mostrarListadeAlumnos();
            int eleccionAlumno;
            int eleccionDatoAModificar;
            eleccionAlumno=Integer.parseInt(JOptionPane.showInputDialog(null,"Lista de Alumnos: \n"+date));
            eleccionDatoAModificar=Integer.parseInt(JOptionPane.showInputDialog(null, "Se elegio a: "+matricula.alumnos.get(eleccionAlumno-1).getNombre()+"\n"
            + "Elige dato a modificar: \n"+
                    "1. Nombre \n"+
                    "2. Apellido \n"+
                    "3. Sexo \n"+
                    "4. Edad \n"+
                    "5. idAlumno \n"));
            String nombre,apellido,sexo,id;
            int edad;
            
            switch(eleccionDatoAModificar){
                case 1:  nombre=JOptionPane.showInputDialog(null,"Ingresa nombre a modificar: ");
                        matricula.alumnos.get(eleccionAlumno-1).setNombre(nombre);
                        Menu();
                    break;
                case 2: 
                        apellido=JOptionPane.showInputDialog(null,"Ingresa apellido a modificar: ");
                        matricula.alumnos.get(eleccionAlumno-1).setApellido(apellido);
                        Menu();
                    break;
                case 3: sexo=JOptionPane.showInputDialog(null,"Ingresa sexo a modificar: ");
                        matricula.alumnos.get(eleccionAlumno-1).setSexo(sexo);
                        Menu();
                    break;
                case 4: edad=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa edad a modificar: "));
                        matricula.alumnos.get(eleccionAlumno-1).setEdad(edad);
                        Menu();
                    break;
                case 5: id=JOptionPane.showInputDialog(null,"Ingresa idAlumno a modificar: ");
                        matricula.alumnos.get(eleccionAlumno-1).setIdAlumno(id);
                        Menu();
                    break;
            }
            
            Menu();
        }
        
        
    }
    
 
  
}

