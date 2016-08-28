package javaCSCI;
import java.util.Scanner;

public class P8_1tester
{
   public static void main(String[] args)
   {
      int secret1 = 12;
      int secret2 = 12;
      int secret3 = 12;

      P8_1 lock = new P8_1 (secret1, secret2, secret3);
      Scanner in = new Scanner(System.in);
      boolean opened = false;
      boolean turningRight = true;
      while (!opened)
      {
         System.out.println("Enter number of ticks to turn to the "
               + (turningRight ? "right" : "left")
               + " 0 - 39. Enter an invalid number to quit.");
         int ticks = in.nextInt();
         if ((ticks < 0) || (ticks > 39))
         {
            System.out.println("Invalid entry. The program will now exit.");
            return;
         }
         if (turningRight)
            lock.turnRight(ticks);
         else
            lock.turnLeft(ticks);
         turningRight = !turningRight;
         opened = lock.open();
      }
      System.out.println("You opened the lock!");
   }

}