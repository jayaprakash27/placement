package Jan04;
class Student{
    public String name;
    public static String studentClass;
    public static int count = 0;

    public Student(){
        count++;
    }
    public void studentName() {
        System.out.println(name);
    }

    public static void classInfo() {
        System.out.println(studentClass);
    }
}
public class staticfinal {
    public static void main(String[] args) {
        Student.studentClass = "New Students";
        System.out.println(Student.studentClass);
        Student.classInfo();
        System.out.println("Before object creation, count = "+ Student.count);
        Student student1 = new Student();
        Student student2 = new Student();
        
        System.out.println("After object creation, count = "+ Student.count);
        student1.name = "Jay";
        student2.name = "Satya";

        System.out.println(student1.name);
        student2.studentName();
    }
}
