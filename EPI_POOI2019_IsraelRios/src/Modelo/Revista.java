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
public class Revista extends Material
{
    String categoria;

    public Revista(String categoria, String Titulo, String Autor, int anio) 
    {
        super(Titulo, Autor, anio);
        this.categoria = categoria;
    }

     public void aniadir()
    {
    
    }
    public void eliminar()
    {
        
    }
    
}
