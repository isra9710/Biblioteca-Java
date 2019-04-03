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
public class Revista extends Material
{
    String categoria;

    public Revista(String categoria, String Titulo, String Autor, String tipoMaterial, int anio, int ejemplares) 
    {
        super(Titulo, Autor, tipoMaterial, anio, ejemplares);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

     public void aniadir()
    {
    
    }
    public void eliminar()
    {
        
    }
    
}
