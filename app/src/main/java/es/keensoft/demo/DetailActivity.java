package es.keensoft.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import es.keensoft.es.demo.R;


public class DetailActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }




    public static void launch(ActionBarActivity activity, View transitionView) {
        String transitionName = activity.getString(R.string.transition);
        ActivityOptionsCompat options =
                ActivityOptionsCompat.makeSceneTransitionAnimation(
                        activity, transitionView, transitionName);
        Intent intent = new Intent(activity, DetailActivity.class);
        ActivityCompat.startActivity(activity, intent, options.toBundle());
    }
}
