public class JugadorGuerra {
    private String nombre;
    private int fichas;
    private Dado dado;

    public JugadorGuerra(String nombre) {
        this.nombre = nombre;
        this.fichas = 10;
        this.dado = new Dado();
    }

    public String getNombre() {
        return nombre;
    }

    public int getFichas() {
        return fichas;
    }

    public void setFichas(int fichas) {
        this.fichas = fichas;
    }

    public int lanzarDado() {
        return dado.lanzar();
    }

    public void restarFicha() {
        fichas--;
    }
}
