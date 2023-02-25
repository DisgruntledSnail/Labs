/*
    Jeff Chadrick
    Feb. 11, 2023
    CSCI2467 WEB73351
    Grocery list app.
 */

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int count = 0;
        String[] groceryList = new String[6];
        System.out.println("\t:Grocery List:");
        while (groceryList.length > count) {
            System.out.print("Enter your item: ");
            String newItem = input.nextLine();

            if (isDuplicate(newItem, groceryList, count)) {
                System.out.println("This item is already on the list.");
            } else {
                groceryList[count] = newItem.toLowerCase();
                count++;
            }
        }

        Arrays.sort(groceryList);
        System.out.println("\t:Your Grocery List:");
        for (String item : groceryList) {
            System.out.println(item);
        }
    }
    public static boolean isDuplicate (String item, String[] list, int listcnt) {
        boolean response = false;
        for (int i = 0; i < listcnt; i++) {
            if (list[i].equalsIgnoreCase(item)) {
                response = true;
            }
        }
        return response;
    }
}