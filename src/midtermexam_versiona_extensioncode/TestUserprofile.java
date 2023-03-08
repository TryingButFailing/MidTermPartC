package midtermexam_versiona_extensioncode;

import java.util.Scanner;

public class TestUserprofile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for name and genre choice
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Choose your favorite genre:");
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ") " + genres[i]);
        }
        System.out.print("Enter the number of your genre choice: ");
        int genreChoice = input.nextInt();

        // Create UserProfile object with chosen genre
        UserProfile userProfile = new UserProfile(name, genres[genreChoice - 1]);

        //Notify user their profile was made
        System.out.println("User profile created: " + userProfile.getUserID() + ", " + userProfile.getGenre());
    }
}
