package demo4;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Iterator;
	import java.util.Arrays;
	import java.util.List;

	public class Test1 {
		public static void main(String[] args) {
			ArrayList <Customer> al = new ArrayList <Customer>();
			al.add(new Customer ("priya", 45, 1500));
			al.add(new Customer ("gayathri", 56, 3500));
			al.add(new Customer ("ram", 36, 500));
			al.add(new Customer ("logi", 49, 4000));
			
			System.out.println("Sorting by name.....");
			Collections.sort(al,new NameComparator());
			Iterator it = al.iterator();
			while(it.hasNext()) {
				Customer cu = (Customer)it.next();
				System.out.println(cu.name+" "+cu.age+" "+cu.money);
			}
			
			System.out.println("Sorting by age.....");
			Collections.sort(al,new AgeComparator());
			Iterator it1 = al.iterator();
			while(it1.hasNext()) {
				Customer cu = (Customer)it1.next();
				System.out.println(cu.name+"  "+cu.age+"  "+cu.money);
		}
			System.out.println("Sorting by money.....");
			Collections.sort(al,new MoneyComparator());
			//Iterator it2 = al.iterator();
			//while(it2.hasNext()) {
				//Customer cu = (Customer)it2.next();
			for(Customer cu : al) {
				System.out.println(cu.name+"  "+cu.age+"  "+cu.money);
		}
	}
}