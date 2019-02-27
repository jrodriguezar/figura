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
public class Rectangulo extends Thread{
    private Turtle tortuguin;

    public Rectangulo(Turtle tortuguin) {
        this.tortuguin = tortuguin;
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            this.tortuguin.forward(100);
            this.tortuguin.right(60);
        }    
    }
}
