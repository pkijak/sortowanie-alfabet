public class Main {

    public static void main(String[] args) {

        String slowo[] = {"rewolwer", "mama", "rumcajs"};


        System.out.println("Podane przez Ciebie slowa to: \n" + slowo[0] + " - " + slowo[1] + " - " + slowo[2] + "\n");
        System.out.println("Tak wygladaja posortowane alfabetycznie:");

        String temp;
        boolean flag = true;

        while (flag) {
            flag = false;
            for (int i = 0; i <= 1; i++) {
                int kolejnosc = slowo[i].compareTo(slowo[i + 1]);
                if (kolejnosc > 0) {
                    temp = slowo[i];
                    slowo[i] = slowo[i + 1];
                    slowo[i + 1] = temp;
                    flag = true;
                }
            }
        }
        for (int x = 0; x <= 2; x++) {
            System.out.println(slowo[x]);
            System.out.println("Sortowanie udane2");
        }
    }
}
