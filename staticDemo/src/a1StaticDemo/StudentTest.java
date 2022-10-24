package a1StaticDemo;

public class StudentTest {
    public static void main(String[] args){ //CTRL+D 可以直接复制上一行到下一行
        Student.teacherName = "阿伟老师"; //用类名 Student 直接调用
        // 创建第一个学生变量
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(23);
        s1.setGender("男");
        //s1.teacherName = "阿伟老师";
        s1.study();
        s1.show();

        //2. 创建第二个学生对象
        Student s2 = new Student(); //按住鼠标滚轮下拖可以竖着选择或许按住ALT然后左键一样可以
        s2.setName("李四");
        s2.setAge(23);
        s2.setGender("女");

        s2.study();
        s2.show();
    }
}
