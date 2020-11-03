package com.sharding.demo.repository;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.sharding.demo.po.ReadAndWrite;


@Mapper
public interface DemoRepository {
	
	Long write(ReadAndWrite readAndWrite);
	
	List<ReadAndWrite> read();
}
