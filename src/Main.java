import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> intList = new ArrayList<>();
        Random r = new Random();
        int x = r.nextInt(1000) ;
        for (int i = 0; i<=20; i++){
            intList.add(x);
            x = r.nextInt(1000);
        }
        System.out.println(intList);
        int i = 0;
        System.out.println();
        while (i != intList.size()){
            if (intList.get(i) % 2 != 0){
                intList.remove(i);
            } else {
                i++;
            }
        }
        System.out.println(intList);
    }
}