
/**
 * Write a description of class MusicLibraryClient here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MusicLibraryClient
{
    public static void main(String[] args) {
        MusicLibrary myLibrary = new MusicLibrary();

        Album a1 = new Album("First", "one Guy", 10, 42.5);
        Album a2 = new Album("This Music", "Some Band", 9, 36);
        Album a3 = new Album("Play", "People", 12, 39.1);
        Album a4 = new Album("Change of Scenery II", "Quinn XCII",12,34);
        Album a5 = new Album("A Place we Knew","Dean Lewis",12,40);
        Album a6 = new Album("The life of Pablo", "Kanye West",20,66);
        Album a7 = new Album("Wanted on a voyage", "George Ezra", 16,57);
        Album a8 = new Album("In between Dreams", "Jack Johnson",14,41);
        Album a9 = new Album("What you see Ain't always what you get", "Luke Combs",23,81);
        Album a10 = new Album("Cleopatra", "The Lumineers", 15,47);

        myLibrary.add(a1);
        myLibrary.add(a2);

        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        myLibrary.doubleSize();

        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        myLibrary.remove(1);
        myLibrary.add(a3);
        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        
        myLibrary.remove(1);
        myLibrary.remove(2);
        myLibrary.add(a8);
        myLibrary.add(a5);

        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        
        myLibrary.add(a6);
         System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        
        myLibrary.searchByTitle();
        System.out.println(myLibrary);
        
        System.out.println("+++++++++++++++++++++++++++++++++++++++");

    }
}

