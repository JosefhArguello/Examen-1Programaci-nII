package examen.pkg1.kener.y.josefh;

public class Aplicante {
    protected String datos = "";

    public Aplicante() {}

    /**
     * Registra los datos del aplicante.
     *  El nombre del aplicante.
     *  La nota obtenida en el examen.
     *Los datos del aplicante en formato de cadena.
     */
    public String datosAplicante(String nombre, int nota) {
        datos = "Nombre: " + nombre + "\n" + "Nota: " + nota + "/4" + "\n";
        return datos;
    }

    /**
     * Obtiene los datos del aplicante.
     * Los datos del aplicante.
     */
    public String datos() {
        return datos;
    }
}