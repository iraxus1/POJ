package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var user1 = new User().setName("Adam").setPersonDetails(new Person().setSurname("Kupiecki").setAge(10).setPhoneNumbers(List.of("123456789", "0987654321")).setAddresses(List.of(new Address().setStreetName("Q1").setPostCode("Q1").setFlatNumber(12).setHouseNumber(12).setCity("Q1").setCountry("Q1"), new Address().setStreetName("Q2").setPostCode("Q2").setFlatNumber(13).setHouseNumber(13).setCity("Q2").setCountry("Q2"))));
        var user2 = new User().setName("Maciej").setPersonDetails(new Person().setSurname("Podziwiak").setAge(42).setPhoneNumbers(List.of("123409876", "543217890")).setAddresses(List.of(new Address().setStreetName("W1").setPostCode("W1").setFlatNumber(14).setHouseNumber(14).setCity("W1").setCountry("W1"))));
        var user3 = new User().setName("Anna").setPersonDetails(new Person().setSurname("Suraniek").setAge(52).setPhoneNumbers(List.of("217529348", "295762105")).setAddresses(List.of(new Address().setStreetName("E1").setPostCode("E1").setFlatNumber(16).setHouseNumber(16).setCity("E1").setCountry("E1"), new Address().setStreetName("E2").setPostCode("E2").setFlatNumber(17).setHouseNumber(17).setCity("E2").setCountry("E2"))));

        var users = List.of(user1, user2, user3);

        System.out.println("1: " + UserService.findUsersWhoHaveMoreThanOneAddress(users));
        System.out.println("2: " + UserService.findOldestPerson(users).getAge());
        System.out.println("3: " + UserService.findUserWithLongestUsername(users).getName());
        System.out.println("4: " + UserService.getNamesAndSurnamesCommaSeparatedOfAllUsersAbove18(users));
        System.out.println("5: " + UserService.partitionUserByUnderAndOver18(users));
        System.out.println("6: " );
        System.out.println("7: " );
        System.out.println("8: " );
    }
}
