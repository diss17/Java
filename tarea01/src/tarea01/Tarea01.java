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

class Articulo {

    public Articulo() {

    }

    float peso;
    String nombre;
    String descripcion;
    float precio;
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

}

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
    }
}
