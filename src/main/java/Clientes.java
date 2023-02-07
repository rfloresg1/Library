public class Clientes {
    private String nombre;
    private String dni;
    private Libros canEjemplares;

    public Clientes(String nombre, String dni, Libros canEjemplares) {
        this.nombre = nombre;
        this.dni = dni;
        this.canEjemplares = canEjemplares;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Libros getCanEjemplares() {
        return canEjemplares;
    }
}
