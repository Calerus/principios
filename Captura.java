public class Captura 
{ 
    private int cantidadEmpresas; 
    private int cantidadUsuarios; 
  
    public int getCantidadEmpresas() { 
        return cantidadEmpresas; 
    } 
  
    public void setCantidadEmpresas(int cantidadEmpresas) { 
        this.cantidadEmpresas = cantidadEmpresas; 
    } 
  
    public int getCantidadUsuarios() { 
        return cantidadUsuarios; 
    } 
  
    public void setCantidadUsuarios(int cantidadUsuarios) { 
        this.cantidadUsuarios = cantidadUsuarios; 
    } 
  
    public void cantidadEmpresas (){ 
        //referencia al metodo del usuario de la empresa y lo toma al metodo de captura 
        UEmpresas empresa1 = new UEmpresas(); 
        String NombreE = empresa1.getNombre(); 
        String RequisitosE = empresa1.getRequisitos(); 
        //referencia al metodo de usuario desempleado y lo toma al metodo de captura 
        usuarioDese usuario1 = new usuarioDese (); 
        String NombreDese = usuario1.getNombre(); 
        String destresas = usuario1.getDestresas(); 
  
    } 
} 

