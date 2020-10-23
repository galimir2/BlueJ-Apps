
/**
 * This class stores information about a course
 * that enrolled students may want to complete
 *
 * @author Galimir bozmarov
 * @version 1.0 23/Oct/2020
 */
public class Course
{
    // instance variables
    private String codeNo;
    private String title;

    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;
    
    private int courseMark;
    
    private String finalGrade;
    
    /**
     * Constructor for objects of class Course
     */
    public Course(String codeNo, String title)
    {
        // initialise instance variables
        this.codeNo = codeNo;
        this.title = title;
        
        this.courseMark = 0;
        
        this.finalGrade = null;
        
        createModules();
    }
    
    public void createModules()
    {
        module1 = new Module("CO452", "Programming Concepts");
        module2 = new Module("name", "name");
        module3 = new Module("name", "name");
        module4 = new Module("name", "name");
    }

    public void setMark(int mark, String codeNo)
    {
        if(module1.getCodeNo() == codeNo)
        {
            module1.awardMark(mark);
        }
    }
    
    public void addModule(Module module, int moduleNo)
    {
        if(moduleNo == 1)
        {
            this.module1 = module;
            this.module2 = module;
            this.module3 = module;
            this.module4 = module;
        }
    }
    
    
    public void calculateCourseMark()
    {
        if(courseCompleted())
        {
            
           int courseMark = module1.getMark() + module2.getMark() + module3.getMark()
        
           + module4.getMark();
        
           courseMark = courseMark / 4;
        
           print();
        }
        else
        {
            
        }
    }
    
    public boolean courseCompleted()
    
    {
        if((module1.isCompleted()) && (module2.isCompleted()) && (module3.isCompleted()) 
        && (module4.isCompleted()))
        {
            return true;
        }
        else return false;
    }
    
    /**
     * Prints out the details of a course
     */
    public void print()
    {
        // put your code here
        System.out.println("Course " + codeNo + " - " + title);
    }
    
    public void printModules()
    {
        // is going to print out the final course mak
        
        if(courseCompleted())
        {
            System.out.println("Final Mark: " + courseMark);
        }
    }
}
