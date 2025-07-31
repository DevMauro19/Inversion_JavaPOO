package com.general.Ejercicio;

public class Gerente extends Empleado{
    private double bonoAnual;

    public Gerente(String id, String nombre, double salarioBase, String puesto, double bonoAnual){
        super(id,nombre,salarioBase,puesto);
        this.bonoAnual=bonoAnual;
    }


    public double getBonoAnual() {
        return bonoAnual;
    }

    public void setBonoAnual(double bonoAnual) {
        this.bonoAnual = bonoAnual;
    }

    public double calcularSalario(){
        return this.bonoAnual*0.1;
    }
    @Override
    public double calcularSalrioNeto() {
        return (calcularSalario()  + super.calcularSalrioNeto());
    }
}
