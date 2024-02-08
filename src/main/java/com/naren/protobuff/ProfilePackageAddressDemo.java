package com.naren.protobuff;

import com.naren.models.Address;
import com.naren.models.Package;
import com.naren.models.Profile;

import java.util.ArrayList;
import java.util.List;

public class ProfilePackageAddressDemo {

    public static void main(String[] args) {

        Package pac = Package.newBuilder().setName("TestPack").setType("Post").setWeight(10).build();
        List<Package> packageList = new ArrayList<Package>();
        packageList.add(pac);
        Address alp = Address.newBuilder().setStreet("623 Estuary trail").setCity("Alp").setZip(56002).build();
        Profile profile = Profile.newBuilder()
                .setAge(22)
                .setName("Narendra")
                .setAddress(alp)
                .addPackages(pac)
                .build();
        System.out.println("profile is: "+profile);

    }
}
