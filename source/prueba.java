import java.util.Scanner;

public class prueba {
    // Carlos hackeo a luz dary

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String inforUser[][] = new String[100][4];
        String userSesion[][] = new String[100][2];

        int userCount = 0;
        int userSesionCount = 0;
        int opcionHotel, opcionHabitacion, opcionRestaurante, opcionServicio, opcionEvento, opcionSalonVIP,opcionConfirmacion;
        String bup = null;
        String nombreuser, apellido, cedula;
        String hotel;

        String usuarioInicio = ""; 
        String ContraseñaInicio = ""; 
        int contador = 0;
        String user[] = new String[100000];

        do {
            System.out.println("--------------------------");
            System.out.println("-        HOTELES         -");
            System.out.println("--------------------------");
            System.out.println("1. Hotel Svenish.");
            System.out.println("2. Hotel Seaside.");
            System.out.println("3. Hotel Astoria.");
            System.out.println("4. Salir");
            System.out.println();
            System.out.println("Seleccione el hotel que desea.");

            do {

                bup = entrada.nextLine();

            } while (!isInteger(bup));

            opcionHotel = Integer.parseInt(bup);

            switch (opcionHotel) {

                case 1:
                    System.out.println("--------------------------");
                    System.out.println("-     HOTEL SVENISH      -");
                    System.out.println("--------------------------");
                    System.out.println();

                    if (contador < user.length) {

                        System.out.print("Ingresa tu CC: ");
                        String CC = entrada.next();
                        System.out.print("Ingresa tu nombre: ");
                        String nombre = entrada.next();
                        System.out.print("Ingresa tu email: ");
                        String email = entrada.next();

                        inforUser[userCount][0] = CC;
                        inforUser[userCount][1] = nombre;
                        inforUser[userCount][2] = email;

                        System.out.println("Agregado correctamente!");

                        userSesion[userSesionCount][0] = CC;
                        userSesion[userSesionCount][1] = email;
                        userSesionCount++;

                    } else {
                        System.out.println("No eres tu, somos nosotros");

                    }
                    do {
                        System.out.println();
                        System.out.println("SERVICIOS");
                        System.out.println();

                        System.out.println("1. Reserva de habitaciones.");
                        System.out.println("2. Reserva de restaurantes");
                        System.out.println("3. Reserva de eventos.");
                        System.out.println("4. Salir");
                        System.out.println();
                        System.out.println("Ingrese una opción.");
                        opcionServicio = entrada.nextInt();

                        // aquiluz

                        switch (opcionServicio) {

                            case 1:
                                System.out.println();
                                System.out.println("HABITACIONES");
                                System.out.println();

                                do {
                                    System.out.println("Seleccione el tipo de habitación:");
                                    System.out.println("1. Habitacion Personal.");
                                    System.out.println("2. Habitacion Matrimonial");
                                    System.out.println("3. Habitacion para 3 personas");
                                    System.out.println("4. Habitacion Familiar");
                                    System.out.println("5. Regresar a menú anterior");
                                    System.out.println();
                                    System.out.println("Ingrese una opcion");
                                    opcionHabitacion = entrada.nextInt();

                                    switch (opcionHabitacion) {
                                        case 1:
                                            System.out.println("Habitacion personal ha sido reservada");
                                            System.out.println("Habitacion 101");
                                            System.out.println("El precio es de: COP 120000");
                                            double HabitacionPersonal = 120000;
                                            System.out.println();
                                            break;
                                        case 2:
                                            System.out.println("Habitacion matrimonial ha sido reservada");
                                            System.out.println("Habitacion 201");
                                            System.out.println("El precio es de: COP 270000");
                                            double HabitacionMatrimonial = 270000;
                                            break;
                                        case 3:
                                            System.out.println("Habitacion para 3 ha sido reservada");
                                            System.out.println("Habitacion 301");
                                            System.out.println("El precio es de: COP 340000");
                                            double Habitacion3Personas = 340000;
                                            break;
                                        case 4:
                                            System.out.println("Habitacion familiar ha sido reservada");
                                            System.out.println("El precio es de: COP 570000");
                                            double HabitacionFamiliar = 570000;
                                            break;
                                        case 5:

                                            break;
                                    }

                                } while (opcionHabitacion != 5);
                                break;

                            // HABITACIONES FIN

                            case 2:
                                System.out.println("RESTAURANTE");
                                boolean mostrarMenuComidas = true;

                                do {
                                    if (mostrarMenuComidas) {
                                        System.out.println("Desea su comida para: ");
                                        System.out.println("1. Desayuno");
                                        System.out.println("2. Almuerzo");
                                        System.out.println("3. Cena");
                                        System.out.println("4. Salir");
                                    }
                                    opcionRestaurante = entrada.nextInt();

                                    switch (opcionRestaurante) {
                                        case 1:
                                            System.out.println("DESAYUNO");
                                            System.out.println( "1. Ensalada griega de tomate, pepino, aceitunas y queso feta.");
                                            System.out.println("2. Huevos revueltos con tocino");
                                            System.out.println("3. Tostadas con aceite de oliva y tomate");
                                            System.out.println("4. Rollitos de primavera de vegetales");
                                            System.out.println("5. Regresar al menu. ");
                                            System.out.println("Seleccione la comida:");

                                            int Desayuno = entrada.nextInt();

                                            switch (Desayuno) {
                                                case 1:
                                                    System.out.println("Precio es: 50000");
                                                    double precio1 = entrada.nextDouble();

                                                    break;
                                                case 2:
                                                    System.out.println("Precio es: 50000");
                                                    double precio2 = entrada.nextDouble();
                                                    break;

                                                case 3:
                                                    System.out.println("Precio es: 50000");
                                                    double precio3 = entrada.nextDouble();

                                                    break;

                                                case 4:
                                                    System.out.println("Precio es: 50000");
                                                    double precio4 = entrada.nextDouble();
                                                    break;

                                                case 5:

                                                    break;

                                                default:
                                                    System.out.println("La opción seleccionada no esta disponible!");

                                                    break;
                                            }

                                            break;
                                        case 2:
                                            System.out.println("ALMUERZO");
                                            System.out.println("1. Risotto de champiñones");
                                            System.out.println("2. Pollo al curry con arroz y guisantes");
                                            System.out.println("3. Tacos de pollo con salsa de cilantro y cebolla.");
                                            System.out.println("4. Arroz con pescado y ensalada de payaso");
                                            int Almuerzo = entrada.nextInt();

                                            int almuerzo = entrada.nextInt();

                                            switch (almuerzo) {
                                                case 1:
                                                    System.out.println("Precio es: 47000");
                                                    double precio1Almuerzo = entrada.nextDouble();

                                                    break;
                                                case 2:
                                                    System.out.println("Precio es: 67000");
                                                    double precio2Almuerzo = entrada.nextDouble();
                                                    break;

                                                case 3:
                                                    System.out.println("Precio es: 70000");
                                                    double precio3Almuerzo = entrada.nextDouble();
                                                    break;

                                                case 4:
                                                    System.out.println("Precio es: 81000");
                                                    double precio4Almuerzo = entrada.nextDouble();
                                                    break;

                                                case 5:

                                                    break;
                                                default:
                                                    System.out.println("La opción seleccionada no esta disponible!");

                                                    break;
                                            }

                                            break;

                                        case 3:
                                            System.out.println("CENA");
                                            System.out.println("1. Pasta carbonada.");
                                            System.out.println("2. Salmón a la parrilla con salsa de limón y eneldo.");
                                            System.out.println("3. Pollo al horno con hierbas y limón. ");
                                            System.out.println("4. Sushi rolls de salmón y aguacate. ");
                                            int Cena = entrada.nextInt();

                                            int cena = entrada.nextInt();

                                            switch (cena) {
                                                case 1:
                                                    System.out.println("Precio es: 47000");
                                                    double precio1cena = entrada.nextDouble();

                                                    break;
                                                case 2:
                                                    System.out.println("Precio es: 67000");
                                                    double precio2cena = entrada.nextDouble();
                                                    break;

                                                case 3:
                                                    System.out.println("Precio es: 70000");
                                                    double precio3cena = entrada.nextDouble(); 

                                                    break;

                                                case 4:
                                                    System.out.println("Precio es: 81000");
                                                    double precio4cena = entrada.nextDouble(); 
                                                    break;

                                                case 5:

                                                    break;

                                                default:
                                                    System.out.println("La opción seleccionada no esta disponible!");

                                                    break;
                                            }

                                            break;

                                        case 4:
                                            System.out.println("¡Ha salido con exito!");
                                            System.out.println("Vuelva pronto.");
                                            mostrarMenuComidas = false;
                                            break;
                                        default:
                                            System.out.println("Ingrese una opcion valida");
                                            break;
                                    }

                                } while (opcionRestaurante != 4);
                                break;

                            
                            case 3:
                                System.out.println("EVENTOS");
                                System.out.println();
                                do {
                                    System.out.println("Seleccione el tipo de salón de evento:");
                                    System.out.println("1. Salón VIP - Ejecutivos");
                                    System.out.println("2. Salón de Reuniones");
                                    System.out.println("3. Salón de banquetes");
                                    System.out.println("4. Salón de Conferencias o convenciones");
                                    System.out.println("5. Salón de fistas o eventos sociales");
                                    System.out.println("6. Salir. ");
                                    System.out.println();
                                    System.out.println("Ingrese una opcion");
                                    opcionEvento = entrada.nextInt();

                                    switch (opcionEvento) {
                                        case 1:
                                            System.out.println("Salones disponibles: ");
                                            System.out.println();
                                            System.out.println("1) SALÓN 202");
                                            System.out.println("   Capacidad maxima: 70 personas ");
                                            System.out.println("   Precio: COP 1.000.000");
                                            System.out.println("   Tiempo maximo: 14 horas");
                                            System.out.println();
                                            System.out.println("2) SALÓN 204 ");
                                            System.out.println("   capacidad maxima: 40 personas");
                                            System.out.println("   Precio: COP 700.000");
                                            System.out.println("   Tiempo maximo: 12 horas");
                                            System.out.println();
                                            System.out.println("Seleccione una opción");
                                            opcionSalonVIP = entrada.nextInt();

                                            switch (opcionSalonVIP) {
                                                case 1:
                                                System.out.println("¿Desea reservar el salon 202?");
                                                System.out.println("La reserva no podrá revertirse.");
                                                System.out.println();
                                                System.out.println("1) Si");
                                                System.out.println("2) No");
                                                System.out.println("Digite la opción");
                                                opcionConfirmacion= entrada.nextInt();

                                                 switch (opcionConfirmacion) {
                                                    case 1:
                                                    System.out.println();
                                                    System.out.println("¡El salón 202 ha sido reservado con exito!");
                                                    System.out.println();

                                                        break;
                                                        case 2:
                                                        System.out.println();
                                                        System.out.println("Reserva cancelada");
                                                        break;
            
                                                    default:
                                                    System.out.println("Opcion invalida");
                                                        break;
                                                 }
                                                    break;
                                            
                                                default:
                            
                                                    break;

                                                case 2:
                                                System.out.println("¿Desea reservar el salón 204?");
                                                System.out.println("La reserva no podra revertirse.");
                                                System.out.println();
                                                System.out.println("1) Si");
                                                System.out.println("2) No");
                                                System.out.println("Digite una opción");
                                                opcionConfirmacion=entrada.nextInt();
                                                switch (opcionConfirmacion) {
                                                    case 1:
                                                    System.out.println("El salón 204 ha sido reservado con exito");
                                                        
                                                        break;
                                                
                                                    default:
                                                        break;
                                                }


                                            }

                                           


                                            break;











                                        case 2:
                                            System.out.println();
                                            System.out.println();
                                            System.out.println();
                                            System.out.println();
                                            System.out.println();
                                            System.out.println();
                                            break;

                                        case 3:
                                            System.out.println();
                                            System.out.println();
                                            System.out.println();
                                            System.out.println();
                                            System.out.println();
                                            System.out.println();
                                            break;

                                        case 4:
                                            System.out.println();
                                            System.out.println();
                                            System.out.println();
                                            System.out.println();
                                            System.out.println();
                                            System.out.println();
                                            break;

                                        case 5:
                                            System.out.println("Regresando al menu anterior...");
                                            break;
                                    }

                                } while (opcionEvento != 6);
                                break;

                        }

                    } while (opcionServicio != 4);
                    break;

                case 2:
                    System.out.println("--------------------------");
                    System.out.println("-     HOTEL SEASIDE      -");
                    System.out.println("--------------------------");
                    System.out.println();

                    break;

                case 3:
                    System.out.println("Hotel Astoria");
                    System.out.println("");
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    System.out.println("Has salido del programa");
                    break;

                default:
                    System.out.println("Opción invalida");
                    break;
            }
        } while (opcionHotel != 4);
    }

    public static boolean isInteger(String wd) {

        try {

            Integer.parseInt(wd);

            return true;

        } catch (Exception e) {

            System.out.println("Valor ingresado no nùmerico");

            return false;

        }

    }
}
