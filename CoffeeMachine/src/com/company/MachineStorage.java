package com.company;

public class MachineStorage {
        public int Beans = 0;
        public int Water = 0;
        public int Ice = 0;
        public int Milk = 0;

        public void addMilk(int i){
            this.Milk += i;
        }

        public void addBeans(int i){
            this.Beans += i;
        }

        public void addWater(int i){
            this.Water += i;
        }

        public void addIce(int i){
            this.Ice += i;
        }

        public boolean useMilk(){
            if(this.Milk <= 0){
                return false;
            }
            this.Milk--;
            return true;
        }

        public boolean useBeans(){
            if(this.Beans <= 0){
                return false;
            }
            this.Beans--;
            return true;
        }

        public boolean useWater(){
            if(this.Water <= 0){
                return false;
            }
            this.Water--;
            return true;
        }

        public boolean useIce(){
            if(this.Ice <= 0){
                return false;
            }
            this.Ice--;
            return true;
        }

    }

