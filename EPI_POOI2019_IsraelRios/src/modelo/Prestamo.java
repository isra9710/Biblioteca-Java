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

/**
 *
 * @author israel
 */
public class Prestamo
{
    public static int id=0;
    public int id_prestamo;
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
        Biblioteca.prestamos.add(new Prestamo(id_prestamo,usuario,fechaSalida,fechaRegreso,status,material));
       
    }
    public static void eliminar(int id_prestamo)
    {
        
    }
    public void setMaterial(Material material) {
        this.material = material;
    }
    
    @Override
    public String toString() {
        return "Prestamo{" + "id_prestamo=" + id_prestamo + ", usuario=" + usuario + ", fechaSalida=" + fechaSalida + ", fechaRegreso=" + fechaRegreso + ", status=" + status + ", material=" + material + '}';
    }

   
    
    
}
