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
public class PrestamoSimple extends Prestamo 
{
    private Material material;

    public PrestamoSimple(Usuario usuario, Date fechaSalida, Date fechaRegreso,Material material) 
    {
        super(usuario, fechaSalida, fechaRegreso);
        this.material=material;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
    

    
    
}
