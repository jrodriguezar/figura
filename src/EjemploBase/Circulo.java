/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploBase;

import ch.aplu.turtle.Turtle;

/**
 *
 * @author jrodriguezar
 */
public class Circulo extends Thread{
    
    private Turtle tortuga;

    public Circulo(Turtle tortuga) {
        this.tortuga = tortuga;
    }

    @Override
    public void run() {
        for (int i = 0; i < 120; i++) {
            this.tortuga.right(3);
            this.tortuga.forward(5);
        }
        this.tortuga.left(90);
        this.tortuga.forward(100);
    }
    
    
}
