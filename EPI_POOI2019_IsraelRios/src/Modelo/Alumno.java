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
public abstract class Alumno extends Usuario
{
    String matricula,carrera;

    public Alumno(String matricula, String carrera, String tipoUsuario, String nombre, String apellidoP, String apellidoM, String telefono) {
        super(tipoUsuario, nombre, apellidoP, apellidoM, telefono);
        this.matricula = matricula;
        this.carrera = carrera;
    }

    public String getMatricula()
    {
        return matricula;
    }

    public void setMatricula(String matricula) 
    {
        this.matricula = matricula;
    }

    public String getCarrera() 
    {
        return carrera;
    }

    public void setCarrera(String carrera) 
    {
        this.carrera = carrera;
    }
    
    @Override//Metodo sobre escrito
    public abstract void multa(double deuda);

    @Override
    public String toString() 
    {
        return "Alumno{" + "matricula=" + matricula + ", carrera=" + carrera + '}';
    }
  
    
}
