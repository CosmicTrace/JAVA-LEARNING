package a4staticdemo;
/*
    总结：
        静态方法没有this关键字
        静态方法中只能访问静态
        非静态方法可以访问所有
 */
public class Student {
    String name;
    int age;
    static String teacherName;

    //非静态成员变量的形参中有一个隐藏的this
    //this: 表示当前方法调用者的地址值
    //这个this：是由虚拟机赋值的
    public void show1(Student this){
        System.out.println("this: "+this);
        System.out.println(this.name + ", " + this.age + ", " + teacherName);

        //调用其它方法
        this.show2();
        this.method();
    }



    public void show2(){
        System.out.println("show2");
    }

    //共享则没有this
    public static void method(){
        //this.show1();
        //System.out.println(this.name)
        System.out.println("静态方法");
    }
}
