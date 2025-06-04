public class Secundaria {
    private String nombre;
    private int edad;

    // Constructor sin argumentos
    public Secundaria() {
        this.nombre = "";
        this.edad = 0;
    }

    public Secundaria(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Secundaria{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}