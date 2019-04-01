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
public class Regular extends Alumno implements Descuento
{
    double promedio;

    public Regular(double promedio, String matricula, String carrera, String tipoUsuario, String nombre, String apellidoP, String apellidoM, String telefono)
    {
        super(matricula, carrera, tipoUsuario, nombre, apellidoP, apellidoM, telefono);
        this.promedio = promedio;
    }

    public double getPromedio() 
    {
        return promedio;
    }

    public void setPromedio(double promedio) 
    {
        this.promedio = promedio;
    }

    @Override//Metodo sobre escrito
    public void multa(double deuda)
    {
         deuda=deuda+10;
         setDeuda(deuda);
    }

    @Override//Metodo de interfaz
    public void descuento(double deuda) 
    {
        deuda=deuda-10;
        setDeuda(deuda);
    }

   
    
}
