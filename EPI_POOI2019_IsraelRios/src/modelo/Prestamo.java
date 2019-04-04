/*
Nombres: Israel Rios Contreras
Carrera: Ingenieria en informatica
Cuatrimestre: 5
Grupo:B
Evidencia: Integradora
EPI_POO2019_IsraelRios.
*/
package modelo;

import java.util.Date;

/**
 *
 * @author israel
 */
public class Prestamo
{
    public static int id_prestamo=0;
    private Usuario usuario;
    private Date fechaSalida,fechaRegreso;
    private boolean status;
    String tipoPrestamo;

    public Prestamo(Usuario usuario, Date fechaSalida, Date fechaRegreso, boolean status, String tipoPrestamo) {
        this.usuario = usuario;
        this.fechaSalida = fechaSalida;
        this.fechaRegreso = fechaRegreso;
        this.status = status;
        this.tipoPrestamo = tipoPrestamo;
        id_prestamo=id_prestamo+1;
    }

    public Prestamo(Usuario usuario, Date fechaSalida, String tipoPrestamo) {
        this.usuario = usuario;
        this.fechaSalida = fechaSalida;
        this.tipoPrestamo = tipoPrestamo;
        status= false;
        id_prestamo=id_prestamo+1;
    }
    

  
    public Prestamo() 
    {
        status= false;
        id_prestamo=id_prestamo+1;
    }

    public static int getId_prestamo() {
        return id_prestamo;
    }

    public static void setId_prestamo(int id_prestamo) {
        Prestamo.id_prestamo = id_prestamo;
    }


    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaRegreso() {
        return fechaRegreso;
    }

    public void setFechaRegreso(Date fechaRegreso) {
        this.fechaRegreso = fechaRegreso;
    }
    public int getIdPrestamo()
    {
        return id_prestamo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "usuario=" + usuario + ", fechaSalida=" + fechaSalida + ", fechaRegreso=" + fechaRegreso + ", status=" + status + ", tipoPrestamo=" + tipoPrestamo + '}';
    }
    
    
    
}
