package RockApi.com;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ServiceClass {
@Autowired
private RepositoryClass repositoryClassObj;
// ServiceClass sc = new ServiceClass():Equivalent
public String addTravelListItem(TravelList item){
      return repositoryClassObj.addTravelListItem(item);

    }
    public List<String> getTravelPlacesList(Integer userId ){
          List<TravelList> travelLists= repositoryClassObj.getTravelListDetails(userId);

          List<String> placeToVisit=new ArrayList<>();
          for(TravelList travelList:travelLists){
              placeToVisit.add(travelList.getPlaceName());
          }
          return placeToVisit;
    }
}
