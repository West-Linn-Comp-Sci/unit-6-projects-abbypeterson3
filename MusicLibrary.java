
/**
 * Write a description of class MusicLibrary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MusicLibrary
{
    private Album[] library;
    private double totalPlayTime;
    private int totalTracks;
    private int openIndex;
    public MusicLibrary(){
         library = new Album[10];
         totalPlayTime = 0;
         totalTracks = 0;
         openIndex = 0;
    }
    public void doubleSize(){
      Album[] newLibrary = new Album[library.length *2];
      for (int i =0; i < library.length; i++){
          newLibrary[i]=library[i];
        }
        library = newLibrary;
    }
    public void add(Album album){
        if(openIndex == -1){
            System.out.println("Your music Library is full!");
        }
        else{
           library[openIndex] = album;
           totalTracks += album.getNumSongs();
            totalPlayTime +=album.getLength();
    
        
        int x;
            for(x=0; x<library.length; x++){
                if(library[x]==null){
                openIndex = x;
                break;
            }
    }
        if(x== library.length){
            openIndex = -1;
    }
}
}
    public void remove(int index){
        totalTracks -= library[index].getNumSongs();
        totalPlayTime -= library[index].getLength();
        library[index] = null;
    }
    public void sortByTitle(){ //selection sort
        Album temp;
        int min;
        for(int i =0; i <library.length-1; i++){
            min = i;
            for(int scan = i+1; scan <library.length; scan++){
             if(library[scan] != null && library[i] != null){
                if(library[scan].getTitle().compareToIgnoreCase(library[min].getTitle())<0) {
                    min = scan;
                }
                 
            }
        }
        temp = library[min];
        library[min]= library[i];
        library[i] = temp;
    }
}
     public void sortByArtist(){ //intersection sort
        for(int i = 1; i <library.length; i++){
            Album key = library[i];
            int position = i;
            while(position > 0 && library[position-1]> key){
             library[position].getName().compareToIgnoreCase(library[position-1].getName());
                    }
                library[position]= library[i];
            library[i]= key;
            }
          
        }
    
    public void searchByTitle(){ //binary search
        Album target;
        int low = 0;
        int high = library.length-1;
        int middle = (low+high)/2;
        while(library[middle] != target && low<=high ){
          if(target.compareTo(library[middle]))
          high = middle -1;
          else
          low = middle +1;
          middle = (low+high)/2;
        }
        if (library[middle].equals(target));
        return middle;
        else
        return -1;
    
}
    public void searchByArtist(){ //binary search
       Album target;
        int low = 0;
        int high = library.length-1;
        int middle = (low+high)/2;
        while(library[middle].getName() != target && low<=high ){
          if(target<library[middle].getName())
          high = middle -1;
          else 
          low = middle +1;
          middle = (low+high)/2;
        }
        if (library[middle].getName== target)
        return middle;
        else
        return -1;  
    }

    public String toString(){
      String result = ("The total number of tracks: "+totalTracks+ "\n" + "Total length of Album: "+totalPlayTime +" min"+ "\n" + "Size of library: "+ library.length+ "\n");
      for(int i =0; i<library.length; i++){
          if(library[i]!= null)
          result += library[i] + "\n\n";
        }
        return result;
    }
   
}
