SMELL:
class Comprador{
    String nombres;
    String direccion;
    String telefono;

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}

class InfoHandler{
    private Comprador comprador;
    
    ...//otras funcionalidades
}


REFACTOR:
class Comprador{
    String nombres;
    String direccion;
    String telefono;

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String getResumenComprador(){
        return "Comprador: " + comprador.getNombres() + comprador.getDireccion()
                + comprador.getTelefono();
    }
    
}

class InfoHandler{
    private Comprador comprador;
    
        ...
        ...
}
