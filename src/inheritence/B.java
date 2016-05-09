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
public class B extends A{
    int k;
    B(int l,int i,int j)
    {
        k=l;
        super.i=i;
        super.j=j;
    }
    B()
    {
        
    }
    void showk()
    {
        System.out.println("from sub b class "+ k);
    }
    void showijk()
    {
        System.out.println("i j k :"+ i +" "+j+ " "+k);
    }
    
}
