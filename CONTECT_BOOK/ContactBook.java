import java.util.ArrayList;

public class ContactBook {
    private ArrayList<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact added successfully.");
    }

    public void deleteContact(String name) {
        Contact contact = searchContact(name);
        if (contact != null) {
            contacts.remove(contact);
            System.out.println("Contact deleted successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void updateContact(String name, String newEmail, int newAge, String newPhoneNumber) {
        Contact contact = searchContact(name);
        if (contact != null) {
            contact.setEmail(newEmail);
            contact.setAge(newAge);
            contact.setPhoneNumber(newPhoneNumber);
            System.out.println("Contact updated successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void searchContactDetails(String name) {
        Contact contact = searchContact(name);
        if (contact != null) {
            System.out.println(contact);
        } else {
            System.out.println("User not found.");
        }
    }

    private Contact searchContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }
        }
        return null;
    }
}

