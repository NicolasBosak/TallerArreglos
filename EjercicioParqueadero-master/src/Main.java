import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero();
        Scanner scanner = new Scanner(System.in);
        int opc, horallegada, numeropuesto;
        String placa;

        do {
            System.out.println("1. Ingresar un auto al parqueadero.");
            System.out.println("2. Dar salida a un auto del parqueadero.");
            System.out.println("3. Informar los ingresos del parqueadero.");
            System.out.println("4. Consultar la cantidad de puestos disponibles.");
            System.out.println("5. Avanzar una hora en el reloj del parqueadero.");
            System.out.println("6. Cambiar la tarifa del parqueadero.");
            System.out.println("7. Lista de autos con más de tres horas en el parqueadero.");
            System.out.println("8. Número de autos con placa PB en el parqueadero.");
            System.out.println("9. Salir.");
            opc = scanner.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("\nINGRESAR UN AUTO AL PARQUEADERO.");
                    System.out.print("Ingrese el número de placa: ");
                    placa = scanner.next();
                    System.out.print("Ingrese la hora de llegada: ");
                    horallegada = scanner.nextInt();
                    numeropuesto = parqueadero.entrarCarro(placa);
                    if (numeropuesto == Parqueadero.NO_HAY_PUESTO) {
                        System.out.println("No hay puesto disponible en el parqueadero.");
                    } else if (numeropuesto == Parqueadero.PARQUEADERO_CERRADO) {
                        System.out.println("El parqueadero está cerrado.");
                    } else if (numeropuesto == Parqueadero.CARRO_YA_EXISTE) {
                        System.out.println("El carro con esa placa ya se encuentra en el parqueadero.");
                    } else {
                        System.out.println("El auto ha sido ingresado en el puesto " + numeropuesto);
                    }
                    break;

                case 2:
                    System.out.println("\nDAR SALIDA A UN AUTO DEL PARQUEADERO.");
                    System.out.print("Ingrese el número de placa: ");
                    placa = scanner.next();
                    int valorAPagar = parqueadero.sacarCarro(placa);
                    if (valorAPagar == Parqueadero.CARRO_NO_EXISTE) {
                        System.out.println("No hay un auto con esa placa en el parqueadero.");
                    } else if (valorAPagar == Parqueadero.PARQUEADERO_CERRADO) {
                        System.out.println("El parqueadero está cerrado.");
                    } else {
                        System.out.println("El auto ha sido sacado del parqueadero. Valor a pagar: $" + valorAPagar);
                    }
                    break;

                case 3:
                    System.out.println("Los ingresos del parqueadero son de $" + parqueadero.darMontoCaja());
                    break;

                case 4:
                    System.out.println("Puestos disponibles: " + parqueadero.calcularPuestosLibres());
                    break;

                case 5:
                    System.out.print("Ingrese el tiempo que desea avanzar en horas: ");
                    int horasAvanzar = scanner.nextInt();
                    for (int i = 0; i < horasAvanzar; i++) {
                        parqueadero.avanzarHora();
                    }
                    System.out.println("El reloj del parqueadero ha avanzado " + horasAvanzar + " horas.");
                    break;

                case 6:
                    System.out.print("Ingrese la nueva tarifa: ");
                    int nuevaTarifa = scanner.nextInt();
                    parqueadero.cambiarTarifa(nuevaTarifa);
                    System.out.println("La tarifa del parqueadero ha sido cambiada a $" + nuevaTarifa);
                    break;

                case 7:
                    System.out.println("Lista de autos con más de tres horas en el parqueadero: ");
                    break;

                case 8:
                    System.out.println("Número de autos con placa PB en el parqueadero: " + parqueadero.metodo1());
                    break;

                case 9:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opc != 9);
    }
}