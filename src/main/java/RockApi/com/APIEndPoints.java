package RockApi.com;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@RestController
public class APIEndPoints {
    HashMap<Integer,User> Db = new HashMap<>();

    @GetMapping("/getWeatherDetails")
    public String getWeatherInfo()
    {
        return "todays weather is rainy and windy";
    }
    @GetMapping("/calculateSum")
    public String calculateSum(@RequestParam("n1")Integer n1,@RequestParam("n2")Integer n2){
        int sum=n1+n2;
        return "total sum is"+sum;
    }
    @PostMapping("/signUpUser")
        public String signUpAUser(@RequestBody User user){
            int primaryKey=user.getId();
            Db.put(primaryKey,user);
            return "user with the name "+ user.getName() + " has been added in DB";
        }
      @GetMapping("/getUserById")
        public User findUserById(@RequestParam("id")Integer id){
        User user = Db.get(id);
        return user;
      }
      @GetMapping("/getUserBYCountry/{country}")
      public List<User> getInfoUser(@PathVariable("country")String country){
        List<User> anslist = new ArrayList<>();
        for(User users: Db.values()){
            if(users.getCountry().equals(country)){
                anslist.add(users);
            }
        }
            return anslist;
      }

      @DeleteMapping("/deleteUser/{name}")
    public String deleteUser(@PathVariable("name")String name ){
        for(int key:Db.keySet())
        {
            User user=Db.get(key);
            if(user.getName().equals(name)){
                Db.remove(key);
            }
        }
        return "user with the name "+ name+" have been removed";

      }
    }

