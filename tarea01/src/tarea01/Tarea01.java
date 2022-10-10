package tarea01;
//Obtener fecha

import java.util.Date;

//Definicion de clases
//Main feo.
public class Tarea01 {

    public static void main(String[] args) {
        Date f = new Date();
        Direccion a = new Direccion("Avenida Siempre viva #101");
        Cliente p = new Cliente("Daniel", "1248124", a);
        Articulo x = new Articulo(1000, 12000, "Mouse", "Mouse gamer");
        DetalleOrden Mouses = new DetalleOrden(x, 1);
        DetalleOrden Lampara = new DetalleOrden(x, 4);
        DetalleOrden Estuche = new DetalleOrden(x, 1);
        OrdenCompra Orden = new OrdenCompra(p, f, "No pago");
        Orden.addDetails(Mouses);
        Orden.addDetails(Lampara);
        Orden.addDetails(Estuche);
        System.out.println(Orden.toString());

        Efectivo num1 = new Efectivo(Orden.calcPrecio(), 50000, f);
        System.out.println("\n--Se realiza un pago en efectivo--\n");
        System.out.println("Monto total:" + num1.monto + " " + num1.CalDevolucion());

        Boleta boleta1 = new Boleta("01234", p.getRut(), f, a, Orden);
        System.out.println("\n--Boleta Orden 1--" + boleta1.toString());

        Tarjeta card = new Tarjeta(14000, f, "Debito", "82154821");
        System.out.println("\n--Tarjeta Orden 1--" + card.toString());

        Transferencia trans = new Transferencia(14000, f, "Santander", "23189432");
        System.out.println("\n--Transferencia Orden 1--" + trans.toString());

        Direccion c = new Direccion("Avenida Siempre viva #102");
        Cliente b = new Cliente("Franchesca", "1248124", c);
        Articulo teclado1 = new Articulo(1000, 8000, "Teclado", "gamer");
        Articulo teclado2 = new Articulo(1000, 9000, "Teclado", "oficina");
        DetalleOrden Teclado1 = new DetalleOrden(teclado1, 3);
        DetalleOrden Teclado2 = new DetalleOrden(teclado2, 2);
        OrdenCompra Orden2 = new OrdenCompra(b, f, "No pago");
        Orden2.addDetails(Teclado1);
        Orden2.addDetails(Teclado2);
        System.out.println(Orden2.toString());
        Efectivo num2 = new Efectivo(Orden2.calcPrecio(), 14000, f);
        System.out.println("\n--Se realiza un pago en efectivo--\n");
        System.out.println("Monto total:" + num2.monto + " " + num2.CalDevolucion());
        Boleta boleta2 = new Boleta("012346", b.getRut(), f, c, Orden2);
        System.out.println("\n--Boleta Orden 1--" + boleta2.toString());

    }
}
