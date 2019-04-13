package com.example.textiletest.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Textile {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String textileKind;
    private float pricePerMeter;
    private float amount;

    public Textile(String name, float pricePerMeter, float amount, String textileKind) {
        this.name = name;
        this.pricePerMeter = pricePerMeter;
        this.amount = amount;
        this.textileKind = textileKind;
    }

    public Textile() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPricePerMeter() {
        return pricePerMeter;
    }

    public void setPricePerMeter(float pricePerMeter) {
        this.pricePerMeter = pricePerMeter;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getTextileKind() {
        return textileKind;
    }

    public void setTextileKind(String textileKind) {
        this.textileKind = textileKind;
    }

    @Override
    public String toString() {
        return "Textile{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", textileKind='" + textileKind + '\'' +
                ", pricePerMeter=" + pricePerMeter +
                ", amount=" + amount +
                '}';
    }
}
