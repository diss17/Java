package tarea01;
public class Cliente {
    private String name, id;
    //Segun UML le debemos asignar la dirección en cliente.
    private Direccion address;
    public Cliente(String name, String id, Direccion address) {
        this.name=name;
        this.id=id;
        this.address=address;  
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

    
    @Override
    public String toString(){
        return "Datos del cliente: "+this.name+"\n R.U.T: "+this.id+"\n Dirección: "+this.address;
    }
    
}
