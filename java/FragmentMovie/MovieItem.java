package androidx.constraintlayout.widget.FragmentMovie;

import java.io.Serializable;

public class MovieItem implements Serializable {
    private int movieThumbnail;
    private String movieTitle;
    private String sinopsis;

    public MovieItem(int movieThumbnail, String movieTitle, String sinopsis) {
        this.movieThumbnail = movieThumbnail;
        this.movieTitle = movieTitle;
        this.sinopsis = sinopsis;
    }

    public int getMovieThumbnail() {
        return movieThumbnail;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getSinopsis() {
        return sinopsis;
    }


}

