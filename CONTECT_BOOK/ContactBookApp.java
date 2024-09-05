import java.util.Scanner;

public class ContactBookApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactBook contactBook = new ContactBook();

        while (true) {
            System.out.println("\n--- Contact Book Menu ---");
            System.out.println("1. Add Contact");
            System.out.println("2. Delete Contact");
            System.out.println("3. Update Contact");
            System.out.println("4. Search Contact");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (option) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    contactBook.addContact(new Contact(name, email, age, phoneNumber));
                    break;

                case 2:
                    System.out.print("Enter the name of the contact to delete: ");
                    String nameToDelete = scanner.nextLine();
                    contactBook.deleteContact(nameToDelete);
                    break;

                case 3:
                    System.out.print("Enter the name of the contact to update: ");
                    String nameToUpdate = scanner.nextLine();
                    System.out.print("Enter new email: ");
                    String newEmail = scanner.nextLine();
                    System.out.print("Enter new age: ");
                    int newAge = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline
                    System.out.print("Enter new phone number: ");
                    String newPhoneNumber = scanner.nextLine();
                    contactBook.updateContact(nameToUpdate, newEmail, newAge, newPhoneNumber);
                    break;

                case 4:
                    System.out.print("Enter the name of the contact to search: ");
                    String nameToSearch = scanner.nextLine();
                    contactBook.searchContactDetails(nameToSearch);
                    break;

                case 5:
                    System.out.println("Exiting the application...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
