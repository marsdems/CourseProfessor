import java.sql.*;
import java.util.ArrayList;

public class QueryController {
//This class handles running the queries. the Interface will pass information to this class.
	 private Statement stat;
	 private StudentProfile curStudent; //this is the current student that is loged in that we will run the queries with
	 private schedule studentSchedule;
	 private boolean newStudent = false;
	
	
	public QueryController() throws ClassNotFoundException, SQLException{
		//Initialize the information needed to create this 
		Class.forName("org.sqlite.JDBC");
	    Connection conn =
	      DriverManager.getConnection("jdbc:sqlite:FinalProject.db");
	     stat = conn.createStatement();
	}
	
	/** This is adds a new student giving information from the GUI
	 * and sets them as the student logged in
	 * @throws SQLException 
	 * 
	 */
	public void addNewStudent(String userName, String Password) throws SQLException{
		
		stat.executeUpdate("INSERT INTO USER(null," + userName + "," +Password + ", YEAR);");
		
		newStudent = true;
		
	}

	/**This class handles setting up what happens after a student logs in. This includes getting the current schedule and
	 * setting that student to the login one.
	 * @throws SQLException 
	 */
	public void loggedIn(String userName, String Password ) throws SQLException{
		//TODO: needs a query that gets all the courses a student is currently taking. if this student 
		//than just needs to initialize the schedule that all students will be added to
		 userName = "\"" + userName + "\"";
		 Password =  "\"" + Password + "\"";
		
		//set the student that logged n
		 ResultSet rs = stat.executeQuery("SELECT * FROM USER WHERE name=" + userName + " AND password= " + Password + ";");
		    while (rs.next()) {
		      int id = rs.getInt("sid");
		    }
		    rs.close();
		
		studentSchedule = new schedule();
		
		if(!newStudent){
		//query will have to be run here in a while loop
			course inSchdule = new course();//this is to get course for a student that is not new and already has a schedule currently loading in the database
			studentSchedule.addCourse(inSchdule);		
		}
		
	}
	
	/** Adds a new course into the students schedule that is kept track of in java and the database
	 * 
	 * @param c
	 * @throws SQLException
	 */
	public void addCourseToSchedule(course c ) throws SQLException{
		
		studentSchedule.addCourse(c);
		stat.executeUpdate("INSERT INTO SCHEDULE VALUES(" + curStudent.getID() +"," + c.getCourseId() + ");");
	}
	
	/**runs the query that returns a list of courses given the 
	 * subject selected by the query.
	 * @param subject
	 * @return
	 * @throws SQLException 
	 */
	public ArrayList<course> searchBySubject(String subject) throws SQLException{
		//TODO: need to test this department
		subject =  "\"" + subject + "\"";
		ArrayList<course> foundCourses = new ArrayList<course>();
		
		 ResultSet rs = stat.executeQuery("SELECT * FROM COURSE WHERE DEPARTMENT = " + subject + ";");
		    while (rs.next()) {
		      course fd = new course();
		      
		      fd.setCourseId(rs.getInt("cid"));
		      fd.setCourseName(rs.getString("name"));
		      fd.setDepartment(rs.getString("department"));
		      fd.setStartTime(rs.getInt("beginTime"));
		      fd.setEndTime( rs.getInt("endTime"));
		      
		      foundCourses.add(fd);
		    
		    }
		    rs.close();
		//TODO need to add getting the days of the week, have to convert from bools to ints
		
		
		
		
		return foundCourses;
		
	}
	
	private  boolean[] daysOfWeeks(String [] days){
		boolean[] daysTF = {false, false, false, false, false};
		
		//TODO write implementation
		
		return daysTF;
	}
	

}