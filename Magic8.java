import java.util.Random;
public class Magic8 {

public static void main(String[] args) {
  Random rand = new Random();
  int upperbound = 7;
  int int_random = rand.nextInt(upperbound);
 
 if (int_random == 0) {
   System.out.println("NO!");
 }
 else if (int_random == 1) {
   System.out.println("YES!");
}
else if (int_random == 2) {
   System.out.println("You should think about it more...");
}
else if (int_random == 3) {
   System.out.println("Not now. Later.");
}
else if (int_random == 4) {
   System.out.println("Of course not! ");
}
else if (int_random == 5) {
   System.out.println("Go for it!");
}
else {
   System.out.println("Maybe");
}

}
}