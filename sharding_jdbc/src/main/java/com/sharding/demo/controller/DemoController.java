package com.sharding.demo.controller;

import com.sharding.demo.po.ReadAndWrite;
import com.sharding.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {
	
	@Autowired
	private DemoService demoService;

	//读写分离
	@GetMapping("/readAndWriteByRead")
	public Object readAndWriteByRead() {
		return demoService.read();
	}

	@GetMapping("/readAndWriteByWrite")
	public Object readAndWriteByWrite() {
		for (int i = 0; i < 20; i++) {
			ReadAndWrite write = new ReadAndWrite();
			write.setId(i);
			write.setCity("city:"+i);
			write.setRegion("Region:"+i);
			demoService.write(write);
		}
		return "success";
	}

}
