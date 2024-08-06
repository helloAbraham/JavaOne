package com.Abraham.TwoObjectsCompare;

import java.util.Comparator;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Person, Integer> ageAccessor = Person::getAge;
        Comparator<Person> ageComparator = unwrapCompareInt(ageAccessor);

        Person person1 = new Person("Abraham", 41);
        Person person2 = new Person("Wahid", 51);
        int comparisonResult  = ageComparator.compare(person1, person2);

        if(comparisonResult > 0) {
            System.out.println(person1.getName() + " is older than " + person2.getName());
        } else if(comparisonResult < 0) {
            System.out.println(person1.getName() + " is younger than " + person2.getName());
        } else {
            System.out.println(person1.getName() + " and " + person2.getName() + " are the same age");
        }

    }

    private static<I> Comparator<I> unwrapCompareInt(Function<I, Integer> accessor) {
        return Comparator.comparingInt(accessor::apply);
    }

    //This is deprecated,it has my professional USPS project
//    private static<I> Comparator<I> unwrapCompareInt(Function<I, Integer> accessor) {
//        return (x, y) -> Integer.compare(accessor.apply(x), accessor.apply(y));
//    }
}
