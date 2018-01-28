package com.pane21.stampslogic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference mRootRef;
    private DatabaseReference mDatabaseUserBusinesses;



    private ArrayList<Integer> picsLit = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRootRef = FirebaseDatabase.getInstance().getReference();
        mDatabaseUserBusinesses = mRootRef.child("user businesses");

        mDatabaseUserBusinesses.child("ahCa2Gnv3cZFJdy3RLfIS9FaD4z2").child("-L37JtbFTZOpmqJjMuPP").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                udDate(dataSnapshot);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });












        // set up the RecyclerView


    }

    private void udDate(DataSnapshot dataSnapshot) {
        ArrayList<Integer> pics = new ArrayList<>();
        int mPromoQty;
        int mStampQty;
        MyRecyclerViewAdapter adapter;
        adapter = new MyRecyclerViewAdapter(this, pics);


        UserBusiness userBusiness = dataSnapshot.getValue(UserBusiness.class);
//        value = userBusiness.getStampQty();
        mStampQty = Integer.parseInt(userBusiness.getStampQty());
        mPromoQty = Integer.parseInt(userBusiness.getPromoQty());


        for (int i = 0; i < mPromoQty; i++) {
//            ImageView imageView = new ImageView(getApplicationContext());
//            imageView.setImageResource(R.drawable.yourimage);
            pics.add(R.drawable.square);
        }

        for (int i = 0; i < mStampQty; i++) {
//            ImageView imageView = new ImageView(getApplicationContext());
//            imageView.setImageResource(R.drawable.yourimage);
            pics.set(i, R.drawable.square_lit);
        }

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycle_view);
//        int numberOfColumns = 7;
//        recyclerView.setLayoutManager(new GridLayoutManager(this, numberOfColumns));
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false){
            @Override
            public boolean canScrollHorizontally() {
                return false;
            }
        };
//        recyclerView.setLayoutManager(new LinearLayoutManager.HORIZONTAL(this,));

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);


//        count.setText("" + value);
    }
}
