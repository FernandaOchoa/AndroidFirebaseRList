package monsh.com.todort;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by monsh on 08/04/2016.
 */
public class ToDoApplication extends Application {
    private String FIREBASE_CHILD = "items";
    private String FIREBASE_URL = "https://lista-buap.firebaseio.com/";

    Firebase firebase;

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
        Firebase.getDefaultConfig().setPersistenceEnabled(true);
        firebase = new Firebase(FIREBASE_URL).child(FIREBASE_CHILD);
    }

    public Firebase getFirebase() {
        return firebase;
    }

}
