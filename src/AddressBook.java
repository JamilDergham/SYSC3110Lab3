import java.util.LinkedList;

//Testing editing on GitHub

public class AddressBook {

    public static LinkedList<BuddyInfo> BuddyInfoLinkedList= new LinkedList<>();

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }

    public static void removeBuddy(BuddyInfo friend){
        BuddyInfoLinkedList.remove(friend);

    }
    
    public static void addBuddy(BuddyInfo friend){

        BuddyInfoLinkedList.add(friend);
    }

}
