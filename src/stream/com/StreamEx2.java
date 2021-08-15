package stream.com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Product{
	String id;
	String name;
	double price;
	public Product(String id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}	
}

public class StreamEx2 {

	public static void main(String[] args) {

		List<Product> ls=new ArrayList<>();
		List<Product> newlist=new ArrayList<>();
		ls.add(new Product("1","Dell", 10000)) ;
		ls.add(new Product("2","Dell1",20000)) ;
		ls.add(new Product("3","Dell2",30000)) ;
		ls.add(new Product("4","Dell2",40000)) ;
				newlist=ls.stream().filter(n->n.price>20000).collect(Collectors.toList());
			for(Product apl:newlist)
			{
				System.out.println(apl.name+" : "+apl.id+" : "+apl.price);
			}
				
				ls.stream().filter(n->n.price>20000).forEach(n->System.out.println(n.id+" : "+n.name+" : "+n.price));

	}

}
