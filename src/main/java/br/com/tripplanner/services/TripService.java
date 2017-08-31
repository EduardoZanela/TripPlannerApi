package br.com.tripplanner.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tripplanner.models.Trip;
import br.com.tripplanner.repository.TripRepository;

@Service
public class TripService {

	@Autowired
	private TripRepository repository;
	
	public Iterable<Trip> getAll(){
		return repository.findAll();
	}
	
}
