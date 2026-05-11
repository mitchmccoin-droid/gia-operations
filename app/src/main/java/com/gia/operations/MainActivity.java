package com.gia.operations;

  import android.app.Activity;
  import android.os.Bundle;
  import android.webkit.WebSettings;
  import android.webkit.WebView;
  import android.webkit.WebViewClient;
  import android.view.Window;
  import android.view.WindowManager;

  public class MainActivity extends Activity {
      @Override
      protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          requestWindowFeature(Window.FEATURE_NO_TITLE);
          getWindow().setFlags(
              WindowManager.LayoutParams.FLAG_FULLSCREEN,
              WindowManager.LayoutParams.FLAG_FULLSCREEN
          );
          WebView webView = new WebView(this);
          setContentView(webView);
          WebSettings s = webView.getSettings();
          s.setJavaScriptEnabled(true);
          s.setDomStorageEnabled(true);
          s.setAllowFileAccess(true);
          s.setAllowFileAccessFromFileURLs(true);
          s.setAllowUniversalAccessFromFileURLs(true);
          s.setMediaPlaybackRequiresUserGesture(false);
          s.setCacheMode(WebSettings.LOAD_DEFAULT);
          webView.setWebViewClient(new WebViewClient());
          webView.loadUrl("file:///android_asset/index.html");
      }
      @Override
      public void onBackPressed() {}
  }