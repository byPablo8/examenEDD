package ligaEquipos;

import java.util.ArrayList;
import java.util.Arrays;

public class Liga {
    private String nombre;
    public Equipo[] clasificacion;

    public Liga(String nombre, ArrayList<Equipo> clasificacion) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Equipo[] getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(Equipo[] clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public String toString() {
        return "Liga{" +
                "nombre='" + nombre + '\'' +
                ", clasificacion=" + Arrays.toString(clasificacion) +
                '}' + "\n";
    }


}
