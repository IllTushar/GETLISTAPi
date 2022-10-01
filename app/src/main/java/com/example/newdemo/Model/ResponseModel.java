package com.example.newdemo.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ResponseModel {
    @SerializedName("page")
    private float page;
    @SerializedName("per_page")
    private float per_page;
    @SerializedName("total")
    private float total;
    @SerializedName("total_pages")
    private float total_pages;
    @SerializedName("data")
    public List< DataResponse > data = null;

    public float getPage() {
        return page;
    }

    public void setPage(float page) {
        this.page = page;
    }

    public float getPer_page() {
        return per_page;
    }

    public void setPer_page(float per_page) {
        this.per_page = per_page;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(float total_pages) {
        this.total_pages = total_pages;
    }

    public static class DataResponse
    {
        @SerializedName("id")
        private int id;
        @SerializedName("year")
        private int year;
        @SerializedName("name")
        private String name;
        @SerializedName("color")
        private String  color;
        @SerializedName("pantone_value")
        private String pantone_value;
        @SerializedName("email")
        private String email;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getPantone_value() {
            return pantone_value;
        }

        public void setPantone_value(String pantone_value) {
            this.pantone_value = pantone_value;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }


}
