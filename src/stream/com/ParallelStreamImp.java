package stream.com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class StudentInfo {
	String id;
	int score;

	public StudentInfo(String id, int score) {
		super();
		this.id = id;
		this.score = score;
	}

	public String getId() {
		return id;
	}

	public int getScore() {
		return score;
	}

}

public class ParallelStreamImp {

	public static void main(String[] args) {

		List<StudentInfo> list=Arrays.asList(
				new StudentInfo("nancy",100),
				new StudentInfo("nancy2",85),
				new StudentInfo("nancy1",90),
				new StudentInfo("nancy3",80)		
				);

		list.stream().filter(s->s.score>80).limit(2).forEach(s->System.out.println(s.id+"  "+s.score));
		System.out.println("*****convert stream to parallel stream*******");
		list.stream().parallel().filter(s->s.score>80).limit(2).forEach(s->System.out.println(s.id+"  "+s.score));

		System.out.println("*****Parallel Stream****");
		list.parallelStream().filter(s->s.score>80).limit(2).forEach(s->System.out.println(s.id+"  "+s.score));

		Comparator<StudentInfo> cmp=(s1,s2)->{
			if(s1.score<s2.score)
				return 1;
			else if (s1.score>s2.score)
				return -1;
			else 
				return 0;
		};
		System.out.println("*****Top 2 elements*****");
		list.stream().filter(s->s.score>80).sorted(cmp).limit(2).forEach(s->System.out.println(s.id+"  "+s.score));

	}
}