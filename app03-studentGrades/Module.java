
/**
 * Write a description of class Module here.
 *
 * @author Galimir Bozmarov
 * @version 1.0 23/Oct/2020
 */
public class Module
{
    // Attributes
    private String title;
    
    private String codeNo;
    
    private int mark;
    
    private int credit;
   
    private boolean completed;
    
    /**
     * Constructor for objects of class Module.
     */
    public Module(String title, String codeNo)
    {
        this.title = title;
        this.codeNo = codeNo;
        
        mark = -1;
        credit = 0;
        
        
        completed = false;
    }
    
    public void awardMark(int mark)
    {
        this.mark = mark;
    }
    
    public int getMark()
    {
        return mark;
    }
    
    public int getCredit()
    {
        return credit;
    }

    public String getCodeNo()
    {
        return codeNo;
    }
    
    /**
     *  This will return a mark if its greater or equal to 40 when the course is completed.
     */
    public boolean isCompleted()
    {
        if (mark >= 40)
        {
            credit = 15;
            return true;
        }
        return false;
    }
    
    /**
     *  This will print out the details of the module.
     */
    public void print()
    {
        System.out.println("Module: " + title + " " + codeNo + " Mark = " + mark);
    }
}
