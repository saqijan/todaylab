/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package even;

/**
 *
 * @author fa14-bse-097
 */
public abstract class Admin {
    
    protected CalculateExam obj;
    
    protected Admin(CalculateExam obj)
    {
        this.obj=obj;
    }
    
    public abstract void calculate();
}
