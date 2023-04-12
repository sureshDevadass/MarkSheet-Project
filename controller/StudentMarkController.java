package com.studentmarksheet.controller;

import java.util.List;

import org.hibernate.sql.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.studentmarksheet.entity.MarkSheet;
import com.studentmarksheet.service.StudentMarkSerivce;

@RestController
public class StudentMarkController {
	@Autowired
	StudentMarkSerivce sms;

	@PostMapping("/setAllMarks")
	public String setAllMarks(@RequestBody List<MarkSheet> m) {
			return sms.setAllMarks(m);
	
	}

	@GetMapping("/getAll")
	public List<MarkSheet> getAll() {
		return sms.getAll();
	}

	@DeleteMapping("/deleteById/{id}")
	public String deleteById(@PathVariable int id) {
		return sms.deleteById(id);
	}
	@PutMapping("/setPracticalById/{id}/{sem1prac}")
	public String setPracticalById(@PathVariable int id,@PathVariable int sem1Prac)
	{
		return sms.setPracticalById(id,sem1Prac);
	}
	

}
