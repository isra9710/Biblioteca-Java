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
public class Material 
{
    static int id_material=0;
    String Titulo,Autor;
    int anio;
    boolean status;

    public Material(String Titulo, String Autor, int anio) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.anio = anio;
        status=true;
        id_material=id_material+1;
    }
    
    public static int getId_material() 
    {
        
        return id_material;
    }

    public static void setId_material(int id_material)
    {
        Material.id_material = id_material;
    }

    public String getTitulo()
    {
        return Titulo;
    }

    public void setTitulo(String Titulo)
    {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) 
    {
        this.Autor = Autor;
    }

    public int getAnio() 
    {
        return anio;
    }

    public void setAnio(int anio)
    {
        this.anio = anio;
    }
    public void aniadir()
    {
    }
    public void eliminar()
    {
        
    }
            
    
}
