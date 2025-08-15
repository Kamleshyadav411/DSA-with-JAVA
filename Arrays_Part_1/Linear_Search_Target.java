import java.util.*;

public class Linear_Search_Target{
    public static int Naam(String[] name, String target) {
        for (int i = 0; i < name.length; i++) {
            if (name[i].equals(target)) {
                return i;
            }
        }
        return -1; // Indicates not found
    }

    public static void main(String[] args) {
        String[] name = {"himanshu", "abhi", "kamlesh"};
        String target = "kamlesh";

        int index = Naam(name, target);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Target is at index = " + index);
        }
    }
}