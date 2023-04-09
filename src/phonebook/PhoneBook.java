package phonebook;

import java.util.*;

public class PhoneBook {

    private Map<String, List<Note>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public Map add(Note note) {
        List<Note> phoneNumbers = phoneBook.getOrDefault(note.getName(), new ArrayList<>());
        phoneNumbers.add(note);
        phoneBook.put(note.getName(), phoneNumbers);
        return phoneBook;
    }

    public String find(String name) {
        if (phoneBook.containsKey(name)) {
            List<Note> notes = phoneBook.get(name);
            return String.valueOf(notes.get(0));
        }
        return null;
    }

    public String findAll(String name) {
        if (phoneBook.containsKey(name)) {
            List<Note> notes = phoneBook.get(name);
            return notes.toString();
        }
        return null;
    }
}