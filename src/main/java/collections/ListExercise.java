package collections;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    public static void main(String[] args) {
        GroceryList groceryList = new GroceryList();

        groceryList.addToList("milk");
        groceryList.addToList("honey");
        groceryList.addToList("eggs");

        for(String item : groceryList.list) {
            System.out.println(item);
        }

        groceryList.removeFromList("honey");
        System.out.println();

        for(String item : groceryList.list) {
            System.out.println(item);
        }

        groceryList.addToList("milkshake");
        groceryList.addToList("mousse");


        char ch = 'm';
        System.out.println("Items beginning with " + ch);
        groceryList.showItemsBeginningWith(ch);
    }

}

class GroceryList {
    public List<String> list = new ArrayList<>();

    public void addToList(String string) {
        if(list.contains(string)) {
            return;
        }
        else {
            list.add(string);
        }
    }

    public void removeFromList(String string) {
        list.remove(string);
    }

    public void showItemsBeginningWith(char ch) {
        for(String string : list) {
            if(string.charAt(0) == ch) {
                System.out.println(string);
            }
        }
    }
}
