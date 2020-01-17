package com.example.popularmovieapp1;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Setting up the GetIntents
        String poster_path = getIntent().getStringExtra("poster_path");
        String title = getIntent().getStringExtra("title");
        Double popularity = getIntent().getDoubleExtra("popularity", 2);
        String overview = getIntent().getStringExtra("overview");
        String releaseDate = getIntent().getStringExtra("releaseDate");
        double voteAverage = getIntent().getDoubleExtra("voteAverage", 2);

        //Converting the double value to a String
        String voteAvgStringValue = Double.valueOf(voteAverage).toString();
        String popularityStringValue = Double.valueOf(popularity).toString();


        //Setting all Values

        TextView voterAvgTVD = findViewById(R.id.VoteAverage_TVD);
        voterAvgTVD.setText(voteAvgStringValue);

        TextView titleTVD = findViewById(R.id.MovieTitle_TVD);
        titleTVD.setText(title);

        TextView overviewTVD = findViewById(R.id.MovieOverview_TVD);
        overviewTVD.setText(overview);

        TextView popularityTVD = findViewById(R.id.MoviePopularity_TVD);
        popularityTVD.setText(popularityStringValue);

        TextView releaseDateTVD = findViewById(R.id.MovieReleaseDate_TVD);
        releaseDateTVD.setText(releaseDate);

        ImageView imageURLDetail = findViewById(R.id.MovieImage_IVD);
        Picasso
                .get().
                load(poster_path).
                into(imageURLDetail);
    }
}
