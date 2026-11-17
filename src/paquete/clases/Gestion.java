/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.clases;

/**
 *
 * @author user
 */
public class Gestion 
{
    private Empleado[] arreglo;
    private int puntero;

    public Gestion() 
    {
        arreglo = new Empleado[20];
        puntero=0;
    }

    public Empleado[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(Empleado[] arreglo) {
        this.arreglo = arreglo;
    }

    public int getPuntero() {
        return puntero;
    }

    public void setPuntero(int puntero) {
        this.puntero = puntero;
    }
    
    public void Ingresar(Empleado ref)
    {
        if(puntero< arreglo.length)
        {
            arreglo[puntero]=ref;
            puntero++;
        }
        else
        {
            System.out.println("No hay espacio");
        }
    }
    
    public String VerInfo()
    {
        String cad="";
        for(int i=0;i<puntero;i++)
        {
            cad=cad+arreglo[i].VerInfo()+"\n\n";
        }
        return cad;
    }
    
     public void EmpleadoSalarioMayor()
    {
        float mayor=arreglo[0].getSueldoP();
        for(int i=0;i<puntero;i++)
        {
            if(arreglo[i].getSueldoP()>mayor)
            {
                mayor=arreglo[i].getSueldoP();
            }
        }
        
        for(int i=0;i<puntero;i++)
        {
            if(arreglo[i].getSueldoP()==mayor)
            {
                System.out.println(arreglo[i].VerInfo());
            }
        }
    }
     
     public void ElectronicoMasAntig()
     {
         int mayor=0;
         for(int i=0;i<puntero;i++)
         {
             if(arreglo[i] instanceof Electronico)
             {
                 Electronico aux = (Electronico)arreglo[i];
                 if(aux.getAntig()>mayor )
                 {
                     mayor = aux.getAntig();
                 }
             }
         }
         
         for(int i=0;i<puntero;i++)
         {
             if(arreglo[i] instanceof Electronico)
             {
                 Electronico aux = (Electronico)arreglo[i];
                 if(aux.getAntig()==mayor)
                 {
                     System.out.println(aux.VerInfo());
                 }
             }
         }
         
     }
     
     public void MostrarGerentes()
     {
         for(int i=0;i<puntero;i++)
         {
             if(arreglo[i] instanceof Administrativo)
             {
                 Administrativo aux = (Administrativo)arreglo[i];
                 if(aux.getCargo().equalsIgnoreCase("Gerente"))
                 {
                     System.out.println(aux.VerInfo());
                 }
             }
         }
     }
    
    
}
