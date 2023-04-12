package com.studentmarksheet.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.studentmarksheet.entity.MarkSheet;
import com.studentmarksheet.repository.StudentMarkRepository;

@Repository
public class StudentMarkDao {
@Autowired
StudentMarkRepository smr;
	public String setAllMarks(List<MarkSheet> m) {
		
		 smr.saveAll(m);
		 
		 return "All Marks are Saved SuccessFully";
	}
	public List<MarkSheet> getAll() {
		
		return smr.findAll();
	}
	public String deleteById(int id) {
		smr.deleteById(id);
		return "Id SuccessFully Deleted";
	}
	public String setPracticalById(int id,int sem1Prac) {
		List<MarkSheet> findAll = smr.findAll();
		for(MarkSheet m:findAll) {
			int id2 = m.getId();
			if(id2==id) {
				m.setSem1Practicals(sem1Prac);
				smr.save(m);
			}
		}
		return "Practical Mark SuccessFully Updated";
		
	}
	
	

}
