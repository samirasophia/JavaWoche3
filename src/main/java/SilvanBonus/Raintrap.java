package SilvanBonus;

public class Raintrap {
    public static void main(String[] args) {
        int[] height = {1, 0, 0, 0, 0, 2, 3, 5, 6, 2, 7, 4, 7, 0, 2};
        int rain = 0;
        int rain2 = trapper(height, rain);
        System.out.println("So viele Minecraft Blöcke Regen: " + rain2);
    }


    public static int trapper(int[] height, int rain) {
        int h = height.length;
//Listen machen brah
        int linkser[] = new int[h];
        int rechtser[] = new int[h];

        linkser[0] = height[0];
        rechtser[h - 1] = height[h - 1];

        for (int l = 1; l < h; l++) {
            linkser[l] = Math.max(linkser[l - 1], height[l]);
        }
        for (int r = h - 2; r >= 0; r--) {
            rechtser[r] = Math.max(rechtser[r + 1], height[r]);
        }
        for (int i = 0; i < h; i++) {
            rain += Math.min(linkser[i], rechtser[i]) - height[i];
        }

        return rain;
    }

}


