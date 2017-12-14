package edu.jabs.batallaNaval.testServidor;

import edu.jabs.batallaNaval.servidor.*;

/**
 * Esta clase es usada por las pruebas de la clase ServidorBatallaNaval.<br>
 * Cuando se inicia un Thread con esta clase, esta se encarga de hacer que el servidor quede listo para recibir conexiones.
 */
public class AyudantePruebasServidor extends Thread
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Es el servidor sobre el que se realizan las pruebas
     */
    private BatallaNaval servidor;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye el ayudante para las pruebas
     * @param servidorBN El servidor que será probado
     */
    public AyudantePruebasServidor( BatallaNaval servidorBN )
    {
        servidor = servidorBN;
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Inicia al servidor dejándolo listo para recibir conexiones
     */
    public void run( )
    {
        while( true )
        {
            servidor.recibirConexiones( );
        }
    }

    /**
     * Detiene el servidor
     */
    public void detener( )
    {
        interrupt( );
    }
}