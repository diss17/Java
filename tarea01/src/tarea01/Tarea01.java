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
class Direccion{
    private String address;
    //Constructor
    public Direccion(){
    }
    //Getter para direccion
    public String getDirec(String direccion){
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
    public DetalleOrden(){
        
    }
    private int cantidad;

}

//  Class fran.
class Articulo {
    public Articulo(){
    }
    private float pesoUn, money;
    private String nameUs, description;
    
    private float getPeso(float peso){
        this.pesoUn=peso;
        return pesoUn;
    }
    
    private float getPrecio(float precio){
        this.money=precio;
        return money;
    }
    private String getNombre(String nombre){
        this.nameUs=nombre;
        return nameUs;
    }
    private String getDescripcion(String descripcion){
        this.description=descripcion;
        return description;
    }

}

class Tarjeta{
    public Tarjeta(){
        
    }
    String tipo;
    String numTransaccion;
    
}

class Transferencia{
    public Transferencia(){
        
    }
    String banco;
    String numCuenta;
}

class Pago{
    private float monto;
    Date fecha = new Date();
    
}

class DocTributario{
    Date fecha = new Date();
    private String numero;
    private String rut;
}

class Factura{
    
}

class Boleta{
    
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
