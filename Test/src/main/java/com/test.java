package com;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class test {
    public static void main(String[] args) {
//        JwtBuilder builder = Jwts.builder()
//                .setId("888")
//                .setSubject("曹")
//                .setIssuedAt(new Date())
//                .signWith(SignatureAlgorithm.HS256,"caoxiangshuai");
//        System.out.println(builder.compact());
//
//        ArrayList<String> objects = new ArrayList<>();

        ArrayList<String> manList = new ArrayList<>();
        manList.add("张国立");
        manList.add("张晋");
        manList.add("刘烨");
        manList.add("郑伊健");
        manList.add("徐峥");
        manList.add("王宝强");

        ArrayList<String> womanList = new ArrayList<>();
        womanList.add("郑爽");
        womanList.add("杨紫");
        womanList.add("关晓彤");
        womanList.add("张天爱");
        womanList.add("杨幂");
        womanList.add("赵丽颖");

        List<String> manCollect = manList.stream().filter(s -> s.length() == 3).limit(2).collect(Collectors.toList());
        womanList.stream().filter(s->s.startsWith("杨")).skip(1);
        Stream.concat(manList.stream().filter(s -> s.length() == 3).limit(2),womanList.stream().filter(s->s.startsWith("杨")).skip(1)).forEach(s->
                {
                    Actor actor = new Actor(s);
                    System.out.println(actor);
                }
                );

    }
}
