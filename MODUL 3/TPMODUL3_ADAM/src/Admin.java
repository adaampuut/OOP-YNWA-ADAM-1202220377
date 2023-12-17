public class Admin extends User{
    public Admin(String Name, int id){
        super(Name, id);


    }
    public void manageSystem(String course){
        System.out.println(Name+" Is Managing the "+course);
    }
    
    public String getUserDetails(){
        return super.getUserDetails();
    }
}
