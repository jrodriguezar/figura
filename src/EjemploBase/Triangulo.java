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
public class Triangulo extends Thread{
    
    private Turtle tor;

    public Triangulo(Turtle tor) {
        this.tor = tor;
    }

    @Override
    public void run() {
        this.tor.right(20);
        this.tor.forward(83.8152731);
        this.tor.right(140);
        this.tor.forward(83.8152731);
        this.tor.right(110);
        this.tor.forward(50);
    }
    
    
}
