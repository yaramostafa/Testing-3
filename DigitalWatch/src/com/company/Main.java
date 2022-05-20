package com.company;

public class Main extends Alarm{

    public String state = "TIME";

    public Boolean input(char c){
        if(this.state.equals("TIME")){
            if(c == 't'){   //send time
                return true;
            }else if(c == 's'){   //set the time
                this.state = "SET";
                return true;
            }else if(c == 'a'){   //set the alarm time
                this.state = "ALARM";
                return true;
            }
        }else if(this.state.equals("SET")){
            if(c == 's'){ //set seconds
                return true;}
            else if(c == 'm') { //set minutes
                return true;
            }else if(c == 'h') { //set hour
                return true;
            }else if(c == 'D') { //set Day
                return true;
            }else if(c == 'M') { //set Months
                return true;
            }else if(c == 'Y') { //set Years
                return true;
            }else if(c == 't') {
                this.state = "TIME";
                return true;
            }
        }else if(this.state.equals("ALARM")){
            if(c == 's'){ //set Alarm
                return this.setA();
            }else if(c == 'u') {    //unset Alarm
                return this.unsetA();
            } else if(c == 'c') {   //ring Alarm
                return this.checkA();
            }else if(c == 't') {
                this.state = "TIME";
                return true;
            }
        }
        return false;
    }
}
