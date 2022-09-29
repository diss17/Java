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

    private int cantidad;

}

class Articulo {

    float peso;
    String nombre;
    String descripcion;
    float precio;
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
