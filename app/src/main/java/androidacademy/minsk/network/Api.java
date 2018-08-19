package androidacademy.minsk.network;

import androidacademy.minsk.domain.Movie;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {

    String PAGE = "page";

    @GET("/")
    Call<List<Movie>> getSearch(@Query("s") String query);
}
