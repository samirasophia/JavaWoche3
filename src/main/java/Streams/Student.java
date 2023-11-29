package Streams;

public class Student {
  String part;
  String part1;
  String part2;
  int i;

    public Student(String part, String part1, String part2, int i) {
        this.part = part;
        this.part1 = part1;
        this.part2 = part2;
        this.i = i;
    }


    @Override
    public String toString() {
        return "Student{" +
                "part='" + part + '\'' +
                ", part1='" + part1 + '\'' +
                ", part2='" + part2 + '\'' +
                ", i=" + i +
                '}';
    }
}
