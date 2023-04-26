package com.company;
import java.lang.String;
class Engine {
    String engineName;
    String enginePower;
    String engineMDL;

    public void setEngineName(String engineName){
        this.engineName = engineName;
    }
    public String getEngineName(){
        return engineName;
    }

    public void setEnginePower(String enginePower){
        this.enginePower = enginePower;
    }
    public String getEnginePower(){
        return enginePower;
    }

    public void setEngineMDL(String engineMDL){
        this.engineMDL = engineMDL;
    }

    public String getEngineMDL() {
        return engineMDL;
    }
}
     class Car{
        String carName;
        Engine engine;

        public void setCarName(String carName){
            this.carName = carName;
        }

         public String getCarName() {
             return carName;
         }

         public void setEngine(Engine engine) {
             this.engine = engine;
         }

         public Engine getEngine() {
             return engine;
         }

         public static void main(String[] args) {
             Car c = new Car();
            // c.carName="Lambo Aventador";

             c.setCarName("Lambo Aventador");

             Engine e = new Engine();
             e.setEngineName("\n" + "6.5 L L539 V12");
             e.setEngineName("kW (770 PS; 760 hp) (Aventador SVJ) 575");
            // e.setEngineMDL("Aventador SVJ LP 770-4");
             e.setEngineMDL("S-9");

            // c.engine=e;

             c.setEngine(e); // e obj ko c mai daal diya.

             String carname = c.getCarName();
             Engine myeng = c.getEngine(); // myeng is a type of object.
             String myeMDL = myeng.engineMDL;

             //  String m = e.engineMDL;
            // String myeMDL = c.engine.getEngineMDL();
             System.out.println("Car name :"+carname+" EngineName :"+myeng.getEngineName()+" EngineMDL :"+myeMDL);


         }
     }


