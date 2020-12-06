package javaTest.file;

public class Car implements Travel {
    /**
     * 通过汽车可以实现旅行的功能
     * @return
     */
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
