package com.ithema.literal;

public class LiteralDemo {
    public static void main(String[] args) {
        //1.整数
        System.out.println(666);
        //2.小数
        System.out.println(99.5);
        //字符
        System.out.println('a');
        System.out.println('0');
        System.out.println('中');
//        System.out.println('中国'); wrong
        System.out.println(' ');
//        System.out.println(''); wrong
        //特殊字符，\n \t
        System.out.println('中');
        System.out.println('\n');
        System.out.println('国');
        System.out.println('\t');

        //4.字符串，注意用双引号
        System.out.println("我爱你中国abc");
        System.out.println("");
        System.out.println(" ");
        System.out.println("我");

        //布尔值，只有ture和false
        System.out.println(true);
        System.out.println(false);

    }
}
