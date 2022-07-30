package com.example.flixster.adapter;

import static android.view.LayoutInflater.from;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityOptionsCompat;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.example.flixster.DetailActivity;
import com.example.flixster.MainActivity;
import com.example.flixster.R;
import com.example.flixster.databinding.ItemMovieBinding;
import com.example.flixster.databinding.PopularBinding;
import com.example.flixster.databinding.PopularMovieBinding;
import com.example.flixster.models.Movie;

import org.parceler.Parcel;
import org.parceler.Parcels;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    public static Context context;
    List<Movie> movies;

    public MovieAdapter(Context context, List<Movie> movies) {
        this.context = context;
        this.movies = movies;
    }

    // Usually involves inflating a layout from XML and returning the holder
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d("MovieAdapter", "onCreateViewHolder");
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        if (viewType == 0){
            ItemMovieBinding movieView = DataBindingUtil.inflate(inflater, R.layout.item_movie, parent, false);
            return new ViewHolder(movieView);

        }else {
            PopularMovieBinding movieView2 = DataBindingUtil.inflate(inflater, R.layout.popular_movie, parent, false);
            return new ViewHolder1(movieView2);
        }




    }

    // Involves populating data into the item through hoder
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Log.d("MovieAdapter", "onBindViewHolder" + position);
        // Get the movie at the passed in position
        Movie movie = movies.get(position);
        if(holder.getItemViewType() == 0){
            // Bind the movie data into the VH
            ViewHolder hold = (ViewHolder) holder ;
            hold.bind(movie);

        }else{
            ViewHolder1 hold = (ViewHolder1) holder ;
            hold.bind(movie);
        }


    }

    @Override
    public int getItemViewType(int position) {
        int movie_type;
        if (movies.get(position).getRating() < 5) {
            // if it is low type is 0
            movie_type = 0;
        } else {
            // if it's high type is 1
            movie_type = 1;
        }
        // return super.getItemViewType(position);
        return movie_type;
    }

    // Returns the total count of items in the list
    @Override
    public int getItemCount() {
        return movies.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemMovieBinding itemmovieBinding;

        public ViewHolder(@NonNull ItemMovieBinding movieBinding) {
            super(movieBinding.getRoot());
            this.itemmovieBinding = movieBinding;
        }

        public void bind(Movie movie) {
            itemmovieBinding.setMovie(movie);

//            Glide.with(context).load(imageUrl).placeholder(R.drawable.image_holder).into(ivPoster);

            // 1.Register click listener on the whole row

            itemmovieBinding.container.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //2. Navigate to a mew activity on tap
                    Intent i = new Intent(context, DetailActivity.class);
                    i.putExtra("movie", Parcels.wrap(movie));
                    ActivityOptionsCompat options = ActivityOptionsCompat.
                            makeSceneTransitionAnimation((Activity) context, itemmovieBinding.container, "transition");
                   context.startActivity(i, options.toBundle());
                    //context.startActivity(i);

                }
            });
        }
    }

    public class ViewHolder1 extends RecyclerView.ViewHolder {
            PopularMovieBinding popularMovieBinding;

        public ViewHolder1(@NonNull PopularMovieBinding popMovieBiding) {
            super(popMovieBiding.getRoot());
            this.popularMovieBinding = popMovieBiding;
//            ivPoster1 = itemView.findViewById(R.id.ivPoster1);
//            container1 = itemView.findViewById(R.id.container1);

        }

        public void bind(Movie movie) {
            String imageUrl1;

            popularMovieBinding.setMovie(movie);

//            Glide.with(context).load(imageUrl1).placeholder(R.drawable.image_holder).centerCrop().transform(new RoundedCorners(100)).into(ivPoster1);

            popularMovieBinding.container1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //2. Navigate to a mew activity on tap
                    Intent i2 = new Intent(context, DetailActivity.class);
                    i2.putExtra("movie", Parcels.wrap(movie));
                    ActivityOptionsCompat options = ActivityOptionsCompat.
                            makeSceneTransitionAnimation((Activity) context, popularMovieBinding.container1, "transition");
                    context.startActivity(i2, options.toBundle());
                   // context.startActivity(i);

                }
            });


        }
    }

    public static class BindingAdapterUtils{
        @BindingAdapter({"imageUrl"})
        public static void loadImage1(ImageView ivPoster, String url) {
            Glide.with(context)
                    .load(url)
                    .placeholder(R.drawable.image_holder)
                    .centerCrop()
                    .transform(new RoundedCorners(100))
                    .into(ivPoster);
        }
        @BindingAdapter({"imageUrl1"})
        public static void loadImage(ImageView ivPoster1, String url) {
            Glide.with(context)
                    .load(url)
                    .placeholder(R.drawable.image_holder)
                    .centerCrop()
                    .transform(new RoundedCorners(100))
                    .into(ivPoster1);

        }
    }

}
