A simple library to use Admob Native Ads in Android RecyclerView

Admob now realeased native Ads for all developpers. These Ads are so fantastic because they fit exactly on your design, which means it will increase the earnings for sure.

What about if you want to show native ads on Recyclerview? Or listView?

This library is the solution!!!



How to use :

Step 1 :

Add this at the top level gradle file :

    repositories {
    	maven { url "https://jitpack.io" }
    }

Step 2 : 

Add this in your app level gradle dependencies file :

    implementation 'com.github.daoibrahim:AdmobAdvancedNativeRecyclerview:1.0.0'

Step 3 :
Build the native Ad adapter from your current RecyclerView adapter :

    AdmobNativeAdAdapter admobNativeAdAdapter=AdmobNativeAdAdapter.Builder
    	.with(
    		nativeAdId,//Create a native ad id from admob console
    		currentAdapter,//The adapter you would normally set to your recyClerView
    		NativeAdsType//Set it with "small","medium" or "custom"
    		)
    	.adItemIterval(interval)//native ad repeating interval in the recyclerview
    	.build();
    recyclerView.setAdapter(admobNativeAdAdapter);//set your RecyclerView adapter with the admobNativeAdAdapter


And voilà!!! Completed.
For detailed example, see the sample project.

It took me so much time to do this free library for you. If i saved your day, you can consider making a donation 

[![](https://www.paypalobjects.com/en_US/i/btn/btn_donateCC_LG.gif)](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=2G7BP77AHNSHE)

I will really appreciate.

Enjoy!!!
