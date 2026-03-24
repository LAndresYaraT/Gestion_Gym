Public class Persona{

    private String nombre;
    private String documento;
    private int edad;
    private String correo;

    public Persona(nombre,documento,edad,correo){
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.correo = correo;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getDocumento(){
        return documento;
    }
    public void setDocumento(String documento){
        this.documento = documento;
    }

    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    public String getCorreo(){
        return correo;
    }
    public void setCorreo(String correo){
        this.correo = correo;
    }
}