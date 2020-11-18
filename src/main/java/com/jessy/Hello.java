package com.jessy;

public class Hello {
    public static void main(String[] args) {
//        System.out.print("Hello World");
        Person p = new Person(66.5f, 1.7f);
        p.hello();
        p.weight = 66.5f;
        p.height = 1.7f;
        System.out.println(p.bmi());
/*        int age = 19;
        Integer age2 = 19;
        char c = 'B';
        Character c2 = 'A';
        byte b = 120;
        float weight = 66.5f;
        double height = 1.7;
        boolean afult = true;
        boolean enroll = false;
        String name = "Tom";*/

    }
}
