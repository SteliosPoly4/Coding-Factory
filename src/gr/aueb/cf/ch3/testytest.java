package gr.aueb.cf.ch3;

import java.util.Scanner;

public class testytest {

    public static void main(String[] args) {

        int emojiStart = 0x1f600;
        int emojiEnd = 0x1f64f;
        int counter = 0;
        int emoji;

        emoji = emojiStart;
        while (emoji<emojiEnd) {
            System.out.print(Character.toChars(emoji));
            System.out.print(" ");
            emoji++;
            counter++;
            if (counter % 16 == 0 ) {
                System.out.println();
            }

        }

    }
}
