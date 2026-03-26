import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Entrenador entrenador1 = new Entrenador("Carlos Pérez", "123456789", 35, "carlos@gimnasio.com", "Musculación");
        Entrenador entrenador2 = new Entrenador("María López", "987654321", 28, "maria@gimnasio.com", "Cardio");
        Entrenador entrenador3 = new Entrenador("James Rodríguez", "456789123", 40, "james@gimnasio.com", "CrossFit");
        
        Rutina rutina1 = new Rutina("Rutina de Fuerza", "Intermedio", 45);
        Rutina rutina2 = new Rutina("Rutina de Cardio", "Principiante", 30);
        Rutina rutina3 = new Rutina("Rutina de CrossFit", "Avanzado", 60);
        
        System.out.println("Registro:");
        
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Documento: ");
        String documento = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Correo: ");
        String correo = scanner.nextLine();
        System.out.print("Código de miembro: ");
        String codigo = scanner.nextLine();
        
        Miembro miembro = new Miembro(nombre, documento, edad, correo, codigo);
        
        System.out.println("Seleccione entrenador:");
        System.out.println("1. " + entrenador1.getNombre() + " - " + entrenador1.getEspecialidad());
        System.out.println("2. " + entrenador2.getNombre() + " - " + entrenador2.getEspecialidad());
        System.out.println("3. " + entrenador3.getNombre() + " - " + entrenador3.getEspecialidad());
        System.out.print("Elija (1-3): ");
        int opcEntrenador = scanner.nextInt();
        
        Entrenador entrenadorSeleccionado = null;
        switch (opcEntrenador) {
            case 1: entrenadorSeleccionado = entrenador1; break;
            case 2: entrenadorSeleccionado = entrenador2; break;
            case 3: entrenadorSeleccionado = entrenador3; break;
            default: System.out.println("Opción inválida");
        }
        
        System.out.println("Seleccione rutina:");
        System.out.println("1. " + rutina1.getNombre() + " - " + rutina1.getNivel() + " - " + rutina1.getDuracion() + " min");
        System.out.println("2. " + rutina2.getNombre() + " - " + rutina2.getNivel() + " - " + rutina2.getDuracion() + " min");
        System.out.println("3. " + rutina3.getNombre() + " - " + rutina3.getNivel() + " - " + rutina3.getDuracion() + " min");
        System.out.print("Elija (1-3): ");
        int opcRutina = scanner.nextInt();
        
        Rutina rutinaSeleccionada = null;
        switch (opcRutina) {
            case 1: rutinaSeleccionada = rutina1; break;
            case 2: rutinaSeleccionada = rutina2; break;
            case 3: rutinaSeleccionada = rutina3; break;
            default: System.out.println("Opción inválida");
        }
        
        if (rutinaSeleccionada != null && entrenadorSeleccionado != null) {
            rutinaSeleccionada.asignarEntrenador(entrenadorSeleccionado);
        }
        else{
            System.out.println("Valor invalido");
        }

        System.out.println("Datos completos:");
        miembro.mostrarDatosMiembro();
        System.out.println();
        
        if (entrenadorSeleccionado != null) {
            entrenadorSeleccionado.mostrarDatosEntrenador();
        }
        System.out.println();
        
        if (rutinaSeleccionada != null) {
            rutinaSeleccionada.mostrarRutina();
        }
        scanner.close();
    }
}