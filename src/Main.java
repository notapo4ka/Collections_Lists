import phonebook.Note;
import phonebook.PhoneBook;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("Pro");
        list.add("Pro");
        list.add("Hello");
        list.add("Java");
        list.add("Hello");
        list.add("Pro");
        list.add("Course");
        list.add("Course");
        list.add("Java");
        System.out.println("Стільки разів зустрічається введений target-рядок: " + Methods.countOccurance(list, "Pro"));

        System.out.println();

        int[] numbers = {1, 2, 3};
        System.out.println(Methods.toList(numbers));

        System.out.println();

        List<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(2);
        listOfNumbers.add(4);
        listOfNumbers.add(2);
        listOfNumbers.add(1);
        listOfNumbers.add(2);
        listOfNumbers.add(2);
        listOfNumbers.add(6);
        listOfNumbers.add(1);
        listOfNumbers.add(6);
        System.out.println(Methods.findUnique(listOfNumbers));

        System.out.println();

        List<String> nums = new ArrayList<>();
        nums.add("java");
        nums.add("pro");
        nums.add("java");
        nums.add("it");
        nums.add("it");
        nums.add("it");
        nums.add("course");
        nums.add("course");
        nums.add("course");
        nums.add("course");
        nums.add("homework");
        System.out.println(Methods.calcOccurance(nums));

        System.out.println();

        System.out.println(Methods.findOccurance(nums));

        System.out.println();

        Note note = new Note("Dima", "444333");
        Note note1 = new Note("Dima", "222111");
        Note note2 = new Note("Alexander", "555555");
        PhoneBook phoneBook = new PhoneBook();
        System.out.println(phoneBook.add(note));
        System.out.println(phoneBook.add(note1));
        System.out.println(phoneBook.add(note2));

        System.out.println();

        System.out.println(phoneBook.find("Dima"));

        System.out.println();

        System.out.println(phoneBook.findAll("Dima"));
    }
}