package com.zipcodewilmington.assessment2.part3;

public class RedRobin extends Bird{

    private String migrationMonth;

    public String getMigrationMonth() {
        return migrationMonth;
    }


    public void setMigrationMonth(String migrationMonth) {
        this.migrationMonth = migrationMonth;
    }

    @Override
    public String color() {
        return "red";
    }

    @Override
    public int getSpeed() {
        return 10;
    }

}
