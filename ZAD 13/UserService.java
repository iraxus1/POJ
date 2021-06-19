package org.example;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UserService {

    public static List<User> findUsersWhoHaveMoreThanOneAddress(List<User> users)
    {
        return users.stream().filter(user -> user.getPersonDetails().getAddresses().size() > 1).collect(Collectors.toList());
    }

    public static Person findOldestPerson(List<User> users)
    {
        return users.stream().map(User::getPersonDetails).max(Comparator.comparing(Person::getAge)).orElse(null);
    }

    public static User findUserWithLongestUsername(List<User> users) {
        return users.stream().max(Comparator.comparing(user -> user.getName().length())).orElse(null);
    }

    public static String getNamesAndSurnamesCommaSeparatedOfAllUsersAbove18(List<User> users) {
        return users.stream().filter(user -> user.getPersonDetails().getAge() > 18).map(Person -> Person.getName() + " " + Person.getPersonDetails().getSurname()).collect(Collectors.joining(","));
    }

    public static List<String> getSortedPermissionsOfUsersWithNameStartingWithA(List<User> users) {
        return users.stream().filter(user -> user.getName().startsWith("A")).map(user -> user.getPersonDetails().getRole().getPermissions()).flatMap(Collection::stream).map(Permission::getName).sorted().collect(Collectors.toList());
    }

    public static void printCapitalizedPermissionNamesOfUsersWithSurnameStartingWithS(List<User> users) {
        users.stream().map(User::getPersonDetails).filter(personDetails -> personDetails.getSurname().startsWith("S")).map(Person::getRole).map(Role::getPermissions).flatMap(Collection::stream).map(Permission::getName).map(String::toUpperCase).forEach(System.out::println);
    }

    public static Map<Role, List<User>> groupUsersByRole(List<User> users) {
        return users.stream().collect(Collectors.groupingBy(user -> user.getPersonDetails().getRole()));
    }

    public static Map<Boolean, List<User>> partitionUserByUnderAndOver18(List<User> users) {
        return users.stream().collect(Collectors.partitioningBy(user -> user.getPersonDetails().getAge() > 18));
    }
}
