package lambaExp;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierImp {
	public static void main(String[] args) {
		Supplier<Integer> sup=()->10*10;
		System.out.println(sup.get());

		Supplier<Date> sup1=()->new Date();
		System.out.println(sup1.get());
	}

}
