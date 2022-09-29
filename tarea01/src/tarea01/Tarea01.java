package tarea01;
//Obtener fecha

import java.util.Date;
//Definicion de clases

class Cliente {

    private String name, id;

    //Constructor
    public Cliente() {
    }

    //Getter para nombre
    public String getNombre(String nombre) {
        this.name = nombre;
        return name;
    }

    //Getter para rut
    public String getRut(String rut) {
        this.id = rut;
        return id;
    }
    //Se supone que cada Orden de compra
    //debe ir asociada a un cliente distinto
    OrdenCompra asociado;
}

class Direccion {

    private String address;

    //Constructor
    public Direccion() {
    }

    //Getter para direccion
    public String getDirec(String direccion) {
        this.address = direccion;
        return address;
    }
}

class OrdenCompra {

    public OrdenCompra() {
        Date fecha = new Date();
        System.out.println(fecha);
    }

    public int calcPrecioSinIva(int num) {
        return 0;
    }

    public int calcIva(int num) {
        return 0;
    }

    public int calcPrecio(int num) {
        return 0;
    }

    public int calcPeso() {
        return 0;
    }

}

class DetalleOrden {

    public DetalleOrden() {

    }
    private int cantidad;

}

//  Class fran.
class Articulo {
<<<<<<< HEAD

    public Articulo() {

=======
    private float pesoUn, money;
    private String nameUs, description;
    
    public Articulo(){
    }
  
    public float getPeso(float peso){
        this.pesoUn=peso;
        return pesoUn;
    }
    
    public float getPrecio(float precio){
        this.money=precio;
        return money;
    }
    public String getNombre(String nombre){
        this.nameUs=nombre;
        return nameUs;
    }
    public String getDescripcion(String descripcion){
        this.description=descripcion;
        return description;
>>>>>>> 4cfb96238dfb0d94d5c703070883f12cb62dd134
    }

}

class Tarjeta {

    public Tarjeta() {

    }
    String tipo;
    String numTransaccion;

}

class Transferencia {

    public Transferencia() {

    }
    String banco;
    String numCuenta;
}

class Pago {

    private float monto;
    Date fecha = new Date();
    public Pago(){
    }
    class Efectivo extends Pago{
        public Efectivo(){
        }
        public float calcDevolucion(float dinero){
            if(monto == dinero){
                return 0;
            }
            else{
                return monto - dinero;
            }
        }
    }
    class Transferencia extends Pago{
        private String banco;
        private String numCuenta;
        public Transferencia(){   
        }
        public String getBank(String bank){
            this.banco = bank;
            return banco;
        }
        public String getNumCuenta(String num){
            this.numCuenta = num;
            return num;
        }
    }
}

class DocTributario {

    Date fecha = new Date();
    private String numero;
    private String rut;
}

class Factura {

}

class Boleta {

<<<<<<< HEAD
}
=======
>>>>>>> 4cfb96238dfb0d94d5c703070883f12cb62dd134

public class Tarea01 {

    public static void main(String[] args) {
        OrdenCompra m = new OrdenCompra();
        Cliente d = new Cliente();
        Cliente f = new Cliente();
        Direccion a = new Direccion();
        String nombre = d.getNombre("Daniel");
        String rut = f.getRut("212272183");
        String direccion = a.getDirec("Patio los callaos");
        System.out.println(nombre + " " + rut + " " + direccion);
        
        //Tamo instanciando Articulo de pana.
        Articulo x= new Articulo();
        Articulo y= new Articulo();
        Articulo z= new Articulo();
        Articulo v= new Articulo();
        
        float pesO=z.getPeso(7);
        float preciO=v.getPrecio(12000);
        String nombreArticulo=x.getNombre("Mouse");
        String descrip=y.getDescripcion("Es rosado pinki barbie");
        System.out.println(nombreArticulo+" "+descrip+" pesa "+pesO+" y vale "+preciO+" bella");
        
        
        
        
        
        
    }
}
