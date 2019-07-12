package com.example.demoandroidlist;

public class AndroidVersion {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private  String version;

    public AndroidVersion(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "AndroidVersion{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';


    }

}
