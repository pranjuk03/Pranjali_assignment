package Collection;


	import java.util.HashMap;
	import java.util.Map;
	import java.util.Set;



	public class Prog1 {

		public static void main(String[] args) {
			Map<Long,Contact> m=new HashMap<>();
			m.put(10012002l,new Contact(99887766,"Unkown","anonymous@abc.com",Contact.Gender.Female));
			
			Set<Long> keys=m.keySet();
			System.out.println("Keys:-");
			for(long i:keys)
			{
				System.out.println(i);
			}
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("Values:-");
			for(long i:keys)
			{
				System.out.println(m.get(i));
			}
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("Key and Value-");
			System.out.println(m);
		}

	}





