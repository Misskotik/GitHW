import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Aleksandr", Arrays.asList("math", "foreignLanguage", "mathAnalysis"), 3);
        Student student2 = new Student("Aleksandra", Arrays.asList("math", "foreignLanguage","mathAnalysis"), 3);
        Student student3 = new Student("Aleksey", Arrays.asList("music", "logics"), 2);
        Student student4 = new Student("Alisa", Arrays.asList("math", "foreignLanguage", "physics"), 3);
        Student student5 = new Student("Alevtina", Arrays.asList("math", "physics"),2);
        Student student6 = new Student("Aleksa", Arrays.asList("math", "foreignLanguage"), 2);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

         System.out.println("ЗАДАНИЕ 1");
         Stream<Student> studentStream = Stream.of(student1, student2, student3, student4, student5, student6);
            studentStream.distinct()
               .forEach((course) -> System.out.println(course));

             System.out.println("ЗАДАНИЕ 2");
            List<String> result = students.stream()
//         .filter(student -> student.getCourseNumber() >= 2)
            .sorted((e1, e2) -> e2.getCourseNumber() - e1.getCourseNumber())
              .limit(3)
              .map((student) ->student.getName())
              .collect(Collectors.toList());   
               System.out.println(result);


    }

}



       

        



























