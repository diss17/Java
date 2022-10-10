
package tarea01;

import java.util.Date;

public class DocTributario {
    private String number;
    private String id;
    private Date date;
    private Direccion address;
    private OrdenCompra order;
    
    public DocTributario(String number,String id,Date date,Direccion address,OrdenCompra order){
        this.number=number;
        this.id=id;
        this.date=date;
        this.address=address;
        this.order=order;
        
    }
    //Creamos los getter y setter necesarios por cada informacion segun UML que debe llevar.
    public void setDatosCliente(String number,String id){
        this.number=number;
        this.id=id;
    }
    public String getDatosCliente(){
        return number+id;
    }
    public void setDate(Date date){
        this.date=date;
    }
    public Date getDate(){
        return date;
    }
    public void setAddress(Direccion address){
        this.address=address;
    }
    public Direccion getAddress(){
        return address;
    }
    public void setOrder(OrdenCompra order){
        this.order=order;
    }
    public OrdenCompra getOrder(){
        return order;
    }
    
    //Unimos toda la informacion con toString.
    @Override
    public String toString(){
        return "-Informacion cliente- Numero: "+number+"\n R.U.T: "+id+"\n Fecha: "+date+"\n Direccion: "+address;
        
    }
}

class Factura extends DocTributario {
     public Factura(String number, String id, Date date, Direccion address, OrdenCompra order) {
        super(number, id, date, address,order);
    }
     
    @Override
    public String toString(){
        return super.toString();
    }

}

class Boleta extends DocTributario{
    public Boleta(String number, String id, Date date, Direccion address, OrdenCompra order) {
        super(number, id, date, address,order);
    }
     @Override
    public String toString(){
        return super.toString();
    }
    
}
