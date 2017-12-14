package edu.jabs.batallaNaval.interfazCliente;

import javax.swing.JDialog;

/**
 * Es el diálogo usado para pedir los datos necesarios para iniciar una conexión
 */
public class DialogoConectar extends JDialog
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Es una referencia a la clase principal de la interfaz
     */
    private InterfazJugador principal;

    // -----------------------------------------------------------------
    // Atributos de la Interfaz
    // -----------------------------------------------------------------

    /**
     * Es el panel donde se ingresan los datos
     */
    private PanelDatosJuego panelDatos;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye el diálogo
     * @param ventanaPrincipal Es una referencia a la clase principal de la interfaz
     * @param nombre Nombre con el que se va a inicializar el panel
     * @param direccion Dirección del servidor para inicializar el panel
     * @param puerto Puerto para inicializar el panel
     */
    public DialogoConectar( InterfazJugador ventanaPrincipal, String nombre, String direccion, int puerto )
    {
        super( ventanaPrincipal, true );

        principal = ventanaPrincipal;
        panelDatos = new PanelDatosJuego( this, nombre, direccion, puerto );
        getContentPane( ).add( panelDatos );

        setTitle( "Datos de la Conexión" );
        setSize( 400, 200 );
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Intenta realizar una conexión
     * @param nombre El nombre del jugador
     * @param direccion Dirección donde se encuentra el servidor
     * @param puerto Puerto usado para la conexión
     */
    public void conectar( String nombre, String direccion, int puerto )
    {
        principal.conectar( this, nombre, direccion, puerto );
    }

}
