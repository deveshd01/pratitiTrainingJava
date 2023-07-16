package com.devesh.myMongoProject.Service;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devesh.myMongoProject.Entiti.DemoEntity;
import com.devesh.myMongoProject.Exceptions.MyException;
import com.devesh.myMongoProject.Repository.DemoRepository;

@Service
public class DemoService {
	@Autowired
	private DemoRepository demoRepository;

	public void addData(DemoEntity demoEntity) {
			try {
				demoRepository.insert(demoEntity);
			} catch (Exception e) {
				System.out.println("------------------------------------"+e+"----------------------------");
			}
		

	}

	public List<DemoEntity> fetchAll() {
		return demoRepository.findAll();		 
	}

}
