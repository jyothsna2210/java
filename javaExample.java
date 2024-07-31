package javabasics.java8;
import java.util.*;
public class javaExample {
    public static void main(String args[])
    {
        Person1 p1=new Person1("Jyothsna",21,"software");
        Person1 p2=new Person1("Yogi",18,"CA");
        Person1 p3=new Person1("Vamsee",24,"DEveloper");
        Person1 p4=new Person1("Bhavani",21,"tester");
        Person1 p5=new Person1("jkusuma",21,"SE");
        List<Person1>list=new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);

        Map<String,List<Person1>>person1ListMap=new HashMap<>();
        for(Person1 p:list)
        {
            List<Person1>personList;
            if(person1ListMap.containsKey(p.getDesignation()))
            {
                personList=person1ListMap.get(p.getDesignation());
            }
            else {
                personList=new ArrayList<>();
                person1ListMap.put(p.getDesignation(),personList);
            }
            personList.add(p);
        }
        System.out.println(person1ListMap);

    }

}
class Person1{
    String name;
    int age;
    String designation;

    public Person1(String name, int age, String designation) {
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
