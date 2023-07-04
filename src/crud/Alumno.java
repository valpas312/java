package crud;

public class Alumno {
    //atributos
    private int id;
    private String nombre;
    private String apellido;


    public Alumno() {
    }

    //constructores
    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length() > 0) {
            this.nombre = nombre;
        } else {
            System.out.println("El nombre debe tener al menos 1 caracter");
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido.length() > 0) {
            this.apellido = apellido;
        } else {
            System.out.println("El apellido debe tener al menos 1 caracter");
        }
    }


    //toString
    @Override
    public String toString() {
        return "Alumno{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
