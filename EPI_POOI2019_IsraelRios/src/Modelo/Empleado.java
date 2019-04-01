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
public  class Empleado extends Usuario
{
    private static int id_empleado=0;

    public Empleado(int id_empleado, String tipoUsuario, String nombre, String apellidoP, String apellidoM, String telefono)
    {
        super(tipoUsuario, nombre, apellidoP, apellidoM, telefono);
        this.id_empleado = id_empleado+1;
    }
    
   public  void multa(double deuda)
    {
    
    }//Metodo sobre escrito
   
}
