package com.jk.explore.java.privatekeyword.vehicles;

public class Vehicle {

    private EngineKey engineKey;
    private String name;

    public Vehicle(String name) {
        this.name = name;
        engineKey = new EngineKey(1, "BMW 11");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void start() {
        engineKey.startEngine();
    }

    public void stop() {
        engineKey.stopEngine();
    }

    private class EngineKey {
        private int id;
        private String model;

        private EngineKey(int id, String model) {
            this.id = id;
            this.model = model;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void startEngine() {
            System.out.println("Engine started");
        }

        public void stopEngine() {
            System.out.println("Engine stopped");
        }
    }

}


