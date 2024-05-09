package examen.pkg1.kener.y.josefh;

public class Aplicante {

    protected String datos = "";

    public void Empleado() {
        
    }

    public String datosAplicante(String nombre, int nota) {
        datos = "Nombre: " + nombre + "\n"
                + "Nota: " + nota + "/4" + "\n";
                return datos;
    }

    public String datos(){
        return datos;
    }
}
