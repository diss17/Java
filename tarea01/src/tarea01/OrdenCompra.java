package tarea01;

import java.util.Date;

public class OrdenCompra {
    private Date date;
    private String state;
    private Cliente client;
    private DocTributario documents;
    private DetalleOrden[] details;
    private Pago[] money;
    
    //Variables auxiliares.
    private int index=0;
    private float debt=0;
    
        
    public OrdenCompra(Cliente client,Date date,String state){ 
        this.client=client;
        this.date=date;
        this.state=state;
        this.details=new DetalleOrden[10];  //Instanciamos la lista de los varios Detalles.
        
    }
    
    public void addDetails(DetalleOrden detailss){
        if(index<details.length){ 
            details[index]=detailss; 
            index ++;
        }
               
        
    }
            
    public String State(){
        if(debt<=0){
            return state="PAGADO";
        }else{
            return state="NO PAGADO";
        }
    }
    
    public void setDebt(float debt){
        this.debt=debt;
    }
    public float getDebt(){
        return debt;
    }
    
        
    public float calcPrecioSinIva() {
        //Inicializamos la variable total.
        float total=0;
        for(int i=0; i<details.length;i++){
            if(details[i]!=null){ //
                total=details[i].calcPrecioSinIva()+total;
            }else{
                break;
                
            }
        }
        return total;
    }

    public float calcIva(int num) {
        float total=0;
        for(int i=0;i<details.length;++i){
            if(details[i]!=null){
                total=details[i].calcIVA();
            }else{
                break;
            }
        }
        return total;
    }

    public float calcPrecio() {
        float total=0;
        for(int i=0;i<details.length;++i){
            if(details[i]!=null){
            total=details[i].calcPrecio();
            }else{
                break;
            }
        }
        return total;
    }

    public float calcPeso() {
        float total=0;
        for(int i=0;i<details.length;++i){
            if(details[i]!=null){
                total=details[i].calcPeso()+total;
            }else{
                break;
            }
        }
        return total;
    }
    @Override
    public String toString(){
        return "Orden compra de "+this.client.getNombre()+"\n Fecha: "+this.date+"\n Estado: "+this.state;
    }  
    
}
