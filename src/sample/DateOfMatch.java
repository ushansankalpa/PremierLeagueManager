package sample;

import java.io.Serializable;

public class DateOfMatch implements Serializable {
    private int dateOfMatch;   //date of match
    private int monthOfMatch;  // month of match
    private int yearOfMatch;  //year of match

    public DateOfMatch(){}  //default constructor of DateOfMatch

    public DateOfMatch(int dateOfMatch, int monthOfMatch, int yearOfMatch) { //parameterize constructor of DateOfMatch
        this.dateOfMatch = dateOfMatch;
        this.monthOfMatch = monthOfMatch;
        this.yearOfMatch = yearOfMatch;
    }

    //getter and setters for the DateOfMatch(encapsulation)
    public int getDateOfMatch() {
        return dateOfMatch;
    }

    public void setDateOfMatch(int dateOfMatch) {
        this.dateOfMatch = dateOfMatch;
    }

    public int getMonthOfMatch() {
        return monthOfMatch;
    }

    public void setMonthOfMatch(int monthOfMatch) {
        this.monthOfMatch = monthOfMatch;
    }

    public int getYearOfMatch() {
        return yearOfMatch;
    }

    public void setYearOfMatch(int yearOfMatch) {
        this.yearOfMatch = yearOfMatch;
    }

    @Override
    public String toString() {
        return dateOfMatch +"-"+monthOfMatch +"-" + yearOfMatch ;
    }
}
