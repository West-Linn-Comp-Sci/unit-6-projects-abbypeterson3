
/**
 * Write a description of class ArrayList5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class ArrayList5
{
    public static void removeZeros(ArrayList<Integer>list){
        for(int i =0; i<list.size(); i++){
         if (list.get(i)==0) {
             list.remove(i);
            }
        }
    }
    public int countLetters(ArrayList<String> list){
        int count =0;
        for(String i: list){
            count += i.length();
        }
        return count;
    }
    public int  findPosition(ArrayList<Integer> list, int keyValues){
        for(int i = 0; i< list.size(); i++){
            if(list.get(i)== keyValues){
            keyValues = list.get(i);
        }
    }
    return keyValues;
}
public static ArrayList<String> parseIntoArrayList(String input){
   ArrayList<String> temp = new ArrayList<String>();
   for(int i =0; i<input.length();i++){
       temp.add(input.substring(i,i+1));
       
    }
    return temp;
}
private int ages;
private String names;
public Person(int age, String name){
    ages = age;
    names = name;
}
public int getAge(){
    return ages;
}
public String getName(){
    return names;
}
public static String findMin(ArrayList<Person> list){
    
    int min =100;
    for(int i =0; i<list.size(); i++){
        if(Person.get(i).getAge<min){
            min = Person.get(i).getAge;
        }
    }
    return Person.getName(indexOf(min));
}
}
