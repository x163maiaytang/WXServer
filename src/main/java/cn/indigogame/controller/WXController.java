package cn.indigogame.controller;

import java.util.TreeMap;

import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/wx")
public class WXController {

	protected static final Logger logger = LoggerFactory.getLogger(WXController.class);

	@Value("${wx.token}")
	public String token;
	
	@RequestMapping(value = "/check")
	@ResponseBody
	protected String payResult(@RequestParam String signature, @RequestParam String timestamp,
			@RequestParam String nonce, @RequestParam String echostr) {


		TreeMap<String, String> tm = new TreeMap<>();
		tm.put("token", token);
		tm.put("nonce", nonce);
		tm.put("timestamp", timestamp);
		
		String t = "";
		for(String s : tm.values()) {
			
			t += s;
		}
		if(DigestUtils.sha1Hex(t).equals(signature)) {
			return echostr;
		}
		
		return "";
	}
}
