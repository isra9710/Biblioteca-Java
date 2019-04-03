/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

    public PrestamoProfesor(Material material1, Material material2, Usuario usuario, Date fechaSalida, Date fechaRegreso) 
    {
        super(usuario, fechaSalida, fechaRegreso);
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
   

    

 
    
   
    
    
}
