import java.util.*;

/**
 * The Student class represents a student in a student administration system.
 * It holds the student details relevant in our context.
 * 
 * @author Galimir Bozmarov
 * @version 1.0
 */
public class Student
{
    // the student's full name
    private String name;
    // the student ID
    private String id;
    // the amount of credits for study taken so far
    private int credits;
    
    private Course course;
    
    /**
     * This will create a new student with a given name and ID number.
     */
    public Student(String fullName, String studentID)
    {
        this.name = fullName;
        this.id = studentID;
        this.credits = 0;
    }

    /**
     * This will return the full name of the student.
     */
    public String getName()
    {
        return name;
    }

    /**
     * If there is a mistake with the name this will set a new student name.
     */
    public void changeName(String replacementName)
    {
        name = replacementName;
    }

    /**
     * Return the student ID of this student.
     */
    public String getStudentID()
    {
        return id;
    }

    /**
     * Add some credit points to the student's accumulated credits.
     */
    public void addCredits(int additionalPoints)
    {
        this.credits += additionalPoints;
    }

    
    /**
     * Return the number of credit points this student has accumulated.
     */
    public int getCredits()
    {
        return credits;
    }

    /**
     * Return the login name of this student. The login name is a combination
     * of the first four characters of the student's name and the first three
     * characters of the student's ID number.
     */
    public String getLoginName()
    {
        return name.substring(0,4) + id.substring(0,3);
    }
    
    /**
     * Print the student's name and ID number to the output terminal.
     */
    public void print()
    {
        System.out.println(name + ", student ID: " + id + ", credits: " + credits);
    }
    
    /**
    * This method will enroll the student to a course 
    */
    public void enrollOnCourse(Course course)
    {
        this.course = course;
    }
}
