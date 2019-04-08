/*
Nombres: Israel Rios Contreras
Carrera: Ingenieria en informatica
Cuatrimestre: 5
Grupo:B
Evidencia: Integradora
EPI_POO2019_IsraelRios.
*/
package controlador;

import com.toedter.calendar.JDateChooser;
import java.awt.Image;
import java.io.File;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;
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

    public Biblioteca() {
    }
    
    
    
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
        Libro libro1=new Libro("Porrua","La divina comedia","Dante","Libro",1865,500);
        materiales.add((Material)libro);
        materiales.add((Material)libro1);
    }
   
    
    
    /////////////////////////$$$$$$$$$$$$$$$Metodos de Usuario$$$$$$$$$$$$$$$$$$$$$$$$$$$//////////////////////////////
    
    public static void cargarTablaUsuario(DefaultTableModel modelo)//Este metodo carga una tabla con todos los usuarios
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
    
    
    
    
    public static void cargarTablaUsuario(DefaultTableModel modelo, int id)//Esta funcion hace busqueda de un usuario en especifico para poner al mismo en una tabla
    {
       modelo.setRowCount(usuarios.size());
       int i=0;
        Iterator<Usuario> it =usuarios.iterator();
		while(it.hasNext()) 
                {
                    Usuario usuario;
                    usuario=it.next();
                    if(usuario.getIdUsuario()==id)
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
    public static void llenarIdUsuario(JComboBox combo)//Esta funcion llenar un combo box con los id de los usuarios
    {
        Iterator <Usuario> it=usuarios.iterator();
        Usuario usuario;
        while(it.hasNext())
        {
            usuario=it.next();
            if(usuario.getEntrega()&& usuario.getDeuda()==0&&usuario.getMulta()==0)
                
            {
                combo.addItem(usuario.getIdUsuario());
            }
        }
        
    }
    public static void llenarMultados(JComboBox combo)//Si se necesesitan todos los id de los usuarios multados, esta funcion sirve
    {
        Iterator <Usuario> it=usuarios.iterator();
        Usuario usuario;
        while(it.hasNext())
        {
            usuario=it.next();
            if(usuario.getMulta()>0)
                
            {
                combo.addItem(usuario.getIdUsuario());
            }
        }
        
    }
    public static void llenarIdUsuario(JComboBox combo, int id)//Esta funcion es para editar un prestamo, conservando el id del usuario original si este no se modifica en el prestamo
    {
        Iterator <Usuario> it=usuarios.iterator();
        Usuario usuario;
        combo.addItem(id);
        while(it.hasNext())
        {
            usuario=it.next();
            if(usuario.getEntrega())   
            {
                combo.addItem(usuario.getIdUsuario());
            }
        }
        
    }
    public static Usuario devolverUsuario(int id)//Esta funcion devuelve un usuario despues de una busqueda por id
    {
        Usuario usuario=null;
        Iterator<Usuario> it=usuarios.iterator();
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
    public static void modificarUsuario(Usuario usuario)//Esta funcion agrega la deuda respectiva al usuario que acaba de ser registrado en un prestamo
    {
        usuario.setDeuda(75.0);
        usuario.setEntrega(false);
        if(usuario instanceof Regular)
        {
            Regular regular=(Regular)usuario;
            regular.descuento(regular.getDeuda());
        }
        else if(usuario instanceof General)
        {
            General general=(General)usuario;
            general.descuento(general.getDeuda());
        }
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
      public static void ponerMulta(int id)//Si se entrega tarde un libro este metodo se encarga de poner la multa correspondiente
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
       public static void quitarMulta(int id)//Cuando se ha pagado la multa, se quita con este metodo
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
      public static void saldarDeuda(int id)//Despues de devolver un libro la deuda pasa a ser 0
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
      public static void aplicarDescuento(Usuario usuario)//Se aplica el respectivo descuento
      {
          if(usuario instanceof Regular)
          {
              Regular regular=(Regular)usuario;
              regular.descuento(regular.getDeuda());  
          }
          else if(usuario instanceof General)
          {
              General general=(General)usuario;
              general.descuento(general.getDeuda());
          }
      }
      
      
      
  /////////////////////////$$$$$$$$$$$$$$$Metodos de Usuario$$$$$$$$$$$$$$$$$$$$$$$$$$$//////////////////////////////    
      
      
      
      
      
      
 /////////////////////////$$$$$$$$$$$$$$$Metodos de prestamo$$$$$$$$$$$$$$$$$$$$$$$$$$$////////////////////////////// 
    
     public static void cargarTablaPrestamos(DefaultTableModel modelo)//esta funcion llena una tabla con todos los prestamos no devueltos
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
    public static void cargarTablaPrestamos(DefaultTableModel modelo, int id)//Esta funcion "sobrecarga" llena una tabla de prestamos no devueltos
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
                modelo.setValueAt(prestamo.getUsuario().getNombre(), i,2 );
                modelo.setValueAt(String.format("%1$tY-%1$tm-%1$td",   prestamo.getFechaSalida().getTime()), i, 3);
                modelo.setValueAt(String.format("%1$tY-%1$tm-%1$td",   prestamo.getFechaRegreso().getTime()), i,4 );
                modelo.setValueAt(prestamo.getMaterial().getTitulo(), i, 5);
                modelo.setValueAt(status,i,6);
                Calendar fechaAux=prestamo.getFechaRegreso();
            }
                i++;
        }
    }
    public static void cambiarEstadoPrestamo(int id_prestamo)//Esta funcion cambia el estado a "Devuelto" de un prestamo
    {
        Iterator<Prestamo> it=prestamos.iterator();
        Prestamo prestamo;
        while(it.hasNext())
        {
            prestamo=it.next();
            if(prestamo.getId_prestamo()==id_prestamo)
            {
                prestamo.setStatus(true);
            }
            
        }
        
    }
    public static Prestamo devolverPrestamo(int id_prestamo)//Esta funcion devuelve un prestamo despues de una busqueda por id
    {
        Prestamo prestamo=null;
        Iterator<Prestamo> it=prestamos.iterator();
        while(it.hasNext())
        {
            prestamo=it.next();
            if(prestamo.getId_prestamo()==id_prestamo)
            {
                return prestamo;
            }
        }
        return prestamo;
    }
    public static void llenarComboIdPrestamo(JComboBox combo)//Esta funcion llena un combo box cuando se soliciten todos los id de los prestamos no devueltos
     {
        
        Iterator<Prestamo> it=prestamos.iterator();
        Prestamo prestamo;
        while(it.hasNext())
        {
            prestamo=it.next();
            if(!prestamo.getStatus())
            {
                combo.addItem(prestamo.getId_prestamo());
            }
            
        }
        
    }
    public static Usuario devolverUsuarioDePrestamo(int id_prestamo)//Esta funcion devuelve un usuario despues de una busqueda por id
    {
        Iterator<Prestamo> it=prestamos.iterator();
        Prestamo prestamo;
        Usuario usuario=null;
        while (it.hasNext())
        {
            prestamo=it.next();
            if(prestamo.getId_prestamo()==id_prestamo)
            {
               usuario=prestamo.getUsuario();
               return usuario;
            }
                
        
       }
        
        
        return usuario;
    }
    public static void calcularDias(Calendar fechaEntrega,Calendar fechaActual, int dias[])//Esta funcion calcula dias, facilita el saber si se debe multar a alguien o no
    {
        int contador=0;
        while(fechaEntrega.before(fechaActual)|| fechaEntrega.equals(fechaActual))
        {
            contador++;
            fechaEntrega.add(Calendar.DATE,1);
        }
        dias[0]=contador;
        
    
    }
    /////////////////////////$$$$$$$$$$$$$$$Metodos de prestamo$$$$$$$$$$$$$$$$$$$$$$$$$$$//////////////////////////////
    
    
    
    
    
    
    
    
    
 /////////////////////////$$$$$$$$$$$$$$$Metodos de Materia$$$$$$$$$$$$$$$$$$$$$$$$$$$//////////////////////////////   
     public void cargarTablaMateriales(DefaultTableModel modelo, JLabel foto)//Esta funcion llena una tabla de materiales
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
            modelo.setValueAt(material.getId_material(), i, 0);
            modelo.setValueAt(material.getTitulo(), i, 1);
            modelo.setValueAt(material.getAutor(), i,2);
            modelo.setValueAt(material.getAnio(), i,3 );
            modelo.setValueAt(material.getTipoMaterial(), i,4 );
            modelo.setValueAt(material.getEjemplares(), i,5 );
            modelo.setValueAt(estado, i, 6);
            if(material instanceof Libro)
            {
                Libro libro;
                Icon icon;
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
     public static void cargarTablaMateriales(DefaultTableModel modelo, int id)//Esta funcion con sobre carga llena una tabla de materiales
     {
         Iterator<Material> it=materiales.iterator();
        modelo.setRowCount(materiales.size());
        int i=0;
        String estado;
        while(it.hasNext()) 
        {
            Material material;
            material=it.next();
            if(material.getId_material()==id)
            {   
                if(material.getStatus())
                {
                    estado=("DISPONIBLE");
                }
                else
                {
                    estado=("NO DISPONIBLE");
                }
                modelo.setValueAt(material.getId_material(), i, 0);
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
            }
            i++;
        
        }  
     }
     public static String agregarFoto()
     {
         String foto="";
        JFileChooser fc  = new JFileChooser();
        fc.setDialogTitle("Busca una foto para el libro");
        if(fc.showOpenDialog(fc) == JFileChooser.APPROVE_OPTION){
            File archivo = new File(fc.getSelectedFile().toString());
            return archivo.toString();
        }
        return foto;
     }
     public static void agregarEjemplares(int id_material)//Esta funcin agrega ejemplares
     {
         Iterator<Material> it=materiales.iterator();
        Material material;
        while(it.hasNext())
        {
            material=it.next();
            material.setEjemplares(material.getEjemplares()+1);
        }
     }
     
     public static Material devolverMaterial(int id)//Esta funcion devuelve material despues de una busqueda por id
     {
         Material material=null;
         Iterator<Material> it = materiales.iterator();
         int i=0;
         while(it.hasNext())
         {
             material=it.next();
             if(material.getId_material()==id)
             {
                 return material;
             }
         }
        return material;
     }
      
    public static void llenarComboIdMaterial(JComboBox combo)//Esta funcion sirve para llenar los comboBox donde se requieran materiales
    {
        Iterator <Material> it=materiales.iterator();
        Material material;
        while(it.hasNext())
        {
            material=it.next();
            if(material.getEjemplares()>0)
            {
                combo.addItem(material.getId_material());
            }
        
        }
    }
    public static void editarLibroCombo(JComboBox combo)//Esta funcion es para llenar el combo box de editarLibros
    {
        Iterator <Material> it=materiales.iterator();
        Material material;
        while(it.hasNext())
        {
            material=it.next();
            if(material instanceof Libro)
            {
                combo.addItem(material.getId_material());
            }
        
        }
    }
    public static void editarRevistaCombo(JComboBox combo)//Esta funcion es para llenar el combo box de editarLibros
    {
        Iterator <Material> it=materiales.iterator();
        Material material;
        while(it.hasNext())
        {
            material=it.next();
            if(material instanceof Revista)
            {
                combo.addItem(material.getId_material());
            }
        
        }
    }
    public static void modificarEjemplaresMaterial(Material material)
    {
        material.setEjemplares(material.getEjemplares()-1);
        if(material.getEjemplares()==0)
        {
         material.setStatus(false);
        }
    }
    
    ///// &&&&&& Excepciones&&&&&&&&&&&&&&&&////
    public static void validarTitulo(JTextField cadena) throws Excepcion//Este metodo valida que se haya ingresado texto para el titulo de un material
    {
       if(cadena.getText().isEmpty())
        {
            throw new Excepcion("Debes ingresar texto");
        }
        
    
    }
    public static void validarCadena(JTextField cadena) throws Excepcion//Valida que la cadena no sea numero y tenga texto
    {
        if(cadena.getText().isEmpty())
        {
            throw new Excepcion("Debes ingresar texto");
        }  
        for(int i=0;i<cadena.getText().length();i++)
        {
                if(!Character.isLetter(cadena.getText().charAt(i)))
                {
                    throw new Excepcion("No debes ingresar numeros, solo letras para esta seccion, error en Autor,Editorial o Categoria"+cadena.getText());
                } 
        } 
        
    }
   public static void validarEjemplares(int ejemplares) throws Excepcion//Valida que los ejemplares registrados sean mayores a 0
   {
       if(ejemplares<=0)
       {
           throw new Excepcion("El numero de ejemplares debe ser mayor a 0");
       }
   
   }
   public static void validarEjemplares(JTextField ejemplares) throws Excepcion
   {
       if(ejemplares==null)
        {
            throw new Excepcion("Debes ingresar texto");
        }
       
       for(int i=0;i<ejemplares.getText().length();i++)
        {
                if(Character.isLetter(ejemplares.getText().charAt(i)))
                {
                    throw new Excepcion("No debes ingresar letras, solo numeros para los ejemplares");
                } 
        }
       Integer entero = Integer.valueOf(ejemplares.getText());
       if(entero<0)
       {
           throw new Excepcion("Tienes que tener mas de un ejemplar");
       }
       if(!(entero%1==0))
       {
           throw new Excepcion("Tienes que poner un numero entero para los ejemplares");
       }
       
   }
   public static void validarAnio(JTextField anio) throws Excepcion
   {
       if(anio.getText().isEmpty())
        {
            throw new Excepcion("Debes ingresar texto");
        }
       
       for(int i=0;i<anio.getText().length();i++)
        {
                if(Character.isLetter(anio.getText().charAt(i)))
                {
                    throw new Excepcion("No debes ingresar letras, solo numeros para el anio");
                } 
        }
       Integer entero = Integer.valueOf(anio.getText());
       if(entero<999)
       {
           throw new Excepcion("¿De verdad conseguiste un libro tan viejo?");
       }
       if(entero>2019)
       {
           throw new Excepcion("¿Como conseguiste ese libro del fututo?");
       }
       if(!(entero%1==0))
       {
           throw new Excepcion("Tienes que poner un numero entero para los anios");
       }
       
   }
   public static void validaraAnio(int anio) throws Excepcion
   {
       if(anio<999)
       {
           throw new Excepcion("¿De verdad conseguiste un libro tan viejo?");
       }
       if(anio>2019)
       {
           throw new Excepcion("Todavia no llegamos a ese anio");
       }
   
   }
   public static void validarFecha(JDateChooser fecha) throws Excepcion
   {
   
       if(fecha.getDate()==null)
       {
           throw new Excepcion("Elige una fecha por favor");
       }
   }
   public static void validarFoto(String foto) throws Excepcion
   {
       if(foto.isEmpty())
       {
           throw new Excepcion("Elige una imagen por favor");
       }
   }
   /////////////////////////$$$$$$$$$$$$$$$Metodos de Materia$$$$$$$$$$$$$$$$$$$$$$$$$$$//////////////////////////////
}
