import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String> cardSet = new HashSet<>(cards);

    return cardSet;
    }

    static boolean addCard(String card, Set<String> collection) {
       Set<String> cardSet = new HashSet<>(collection);
        return collection.add(card);

    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        int myCount = 0;
        int theirCount = 0;
        
        for (String card : myCollection) {
            if (!theirCollection.contains(card)){
                myCount ++;
            }
        }

        for (String card : theirCollection) {
            if(!myCollection.contains(card)) {
                theirCount ++;
            }
        }

        if(myCount > 0 && theirCount > 0) {
            return true;
        } else {
            return false;
        }
     }

    static Set<String> commonCards(List<Set<String>> collections) {
        int numOfCollections = collections.size();
        int smallestCollectionLength = collections.get(0).size();
       
        int smallestCollection = 0;
       
        if (numOfCollections == 1){
            return collections.get(0);
        }

        for (int i = 0; i < numOfCollections; i ++) {
            if (collections.get(i).size() < smallestCollectionLength) {
                smallestCollection = i;
                smallestCollectionLength = collections.get(i).size();
            } 
        }

        Set<String> searchList = new HashSet<>(collections.get(smallestCollection));
      
     Iterator<String> iterator = searchList.iterator();

    while(iterator.hasNext()) {
        String card = iterator.next();

        for (int j = 0; j < numOfCollections; j++) {
            if (!collections.get(j).contains(card)) {
                iterator.remove(); // remove safely while iterating
                break; // no need to check other collections for this card
            }
        }
    }
        return searchList;
        
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> allCardsList = new HashSet<>(collections.get(0));
        int numOfCollections = collections.size();

        for (int i = 1; i < numOfCollections; i ++) {
            Set<String> collection = collections.get(i);
            for (String card: collection){
                allCardsList.add(card);
            }
        }
        return allCardsList;
    }
}
