SMELL:
class Persona{
    public String nombre;
    public String direccion;

}

class InfoHandler(){
    Persona p;
    ...
        p.nombre = "Juanito"...
        String zip = getZipCode(p.direccion)... 
    
    ...
        
}


REFACTOR:
class Persona{
    private String nombre;
    private String direccion;
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}

class InfoHandler(){
    Persona p;
    ...
        p.setNombre("Juanito")...
        String zip = getZipCode(p.getDireccion())... 
    
    ...
        
}