package com.huaxu.core.diy.webSocket.web;

import com.huaxu.core.diy.webSocket.model.BarrageMessage;
import com.huaxu.core.diy.webSocket.server.WebSocketServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/barrage")
public class BarrageController {

	//推送数据接口
	@ResponseBody
	@RequestMapping("/socket/push")
	public String pushToWeb(String cid, String content, String imageUrl) {
		WebSocketServer.sendInfo(new BarrageMessage(content, imageUrl), cid);
		return "success.";
	}
}