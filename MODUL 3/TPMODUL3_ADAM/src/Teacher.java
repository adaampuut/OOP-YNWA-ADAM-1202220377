public class Teacher extends User {
    public Teacher(String  Name, int id){
        super(Name, id);
    }

    public void teachClass(String course){
        System.out.println("Pak"+Name+" Is Teaching"+course);

    }
    
    public String getUserDetails(){
        return super.getUserDetails();
    }
}
