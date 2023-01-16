package practicandoII;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

           /*System.out.println("BIENVENIDO");
           Scanner sc=new Scanner(System.in);
           int cont=0;
           int cont1=0;
           int cont7=0;
           int cont3=0;
           int contnum=0;
           String nombre="";
           int dni;
           int legajo;
           double sueldo;
           String nombredelprofesor;
           String Apellido;
           int antiguedad;

         while (cont==0){
             System.out.println("como es el nombre de tu facultad?");
             nombre=sc.next();
             Facultad facultad1=new Facultad(nombre);
             System.out.println("Con cuantas carrera cuenta su facultad?");
             cont1=sc.nextInt();
             for (int i=0; i<cont1;i++) {
                 System.out.println("ingrese en el nombre de la carrera"+ (i+1));
                 nombre=sc.next();
                 Carrera c1= new Carrera(nombre);
                facultad1.AgregarCarrera(c1);
                 System.out.println("cuantas Materias tiene su carrera"+(i+1));
                 cont7=sc.nextInt();
                 for (int o=0; o<cont7;o++){
                     System.out.println("ingrese las materias de la carrera"+(o+1));
                     nombre=sc.next();
                     System.out.println("ingrese el nombre del profesor"+(o+1));
                     nombredelprofesor=sc.next();
                     System.out.println("ingrese el apellido del profesor de la materia"+(o+1));
                     Apellido=sc.next();
                     System.out.println("INGRESE LA ANTIGUEDAD DEL PROFESOR");
                     antiguedad=sc.nextInt();
                     System.out.println("INGRESE EL SUELDO DEL PROFESOR");
                     sueldo=sc.nextInt();
                     System.out.println("INGRESE EL LEGAJO DEL PROFESOR");
                     legajo=sc.nextInt();
                     Profesor P1=new Profesor(nombredelprofesor,Apellido,legajo,sueldo,antiguedad);
                     Materia t4=new Materia(nombre,P1);
                     c1.AgregarMATERIAS(t4, P1);
                     System.out.println("DESEA AGREGAR ALUMONOS?");
                     System.out.println("SI DESEA AGREGAR\n" + "presione 1\n"+ "si no desea agregar\n"+"presione 2");
                     cont3=sc.nextInt();
                     if (cont3==1){
                         System.out.println("Cuantos estudiantes deseas agregar a la materia");
                         contnum= sc.nextInt();
                         for (int a=0; a<contnum;a++){
                             System.out.println("Nombre del estudiante");
                             nombre=sc.next();
                             System.out.println("Apellido del estudiante");
                             Apellido=sc.next();
                             System.out.println("NUMERO DE LEGAJO DEL ESTUDIANTE");
                             legajo=sc.nextInt();
                             Estudiante estudiante1= new Estudiante(nombre,Apellido,legajo);
                         }
                     }
                     facultad1.toString();
                     c1.toString();
                     c1.Listarcontenidos();
                     c1.verCantidad();
                     t4.Listarcontenidos();
                 }
             }
         }*/


    }
}