package a01oopextensdemo;

public class Animal {
    //权限修饰符：
    //private:子类就无法访问了
    //私有：只能在本来使用

    //注意事项：
    //子类只能访问父类的非私有成员
    public void eat(){
        System.out.println("吃");
    }

    public void drink(){
        System.out.println("喝");
    }
}
