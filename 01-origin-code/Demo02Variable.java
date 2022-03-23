public class Demo02Variable {
  public static void main(String[] args) {
    // 创建一个变量
    int num1;
    num1 = 0;
    System.out.println(num1);
    num1 = 1;
    System.out.println(num1);

    int num2;
    // System.out.println(num2); // num2 未赋值不能直接使用
    num2 = 200;
    // System.out.println(num3); // 创建变量之前不能使用
    int num3 = 300;

    System.out.println(num2);
    System.out.println(num3);

    {
      int num4 = 400;
      System.out.println(num4);
      int num5 = 500;
      System.out.println(num2); // 父作用域声明了 num2 可以使用
      System.out.println(num5);
    }
    // System.out.println(num5); // num5 在当前作用域没有声明
  }
}