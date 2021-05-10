import java.util.*;

public class PrincipalME {
 public static void main (String[]args){
  Scanner scan = new Scanner (System.in);
  UEmpresas empresas = new UEmpresas ();
  usuarioDese desempleado = new usuarioDese ();
  System.out.println ("Bienvenido a Medellin Empleos, el sitio ideal para que" + "\n" + " encuentres tu mejor empleo o para buscar trabajadores.");
  boolean preguntar = true;
    do{
     System.out.println ("\nQue quieres hacer?" + "\n" +
     "0. Salir de la pagina web." + "\n" +
     "1. Ingresar como usuario normal." + "\n" +
     "2. Ingresar como usuario empresa" + "\n" );
      int opcion = scan.nextInt(); 
      String study;
      String estudios;
      switch (String.valueOf(opcion)){
          case "0": 
                    System.out.println ("Saliendo...") ;
                    preguntar = false;
                    break;
           
           case "1": 
                    

      
        System.out.println ("Ingrese su numero de identificación"); 

        int identificacion = scan.nextInt ();
        
        System.out.println ("Ingrese su edad"); 

        int edad = scan.nextInt (); 
          
        System.out.println ("Ingrese su nombre");     

        String nombre = scan.next (); 

        System.out.println ("Ingrese su apellido"); 

        String apellido = scan.next (); 
        
        System.out.println ("Ingrese su genero"); 

        String hola = scan.next (); 

        System.out.println ("Ingrese fecha de nacimiento (escribir de esta manera: dia/mes/año)"); 

        String nacimiento = scan.next ();       

        System.out.println ("Ingrese su nombre de usuario"); 

        String nombreusuario = scan.next (); 

        System.out.println ("Ingrese su estado civil"); 

        String estadocivil = scan.next (); 

        

        System.out.println ("Ingrese sus destresas"); 

        String destresas = scan.next (); 
        
        System.out.println ("Ingrese sus estudios (Bachillerato, Universidad, Tecnico, etc.)"); 

        estudios = scan.next (); 
    
                    
                    break;
                    
          case "2": 
              
              System.out.println ("Ingrese el nombre de la empresa"); 

              String name = scan.next (); 
        
              System.out.println ("Ingrese el nombre de los CEO"); 
        
              String nombreceo = scan.next (); 
        
              System.out.println ("Ingrese su nombre de usuario"); 
        
              String nameusuario = scan.next (); 
        
              System.out.println ("Ingrese la contraseña de la cuenta"); 
        
              String contraseña = scan.next (); 
              
              System.out.println ("Ingrese los requisitos que busca la empresa"); 
        
              String requisitos = scan.next ();
        
              System.out.println ("En que se especializa la empresa?"); 
        
              String especializacion = scan.next (); 
              
              System.out.println ("Ingrese que nivel de estudios busca");
              
              study = scan.next ();
                            
                    break;
              
           
           default: System.out.println ("Comando incorrecto");
                    
                     break;
      }
     } while (preguntar);
  }
}