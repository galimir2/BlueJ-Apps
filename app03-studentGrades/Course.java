import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * This class stores information about a course
 * that enrolled students may want to complete
 *
 * @author Galimir Bozmarov
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
    
    private ArrayList<Module> modules;
    
    private int courseMark;
    
    private int credit;
    
    
    private Grades finalGrade = null;
    
    /**
     * Constructor for all objects of class Course
     */
    public Course(String codeNo, String title)
    {
        // initialise instance variables
        this.codeNo = codeNo;
        this.title = title;
        
        modules = new ArrayList<Module>();
        
        this.credit = 0;
        
        this.courseMark = 0;
        
        this.finalGrade = null;
        
        createModules();
    }
    
    public void createModules()
    {
        module1 = new Module("CO452", "Programming Concepts");
        module2 = new Module("CO454", "Digital Technologies and Professional Practice");
        module3 = new Module("CO456", "Web Development");
        module4 = new Module("CO450", "Computer Architectures");
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
            this.module1 = module1;
            this.module2 = module2;
            this.module3 = module3;
            this.module4 = module4;
        }
    }
    
    
    public void calculateCourseMark()
    {
        if(courseCompleted())
        {
            
           int courseMark = module1.getMark() + module2.getMark() + module3.getMark()
        
           + module4.getMark();
        
           courseMark = courseMark / 4;
        
           credit = module1.getCredit() + module2.getCredit() + module3.getCredit() +
           module4.getCredit();
           
           print();
        }
        else
        {
            
        }
    }
    
    /**
     * This has the marking boundries.
     */
    private Grades convertToGrade(int mark)
    {
       if((mark >=0) && (mark <39))
        
        {
            return finalGrade.F;
        }
        
        else if((mark >=40) && (mark <49))
        
        {
            return finalGrade.D;
        }
        
        else if((mark >=50) && (mark <59))
        
        {
            return finalGrade.C;
        }
        
        else if((mark >=60) && (mark <69))
        
        {
            return finalGrade.B;
        }
        
        else if((mark >=70) && (mark <100))
        
        {
            return finalGrade.A;
        }
        else
        {
            return finalGrade.X;
        }
     }
    
    public boolean courseCompleted()
    
    {
        if((module1.isCompleted()) && (module2.isCompleted()) && 
            (module3.isCompleted()) && (module4.isCompleted()))
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
        // is going to print out the final course mark
        if(courseCompleted())
        {
            System.out.println("Modules: ");
            module1.print();
            module2.print();
            module3.print();
            module4.print();
            
            System.out.println("Final Mark: " + courseMark);
            System.out.println("Final Grade: " + convertToGrade(courseMark));
            System.out.println("Final Credit: " + credit);
        }
    }
}
