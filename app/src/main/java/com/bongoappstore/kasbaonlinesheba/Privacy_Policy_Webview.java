package com.bongoappstore.kasbaonlinesheba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;

public class Privacy_Policy_Webview extends AppCompatActivity {

    private WebView webView;


    ProgressBar loadingbar;
    LinearLayout nointernet;
    TextView tryagain;
    SwipeRefreshLayout swipeRefreshLayout;
    ScrollView mscrollview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        getSupportActionBar().hide();
        setContentView(R.layout.activity_privacy_policy_webview);


        webView = findViewById(R.id.webView);

        Intent intent = getIntent();
        String weblink = intent.getStringExtra("links");
        webView.loadUrl(weblink);

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);


//===============================================================================================//
        webView = findViewById(R.id.webView);
        loadingbar = findViewById(R.id.loadingbar);
        nointernet = findViewById(R.id.nointernet);
        tryagain = findViewById(R.id.tryagain);
        swipeRefreshLayout = findViewById(R.id.swiferlayout);
        mscrollview = findViewById(R.id.mscrollview);

        loadingbar.setMax(100);


        //================================Reload Code Line Start Here===========================//
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                swipeRefreshLayout.setRefreshing(true);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        swipeRefreshLayout.setRefreshing(false);
                        webView.loadUrl(webView.getUrl());

                    }
                }, 1000);
            }
        }); //================================Reload Code Line End Here===========================//


        webView.setWebViewClient(new WebViewClient() {
            @Override
            //===================Keep webview in app when clicking links======================//
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }


            //==============================All Page No Internet Image Line Start Here============================//
            @Override
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                checkConnection();
                super.onReceivedError(view, request, error);
            } //==============================All Page No Internet Image Line End Here============================//


        });


        //===========================Webview Site Link Pdf Document Download Code Start Here===================//
        webView.setWebViewClient(new WebViewClient() {

            /*
            //========================Long Length Link load url Code Line Start Here=====================//
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {

                handler.proceed();
            }
            //========================Long Length Link load url Code Line End Here=======================//
             */

            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                if (url.endsWith(".pdf")) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
                    // if want to download pdf manually create AsyncTask here
                    // and download file
                    return true;
                }
                return false;
            }


        }); //===========================Webview Site Link Pdf Document Download Code End Here===================//


        // Enabling some setting so that browser can work properly
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setJavaScriptEnabled(true);
        // webView.getSettings().setAppCacheEnabled(true);
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setPluginState(WebSettings.PluginState.ON);

        checkConnection();


        //=============================Loadingbar Code Line Start Here============================//

        loadingbar.setProgress(0);
        webView.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                loadingbar.setProgress(newProgress);
                if (newProgress == 100)
                    loadingbar.setVisibility(View.INVISIBLE);
                else
                    loadingbar.setVisibility(View.VISIBLE);
                super.onProgressChanged(view, newProgress);
            }
        });
        //==============================Loadingbar Code Line End Here=============================//


        tryagain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkConnection();
            }
        });


    } //============================onCreate Bundle Method Line End Here==========================//


    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            finish();
        }
    }


    //===================================== No Internet Control==================================//

    public void checkConnection() { //===============public void checkConnection(){Line Start Here===================//

        ConnectivityManager connectivityManager = (ConnectivityManager)
                this.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo wifi = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        NetworkInfo mobileNetwork = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);


        if (wifi.isConnected()) {
            webView.loadUrl(webView.getUrl());
            webView.setVisibility(View.VISIBLE);
            nointernet.setVisibility(View.GONE);

        } else if (mobileNetwork.isConnected()) {
            webView.loadUrl(webView.getUrl());
            webView.setVisibility(View.VISIBLE);
            nointernet.setVisibility(View.GONE);

        } else {
            webView.setVisibility(View.GONE);
            nointernet.setVisibility(View.VISIBLE);
        }

    } //======================public void checkConnection(){Line End Here========================//


} //============================public class All_WebView_Activity extends AppCompatActivity {==========================//