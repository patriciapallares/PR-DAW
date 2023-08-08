package Listas;

import java.util.ArrayList;
import proyecto_parking.Stay;

public class Stays_List {

    private final ArrayList<Stay> staysList;

    public Stays_List() {
        this.staysList = new ArrayList();
    }

    public ArrayList<Stay> getStaysList() {
        return staysList;
    }

    ///
    
    public void addStay(Stay stay) {
        if (stay != null) {
            staysList.add(stay);
        }
    }

    public void emptyStays() {
        if (staysList == null) {
            staysList.clear();
        }
    }

    public int numOfStays() {
        int num = staysList.size();
        return num;
    }
}
