package com.zipcodewilmington.assessment2.part3;

public class RedRobin extends Bird {
    String migrationMonth;

    public RedRobin(){
        super();
        this.migrationMonth = migrationMonth;
    }

    public String color(){
        return "red";
    }

    public int getSpeed(){
        return 10;
    }

    public String getMigrationMonth(){
        return migrationMonth;
    }

    public void setMigrationMonth(String migrationMonth){
        this.migrationMonth = migrationMonth;
    }
}
