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
public class Libro extends Material
{
    private String editorial;

    public Libro(String editorial, String Titulo, String Autor, String tipoMaterial, int anio, int ejemplares)
    {
        super(Titulo, Autor, tipoMaterial, anio, ejemplares);
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

    public static void aniadir(String editorial, String Titulo, String Autor, String tipoMaterial, int anio, int ejemplares)
    {
        //tipoMaterial="Libro";
        Biblioteca.materiales.add((Material)new Libro(editorial,Titulo,Autor,tipoMaterial,anio,ejemplares));
    }
    public static void editar(int id,String editorial, String Titulo, String Autor, String tipoMaterial, int anio, int ejemplares)
    {
        Libro libro=(Libro)Biblioteca.devolverMaterial(id);
        libro.setEditorial(editorial);
        libro.setTitulo(Titulo);
        libro.setAutor(Autor);
        libro.setTipoMaterial(tipoMaterial);
        libro.setAnio(anio);
        libro.setEjemplares(ejemplares);
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

    @Override
    public String toString() {
        super.toString();
        return "Libro{" + "editorial=" + editorial + '}';
    }
    
    
    
}
