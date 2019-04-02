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
	
	/**
	 * Enrolls the student in a given course by adding the course onto their list of enrolled courses.
	 * @param acourse
	 */
	//public void enroll(Course acourse)
	
	/**
	 * Finds the course in the students enrolled courses and changes the grade of that course as long as it is found.
	 * If the course does not exist, then CourseNotFoundException applies.
	 * @param acourse
	 */
	//public void changeGrade(Course acourse)
	
	/**
	 * Moves all of the courses that the student is currently enrolled in into the completed course list, finalizing their
	 * grade in that class in the process.
	 */
	//public void rollGrades()
	

}
