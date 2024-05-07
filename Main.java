import java.util.Scanner;

class Cliente {
    private int cedula;
    private String nombre;
    private String apellido;
    private String email;
    private int telefono;
    private String pais;

    public Cliente(int cedula, String nombre, String apellido, String email, int telefono, String pais) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.pais = pais;
    }

    public int getcedula() {
        return cedula;
    }

    public void setcedula(int cedula) {
        this.cedula = cedula;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getapellido() {
        return apellido;
    }

    public void setapellido(String apellido) {
        this.apellido = apellido;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public int gettelefono() {
        return telefono;
    }

    public void settelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getpais() {
        return pais;
    }

    public void setpais(String pais) {
        this.pais = pais;
    }

}

class Reserva {
    private String habitacion;
    private String buffets;
    private String salon;

    public Reserva(String habitacion, String buffets, String salon) {
        this.habitacion = habitacion;
        this.buffets = buffets;
        this.salon = salon;
    }

    public Reserva(int opcionHabitacion) {
    }
}

class Empleado {
    private int cedula;
    private String nombre;
    private String email;
    private String cargo;

    public Empleado(int cedula, String nombre, String email, String cargo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.email = email;
        this.cargo = cargo;

    }

    public int getcedula() {
        return cedula;
    }

    public void setcedula(int cedula) {
        this.cedula = cedula;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getcargo() {
        return cargo;
    }

    public void setcargo(String cargo) {
        this.cargo = cargo;
    }

}

public class Main {
    public static void main(String[] args) {
        limpiarPantalla();
        // Menu
        Scanner entrada = new Scanner(System.in);
        Empleado[] empleados = new Empleado[10];
        Cliente[] clientes = new Cliente[5];
        Reserva[] reservas = new Reserva[10];
        int cantidadClientes = 0;
        int cantidadEmpleados = 0;
        int cantidadReservas = 0;
        int opcion;

        do {
            System.out.println("Menú");
            System.out.println("1. Gestionar empleados");
            System.out.println("2. Gestionar clientes");
            System.out.println("3. Gestionar Reserva");
            System.out.println("4. Salir");
            System.out.println("Digite una opcion");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    gestionarEmpleados(empleados, cantidadEmpleados, entrada);
                    break;

                case 2:
                    gestionarClientes(clientes, cantidadClientes, entrada);
                    break;

                case 3:
                    gestionarReserva(reservas, clientes, cantidadReservas, cantidadClientes, entrada);

                    break;

                case 4:
                    break;

                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        } while (true);

    }

    public static void limpiarPantalla() {
        try {
            ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
            Process startProcess = pb.inheritIO().start();
            startProcess.waitFor();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void pausa(Scanner entrada) {

        entrada.nextLine();
        System.out.println("\t\nPresione enter para continuar");
        entrada.nextLine();
    }

    public static void gestionarEmpleados(Empleado[] empleados, int cantidadEmpleados, Scanner entrada) {
        do {
            System.out.println("1. Añadir empleados");
            System.out.println("2. Listar empleados");
            System.out.println("3. Modificar empleados");
            System.out.println("4. Eliminar empleados");
            System.out.println("5. Salir");
            System.out.println("  Digite una opción");
            int opcionGestion = entrada.nextInt();
            System.out.println("");

            switch (opcionGestion) {
                case 1:
                    if (cantidadEmpleados < empleados.length) {
                        guardarEmpleados(empleados, cantidadEmpleados, entrada);
                        cantidadEmpleados++;
                    } else {
                    }
                    break;
                case 2:
                    listarEmpleados(empleados, cantidadEmpleados);
                    break;
                case 3:
                    modificarEmpleado(empleados, cantidadEmpleados, entrada);
                    break;
                case 4:
                    eliminarEmpleado(empleados, cantidadEmpleados, entrada);
                    break;
                case 5:

                    break;
                default:
                    break;
            }

        } while (true);
    }

    public static void guardarEmpleados(Empleado[] empleados, int cantidadEmpleados, Scanner entrada) {
        System.out.println("");
        System.out.print("Digite su cedula: ");
        int cedula = entrada.nextInt();

        System.out.print("Digite su nombre: ");
        String nombre = entrada.next();

        System.out.print("Digite su correo: ");
        String correo = entrada.next();

        System.out.print("Digite su cargo: ");
        String cargo = entrada.next();

        empleados[cantidadEmpleados] = new Empleado(cedula, nombre, correo, cargo);
        System.out.println(" Guardado con exito!");
        System.out.println("");
    }

    public static void listarEmpleados(Empleado[] empleados, int cantidadEmpleados) {
        System.out.println("");
        System.out.println("======Lista de empleados======");
        if (cantidadEmpleados <= 0) {

            System.out.println("No hay empleados");
            System.out.println();

        }

        for (int i = 0; i < cantidadEmpleados; i++) {
            if (empleados[i] != null) {
                System.out.println("Nombre: " + empleados[i].getnombre());
                System.out.println("Cedula: " + empleados[i].getcedula());
                System.out.println("Email: " + empleados[i].getemail());
                System.out.println("Cargo: " + empleados[i].getcargo());
                System.out.println();

            }

        }
    }

    public static void modificarEmpleado(Empleado[] empleados, int cantidadEmpleados, Scanner entrada) {
        System.out.println();
        System.out.println("Digite la cedula a modificar : ");
        int Cedula = entrada.nextInt();
        for (int i = 0; i < cantidadEmpleados; i++) {
            // Verificar si existe
            if (empleados[i].getcedula() == Cedula) {
                System.out.print("Digite su cedula: ");
                int nuevaCedula = entrada.nextInt();

                System.out.print("Digite su nombre: ");
                String nuevoNombre = entrada.next();

                System.out.print("Digite su correo: ");
                String nuevoCorreo = entrada.next();

                System.out.print("Digite su cargo: ");
                String nuevoCargo = entrada.next();

                empleados[i].setcedula(nuevaCedula);
                empleados[i].setnombre(nuevoNombre);
                empleados[i].setemail(nuevoCorreo);
                empleados[i].setcargo(nuevoCargo);

                System.out.println("Modificado con exito!");
                return;
            }

        }

    }

    public static void eliminarEmpleado(Empleado[] empleados, int cantidadEmpleados, Scanner entrada) {
        System.out.print("Digite la cedula a eliminar: ");
        int nuevaCedula = entrada.nextInt();

        for (int i = 0; i < cantidadEmpleados; i++) {
            if (empleados[i].getcedula() == nuevaCedula) {
                for (int j = i; j < cantidadEmpleados - 1; j++) {
                    empleados[j] = empleados[j + 1];
                }
                empleados[cantidadEmpleados - 1] = null; // Ajusta la última posición del arreglo
                cantidadEmpleados--;
                System.out.println("Empleado eliminado!");
                System.out.println();
                return;
            }
        }

    }

    public static void gestionarClientes(Cliente[] clientes, int cantidadClientes, Scanner entrada) {
        do {
            System.out.println("1. Añadir cliente");
            System.out.println("2. Listar clientes");
            System.out.println("3. Modificar clientes");
            System.out.println("4. Eliminar clientes");
            System.out.println("5. Salir");
            System.out.println("  Digite una opción");
            int opcionGestion = entrada.nextInt();
            System.out.println("");

            switch (opcionGestion) {
                case 1:
                    guardarClientes(clientes, cantidadClientes, entrada);

                    break;
                case 2:
                    listarClientes(clientes, cantidadClientes);
                    break;
                case 3:
                    modificarClientes(clientes, cantidadClientes, entrada);
                    break;
                case 4:
                    eliminarClientes(clientes, cantidadClientes, entrada);
                    break;
                case 5:
                    return;
                default:

                    break;
            }

        } while (true);
    }

    public static void guardarClientes(Cliente[] clientes, int cantidadClientes, Scanner entrada) {
        System.out.println();
        System.out.print("Digite su cedula: ");
        int cedula = entrada.nextInt();

        System.out.print("Digite su nombre: ");
        String nombre = entrada.next();

        System.out.print("Digite su apellido: ");
        String apellido = entrada.next();

        System.out.print("Digite su email: ");
        String email = entrada.next();

        System.out.print("Digite su numero celular: ");
        int celular = entrada.nextInt();

        System.out.print("Digite su pais de residencia: ");
        String pais = entrada.next();

        clientes[cantidadClientes] = new Cliente(cedula, nombre, apellido, email, celular, pais);
        System.out.println("¡Cliente añadido con exito!");
        System.out.println();

    }

    public static void listarClientes(Cliente[] clientes, int cantidadClientes) {
        System.out.println();
        System.out.println("================ Lista de clientes ================");

        if (cantidadClientes <= 0) {
            System.out.println("No hay clientes");
            System.out.println();
        }
        for (int i = 0; i < cantidadClientes; i++) {
            if (clientes[i] != null) {
                System.out.println("Nombre :" + clientes[i].getnombre());
                System.out.println("Apellido :" + clientes[i].getapellido());
                System.out.println("Cedula :" + clientes[i].getcedula());
                System.out.println("Email :" + clientes[i].getemail());
                System.out.println("Telefono :" + clientes[i].gettelefono());
                System.out.println("Pais de residencia :" + clientes[i].getpais());
                System.out.println();

            }

        }

    }

    public static void modificarClientes(Cliente[] clientes, int cantidadClientes, Scanner entrada) {
        System.out.println();
        System.out.print("Digite la cedula del cliente que desea modificar: ");
        int Cedula = entrada.nextInt();

        for (int i = 0; i < cantidadClientes; i++) {
            // Verificar si existe
            if (clientes[i].getcedula() == Cedula) {
                System.out.print("Digite la nueva cedula: ");
                int nuevoCedula = entrada.nextInt();

                System.out.print("Digite el nuevo nombre: ");
                String nuevoNombre = entrada.next();

                System.out.print("Digite el nuevo apellido: ");
                String nuevoApellido = entrada.next();

                System.out.print("Digite su nuevo email: ");
                String nuevoEmail = entrada.next();

                System.out.print("Digite su nuevo numero celular: ");
                int nuevoCelular = entrada.nextInt();

                System.out.print("Digite su nuevo pais de residencia");
                String nuevoPais = entrada.next();

                clientes[i].setcedula(nuevoCedula);
                clientes[i].setnombre(nuevoNombre);
                clientes[i].setapellido(nuevoApellido);
                clientes[i].setemail(nuevoEmail);
                clientes[i].settelefono(nuevoCelular);
                clientes[i].setpais(nuevoPais);
                System.out.println("¡Modificado con exito!");
                return;
            }

        }
    }

    public static void eliminarClientes(Cliente[] clientes, int cantidadClientes, Scanner entrada) {
        System.out.println("Digite la cedula a eliminar: ");
        int nuevaCedula = entrada.nextInt();

        for (int i = 0; i < cantidadClientes; i++) {
            if (clientes[i].getcedula() == nuevaCedula) {
                for (int j = i; j < cantidadClientes - 1; j++) {
                    clientes[j] = clientes[j + 1];
                }
                clientes[cantidadClientes - 1] = null;
                cantidadClientes--;
                System.out.println("Cliente eliminado!");
                System.out.println();
                return;
            }
        }

    }

    private static void gestionarReserva(Reserva[] reservas, Cliente[] clientes, int cantidadReservas,
            int cantidadClientes, Scanner entrada) {
        System.out.println("Digite su numero de cedula: ");
        int cc = entrada.nextInt();
        Cliente clienteReserva = null;

        do {
            System.out.println("1. Añadir reserva");
            System.out.println("2. Listar reserva");
            System.out.println("3. modificar reserva");
            System.out.println("4. Eliminar reserva");
            System.out.println("5. Salir");
            System.out.println(" Digite una opcion");
            int opcionGestion = entrada.nextInt();
            System.out.println("");

            switch (opcionGestion) {
                case 1:
                    if (cantidadReservas < reservas.length) {
                        guardarReserva(reservas, cantidadReservas, entrada);
                        cantidadReservas++;
                    } else {

                    }
                    break;
                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    return;

                default:
                    break;
            }

        } while (true);

    }

    public static void guardarReserva(Reserva[] reservas, int cantidadReservas, Scanner entrada) {
        System.out.println();

        do {
            System.out.println("    SERVICIOS A RESERVAR  ");
            System.out.println();
            System.out.println("1. Reserva de habitaciones");
            System.out.println("2. Reserva de Buffets");
            System.out.println("3. Reserva de Salon de eventos");
            System.out.println("4. Salir");
            System.out.println();
            System.out.println("Seleccione una opcion");
            int opcionReserva = entrada.nextInt();

            switch (opcionReserva) {
                case 1:
                    habitaciones(reservas, cantidadReservas, null, cantidadReservas, opcionReserva, entrada);
                    break;

                case 2:
                    buffets(entrada);
                    break;

                case 3:
                    salon(entrada);
                    break;
                case 4: 
                return;

            }

        } while (true);

    }

   

    public static void habitaciones(Reserva[] reservas, int cantidadReservas, Cliente[]clientes, int cantidadClientes,int opcionReserva, Scanner entrada ){
        do {
            System.out.println("     HABITACIONES      ");
            System.out.println();
            System.out.println("1. Habitacion personal");
            System.out.println("2. Habitacion matrimonial");
            System.out.println("3. Habitacion familiar");
            System.out.println("4. Salir");
            System.out.println();
            System.out.println("Seleccione una opcion");
            int opcionHabitacion = entrada.nextInt();
            
            reservas[cantidadReservas] = new Reserva(opcionReserva);
            System.out.println("Reserva añadida con exito!");
            System.out.println();


            switch (opcionHabitacion) {
                case 1:
                  return;
                  
                

                case 2:
                    break;

            }

        } while (true);
    }

    public static void buffets(Scanner entrada) {
        do {
            System.out.println("     SALON DE EVENTOS      ");
            System.out.println();
            System.out.println("1. Buffet servicio a la mesa");
            System.out.println("2. Buffet autoservicio");
            System.out.println("3. Salir");
            System.out.println();
            int opcionSalon = entrada.nextInt();

            switch (opcionSalon) {
                case 1:
                    System.out.println("---------FACTURA--------");
                    System.out.println("Cliente:");
                    break;

                default:
                    break;

            }

        } while (true);

    }

    public static void salon(Scanner entrada) {
        do {
            System.out.println("     SALON DE EVENTOS      ");
            System.out.println();
            System.out.println("1. Para conferencia de trabajos");
            System.out.println("2. salon de eventos sociales");
            int opcionSalon = entrada.nextInt();

            switch (opcionSalon) {
                case 1:
                    break;
            }

        } while (true);

    }
    public static void listarReserva(Reserva[] reservas, int cantidadReservas){
        System.out.println();
        System.out.println("LISTA RESERVA");
        if (cantidadReservas <= 0){

            System.out.println("No hay reservas");
            System.out.println();

        }
        for(int i = 0; i < cantidadReservas; i++){
            if (reservas[i] != null) {
                System.out.println("reserva: " + reservas[i]());
                
            }


        }

    }
}
