package javaTest.file;

public class Airplane  implements Travel {
    private String travelWay="";
    @Override
    public String getTravelWay() {
        return travelWay;
    }

    @Override
    public void setWay(String subWay) {
        travelWay=TWAY+subWay;

    }
}
