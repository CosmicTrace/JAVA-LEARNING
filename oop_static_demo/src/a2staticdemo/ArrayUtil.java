package a2staticdemo;

public class ArrayUtil {
    //私有化构造方法
    //不让外界创建对象
    private ArrayUtil(){}


    //定义为静态的，方便调用
    //遍历数组并拼接字符串输出
    public static String printArr(int[] arr){
        //数组拼接
        StringBuilder sb = new StringBuilder();
        sb.append("["); //拼接左括号
        for(int i = 0; i < arr.length; i++){ //遍历数组
            //i 索引 arr[i] 元素
            if(i == arr.length - 1){ //最后一个索引
                sb.append(arr[i]); //最后一个元素
            }else{
                sb.append(arr[i]).append(", "); //如果不是则再进行append
            }
        }
        sb.append("]");//拼接右括号
        return sb.toString(); //返回方法
    }

    //获取平均分
    public static double getAverage(double[] arr){
        double sum = 0;
        for (double v : arr) {
            sum += v;
        }
        return sum/arr.length;
    }
}
