package stream.com;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.*;;
public class StreamEx4 {
	public static void main(String[] args) {

		Set<String> fruit=new HashSet<>();
		fruit.add("two apple");
		fruit.add("one apple");
		fruit.add("one apple");
		//fruit.add("two apple");
		// fruit.add("two apple");

		boolean res= fruit.stream().anyMatch(value->value.startsWith("one"));
		System.out.println(res);
		res= fruit.stream().allMatch(value->value.startsWith("one"));
		System.out.println(res);
		res= fruit.stream().noneMatch(value->value.startsWith("one"));
		System.out.println(res);

		Optional<String> str=  fruit.stream().findFirst();       
		System.out.println("First Element : "+str.get());
		Optional<String> ele=  fruit.stream().findAny();
		System.out.println("After find any : "+ele.get());

		List<Integer> i1=Arrays.asList(1,2,3);
		List<Integer> i2=Arrays.asList(4,12,13);
		Stream s1= i1.stream();
		Stream s2= i2.stream();
		Stream.concat(s1,s2).forEach(s->System.out.println(s));
	}

}
