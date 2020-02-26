package com.company;

public final class Programmer extends Backend {

    private int age;
    private Level level;


    @Override
    public String getInfo() {
        return super.getInfo() + " || Age: " + age + " || Level: " + level ;
    }

    public Programmer(String framework, String ide, String developType, Language language, int age, Level level) {
        super(framework, ide, developType, language);
        this.age = age;
        this.level = level;
    }

    public Programmer(String framework, String ide, int age, Level level) {
        super(framework, ide);
        this.age = age;
        this.level = level;
    }

    public Programmer(String framework, String ide) {
        super(framework, ide);
    }
}
