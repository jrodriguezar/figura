/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploBase;

import ch.aplu.turtle.Turtle;
import ch.aplu.turtle.TurtleFrame;
import java.awt.Color;

/**
 *
 * @author Estudiante
 */
public class EscenarioTortugas extends TurtleFrame{
    Turtle tortuga1 = null;
    Turtle tortuga2 = null;
    
    public EscenarioTortugas() {
      tortuga1 = new Turtle(this);
      tortuga1.setColor(Color.yellow);
      tortuga1.setPos(0, 0);
      tortuga2 = new Turtle(this);
      tortuga2.setPos(-85, -60);
    }
    
    public void iniciar(){
       HiloBase hilo = new HiloBase(tortuga1);
       hilo.start();
       
       Triangulo hilo2 = new Triangulo(tortuga2);
       hilo2.start();
    }
    
    
    public static void main(String[] args) {
        EscenarioTortugas escenario = new EscenarioTortugas();
        escenario.iniciar();
        
    }
}
