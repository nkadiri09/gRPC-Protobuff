package com.naren.protobuff;

import com.naren.models.*;
import com.naren.models.Package;

import java.util.HashMap;
import java.util.Map;

public class ProfilePackageAddressDemo {

    public static void main(String[] args) {

        Package pac = Package.newBuilder().setName("TestPack").setType("Post").setWeight(10).build();
        Map<Integer, String> roleMap = new HashMap<>();
        roleMap.put(2,"TestRol2");
        Address alp = Address.newBuilder().setStreet("623 Estuary trail").setCity("Alp").setZip(56002).build();
        Role role = Role.newBuilder().setRoleType(RoleType.Admin).setName("Admin").build();
        Profile profile = Profile.newBuilder()
                .setAge(22)
                .setName("Narendra")
                .setAddress(alp)
                .addPackage(pac)
                .putSkills(1, "cooking")
                // .putAllRole(roleMap) can add multiple key value pairs
                .setRole(role)
                .build();
        System.out.println("profile is: "+profile);


        Profile profile1 = Profile.newBuilder().build();
        System.out.println("role is: "+profile1.getRole().getName());
        // There is no null value in Protobuff, by default we get an empty values if we don't set explicitly.

    }
}
