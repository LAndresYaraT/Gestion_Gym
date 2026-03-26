public class Miembro extends Persona {
    private String codigoMiembro;
    
    public Miembro(String nombre,String documento, int edad, String correo, String codigoMiembro) {
        super(nombre, documento, edad, correo);
        this.codigoMiembro = codigoMiembro;
    }

    public String getCodigoMiembro(){
        return codigoMiembro;
    }

    public void setCodigoMiembro(String codigoMiembro){
        this.codigoMiembro = codigoMiembro;
    }

    public void mostrarDatosMiembro() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Documento: " + getDocumento());
        System.out.println("Edad: " + getEdad());
        System.out.println("Correo: " + getCorreo());
        System.out.println("Código de Miembro: " + codigoMiembro);
    }
}