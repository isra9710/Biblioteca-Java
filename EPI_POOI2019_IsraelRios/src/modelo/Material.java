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
public class Material 
{
    private static int id=0; 
    int id_material;
    private String Titulo,Autor, tipoMaterial;
    private int anio;
    private boolean status;
    private int ejemplares;

    public Material(String Titulo, String Autor, String tipoMaterial, int anio, int ejemplares) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.tipoMaterial = tipoMaterial;
        this.anio = anio;
        this.ejemplares = ejemplares;
        if(ejemplares<=0)
        {
            status=false;
        }
        else
        {
            status=true;
        }
        id++;
        id_material=id;
    }

    public int getId_material() {
        return id_material;
    }

    public void setId_material(int id_material) {
        this.id_material = id_material;
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

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    @Override
    public String toString() {
        return "Material{" + "Titulo=" + Titulo + ", Autor=" + Autor + ", tipoMaterial=" + tipoMaterial + ", anio=" + anio + ", status=" + status + ", ejemplares=" + ejemplares + '}';
    }

  
    
    
    
    public void aniadir()
    {
    }
    public void eliminar()
    {
        
    }
            
    
}
