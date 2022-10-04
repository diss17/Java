package tarea01;
//Obtener fecha

import java.util.Date;
//Definicion de clases

class Cliente {

    private String name, id;

    //Constructor
    public Cliente() {
    }

    public void setNombre(String nombre) {
        this.name = nombre;
    }

    //Getter para nombre
    public String getNombre() {
        return name;
    }

    public void setRut(String rut) {
        this.id = rut;
    }

    //Getter para rut
    public String getRut() {
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

    public void setDirec(String direccion) {
        this.address = direccion;
    }

    //Getter para direccion
    public String getDirec() {
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

//  Class fran.
class Articulo {

    private float weight, money;
    private String nameUs, description;

    public Articulo() {
    }

    public void setPeso(float peso) {
        this.weight = peso;
    }

    public float getPeso() {
        return weight;
    }

    public void setPrecio(float precio) {
        this.money = precio;
    }

    public float getPrecio() {
        return money;
    }

    public void setNombre(String nombre) {
        this.nameUs = nombre;
    }

    public String getNombre() {
        return nameUs;
    }

    public void setDescripcion(String descripcion) {
        this.description = descripcion;
    }

    public String getDescripcion() {
        return description;
    }
}

class Pago {

    private float monto;
    Date fecha = new Date();

    public Pago() {
    }
}

class Efectivo extends Pago {

    public Efectivo() {
    }

    public float calcDevolucion(float dinero) {
        return dinero;
    }
}

class Tarjeta extends Pago {

    private String tipo;
    private String numTransaccion;

    public Tarjeta() {

    }

    public void setTipo(String type) {
        this.tipo = type;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNumT(String num) {
        this.numTransaccion = num;

    }

    public String getNumT() {
        return numTransaccion;
    }
}

class Transferencia extends Pago {

    private String banco;
    private String numCuenta;

    public Transferencia() {
    }

    public void setBank(String bank) {
        this.banco = bank;
    }

    public String getBank() {
        return banco;
    }

    public void setNumCuenta(String num) {
        this.numCuenta = num;
    }

    public String getNumCuenta() {
        return numCuenta;
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
        d.setNombre("Daniel");
        f.setRut("212272183");
        a.setDirec("Patio los callaos");
        System.out.println(d.getNombre() + " " + f.getRut() + " " + a.getDirec());
        System.out.println();
        //Tamo instanciando Articulo de pana.
        Articulo x = new Articulo();
        Articulo y = new Articulo();
        Articulo z = new Articulo();
        Articulo v = new Articulo();

        z.setPeso(7);
        v.setPrecio(12000);
        x.setNombre("Mouse");
        y.setDescripcion("Es rosado pinki barbie");
        System.out.println(x.getNombre() + " " + y.getDescripcion() + " pesa " + z.getPeso() + " y vale " + v.getPrecio() + " bella");
        System.out.println();

        //Instancia/Prueba metodos de pago
        /*
        Pago num1 = new Pago();
        Pago.Transferencia bank = num1.new Transferencia();
        String banco = bank.getBank("Santander");
        String cuenta = bank.getNumCuenta("12412451");
        System.out.println("Nombre del banco:" + banco + " " + "Numero de cuenta:" + cuenta);

        Pago num2 = new Pago();
        Pago.Efectivo money = num2.new Efectivo();
        float monto = money.calcDevolucion(-1100);
        System.out.println("Monto total:" + monto);

        Pago num3 = new Pago();
        Pago.Tarjeta card = num3.new Tarjeta();
        String tarjeta = card.getTipo("Credito");
        String numT = card.getNumT("5612824719854");
        System.out.println("Tipo de tarjeta:" + tarjeta + " " + "Numero de tarjeta:" + numT);

        //Probemos clase DetalleOrden
        Articulo c = new Articulo();
        Articulo.DetalleOrden cant = c.new DetalleOrden(3);
         */
    }
}
