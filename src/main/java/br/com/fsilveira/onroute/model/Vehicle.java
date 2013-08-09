package br.com.fsilveira.onroute.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "vehicle")
@XmlAccessorType(XmlAccessType.FIELD)
public class Vehicle {

    private String name;
    private Itinerary itinerary;
    private Position currentPosition;

    public Vehicle() {
	// TODO Auto-generated constructor stub
    }

    public Vehicle(String name, Itinerary itinerary, Position currentPosition) {
	super();
	this.name = name;
	this.itinerary = itinerary;
	this.currentPosition = currentPosition;
    }

    public Position getCurrentPosition() {
	return currentPosition;
    }

    public void setCurrentPosition(Position currentPosition) {
	this.currentPosition = currentPosition;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public Itinerary getItinerary() {
	return itinerary;
    }

    public void setItinerary(Itinerary itinerary) {
	this.itinerary = itinerary;
    }

}
