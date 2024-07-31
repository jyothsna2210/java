package javabasics.java8;
import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    
    public static void main(String args[])
    {
        List<Person>personList=loadPersons();
        Person person=personList.stream().
                filter(per->per.getName().endsWith("a")).
                findFirst().orElse(new Person("keerthi",21));
        System.out.println(person);
        List<Person>othersList=personList.stream().filter(perso->perso.getAge()>20).collect(Collectors.toList());
        othersList.forEach(System.out::println);
    }
    public static List<Person>loadPersons()
    {
List<Person>list=new ArrayList<>();
list.add(new Person("Jyothsna",21));
list.add(new Person("shahar",19));
list.add(new Person("venkat",58));
list.add(new Person("jyothi",38));
return list;
    }
}
