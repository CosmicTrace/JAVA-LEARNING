package a2staticdemo;

public class TestDemo {
    public static void main(String[] args) {
        //测试工具类的两个方法是否正确
    int[] arr1 = {1,2,3,4,5,6,7,8,9,10};//新建一个数组arr1
        String str = ArrayUtil.printArr(arr1);//利用ArrayUtil类调用printArr方法传递arr1，赋值变量str
        System.out.println(str);

        double[] arr2 = {1.5, 4.6, 5.7, 6.8, 7.9, 8.10, 9.11, 10.12, 11.13};
        double avg = ArrayUtil.getAverage(arr2);
        System.out.println(avg);
    }
}
