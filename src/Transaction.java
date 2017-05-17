import java.security.Key;
import java.util.List;
import java.util.LinkedList;


public class Transaction {

	private int version;
	private int inCount;
	private List<TxIn> inList;
	private int outCount;
	private List<TxOut> outList;
	
	Transaction() {
		
	}
	
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public int getInCount() {
		return inCount;
	}

	public void setInCount(int inCount) {
		this.inCount = inCount;
	}

	public int getOutCount() {
		return outCount;
	}

	public void setOutCount(int outCount) {
		this.outCount = outCount;
	}
	
	public void setInList(List ins) {
		inList = ins;
	}
	
	public void addOut(TxOut out) {
		outList.add(out);
	}	
}
