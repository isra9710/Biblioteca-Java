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

    public Prestamo( Usuario usuario, Date fechaSalida,Date fechaRegreso) 
    {
        this.usuario = usuario;
        this.fechaSalida = fechaSalida;
        this.fechaRegreso=fechaRegreso;
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
    
    
}
