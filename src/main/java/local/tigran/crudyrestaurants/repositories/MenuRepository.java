package local.tigran.crudyrestaurants.repositories;

import local.tigran.crudyrestaurants.models.Menu;
import org.springframework.data.repository.CrudRepository;

public interface MenuRepository extends CrudRepository<Menu, Long> {
}
