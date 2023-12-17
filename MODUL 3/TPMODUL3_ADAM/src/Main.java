import java.util.Scanner;

public class Main {
    protected static String [][] Matkul = 
    {
        {"101","Algoritma Pemrograman","Anto","Jinne"},
        {"102","Perilaku Organisasi", "Karen","Anjaw"}                
    };

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Student student1 = new Student(null, 0);
        Teacher teacher1 = new Teacher("Ujang", 0);
        Admin admin1 = new Admin("Sena", 0);

        boolean validInput = false;

        System.out.println("Masukkan nama mahasiswa: ");
        student1.Name = scanner.nextLine();

        while (!validInput) {
            try {
                System.out.println("Masukkan id mahasiswa: ");
                student1.id = Integer.parseInt(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Salah, Tolong masukkan angka yang benar untuk id ");
            }
        }

        System.out.println("Masukkan Mata kuliah untuk di enroll:");
        String[] courses = scanner.nextLine().split(",");

        for (String[] matkul : Matkul) {
            System.out.println("\nCourse ID: "+ matkul[0]+", ");
            System.out.println("Course Name: "+matkul[1]+", ");
            System.out.println("- Student: "+matkul[2]+", ");
            System.out.println("- Student: "+matkul[3]+", ");   


        }

        System.out.println("");
        for (String course : courses){
            student1.enrolledCourse(course);

        }

        System.out.println(student1.getUserDetails());
        System.out.println("");
        teacher1.teachClass("Algoritma Pemrograman");
        admin1.manageSystem("University system");

        scanner.close();
    }

}
