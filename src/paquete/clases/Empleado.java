/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.clases;

/**
 *
 * @author user
 */
public abstract class Empleado 
{
    protected char tipo;
    protected String nom, dire;
    protected float sueldoB, sueldoP, bono;

    public Empleado(char tipo, String nom, String dire, float sueldoB) {
        this.tipo = tipo;
        this.nom = nom;
        this.dire = dire;
        this.sueldoB = sueldoB;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDire() {
        return dire;
    }

    public void setDire(String dire) {
        this.dire = dire;
    }

    public float getSueldoB() {
        return sueldoB;
    }

    public void setSueldoB(float sueldoB) {
        this.sueldoB = sueldoB;
    }

    public float getSueldoP() {
        return sueldoP;
    }

    public void setSueldoP(float sueldoP) {
        this.sueldoP = sueldoP;
    }

    public float getBono() {
        return bono;
    }

    public void setBono(float bono) {
        this.bono = bono;
    }
    
    public void CalcularSueldoP()
    {
        this.sueldoP = this.sueldoB + this.bono;
    }
    
    public abstract void CalcularBono();

    
    public String VerInfo() {
        return "Tipo: " + tipo + 
                "\nNombre: " + nom + 
                "\ndire: " + dire + 
                "\nsueldoB: " + sueldoB + 
                "\nsueldoP: " + sueldoP + 
                "\nbono: " + bono;
    }
    
    
    
}
