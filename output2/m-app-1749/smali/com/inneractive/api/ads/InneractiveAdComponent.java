public class com.inneractive.api.ads.InneractiveAdComponent {
	 /* .source "InneractiveAdComponent.java" */
	 /* # static fields */
	 public static final Object BANNER_AD_TYPE;
	 public static final Object FULL_SCREEN_AD_TYPE;
	 public static final java.lang.String KEY_AGE;
	 public static final java.lang.String KEY_DISTRIBUTION_ID;
	 public static final java.lang.String KEY_EXTERNAL_ID;
	 public static final java.lang.String KEY_GENDER;
	 public static final java.lang.String KEY_KEYWORDS;
	 public static final java.lang.String KEY_MSISDN;
	 public static final java.lang.String KEY_TEST_MODE;
	 public static final Object TEXT_AD_TYPE;
	 private static com.inneractive.api.ads.InneractiveAdComponent instance;
	 /* # instance fields */
	 android.content.Context context;
	 /* # direct methods */
	 private com.inneractive.api.ads.InneractiveAdComponent ( ) {
		 /* .locals 0 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .prologue */
		 /* .line 40 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 42 */
		 this.context = p1;
		 /* .line 43 */
		 return;
	 } // .end method
	 public static void displayAd ( android.content.Context p0, android.view.ViewGroup p1, java.lang.String p2, Object p3, Integer p4 ) {
		 /* .locals 4 */
		 /* .param p0, "appContext" # Landroid/content/Context; */
		 /* .param p1, "layout" # Landroid/view/ViewGroup; */
		 /* .param p2, "appID" # Ljava/lang/String; */
		 /* .param p3, "adType" # B */
		 /* .param p4, "refreshInterval" # I */
		 /* .prologue */
		 int v3 = -1; // const/4 v3, -0x1
		 /* .line 98 */
		 com.inneractive.api.ads.InneractiveAdComponent .getInstance ( p0 );
		 /* .line 99 */
		 /* new-instance v0, Lcom/inneractive/api/ads/InneractiveAdView; */
		 /* invoke-direct {v0, p0, p2, p3, p4}, Lcom/inneractive/api/ads/InneractiveAdView;-><init>(Landroid/content/Context;Ljava/lang/String;BI)V */
		 /* .line 100 */
		 /* .local v0, "adView":Lcom/inneractive/api/ads/InneractiveAdView; */
		 int v2 = 2; // const/4 v2, 0x2
		 /* if-ne p3, v2, :cond_0 */
		 /* .line 101 */
		 /* new-instance v1, Landroid/widget/RelativeLayout$LayoutParams; */
		 /* invoke-direct {v1, v3, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V */
		 /* .line 102 */
		 /* .local v1, "params":Landroid/widget/RelativeLayout$LayoutParams; */
		 (( com.inneractive.api.ads.InneractiveAdView ) v0 ).setLayoutParams ( v1 ); // invoke-virtual {v0, v1}, Lcom/inneractive/api/ads/InneractiveAdView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
		 /* .line 104 */
	 } // .end local v1 # "params":Landroid/widget/RelativeLayout$LayoutParams;
} // :cond_0
(( android.view.ViewGroup ) p1 ).addView ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
/* .line 105 */
return;
} // .end method
public static void displayAd ( android.content.Context p0, android.widget.LinearLayout p1, java.lang.String p2, Object p3, Integer p4, java.util.Hashtable p5 ) {
/* .locals 8 */
/* .param p0, "appContext" # Landroid/content/Context; */
/* .param p1, "layout" # Landroid/widget/LinearLayout; */
/* .param p2, "appID" # Ljava/lang/String; */
/* .param p3, "adType" # B */
/* .param p4, "refreshInterval" # I */
/* .param p5, "metaData" # Ljava/util/Hashtable; */
/* .prologue */
int v7 = -1; // const/4 v7, -0x1
/* .line 120 */
com.inneractive.api.ads.InneractiveAdComponent .getInstance ( p0 );
/* .line 121 */
/* new-instance v0, Lcom/inneractive/api/ads/InneractiveAdView; */
/* move-object v1, p0 */
/* move-object v2, p2 */
/* move v3, p3 */
/* move v4, p4 */
/* move-object v5, p5 */
/* invoke-direct/range {v0 ..v5}, Lcom/inneractive/api/ads/InneractiveAdView;-><init>(Landroid/content/Context;Ljava/lang/String;BILjava/util/Hashtable;)V */
/* .line 122 */
/* .local v0, "adView":Lcom/inneractive/api/ads/InneractiveAdView; */
int v1 = 2; // const/4 v1, 0x2
/* if-ne p3, v1, :cond_0 */
/* .line 123 */
/* new-instance v6, Landroid/widget/RelativeLayout$LayoutParams; */
/* invoke-direct {v6, v7, v7}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V */
/* .line 124 */
/* .local v6, "params":Landroid/widget/RelativeLayout$LayoutParams; */
(( com.inneractive.api.ads.InneractiveAdView ) v0 ).setLayoutParams ( v6 ); // invoke-virtual {v0, v6}, Lcom/inneractive/api/ads/InneractiveAdView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
/* .line 126 */
} // .end local v6 # "params":Landroid/widget/RelativeLayout$LayoutParams;
} // :cond_0
(( android.widget.LinearLayout ) p1 ).addView ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
/* .line 128 */
return;
} // .end method
public static com.inneractive.api.ads.InneractiveAdView getAdView ( android.content.Context p0, java.lang.String p1, Object p2, Integer p3 ) {
/* .locals 4 */
/* .param p0, "appContext" # Landroid/content/Context; */
/* .param p1, "appID" # Ljava/lang/String; */
/* .param p2, "adType" # B */
/* .param p3, "refreshInterval" # I */
/* .prologue */
int v3 = -1; // const/4 v3, -0x1
/* .line 56 */
com.inneractive.api.ads.InneractiveAdComponent .getInstance ( p0 );
/* .line 57 */
/* new-instance v0, Lcom/inneractive/api/ads/InneractiveAdView; */
/* invoke-direct {v0, p0, p1, p2, p3}, Lcom/inneractive/api/ads/InneractiveAdView;-><init>(Landroid/content/Context;Ljava/lang/String;BI)V */
/* .line 58 */
/* .local v0, "adView":Lcom/inneractive/api/ads/InneractiveAdView; */
int v2 = 2; // const/4 v2, 0x2
/* if-ne p2, v2, :cond_0 */
/* .line 59 */
/* new-instance v1, Landroid/widget/RelativeLayout$LayoutParams; */
/* invoke-direct {v1, v3, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V */
/* .line 60 */
/* .local v1, "params":Landroid/widget/RelativeLayout$LayoutParams; */
(( com.inneractive.api.ads.InneractiveAdView ) v0 ).setLayoutParams ( v1 ); // invoke-virtual {v0, v1}, Lcom/inneractive/api/ads/InneractiveAdView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
/* .line 62 */
} // .end local v1 # "params":Landroid/widget/RelativeLayout$LayoutParams;
} // :cond_0
} // .end method
public static com.inneractive.api.ads.InneractiveAdView getAdView ( android.content.Context p0, java.lang.String p1, Object p2, Integer p3, java.util.Hashtable p4 ) {
/* .locals 8 */
/* .param p0, "appContext" # Landroid/content/Context; */
/* .param p1, "appID" # Ljava/lang/String; */
/* .param p2, "adType" # B */
/* .param p3, "refreshInterval" # I */
/* .param p4, "metaData" # Ljava/util/Hashtable; */
/* .prologue */
int v7 = -1; // const/4 v7, -0x1
/* .line 76 */
com.inneractive.api.ads.InneractiveAdComponent .getInstance ( p0 );
/* .line 77 */
/* new-instance v0, Lcom/inneractive/api/ads/InneractiveAdView; */
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move v3, p2 */
/* move v4, p3 */
/* move-object v5, p4 */
/* invoke-direct/range {v0 ..v5}, Lcom/inneractive/api/ads/InneractiveAdView;-><init>(Landroid/content/Context;Ljava/lang/String;BILjava/util/Hashtable;)V */
/* .line 78 */
/* .local v0, "adView":Lcom/inneractive/api/ads/InneractiveAdView; */
int v1 = 2; // const/4 v1, 0x2
/* if-ne p2, v1, :cond_0 */
/* .line 79 */
/* new-instance v6, Landroid/widget/RelativeLayout$LayoutParams; */
/* invoke-direct {v6, v7, v7}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V */
/* .line 80 */
/* .local v6, "params":Landroid/widget/RelativeLayout$LayoutParams; */
(( com.inneractive.api.ads.InneractiveAdView ) v0 ).setLayoutParams ( v6 ); // invoke-virtual {v0, v6}, Lcom/inneractive/api/ads/InneractiveAdView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
/* .line 82 */
} // .end local v6 # "params":Landroid/widget/RelativeLayout$LayoutParams;
} // :cond_0
} // .end method
public static synchronized com.inneractive.api.ads.InneractiveAdComponent getInstance ( android.content.Context p0 ) {
/* .locals 2 */
/* .param p0, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 33 */
/* const-class v1, Lcom/inneractive/api/ads/InneractiveAdComponent; */
/* monitor-enter v1 */
try { // :try_start_0
v0 = com.inneractive.api.ads.InneractiveAdComponent.instance;
/* if-nez v0, :cond_0 */
/* .line 35 */
/* new-instance v0, Lcom/inneractive/api/ads/InneractiveAdComponent; */
/* invoke-direct {v0, p0}, Lcom/inneractive/api/ads/InneractiveAdComponent;-><init>(Landroid/content/Context;)V */
/* .line 37 */
} // :cond_0
v0 = com.inneractive.api.ads.InneractiveAdComponent.instance;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit v1 */
/* .line 33 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* throw v0 */
} // .end method
