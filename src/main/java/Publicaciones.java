public class Publicaciones {

    private String editorial;
    private int numpaginas;
    private Color color;

    public Publicaciones(String editorial, int numpaginas, Color color) {
        this.editorial = editorial;
        this.numpaginas = numpaginas;
        this.color = color;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getNumpaginas() {
        return numpaginas;
    }

    public Color getColor() {
        return color;
    }
}
