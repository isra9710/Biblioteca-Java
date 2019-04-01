/*
Nombres: Israel Rios Contreras
Carrera: Ingenieria en informatica
Cuatrimestre: 5
Grupo:B
Evidencia: Integradora
EPI_POO2019_IsraelRios.
*/
package Modelo;

/**
 *
 * @author israel
 */
public abstract class Usuario
{
    private String tipoUsuario,nombre,apellidoP,apellidoM,telefono;
    boolean multa, entrega;
    double deuda;
    static int id_usuario=0;

    public Usuario(String tipoUsuario, String nombre, String apellidoP, String apellidoM, String telefono) 
    {
        this.tipoUsuario = tipoUsuario;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.telefono = telefono;
        multa=false;
        entrega=false;
        deuda=0.0;
        id_usuario=id_usuario+1;
    }

    public String getTipoUsuario() 
    {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) 
    {
        this.tipoUsuario = tipoUsuario;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP()
    {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) 
    {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() 
    {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) 
    {
        this.apellidoM = apellidoM;
    }

    public String getTelefono() 
    {
        return telefono;
    }

    public void setTelefono(String telefono) 
    {
        this.telefono = telefono;
    }

    public boolean isMulta() 
    {
        return multa;
    }

    public void setMulta(boolean multa)
    {
        this.multa = multa;
    }

    public boolean isEntrega()
    {
        return entrega;
    }

    public void setEntrega(boolean entrega) 
    {
        this.entrega = entrega;
    }

    public static int getId_usuario() 
    {
        return id_usuario;
    }
    
    public void entregar()
    {
        entrega=false;
    }
    public void recoger()
    {
        entrega=true;
    }

    public double getDeuda() 
    {
        return deuda;
    }

    public void setDeuda(double deuda) 
    {
        this.deuda = deuda;
    }
    
    public abstract void multa(double deuda);

    @Override
    public String toString() 
    {
        return "Usuario{" + "tipoUsuario=" + tipoUsuario + ", nombre=" + nombre + ", apellidoP=" + apellidoP + ", apellidoM=" + apellidoM + ", telefono=" + telefono + ", multa=" + multa + ", entrega=" + entrega + ", deuda=" + deuda + '}';
    }
    
    
}
