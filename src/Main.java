import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;


public class Main {

	public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchProviderException, FileNotFoundException, IOException {

		String a = "alice";
		User Alice = new User(a);
		Key pub = Alice.GetPubKey();
		System.out.println(pub);
		System.out.println();
		byte[] enc = pub.getEncoded();
		for(int i =0;i<enc.length;i++) {
			System.out.print(enc[i] + ":");
		}
		System.out.println();
		System.out.println(enc.length);	
	}

	private void mp(String i) {
		System.out.println(i);
	}
}
