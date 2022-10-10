package tarea01;
class Articulo {

    private float weight, money;
    private String name, description;

    public Articulo(float weight,float money,String name,String description) {
        this.weight=weight;
        this.money=money;
        this.name=name;
        this.description=description;
        
    }

    public void setPeso(float weight) {
        this.weight = weight;
    }

    public float getPeso() {
        return weight;
    }

    public void setPrecio(float money) {
        this.money = money;
    }

    public float getPrecio() {
        return money;
    }

    public void setNombre(String name) {
        this.name = name;
    }

    public String getNombre() {
        return name;
    }

    public void setDescripcion(String description) {
        this.description = description;
    }

    public String getDescripcion() {
        return description;
    }
    
    @Override
    public String toString(){
        return "Articulo: " +this.name+"\n Descripcion: "+this.description+"\n Peso:"+this.weight+"Kg."+"\n Precio: $"+this.money;
    }
}
