package androidacademy.minsk;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidacademy.minsk.domain.Movie;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ImageViewHolder> {

    private List<Movie> items = new ArrayList<>();

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(
            @NonNull ViewGroup parent,
            int viewType
    ) {
        final LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return new ImageViewHolder(inflater.inflate(R.layout.li_movie, parent, false));
    }

    @Override
    public void onBindViewHolder(
            @NonNull ImageViewHolder holder,
            int position
    ) {
        final Movie movie = items.get(position);
        Picasso.get()
                .load(movie.getImageUrl())
                .fit()
                .centerCrop()
                .into(holder.imageView);

        holder.title.setText(movie.getTitle());
    }

    public void replaceWith(List<Movie> items) {
        this.items = items;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class ImageViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView title;

        ImageViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.iv_image);
            title = itemView.findViewById(R.id.tv_title);
        }
    }
}
