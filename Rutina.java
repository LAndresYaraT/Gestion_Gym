public class Rutina {
    private String nombre;
    private String nivel;
    private int duracion;
    private Entrenador entrenador;

    public Rutina (String nombre,String nivel,int duracion){
        this.nombre=nombre;
        this.nivel=nivel;
        this.duracion=duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void asignarEntrenador (Entrenador entrenador){
        this.entrenador=entrenador;
    }

    public mostrarRutina(){
         System.out.println("rutina" + nombre);
         System.out.println("nivel"+ nivel);
         System.out.println("duracion" + duracion);

          if (entrenador != null) {
            System.out.println("entrenador" + entrenador.getnombre);
          }
          else {

          }
    }
 
}
