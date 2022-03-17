## Java 程序开发步骤

- 编写 .java 文件（源程序）
- 编译 javac.exe 编译器 ——> .class 文件（字节码文件）
- 运行 java.exe 解释器（运行再 JVM 上）

```java
// class 名 HelloWorld 必须要文件名完成一样，类是 Java 中所有源代码的基本组织单位
public class HelloWorld {
  // 固定代码，代表 main 方法，程序执行的起点。有点像 c
  public static void main(String[] args) {
    // 打印输出语句
    System.out.println("Hello, World 1 !"); // java 不像 JavaScript ,必须加分号，必须用双引号！！！
  }
}
```

1. 编译生成 .class 文件： `javac HelloWorld.java`
2. 运行 .class 文件： `java HelloWorld`
