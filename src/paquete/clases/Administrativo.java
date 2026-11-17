/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.clases;

/**
 *
 * @author user
 */
public class Administrativo extends Empleado
{
    private String cargo;

    public Administrativo(String cargo, char tipo, String nom, String dire, float sueldoB) {
        super(tipo, nom, dire, sueldoB);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String VerInfo() {
        return super.VerInfo() +
                "\nCargo: " + this.cargo;
    }

    @Override
    public void CalcularBono() 
    {
        if(this.cargo.equalsIgnoreCase("Secretaria"))
        {
            this.bono = this.sueldoB * 0.0f + 30;
        }
        else if(this.cargo.equalsIgnoreCase("Jefe de seccion"))
        {
            this.bono = this.sueldoB * 0.05f + 150;
        }
        else
        {
            this.bono = this.sueldoB * 0.1f + 300; 
        }
        
        
    }
    
    
    
    
}
