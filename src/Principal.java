
import java.util.Scanner;



/**
 *
 * @author Julio Cifuentes
 * @version 05-09-2023
 */
public class Principal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        boolean flag;
        int saldoPesos = 0;
        // Cuenta
        String correo,contraseña;
        
        // Canal
        String nombreCanal,descripcion;
        int cantidadSubs,cantidadVideos;
        int saldoRecaudado;
        
        Canal canal = new Canal();
        Cuenta cuenta = new Cuenta();
        Valida valida = new Valida();
        
        do {
            System.out.println("*****MENU*****");
            System.out.println("1. Ingresar a Cuenta");
            System.out.println("2. Crear Canal");
            System.out.println("3. Agregar Subs");
            System.out.println("4. Visualizar datos del canal");
            System.out.println("5. Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    do {
                        System.out.println("");
                        System.out.println("Ingrese correo: ");
                        correo = leer.next();
                        flag = valida.validarCorreo(correo);
                        if (flag == false){
                            System.out.println("Correo inválido, debe contener el @");
                            }
                    } while (flag==false);
                    
                    do {
                        System.out.println("");
                        System.out.println("Ingrese Contraseña: ");
                        contraseña = leer.next();
                        flag = valida.validarLargoContraseña(contraseña);
                        if (flag == false) {
                            System.out.println("Contraseña inválida, debe ser entre 6 y 10 caracteres");
                        }                       
                    } while (flag==false);
                    
                    cuenta.setCorreo(correo);
                    cuenta.setContraseña(contraseña);
                    System.out.println("***Cuenta Correcta***");
                    System.out.println(cuenta);
                    
                    break;
                    
                case 2:
                    
                    do {
                        System.out.println("");
                        System.out.println("Ingrese nombre del canal: ");
                        nombreCanal = leer.next();
                        flag = valida.validarNombreCanal(nombreCanal);
                        if (flag == false){
                            System.out.println("Nombre inválido (largo mínimo 3 caracteres)");
                        }                        
                    } while (flag==false);
                    
                    canal.setNombreCanal(nombreCanal);
                    
                    System.out.println("");
                    System.out.println("Ingrese descripción del canal: ");
                    descripcion = leer.next();
                    
                    canal.setDescripcion(descripcion);
                    
                    System.out.println("");
                    System.out.println("Ingrese cantidad de videos: ");
                    cantidadVideos = leer.nextInt();
                    canal.setCantidadVideos(cantidadVideos);
                    
                    canal.setCuenta(cuenta);
                    
                    System.out.println("***CANAL CREADO***");
                    
                    break;
                case 3:
                    
                    do {
                        System.out.println("");
                        System.out.println("Ingrese cantidad de subs: ");
                        cantidadSubs = leer.nextInt();
                        flag = valida.validarSubs(cantidadSubs);
                        if (flag == false) {
                            System.out.println("Cantidad inválida, debe ser mayor o igual a 0");
                        }
                    } while (flag==false);
                    
                    canal.acumularSubs(cantidadSubs);
                    
                    if (canal.getCantidadSubs()>10000){
                        
                        saldoPesos = 500 * 938;
                        //saldoPesos = canal.calcularSaldoPesos(saldoRecaudado);
                        canal.setSaldoRecaudado(saldoPesos);
                    }

                    System.out.println("***SUBS AGREGADOS***");
                    
                    break;
                    
                case 4:
                    System.out.println("");
                    canal.mostrarInfoCanal();
                    System.out.println("");
                    break;
                    
                case 5:
                    System.out.println("Muchas gracias por usar el programa");
                    break;

            
        }
        
        
        
        
    }while(opcion !=5);
    
    
}
}
