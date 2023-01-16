package practicandoII;

import java.util.LinkedList;

public class Materia  implements Informacion {
    private String nombre;
    private Profesor titular;
    private LinkedList<Estudiante>coleccionDeESTUDIANTE= new LinkedList<Estudiante>();

    public Materia(String nombre, Profesor titular) {

        this.nombre = nombre;
        this.titular =titular;
        this.coleccionDeESTUDIANTE=new LinkedList<Estudiante>();

    }
    public void AgregarESTUDIANTE(String nombre, String apellido, int Legajo){
        Estudiante e1=new Estudiante(nombre,apellido,Legajo);
        this.coleccionDeESTUDIANTE.add(e1);

    }
    public void EliminarEstudiante(int legajo){
        for (Estudiante e : coleccionDeESTUDIANTE){

            if (e.getLegajo()==(legajo)){
                this.coleccionDeESTUDIANTE.remove(e);

            }

        }
    }

    public void CambiardePROFESOR(String Nombredelprofesor,String Apellido, int antiguedad, double sueldo,int legajodelprofesor){
        this.titular=new Profesor(Nombredelprofesor,Apellido,antiguedad,sueldo,legajodelprofesor);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getTitular() {
        return titular;
    }

    public void setTitular(Profesor titular) {
        this.titular = titular;
    }

    public LinkedList<Estudiante> getColeccionDeESTUDIANTE() {
        return coleccionDeESTUDIANTE;
    }


    @Override
    public void verCantidad() {
        System.out.println("LA CANTIDAD DE ALUMOS ES DE:"+ coleccionDeESTUDIANTE.size());
    }

    @Override
    public String Listarcontenidos() {
        for (Estudiante e :coleccionDeESTUDIANTE){
            System.out.println(e);
        }
        return null;
    }
}
