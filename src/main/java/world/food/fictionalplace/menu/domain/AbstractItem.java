package world.food.fictionalplace.menu.domain;

import world.food.fictionalplace.dictionary.SizeEnum;
import world.food.fictionalplace.dictionary.TemperatureEnum;

import javax.persistence.*;


public abstract class AbstractItem {

    @Column(name = "name")
    protected String name;
    @Column(name = "price")
    protected Double price;
    @Column(name = "size")
    protected SizeEnum size;
    @Column(name = "temperature")
    protected TemperatureEnum temperature;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public SizeEnum getSize() {
        return size;
    }

    public void setSize(SizeEnum size) {
        this.size = size;
    }

    public TemperatureEnum getTemperature() {
        return temperature;
    }

    public void setTemperature(TemperatureEnum temperature) {
        this.temperature = temperature;
    }
}
