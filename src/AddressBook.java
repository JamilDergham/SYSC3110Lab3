import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> myBuddies;
    public AddressBook(){
        myBuddies = new ArrayList<>();
    }

    public BuddyInfo removeBuddy(int index){
        if(index >=0 && index < myBuddies.size()){
            return myBuddies.remove(index);
        }
        return null;
    }

    public  void addBuddy(BuddyInfo friend){
        if(friend != null){
            myBuddies.add(friend);
        }
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }
}
