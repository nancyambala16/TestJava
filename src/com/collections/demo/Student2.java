package com.collections.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class StudentInfo1 implements Comparable<StudentInfo1>{
	
	int marks;
	int rollno;
	
	public StudentInfo1(int roll,int mark) {
		
		rollno=roll;
		marks=mark;
		
	}
	public String toString()
	{
		return "[rollno: "+rollno+",marks: "+marks+"]";
	}
	@Override
	public int compareTo(StudentInfo1 o) {
		
		return this.rollno>o.rollno?1:this.rollno<o.rollno?-1:0;
	}
	
	
}
	public class Student2{
		
	public static void main(String[] args) {
		
		ArrayList<StudentInfo1> studs=new ArrayList<>();
		studs.add(new StudentInfo1(1,80));
		studs.add(new StudentInfo1(3,90));
		studs.add(new StudentInfo1(2,60));
		System.out.println("*******Before sorting the data********");
		for(StudentInfo1 s:studs)
		{
			System.out.println(s);
		}
		Collections.sort(studs);
		System.out.println("*******After sorting the data********");
		for(StudentInfo1 s:studs)
		{
			System.out.println(s);
		}
			
	}
}