package com.sharding.demo.service;

import java.util.List;

import com.sharding.demo.po.ReadAndWrite;

public interface DemoService {

	List<ReadAndWrite> read();
	
	Long write(ReadAndWrite readAndWrite);
		
}
