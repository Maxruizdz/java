package practicandoII;

public class Profesor extends Persona{
    private double sueldo;
    private int antiguedad;
    public Profesor(String nombre, String apellido, int Legajo, double sueldo,int antiguedad) {
        super(nombre, apellido, Legajo);
        this.sueldo=sueldo;
        this.antiguedad=antiguedad;
    }


    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public void ModificarDatos(String nombre,String apellido,int legajo) {
        setNombre(nombre);
        setApellido(apellido);
        setLegajo(legajo);
    }

}
