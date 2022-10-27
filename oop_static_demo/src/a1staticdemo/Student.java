package a1staticdemo;

public class Student {
    //属性：姓名 年龄 性别
    //新增：老师的姓名
    private String name;
    private int age;
    private String gender;
    public static String teacherName; //所有 student 类的对象都共享同一个teacherName
    public Student() {
    }
    //ALT+Insert 可以直接插入构造方法和get，set
    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //行为
    public void study(){
        System.out.println(name + "正在学习");
    }

    public void show(){
        System.out.println(name + ", " + age + ", " + gender +", " + teacherName);
    }
}
