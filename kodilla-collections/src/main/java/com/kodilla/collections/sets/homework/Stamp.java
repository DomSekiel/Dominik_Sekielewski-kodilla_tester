package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
        private String stampName;
        private double stampWidth;
        private double stampHeight;
        private boolean stampedStamp;

        public Stamp(String stampName, double stampWidth, double stampHeight, boolean stampedStamp) {
            this.stampName = stampName;
            this.stampWidth = stampWidth;
            this.stampHeight = stampHeight;
            this.stampedStamp = stampedStamp;
        }

        public String getStampName() {
            return stampName;
        }

        public double getStampWidth() {
            return stampWidth;
        }

        public double getStampHeight() {
            return stampHeight;
        }

        public boolean isStampedStamp() {
            return stampedStamp;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Stamp stamp = (Stamp) o;
            return Double.compare(stampWidth, stamp.stampWidth) == 0 && Double.compare(stampHeight, stamp.stampHeight) == 0 && stampedStamp == stamp.stampedStamp && Objects.equals(stampName, stamp.stampName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(stampName, stampWidth, stampHeight, stampedStamp);
        }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampWidth=" + stampWidth +
                ", stampHeight=" + stampHeight +
                ", stampedStamp=" + stampedStamp +
                '}';
    }
}