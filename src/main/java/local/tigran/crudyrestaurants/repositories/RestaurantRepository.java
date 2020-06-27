package local.tigran.crudyrestaurants.repositories;

import local.tigran.crudyrestaurants.models.Restaurant;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {

    List<Restaurant> findByNameContainingIgnoreCase(String likename);
}
