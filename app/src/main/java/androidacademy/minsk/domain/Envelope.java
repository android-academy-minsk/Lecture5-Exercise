package androidacademy.minsk.domain;

import com.google.gson.annotations.SerializedName;

public class Envelope<T> {

    @SerializedName("Search")
    private T data;

    public T getData() {
        return data;
    }
}
