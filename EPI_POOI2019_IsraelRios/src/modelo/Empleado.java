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
public  class Empleado extends Usuario
{
    private static int id=0; 
    int id_empleado;

    public Empleado(String tipoUsuario, String nombre, String apellidoP, String apellidoM, String telefono)
    {
        super(tipoUsuario, nombre, apellidoP, apellidoM, telefono);
        id++;
        this.id_empleado = id;
    }

    public  int getId_empleado() {
        return id_empleado;
    }

    public  void setId_empleado(int id_empleado) {
        id_empleado = id_empleado;
    }
    
    
   public  void multa(double deuda)
    {
    
    }//Metodo sobre escrito
   
}
