package com.example.cse486.uniclubz.View.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cse486.uniclubz.Model.entity.Club;
import com.example.cse486.uniclubz.Model.entity.Donation;
import com.example.cse486.uniclubz.R;

import java.util.ArrayList;

public class DonationAdapter extends RecyclerView.Adapter<DonationAdapter.ViewHolder> {
    private ArrayList<Donation> donations;
    private Context context;

    public DonationAdapter(ArrayList<Donation> donations, Context context) {
        this.donations = donations;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.donationitem, parent, false);
        ViewHolder vh = new ViewHolder(v); // pass the view to View Holder
        return vh;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.date.setText(donations.get(position).getDate());
        holder.group.setText(donations.get(position).getBgroup());
        holder.contact.setText(donations.get(position).getContact());
        holder.hospital.setText(donations.get(position).getHospital());
    }

    @Override
    public int getItemCount() {
        return donations.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView group,date,hospital,contact;
        public LinearLayout layout;

        public ViewHolder(View v) {
            super(v);
            group = (TextView) itemView.findViewById(R.id.group);
            date = (TextView) itemView.findViewById(R.id.date);
            hospital = (TextView) itemView.findViewById(R.id.hospital);
            contact = (TextView) itemView.findViewById(R.id.phone);
          //  layout = (LinearLayout) v.findViewById(R.id.);
        }
    }
}
