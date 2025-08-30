package Java_advance;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SteamDemo {

  public static void main(String[] args) {

    List<String> list = new ArrayList<>();
    list.add("One");
    list.add("Two");
    list.add("Three");

    // 1. 
    List<String> numlist = new ArrayList<>();
    for (String num : list) {
      if (num.length() > 3) {
        numlist.add(num);
      }
    }
    System.out.println(numlist);

    // 2. Stream API
    List<String> numlist2 = list.stream()
        .filter(num -> num.length() > 3)
        .collect(Collectors.toList());
    System.out.println(numlist2);

    // 3. Stream API with map
    String[] names = {"One", "Two", "Three"};
    Stream<String> nameStream = Stream.of(names);
    System.out.println(nameStream.count());
    // nameStream.filter(name -> name.length() > 3)
    //     .map(String::toUpperCase)
    //     .forEach(System.out::println);
  }

}
