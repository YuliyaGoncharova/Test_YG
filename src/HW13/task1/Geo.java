package HW13.task1;

public class Geo {

//    "geo": {
//        "lat": "24.6463",
//        "lng": "-168.8889"
    private String lat;
    private String lng;

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public Geo(String lat, String lng) {
        this.lat = lat;
        this.lng = lng;
    }
}
