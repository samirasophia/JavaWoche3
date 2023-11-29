package Streams;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;
public class Bonuuuus {
    public static void main(String[] args) {
String fileName = "C:\\Users\\tesa4\\IdeaProjects\\JavaWoche3\\src\\main\\java\\Streams\\students.csv";
try (Stream<String> stream = Files.lines((Paths.get(fileName)))){
            stream.filter(line -> !line.equals("ID, Name, postalCode, age"))
                    .filter(n -> n != null)
                    .filter(n -> !n.equals(("")))
                    .distinct()
                    .map(line -> {
                        String[] parts = line.split(",");
                        if (parts.length == 4) {
                            return new Student(parts[0], parts[1], parts[2], Integer.parseInt(parts[3]));
                        } else {
                            return null;
                        }                  })
    .forEach(System.out::println);
    } catch (IOException e) {
            e.printStackTrace();
}}
}
