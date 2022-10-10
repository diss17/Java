package tarea01;

public class DetalleOrden {
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
    
    public float calcIVA() {
        return (articulo.getPrecio()*19/100)*cantidad;
    }

    public float calcPrecioSinIva() {
        return articulo.getPrecio()*cantidad;        
    }
    
    public float calcPrecio() {
        return this.calcPrecioSinIva()+this.calcIVA();
    }
    
    public float calcPeso() {
        return articulo.getPeso()*cantidad;
    }
    
    @Override
    public String toString(){
        return"Detalles de la orden: "+this.cantidad+" unidades de: "+articulo.getNombre();
        
    }
}
    

