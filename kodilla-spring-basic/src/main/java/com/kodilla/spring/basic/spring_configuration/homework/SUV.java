package com.kodilla.spring.basic.spring_configuration.homework;

    public class SUV implements Car {

        private final boolean headlightsTurnedOff;

        public SUV(boolean headlightsTurnedOff) {
            this.headlightsTurnedOff = headlightsTurnedOff;
        }

        @Override
        public boolean isHeadlightsTurnedOff() {
            return headlightsTurnedOff;
        }

        @Override
        public String getCarType() {
            return "SUV";
        }
    }