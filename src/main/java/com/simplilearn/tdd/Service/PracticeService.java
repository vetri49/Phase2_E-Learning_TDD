package com.simplilearn.tdd.Service;

import java.util.ArrayList;
import java.util.List;

import com.simplilearn.tdd.E_learning.Practice;

public class PracticeService {
	List<Practice> prac;
	public PracticeService() {
		prac=new ArrayList<>();
		prac.add(new Practice(1,"Selenium"));
		prac.add(new Practice(2,"Selenium-Grid"));
		prac.add(new Practice(3,"TestNG"));
		prac.add(new Practice(1,"POM Framework"));
		prac.add(new Practice(1,"JUnit"));
	}
	public List<Practice> getPractice(){
		return prac;
	}

}
