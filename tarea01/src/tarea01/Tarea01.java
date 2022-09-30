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


//  Class fran.
class Articulo {

    private float pesoUn, money;
    private String nameUs, description;
    
    public Articulo() {
    }
    
    public float getPeso(float peso) {
        this.pesoUn = peso;
        return pesoUn;
    }

    public float getPrecio(float precio) {
        this.money = precio;
        return money;
    }

    public String getNombre(String nombre) {
        this.nameUs = nombre;
        return nameUs;
    }

    public String getDescripcion(String descripcion) {
        this.description = descripcion;
        return description;

    }

  
    
    class DetalleOrden extends Articulo{
        private int cantidad;
        public DetalleOrden(int c){
            c=cantidad;
            
        }
        public int total;
        public int iva;
        public int calcPrecio(int total){
            int moneyInt=Math.round(money);
            total=cantidad*moneyInt;
            return total;
        }

        public int calcIVA (int iva){
            iva=(19*total)/100;
            return iva;
        }
        
        public int calPrecioSinIVA(int totalSinIVA){
            //Calculamos el precio quitandole el IVA
            totalSinIVA=total-iva;
            return totalSinIVA;
        }
        
        public int calcPeso(int pesoTotal){
            //Calculamos el peso total
            int pesoInt=Math.round(pesoUn);
            pesoTotal=cantidad*pesoInt;
            return pesoTotal;
        }
    
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

    public Pago() {
    }

    class Efectivo extends Pago {

        public Efectivo() {
        }
        public float calcDevolucion(float dinero) {
            if (monto == dinero) {
                return 0;
            } else {
                return monto - dinero;
            }
        }
    }

    class Transferencia extends Pago {

        private String banco;
        private String numCuenta;

        public Transferencia() {
        }

        public String getBank(String bank) {
            this.banco = bank;
            return banco;
        }

        public String getNumCuenta(String num) {
            this.numCuenta = num;
            return numCuenta;
        }
    }
    class Tarjeta extends Pago{
        private String tipo;
        private String numTransaccion;
        public String getTipo(String type){
            this.tipo = type;
            return type;
        }
        public String getNumT(String num){
            this.numTransaccion = num;
            return numTransaccion;
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
        System.out.println();
        //Tamo instanciando Articulo de pana.
        Articulo x = new Articulo();
        Articulo y = new Articulo();
        Articulo z = new Articulo();
        Articulo v = new Articulo();

        float pesO = z.getPeso(7);
        float preciO = v.getPrecio(12000);
        String nombreArticulo = x.getNombre("Mouse");
        String descrip = y.getDescripcion("Es rosado pinki barbie");
        System.out.println(nombreArticulo + " " + descrip + " pesa " + pesO + " y vale " + preciO + " bella");
        System.out.println();
        
        
        //Instancia/Prueba metodos de pago
        Pago num1 = new Pago();
        Pago.Transferencia bank = num1.new Transferencia();
        String banco = bank.getBank("Santander");
        String cuenta = bank.getNumCuenta("12412451");
        System.out.println("Nombre del banco:" + banco + " " + "Numero de cuenta:" +cuenta);
        
        Pago num2 = new Pago();
        Pago.Efectivo money = num2.new Efectivo();
        float monto = money.calcDevolucion(-1100);
        System.out.println("Monto total:" + monto);
        
        Pago num3 = new Pago();
        Pago.Tarjeta card = num3.new Tarjeta();
        String tarjeta = card.getTipo("Credito");
        String numT = card.getNumT("5612824719854");
        System.out.println("Tipo de tarjeta:"+ tarjeta + " " + "Numero de tarjeta:"+ numT);
        
        //Probemos clase DetalleOrden
        Articulo c=new Articulo();
        Articulo.DetalleOrden cant=c.new DetalleOrden(3);
      
        
        
    }
}
