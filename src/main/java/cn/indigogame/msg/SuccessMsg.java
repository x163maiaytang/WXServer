package cn.indigogame.msg;

import com.google.gson.Gson;

public class SuccessMsg extends BaseMsg {

	public SuccessMsg() {
		super(CODE_SUCCESS, "");
	}

	public SuccessMsg(String msg) {
		super(CODE_SUCCESS, msg);
	}

	@Override
	public String toJson() {
		return new Gson().toJson(this);
	}

}
