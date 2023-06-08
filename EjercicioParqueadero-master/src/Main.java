import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opc=0,opc1;
        String placa="";
        int horaLlegada=0;
        Parqueadero parqueadero = new Parqueadero();
        Carro carro = new Carro(placa, horaLlegada);

        do {
            // Menu
            System.out.println("1. Ingresar un auto al parqueadero.");
            System.out.println("2. Dar salida a un auto del parqueadero.");
            System.out.println("3. Informar los ingresos del parqueadero.");
            System.out.println("4. Consultar la cantidad de puestos disponibles.");
            System.out.println("5. Avanzar una hora en el reloj del parqueadero.");
            System.out.println("6. Cambiar la tarifa del parqueadero.");
            System.out.println("7. Lista de autos con más de tres horas en el parqueadero.");
            System.out.println("8. Hay autos con mas de ocho horas en el parquedero?");
            System.out.println("9. Número de autos con placa PB en el parqueadero.");
            System.out.println("10. Tiempo promedio de los autos en el parqueadero.");
            System.out.println("11. Salir.");
            System.out.print("Ingrese la opcion: ");
            opc = Integer.parseInt(br.readLine());
            System.out.println("");
            System.out.println("");

            //decision
            switch (opc){
                case 1:{
                    System.out.println("\nINGRESAR UN AUTO AL PARQUEADERO.");
                    System.out.print("Ingrese el número de placa: ");
                    placa=br.readLine();
                    opc1=parqueadero.entrarCarro(placa);
                    switch (opc1) {
                        case -2: {
                            System.out.print("Ingrese la hora de llegada: ");
                            System.out.println("");
                            break;
                        }
                        case -4: {
                            System.out.println("El carro con esa placa ya se encuentra en el parqueadero.");
                            System.out.println("");
                            break;
                        }
                        case -1: {
                            System.out.println("No hay puesto disponible en el parqueadero.");
                            System.out.println("");
                            break;
                        }
                        default:{
                            System.out.println("El carro se ha ingresado correctamente");
                            System.out.println("");

                        }
                    }
                    break;
                }
                case 2:{
                    System.out.println("\nINGRESAR UN AUTO AL PARQUEDERO");
                    System.out.println("Ingrese la placa del carro que quiere sacar");
                    placa= br.readLine();
                    opc1=parqueadero.sacarCarro(placa);
                    switch (opc1) {
                        case -2: {
                            System.out.println("El parqueadero está cerrado.");
                            System.out.println("");
                            break;
                        }
                        case -3: {
                            System.out.println("No hay un auto con esa placa en el parqueadero.");
                            System.out.println("");
                            break;
                        }
                        default:{
                            System.out.println("El carro ha sido sacado del parqueadero.");
                            System.out.println("");
                        }
                    }
                    break;
                }
                case 3:{
                    System.out.println("\nMOSTRAR INGRESOS DEL PARQUEDERO.");
                    System.out.println("Los ingresos del parqueadero son de: $"+parqueadero.darMontoCaja());
                    System.out.println("");
                    break;
                }
                case 4:{
                    System.out.println("\nPuestos disponibles: "+parqueadero.calcularPuestosLibres());
                    System.out.println("");
                    break;
                }
                case 5:{
                    opc1=parqueadero.darHoraActual();
                    parqueadero.avanzarHora();
                    int a=parqueadero.darHoraActual();
                    System.out.println("El reloj del parqueadero ha avanzado: "+opc1+":00 a "+a+":00");
                    System.out.println("");
                    break;
                }
                case 6:{
                    System.out.print("\nIngrese la nueva tarifa: ");
                    opc1=Integer.parseInt(br.readLine());
                    parqueadero.cambiarTarifa(opc1);
                    break;
                }
                case 7:
                    System.out.println("\nLista de autos con más de tres horas en el parqueadero: " + Parqueadero.darCarrosMasDeTresHorasParqueados());
                    break;
                case 8:{
                    System.out.println("\nHay autos con mas de ocho horas en el parquedero? "+Parqueadero.hayCarroMasOchoHoras());
                break;}
                case 9:
                    System.out.println("\nNúmero de autos con placa PB en el parqueadero: " + parqueadero.metodo1());
                    break;
                case 10:
                    System.out.println("\nTiempo promedio de los autos en el parquedero: "+Parqueadero.darTiempoPromedio());
                    break;
                case 11:
                    System.out.println("\nSaliendo del programa.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opc != 11);
    }
}