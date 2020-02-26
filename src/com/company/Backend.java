package com.company;

public class Backend extends Java {

    private String developType;
    private Language language;


    public void makeCodeBetter(String name, String massage, int line){
        System.out.println(name + " " + massage + " 'line': " + line);
    }

    public final void makeCodeBetter(String massage){
        System.out.println(massage);
    }

    @Override
    public String getInfo(){
        return super.getInfo() + " || Develop type: " + developType + " || Language: " + language;
    }

    public Backend(String framework, String ide, String developType, Language language) {
        super(framework, ide);
        this.language = language;
        this.developType = developType;

    }

    public Language getLanguage() {
        return language;
    }

    public String getDevelopType() {
        return developType;
    }

    public Backend(String framework, String ide) {
        super(framework, ide);
    }

}
