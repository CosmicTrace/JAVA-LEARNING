package a5staticdemo;

public class Test {
    public static void main(String[] args){
        //[]： 数组
        //String: 数据类型
        //args: 数组名

        System.out.println(args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("args遍历 " + args[i]);
        }
    }
}
