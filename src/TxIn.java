
public class TxIn {

	private byte[] prevTransHash;
	private int outIndex;
	private int inScriptLength;
	private byte[] inScript;
	
	private TxIn() {
		
	}

	public byte[] getPrevTransHash() {
		return prevTransHash;
	}

	public void setPrevTransHash(byte[] prevTransHash) {
		this.prevTransHash = prevTransHash;
	}

	public int getOutIndex() {
		return outIndex;
	}

	public void setOutIndex(int outIndex) {
		this.outIndex = outIndex;
	}

	public int getInScriptLength() {
		return inScriptLength;
	}

	public void setInScriptLength(int inScriptLength) {
		this.inScriptLength = inScriptLength;
	}

	public byte[] getInScript() {
		return inScript;
	}

	public void setInScript(byte[] inScript) {
		this.inScript = inScript;
	}
		
	
	
}
