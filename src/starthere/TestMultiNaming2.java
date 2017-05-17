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
public class TestMultiNaming2 extends Thread{  
     public void run(){  
      System.out.println(Thread.currentThread().getName());  
     }  
     public static void main(String args[]){  
      TestMultiNaming2 t1=new TestMultiNaming2();  
      TestMultiNaming2 t2=new TestMultiNaming2();  
      
      t1.start();  
      t2.start();  
     }  
    }  
