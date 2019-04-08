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
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

/**
 *
 * @author israel
 */
public class Prestamo
{
    private static int id=0;
    private int id_prestamo;
    private Usuario usuario;
    private Calendar fechaSalida,fechaRegreso;
    private boolean status;
    private Material material;

    public Prestamo(Usuario usuario,Material material, Calendar fechaSalida, Calendar fechaRegreso, boolean status) {
        this.usuario = usuario;
        this.fechaSalida = fechaSalida;
        this.fechaRegreso = fechaRegreso;
        this.status = status;
        this.material=material;
        id++;
        id_prestamo=id;
    }

    public Prestamo(int id_prestamo, Usuario usuario, Calendar fechaSalida, Calendar fechaRegreso, boolean status, Material material) {
        this.id_prestamo = id_prestamo;
        this.usuario = usuario;
        this.fechaSalida = fechaSalida;
        this.fechaRegreso = fechaRegreso;
        this.status = status;
        this.material = material;
    }
    

    public Prestamo(Usuario usuario,Material material ,Calendar fechaSalida,Calendar fechaRegreso) {
        this.usuario = usuario;
        this.fechaSalida = fechaSalida;
        this.material=material;
        status= false;
        id++;
        id_prestamo=id;
    }
    public Prestamo() 
    {
        status= false;
        id++;
        id_prestamo=id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Calendar getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Calendar fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Calendar getFechaRegreso() {
        return fechaRegreso;
    }

    public void setFechaRegreso(Calendar fechaRegreso) {
        this.fechaRegreso = fechaRegreso;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getId_prestamo() {
        return id_prestamo;
    }

    public void setId_prestamo(int id_prestamo) {
        this.id_prestamo = id_prestamo;
    }

    

    

    public Material getMaterial() {
        return material;
    }
    public static void aniadir(int id_prestamo, Usuario usuario, Calendar fechaSalida, Calendar fechaRegreso, boolean status, Material material)
    {
        material.setEjemplares(material.getEjemplares()-1);
        Biblioteca.prestamos.add(new Prestamo(id_prestamo,usuario,fechaSalida,fechaRegreso,status,material));
       
    }
    public static void editar(int id_prestamo, int id_usuario, int id_material,Calendar fechaSalida)
    {
        Usuario usuario;
        Prestamo prestamo;
        Material material;
        usuario=Biblioteca.devolverUsuario(id_usuario);
        prestamo=Biblioteca.devolverPrestamo(id_prestamo);
        material=Biblioteca.devolverMaterial(id_material);
        if(prestamo.getUsuario().getIdUsuario()!=id_usuario)
        {
            prestamo.getUsuario().setDeuda(0);
            prestamo.getUsuario().setEntrega(true);
            prestamo.getUsuario().setRetardo(false);
            prestamo.setUsuario(usuario);
            usuario.setEntrega(false);
            usuario.setDeuda(75);
        }
         
        if(prestamo.getMaterial().getId_material()!= id_material)
        {
            prestamo.getMaterial().setEjemplares(prestamo.getMaterial().getEjemplares()+1);
            prestamo.setMaterial(material);
            prestamo.getMaterial().setEjemplares(prestamo.getMaterial().getEjemplares()-1);
        }
        int dias[]=new int[1];
        Calendar fecha1=prestamo.getFechaSalida();
        Calendar fecha2=fechaSalida;
        Calendar fechaRegreso=Calendar.getInstance();
        Biblioteca.calcularDias(fecha1, fecha2, dias);
        if(dias[0]>0)
        {
            fechaSalida.add(Calendar.DATE,-dias[0]);
            prestamo.setFechaSalida(fechaSalida); 
            fechaRegreso.set(fechaSalida.get(Calendar.YEAR),fechaSalida.get(Calendar.MONTH),fechaSalida.get(Calendar.DATE)+3);
            prestamo.setFechaRegreso(fechaRegreso);
    
        }
        else
        {
            Biblioteca.calcularDias(fecha2, fecha1, dias); 
            if(dias[0]>0)
            {
                fechaSalida.add(Calendar.DATE,-dias[0]);
                prestamo.setFechaSalida(fechaSalida);
                fechaRegreso.set(fechaSalida.get(Calendar.YEAR),fechaSalida.get(Calendar.MONTH),fechaSalida.get(Calendar.DATE)+3);
                prestamo.setFechaRegreso(fechaRegreso);
            }
        }
    }
    public static void eliminar(int id_prestamo)
    {
        Iterator<Prestamo> it=Biblioteca.prestamos.iterator();
        Prestamo prestamo;
        while(it.hasNext())
        {
            prestamo=it.next();
            if(prestamo.getId_prestamo()==id_prestamo)
            {
                //Biblioteca.buscarModificarUsuario(prestamo.getUsuario().getIdUsuario());
                prestamo.getUsuario().setRetardo(false);
                prestamo.getUsuario().setDeuda(0);
                prestamo.getUsuario().setEntrega(true);
                prestamo.getMaterial().setEjemplares(prestamo.getMaterial().getEjemplares()+1);
                it.remove();
            }
        }
        
    }
    public void setMaterial(Material material) {
        this.material = material;
    }
    
    @Override
    public String toString() {
        return "Prestamo{" + "id_prestamo=" + id_prestamo + ", usuario=" + usuario + ", fechaSalida=" + fechaSalida + ", fechaRegreso=" + fechaRegreso + ", status=" + status + ", material=" + material + '}';
    }

   
    
    
}
