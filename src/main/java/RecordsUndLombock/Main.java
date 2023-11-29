package RecordsUndLombock;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;
import lombok.val;
@Getter
@Builder
@Value
public class Main {
    public static void main(String[] args) {
        Student student02 = new Student(3, "Meow", 01);
        Student student01 = Student.builder()
                .name("Lisa")
                .age(12)
                .classroom(01)
                .build();
        student01.withClassroom(03);
new Course(Subject.IT);
    }
}
