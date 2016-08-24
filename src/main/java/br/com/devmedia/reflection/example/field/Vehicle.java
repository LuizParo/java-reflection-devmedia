package br.com.devmedia.reflection.example.field;

import java.math.BigDecimal;

public class Vehicle {
    private String brand;
    private BigDecimal price;
    private Double weight;
    private Integer maxCapacityPassengers;
    private Double potency;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getMaxCapacityPassengers() {
        return maxCapacityPassengers;
    }

    public void setMaxCapacityPassengers(Integer maxCapacityPassengers) {
        this.maxCapacityPassengers = maxCapacityPassengers;
    }

    public Double getPotency() {
        return potency;
    }

    public void setPotency(Double potency) {
        this.potency = potency;
    }
}