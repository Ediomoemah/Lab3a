import java.util.*;

public class AddressBook {

    private List addressBook;

    public AddressBook() {
        addressBook = new ArrayList();
    }

    public void addBuddy(BuddyInfo buddy){
        addressBook.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        addressBook.remove(buddy);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }



}
