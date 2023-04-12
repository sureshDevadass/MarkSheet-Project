package com.studentmarksheet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentmarksheet.dao.StudentMarkDao;
import com.studentmarksheet.entity.MarkSheet;

@Service
public class StudentMarkSerivce {
	@Autowired
	StudentMarkDao smd;
	public String setAllMarks(List<MarkSheet> m) {
			for(MarkSheet ms:m) {
				ms.setSem1Total(ms.getSem1Theory()+ms.getSem1Practicals());
				ms.setSem2Total(ms.getSem2Practicals()+ms.getSem2Theory());
			}
		
		return smd.setAllMarks(m);
	}
	public List<MarkSheet> getAll() {
		
		return smd.getAll();
	}
	public String deleteById(int id) {
		
		return smd.deleteById(id);
	}
	public String setPracticalById(int id,int sem1Prac) {
		
		return smd.setPracticalById(id,sem1Prac);
	}
	
	

}
