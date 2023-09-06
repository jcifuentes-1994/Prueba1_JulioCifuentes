

/**
 *
 * @author Julio Cifuentes
 * @version 05-09-2023
 */
public class Valida {

    public Valida() {
    }
    
    public boolean validarLargoContraseña(String contraseña){
        if (contraseña.length()>=6 && contraseña.length()<=10){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean validarCorreo(String correo){
        if(correo.contains("@")){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean validarNombreCanal(String nombreCanal){
        if(nombreCanal.length()>=3){
            
            return true;
        }else{
            return false;
        }
    
    }
    
    public boolean validarSubs(int cantidadSubs){
        if (cantidadSubs >= 0){
            return true;
        }else{
            return false;
        }
    }
    
}
