import java.util.LinkedList;

public class AddressBook {

    public static BuddyInfo element;
    public static LinkedList<BuddyInfo> BuddyInfoLinkedList= new LinkedList<>();

    public static void main(String[] args) {
        System.out.println("Address Book");
    }

    public static void removeBuddy(){
        BuddyInfoLinkedList.remove();

    }

    public static void addBuddy(){

        BuddyInfoLinkedList.add(element);
    }

}
