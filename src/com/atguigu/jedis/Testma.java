package com.atguigu.jedis;
import java.util.*;

public class Testma {
    public static void main(String[] args) {
        Testma t = new Testma();
        String code = t.getCode(6);
        System.out.println(code);
    }
    private String getCode(int len){
        String code = "";
        for (int i = 0; i < len; i++) {
            int rand = new Random().nextInt(10);
            code += rand;
        }
        return code;
    }

}
