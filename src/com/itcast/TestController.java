package com.itcast;


import org.junit.Test;

public class TestController {
  
    public static void main(String[] args) {
        System.out.println("Web_test 测试");
    }

    @Test
    public void test(){
        // i 的for循环
        int i = 10;
        for (int j = 0; j < i; j++) {
            System.out.println("j:"+j);
        }
        // 数组for循环

        int[] arr = new int[10];
        for (int x : arr) {
            System.out.println("x:"+x);
        }

        // if
        String str = null;
        if (str == null) {
            System.out.println("str is null");
        }
        if (str != null) {
            System.out.println("str is not null");
        }

    }

}
