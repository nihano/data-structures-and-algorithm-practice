package self_practice.lambda.SocialNetworkingApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberTest {
    public static void main(String[] args) {
        Person p1 = new Person("mike",35,Gender.MALE);
        Person p2 = new Person("ozzy",25,Gender.MALE);
        Person p3 = new Person("tom",21,Gender.MALE);
        Person p4 = new Person("ally",45,Gender.FEMALE);

        List<Person> personList = Arrays.asList(p1, p2, p3, p4);


        CheckMember checkMember = person -> person.getGender()==Gender.MALE && person.getAge()>=18 && person.getAge()<=25;
        print(personList, checkMember);
    }

    private static void print(List<Person> personList, CheckMember checkMember){
        List<Person> result = new ArrayList<>();
        for(Person person : personList){
            if( checkMember.test(person)){
                result.add(person);
            }
        }
        System.out.println(result);
    }

}
