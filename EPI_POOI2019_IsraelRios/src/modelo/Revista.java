/*
Nombres: Israel Rios Contreras
Carrera: Ingenieria en informatica
Cuatrimestre: 5
Grupo:B
Evidencia: Integradora
EPI_POO2019_IsraelRios.
*/
package modelo;

import controlador.Biblioteca;
import java.util.Iterator;

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

    
    @Override
    public String toString() {
        super.toString();
        return "Revista{" + "categoria=" + categoria + '}';
    }
    

     public static void aniadir(String categoria, String Titulo, String Autor, String tipoMaterial, int anio, int ejemplares)
    {
    
    }
     public static void editar(String categoria, String Titulo, String Autor, String tipoMaterial, int anio, int ejemplares)
     {
     
     }
    public static void eliminar(int id)
    {
         Iterator <Material> it=Biblioteca.materiales.iterator();
        Material material;
        while(it.hasNext())
        {
            material=it.next();
            if(material.getId_material()==id)
            {
                it.remove();
                break;
            }
            
        }
    }
    
}
