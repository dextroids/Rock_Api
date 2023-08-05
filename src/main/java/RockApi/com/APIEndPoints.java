package RockApi.com;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;


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
    }

