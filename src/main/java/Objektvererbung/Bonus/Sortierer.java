package Objektvererbung.Bonus;

public class Sortierer {
    public static void main(String[] args) {
        Flugzeug A1 = new Flugzeug();
        A1.setZc("a1");
        Flugzeug A2 = new Flugzeug();
        A2.setZc("a2");
        Flugzeug A3 = new Flugzeug();
        A3.setZc("a3");
        Flugzeug A4 = new Flugzeug();
        A4.setZc("a4");
        Flugzeug [] fz = new Flugzeug [6];
        fz[0] = A1;
        fz[1] = A3;
        fz[2] = A2;
        fz[3] = A4;
        Flugzeug [] st = new Flugzeug[4];
        for(int i = 0; i<4; i++){
            char c = fz[i].getZc().charAt(0);


            if (c=='a'){
                c = fz[i].getZc().charAt(1);
                int b = c-'0';
                b--;
                st[b]=fz[i];
                    System.out.println(st[b]);
               }

         else if (c=='b') {

                c = fz[i].getZc().charAt(1);
                int b = c-'0';
                b--;
                st[b]=fz[i];
                System.out.println(st[b]);
            }
            else if (c=='c') {

                c = fz[i].getZc().charAt(1);
                int b = c-'0';
                b--;
                st[b]=fz[i];
                System.out.println(st[b]);
            }
            else if (c=='d') {

                c = fz[i].getZc().charAt(1);
                int b = c-'0';
                b--;

                st[b]=fz[i];
                System.out.println(st[b]);
            }

        }
        System.out.println(st[0]);
        System.out.println(st[1]);
        System.out.println(st[2]);
        System.out.println(st[3]);
    }
}


