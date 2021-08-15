package com.collections.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class StudentInfo{
	
	int marks;
	int rollno;
	int marks1;
	
	public StudentInfo(int roll,int mark,int mark1) {
		
		rollno=roll;
		marks=mark;
		marks1=mark1;
		
	}
	@Override
	public String toString() {
		return "StudentInfo [marks=" + marks + ", rollno=" + rollno + ", marks1=" + marks1 + "]";
	}
	
	
}
	public class Student{
		
	public static void main(String[] args) {
		
		ArrayList<StudentInfo> studs=new ArrayList<>();
		studs.add(new StudentInfo(1,80,10));
		studs.add(new StudentInfo(2,60,30));
		studs.add(new StudentInfo(3,90,20));
		System.out.println("*******Before sorting the data********");
		for(StudentInfo s:studs)
		{
			System.out.println(s);
		}
		Comparator<StudentInfo> com=new Comparator<StudentInfo>() {
			
			@Override
			public int compare(StudentInfo o1,  StudentInfo o2) {
			    if(o1.marks1>o2.marks1)
			    	return 1;
			    else if (o1.marks1<o2.marks1)
			    return -1;
			    else 
			    	return 0;
			}
		};
		
	Comparator<StudentInfo> com1=new Comparator<StudentInfo>() {
			
			@Override
			public int compare(StudentInfo o1,  StudentInfo o2) {
			    if(o1.marks>o2.marks)
			    	return 1;
			    else if (o1.marks<o2.marks)
			    return -1;
			    else 
			    	return 0;
			}
		};
				
		//Collections.sort(studs, com);
		Collections.sort(studs, com1);
		System.out.println("*******After sorting the data********");
		for(StudentInfo s:studs)
		{
			System.out.println(s);
		}
			
	}
}