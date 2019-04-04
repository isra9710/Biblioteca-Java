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
public class PrestamoProfesor extends Prestamo
{
    
   private Material material1;
   private Material material2;

    public PrestamoProfesor(Material material1, Material material2, Usuario usuario, Date fechaSalida, Date fechaRegreso, boolean status, String tipoPrestamo) {
        super(usuario, fechaSalida, fechaRegreso, status, tipoPrestamo);
        this.material1 = material1;
        this.material2 = material2;
    }

  

    public Material getMaterial1() {
        return material1;
    }

    public void setMaterial1(Material material1) {
        this.material1 = material1;
    }

    public Material getMaterial2() {
        return material2;
    }

    public void setMaterial2(Material material2) {
        this.material2 = material2;
    }

    @Override
    public String toString() {
        return "PrestamoProfesor{" + "material1=" + material1 + ", material2=" + material2 + '}';
    }
   

    

 
    
   
    
    
}
