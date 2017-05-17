import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.*;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.LinkedList;
import java.util.List;

public class User {

	private String name;
	private static int KEY_SIZE = 2048;
	
	//private LinkedList transactionList;
	private List<Transaction> userTransactions;
	
	// PEM FILE
	// transaction list
	
	public User() {
			
	}
	
	public User(String newName) throws NoSuchAlgorithmException, NoSuchProviderException, FileNotFoundException, IOException {
		
		name = newName;
		KeyPair keyPair = generateRSAKeyPair();
		RSAPrivateKey priv = (RSAPrivateKey) keyPair.getPrivate();
		RSAPublicKey pub = (RSAPublicKey) keyPair.getPublic();
		writePemFile(priv, "RSA PRIVATE KEY", "id_rsa");
		writePemFile(pub, "RSA PUBLIC KEY", "id_rsa.pub");
	}

	private String GetPrivKey() {return null;}
	
	public Key GetPubKey() throws FileNotFoundException, IOException, NoSuchAlgorithmException, NoSuchProviderException {
		PublicKey pub = null;
		KeyFactory factory = KeyFactory.getInstance("RSA");
		try {
									
			pub = generatePublicKey(factory, "id_rsa.pub");
			
		} catch (InvalidKeySpecException e) {
			e.printStackTrace();
		}
		
		return pub;
	}
	
	private TxOut sendCoin(int amount, Key whoTo) {
		
		TxOut receiver = new TxOut();
		receiver.setValue(amount);
		byte[] pubKey = whoTo.getEncoded();
		receiver.setOutScript(pubKey);
		receiver.setScriptLength(pubKey.length);
		return receiver;
	}
	
	public Transaction createTransaction(int amount, Key toWho) {
		Transaction nT = new Transaction();
		TxOut out = sendCoin(amount,toWho);
		nT.addOut(out);
		int inL = userTransactions.size();
		nT.setInCount(inL);
		nT.setOutCount(1);
		nT.setInList(userTransactions);
		
		return nT;
	}

	private String alertNetwork() {
		return null;
	}
	
	private String getTransDigest() {
		return null;
	}

	
	private static KeyPair generateRSAKeyPair() throws NoSuchAlgorithmException, NoSuchProviderException{
		
		KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
		generator.initialize(KEY_SIZE);
		KeyPair keyPair = generator.generateKeyPair();
		
		return keyPair;
	}

	private static void writePemFile(Key key, String description, String filename)
			throws FileNotFoundException, IOException {
		PemFile pemFile = new PemFile(key, description);
		pemFile.write(filename);

	}
	
	private static PublicKey generatePublicKey(KeyFactory factory, String filename) throws InvalidKeySpecException, FileNotFoundException, IOException {
		
		PemFile pemFile = new PemFile(filename);
		byte[] content = pemFile.getPemObject().getContent();
		X509EncodedKeySpec pubKeySpec = new X509EncodedKeySpec(content);
		return factory.generatePublic(pubKeySpec);
	
	}
}
