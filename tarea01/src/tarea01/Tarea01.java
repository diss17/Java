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
    public Direccion(String address) {
        this.address=address;
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

    public float calcPrecio() {
        return 0;
    }

    public int calcPeso() {
        return 0;
    }

}

class DetalleOrden {
    private int cantidad;
    Articulo articulo;
    
    public DetalleOrden(Articulo articulo,int cantidad) {
        this.articulo=articulo;
        this.cantidad=cantidad;
    }
    
    public void setCant(int cant){
        this.cantidad=cant;
    }
    
    public int getCant(){
        return cantidad;
    }

    public float calcPrecio() {
        return articulo.getPrecio()*cantidad;
    }

    public float calcPrecioSinIva() {
        return articulo.getPrecio()*cantidad-calcIVA();        
    }

    public float calcIVA() {
        return articulo.getPrecio()*cantidad*19/100;
    }

    public float calcPeso() {
        return articulo.getPeso()*cantidad;
    }
}
//  Class fran.

class Articulo {

    private float weight, money;
    private String nameUs, description;

    public Articulo(float weight,float money,String nameUs,String description) {
        this.weight=weight;
        this.money=money;
        this.nameUs=nameUs;
        this.description=description;
        
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

    protected float monto;
    Date fecha = new Date();

    public Pago() {
    }
}

class Efectivo extends Pago {

    public Efectivo() {

    }

    public float calcDevolucion(float dinero) {
        float total = this.monto - dinero;
        return total;
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

class Factura extends DocTributario {
     public Factura() {
    }

}

class Boleta extends DocTributario{
     public Boleta() {
    }
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
        Articulo g = new Articulo();
        m.calcPrecio();
        z.setPeso(7);
        v.setPrecio(12000);
        g.setPrecio(3000);
        x.setNombre("Mouse");
        y.setDescripcion("Es rosado pinki barbie");
        System.out.println(x.getNombre() + " " + y.getDescripcion() + " pesa " + z.getPeso() + " y vale " + v.getPrecio() + " bella");
        System.out.println();
        System.out.println(m);
        //Instancia/Prueba metodos de pago

        Transferencia bank = new Transferencia();
        bank.setBank("Santander");
        bank.setNumCuenta("12412451");
        System.out.println("Nombre del banco:" + bank.getBank() + " " + "Numero de cuenta:" + bank.getNumCuenta());

        Efectivo num2 = new Efectivo();
        float monto = num2.calcDevolucion(-1100);
        System.out.println("Monto total:" + monto);

        Tarjeta num3 = new Tarjeta();
        num3.setTipo("Credito");
        num3.setNumT("5612824719854");
        System.out.println("Tipo de tarjeta:" + num3.getTipo() + " " + "Numero de tarjeta:" + num3.getNumT());

        //Probemos clase DetalleOrden
        Articulo c = new Articulo();

    }
}
