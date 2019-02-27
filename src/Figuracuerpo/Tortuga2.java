package Figuracuerpo;

import ch.aplu.turtle.Turtle;

/**
 *
 * @author Jhon
 */
public class Tortuga2 extends Thread{
    
    private Turtle tortuga;

    public Tortuga2(Turtle tor) {
        this.tortuga = tor;
    }

    @Override
    public void run() {
        this.tortuga.penUp();
        this.tortuga.left(20);
        this.tortuga.forward(5);
        this.tortuga.right(70);
        this.tortuga.forward(20);
        this.tortuga.left(50);
        this.tortuga.penDown();
        
        this.tortuga.right(135);
        this.tortuga.forward(36.00684839);
        this.tortuga.right(135);
        this.tortuga.forward(30);
        this.tortuga.right(100);
        this.tortuga.forward(25.8965397); 
        this.tortuga.penUp();
        
        this.tortuga.left(100);
        this.tortuga.forward(84);
        this.tortuga.right(90);
        this.tortuga.penDown();
        this.tortuga.left(135);
        this.tortuga.forward(36.00684839);
        this.tortuga.left(135);
        this.tortuga.forward(30);
        this.tortuga.left(100);
        this.tortuga.forward(25.8965397); 
        this.tortuga.penUp();
        this.tortuga.right(100);
        
        System.out.println("X: " + this.tortuga.getX() + "Y: " + this.tortuga.getY());
        
        this.tortuga.forward(13.3892119);
        this.tortuga.right(90);
        this.tortuga.forward(17.6390681);
        this.tortuga.penDown();
        this.tortuga.forward(8);
        this.tortuga.left(90);
        this.tortuga.forward(20);
        this.tortuga.left(90);
        this.tortuga.forward(8);
        this.tortuga.right(90);
        this.tortuga.forward(17);
        this.tortuga.right(90);
        this.tortuga.forward(8);
        this.tortuga.left(90);
        this.tortuga.forward(20);
        this.tortuga.left(90);
        this.tortuga.forward(8);
        this.tortuga.penUp();
        this.tortuga.forward(1000);
    }   
}