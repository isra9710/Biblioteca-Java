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
public class Egresado extends Alumno
{
    String cedula;

    public Egresado(String cedula, String matricula, String carrera, String tipoUsuario, String nombre, String apellidoP, String apellidoM, String telefono) 
    {
        super(matricula, carrera, tipoUsuario, nombre, apellidoP, apellidoM, telefono);
        this.cedula = cedula;
    }

    public String getCedula()
    {
        return cedula;
    }

    public void setCedula(String cedula)
    {
        this.cedula = cedula;
    }
    

    @Override//Metodo sobre escrito
    public void multa(double deuda) {
        deuda=deuda+20;
        setDeuda(deuda);
    }

    @Override
    public String toString() 
    {
        return "Egresado{" + "cedula=" + cedula + '}';
    }

    
}
