package br.com.meat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.meat.model.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

}
