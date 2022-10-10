package tarea01;

import java.util.Date;

class Pago {

    protected float monto;
    protected Date date;

    public Pago(float monto, Date fecha) {
        this.monto = monto;
        this.date = fecha;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public float getMonto() {
        return monto;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Monto: $" + this.monto + "\n Fecha: " + this.date;
    }
}

class Efectivo extends Pago{

    /* Cada tipo de pago tendrá sus propios métodos para hacer saber al cliente
    cuanto le corresponde de vuelto o cuanta deuda tiene.
    Trabajaremos directamente con una orden y modificaremos su variable deuda desde esta clase.
    */
    private float dinero;
    private float pagar;
    public String CalDevolucion(){
        if(dinero>pagar){
            return "Vuelto tras pago: "+String.valueOf(dinero-pagar) ;
        }else if(dinero<pagar){
            
            return "Deuda tras pago: "+String.valueOf(pagar-dinero);
        }else{
            return "No hay deuda tras pago";
        }

    }


    public Efectivo(float pagar, float dinero, Date date) {
        super(dinero, date);
        this.dinero= dinero;
        this.pagar = pagar;

    }
}

class Tarjeta extends Pago {

    private String tipo;
    private String numTransaccion;

    public Tarjeta(float monto, Date date, String tipo, String numTransaccion) {
        super(monto, date);
        this.tipo = tipo;
        this.numTransaccion = numTransaccion;
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

    @Override
    public String toString() {
        return "Pago en Tarjeta: " + super.toString() + "\n tipo: " + this.tipo + "\n y Numero de Transaccion: " + this.numTransaccion;
    }

}

class Transferencia extends Pago {

    private String banco;
    private String numCuenta;

    public Transferencia(float monto, Date date, String banco, String numCuenta) {
        super(monto, date);
        this.banco = banco;
        this.numCuenta = numCuenta;
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

    @Override
    public String toString() {
        return "Pago en Transferencia: " + super.toString() + "\n Banco: " + this.banco + "\n y Numero de cuenta: " + this.numCuenta;
    }
}
