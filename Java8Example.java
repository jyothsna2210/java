package javabasics.java8;
import java.util.*;
import java.util.stream.Collectors;

public class Java8Example {
    public static void main(String args[])
    {
        Person22 p1=new Person22("Jyothsna",21,"softwareengineer");
        Person22 p2=new Person22("yogi",18,"ca");
        Person22 p3=new Person22("vamsee",24,"developer");
        Person22 p4=new Person22("kusuma",21,"tester");
        Person22 p5=new Person22("jbhavani",21,"SE");
        List<Person22>list=new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
       Map<String,List<Person22>>listMap= list.stream().collect(Collectors.groupingBy(Person22->Person22.getDesignation()));
        System.out.println(listMap);
    }
}
class Person22 {
    String name;
    int age;
    String designation;

    public Person22(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDesignation() {
        return designation;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", designation='" + designation + '\'' +
                '}';
    }
}