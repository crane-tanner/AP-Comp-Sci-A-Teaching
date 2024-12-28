//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 1; i < 110; i++) {
            count += String.valueOf(i).length() -
                    String.valueOf(i).replace("9", "").length();
            if(count > 0) {
                System.out.println(i);
            }
        }
        System.out.println("There are " + count + " occurrences of the number 9 in the specified range.");

    }
}
