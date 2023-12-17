import java.util.ArrayList;



public class Student extends User {
    protected ArrayList<String> enrolledCourse;
    
    public Student(String Name, int id){
        super(Name,id);
        this.enrolledCourse = new ArrayList<>();
    }

    public void enrolledCourse(String course){
        enrolledCourse.add(course);
    }
    
    public String getUserDetails(){
        return super.getUserDetails() + "\n Enrolled Courses:"+ enrolledCourse.toString();
    }
    
}
