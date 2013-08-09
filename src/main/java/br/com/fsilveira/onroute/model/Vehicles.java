package br.com.fsilveira.onroute.model;

import java.util.Collection;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Vehicles {

    @XmlElement(name="vehicle")
    private Collection<Vehicle> vehicles;

    public Vehicles(Collection<Vehicle> vehicles) {
	super();
	this.vehicles = vehicles;
    }

    public Vehicles() {
    }

    public Collection<Vehicle> getVehicles() {
	return vehicles;
    }

    public void setVehicles(Collection<Vehicle> vehicles) {
	this.vehicles = vehicles;
    }

}