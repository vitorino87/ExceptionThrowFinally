/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionthrowfinally;

/**
 *
 * @author tiago.lucas
 */
public class ExceptionThrowFinally {

    /**
     * @param args the command line arguments
     */
    //through an exception out of the method
    static void procA(){
        try{
            System.out.println("inside procA");
            throw new RuntimeException("demo");
        }
        finally{
            System.out.println("procA's finally");
        }
    }
    //Return from within a try block
    static void procB(){
        try{
            System.out.println("inside procB");
            return;
        }
        finally{
            System.out.println("procB's finally");
        }
    }
    //Execute a try block normally
    static void procC(){
        try{
            System.out.println("inside procC");
        }
        finally{
            System.out.println("procC's finally");
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            procA();
        }
        catch(Exception e){
            System.out.println("Exception caught");
        }
        procB();
        procC();
    }
    
}
