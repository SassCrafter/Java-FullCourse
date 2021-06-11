
public class Friend {
	
	String name;
	static int numberOfFriends = 0;
	
	Friend(String name) {
		this.name = name;
		numberOfFriends++;
	}
	
	static void dispayNumberOfFriends() {
		System.out.printf("You have %d friends", numberOfFriends);
	}
}
