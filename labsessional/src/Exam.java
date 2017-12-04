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
public class Exam extends Admin {
    
  private int marks;
  private String name;
    
    public Exam(int marks,String name,CalculateExam obj)
    {
     super(obj);   
     this.marks=marks;
     this.name=name;
    }
    
    public void calculate()
    {
     obj.aggregateExam(marks, name);
    
    }
}
