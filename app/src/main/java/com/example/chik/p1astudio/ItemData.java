package com.example.chik.p1astudio;

public class ItemData {
    private String name;
    private String description;
    private String price;
    private int image;

    public ItemData(String name, String description, int image, String price){
            this.name = name;
            this.description = description;
            this.image = image;
            this.price = price;
        }

    public String getName() {
        return name; }

    public String getDescription() {
        return description;
    }

    public String getPrice(){
        return price;
    }

    public int getImage() {
        return image;
    }
}

