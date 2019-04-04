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
public class PrestamoSimple extends Prestamo 
{
    private Material material;

    public PrestamoSimple(Material material, Usuario usuario, Date fechaSalida, Date fechaRegreso, boolean status, String tipoPrestamo) {
        super(usuario, fechaSalida, fechaRegreso, status, tipoPrestamo);
        this.material = material;
    }

   

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "PrestamoSimple{" + "material=" + material + '}';
    }

    
    
}
