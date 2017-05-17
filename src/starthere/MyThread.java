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
public class MyThread extends Thread{  
        public void run(){  
            System.out.println("shut down hook task completed..");  
        }  
    }  
      
    class TestShutdown1{  
    public static void main(String[] args)throws Exception {  
      
    Runtime r=Runtime.getRuntime();  
    r.addShutdownHook(new MyThread());  
          
    System.out.println("Now main sleeping... press ctrl+c to exit");  
    try{Thread.sleep(3000);}catch (Exception e) {}  
    }  
    }  


    class TestShutdown2{  
    public static void main(String[] args)throws Exception {  
      
    Runtime r=Runtime.getRuntime();  
      
    r.addShutdownHook(new Thread(){  
    public void run(){  
        System.out.println("shut down hook task completed..");  
        }  
    }  
    );  
          
    System.out.println("Now main sleeping... press ctrl+c to exit");  
    try{Thread.sleep(3000);}catch (Exception e) {}  
    }  
    }  