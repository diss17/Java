package tarea01;
import java.util.Date;

class Pago {
    public abstract class Pago{
    protected float monto;
    protected Date date;
    
    public Pago(float monto,Date date) {
        this.monto=monto;
        this.date=date;
    }
    
    public void setMonto(float monto){
        this.monto=monto;
    }
    public float getMonto(){
        return monto;
    }
    public void setDate(Date date){
        this.date=date;
    }
    public Date getDate(){
        return date;
    }
    @Override
    public String toString(){
        return "Monto: $"+this.monto+"\n Fecha: "+this.date;
    }
}

class Efectivo extends Pago {

    public Efectivo(float monto,Date date) {
        super(monto,date);
    }

    public String calcDevolucion(float montoTotal) {
        if(this.monto>montoTotal){
            return "El vuelto es: $ "+String.valueOf(monto-montoTotal);
        }else if(this.monto<montoTotal){
            return "Le faltan: $"+String.valueOf(monto-montoTotal);       
        }else{
            return "Pagado";
        }
            
  
    }
}

class Tarjeta extends Pago {

    private String tipo;
    private String numTransaccion;

    public Tarjeta(float monto,Date date,String tipo,String numTransaccion) {
        super(monto,date);
        this.tipo=tipo;
        this.numTransaccion=numTransaccion; 
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
    public String toString(){
        return "Pago en Tarjeta: "+super.toString()+"\n tipo: "+this.tipo+"\n y Número de Transacción: "+this.numTransaccion;
    }
    
    
}

class Transferencia extends Pago {

    private String banco;
    private String numCuenta;

    public Transferencia(float monto,Date date,String banco,String numCuenta){
        super(monto,date);
        this.banco=banco;
        this.numCuenta=numCuenta;
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
    public String toString(){
        return "Pago en Transferencia: "+super.toString()+"\n Banco: "+this.banco+"\n y Número de cuenta: "+this.numCuenta;
    }
}
    
}
