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
public class Libro extends Material
{
    String editorial;

    public Libro(String editorial, String Titulo, String Autor, int anio) 
    {
        super(Titulo, Autor, anio);
        this.editorial = editorial;
    }

    public String getEditorial()
    {
        return editorial;
    }

    public void setEditorial(String editorial) 
    {
        this.editorial = editorial;
    }

    public void aniadir()
    {
    }
    public void eliminar()
    {
        
    }
    
    
    
}
