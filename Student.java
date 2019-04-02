import java.util.ArrayList;

/**
 * Student class
 * @author Caroline
 *
 */
public class Student 
{
	private int ID;
	private String name;
	private ArrayList<Course> enrolled;
	private ArrayList<Course> completed;
	
	public Student(int ID, String name, ArrayList<Course> enrolled, ArrayList<Course> completed)
	{
		this.ID = ID;
		this.name = name;
		this.enrolled = enrolled;
		this.completed = completed;
	}

}
