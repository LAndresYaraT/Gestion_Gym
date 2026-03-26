public class Entrenador extends Persona {
    private String especialidad;

    public Entrenador(String nombre, String documento, int edad, String correo, String especialidad) {
        super(nombre, documento, edad, correo);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void mostrarDatosEntrenador() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Documento: " + getDocumento());
        System.out.println("Edad: " + getEdad());
        System.out.println("Correo: " + getCorreo());
        System.out.println("Especialidad: " + especialidad);
    }
}