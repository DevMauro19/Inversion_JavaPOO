package com.general.Otroxd;

import com.general.Ejercicio.Empleado;
import com.general.Ejercicio.Gerente;

public class DepartamentoRRHH {
    public void mostrarDetallesEmpleado(Empleado empleado){
        System.out.println(empleado.getId() +" "+empleado.getNombre()
        + " "+ empleado.getPuesto() + " "+ empleado.calcularSalrioNeto() );
    }

    public void promoverEmpleado(Empleado empleado, String nuevoPuesto){
        empleado.setPuesto(nuevoPuesto);
        System.out.println("El empleado "+empleado.getNombre()+ " fue accendido a"+ empleado.getPuesto());
    }
}

class EmpresaApp{
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("1234","bowser",20000,"Malomalote");
        System.out.println(empleado1.calcularSalrioNeto());
        Gerente gerente1= new Gerente("2468","DjMario",20000,"Gerente bro", 30000);
        System.out.println(gerente1.calcularSalrioNeto());
    }
}