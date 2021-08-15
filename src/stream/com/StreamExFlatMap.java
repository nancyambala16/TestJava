package stream.com;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;;
public class StreamExFlatMap {
	public static void main(String[] args) {

/*
 collect(),count(),sorted(),unique(),max(),min(),forEach()
 */
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(25);
		list.add(31);
		list.add(40);
	//	List<Integer> list2=Arrays.asList(10,15,20,25,30,45,50);
		List<Integer> list3=new ArrayList<>();

		list3=list.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(list3);
		
		list.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		System.out.println("********Multiple conditions******");
		list.stream().filter(n->n%2==0&&n>30).forEach(System.out::println);
		
		
		List<String> names=Arrays.asList("NancyGupta","Anshul","Bob","RobinHood");
		List<String> names1=Arrays.asList("NancyGupta","Anshul","Bob","RobinHood",null,null);

        //List<String> filterNames=new ArrayList<>();
        
        names.stream().filter(n->n.length()>5&&n.length()<10).forEach(n->System.out.println(n));
        names1.stream().filter(n->n!=null).forEach(n->System.out.println("Printing List data "+n));
	}

}
