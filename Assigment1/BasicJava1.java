import java.util.Arrays;
import java.util.Scanner;

public class BasicJava1 {
    public static double ConvertToFahrenheit(double celsius) {
        return (double) (celsius * (9.0 / 5.0) + 32);
    }

    public static int sumOddRange(int start, int end) {
        int summ = 0;
        for (int i = start; i < end; i++) {
            if (i % 2 != 0) {
                summ = summ + i;
            }
        }
        return summ;
    }

    public static int countChar(String thing, char ch) {
        int counter = 0;
        for (int i = 0; i < thing.length(); i++) {
            if (thing.charAt(i) == ch) {
                counter++;
            }
        }
        return counter;
    }

    public static boolean isPalindrome(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static String highestRatedMovie(String[] movieList, double[] ratingList) {
        double rating = ratingList[0];
        String movie = movieList[0];
        for (int i = 0; i < ratingList.length; i++) {
            if (ratingList[i] > rating) {
                rating = ratingList[i];
                movie = movieList[i];
            }
        }
        return movie;
    }

    public static String lowestRatedMovie(String[] movieList, double[] ratingList) {
        double rating = ratingList[0];
        String movie = movieList[0];
        for (int i = 0; i < ratingList.length; i++) {
            if (ratingList[i] < rating) {
                rating = ratingList[i];
                movie = movieList[i];
            }
        }
        return movie;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Problem 1:");
        System.out.printf("Enter temperature in degrees Celsius: ");
        System.out.println("Your temperature is " + ConvertToFahrenheit(sc.nextDouble()) + " in Fahrenheit");
        System.out.println();

        System.out.println("Problem 2:");
        System.out.printf("Enter your start value: ");
        int start = sc.nextInt();
        System.out.printf("Enter your end value: ");
        int end = sc.nextInt();
        System.out.println("The sum of your range is: " + sumOddRange(start, end));
        System.out.println();

        System.out.println("Problem 3:");
        System.out.printf("Enter your string: ");
        String word = sc.next();
        System.out.printf("Enter the character you want to count: ");
        char ch = sc.next().charAt(0);
        System.out.println("Character " + ch + " appears " + countChar(word, ch) + " times in your string");
        System.out.println();

        System.out.println("Problem 4:");
        System.out.printf("Enter a string: ");
        String new_word = sc.next();
        if (isPalindrome(new_word) == true) {
            System.out.println("Your string is a palindrome!");
        } else {
            System.out.println("Your string is not a palindrome(");
        }
        System.out.println();

        System.out.println("Problem 5:");
        String[] movies = new String[] { "Death Note", "JoJo", "Oshi NoKo", "K-On", "Evangelion" };
        double[] ratings = new double[] { 9.5, 10.0, 8.9, 6.2, 8.6 };
        System.out.println("Movies List: " + Arrays.toString(movies));
        System.out.println("Ratings List: " + Arrays.toString(ratings));
        System.out.println("Highest ranked movie: " + highestRatedMovie(movies, ratings));
        System.out.println();

        System.out.println("Problem 6:");
        System.out.println("Movies List: " + Arrays.toString(movies));
        System.out.println("Ratings List: " + Arrays.toString(ratings));
        System.out.println("Lowest ranked movie: " + lowestRatedMovie(movies, ratings));

        sc.close();
    }
}
