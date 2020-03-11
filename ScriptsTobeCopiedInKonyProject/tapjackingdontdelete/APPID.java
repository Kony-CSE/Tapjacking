package $PACKAGE;

import com.konylabs.android.KonyMain;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.konylabs.android.KonyMain;


import com.konylabs.search.SearchDataAdapter;
import android.provider.SearchRecentSuggestions;
import android.content.Intent;
import android.app.SearchManager;

import android.os.Bundle;

public class $APPID extends KonyMain {
	private static $APPID context;
    public void onCreate(Bundle savedInstanceState) {
		context = this;
        super.onCreate(savedInstanceState);
		       Context ctx = (Context) context;
        if (ctx != null) {
//This will get the root layout of Main application activity
            View toplayout = ((Activity) ctx).getWindow().getDecorView().getRootView();
            Boolean disableBGTouches = true;
            if (disableBGTouches) {
                toplayout.setFilterTouchesWhenObscured(true);
// Workaround AOSP Issue 54193 :
// https://code.google.com/p/android/issues/detail?id=54193
                if (toplayout.getFilterTouchesWhenObscured() != true) {
                    toplayout.setFilterTouchesWhenObscured(!true);
                }
            }
        }
    }
		
	public static $APPID getActivityContext() {
		return context;
	}
	
	public int getAppSourceLocation(){
		return $APP_SOURCE_LOC;
	}

		public void onNewIntent(Intent intent) {
       if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
        // handles a search query
        String query = intent.getStringExtra(SearchManager.QUERY);
        String extraData = intent.getStringExtra("intent_extra_data_key");
        SearchRecentSuggestions suggestions = new SearchRecentSuggestions(this,
          $PROVIDER.AUTHORITY, $PROVIDER.MODE);
        suggestions.saveRecentQuery(query, extraData);
        SearchDataAdapter.getInstance().raiseOnDoneCallback(query,extraData);
       }
       else
        super.onNewIntent(intent);
      }
	//$OVERRIDE_STARTUPMETHOD
}
