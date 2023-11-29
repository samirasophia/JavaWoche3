package trycatch;

public class example {
    public static void main(String[] args) {
        System.out.println("Sohn: Die Milch ist leer");
        String happyfamily = vatermilch();
        System.out.println("Sohn und Mutter: yuhu! Vater kam zurück! Zusammen mit der " + happyfamily);
    }

    private static String vatermilch() {
        System.out.println("Vater: Ich geh Milch hol'n");
        String milch;
        try {
            milch = vaterHoltMilch();
        } catch (Exception e) {
            milch = "FATHERLESS BEHAVIOUR - How far can a gas station be ?";
        }
        System.out.println(" ");
        System.out.println("ACHIEVEMENT: " + milch);
        return milch;
    }

    private static String vaterHoltMilch() throws Exception {
        System.out.println("Mutter: Vater kommt bald zurück");
        throw new Exception("Eheprobleme");

    }
}
