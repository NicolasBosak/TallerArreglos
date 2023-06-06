/**
 * Esta clase representa un puesto en el parqueadero.
 */
public class Puesto {
    private Carro carro;
    private int numeroPuesto;
    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public int getNumeroPuesto() {
        return numeroPuesto;
    }

    public void setNumeroPuesto(int numeroPuesto) {
        this.numeroPuesto = numeroPuesto;
    }
    public Puesto( int pPuesto )
    {
        carro = null;
        numeroPuesto = pPuesto;
    }
    public Carro darCarro( )
    {
        return carro;
    }
    /**
     * Indica si el puesto est� ocupado.
     * @return Retorna true si el puesto est� ocupado. Retorna false en caso contrario.
     */
    public boolean estaOcupado( )
    {
        boolean ocupado = carro != null;
        return ocupado;
    }
    public void parquearCarro( Carro pCarro )
    {
        carro = pCarro;
    }
    public void sacarCarro( )
    {
        carro = null;
    }

    /**
     * Retorna el n�mero del puesto.
     * @return El n�mero asignado al puesto.
     */
    public int darNumeroPuesto( )
    {
        return numeroPuesto;
    }

    /**
     * Indica si el carro tiene la placa recibida.
     * @param pPlaca Placa del carro que ocupa el puesto.
     * @return Retorna true si tiene la placa, false en caso contrario.
     */
    public boolean tieneCarroConPlaca( String pPlaca )
    {
        boolean tieneCarro = true;

        if( carro == null )
        {
            tieneCarro = false;
        }
        else if( carro.tienePlaca( pPlaca ) )
        {
            tieneCarro = true;
        }
        else
        {
            tieneCarro = false;
        }

        return tieneCarro;
    }
}