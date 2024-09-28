package trabajoFinal;

public class Equipo {
    private String nombre;
    private String codigoDeEquipo;
    private boolean isOperative;
    private boolean isCheckedOut;
    private String usuario;


    public Equipo(String nombre, String codigoDeEquipo, boolean isOperative, boolean isCheckedOut, String usuario) {
        this.nombre = nombre;
        this.codigoDeEquipo = codigoDeEquipo;
        this.isOperative = isOperative;
        this.isCheckedOut = isCheckedOut;
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoDeEquipo() {
        return codigoDeEquipo;
    }

    public void setCodigoDeEquipo(String codigoDeEquipo) {
        this.codigoDeEquipo = codigoDeEquipo;
    }

    public boolean isOperative() {
        return isOperative;
    }

    public void setOperative(boolean operative) {
        isOperative = operative;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


}
