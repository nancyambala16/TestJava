package com.collections.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class StudentInfo11 implements Comparable<StudentInfo11>{
	
	int marks;
	int rollno;
	
	public StudentInfo11(int roll,int mark) {
		
		rollno=roll;
		marks=mark;
		
	}
	public String toString()
	{
		return "[rollno: "+rollno+",marks: "+marks+"]";
	}
	@Override
	public int compareTo(StudentInfo11 o) {
		// TODO Auto-generated method stub
		if(this.marks>o.marks)
			return -1;
		else if(this.marks<o.marks)
			return 1;
		return 0;
	}
	

}
	public class Student3{
		
	public static void main(String[] args) {
		
		ArrayList<StudentInfo11> studs=new ArrayList<>();
		studs.add(new StudentInfo11(1,40));
		studs.add(new StudentInfo11(1,80));
		studs.add(new StudentInfo11(2,60));
		studs.add(new StudentInfo11(3,90));
		System.out.println("*******Before sorting the data********");
		for(StudentInfo11 s:studs)
		{
			System.out.println(s);
		}
		
		Collections.sort(studs);
		System.out.println("*******After sorting the data********");
		for(StudentInfo11 s:studs)
		{
			System.out.println(s);
		}
			
	}
}
	
	
	