package demo4;

	import java.util.Comparator;

	public class MoneyComparator implements Comparator {

			  public int  compare(Object o1,Object o2) {
						Customer s1 = (Customer) o1;
						Customer s2 = (Customer) o2;
						
						
						if(s1.money==s2.money) {
							return 0;
						}
						else if(s1.money>s2.money) {
								return 1;
						}
					else {
									return -1;
								}
							
					}
		}
