package Algorithms;

public class numberSearch {
    public static int linearSearch(String menu[], String target) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == target) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        String menu[] = { "Dosa", "Idli", "Samosa", "Chowmin", "Chilli", "PeriPeri", "Coldrinks" };
        String target = "Chilli";
        int index = linearSearch(menu, target);
        System.out.println(target + " is at Index " + linearSearch(menu, target));
    }

}
