import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

public class Carro {
    private String placa;
    private int horaLlegada;
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(int horaLlegada) {
        this.horaLlegada = horaLlegada;
    }
    public Carro( String pPlaca, int pHora )
    {
        placa = pPlaca;
        horaLlegada = pHora;
    }
    public String darPlaca( )
    {
        return placa;
    }
    public int darHoraLlegada( )
    {
        return horaLlegada;
    }
    public boolean tienePlaca( String pPlaca )
    {
        boolean tienePlaca = false;
        if( placa.equalsIgnoreCase( pPlaca ) )
        {
            tienePlaca = true;
        }
        else
        {
            tienePlaca = false;
        }
        return tienePlaca;
    }
    public int darTiempoEnParqueadero( int pHoraSalida )
    {
        int tiempoParqueadero = pHoraSalida - horaLlegada + 1;
        return tiempoParqueadero;
    }
    public boolean hayCarrosPlacaIgual(String[] placas){
        HashSet<String> placasUnicas = new HashSet<>();
        for (String placa : placas){
            if (placasUnicas.contains(placa)){
                return true;
            }else {
                placasUnicas.add(placa);
            }
        }
        return false;
    }
    public double darTiempoPromedio(int[] horallegada){
        if (horallegada.length == 0){
            return 0;
        }
        int sumahorallegada = 0;
        for (int promedio : horallegada){
            sumahorallegada += promedio;
        }
        return (double) sumahorallegada/horallegada.length;
    }
    public static String hayCarroMasDeOchoHoras(int[] tiempos, String[] placas){
        if (tiempos.length == 0 || placas.length == 0){
            return null;
        }
        int maxTiempo = tiempos[0];
        int indexMaxTiempo = 0;
        for (int i = 1; i<tiempos.length; i++){
            if (tiempos[i] > maxTiempo){
                maxTiempo = tiempos[i];
                indexMaxTiempo=i;
            }
        }
        return placas[indexMaxTiempo];
    }
    public static boolean hayCarroMasOchoHoras(int[] tiempos){
        for (int tiempo : tiempos){
            if (tiempo > 8){
                return true;
            }
        }
        return false;
    }
    public static List<String> darCarrosMasDeTresHorasParqueados(int[] tiempos, String[] placas){
        List<String> carrosMasDeTresHoras = new ArrayList<>();
        for (int i = 0; i < tiempos.length; i++){
            if (tiempos[i] > 3){
                carrosMasDeTresHoras.add(placas[i]);
            }
        }
        return carrosMasDeTresHoras;
    }
}
