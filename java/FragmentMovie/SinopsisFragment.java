package androidx.constraintlayout.widget.FragmentMovie;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.satset.R;
import androidx.fragment.app.Fragment;

public class SinopsisFragment extends Fragment {

    private static final String ARG_MOVIE_ITEM = "movieItem";

    private MovieItem movieItem;

    public SinopsisFragment() {
        // Diperlukan konstruktor kosong
    }

    public static SinopsisFragment newInstance(MovieItem movieItem) {
        SinopsisFragment fragment = new SinopsisFragment();
        Bundle args = new Bundle();
        args.putSerializable(ARG_MOVIE_ITEM, movieItem);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            movieItem = (MovieItem) getArguments().getSerializable(ARG_MOVIE_ITEM);
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_sinopsis, container, false);

        ImageView sinopsisImageView = rootView.findViewById(R.id.sinopsisImageView);
        TextView sinopsisTitleTextView = rootView.findViewById(R.id.sinopsisTitleTextView);
        TextView sinopsisContentTextView = rootView.findViewById(R.id.sinopsisContentTextView);

        if (movieItem != null) {
            sinopsisImageView.setImageResource(movieItem.getMovieThumbnail());
            sinopsisTitleTextView.setText(movieItem.getMovieTitle());
            sinopsisContentTextView.setText(movieItem.getSinopsis());  // Menggunakan getSinopsis()
        }

        return rootView;
    }
}
