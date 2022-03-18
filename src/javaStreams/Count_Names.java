package javaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Count_Names {
	
	//@Test
	public void regular() {
	ArrayList<String> names = new ArrayList<String>();
	names.add("Adi"); 
	names.add("Badshah");
	names.add("Amol");
	names.add("Chirag");
	names.add("Atif");
	names.add("Shubham");
	names.add("Abhi");
	
	int count =0;
	
	for(int i=0; i<names.size(); i++) {
		
		 String actual = names.get(i);
		 if(actual.startsWith("A")) {
			 count++;
		 }
	}
	System.out.println(count);
	

}
	// @Test
	public void Filter() {
		  long d = Stream.of("Adi","Badshah","Amol","Chirag","Atif","Shubham","Abhi").filter(s ->s.startsWith("A")).count();
	System.out.println(d);
	
	
	//names.stream.filter(s ->s.length()>4).forEach(s ->System.out.println(s));
	
	
	}
	
//@Test
public void Map() {
	
	Stream.of("Adi","Badshah","Amol","Chirag","Atif","Shubham","Abhi").filter(s->s.length()>4).map(s->s.toUpperCase())
	.forEach(s->System.out.println(s));
	
}

//@Test
public void Sorted() {
	
  List<String> names = Arrays.asList("Adi","Badshah","Amol","Chirag","Atif","Shubham","Abhi");
  names.stream().filter(s-> s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
}

//@Test
public void concatString() {
	ArrayList<String> names = new ArrayList<String>();
	names.add("men"); 
	names.add("Krishna");
	names.add("women");
	
	List<String> names1 = Arrays.asList("Adi","Badshah","Amol","Chirag","Atif","Shubham","Abhi");
	Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
	boolean flag= newStream.anyMatch(s->s.equalsIgnoreCase("Krishna"));
	System.out.println(flag);
	Assert.assertTrue(flag);
	

}

@Test
public void UniqueNum() {
	
	List<Integer> values = Arrays.asList(3,2,2,7,5,1,9,7);
	
	//Unique Numbers
	
	values.stream().distinct().forEach(s->System.out.println(s));
	
	//sort and get the 3rd value
	
	List<Integer> li=values.stream().distinct().sorted().collect(Collectors.toList());
	System.out.println(li.get(2));
}

}

