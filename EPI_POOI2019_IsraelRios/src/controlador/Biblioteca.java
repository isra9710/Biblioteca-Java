/*
Nombres: Israel Rios Contreras
Carrera: Ingenieria en informatica
Cuatrimestre: 5
Grupo:B
Evidencia: Integradora
EPI_POO2019_IsraelRios.
*/
package controlador;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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
public abstract class Biblioteca 
{
    public static TreeMap<Integer,Material> materiales; 
    public static TreeSet<Usuario> usuarios;
    public static ArrayList<Prestamo> prestamos;
    public static void inicializarPrestamos()  
    {
        Date date1 = new Date(02,02,2010);
        Date date=new Date(01,1,2010);
        Egresado nuevo=new Egresado("12345CED","123jhkj","Informatica","Egresado","Israel","Rios","Contreras","7773100701");
        System.out.println(nuevo.getNombre());
        Libro libro=new Libro("Porrua","20,000 Viajes de Legua Submarina","Autor","Libro",1867,200);
        System.out.println(nuevo);
        System.out.println(libro);
        Material material= (Material)libro;
        Usuario usuario=(Usuario)nuevo;
        PrestamoSimple prestamo=new PrestamoSimple(material,usuario,date,date1,true,"Simple"); 
        Prestamo cobrar=(Prestamo)prestamo;
        System.out.println(cobrar);
        prestamos.add(cobrar);
    }
   
    public static void cargarTablaUsuario(DefaultTableModel modelo)
    {
       
        Iterator<Usuario> it =usuarios.iterator();
		while(it.hasNext()) 
                {
                    /*En este caso se posiciona en el objeto y se accede al  método del objeto que contiene el valor buscado*/
                    Object[] row={it.next().getIdUsuario(),it.next().getTipoUsuario(),it.next().getNombre(),it.next().getApellidoP(),it.next().getApellidoM(),it.next().getTelefono(),it.next().getDeuda(),it.next().getMulta()};
                    modelo.addRow(row);
		}
    }
    
     public static void cargarTablaPrestamos(DefaultTableModel modelo)
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
     public static void cargarTablaMateriales(DefaultTableModel modelo)
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
