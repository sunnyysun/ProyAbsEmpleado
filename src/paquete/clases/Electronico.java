/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.clases;

/**
 *
 * @author user
 */
public class Electronico extends Empleado
{
    private int antig;

    public Electronico(int antig, char tipo, String nom, String dire, float sueldoB) {
        super(tipo, nom, dire, sueldoB);
        this.antig = antig;
    }

    public int getAntig() {
        return antig;
    }

    public void setAntig(int antig) {
        this.antig = antig;
    }

    @Override
    public void CalcularBono() 
    {
        if(this.antig<3)
        {
            this.bono = 0.005f*this.sueldoB;
        }
        else if(this.antig>=3 && this.antig<5)
        {
            this.bono = this.sueldoB * 0.05f;
        }
        else if(this.antig>=5 && this.antig<7)
        {
            this.bono = this.sueldoB * 0.07f;
        }
        else
        {
            this.bono = this.sueldoB * 0.11f;
        }
    
    }

    @Override
    public String VerInfo() {
        return super.VerInfo() +
                "\nAntiguedad: " + this.antig; 
    }
    
    
   
    
    
    
    
    
}
