package RecordsUndLombock;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;
import lombok.With;

@Builder
@With
@Value
@Getter
public class EingabeDings {
    public static void main(String[] args) {
        Destination home = new Destination("Eiken","Switzerland");
        Destination work = new Destination("Basel", "Switzerland");
        home.toString();
        home.equals(work);
        System.out.println(home.country());
        System.out.println(home.equals(work));

    }
}
