package com.general.mamifero;

import com.general.general.Animal;

public class Perro extends Animal {

    public void mostrarInfo(){
        System.out.println("el perro come: "+this.tipoAlimentacion);
        this.dormir();
    }
}
