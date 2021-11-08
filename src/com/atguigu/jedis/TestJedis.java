package com.atguigu.jedis;
import redis.clients.jedis.Jedis;

import java.util.Set;

public class TestJedis {

    public static void main(String[] args) {
        //创建Jedis对象
        Jedis jedis = new Jedis("192.168.59.129",6379);
        //测试连接
        String ping = jedis.ping();
        System.out.println(ping);
        //向Redis中添加String类型的数据
        jedis.set("k7","v7");
        //获取Redis中k7对应的值
        String v7 = jedis.get("k7");
        System.out.println("k7对应的值是:" + v7);
        //获取Redis中的所有的key
        Set<String> keys = jedis.keys("*");
        //遍历
        for (String key : keys) {
            System.out.println(key);
        }
        jedis.close();
    }












































}