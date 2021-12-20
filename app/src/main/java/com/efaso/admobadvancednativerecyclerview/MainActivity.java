package com.efaso.admobadvancednativerecyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.efaso.admob_advanced_native_recyvlerview.AdmobNativeAdAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
	ArrayList<Contact> contacts;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		List<String> list = new ArrayList<>();
		for (int i = 0; i < 30; i++) {
			list.add("Let's save the world " + i);
		}


        RecyclerView rvContacts = findViewById(R.id.rvContacts);

		// Initialize contacts
		contacts = Contact.createContactsList(20);

		// Create adapter passing in the sample user data
		ContactsAdapter adapter = new ContactsAdapter(contacts);

		//Build the native adapter from the current adapter
		AdmobNativeAdAdapter admobNativeAdAdapter = AdmobNativeAdAdapter.Builder.with(
				"ca-app-pub-3940256099942544/2247696110",//admob native ad id
				adapter,//current adapter
				"small"//Set the size "small", "medium" or "custom"
		).adItemInterval(5)//Repeat interval
				.build();


		// Attach the new adapter to the recyclerview to populate items
		rvContacts.setAdapter(admobNativeAdAdapter);

		// Set layout manager to position the items
		rvContacts.setLayoutManager(new LinearLayoutManager(this));
	}
}
