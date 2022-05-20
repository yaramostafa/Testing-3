package com.company;

public class Main extends MachineStorage{

        public String state = "VENDING";

        public Boolean input(char c){
            if(this.state.equals("VENDING")){
                if(c == 'c'){ //coffee
                    return (this.useWater() && this.useBeans());
                }else if(c == 'l'){ //latte
                    return (this.useWater() && this.useBeans() && this.useMilk());
                }else if(c == 'i'){ //iced coffee
                    return (this.useMilk() && this.useBeans() && this.useIce());
                }
                else if(c == 'r'){
                    this.state = "refill";
                    return true;
                }
            }else if(this.state.equals("refill")){
                if(c == 'b'){ //beans
                    this.addBeans(1);
                    return true;
                }else if(c == 'w'){ //water
                    this.addWater(1);
                    return true;
                }else if(c == 'm'){ //milk
                    this.addMilk(1);
                    return true;
                }else if(c == 's'){ //ICE
                    this.addIce(1);
                    return true;
                }
                else if(c == 'p'){
                    this.state = "preparing";
                    return true;
                }
            }
            return false;
        }
    }

