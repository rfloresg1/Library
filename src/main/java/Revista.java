public class Revista extends Publicaciones {

    private String nombre;
    private String tematica;
    private Periodicidad periodicidad;

    public Revista(String editorial, int numpaginas, Color color, String nombre, String tematica, Periodicidad periodicidad) {
        super(editorial,numpaginas,color);
        this.nombre = nombre;
        this.tematica = tematica;
        this.periodicidad = periodicidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTematica() {
        return tematica;
    }

    public Periodicidad getPeriodicidad() {
        return periodicidad;
    }
}
