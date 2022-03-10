package ligaEquipos;

public class Equipo implements Comparable<Equipo> {
    private String nombre;
    private String estadio;
    private int fundacion;
    private Jugador[] jugadores;
    private Integer puntos;
    private int partidos_ganados;
    private int partidos_perdidios;
    private int partidos_empatado;

    public Equipo(String nombre, String estadio, int fundacion, Jugador[] jugadores, int puntos, int partidos_ganados, int partidos_perdidios, int partidos_empatado) {
        this.nombre = nombre;
        this.estadio = estadio;
        this.fundacion = fundacion;
        this.jugadores = jugadores;
        this.puntos = puntos;
        this.partidos_ganados = partidos_ganados;
        this.partidos_perdidios = partidos_perdidios;
        this.partidos_empatado = partidos_empatado;
    }

    //creamos los get and set.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public int getFundacion() {
        return fundacion;
    }

    public void setFundacion(int fundacion) {
        this.fundacion = fundacion;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getPartidos_ganados() {
        return partidos_ganados;
    }

    public void setPartidos_ganados(int partidos_ganados) {
        this.partidos_ganados = partidos_ganados;
    }


    public void setPartidos_empatado(int partidos_empatado) {
        this.partidos_empatado = partidos_empatado;
    }

    public int getPartidos_empatado() {
        return partidos_empatado;
    }

    public int getPartidos_perdidios() {
        return partidos_perdidios;
    }

    public void setPartidos_perdidios(int partidos_perdidios) {
        this.partidos_perdidios = partidos_perdidios;
    }

    @Override
    public String toString() {
        return
                " nombre=" + nombre + "\n" +
                        " puntos=" + puntos + "\n" +
                        " partidos ganados=" + partidos_ganados + "\n" +
                        " partidos perdidios=" + partidos_perdidios + "\n" +
                        " partidos empatado=" + partidos_empatado + "\n";
    }

    @Override
    public int compareTo(Equipo t) {
        return puntos.compareTo(t.getPuntos());
    }
}
