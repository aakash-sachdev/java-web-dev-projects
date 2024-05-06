package org.launchcode;

import com.sun.source.tree.ReturnTree;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class MenuItem {

    private String name;
    private String description;
    private double price;
    private String category;
    private final LocalDate dateAdded;

    public MenuItem(String name , String description, double price, String category ) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.dateAdded = LocalDate.now(); // when we instantiate something get the date write this moment and it final so can't be changed
        // this.dateAdded = LocalDate.parse("2022-06-22"); // Use line below instead of line above to test isNew() returning false
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    @Override
    public String toString() {
        String newText = isNew() ? "- New!" : "";
        return name + newText + "\n" + description + " | $" + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
//        return Objects.equals(name, menuItem.name) && Objects.equals(description, menuItem.description) && Objects.equals(category, menuItem.category) && Objects.equals(dateAdded, menuItem.dateAdded);
        return this.name.equals(menuItem.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, price, category, dateAdded);
    }

    boolean isNew() {
        LocalDate today = LocalDate.now();
        double daysBetween = getDateAdded().until(today, ChronoUnit.DAYS);
        return daysBetween < 90 ;
    }
}
