public class Typecast {
	
	public static void main(String args[]) {
		short oldAge = 25;
		int newAge = oldAge;
		System.out.println(oldAge);
		System.out.println(newAge);
		int salary = 10000;
		double newSalary = salary;
		System.out.println(salary); 
		System.out.println(newSalary); 
		int cash = 20000;
		short newCash = (short) cash;
		System.out.println(cash);
		System.out.println(newCash);
		int money = 2000000;
		short new_money = (short) money;
		System.out.println(money);
		System.out.println(new_money); 
		float num = 20.95f;
		int my_num = (int) num;
		System.out.println(num); 
		System.out.println(my_num); 
	}
}