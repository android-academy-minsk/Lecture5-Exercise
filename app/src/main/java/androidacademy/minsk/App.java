package androidacademy.minsk;

import android.app.Application;
import androidacademy.minsk.network.Api;
import androidacademy.minsk.network.NetworkModule;

public class App extends Application {

    private Api api;

    @Override
    public void onCreate() {
        super.onCreate();

        api = new NetworkModule(this).getApi();
    }

    public Api getApi() {
        return api;
    }
}
