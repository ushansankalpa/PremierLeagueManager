package sample;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

public class SportClub implements Serializable {

    private String nameOfTheClub;  //name of the club
    private String location;    //where does club situated
    private String nameOfTheManager;  //manager name of the club

    public SportClub(String nameOfTheClub, String location, String nameOfTheManager) {
        this.nameOfTheClub = nameOfTheClub;
        this.location = location;
        this.nameOfTheManager = nameOfTheManager;
    }



    //getters and setters for SportClub class
    public String getNameOfTheClub() {
        return nameOfTheClub;
    }

    public void setNameOfTheClub(String nameOfTheClub) {
        this.nameOfTheClub = nameOfTheClub;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNameOfTheManager() {
        return nameOfTheManager;
    }

    public void setNameOfTheManager(String nameOfTheManager) {
        this.nameOfTheManager = nameOfTheManager;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SportClub sportClub = (SportClub) o;
        return Objects.equals(nameOfTheClub, sportClub.nameOfTheClub) &&
                Objects.equals(location, sportClub.location) &&
                Objects.equals(nameOfTheManager, sportClub.nameOfTheManager);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfTheClub, location, nameOfTheManager);
    }


    @Override
    public String toString() {
        return "SportClub{" +
                "nameOfTheClub='" + nameOfTheClub + '\'' +
                ", location='" + location + '\'' +
                ", nameOfTheManager='" + nameOfTheManager + '\'' +
                '}';
    }

}
