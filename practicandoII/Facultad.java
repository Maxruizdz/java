package practicandoII;

import java.util.LinkedList;

public class Facultad implements Informacion {
    private String nombreFacultad;
    LinkedList<Carrera> carreras= new LinkedList<Carrera>();
    public Facultad(String nombreFacultad){
        this.nombreFacultad=nombreFacultad;
        this.carreras=new LinkedList<Carrera>();

    }
    public void AgregarCarrera(Carrera nombredeCarrera){

        this.carreras.add(nombredeCarrera);
    }
    public void eliminarCarrera(String Nombredelacarreera){
        int cont=0;
        for (Carrera c : carreras){
            if(c.getNombredeCarrera().equals(Nombredelacarreera)){
                this.carreras.remove(c);
                cont++;
                break;

            }
            if (cont==0){
                System.out.println("LA CARRERA QUE DESEA ELIMINAR NO SE ENCUENTRA EN LA FACULTAD");
            }else {
                System.out.println("LA CARRERA SE HA ELIMINADO DE LA FACULTAD");
            }


        }
    }

    @Override
    public String toString() {
        return "Facultad{" +
                "nombreFacultad='" + nombreFacultad + '\'' +
                ", carreras=" + carreras +
                '}';
    }

    @Override
    public void verCantidad() {
        System.out.println("LA CANTIDAD DE CARRERA ES DE:"+ carreras.size());
    }

    @Override
    public String Listarcontenidos() {
        for (Carrera c : carreras){
            System.out.println(c);
        }
        return  null;
    }


}
