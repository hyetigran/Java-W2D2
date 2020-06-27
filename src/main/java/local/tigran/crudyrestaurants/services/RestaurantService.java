package local.tigran.crudyrestaurants.services;

import local.tigran.crudyrestaurants.models.Restaurant;

import java.util.List;

public interface RestaurantService {

   List<Restaurant> findAllRestaurants();

   Restaurant findRestaurantById(long id);

   List<Restaurant> findByNameLike(String thename);
}
