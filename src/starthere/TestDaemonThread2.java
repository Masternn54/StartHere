/*
 * welcom to my program.
 * my name is Nichlas Nielsen
 * i am currently studying at Easj Næstved in programming  .
 * my Email is : Windshield2012@hotmail.com
 * Licensed under GNU https://www.gnu.org/licenses/fdl.html
 */
package starthere;

/**
 *
 * @author Nichlas
 */
public class TestDaemonThread2 extends Thread{  
     public void run(){  
      System.out.println("Name: "+Thread.currentThread().getName());  
      System.out.println("Daemon: "+Thread.currentThread().isDaemon());  
     }  
      
     public static void main(String[] args){  
      TestDaemonThread2 t1=new TestDaemonThread2();  
      TestDaemonThread2 t2=new TestDaemonThread2();  
      t1.start();  
      t1.setDaemon(true);//will throw exception here  
      t2.start();  
     }  
    }  
