package com.general.Ejercicio;


public class Empleado{
    //Atributos

    private String id;
    private String nombre;
    protected double salarioBase;
    public String puesto;

    //constructor
    public Empleado (String id, String nombre, double salarioBase, String puesto){
        this.id=id;
        this.nombre=nombre;
        this.salarioBase=salarioBase;
        this.puesto=puesto;
    }

    //geters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double calcularSalrioNeto(){
        return this.salarioBase;
    }

    //generar reporte
    private void generarReporteInterno(){
        System.out.println(this.id +" "+ this.nombre);
    }
}
