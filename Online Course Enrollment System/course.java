
public class course{
    private int courseID;
    private String courseName;
    private int maxSeats;
    private int enrolledStudents;
    public course(int courseID, String courseName, int maxSeats, int enrolledStudents){
        this.courseID=courseID;
        this.courseName=courseName;
        this.maxSeats=maxSeats;
        this.enrolledStudents=enrolledStudents;
    }
    public int getcourseID(){
        return courseID;
    }
    public String courseName(){
        return courseName;
    }
    public int maxSeats(){
        return maxSeats;
    }
    public int enrolledStudents(){
        return enrolledStudents;
    }
    public void displaycourse(){
        System.out.println("Course ID : "+ courseID);
        System.out.println("course name : "+ courseName);
        System.out.println("maximum seats : "+ maxSeats);
        System.out.println("enrolled students : "+enrolledStudents);
    }
}
