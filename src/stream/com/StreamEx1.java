package stream.com;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;;
public class StreamEx1 {
	public static void main(String[] args) {

		/*
 collect(),count(),sorted(),unique(),max(),min(),forEach()
		 */

		List<Integer> list1=Arrays.asList(10,15,20,20,18,24,26,26);
		List<Integer> list2=Arrays.asList(25,30,35,40);
		List<Integer> list3=Arrays.asList(45,50);
		List<List<Integer>> list4=Arrays.asList(list1,list2,list3);

		list4.stream().flatMap(m->m.stream()).forEach(n->System.out.println(n));
		System.out.println();
		list4.stream().flatMap(m->m.stream()).map(m->m+10).forEach(n->System.out.print(n+"  "));
		System.out.println();
		list4.stream().map(m->m).forEach(n->System.out.println(n));

//		ArrayList al=new ArrayList<>();
//		al.addAll(list1);
//		al.addAll(list2);
//		al.addAll(list3);
//		System.out.println(al);

		//Introduced in Java 8, the Stream API is used to process collections of objects. 
		//A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result

	}
}
