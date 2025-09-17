package ar.edu.unju.fi.modelos;

public abstract class Cliente {
    private String nombre;
    private String dni;
    private String email;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
