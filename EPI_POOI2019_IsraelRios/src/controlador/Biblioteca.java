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
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import modelo.*;



/**
 *
 * @author israel
 */
public  class Biblioteca 
{
    public static ArrayList<Material> materiales; 
    public static ArrayList<Usuario> usuarios;
    public static ArrayList<Prestamo> prestamos;
    public static void inicializarPrestamos()  
    {
        Calendar date1=Calendar.getInstance();
        Calendar date=Calendar.getInstance();
        date1.add(Calendar.DATE, -22);
        date.add(Calendar.DATE, -25);
        Egresado nuevo=new Egresado("12345CED","123jhkj","Informatica","Egresado","Israel","Rios","Contreras","7773100701");
        Profesor nuev=new Profesor("CEDULA","Profesor","Carlos","Diaz","Contreras","777123491");
        usuarios.add((Usuario)nuevo);
        usuarios.add((Usuario)nuev);
        Libro libro=new Libro("Porrua","20,000 Viajes de Legua Submarina","Julio Verne","Libro",1867,200);
        materiales.add((Material)libro);
        Prestamo prestamo=new Prestamo((Usuario)nuevo,(Material)libro,date,date1,false); 
        prestamos.add((Prestamo)prestamo);
    }
   
    public static void cargarTablaUsuario(DefaultTableModel modelo)
    {
       modelo.setRowCount(usuarios.size());
       int i=0;
        Iterator<Usuario> it =usuarios.iterator();
		while(it.hasNext()) 
                {
                    Usuario usuario;
                    usuario=it.next();
                  
                    modelo.setValueAt(usuario.getIdUsuario(),i, 0);
                    modelo.setValueAt(usuario.getTipoUsuario(),i,1 );
                    modelo.setValueAt(usuario.getNombre(),i, 2);
                    modelo.setValueAt(usuario.getApellidoP(),i,3 );
                    modelo.setValueAt(usuario.getApellidoM(),i, 4);
                    modelo.setValueAt(usuario.getTelefono(),i, 5);
                    modelo.setValueAt(usuario.getDeuda(),i, 6);
                    modelo.setValueAt(usuario.getMulta(),i, 7);                    
                    if(usuario instanceof Egresado)
                    {
                        Egresado egresado=(Egresado)usuario;
                        modelo.setValueAt(egresado.getMatricula(),i, 8);
                        modelo.setValueAt(egresado.getCarrera(),i, 9);
                        modelo.setValueAt("No aplica", i, 10);
                        modelo.setValueAt(egresado.getCedula(),i, 11);
                        modelo.setValueAt("No aplica",i, 12);
                        modelo.setValueAt("No aplica",i, 13);
                    }
                    else if(usuario instanceof Regular)
                    {
                        Regular regular=(Regular)usuario;
                        modelo.setValueAt(regular.getMatricula(),i, 8);
                        modelo.setValueAt(regular.getCarrera(),i, 9);
                        modelo.setValueAt("No aplica", i, 10);
                        modelo.setValueAt("No aplica", i, 11);
                        modelo.setValueAt(regular.getPromedio(), i, 12);
                        modelo.setValueAt("No aplica", i, 13);
                    }
                    else if(usuario instanceof Profesor)
                    {
                        Profesor profesor=(Profesor)usuario;
                        modelo.setValueAt("No aplica", i,8 );
                        modelo.setValueAt("No aplica", i,9 );
                        modelo.setValueAt(profesor.getId_empleado(), i,10);
                        modelo.setValueAt(profesor.getCedula(),i,11);
                        modelo.setValueAt("No aplica",i,12);
                        modelo.setValueAt("No aplica",i,13);
                    
                    }
                    else if(usuario instanceof General )
                    {
                        General general=(General)usuario;
                        modelo.setValueAt("No aplica", i,8 );
                        modelo.setValueAt("No aplica", i,9 );
                        modelo.setValueAt(general.getId_empleado(), i,10);
                        modelo.setValueAt("No aplica", i,11);
                        modelo.setValueAt("No aplica", i,12);
                        modelo.setValueAt(general.getDepartamento(), i,13);
                    }
                    
                   i++;
		}
              
    }
    public static void cargarTablaUsuario(DefaultTableModel modelo, int id[])
    {
       modelo.setRowCount(usuarios.size());
       int i=0;
        Iterator<Usuario> it =usuarios.iterator();
		while(it.hasNext()) 
                {
                    Usuario usuario;
                    usuario=it.next();
                    if(usuario.getIdUsuario()==id[0])
                    {
                        modelo.setValueAt(usuario.getIdUsuario(),i, 0);
                        modelo.setValueAt(usuario.getTipoUsuario(),i,1 );
                        modelo.setValueAt(usuario.getNombre(),i, 2);
                        modelo.setValueAt(usuario.getApellidoP(),i,3 );
                        modelo.setValueAt(usuario.getApellidoM(),i, 4);
                        modelo.setValueAt(usuario.getTelefono(),i, 5);
                        modelo.setValueAt(usuario.getDeuda(),i, 6);
                        modelo.setValueAt(usuario.getMulta(),i, 7);                    
                        if(usuario instanceof Egresado)
                        {
                            Egresado egresado=(Egresado)usuario;
                            modelo.setValueAt(egresado.getMatricula(),i, 8);
                            modelo.setValueAt(egresado.getCarrera(),i, 9);
                            modelo.setValueAt("No aplica", i, 10);
                            modelo.setValueAt(egresado.getCedula(),i, 11);
                            modelo.setValueAt("No aplica",i, 12);
                            modelo.setValueAt("No aplica",i, 13);
                        }
                        else if(usuario instanceof Regular)
                        {
                            Regular regular=(Regular)usuario;
                            modelo.setValueAt(regular.getMatricula(),i, 8);
                            modelo.setValueAt(regular.getCarrera(),i, 9);
                            modelo.setValueAt("No aplica", i, 10);
                            modelo.setValueAt("No aplica", i, 11);
                            modelo.setValueAt(regular.getPromedio(), i, 12);
                            modelo.setValueAt("No aplica", i, 13);
                        }
                        else if(usuario instanceof Profesor)
                        {
                            Profesor profesor=(Profesor)usuario;
                            modelo.setValueAt("No aplica", i,8 );
                            modelo.setValueAt("No aplica", i,9 );
                            modelo.setValueAt(profesor.getId_empleado(), i,10);
                            modelo.setValueAt(profesor.getCedula(),i,11);
                            modelo.setValueAt("No aplica",i,12);
                            modelo.setValueAt("No aplica",i,13);

                        }
                        else if(usuario instanceof General )
                        {
                            General general=(General)usuario;
                            modelo.setValueAt("No aplica", i,8 );
                            modelo.setValueAt("No aplica", i,9 );
                            modelo.setValueAt(general.getId_empleado(), i,10);
                            modelo.setValueAt("No aplica", i,11);
                            modelo.setValueAt("No aplica", i,12);
                            modelo.setValueAt(general.getDepartamento(), i,13);
                        }
                    }
                   i++;
		}
              
    }
    public static Usuario devolverUsuario(int id)
    {
        Usuario usuario=null;
        Iterator<Usuario> it=usuarios.iterator();
        int i=0;
        while(it.hasNext())
        {
            usuario=it.next();
            if(usuario.getIdUsuario()==id)
            {
                return usuario;
            }
        }
        return usuario;
    }
    public static void adeudoresUsuario(JComboBox combo)
    {
        int i=0;
        Iterator<Usuario> it =usuarios.iterator();
        Usuario usuario;
        while(it.hasNext())
        {
            usuario=it.next();
            if(usuario.getRetardo())
            {
                combo.addItem(usuario.getIdUsuario());
            }
            
        }
    }
      public static void ponerMulta(int id)
    {
        int i=0;
        Iterator<Usuario> it =usuarios.iterator();
        Usuario usuario;
        while(it.hasNext())
        {
            usuario=it.next();
            if(usuario.getIdUsuario()==id)
            {
                usuario.multa(usuario.getDeuda());
                usuario.setEntrega(true);
                usuario.setRetardo(true);
            }
        }
    
    }
       public static void quitarMulta(int id)
    {
        int i=0;
        Iterator<Usuario> it =usuarios.iterator();
        Usuario usuario;
        while(it.hasNext())
        {
            usuario=it.next();
            if(usuario.getIdUsuario()==id)
            {
                usuario.setMulta(0);
                usuario.setRetardo(false);
            }
        }
    }
      public static void saldarDeuda(int id)
      {
          int i=0;
        Iterator<Usuario> it =usuarios.iterator();
        Usuario usuario;
        while(it.hasNext())
        {
            usuario=it.next();
            if(usuario.getIdUsuario()==id)
            {
                usuario.setDeuda(0);
            }
        }
          
     }
    
     public static void cargarTablaPrestamos(DefaultTableModel modelo)
    {
        Iterator<Prestamo> it=prestamos.iterator();
        modelo.setRowCount(prestamos.size());
        int i=0;
        String status;
        while(it.hasNext()) 
        {
            Prestamo prestamo=it.next();
            if(prestamo.getStatus())
            {
                status=("Devuelto");
            }
            else
            {
                status=("No devuelto");
            }
            modelo.setValueAt(prestamo.getId_prestamo(), i, 0);
            modelo.setValueAt(prestamo.getUsuario().getIdUsuario(), i,1 );
            modelo.setValueAt(prestamo.getUsuario().getNombre(), i,2 );
            modelo.setValueAt(String.format("%1$tY-%1$tm-%1$td",   prestamo.getFechaSalida().getTime()), i, 3);
            modelo.setValueAt(String.format("%1$tY-%1$tm-%1$td",   prestamo.getFechaRegreso().getTime()), i,4 );
            modelo.setValueAt(prestamo.getMaterial().getTitulo(), i, 5);
            modelo.setValueAt(status,i,6);
            
            i++;
        }
    }
      
    public static void cargarTablaPrestamos(DefaultTableModel modelo, int id,int dias[], int id_usuario[], int id_material[], int id_prestamo[],Calendar fechaActual)
     {
        Iterator<Prestamo> it=prestamos.iterator();
        modelo.setRowCount(prestamos.size());
        int i=0;
        String status=null;
        Prestamo prestamo;
        while(it.hasNext()) 
        {
             prestamo=it.next();
            if(!prestamo.getStatus())
            {
                status=("No Devuelto");
            }
            if(prestamo.getId_prestamo()==id)
            {
                modelo.setValueAt(prestamo.getId_prestamo(), i, 0);
                modelo.setValueAt(prestamo.getUsuario().getIdUsuario(), i,1 );
                id_usuario[0]=prestamo.getUsuario().getIdUsuario();
                modelo.setValueAt(prestamo.getUsuario().getNombre(), i,2 );
                modelo.setValueAt(String.format("%1$tY-%1$tm-%1$td",   prestamo.getFechaSalida().getTime()), i, 3);
                modelo.setValueAt(String.format("%1$tY-%1$tm-%1$td",   prestamo.getFechaRegreso().getTime()), i,4 );
                modelo.setValueAt(prestamo.getMaterial().getTitulo(), i, 5);
                id_prestamo[0]=prestamo.getId_prestamo();
                modelo.setValueAt(status,i,6);
                Calendar fechaAux=prestamo.getFechaRegreso();
                calcularDias(fechaAux,fechaActual,dias);
            }
                i++;
        }
    }
    public static void cambiarEstadoPrestamo(int id_prestamo)
    {
        Iterator<Prestamo> it=prestamos.iterator();
        int i=0;
        Prestamo prestamo;
        while(it.hasNext())
        {
            prestamo=it.next();
            prestamo.setStatus(true);
        }
        
    }
    
     public static void cargarTablaMateriales(DefaultTableModel modelo)
     {
         Iterator<Material> it=materiales.iterator();
        modelo.setRowCount(materiales.size());
        int i=0;
        String estado;
        while(it.hasNext()) 
        {
            Material material;
            material=it.next();
            if(material.getStatus())
            {
                estado=("DISPONIBLE");
            }
            else
            {
                estado=("NO DISPONIBLE");
            }
            modelo.setValueAt(material.getIdMaterial(), i, 0);
            modelo.setValueAt(material.getTitulo(), i, 1);
            modelo.setValueAt(material.getAutor(), i,2);
            modelo.setValueAt(material.getAnio(), i,3 );
            modelo.setValueAt(material.getTipoMaterial(), i,4 );
            modelo.setValueAt(material.getEjemplares(), i,5 );
            modelo.setValueAt(estado, i, 6);
            if(material instanceof Libro)
            {
                Libro libro;
                libro=(Libro)material;
                modelo.setValueAt(libro.getEditorial(), i,7 );
                modelo.setValueAt("No aplica", i, 8);
            }
            else if(material instanceof Revista)
            {
                Revista revista;
                revista=(Revista)material;
                modelo.setValueAt("No aplica", i,7 );
                modelo.setValueAt(revista.getCategoria(), i, 8);
            }
            i++;
        
        }  
     }
     public static void agregarMaterial(int id_material)
     {
         Iterator<Material> it=materiales.iterator();
        int i=0;
        Material material;
        while(it.hasNext())
        {
            material=it.next();
            material.setEjemplares(material.getEjemplares()+1);
        }
     }
     
     
     public static void llenarComboIdPrestamo(JComboBox combo)
     {
        
        Iterator<Prestamo> it=prestamos.iterator();
        int i=0;
        Prestamo prestamo;
        while(it.hasNext())
        {
            prestamo=it.next();
            if(!(prestamo.getStatus()))
            {
                combo.addItem(prestamo.getId_prestamo());
            }
            
        }
        
    }
     public static Material devolverMaterial(int id)
     {
         Material material=null;
         Iterator<Material> it = materiales.iterator();
         int i=0;
         while(it.hasNext())
         {
             material=it.next();
             if(material.getIdMaterial()==id)
             {
                 return material;
             }
         }
        return material;
     }
    public static void calcularDias(Calendar fechaEntrega,Calendar fechaActual, int dias[])
    {
        int contador=0;
        while(fechaEntrega.before(fechaActual)|| fechaEntrega.equals(fechaActual))
        {
            contador++;
            fechaEntrega.add(Calendar.DATE,1);
        }
        dias[0]=contador;
        System.out.println("Fecha entrega Original: ");
        System.out.println(String.format("%1$tY-%1$tm-%1$td",fechaEntrega.getTime()));
    
    }
          
    
}
