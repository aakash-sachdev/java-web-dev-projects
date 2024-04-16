
public class StudentPractice {

    public static void main(String[] args){

        Student student1 = new Student("Aakash",7590,2, 3.9);
//        Student student2 = new Student("Hitesh");
//        Student student3 = new Student("Emily");

        System.out.println("Name: " + student1.getName());
        System.out.println("Name: " + student1.getStudentId());
        System.out.println(student1.getStudentId());
//        System.out.println(student2.getStudentId());
//        System.out.println(student3.getStudentId());
//        System.out.println("GPA: " + student2.getGpa());
        System.out.println(student1.studentInfo());
    }
}
