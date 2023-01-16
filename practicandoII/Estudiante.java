package practicandoII;

public class Estudiante extends Persona{
    public Estudiante(String nombre, String apellido, int Legajo) {
        super(nombre, apellido, Legajo);
    }

    @Override
    public void ModificarDatos(String nombre, String Apellido, int legajo) {
        setApellido(Apellido);
        setNombre(nombre);
        setLegajo(legajo);
    }

}
