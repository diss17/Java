package tarea01;
//Obtener fecha

import java.sql.Date;
//Definicion de clases

<<<<<<< HEAD
class Cliente {

    public Cliente() {
        String nombre;
        String rut;
    }
    //Se supone que cada Orden de compra
    //debe ir asociada a un cliente distinto
    OrdenCompra asociado;
}

class OrdenCompra {

    Date fecha;
    String estado;

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
class Articulo{
    float peso;
    String nombre;
    String descripcion;
    float precio;
}
public class Tarea01 {

    public static void main(String[] args) {
        OrdenCompra m = new OrdenCompra();
        System.out.println(m);
=======
    public static void main(String[] args) {
        System.out.println("hola");
        System.out.println("test");
>>>>>>> d5e713b0c769c5f65194cb98659ccbd8cb45c9c9
    }

}
