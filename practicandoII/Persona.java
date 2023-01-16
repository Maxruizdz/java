package practicandoII;

public abstract class Persona {
     private String nombre;
     private int legajo;
     private String apellido;
     public Persona(String nombre, String apellido,int Legajo){
         this.apellido=apellido;
         this.legajo=legajo;
         this.nombre=nombre;


     }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
 public abstract void ModificarDatos(String nombre,String Apellido,int legajo);
}
