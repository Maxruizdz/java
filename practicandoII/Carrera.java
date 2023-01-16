package practicandoII;

import java.util.LinkedList;

public class Carrera implements Informacion {
    private String nombredeCarrera;
    private LinkedList<Materia> coleccionMaterias=new LinkedList<Materia>();
    public Carrera(String nombredeCarrera){
        this.nombredeCarrera=nombredeCarrera;
        this.coleccionMaterias=new LinkedList<Materia>();

    }
    public void AgregarMATERIAS(Materia nombredeMATERIA, Profesor titular){

       this.coleccionMaterias.add(nombredeMATERIA);
    }
    public void EliminarMateria(String nombredeMateriaaEliminar) {
        int cont = 0;
        for (Materia m : coleccionMaterias) {
            if (m.getNombre().equals(nombredeMateriaaEliminar)) {
                this.coleccionMaterias.remove(m);
                cont++;
            }
            if (cont == 0) {
                System.out.println("LA " + nombredeMateriaaEliminar + "NO SE ENCUENTRA EN LA CARRERA");

            } else {
                System.out.println("LA MATERIA" + nombredeMateriaaEliminar + "SE HA ELIMINADO DE LA CARRERA");
            }


        }
    }
    public void EncontrarCarrera(String nombredeMateriaAencontrar){
        int cont=0;
        for (Materia c: coleccionMaterias){
            if (c.getNombre().equals(nombredeMateriaAencontrar)){
                cont++;
            }
        }
        if (cont==0){
            System.out.println("LA MATERIA"+ nombredeMateriaAencontrar+"NO SE ENCUENTRA EN LA CARRERA");

        }else{
            System.out.println("LA MATERIA"+nombredeMateriaAencontrar+"SE ENCUENTRA EN LA CARRERA");
        }


    }
    public String getNombredeCarrera() {
        return nombredeCarrera;
    }


    @Override
    public void verCantidad() {
        System.out.println("LA CANTIDAD DE MATERIAS QUE CONTIENE LA CARRERA"+ getNombredeCarrera()+"ES:"+ coleccionMaterias.size());
    }

    @Override
    public String Listarcontenidos() {
        for (Materia m: coleccionMaterias){
            System.out.println(m);
        }
        return null;
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "nombredeCarrera='" + nombredeCarrera + '\'' +
                ", coleccionMaterias=" + coleccionMaterias +
                '}';
    }

}
