import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.LinkedList;
import java.util.Scanner;


public class Manager {

	private LinkedList<User> userList;
	private Scanner reader = new Scanner(System.in);
	
	public void boot() throws NoSuchAlgorithmException, NoSuchProviderException, FileNotFoundException, IOException {
		
		String option1 = "1. Login";
		String option2 = "2. Create Account";
		
		System.out.println(option1);
		System.out.println(option2);
		System.out.println("Choose option (number)");
		String choice = reader.next();
		if(reader.nextInt()==1) {
			print("Input username");
			String s = reader.next();
			if(userList.contains(s)) {
				loadUser(s);				
			}
			else {
				print("user does not exist");
			}
		}
		if(reader.nextInt()==2) {
			print("enter username");
			String newName = reader.next();
			if(userList.contains(newName)) {
				print("user already exists");
			}
			else {
				createUser(newName);
			}
		}
		else{
			print("enter valid input");
		}
	}

	private boolean userExists(String name) {
		if(userList.contains(name)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private void loadUser(String user) {
			
	}
	
	private void login(String userName) {
		
	}
	
	private String requestUserPubKey() {
		return null;
	}
	
	private void createUser(String name) throws NoSuchAlgorithmException, NoSuchProviderException, FileNotFoundException, IOException {
		
		if(userExists(name)==true) {
			System.out.println("USER ALREADY EXIST");
		}
		else{
			System.out.println("Enter a username: ");
			String s = reader.next();
			User newUser = new User(s);
			userList.add(newUser);
		}	
	}
	
	private void print(String input) {
		System.out.println(input);
	}	
}
