package com.naren.protobuff;

import com.naren.models.Profile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ProfileDemo {
    public static void main(String[] args) throws IOException {
        Profile person1 = Profile.newBuilder()
                .setAge(22)
                .setName("Narendra")
                .build();
        System.out.println("Person is: " + person1);

        Path path = Paths.get("sam.txt");

        Files.write(path, person1.toByteArray());

        byte[] bytes = Files.readAllBytes(path);
        Profile newPerson = Profile.parseFrom(bytes);
        System.out.println("newPerson is: "+newPerson);
    }
}
