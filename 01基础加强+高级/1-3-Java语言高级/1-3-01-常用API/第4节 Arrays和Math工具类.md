## Arrays

java.util.Arrays 是一个数组相关地工具类，里面提供了大量静态方法，用来实现数组常见的操作

`public static String toString(数组)` 将参数数组变成字符串（按照默认格式：[元素 1, 元素 2, 元素 3...]）
`public static viod sort(数组)` 按照默认升序（从小到大）对数组的元素进行排序（不会生成新的数组，直接改变原数组）

### 注意事项

1. 如果是数之，sort 默认按照升序从小到大
2. 如果是字符串，sort 默认按照字母升序
3. 如果是自定义类型，那么这个自定义类型的类需要有 Comparable 或者 Comparator 接口的支持

## Math

java.util.Math 类是数学相关的工具类，里面提供了大量的静态方法，完成与数学运算相关的操作

`public static double abs(double num)` 获取绝对值
`public static double ceil(double num)` 向上取整
`public static double floor(double num)` 向下取整
`public static long round(double)` 四舍五入
`Math.PI` 圆周率
