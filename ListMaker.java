import java.util.*;

public class ListMaker {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Welome to ListMaker!");
        ArrayList<String> list = new ArrayList<>();
        boolean done = false;
        String option = new String(" ");
        do
        {
            option = SafeInput.getRegExString(in, "Select an option:\nA: Add an item to the list\nD: Delete an item from the list\nP: Print (i.e. display) the list\nQ: Quit the program", "[AaDdPpQq]");
            switch (option) {
                case "A":
                list.add(list.size(),SafeInput.getNonZeroLenString(in, "Enter the String you would like to add to the list: "));  
                    break;
                case "D":
                    list.remove(SafeInput.getRangedInt(in, "Enter the item of the list you would like to delete: ", 0, list.size()));
                    break;
                case "P":
                        System.out.println(list);
                    break;
                case "Q":
                    done = SafeInput.getYNConfirm(in, "Really quit? (Y/N)");
                    break;
                
            
            }
        }while(!done);
    }
}