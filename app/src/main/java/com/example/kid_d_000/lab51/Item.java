package com.example.kid_d_000.lab51;

public class Item {
    String nombre,fabricante,version,maxRange,minDelay,power;

    public Item(String nombre, String fabricante, String version, String maxRange, String minDelay, String power) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.version = version;
        this.maxRange = maxRange;
        this.minDelay = minDelay;
        this.power = power;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getVersion() {
        return version;
    }

    public String getMaxRange() {
        return maxRange;
    }

    public String getMinDelay() {
        return minDelay;
    }

    public String getPower() {
        return power;
    }
}
