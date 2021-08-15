package stream.com;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
public class StreamEx3 {
	public static void main(String[] args) {

		List<Integer> list1=Arrays.asList(5,10,15,20,20,18,24,26,26);
		list1.stream().distinct().forEach(n->System.out.print(n+" "));
		System.out.println();
		System.out.println("****Limit elements: ****");
		list1.stream().limit(2).forEach(n->System.out.print(n+" "));

		System.out.println();
		long l=list1.stream().distinct().count();
		System.out.println("Total Distinct elements are: "+l);

		l=list1.stream().count();
		System.out.println("Total elements are: "+l);

		l=list1.stream().filter(n->n%2==0).count();
		System.out.println("Total even no in list:"+l);

		l=list1.stream().filter(n->n%2==0).distinct().count();
		System.out.println("Total distinct even no in list:"+l);

		Optional<Integer> max=list1.stream().distinct().max((val1,val2)->{
			return val1.compareTo(val2);
		});
		System.out.println("Maximum no is: "+max.get());

		Optional<Integer> min=list1.stream().distinct().min((val1,val2)->{
			return val1.compareTo(val2);
		});
		System.out.println("Minimum no is: "+min.get());

		Object[] arr=list1.stream().distinct().toArray();
		System.out.println("Array data: "+Arrays.toString(arr));

		System.out.println("Sorted list is: ");
		list1.stream().sorted().forEach(n->System.out.print(n+" "));
		System.out.println();

		System.out.println("Reverse Sorted list is: ");
		list1.stream().sorted(Comparator.reverseOrder()).forEach(n->System.out.print(n+" "));
		System.out.println();
		List<String> list2=Arrays.asList("10","B","20","C","A");

		Optional<String> reduce= list2.stream().reduce((value,combinedValue)->{
			return value+combinedValue;
		});
		System.out.println("Reduced List is: "+reduce.get());
	}
}
