

/**
 *
 * @author Julio Cifuentes
 * @version 05-09-2023
 */
public class Canal {
    private String nombreCanal;
    private String descripcion;
    private int cantidadSubs;
    private int cantidadVideos;
    private Cuenta cuenta;
    private int SaldoRecaudado;

    public Canal() {
    }

    public Canal(String nombreCanal, String descripcion, int cantidadSubs, int cantidadVideos, Cuenta cuenta, int SaldoRecaudado) {
        this.nombreCanal = nombreCanal;
        this.descripcion = descripcion;
        this.cantidadSubs = cantidadSubs;
        this.cantidadVideos = cantidadVideos;
        this.cuenta = cuenta;
        this.SaldoRecaudado = SaldoRecaudado;
    }

    public int getCantidadSubs() {
        return cantidadSubs;
    }

    public void setCantidadSubs(int cantidadSubs) {
        this.cantidadSubs = cantidadSubs;
    }

    public int getCantidadVideos() {
        return cantidadVideos;
    }

    public void setCantidadVideos(int cantidadVideos) {
        this.cantidadVideos = cantidadVideos;
    }

    public String getNombreCanal() {
        return nombreCanal;
    }

    public void setNombreCanal(String nombreCanal) {
        this.nombreCanal = nombreCanal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public int getSaldoRecaudado() {
        return SaldoRecaudado;
    }

    public void setSaldoRecaudado(int SaldoRecaudado) {
        this.SaldoRecaudado = SaldoRecaudado;
    }

    @Override
    public String toString() {
        return "Canal{" + "nombreCanal=" + nombreCanal + ", descripción=" + descripcion + ", cantidadSubs=" + cantidadSubs + ", cantidadVideos=" + cantidadVideos + ", cuenta=" + cuenta + ", SaldoRecaudado=" + SaldoRecaudado + '}';
    }
      
   
    //customer
    
    public void mostrarInfoCanal(){
        System.out.println("Nombre del Canal: "+this.getNombreCanal());
        System.out.println("Descripción: "+ this.getDescripcion());
        System.out.println("Cantidad de Subs: "+ this.getCantidadSubs());
        System.out.println("Cantidad de videos: "+this.getCantidadVideos());
        System.out.println("Cuenta: "+getCuenta().getCorreo());
        System.out.println("Saldo Recaudado: "+this.getSaldoRecaudado());
    }
    
    public int calcularSaldoPesos(int saldoRecaudado){
        this.SaldoRecaudado = this.SaldoRecaudado * 938;
        return this.SaldoRecaudado;
    }
    
    public void acumularSubs(int valor){
        this.cantidadSubs = this.cantidadSubs + valor;
        //return this.cantidadSubs;
    }
}
