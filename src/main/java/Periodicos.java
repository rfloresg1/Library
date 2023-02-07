public class Periodicos extends Publicaciones {
    private String nobmre;
    private String publicacion;

    public Periodicos(String editorial, int numpaginas, Color color, String nobmre, String publicacion) {
        super(editorial,numpaginas,color);
        this.nobmre = nobmre;
        this.publicacion = publicacion;
    }

    public String getNobmre() {
        return nobmre;
    }

    public String getPublicacion() {
        return publicacion;
    }
}
