/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.clases;

/**
 *
 * @author user
 */
public class Programador extends Empleado 
{
    private String especial;
    private int grado;

    public Programador(String especial, int grado, char tipo, String nom, String dire, float sueldoB) {
        super(tipo, nom, dire, sueldoB);
        this.especial = especial;
        this.grado = grado;
    }

    public String getEspecial() {
        return especial;
    }

    public void setEspecial(String especial) {
        this.especial = especial;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    @Override
    public String VerInfo() {
        return super.VerInfo() +
                "\nLista: " + this.especial +
                "\nGrado: " + this.grado;
    }

    @Override
    public void CalcularBono() 
    {
        if(this.grado==0)
        {
            this.bono=50;
        }
        else if(this.grado==1)
        {
            this.bono=100;
        }
        else if(this.grado==2)
        {
            this.bono=250;
        }
        else
        {
             this.bono=500;
        }
    }
    
    
    
    
    
}
