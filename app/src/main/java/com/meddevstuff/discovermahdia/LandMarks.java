package com.meddevstuff.discovermahdia;

public class LandMarks {
    private String LandmarkName;
    private String LandmarkPlace;
    private String LandmarksDescription;
    private final  int landmarkImage;


        /**
         *     this is a constractor for the data model that will be charged
            @param landmarkName
            @param landmarksDescription
            @param landmarkPlace
            */

    public LandMarks(String landmarkName, String landmarkPlace, String landmarksDescription, int landmarkImage) {
        LandmarkName = landmarkName;
        LandmarkPlace = landmarkPlace;
        LandmarksDescription = landmarksDescription;
        this.landmarkImage = landmarkImage;
    }

    public String getLandmarkName() {
        return LandmarkName;
    }

    public String getLandmarkPlace() {
        return LandmarkPlace;
    }

    public String getLandmarksDescription() {
        return LandmarksDescription;
    }

    public int getLandmarkImage() {
        return landmarkImage;
    }
}
