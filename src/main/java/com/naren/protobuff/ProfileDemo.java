package com.naren.protobuff;

import com.naren.models.Profile;

public class ProfileDemo {
    public static void main(String[] args) {
        Profile person1 = Profile.newBuilder()
                .setAge(22)
                .setName("Narenda")
                .build();
        System.out.println("Person is:"+person1);
    }
}
