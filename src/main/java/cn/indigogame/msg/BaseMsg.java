package cn.indigogame.msg;

public abstract class BaseMsg implements IRetMsg {
	
	protected int code;
	
	protected String message;
	
	public static final int CODE_SUCCESS = 200; 
	public static final int CODE_FAIL = 401;
	

	public BaseMsg() {
		
	}
	public BaseMsg(int code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
}
