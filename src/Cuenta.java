

/**
 *
 * @author Julio Cifuentes
 * @version 05-09-2023
 */
public class Cuenta {
    private String correo;
    private String contraseña;

    public Cuenta() {
    }

    public Cuenta(String correo, String contraseña) {
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "correo=" + correo + ", contrase\u00f1a=" + contraseña + '}';
    }
    
        
}
