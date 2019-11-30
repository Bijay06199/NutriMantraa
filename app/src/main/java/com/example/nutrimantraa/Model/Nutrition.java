package com.example.nutrimantraa.Model;

public class Nutrition  {

    private String nutrientValue;
    private  String percentageRDA;
    private  String principle;
    private String type;

    public String getNutrientValue() {
        return nutrientValue;
    }

    public void setNutrientValue(String nutrientValue) {
        this.nutrientValue = nutrientValue;
    }

    public String getPercentageRDA() {
        return percentageRDA;
    }

    public void setPercentageRDA(String percentageRDA) {
        this.percentageRDA = percentageRDA;
    }

    public String getPrinciple() {
        return principle;
    }

    public void setPrinciple(String principle) {
        this.principle = principle;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
