package stream.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapStream {

	public static void main(String[] args) {

		List<String> names=Arrays.asList("nancy","anshul","bob");
		List<String> uppernames=new ArrayList<>();

		names.stream().map(n->n.toUpperCase()).forEach(n->System.out.println(n));
		uppernames=names.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
        System.out.println(uppernames);
        
		names.stream().map(n->n.length()).forEach(n->System.out.print(n +"  "));
       System.out.println();
        List<Integer> num=Arrays.asList(2,4,5,6);
        num.stream().map(n->n*2).forEach(n->System.out.print(n+"  "));
        
		
	}
}
