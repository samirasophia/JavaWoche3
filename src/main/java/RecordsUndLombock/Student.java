package RecordsUndLombock;

import lombok.Builder;
import lombok.Getter;
import lombok.With;

@With
@Builder
@Getter
public class Student {

private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    private String name;
private int classroom;





}
