/*
Nombres: Israel Rios Contreras
Carrera: Ingenieria en informatica
Cuatrimestre: 5
Grupo:B
Evidencia: Integradora
EPI_POO2019_IsraelRios.
*/
package Modelo;

/**
 *
 * @author israel
 */
public class Profesor extends Empleado
{
    String cedula;

    public Profesor(String cedula, int id_empleado, String tipoUsuario, String nombre, String apellidoP, String apellidoM, String telefono)
    {
        super(id_empleado, tipoUsuario, nombre, apellidoP, apellidoM, telefono);
        this.cedula = cedula;
        
    }

    @Override//Metodo sobre escrito
    public void multa(double deuda)
    {
        deuda=deuda+25; 
        setDeuda(deuda);
    }
    
    
    
}
