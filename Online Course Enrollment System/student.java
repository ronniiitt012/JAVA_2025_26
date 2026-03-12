
public class student {
    private int studentId;
    private String studentName;
    public student(int studentId, String studentName){
        this.studentId=studentId;
        this.studentName=studentName;
    }
    public int getstudentId(){
        return studentId;
    }
    public String getstudentName(){
        return studentName;
    }
    public void displaystud() {
        System.out.println("student id : "+studentId);
        System.out.println("student name : "+studentName);
    }
}
