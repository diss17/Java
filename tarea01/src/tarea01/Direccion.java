
package tarea01;

public class Direccion {
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
    
    @Override
    public String toString(){
        return "Dirección: "+this.address;
    }
    
}
