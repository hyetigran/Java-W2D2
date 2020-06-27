package local.tigran.crudyrestaurants.controllers;

import local.tigran.crudyrestaurants.models.Restaurant;
import local.tigran.crudyrestaurants.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/resturants")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;
    //http://localhost:2019/restaurants/restaurants

    @GetMapping(value = "/resturants", produces = {"application/json"})
    public ResponseEntity<?> listAllRestaurants(){
        List<Restaurant> myRestaurants = restaurantService.findAllRestaurants();
        return new ResponseEntity<>(myRestaurants, HttpStatus.OK);
    }
    //http://localhost:2019/restaurants/restaurant/3
    @GetMapping(value="/resturants/{id}", produces = {"application/json"})
    public ResponseEntity<?> findRestaurantById(@PathVariable long id) {
        Restaurant r = restaurantService.findRestaurantById(id);
        return new ResponseEntity<>(r, HttpStatus.OK);
    }
    //http://localhost:2019/restaurants/resturant/likename/eat
    @GetMapping(value="/resturants/likename/{thename}", produces = {"application/json"})
    public ResponseEntity<?> findAllRestaurantsLikeName(String thename) {
        List<Restaurant> myRestuarants = restaurantService.findByNameLike(thename);
        return new ResponseEntity<>(myRestuarants, HttpStatus.OK);
    }
}
