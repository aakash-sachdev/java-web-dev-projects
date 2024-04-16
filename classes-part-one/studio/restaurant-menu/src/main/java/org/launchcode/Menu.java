package org.launchcode;
import java.time.LocalDate;
import java.util.ArrayList;

    public class Menu {
        private LocalDate lastUpdated;
        ArrayList<MenuItem> items = new ArrayList<>(); // Keeping it default


            public Menu(LocalDate d, ArrayList<MenuItem> i) {
                this.lastUpdated = d;
                this.items = i;
            }

            public void setLastUpdated(LocalDate lastUpdated) {
                this.lastUpdated = lastUpdated;
            }

            public void setItems(ArrayList<MenuItem> items) {
                this.items = items;
            }

            public LocalDate getLastUpdated() {
                return lastUpdated;
            }

            public ArrayList<MenuItem> getItems() {
                return items;
            }

        }