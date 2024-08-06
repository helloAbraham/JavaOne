package com.Abraham.CollectorsExample;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Person> myPeople = Arrays.asList(
                new Person("Abraham", 41, "NYC"),
                new Person("Wahid", 50, "NYC"),
                new Person("Farhan", 29, "STL"),
                new Person("Bob", 25, "Chicago"),
                new Person("Alice", 42, "BGD"),
                new Person("Anne", 23, "San Francisco"),
                new Person("Aiden", 21, "Lawndale"),
                new Person("Danial", 60, "STL")
        );
        /**
         Here processes a list of Person objects, filters them based on certain criteria,
         and collects the results using various Collectors.
         */

        Timestamp currentTime = null;
        System.out.println(currentTime);
        //Collect to list only Name
        List<String> namesList = myPeople.stream()
                .map(Person::getName)
                .collect(Collectors.toList());

        System.out.println("Names List are : " + namesList);

        //Collect to Set
        Set<String> citiesSet = myPeople.stream()
                .map(Person::getCity)
                .collect(Collectors.toSet());
        System.out.println("Cities Set " + citiesSet);

        //Grouping by city
        Map<String, List<Person> > peopleByCity = myPeople.stream()
                .collect(Collectors.groupingBy(Person::getCity));
        System.out.println("People by City" + peopleByCity);


        //Partitioning by Age (<=25)
        Map<Boolean, List<Person> > partitionedByAge= myPeople.stream()
                .collect(Collectors.partitioningBy(person -> person.getAge() <= 25));
        System.out.println("We can see people Age less than 25" + partitionedByAge);

        //Now lets counting
        Map<String, Long> countByCity = myPeople.stream()
                .collect(Collectors.groupingBy(Person::getCity, Collectors.counting()));
        System.out.println("We can count people by city " + countByCity);

        //Joining Names
        String joinedNames = myPeople.stream()
                .map(Person::getName)
                .collect(Collectors.joining(", "));
        System.out.println("Here we can joined Names: " + joinedNames);
    }

    /**
        Above all method if you like to understand read below:

     Explanation:

     Collect to List:
     Collects names of all Person objects into a List<String>.

     Collect to Set:
     Collects unique cities of all Person objects into a Set<String>.

     Grouping by City:
     Groups Person objects by their city into a Map<String, List<Person>>.

     Partitioning by Age:
     Partitions Person objects into two groups based on whether their age is less than or equal to 25 into a Map<Boolean, List<Person>>.

     Counting:
     Counts the number of Person objects in each city into a Map<String, Long>.

     Joining Names:
     Joins all names into a single String separated by commas.
     */


}
