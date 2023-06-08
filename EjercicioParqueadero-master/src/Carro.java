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
}
