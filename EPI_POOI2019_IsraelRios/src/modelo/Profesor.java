/*
Nombres: Israel Rios Contreras
Carrera: Ingenieria en informatica
Cuatrimestre: 5
Grupo:B
Evidencia: Integradora
EPI_POO2019_IsraelRios.
*/
package modelo;

/**
 *
 * @author israel
 */
public class Profesor extends Empleado
{
    String cedula;

    public Profesor(String cedula, String tipoUsuario, String nombre, String apellidoP, String apellidoM, String telefono)
    {
        super(tipoUsuario, nombre, apellidoP, apellidoM, telefono);
        this.cedula = cedula;
        
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    

    @Override//Metodo sobre escrito
    public void multa(double deuda)
    {
        multa=deuda+25;
        deuda=0;
    }

    @Override
    public String toString() {
        return "Profesor{" + "cedula=" + cedula + '}';
    }
    
    
    
}
