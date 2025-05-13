import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class JavaStreams {
	
	@Test
	public void stream() {
		
		
		ArrayList <String> names = new ArrayList<String>();
		names.add("man");
		names.add("Don");
		names.add("women");
		
//		Stream.of("Abhijeet","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
//				.forEach(s->System.out.println(s));
		
		List<String>names1= Arrays.asList("Abhijeet","Don","Alekhya","Adam","Rama");
		
//		names.stream().filter(s-> s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		Stream<String> newStream = Stream.concat(names1.stream(), names.stream());
//		newStream.sorted().forEach(s->System.out.println(s));
		
		boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
		System.out.println(flag);
		
	}
	
	@Test
	public void streamCollect() {
		
		List<String> ls = Stream.of("Abhijeet","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
		
		List <Integer> values = Arrays.asList(2,1,2,4,2,4,65,4);
		
		values.stream().distinct().forEach(s->System.out.println(s));
		List <Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
		
	}

	
	
}
