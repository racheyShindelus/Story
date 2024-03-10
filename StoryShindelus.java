/*
Name: Rachel Shindelus
Date: 10/16/2022
Program Description: This program is meant to have a user answer all the desired questions, 
   similar to a MadLib, in order to create a story generated with all their answers included
   to form new sentences. 
Self Grade: I believe I should receive 100% oon this assignment as I have completed everything
   required of the assingmnet and it all fullfills the rubric. 
*/

import java.util.*;
import java.lang.Math;
public class StoryShindelus   { /* No Code Goes Here */}
class StoryTime   {
  public static void main(String[] args)  // GIVEN
  {
    Scanner kb = new Scanner(System.in);
    System.out.print("How many stories are you making: ");
    int count = kb.nextInt();
    kb.nextLine();
    for(int i = 1; i <= count ; i++)   {
      System.out.println("\n\nAnswer a few questions and I will make up a story for you\n");
      questionsForUser();
    }
  }
  // Asks the user 10 different questions and stores their input into variables
  public static void questionsForUser( )  {
  Scanner pb = new Scanner(System.in);
  System.out.print("What is your favorite animal? "); // Print Question 1
  String favAnimal = pb.nextLine();
  System.out.print("Name a noun: ");   // Print Question 2
  String animalName = pb.nextLine();
  System.out.print("Pick your favorite color: ");  // Print Question 3
  String houseColor = pb.nextLine();
  System.out.print("What is your favorite beverage: ");  // Print Question 4
  String favDrink = pb.nextLine();
  System.out.print("Enter a number containing two decimal points: ");  // Print Question 5
  double drinkPrice = pb.nextDouble();
  System.out.print("What is your favorite goodie?: ");  // Print Question 6
  String favoriteGoodie = pb.next();
  System.out.print("What is your favorite sport?: ");  // Print Question 7
  String favoriteSport = pb.next();
  System.out.print("Pick a color: ");  // Print Question 8
  String jerseyColor = pb.next();
  System.out.print("Pick an emotion: ");  // Print Question 9
  String characterEmotion = pb.next();
  System.out.print("Pick a number between 1 and 12: ");  // Print Question 10
  int numTime = pb.nextInt();
  printStory(favAnimal, animalName, houseColor, favDrink, drinkPrice, favoriteGoodie, favoriteSport, jerseyColor, characterEmotion, numTime);
  }
  // Prints the story using the user inputs derived from the method "questionsForUser as its parameters"
  public static void printStory(String A_favAnimal, String A_animalName, String A_houseColor, String A_favDrink, double A_drinkPrice, 
   String A_favoriteGoodie, String A_favoriteSport, String A_jerseyColor, String A_characterEmotion, int A_numTime)   {
  System.out.print("\n\tThere once was a cuddly " + A_favAnimal + " named " + A_animalName + ". " + 
   A_animalName + " lives in a big, " + A_houseColor + " house in the \nmiddle of the forest. " +
   "At about " + A_numTime + " O'clock, " + A_animalName + " went out on a stroll through the \nforest into town. " +
   "There, they walked into a coffee shop and ordered a " + A_favDrink + ". The \ntotal for their drink came to $" + A_drinkPrice + 
   " but the man who ordered after them exclaimed \n\"MY DRINK CAME TO $" + Math.sqrt(A_drinkPrice) + "!!! " + A_animalName +
   " saw the mans cup, but it had their own initial \non the cup \"" + A_animalName.charAt(0) + "\"! " + A_animalName + " was so upset" +
   " their favorite drink was going to the upset man! " + A_animalName + " \ntold the barista that that was his drink. The workers apologized " +
   "and gave them \na " + A_favoriteGoodie + " and made them a new drink! " + A_animalName + " was so much happier! " + A_animalName + " left " +
   "the coffee \nshop and began walking down the street. They stubled upon a " + A_favoriteSport + " game. " + A_animalName + " began \nwatching. " +
   "They saw the " + A_jerseyColor + " team score a win the entire game! " + A_animalName + " was so " + A_characterEmotion + " that he \nended his " +
   "day, went on a stroll home, and went to the kitchen to grab another " + A_favoriteGoodie + " to \nend the day with their favorite goodie before " + 
   "heading to bed at " + A_numTime);
   if (A_numTime >= 5) {
      System.out.print("PM"); }
   else
      System.out.print("AM");
  }
}    