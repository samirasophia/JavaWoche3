package SilvanBonus;

public class Raintrap {
    public static void main(String[] args) {
        int[] trap = new int[10];
        trap[0] = 0;
        trap[1] = 1;
        trap[2] = 0; //1
        trap[3] = 2;
        trap[4] = 0; //2
        trap[5] = 3;
        trap[6] = 0; //2
        trap[7] = 3;
        trap[8] = 0; //1
        trap[9] = 1;
        int rain = trapper(trap);
        System.out.println(rain);
    }

    private static int trapper(int[] trap) {
        int mid = 1;
        int right = 2;
        int rain = 0;
        for (int left = 0; right < trap.length; left++, mid++, right++) {
            if (trap[mid] < trap[left] && trap[mid] < trap[right])
                rain += Math.min(trap[left], trap[right]) - trap[mid];
        }
        return rain;
    }
}


