package a4staticdemo;

public class StudentTest {
    public static void main(String[] args){
        Student.teacherName = "阿伟老师";

        Student s1 = new Student();
        System.out.println("s1: " + s1);
        s1.name = "张山";
        s1.age = 23;
        s1.show1();

        System.out.println("================================================");

        Student s2 = new Student();
        System.out.println("s2: " + s2);
        s2.name = "李四";
        s2.age = 21;
        s2.show1();
    }
}
