package br.com.tripplanner.service;

import br.com.tripplanner.model.Trip;

public interface TripService {
	Iterable<Trip> getAll();
}
