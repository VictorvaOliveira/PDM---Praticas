package br.edu.ifpe.tads.pdm.pratica03;

public class City {

    private String name;
    private String info;

    public City(String name, String info){
        this.name = name;
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public String getName() {
        return name;
    }
}
