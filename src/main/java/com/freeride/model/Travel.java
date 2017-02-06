package com.freeride.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Chamath Abeysinghe on 2/4/2017.
 */
@Entity
@Table(name = "travel")
public class Travel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Column(nullable = false)
    private String status;

    @NotEmpty
    @Column(nullable = false)
    private String route;

    @NotEmpty
    @Column(nullable = false)
    private String startTime;

    @NotEmpty
    @Column(nullable = false)
    private String fromLocation;

    @NotEmpty
    @Column(nullable = false)
    private String endLocation;



    @NotEmpty
    @Column(nullable = false)
    private Long vehicleId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    @Override
    public String toString() {
        return "Travel [id=" + id + "]";
    }

}
