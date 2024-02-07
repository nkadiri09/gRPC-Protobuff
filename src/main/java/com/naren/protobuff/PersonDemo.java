package com.naren.protobuff;

import com.naren.models.Person;

public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = Person.newBuilder()
                .setAge(22)
                .setName("Narenda")
                .build();
        System.out.println("Person is:"+person1);
    }
}
