package a1StaticDemo;

public class StudentTest {
    public static void main(String[] args){
        // 创建第一个学生变量
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(23);
        s1.setGender("男");

        s1.study();
        s1.show();
    }
}
