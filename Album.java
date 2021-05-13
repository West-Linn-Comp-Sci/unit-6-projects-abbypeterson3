
/**
 * Write a description of class Album here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Album
{
    private String title;
    private String name;
    private int numSongs;
    private double length;
    
    public Album(String title, String name, int numSongs, double length){
      this.title = title;
      this.name = name;
      this.numSongs= numSongs;
      this.length = length;
     
    }
    public String getTitle(){
        return title;
    }
    public String getName(){
        return name;
    }
    public int getNumSongs(){
         return numSongs;
        }
    public double getLength(){
            return length;
        }

        public String toString(){
            String result = ("Title: " + title+"\n"+ "Artist: " + name+"\n" + " # of songs: "+ numSongs+"\n"+ "Total time length of album: "+ length);
            return result;
        }
    }