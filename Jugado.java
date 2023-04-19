package jugado;


public class Jugado {
    

    public Jugado(String cedula, String nombre, String apellido, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

public void setCedula(String cedula){
    this.cedula = cedula;
}

public void setNombre(String nombre){
    this.nombre = nombre;
}

public void setApellido(String apellido){
    this.apellido = apellido;
}

public void setEdad(int edad){
    this.edad = edad;
}    
    private String cedula;
    private String nombre;
    private String apellido;
    private int edad;    
    
public void caminar(){ 
    System.out.println ("Hacer caminar a jugador");
}

public void correr(){
    System.out.println ("Hacer correr a jugador");
}

public void viajar(){
    System.out.println ("Hacer viajar a jugador");
} 
        
    }
    
