package com.devesh.myMongoProject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.devesh.myMongoProject.Entiti.DemoEntity;
import com.devesh.myMongoProject.Exceptions.MyException;
import com.devesh.myMongoProject.Model.RequestStatus;
import com.devesh.myMongoProject.Service.DemoService;

@RestController
public class DemoController {
	
	@Autowired
	private DemoService demoService;

	@PostMapping("/addData")
	public RequestStatus addData(@RequestBody DemoEntity demoEntity) {
		RequestStatus status = new RequestStatus();
		try {
			demoService.addData(demoEntity);
			status.setStatus(true);
			status.setMessage("Data Added Successfully......!!!!!!");

		} catch (MyException e) {
			status.setStatus(false);
			status.setMessage(e.getMessage());
		}

		return status;
	}
	@GetMapping("/fetchAll")
	public List<DemoEntity> fetchAll() {
		return demoService.fetchAll();
	}

}
