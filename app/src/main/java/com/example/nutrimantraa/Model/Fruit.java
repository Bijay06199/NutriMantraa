package com.example.nutrimantraa.Model;

import java.util.ArrayList;

public class Fruit  {

    private  String name;
    private ArrayList<String> descriptions;
    private ArrayList<String> benefits;
    private String image;
    private String link;
    private ArrayList<Nutrition>  nutritions;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(ArrayList<String> descriptions) {
        this.descriptions = descriptions;
    }

    public ArrayList<String> getBenefits() {
        return benefits;
    }

    public void setBenefits(ArrayList<String> benefits) {
        this.benefits = benefits;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public ArrayList<Nutrition> getNutritions() {
        return nutritions;
    }

    public void setNutritions(ArrayList<Nutrition> nutritions) {
        this.nutritions = nutritions;
    }
}
