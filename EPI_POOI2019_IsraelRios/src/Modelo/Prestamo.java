/*
Nombres: Israel Rios Contreras
Carrera: Ingenieria en informatica
Cuatrimestre: 5
Grupo:B
Evidencia: Integradora
EPI_POO2019_IsraelRios.
*/
package Modelo;

import java.util.Date;

/**
 *
 * @author israel
 */
public class Prestamo
{
    static int id_prestamo;
    Material material;
    Usuario usuario;
    Date fechaSalida,fechaRegreso;

    public Prestamo(Material material, Usuario usuario, Date fechaSalida) 
    {
        this.material = material;
        this.usuario = usuario;
        this.fechaSalida = fechaSalida;
    }

    public static int getId_prestamo() {
        return id_prestamo;
    }

    public static void setId_prestamo(int id_prestamo) {
        Prestamo.id_prestamo = id_prestamo;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
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
    
    
}
