public class BagDemo {

    public static void main(String[] args) {
        Bag<String> bag_of_strings = new Bag(5);
        
        bag_of_strings.add("Hello");
        bag_of_strings.add("World!");
        bag_of_strings.add("Structures1");
        bag_of_strings.add("Data");
        bag_of_strings.add("Structures2");
        bag_of_strings.remove("Structures1");
        
        bag_of_strings.sort();
        
        Bag<Person> persons_bag = new Bag(6);
        persons_bag.add(new Person("Edsger","Dijkstra"));
        persons_bag.add(new Person("Guido","van Rossum"));
        persons_bag.add(new Person("Paul","Conrad"));
        persons_bag.add(new Person("Bjarn","Stroustrup"));
        persons_bag.add(new Person("Ada","Lovelace"));
        persons_bag.add(new Person("Grace","Hopper"));
        
        System.out.println(persons_bag.toString());
        persons_bag.sort();
        System.out.println(persons_bag.toString());
		
        System.out.println("Size of bag_of_strings=" + bag_of_strings.getSize() );
        System.out.println("Contents of bag_of_strings:");
        Object[] a = bag_of_strings.toArray();
        for(int i=0;i<a.length;i++) {
            System.out.printf("a[%d]=%s\n",i,a[i]);
        }

	Bag<Double> bag_of_doubles = new Bag(50);
        
	// fill the bag of floats with some floating point values
        for(int i=0;i<50;i++)
		{
			if ( i%3 == 0 ) bag_of_doubles.add( i*2.375 );
			else if ( i%3 == 1 ) bag_of_doubles.add ( -i*1.875 );
			else bag_of_doubles.add( (i%500) / 1.4142 ); 
		}
        
	bag_of_doubles.sort();
		
        System.out.println("Size of bag_of_doubles=" + bag_of_doubles.getSize() );
        System.out.println("Contents of bag_of_doubles:");
        Object[] ab = bag_of_doubles.toArray();
        for(int i=0;i<ab.length;i++) {
            System.out.printf("ab[%d]=%s\n",i,ab[i]);
        }
    }
    
}
