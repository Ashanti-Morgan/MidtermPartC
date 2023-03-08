
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author ashan
 */
public class TestUserprofile {
   private String userID;//the userID
    private String genre;// the user's preferred genre of movie
    private static String[] genres = {"Comedy", "Drama", "Action", "Mystery"};//available genres of movies
    
    /**
     * A constructor that takes in the userID and the favourite genre
     * @param givenID the ID to assign to this user
     * @param givenGenre the users favourite genre
     */
    public void UserProfile(String givenID, String givenGenre)
    {
        userID = givenID;
        genre= givenGenre;
    }

    /**
     * A getter for the userID
     * @return the userID
     */
    public String getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    /**
     * A getter for the genre
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    
    

 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Choose your favourite genre from the following list:");
        
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }
        System.out.print("Enter the number matching your favourite genre: ");
        int genreIndex = scanner.nextInt();
        String genre = genres[genreIndex - 1];

        
        UserProfile userProf = new UserProfile(name, genre);
        System.out.println("Your userProfile was created.");
        

    }   
    
}





    
    


    

