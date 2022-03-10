package ligaEquipos;

public class Jugador {
    private String nombre;
    private int dorsal;
    private Integer goles;
    private Integer tarjetas_rojas;
    private int tarjetas_amarillas;


    public Jugador(String nombre, int dorsal, int goles, int tarjetas_rojas, int tarjetas_amarillas) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.goles = goles;
        this.tarjetas_rojas = tarjetas_rojas;
        this.tarjetas_amarillas = tarjetas_amarillas;
    }

    //creo los get and set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getTarjetas_rojas() {
        return tarjetas_rojas;
    }

    public void setTarjetas_rojas(int tarjetas_rojas) {
        this.tarjetas_rojas = tarjetas_rojas;
    }

    public int getTarjetas_amarillas() {
        return tarjetas_amarillas;
    }

    public void setTarjetas_amarillas(int tarjetas_amarillas) {
        this.tarjetas_amarillas = tarjetas_amarillas;
    }


    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", goles=" + goles +
                ", tarjetas_rojas=" + tarjetas_rojas +
                ", tarjetas_amarillas=" + tarjetas_amarillas +
                '}' + "\n";

    }


}
