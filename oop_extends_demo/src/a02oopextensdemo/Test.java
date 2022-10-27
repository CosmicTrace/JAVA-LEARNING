package a02oopextensdemo;

public class Test {
    public static void main(String[] args){
        //利用空参构造创建子类对象，因为子类中有自动生成的空参构造
        Zi z1 = new Zi();

        //利用带参构造创建子类对象，报错则因为不能继承父类
        //Zi z2 = new Zi("张山", 23);
    }
}
