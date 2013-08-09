package br.com.fsilveira.onroute.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.fsilveira.onroute.model.Itinerary;
import br.com.fsilveira.onroute.model.Position;
import br.com.fsilveira.onroute.model.Vehicle;

public class VehicleDAO {

    private List<Vehicle> vehicles;

    public VehicleDAO() {
	vehicles = new ArrayList<Vehicle>();

	Itinerary itinerary = new Itinerary();
	itinerary.setOrigin("florianopolis, sc");
	itinerary.getWayPoints().add("alfredo wagner, sc");
	itinerary.getWayPoints().add("urubici, sc");
	itinerary.getWayPoints().add("sao joaquim, sc");
	itinerary.getWayPoints().add("lages, sc");
	itinerary.getWayPoints().add("vacaria, rs");
	itinerary.getWayPoints().add("caxias do sul, rs");
	itinerary.getWayPoints().add("osorio, rs");
	itinerary.setDestination("florianopolis, sc");

	vehicles.add(new Vehicle("V01", itinerary, new Position(-27.693465, -48.966064)));
    }

    public List<Vehicle> getVehicles() {
	return vehicles;
    }

}
