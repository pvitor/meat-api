package br.com.meat.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.meat.model.Restaurant;
import br.com.meat.service.RestaurantService;

@RestController
@RequestMapping("/restaurants")
public class RestaurantResource {
	
	@Autowired
	private RestaurantService restaurantService;
	
	@GetMapping
	public List<Restaurant> findAll() {		
		return restaurantService.findAll();
	}
	
	@GetMapping("/{idRestaurant}")
	public Restaurant findById(@PathVariable String idRestaurant) {
		return restaurantService.findById(idRestaurant);
	}
	

}
