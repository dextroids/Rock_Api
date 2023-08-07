package RockApi.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RepositoryClass {

    HashMap<Integer,List<TravelList>> hm = new HashMap<>();

    public String addTravelListItem(TravelList travelListItem){
             int primaryKey=travelListItem.getUserId();
             List<TravelList> travelItems = hm.getOrDefault(primaryKey,new ArrayList<>());
             travelItems.add(travelListItem);
             hm.put(primaryKey,travelItems);
             return "Travel List item has been added into the bucketList";
    }
    public List<TravelList> getTravelListDetails(Integer userId){
          return hm.getOrDefault(userId,new ArrayList<>());
    }
}
