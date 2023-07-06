package check5;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    private List<Vehicle> vehicles = new ArrayList<>();
    Garage(){}

    public void addVehicle(Vehicle gari){
        vehicles.add(gari);
    }

    public List filterBy(String parameter, String tag){

        List<Vehicle> filteredList = new ArrayList<>();

        switch (parameter){
            case "fuelType" -> filterByfuelType(tag, filteredList);
            case "tyresNumber" -> filterByTyreNumber(Integer.valueOf(tag), filteredList);
            case "manufacturer" -> filterByManufacturer(tag, filteredList);
            case "model" -> filterByModel(tag, filteredList);
            case "price" -> filterByPrice(Double.valueOf(tag), filteredList);
        }

        return filteredList;
    }

    private List filterByfuelType(String tag, List filteredList){
        for (Vehicle v: vehicles) {
            if(v.getFuelType() == tag){
                filteredList.add(v);
            }
        }

        return filteredList;
    }

    private List filterByTyreNumber(int tyreNumber, List filteredList){

        for (Vehicle v: vehicles) {
            if(v.getTyresNumber() == tyreNumber){
                filteredList.add(v);
            }
        }

        return filteredList;
    }

    private List filterByManufacturer(String tag, List filteredList){

        for (Vehicle v: vehicles) {
            if(v.getManufacturer() == tag){
                filteredList.add(v);
            }
        }

        return filteredList;
    }

    private List filterByModel(String tag, List filteredList){

        for (Vehicle v: vehicles) {
            if(v.getModel() == tag){
                filteredList.add(v);
            }
        }

        return filteredList;
    }

    private List filterByPrice(double price, List filteredList){

        for (Vehicle v: vehicles) {
            if(v.getPrice() == price){
                filteredList.add(v);
            }
        }

        return filteredList;
    }
    public List printVehicles() {
        return vehicles;
    }
}
