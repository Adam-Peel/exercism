import java.util.*;

class IsogramChecker {

    boolean isIsogram(String phrase) {
      if (phrase.length() < 2){
          return true;
      }
        
        phrase = phrase.toLowerCase().replace("-","").replace(" ", "");
        char[] array = phrase.toCharArray();
        
        Arrays.sort(array);
    
      for (int i =0; i < array.length -1; i ++){
            if (array[i] == array[i+1]) {
                return false;
            }
      }      
    return true;        
    }

    
}
