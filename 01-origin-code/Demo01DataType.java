/**
 * 当数据类型不一样时，将会发生数据类型转换
 * 自动类型转换
 */
public class Demo01DataType {
  public static void main(String[] args) {
    System.out.println(1024); // 这就是一个整数，默认就是int类型
    System.out.println(3.14); // 这就是一个浮点数，默认就是double类型

    long num = 100; // 左边是lang类型，右边是整形，左右不一样
    System.out.println(num);
  }
}
