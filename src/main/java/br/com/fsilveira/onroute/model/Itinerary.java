package br.com.fsilveira.onroute.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Itinerary {

    private String origin;
    private String destination;
    private List<String> wayPoints;

    public Itinerary() {
	wayPoints = new ArrayList<String>();
    }

    public List<String> getWayPoints() {
	return wayPoints;
    }

    public void setWayPoints(List<String> wayPoints) {
	this.wayPoints = wayPoints;
    }

    public String getOrigin() {
	return origin;
    }

    public void setOrigin(String origin) {
	this.origin = origin;
    }

    public String getDestination() {
	return destination;
    }

    public void setDestination(String destination) {
	this.destination = destination;
    }

}
