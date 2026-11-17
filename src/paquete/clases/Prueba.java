/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.clases;

/**
 *
 * @author user
 */
public class Prueba 
{
    public static void main(String[] args) 
    {
        Gestion GE = new Gestion();
        
         Programador obj1 = new Programador("chips",10,'P',"nom1","dire1",5000);
         obj1.CalcularBono();
         obj1.CalcularSueldoP();
         GE.Ingresar(obj1);
         //System.out.println(obj1.VerInfo());
         
         Electronico obj2 = new Electronico(12,'E',"nom2","dire2",2500);
         obj2.CalcularBono();
         obj2.CalcularSueldoP();
         GE.Ingresar(obj2);
         //System.out.println(obj2.VerInfo());
         
         Administrativo obj3 = new Administrativo("Gerente",'A',"nom3","dire3",15000);
         obj3.CalcularBono();
         obj3.CalcularSueldoP();
         GE.Ingresar(obj3);
         //System.out.println(obj3.VerInfo());
         
         Administrativo obj5 = new Administrativo("Gerente",'A',"nom6","dire6",5000);
         obj5.CalcularBono();
         obj5.CalcularSueldoP();
         GE.Ingresar(obj5);
         
         Electronico obj4 = new Electronico(15,'E',"nom4","dire4",8500);
         obj4.CalcularBono();
         obj4.CalcularSueldoP();
         GE.Ingresar(obj4);         
         
         System.out.println(GE.VerInfo());
         
         System.out.println("Mayor Salario");
         GE.EmpleadoSalarioMayor();
         
         System.out.println("electronico mas antiguo");
         GE.ElectronicoMasAntig();
         
         System.out.println("Mostar gerentes");
         GE.MostrarGerentes();
        
    }
   
    
}
