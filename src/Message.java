
public class Message {

	
	
	public enum msgType {
		TRANS_REQ,REQ_ACK,TRANS, TRANS_ACK, BROADCAST, PING, PINK_ACK, REJECT
	}
	
	private msgType myMsgType;
	
	public Message(msgType type) {
	
		if(type!=msgType.TRANS) {myMsgType = type;}
	//Message header
	
		
		
	}
	
	
}
