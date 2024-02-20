/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

public class TestUserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to UserProfile Creator!");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Choose your favorite genre:");
        System.out.println("1. Comedy");
        System.out.println("2. Drama");
        System.out.println("3. Action");
        System.out.println("4. Mystery");
        System.out.print("Enter the number corresponding to your favorite genre: ");
        int choice = scanner.nextInt();

        String favoriteGenre;
        switch (choice) {
            case 1:
                favoriteGenre = "Comedy";
                break;
            case 2:
                favoriteGenre = "Drama";
                break;
            case 3:
                favoriteGenre = "Action";
                break;
            case 4:
                favoriteGenre = "Mystery";
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Comedy.");
                favoriteGenre = "Comedy";
        }

        UserProfile userProfile = new UserProfile(name, favoriteGenre);
        System.out.println("UserProfile created successfully!");
        System.out.println("UserID: " + userProfile.getUserID());
        System.out.println("Favorite Genre: " + userProfile.getGenre());
    }
}
