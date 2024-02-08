package com.naren.protobuff;

import com.naren.models.Address;
import com.naren.models.Package;
import com.naren.models.Profile;

import java.util.HashMap;
import java.util.Map;

public class ProfilePackageAddressDemo {

    public static void main(String[] args) {

        Package pac = Package.newBuilder().setName("TestPack").setType("Post").setWeight(10).build();
        Map<Integer, String> roleMap = new HashMap<>();
        roleMap.put(2,"TestRol2");
        Address alp = Address.newBuilder().setStreet("623 Estuary trail").setCity("Alp").setZip(56002).build();
        Profile profile = Profile.newBuilder()
                .setAge(22)
                .setName("Narendra")
                .setAddress(alp)
                .addPackage(pac)
                .putRole(1, "TestRole")
                // .putAllRole(roleMap) can add multiple key value pairs
                .build();
        System.out.println("profile is: "+profile);

    }
}
