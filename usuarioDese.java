public class usuarioDese{
public static String nombre;
public static String apellidos;
public static String nombreusuario;
public static String genero;
public static String estadoCivil;
public static String estudios;
public static String destresas;
private String contraseña;
private int cedula;
public int edad;
private String fechanacimiento;


 
 public static String getNombre() {
   return nombre;
 }
 
 public static String getApellidos() {
return apellidos;
}

public static String getNombreusuario() {
return nombreusuario;
}

public static String getGenero() {
return genero;
}

public static String getEstadoCivil() {
return estadoCivil;
}

public static String getEstudios() {
return estudios;
}

public static String getDestresas() {
return destresas;
}

public String getContraseña (){
 return contraseña;  
}

public int getCedula(){
 return cedula;
}

public int getEdad (){
 return edad;   
}

public String getFechanacimiento (){
 return fechanacimiento;   
}


public static void setNombre(String nombre) {
usuarioDese.nombre = nombre;
}

public static void setApellidos(String apellidos) {
usuarioDese.apellidos = apellidos;
}

public static void setNombreusuario(String nombreusuario) {
usuarioDese.nombreusuario = nombreusuario;
}

public static void setGenero(String genero) {
usuarioDese.genero = genero;
}

public static void setEstadoCivil(String estadoCivil) {
usuarioDese.estadoCivil = estadoCivil;
}

public static void setEstudios(String estudios) {
usuarioDese.estudios = estudios;
}

public static void setDestresas(String destresas) {
usuarioDese.destresas = destresas;
}

public void setContraseña(String contraseña) {
this.contraseña = contraseña;
}

public void setCedula(int cedula) {
this.cedula = cedula;
}

public void setEdad(int edad) {
this.edad = edad;
}

public void setFechanacimiento(String fechanacimiento) {
this.fechanacimiento = fechanacimiento;
}

public static void main (String []args){
String total = getNombre() + getApellidos() + getNombreusuario() + getGenero() + getEstadoCivil() + getEstudios() + getDestresas();
System.out.println (total);
}
}
