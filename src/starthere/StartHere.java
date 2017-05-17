/*
 * welcom to my program.
 * my name is Nichlas Nielsen
 * i am currently studying at Easj Næstved in programming  .
 * my Email is : Windshield2012@hotmail.com
 * Licensed under GNU https://www.gnu.org/licenses/fdl.html
 */
package starthere;

import java.awt.Toolkit;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import sun.applet.Main;

/**
 *
 * @author Nichlas
 */
public class StartHere {

    public static void main(String[] args) {
        Thread t = new Thread() {
            public void run() {
                Toolkit.getDefaultToolkit().beep();
                System.out.println("BEEP");
                for (int i = 0; i < 10; i++) {
                    System.out.println("This is Thread t");
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        //TODO Auto-generated catch block
                        e.printStackTrace();
                    }

                }
            }
        };
        t.start();

        Thread t2 = new Thread() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("This is thread t2");
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        //TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }

            }
        };
        t2.start();

    }

 
    }

