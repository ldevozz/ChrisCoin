
public class TxOut {

	private int value;
	private int scriptLength;
	private byte[] outScript;
	
	TxOut() {
		
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getScriptLength() {
		return scriptLength;
	}

	public void setScriptLength(int scriptLength) {
		this.scriptLength = scriptLength;
	}

	public byte[] getOutScript() {
		return outScript;
	}

	public void setOutScript(byte[] outScript) {
		this.outScript = outScript;
	}
}
