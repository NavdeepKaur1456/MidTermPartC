/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author navde
 */
public class TestUserprofile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to UserProfile creation!");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Choose your favorite genre:");
        System.out.println("1. Action");
        System.out.println("2. Comedy");
        System.out.println("3. Drama");
        System.out.println("4. Sci-Fi");
        System.out.println("5. Horror");
        System.out.print("Enter the number corresponding to your favorite genre: ");
        int choice = scanner.nextInt();
        String genre;
        switch (choice) {
            case 1:
                genre = "Action";
                break;
            case 2:
                genre = "Comedy";
                break;
            case 3:
                genre = "Drama";
                break;
            case 4:
                genre = "Sci-Fi";
                break;
            case 5:
                genre = "Horror";
                break;
            default:
                genre = "Unknown";
        }

        System.out.println("Your userProfile was created!");
        System.out.println("Name: " + name);
        System.out.println("Favorite Genre: " + genre);
    }
    
}
