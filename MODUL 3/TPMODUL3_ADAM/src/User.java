public class User {
    protected String Name;
    protected Integer id;

    public User(String Name , int id){
        this.id = id;
        this.Name = Name;

    }

    public String getUserDetails(){
        return "Student - Name :"+Name+","+"ID: "+id;
    }
    
}
