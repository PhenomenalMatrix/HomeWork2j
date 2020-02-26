package com.company;

public class Backend extends Java {

    private String developType;
    Language language = new Language(Languages.JAVA);


    public void makeCodeBetter(String name, String massage, int line){
        System.out.println(name + " " + massage + " 'line': " + line);
    }

    public final void makeCodeBetter(String massage){
        System.out.println(massage);
    }

    public String getInfo(){
        return "Develop type: " + developType + "Language: " + language.getLanguage() ;
    }

    public Backend(String framework, String ide, String developType) {
        super(framework, ide);
        this.developType = developType;
    }

    public String getDevelopType() {
        return developType;
    }

    public Backend(String framework, String ide) {
        super(framework, ide);
    }


}
