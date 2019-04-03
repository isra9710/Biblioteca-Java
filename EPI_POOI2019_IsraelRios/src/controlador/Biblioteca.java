/*
Nombres: Israel Rios Contreras
Carrera: Ingenieria en informatica
Cuatrimestre: 5
Grupo:B
Evidencia: Integradora
EPI_POO2019_IsraelRios.
*/
package controlador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import javax.swing.table.DefaultTableModel;
import modelo.*;

/**
 *
 * @author israel
 */
public class Biblioteca 
{
    public static TreeMap<Integer,Material> materiales; 
    public static TreeSet<Usuario> usuarios;
    public static ArrayList<Prestamo> prestamos;
    
    
    public void cargarTablaUsuario(DefaultTableModel modelo)
    {
       
        Iterator<Usuario> it =usuarios.iterator();
		while(it.hasNext()) 
                {
                    /*En este caso se posiciona en el objeto y se accede al  método del objeto que contiene el valor buscado*/
                    Object[] row={it.next().getIdUsuario(),it.next().getTipoUsuario(),it.next().getNombre(),it.next().getApellidoP(),it.next().getApellidoM(),it.next().getTelefono(),it.next().getDeuda(),it.next().getMulta()};
                    modelo.addRow(row);
		}
    }
    
     public void cargarTablaPrestamos(DefaultTableModel modelo)
    {
        
        for(Prestamo a: prestamos)
        {
            if(a instanceof PrestamoSimple)
            {
                PrestamoSimple e;
                e=(PrestamoSimple)a;
                Object[] row={e.getIdPrestamo(),e.getUsuario().getIdUsuario(),e.getUsuario().getNombre(),e.getFechaSalida(),e.getFechaRegreso(),e.getMaterial().getTitulo(),""};
                modelo.addRow(row);
            }
            else if(a instanceof PrestamoProfesor)
            {
                PrestamoProfesor e;
                e=(PrestamoProfesor)a;
                Object[] row={e.getIdPrestamo(),e.getUsuario().getIdUsuario(),e.getUsuario().getNombre(),e.getFechaSalida(),e.getFechaRegreso(),e.getMaterial1().getTitulo(), e.getMaterial2().getTitulo()};  
                modelo.addRow(row);
            }
            
        }
    }
     public void cargarTablaMateriales(DefaultTableModel modelo)
     {
         for(Map.Entry<Integer,Material> material: materiales.entrySet())
        {
            if(material instanceof Libro)
            {
                Libro e;
                e=(Libro)material;
                String estado;
                if(e.getStatus())
                {
                    estado="Disponible";
                }
                else
                {
                    estado="No disponible";
                }
                Object row[]={e.getIdMaterial(),e.getTitulo(),e.getAutor() ,e.getAnio(),e.getTipoMaterial(),e.getEjemplares(),estado,e.getEditorial(),""};
                modelo.addRow(row);
            }
            else if(material instanceof Revista)
            {
                Revista e;
                e=(Revista)material;
                String estado;
                if(e.getStatus())
                {
                    estado="Disponible";
                }
                else
                {
                    estado="No disponible";
                }
                Object row[]={e.getIdMaterial(),e.getTitulo(),e.getAutor() ,e.getAnio(),e.getTipoMaterial(),e.getEjemplares(),estado,"",e.getCategoria()};
                modelo.addRow(row);
                
            }
               
            
        }
     
     }
    
}
