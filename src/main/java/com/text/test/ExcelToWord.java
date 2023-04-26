//package com.text.test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class ExcelToWord {
//    public static void main(String[] args) {
//        // 创建数据列表
//        List<User> userList = new ArrayList<>();
//        userList.add(new User("张三", 25, "男"));
//        userList.add(new User("李四", 28, "女"));
//        userList.add(new User("王五", 22, "男"));
//
//        // 导出数据到Excel文件
//        String fileName = "userList.xlsx";
//        EasyExcel.write(fileName, User.class).sheet("用户信息").doWrite(userList);
//
//        System.out.println("数据导出成功：" + fileName);
//    }
//
//    // 定义数据类
//    static class User {
//        private String name;
//        private Integer age;
//        private String gender;
//
//        public User(String name, Integer age, String gender) {
//            this.name = name;
//            this.age = age;
//            this.gender = gender;
//        }
//        // 构造函数和getter/setter方法省略
//    }
//}
