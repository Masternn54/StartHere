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
public class TestMultiNaming1 extends Thread{  
      public void run(){  
       System.out.println("running...");  
      }  
     public static void main(String args[]){  
      TestMultiNaming1 t1=new TestMultiNaming1();  
      TestMultiNaming1 t2=new TestMultiNaming1();  
      System.out.println("Name of t1:"+t1.getName());  
      System.out.println("Name of t2:"+t2.getName());  
       
      t1.start();  
      t2.start();  
      
      t1.setName("Sonoo Jaiswal");  
      System.out.println("After changing name of t1:"+t1.getName());  
     }  
    }  
