/***
  Copyright (c) 2012 CommonsWare, LLC
  Licensed under the Apache License, Version 2.0 (the "License"); you may not
  use this file except in compliance with the License. You may obtain a copy
  of the License at http://www.apache.org/licenses/LICENSE-2.0. Unless required
  by applicable law or agreed to in writing, software distributed under the
  License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
  OF ANY KIND, either express or implied. See the License for the specific
  language governing permissions and limitations under the License.
  
  From _The Busy Coder's Guide to Android Development_
    https://commonsware.com/Android
*/

package com.commonsware.android.exint;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ExplicitIntentsDemoActivity extends Activity {

  private final String TAG = "ExplicitIntents";
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
  }

  public void showOther(View v) {
    startActivity(new Intent(this, OtherActivity.class));
  }

  @Override
  protected void onStart() {
    super.onStart();
    Log.i(TAG, "A activity esta visivel, mas nao esta pronta para interação");
  }


  @Override
  protected void onRestart() {
    super.onRestart();
    Log.i(TAG, "A aplicação esta visivel e ira ser reiniciada");
  }

  @Override
  protected void onResume() {
    super.onResume();
    Log.i(TAG, "A activity esta visivel e pronta para interação");
  }

  @Override
  protected void onPause() {
    super.onPause();
    Log.i(TAG,
            "A activity esta visivel, mas nao esta interagindo");
  }

  @Override
  protected void onStop() {
    super.onStop();
    Log.i(TAG, "A activity nao esta mais vivisvel");
  }

  @Override
  protected void onDestroy() {
    super.onDestroy();
    Log.i(TAG, "A activity sera destruida");
  }
}