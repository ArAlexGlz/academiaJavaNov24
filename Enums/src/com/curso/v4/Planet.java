package com.curso.v4;

public enum Planet {
    MERCURY {
        @Override
        public String toString() {
            return "Mercurio - El planeta más pequeño";
        }
    },
    VENUS {
        @Override
        public String toString() {
            return "Venus - El planeta más caliente";
        }
    },
    EARTH {
        @Override
        public String toString() {
            return "Tierra - Nuestro hogar";
        }
    }
}