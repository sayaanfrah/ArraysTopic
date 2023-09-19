package Algorithms;

public class secondSearch {
    public static int dishes(String menu[], String target) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String menu[] = { "Dosa", "Idli", "Chowmin", "Biryani", "Chicken_roll", "Chicken_chilli" };
        String target = "Biryani";

        int index = dishes(menu, target);
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println(target + " Is at index " + index);
        }
    }

}
