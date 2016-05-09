/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritence;

/**
 *
 * @author User
 */
public class Inheritence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A obj1=new A();
        obj1.i=89;
        obj1.j=90;
        obj1.showij();
        B obj2=new B();
        obj2.i=1;
        obj2.j=3;
        obj2.k=33;
        obj2.showijk();
        A obj3=new A();
        B obj4=new B(1,2,3);
        obj3=obj4;
        obj3.showij();
        
        
    }
    
}
