import java.util.*;

public class AddressBook {

    private List<BuddyInfo> addressBook;

    /**
     * Create an addressBook of type ArrayList
     */
    public AddressBook() {
        addressBook = new ArrayList<BuddyInfo>();
    }

    /**
     * Add a BuddyInfo object to an addressBook of type
     * ArrayList
     * @param buddy The BuddyInfo object
     */
    public void addBuddy(BuddyInfo buddy){
        if (buddy != null){
            addressBook.add(buddy);
        }
    }

    /**
     * Remove a BuddyInfo object from the addressbook at an index
     * position
     * @param index The position of the BuddyInfo object
     */
    public BuddyInfo removeBuddy(int index){
        if (index >= 0 && index < addressBook.size()){
            return addressBook.remove(index);
        }
        return null;
    }

    public void printBranch(){
        System.out.println(("new branch"));
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Eddie", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }



}
