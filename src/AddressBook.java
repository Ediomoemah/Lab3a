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
        BuddyInfo buddy = new BuddyInfo("Eddie", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }



}
