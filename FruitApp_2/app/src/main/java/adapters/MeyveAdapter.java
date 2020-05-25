package adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cenga.fruitapp.R;

import java.util.List;

import models.Meyve;

public class MeyveAdapter extends RecyclerView.Adapter<MeyveAdapter.MyViewHolder> {

    List<Meyve> meyveListesi;
    LayoutInflater layoutInflater;

    public MeyveAdapter(Activity activity, List<Meyve> meyveList) {
        meyveListesi = meyveList;
        layoutInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @NonNull
    @Override
    public MeyveAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = layoutInflater.inflate(R.layout.satir_item, parent, false);
        MyViewHolder holder = new MyViewHolder(itemView);
        return holder;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView ad, aciklama, fiyat;
        ImageView img;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            ad = itemView.findViewById(R.id.tv_name);
            aciklama = itemView.findViewById(R.id.tv_description);
            fiyat = itemView.findViewById(R.id.tv_price);
            img = itemView.findViewById(R.id.img_fruit);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull MeyveAdapter.MyViewHolder holder, int position) {

        Meyve meyve = meyveListesi.get(position);
        holder.ad.setText(meyve.getAd());
        holder.fiyat.setText(meyve.getFiyat());
        holder.aciklama.setText(meyve.getAciklama());
        holder.img.setImageResource(meyve.getImage());


    }

    @Override
    public int getItemCount() {
        return meyveListesi.size();
    }


}
