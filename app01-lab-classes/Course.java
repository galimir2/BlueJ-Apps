
/**
 * In this class there will be stored information about courses in university.
 * All courses have a title and a code number.
 * 
 * @author Galimir Bozmarov
 * 
 * @version 1.0 9/10/2020
 */
public class Course
{
    // Attributes
    private String title;
    private String codeNumber;

    /**
     * Constructor for objects of class Course
     * it saves the title and the code number
     */
    public Course(String title, String codeNumber)
    {
        this.title = title;
        this.codeNumber = codeNumber;
    }
    
    /**
     * This code is going to print out the title and the codeNumber of the course.
     *
     */
    public void print()
    { 
        System.out.println("Course: " + title + " " + codeNumber);
    }

}
