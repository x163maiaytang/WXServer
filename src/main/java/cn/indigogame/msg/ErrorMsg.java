package cn.indigogame.msg;

public class ErrorMsg extends BaseMsg {

	public ErrorMsg() {
		super();
	}
	public ErrorMsg(String message) {
		super(CODE_FAIL, message);
	}

	@Override
	public String toJson() {
		return "{\"code\":" + code + ",\"message\":\"" + message + "\"}";
	}

}
