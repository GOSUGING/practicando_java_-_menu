
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Aron
 */
public class Menu {
    private final ArrayList<Instagram> listaUsuariosIg = new ArrayList<>();
    private final ArrayList<Twitter> listaUsuariosTw = new ArrayList<>();
    
    public void ejecutarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do{
            System.out.println("---- Menu ----");
            System.out.println("1. Ingresar a Instagram");
            System.out.println("2. Ingresar a Twitter");
            System.out.println("3. Mostrar Informacion");
            System.out.println("4. Salir");
            System.out.println("Selecciona una opcion: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1 -> ingrasarIg(scanner);
                case 2 -> ingresarTw(scanner);
                case 3 -> informacion();
                case 4 -> System.out.println("Estas saliendo de la aplicacion...");                    
                default -> System.out.println("Opcion no valida. Intentalo de nuevo.");                                 
            }            
        } while (opcion != 4);
        
        
    }

    private void ingrasarIg(Scanner scanner) {
        System.out.println("Ingrese id del usuario: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Ingrese el nombre de usuario de Instagram: ");
        String usuario = scanner.nextLine();
        
        System.out.println("Ingrese contraseña: ");
        String contrasena = scanner.nextLine();
        
        System.out.println("Ingrese la Historia: ");
        String historia = scanner.nextLine();
        
        System.out.println("Ingrese el estado (true para disponible, false para no disponible)");
        boolean estado = scanner.nextBoolean();
        scanner.nextLine();
        
        Instagram nuevoUsuarioIg = new Instagram(id, historia, estado, usuario, contrasena);
        listaUsuariosIg.add(nuevoUsuarioIg);
    
    
    }
    private void ingresarTw(Scanner scanner) {
         System.out.println("Ingrese id del usuario: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Ingrese el nombre de usuario de Twitter");
        String usuario = scanner.nextLine();
        
        System.out.println("Ingrese contraseña: ");
        String contrasena = scanner.nextLine();
        
        System.out.println("Ingrese la Noticia: ");
        String noticia = scanner.nextLine();
        
        System.out.println("Ingrese fecha (formato yyyy - MM - dd): ");
        String fechaTexto = scanner.nextLine();
        LocalDate fecha = null;
        scanner.nextLine();
        
        try {
            fecha = LocalDate.parse(fechaTexto);
        } catch (DateTimeParseException e) {
            System.out.println("Error formato de fecha invalido. Use el formato sugerido");
        }
        
        Twitter nuevoUsuarioTw = new Twitter(id, noticia, fecha, usuario, contrasena);
        
        listaUsuariosTw.add(nuevoUsuarioTw);
    }
    private void informacion() {
        System.out.println("----Informacion de Usuarios ----");
        
        if (listaUsuariosIg.isEmpty()) {
            System.out.println("No hay Usuarios de Instagram registrados.");
        } else {
            for (Instagram usuariosIg : listaUsuariosIg) {
                usuariosIg.mostrarInformacion();
                System.out.println();
            }
        }
        
        if(listaUsuariosTw.isEmpty()){
            System.out.println("No hay Usuarios de Twitter registrados.");
        } else {
            for (Twitter usuariosTw : listaUsuariosTw) {
                usuariosTw.mostrarInformacion();
                System.out.println();
                
            }
        }
        
    }
}
