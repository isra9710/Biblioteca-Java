/*
Nombres: Israel Rios Contreras
Carrera: Ingenieria en informatica
Cuatrimestre: 5
Grupo:B
Evidencia: Integradora
EPI_POO2019_IsraelRios.
*/
package modelo;

/**
 *
 * @author israel
 */
public  class Usuario
{
    private String tipoUsuario,nombre,apellidoP,apellidoM,telefono;
    private boolean retardo, entrega;
    double deuda,multa;
    public static int id=0;
    int id_usuario;

    public Usuario(String tipoUsuario, String nombre, String apellidoP, String apellidoM, String telefono) {
        this.tipoUsuario = tipoUsuario;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.telefono = telefono;
        multa=0.0;
        entrega=true;
        retardo=false;
        deuda=0.0;
        id++;
        id_usuario=id;
    }

    public Usuario() {
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

    public boolean getRetardo() {
        return retardo;
    }

    public void setRetardo(boolean retardo) {
        this.retardo = retardo;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

   

    public boolean getEntrega()
    {
        return entrega;
    }

    public void setEntrega(boolean entrega) 
    {
        this.entrega = entrega;
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
    public int getIdUsuario()
    {
        return id_usuario;
    }

    public void setDeuda(double deuda) 
    {
        this.deuda = deuda;
    }
    
    public  void multa(double deuda)
    {
    
    }

    @Override
    public String toString() 
    {
        return "Usuario{" + "tipoUsuario=" + tipoUsuario + ", nombre=" + nombre + ", apellidoP=" + apellidoP + ", apellidoM=" + apellidoM + ", telefono=" + telefono + ", multa=" + multa + ", entrega=" + entrega + ", deuda=" + deuda + '}';
    }
    
    
}
