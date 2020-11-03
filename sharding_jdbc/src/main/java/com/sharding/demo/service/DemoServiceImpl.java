package com.sharding.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sharding.demo.po.ReadAndWrite;
import com.sharding.demo.repository.DemoRepository;

@Service
public class DemoServiceImpl implements DemoService {

	@Autowired
	private DemoRepository demoRepository;

	@Override
	public List<ReadAndWrite> read() {
		return demoRepository.read();
	}

	@Override
	public Long write(ReadAndWrite readAndWrite) {
		demoRepository.write(readAndWrite);
		return 1L;
	}
}
