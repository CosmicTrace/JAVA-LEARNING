package a3staticdemo;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // 创建一个集合用来存储学生对象
        ArrayList<Student> list = new ArrayList<>();

        //创建3个学生
        Student stu1 = new Student("张三", 23, "男");
        Student stu2 = new Student("李四", 24, "女");
        Student stu3 = new Student("王五", 25, "男");

        //把学生对象添加到集合中
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        //调用工具类中的方法
        int maxAgeStudent = StudentUtil.getMaxAgeStudent(list);
        System.out.println(maxAgeStudent);
    }
}
