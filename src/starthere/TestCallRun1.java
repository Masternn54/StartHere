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
public class TestCallRun1 extends Thread{  
     public void run(){  
       System.out.println("running...");  
     }  
     public static void main(String args[]){  
      TestCallRun1 t1=new TestCallRun1();  
      t1.run();//fine, but does not start a separate call stack  
     }
     
     
    }  
    class TestCallRun2 extends Thread{  
     public void run(){  
      for(int i=1;i<5;i++){  
        try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
        System.out.println(i);  
      }  
     }  
     public static void main(String args[]){  
      TestCallRun2 t1=new TestCallRun2();  
      TestCallRun2 t2=new TestCallRun2();  
       
      t1.run();  
      t2.run();  
     }  
    }  