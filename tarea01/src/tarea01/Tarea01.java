package tarea01;
//Obtener fecha

import java.util.Date;

//Definicion de clases



//Main feo.
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
