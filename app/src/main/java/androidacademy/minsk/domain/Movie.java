package androidacademy.minsk.domain;

import com.google.gson.annotations.SerializedName;

public class Movie {

    @SerializedName("imdbID")
    private String id;
    @SerializedName("Title")
    private String title;
    @SerializedName("Poster")
    private String imageUrl;

    public String getId() {
        return id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getTitle() {
        return title;
    }
}
