package com.hao.ums.controller;

public class Car {

    public int age;
    public static void main(String[] args) {
        Class<Car> carclass = Car.class;//模板反射对象
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();//名字在栈里，具体对象在堆里
//        car1.age = 1;
//        car2.age = 2;
//        car3.age = 3;
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car3.hashCode());

        Class<? extends Car> aClass1 = car1.getClass();
        Class<? extends Car> aClass2 = car2.getClass();
        Class<? extends Car> aClass3 = car3.getClass();

        System.out.println(aClass1.hashCode());
        System.out.println(aClass2.hashCode());
        System.out.println(aClass3.hashCode());

        ClassLoader classLoader = aClass1.getClassLoader();
        System.out.println(classLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2   AppClassLoader
        System.out.println(classLoader.getParent());//扩展类加载器
        System.out.println(classLoader.getParent().getParent());
    }

}
