package examen.pkg1.kener.y.josefh;

public class Aplicante {

    protected String nombre;
    protected int nota;
    protected String datos;

    public void Empleado(String nombre, int nota){
        this.nombre = nombre;
        this.nota = nota;
    }

    public void setNombre(){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNota(){
        this.nota = nota;
    }

    public int getNota(){
        return nota;
    }

    public void datosAplicante(String nombre, int nota) {
        datos += "Nombre: " + nombre + "\n"
                + "Nota: " + nota + "/4" + "\n";
    }

    public void setDatos(){
        this.datos = datos;
    }

    public String datos(){
        return datos;
    }
}
