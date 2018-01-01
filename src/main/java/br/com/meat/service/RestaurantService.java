package br.com.meat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.meat.model.Restaurant;
import br.com.meat.repository.RestaurantRepository;

@Service
public class RestaurantService {
	
	@Autowired
	private RestaurantRepository restaurantRepository;
	
	
	public List<Restaurant> findAll(){
		return restaurantRepository.findAll();
	}

}
