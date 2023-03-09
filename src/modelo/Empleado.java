package modelo;
public class Empleado {

    private String nombre;

    private String cargo;

    private String codigo;

    public Empleado() {
    }

    public Empleado(String nombre, String cargo, String codigo) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", codigo='" + codigo + '\'' +
                '}';
    }
    
}
