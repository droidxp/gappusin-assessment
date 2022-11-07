public class com.natenai.jniutil.NateAdsManager implements com.google.ads.AdListener {
	 /* .source "NateAdsManager.java" */
	 /* # interfaces */
	 /* # static fields */
	 private static final java.lang.String LOG_TAG;
	 private static final java.lang.String PREF_KEY_NEXT_INTERSTITIAL_TIME;
	 private static com.natenai.jniutil.NateAdsManager mAdsManager;
	 public static java.lang.String natenaiAdMobMediationID_Banner;
	 public static java.lang.String natenaiAdMobMediationID_Interstitial;
	 public static Boolean natenaiAdMobMediation_UseSmartBanner;
	 public static Boolean natenaiDebugAd;
	 public static Long natenaiDelayMillisecsBeforeShowingInterstitialAd;
	 public static Boolean natenaiIsTestingAd;
	 public static Long natenaiRequestInterstitialPeriodMillis;
	 public static java.lang.String natenaiTestAdDeviceID;
	 /* # instance fields */
	 private com.google.ads.AdView mAdView;
	 private com.google.ads.InterstitialAd mInterstitialAd;
	 private Boolean mIsBannerAdVisibled;
	 private Boolean mIsShowingIntersitialAd;
	 private Boolean mNeedDisplayBannerAdAfterDismissInterstitialAd;
	 /* # direct methods */
	 static com.natenai.jniutil.NateAdsManager ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 16 */
		 int v0 = 1; // const/4 v0, 0x1
		 com.natenai.jniutil.NateAdsManager.natenaiDebugAd = (v0!= 0);
		 /* .line 18 */
		 final String v0 = "e1ebd432317a4585"; // const-string v0, "e1ebd432317a4585"
		 /* .line 19 */
		 com.natenai.jniutil.NateAdsManager.natenaiAdMobMediation_UseSmartBanner = (v2!= 0);
		 /* .line 20 */
		 final String v0 = ""; // const-string v0, ""
		 /* .line 21 */
		 /* const-wide/16 v0, 0x0 */
		 /* sput-wide v0, Lcom/natenai/jniutil/NateAdsManager;->natenaiDelayMillisecsBeforeShowingInterstitialAd:J */
		 /* .line 22 */
		 /* const-wide/32 v0, 0x5265c00 */
		 /* sput-wide v0, Lcom/natenai/jniutil/NateAdsManager;->natenaiRequestInterstitialPeriodMillis:J */
		 /* .line 24 */
		 com.natenai.jniutil.NateAdsManager.natenaiIsTestingAd = (v2!= 0);
		 /* .line 25 */
		 final String v0 = "CF95DC53F383F9A836FD749F3EF439CD"; // const-string v0, "CF95DC53F383F9A836FD749F3EF439CD"
		 /* .line 27 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 11 */
		 return;
	 } // .end method
	 protected com.natenai.jniutil.NateAdsManager ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 int v1 = 0; // const/4 v1, 0x0
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 55 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 29 */
		 this.mAdView = v1;
		 /* .line 30 */
		 this.mInterstitialAd = v1;
		 /* .line 32 */
		 /* iput-boolean v0, p0, Lcom/natenai/jniutil/NateAdsManager;->mIsBannerAdVisibled:Z */
		 /* .line 33 */
		 /* iput-boolean v0, p0, Lcom/natenai/jniutil/NateAdsManager;->mIsShowingIntersitialAd:Z */
		 /* .line 34 */
		 /* iput-boolean v0, p0, Lcom/natenai/jniutil/NateAdsManager;->mNeedDisplayBannerAdAfterDismissInterstitialAd:Z */
		 /* .line 58 */
		 return;
	 } // .end method
	 static Boolean access$0 ( com.natenai.jniutil.NateAdsManager p0 ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 32 */
		 /* iget-boolean v0, p0, Lcom/natenai/jniutil/NateAdsManager;->mIsBannerAdVisibled:Z */
	 } // .end method
	 static com.google.ads.InterstitialAd access$1 ( com.natenai.jniutil.NateAdsManager p0 ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 30 */
		 v0 = this.mInterstitialAd;
	 } // .end method
	 public static void destroyAdsManager ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 48 */
		 v0 = com.natenai.jniutil.NateAdsManager.mAdsManager;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 50 */
			 v0 = com.natenai.jniutil.NateAdsManager.mAdsManager;
			 (( com.natenai.jniutil.NateAdsManager ) v0 ).destroy ( ); // invoke-virtual {v0}, Lcom/natenai/jniutil/NateAdsManager;->destroy()V
			 /* .line 51 */
			 int v0 = 0; // const/4 v0, 0x0
			 /* .line 53 */
		 } // :cond_0
		 return;
	 } // .end method
	 public static com.natenai.jniutil.NateAdsManager getInstance ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 38 */
		 v0 = com.natenai.jniutil.NateAdsManager.mAdsManager;
		 /* if-nez v0, :cond_0 */
		 /* .line 40 */
		 /* new-instance v0, Lcom/natenai/jniutil/NateAdsManager; */
		 /* invoke-direct {v0}, Lcom/natenai/jniutil/NateAdsManager;-><init>()V */
		 /* .line 43 */
	 } // :cond_0
	 v0 = com.natenai.jniutil.NateAdsManager.mAdsManager;
} // .end method
/* # virtual methods */
public void destroy ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 62 */
	 v0 = this.mAdView;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 64 */
		 v0 = this.mAdView;
		 (( com.google.ads.AdView ) v0 ).destroy ( ); // invoke-virtual {v0}, Lcom/google/ads/AdView;->destroy()V
		 /* .line 65 */
		 int v0 = 0; // const/4 v0, 0x0
		 this.mAdView = v0;
		 /* .line 67 */
	 } // :cond_0
	 return;
} // .end method
public Boolean getBannerAdVisibled ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 178 */
	 /* iget-boolean v0, p0, Lcom/natenai/jniutil/NateAdsManager;->mIsBannerAdVisibled:Z */
} // .end method
public void initializeAds ( ) {
	 /* .locals 22 */
	 /* .prologue */
	 /* .line 71 */
	 /* move-object/from16 v0, p0 */
	 v0 = this.mAdView;
	 /* move-object/from16 v18, v0 */
	 if ( v18 != null) { // if-eqz v18, :cond_0
		 /* .line 175 */
	 } // :goto_0
	 return;
	 /* .line 75 */
} // :cond_0
try { // :try_start_0
	 com.natenai.jniutil.NateBaseActivity .getInstance ( );
	 /* invoke-virtual/range {v18 ..v19}, Lcom/natenai/jniutil/NateBaseActivity;->findViewById(I)Landroid/view/View; */
	 /* check-cast v11, Landroid/view/ViewGroup; */
	 /* .line 76 */
	 /* .local v11, "layout":Landroid/view/ViewGroup; */
	 if ( v11 != null) { // if-eqz v11, :cond_5
		 /* .line 78 */
		 com.natenai.jniutil.NateBaseActivity .getInstance ( );
		 /* invoke-virtual/range {v18 ..v18}, Lcom/natenai/jniutil/NateBaseActivity;->getResources()Landroid/content/res/Resources; */
		 /* invoke-virtual/range {v18 ..v18}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics; */
		 /* move-object/from16 v0, v18 */
		 /* iget v9, v0, Landroid/util/DisplayMetrics;->density:F */
		 /* .line 79 */
		 /* .local v9, "density":F */
		 /* .line 80 */
		 /* .local v17, "scaledWidth":I */
		 /* const/high16 v18, 0x42540000 # 53.0f */
		 /* mul-float v18, v18, v9 */
		 /* const/high16 v19, 0x3f000000 # 0.5f */
		 /* add-float v18, v18, v19 */
		 /* move/from16 v0, v18 */
		 /* float-to-int v0, v0 */
		 /* move/from16 v16, v0 */
		 /* .line 82 */
		 /* .local v16, "scaledHeight":I */
		 /* new-instance v12, Landroid/widget/RelativeLayout$LayoutParams; */
		 /* const/16 v18, -0x2 */
		 /* const/16 v19, -0x2 */
		 /* move/from16 v0, v18 */
		 /* move/from16 v1, v19 */
		 /* invoke-direct {v12, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V */
		 /* .line 84 */
		 /* .local v12, "layoutParams":Landroid/widget/RelativeLayout$LayoutParams; */
		 /* const/16 v18, 0x0 */
		 /* move/from16 v0, v18 */
		 /* iput v0, v12, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I */
		 /* .line 85 */
		 /* const/16 v18, 0x0 */
		 /* move/from16 v0, v18 */
		 /* iput v0, v12, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I */
		 /* .line 86 */
		 /* iget v0, v12, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I */
		 /* move/from16 v18, v0 */
		 /* if-gez v18, :cond_1 */
		 /* .line 87 */
		 /* const/16 v18, 0x0 */
		 /* move/from16 v0, v18 */
		 /* iput v0, v12, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I */
		 /* .line 88 */
	 } // :cond_1
	 (( android.view.ViewGroup ) v11 ).setLayoutParams ( v12 ); // invoke-virtual {v11, v12}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
	 /* .line 91 */
	 /* new-instance v19, Lcom/google/ads/AdView; */
	 com.natenai.jniutil.NateBaseActivity .getInstance ( );
	 /* sget-boolean v18, Lcom/natenai/jniutil/NateAdsManager;->natenaiAdMobMediation_UseSmartBanner:Z */
	 if ( v18 != null) { // if-eqz v18, :cond_6
		 v18 = com.google.ads.AdSize.SMART_BANNER;
	 } // :goto_1
	 v21 = com.natenai.jniutil.NateAdsManager.natenaiAdMobMediationID_Banner;
	 /* move-object/from16 v0, v19 */
	 /* move-object/from16 v1, v20 */
	 /* move-object/from16 v2, v18 */
	 /* move-object/from16 v3, v21 */
	 /* invoke-direct {v0, v1, v2, v3}, Lcom/google/ads/AdView;-><init>(Landroid/app/Activity;Lcom/google/ads/AdSize;Ljava/lang/String;)V */
	 /* move-object/from16 v0, v19 */
	 /* move-object/from16 v1, p0 */
	 this.mAdView = v0;
	 /* .line 94 */
	 /* move-object/from16 v0, p0 */
	 v0 = this.mAdView;
	 /* move-object/from16 v18, v0 */
	 /* move-object/from16 v0, v18 */
	 /* move-object/from16 v1, p0 */
	 (( com.google.ads.AdView ) v0 ).setAdListener ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/AdView;->setAdListener(Lcom/google/ads/AdListener;)V
	 /* .line 96 */
	 /* new-instance v6, Landroid/widget/RelativeLayout$LayoutParams; */
	 /* const/16 v18, -0x2 */
	 /* const/16 v19, -0x2 */
	 /* move/from16 v0, v18 */
	 /* move/from16 v1, v19 */
	 /* invoke-direct {v6, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V */
	 /* .line 98 */
	 /* .local v6, "adWhirlLayoutParams":Landroid/widget/RelativeLayout$LayoutParams; */
	 /* move-object/from16 v0, p0 */
	 v0 = this.mAdView;
	 /* move-object/from16 v18, v0 */
	 /* move-object/from16 v0, v18 */
	 (( android.view.ViewGroup ) v11 ).addView ( v0, v6 ); // invoke-virtual {v11, v0, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
	 /* .line 99 */
	 (( android.view.ViewGroup ) v11 ).invalidate ( ); // invoke-virtual {v11}, Landroid/view/ViewGroup;->invalidate()V
	 /* .line 102 */
	 /* new-instance v4, Lcom/google/ads/AdRequest; */
	 /* invoke-direct {v4}, Lcom/google/ads/AdRequest;-><init>()V */
	 /* .line 104 */
	 /* .local v4, "adRequest4Banner":Lcom/google/ads/AdRequest; */
	 /* sget-boolean v18, Lcom/natenai/jniutil/NateAdsManager;->natenaiIsTestingAd:Z */
	 if ( v18 != null) { // if-eqz v18, :cond_2
		 /* .line 106 */
		 v18 = com.google.ads.AdRequest.TEST_EMULATOR;
		 /* move-object/from16 v0, v18 */
		 (( com.google.ads.AdRequest ) v4 ).addTestDevice ( v0 ); // invoke-virtual {v4, v0}, Lcom/google/ads/AdRequest;->addTestDevice(Ljava/lang/String;)Lcom/google/ads/AdRequest;
		 /* .line 107 */
		 v18 = com.natenai.jniutil.NateAdsManager.natenaiTestAdDeviceID;
		 /* move-object/from16 v0, v18 */
		 (( com.google.ads.AdRequest ) v4 ).addTestDevice ( v0 ); // invoke-virtual {v4, v0}, Lcom/google/ads/AdRequest;->addTestDevice(Ljava/lang/String;)Lcom/google/ads/AdRequest;
		 /* .line 108 */
		 /* const/16 v18, 0x1 */
		 /* move/from16 v0, v18 */
		 (( com.google.ads.AdRequest ) v4 ).setTesting ( v0 ); // invoke-virtual {v4, v0}, Lcom/google/ads/AdRequest;->setTesting(Z)Lcom/google/ads/AdRequest;
		 /* .line 111 */
	 } // :cond_2
	 /* move-object/from16 v0, p0 */
	 v0 = this.mAdView;
	 /* move-object/from16 v18, v0 */
	 /* move-object/from16 v0, v18 */
	 (( com.google.ads.AdView ) v0 ).loadAd ( v4 ); // invoke-virtual {v0, v4}, Lcom/google/ads/AdView;->loadAd(Lcom/google/ads/AdRequest;)V
	 /* .line 112 */
	 /* const/16 v18, 0x1 */
	 /* move/from16 v0, v18 */
	 /* move-object/from16 v1, p0 */
	 /* iput-boolean v0, v1, Lcom/natenai/jniutil/NateAdsManager;->mIsBannerAdVisibled:Z */
	 /* .line 115 */
	 /* move/from16 v0, v18 */
	 /* move/from16 v1, v19 */
	 /* if-le v0, v1, :cond_7 */
	 /* .line 116 */
	 /* const/16 v18, 0x0 */
	 /* invoke-static/range {v17 ..v18}, Lcom/natenai/jniutil/NateGameJNIUtilLib;->nativeSetAdViewSize(II)V */
	 /* .line 121 */
} // :goto_2
v18 = com.natenai.jniutil.NateAdsManager.natenaiAdMobMediationID_Interstitial;
if ( v18 != null) { // if-eqz v18, :cond_8
	 v18 = com.natenai.jniutil.NateAdsManager.natenaiAdMobMediationID_Interstitial;
	 v18 = 	 /* invoke-virtual/range {v18 ..v18}, Ljava/lang/String;->length()I */
	 if ( v18 != null) { // if-eqz v18, :cond_8
		 int v15 = 1; // const/4 v15, 0x1
		 /* .line 124 */
		 /* .local v15, "requestIntersitialAd":Z */
	 } // :goto_3
	 final String v18 = "NextInterstitialTime"; // const-string v18, "NextInterstitialTime"
	 v18 = 	 /* invoke-static/range {v18 ..v18}, Lcom/natenai/jniutil/NateGameJNIUtilLib;->pref_has_key(Ljava/lang/String;)Z */
	 if ( v18 != null) { // if-eqz v18, :cond_9
		 /* .line 126 */
		 final String v18 = "NextInterstitialTime"; // const-string v18, "NextInterstitialTime"
		 /* invoke-static/range {v18 ..v18}, Lcom/natenai/jniutil/NateGameJNIUtilLib;->pref_get_long(Ljava/lang/String;)J */
		 /* move-result-wide v13 */
		 /* .line 127 */
		 /* .local v13, "nextInterstitialShowTimeMillis":J */
		 java.lang.System .currentTimeMillis ( );
		 /* move-result-wide v7 */
		 /* .line 128 */
		 /* .local v7, "currentTimeMillis":J */
		 /* cmp-long v18, v7, v13 */
		 /* if-gez v18, :cond_3 */
		 /* .line 130 */
		 int v15 = 0; // const/4 v15, 0x0
		 /* .line 131 */
		 final String v18 = "NateAdsManager"; // const-string v18, "NateAdsManager"
		 /* new-instance v19, Ljava/lang/StringBuilder; */
		 final String v20 = "NO REQUEST for Interstitial Ad, wait for: "; // const-string v20, "NO REQUEST for Interstitial Ad, wait for: "
		 /* invoke-direct/range {v19 ..v20}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 /* sub-long v20, v13, v7 */
		 /* invoke-virtual/range {v19 ..v21}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder; */
		 final String v20 = " msecs"; // const-string v20, " msecs"
		 /* invoke-virtual/range {v19 ..v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
		 /* invoke-virtual/range {v19 ..v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
		 /* invoke-static/range {v18 ..v19}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I */
		 /* .line 145 */
	 } // .end local v7 # "currentTimeMillis":J
} // .end local v13 # "nextInterstitialShowTimeMillis":J
} // :cond_3
} // :goto_4
if ( v15 != null) { // if-eqz v15, :cond_5
/* .line 147 */
final String v18 = "NateAdsManager"; // const-string v18, "NateAdsManager"
final String v19 = "Requesting Interstitial Ad"; // const-string v19, "Requesting Interstitial Ad"
/* invoke-static/range {v18 ..v19}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I */
/* .line 149 */
/* new-instance v18, Lcom/google/ads/InterstitialAd; */
com.natenai.jniutil.NateBaseActivity .getInstance ( );
v20 = com.natenai.jniutil.NateAdsManager.natenaiAdMobMediationID_Interstitial;
/* invoke-direct/range {v18 ..v20}, Lcom/google/ads/InterstitialAd;-><init>(Landroid/app/Activity;Ljava/lang/String;)V */
/* move-object/from16 v0, v18 */
/* move-object/from16 v1, p0 */
this.mInterstitialAd = v0;
/* .line 152 */
/* new-instance v5, Lcom/google/ads/AdRequest; */
/* invoke-direct {v5}, Lcom/google/ads/AdRequest;-><init>()V */
/* .line 154 */
/* .local v5, "adRequest4Interstitial":Lcom/google/ads/AdRequest; */
/* sget-boolean v18, Lcom/natenai/jniutil/NateAdsManager;->natenaiIsTestingAd:Z */
if ( v18 != null) { // if-eqz v18, :cond_4
/* .line 156 */
v18 = com.google.ads.AdRequest.TEST_EMULATOR;
/* move-object/from16 v0, v18 */
(( com.google.ads.AdRequest ) v5 ).addTestDevice ( v0 ); // invoke-virtual {v5, v0}, Lcom/google/ads/AdRequest;->addTestDevice(Ljava/lang/String;)Lcom/google/ads/AdRequest;
/* .line 157 */
v18 = com.natenai.jniutil.NateAdsManager.natenaiTestAdDeviceID;
/* move-object/from16 v0, v18 */
(( com.google.ads.AdRequest ) v5 ).addTestDevice ( v0 ); // invoke-virtual {v5, v0}, Lcom/google/ads/AdRequest;->addTestDevice(Ljava/lang/String;)Lcom/google/ads/AdRequest;
/* .line 158 */
/* const/16 v18, 0x1 */
/* move/from16 v0, v18 */
(( com.google.ads.AdRequest ) v5 ).setTesting ( v0 ); // invoke-virtual {v5, v0}, Lcom/google/ads/AdRequest;->setTesting(Z)Lcom/google/ads/AdRequest;
/* .line 161 */
} // :cond_4
/* move-object/from16 v0, p0 */
v0 = this.mInterstitialAd;
/* move-object/from16 v18, v0 */
/* move-object/from16 v0, v18 */
(( com.google.ads.InterstitialAd ) v0 ).loadAd ( v5 ); // invoke-virtual {v0, v5}, Lcom/google/ads/InterstitialAd;->loadAd(Lcom/google/ads/AdRequest;)V
/* .line 164 */
/* move-object/from16 v0, p0 */
v0 = this.mInterstitialAd;
/* move-object/from16 v18, v0 */
/* move-object/from16 v0, v18 */
/* move-object/from16 v1, p0 */
(( com.google.ads.InterstitialAd ) v0 ).setAdListener ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/InterstitialAd;->setAdListener(Lcom/google/ads/AdListener;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 174 */
} // .end local v4 # "adRequest4Banner":Lcom/google/ads/AdRequest;
} // .end local v5 # "adRequest4Interstitial":Lcom/google/ads/AdRequest;
} // .end local v6 # "adWhirlLayoutParams":Landroid/widget/RelativeLayout$LayoutParams;
} // .end local v9 # "density":F
} // .end local v11 # "layout":Landroid/view/ViewGroup;
} // .end local v12 # "layoutParams":Landroid/widget/RelativeLayout$LayoutParams;
} // .end local v15 # "requestIntersitialAd":Z
} // .end local v16 # "scaledHeight":I
} // .end local v17 # "scaledWidth":I
} // :cond_5
} // :goto_5
com.natenai.jniutil.NateBaseActivity .getInstance ( );
/* invoke-virtual/range {v18 ..v18}, Lcom/natenai/jniutil/NateBaseActivity;->setFocusOnGLView()V */
/* goto/16 :goto_0 */
/* .line 91 */
/* .restart local v9 # "density":F */
/* .restart local v11 # "layout":Landroid/view/ViewGroup; */
/* .restart local v12 # "layoutParams":Landroid/widget/RelativeLayout$LayoutParams; */
/* .restart local v16 # "scaledHeight":I */
/* .restart local v17 # "scaledWidth":I */
} // :cond_6
try { // :try_start_1
v18 = com.google.ads.AdSize.BANNER;
/* goto/16 :goto_1 */
/* .line 118 */
/* .restart local v4 # "adRequest4Banner":Lcom/google/ads/AdRequest; */
/* .restart local v6 # "adWhirlLayoutParams":Landroid/widget/RelativeLayout$LayoutParams; */
} // :cond_7
/* move/from16 v0, v17 */
/* move/from16 v1, v16 */
com.natenai.jniutil.NateGameJNIUtilLib .nativeSetAdViewSize ( v0,v1 );
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* goto/16 :goto_2 */
/* .line 168 */
} // .end local v4 # "adRequest4Banner":Lcom/google/ads/AdRequest;
} // .end local v6 # "adWhirlLayoutParams":Landroid/widget/RelativeLayout$LayoutParams;
} // .end local v9 # "density":F
} // .end local v11 # "layout":Landroid/view/ViewGroup;
} // .end local v12 # "layoutParams":Landroid/widget/RelativeLayout$LayoutParams;
} // .end local v16 # "scaledHeight":I
} // .end local v17 # "scaledWidth":I
/* :catch_0 */
/* move-exception v10 */
/* .line 170 */
/* .local v10, "ex":Ljava/lang/Exception; */
final String v18 = "AdMob"; // const-string v18, "AdMob"
/* new-instance v19, Ljava/lang/StringBuilder; */
final String v20 = "Error creating AdMob Mediation! - "; // const-string v20, "Error creating AdMob Mediation! - "
/* invoke-direct/range {v19 ..v20}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.Exception ) v10 ).toString ( ); // invoke-virtual {v10}, Ljava/lang/Exception;->toString()Ljava/lang/String;
/* invoke-virtual/range {v19 ..v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* invoke-virtual/range {v19 ..v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
/* invoke-static/range {v18 ..v19}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I */
/* .line 121 */
} // .end local v10 # "ex":Ljava/lang/Exception;
/* .restart local v4 # "adRequest4Banner":Lcom/google/ads/AdRequest; */
/* .restart local v6 # "adWhirlLayoutParams":Landroid/widget/RelativeLayout$LayoutParams; */
/* .restart local v9 # "density":F */
/* .restart local v11 # "layout":Landroid/view/ViewGroup; */
/* .restart local v12 # "layoutParams":Landroid/widget/RelativeLayout$LayoutParams; */
/* .restart local v16 # "scaledHeight":I */
/* .restart local v17 # "scaledWidth":I */
} // :cond_8
int v15 = 0; // const/4 v15, 0x0
/* goto/16 :goto_3 */
/* .line 137 */
/* .restart local v15 # "requestIntersitialAd":Z */
} // :cond_9
int v15 = 0; // const/4 v15, 0x0
/* .line 140 */
try { // :try_start_2
final String v18 = "NextInterstitialTime"; // const-string v18, "NextInterstitialTime"
java.lang.System .currentTimeMillis ( );
/* move-result-wide v19 */
/* invoke-static/range {v18 ..v20}, Lcom/natenai/jniutil/NateGameJNIUtilLib;->pref_set_long(Ljava/lang/String;J)V */
/* .line 142 */
final String v18 = "NateAdsManager"; // const-string v18, "NateAdsManager"
final String v19 = "First time install -> NO REQUEST Interstitial Ad"; // const-string v19, "First time install -> NO REQUEST Interstitial Ad"
/* invoke-static/range {v18 ..v19}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I */
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_0 */
/* goto/16 :goto_4 */
} // .end method
public Boolean isReadyToShowInterstitialAd ( ) {
/* .locals 1 */
/* .prologue */
/* .line 224 */
v0 = this.mInterstitialAd;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mInterstitialAd;
v0 = (( com.google.ads.InterstitialAd ) v0 ).isReady ( ); // invoke-virtual {v0}, Lcom/google/ads/InterstitialAd;->isReady()Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void onDismissScreen ( com.google.ads.Ad p0 ) {
/* .locals 3 */
/* .param p1, "ad" # Lcom/google/ads/Ad; */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 265 */
/* sget-boolean v0, Lcom/natenai/jniutil/NateAdsManager;->natenaiDebugAd:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 267 */
final String v0 = "NateAdsManager"; // const-string v0, "NateAdsManager"
final String v1 = "onDismissScreen"; // const-string v1, "onDismissScreen"
android.util.Log .d ( v0,v1 );
/* .line 271 */
} // :cond_0
v0 = this.mInterstitialAd;
/* if-ne p1, v0, :cond_1 */
/* .line 273 */
/* iput-boolean v2, p0, Lcom/natenai/jniutil/NateAdsManager;->mIsShowingIntersitialAd:Z */
/* .line 276 */
} // :cond_1
/* iget-boolean v0, p0, Lcom/natenai/jniutil/NateAdsManager;->mNeedDisplayBannerAdAfterDismissInterstitialAd:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 278 */
int v0 = 1; // const/4 v0, 0x1
(( com.natenai.jniutil.NateAdsManager ) p0 ).setBannerAdVisibled ( v0 ); // invoke-virtual {p0, v0}, Lcom/natenai/jniutil/NateAdsManager;->setBannerAdVisibled(Z)V
/* .line 279 */
/* iput-boolean v2, p0, Lcom/natenai/jniutil/NateAdsManager;->mNeedDisplayBannerAdAfterDismissInterstitialAd:Z */
/* .line 282 */
} // :cond_2
v0 = com.natenai.jniutil.NateBaseActivity.mGLView;
(( android.opengl.GLSurfaceView ) v0 ).onResume ( ); // invoke-virtual {v0}, Landroid/opengl/GLSurfaceView;->onResume()V
/* .line 283 */
return;
} // .end method
public void onFailedToReceiveAd ( com.google.ads.Ad p0, com.google.ads.AdRequest$ErrorCode p1 ) {
/* .locals 3 */
/* .param p1, "ad" # Lcom/google/ads/Ad; */
/* .param p2, "error" # Lcom/google/ads/AdRequest$ErrorCode; */
/* .prologue */
/* .line 288 */
/* sget-boolean v1, Lcom/natenai/jniutil/NateAdsManager;->natenaiDebugAd:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 290 */
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "onFailedToReceiveAd ("; // const-string v2, "onFailedToReceiveAd ("
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v2 = ")"; // const-string v2, ")"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 291 */
/* .local v0, "message":Ljava/lang/String; */
final String v1 = "NateAdsManager"; // const-string v1, "NateAdsManager"
android.util.Log .d ( v1,v0 );
/* .line 294 */
} // .end local v0 # "message":Ljava/lang/String;
} // :cond_0
return;
} // .end method
public void onLeaveApplication ( com.google.ads.Ad p0 ) {
/* .locals 2 */
/* .param p1, "ad" # Lcom/google/ads/Ad; */
/* .prologue */
/* .line 303 */
/* sget-boolean v0, Lcom/natenai/jniutil/NateAdsManager;->natenaiDebugAd:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 305 */
final String v0 = "NateAdsManager"; // const-string v0, "NateAdsManager"
final String v1 = "onLeaveApplication"; // const-string v1, "onLeaveApplication"
android.util.Log .d ( v0,v1 );
/* .line 308 */
} // :cond_0
return;
} // .end method
public void onPresentScreen ( com.google.ads.Ad p0 ) {
/* .locals 2 */
/* .param p1, "ad" # Lcom/google/ads/Ad; */
/* .prologue */
/* .line 316 */
/* sget-boolean v0, Lcom/natenai/jniutil/NateAdsManager;->natenaiDebugAd:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 318 */
final String v0 = "NateAdsManager"; // const-string v0, "NateAdsManager"
final String v1 = "onPresentScreen"; // const-string v1, "onPresentScreen"
android.util.Log .d ( v0,v1 );
/* .line 322 */
} // :cond_0
v0 = this.mInterstitialAd;
/* if-ne p1, v0, :cond_1 */
/* .line 324 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/natenai/jniutil/NateAdsManager;->mIsShowingIntersitialAd:Z */
/* .line 326 */
} // :cond_1
v0 = com.natenai.jniutil.NateBaseActivity.mGLView;
(( android.opengl.GLSurfaceView ) v0 ).onPause ( ); // invoke-virtual {v0}, Landroid/opengl/GLSurfaceView;->onPause()V
/* .line 327 */
return;
} // .end method
public void onReceiveAd ( com.google.ads.Ad p0 ) {
/* .locals 2 */
/* .param p1, "ad" # Lcom/google/ads/Ad; */
/* .prologue */
/* .line 332 */
/* sget-boolean v0, Lcom/natenai/jniutil/NateAdsManager;->natenaiDebugAd:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 334 */
final String v0 = "NateAdsManager"; // const-string v0, "NateAdsManager"
final String v1 = "onReceiveAd"; // const-string v1, "onReceiveAd"
android.util.Log .d ( v0,v1 );
/* .line 336 */
v0 = this.mInterstitialAd;
/* if-ne p1, v0, :cond_0 */
/* .line 338 */
final String v0 = "NateAdsManager"; // const-string v0, "NateAdsManager"
final String v1 = "onReceiveAd -> Interstitial Ad"; // const-string v1, "onReceiveAd -> Interstitial Ad"
android.util.Log .d ( v0,v1 );
/* .line 342 */
} // :cond_0
return;
} // .end method
public void setBannerAdVisibled ( Boolean p0 ) {
/* .locals 3 */
/* .param p1, "visible" # Z */
/* .prologue */
/* .line 182 */
v0 = this.mAdView;
/* if-nez v0, :cond_1 */
/* .line 220 */
} // :cond_0
} // :goto_0
return;
/* .line 185 */
} // :cond_1
/* iget-boolean v0, p0, Lcom/natenai/jniutil/NateAdsManager;->mIsShowingIntersitialAd:Z */
/* if-nez v0, :cond_0 */
/* .line 188 */
/* iput-boolean p1, p0, Lcom/natenai/jniutil/NateAdsManager;->mIsBannerAdVisibled:Z */
/* .line 190 */
/* sget-boolean v0, Lcom/natenai/jniutil/NateAdsManager;->natenaiDebugAd:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 191 */
final String v0 = "NateAdsManager"; // const-string v0, "NateAdsManager"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "setBannerAdVisibled( "; // const-string v2, "setBannerAdVisibled( "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
final String v2 = " )"; // const-string v2, " )"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v0,v1 );
/* .line 193 */
} // :cond_2
com.natenai.jniutil.NateBaseActivity .getInstance ( );
/* new-instance v1, Lcom/natenai/jniutil/NateAdsManager$1; */
/* invoke-direct {v1, p0}, Lcom/natenai/jniutil/NateAdsManager$1;-><init>(Lcom/natenai/jniutil/NateAdsManager;)V */
(( com.natenai.jniutil.NateBaseActivity ) v0 ).runOnUiThread ( v1 ); // invoke-virtual {v0, v1}, Lcom/natenai/jniutil/NateBaseActivity;->runOnUiThread(Ljava/lang/Runnable;)V
} // .end method
public void showInterstitialAd ( ) {
/* .locals 2 */
/* .prologue */
/* .line 229 */
v0 = (( com.natenai.jniutil.NateAdsManager ) p0 ).isReadyToShowInterstitialAd ( ); // invoke-virtual {p0}, Lcom/natenai/jniutil/NateAdsManager;->isReadyToShowInterstitialAd()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 231 */
/* iget-boolean v0, p0, Lcom/natenai/jniutil/NateAdsManager;->mIsBannerAdVisibled:Z */
/* iput-boolean v0, p0, Lcom/natenai/jniutil/NateAdsManager;->mNeedDisplayBannerAdAfterDismissInterstitialAd:Z */
/* .line 233 */
/* iget-boolean v0, p0, Lcom/natenai/jniutil/NateAdsManager;->mIsBannerAdVisibled:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 234 */
int v0 = 0; // const/4 v0, 0x0
(( com.natenai.jniutil.NateAdsManager ) p0 ).setBannerAdVisibled ( v0 ); // invoke-virtual {p0, v0}, Lcom/natenai/jniutil/NateAdsManager;->setBannerAdVisibled(Z)V
/* .line 236 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/natenai/jniutil/NateAdsManager;->mIsShowingIntersitialAd:Z */
/* .line 238 */
com.natenai.jniutil.NateBaseActivity .getInstance ( );
/* new-instance v1, Lcom/natenai/jniutil/NateAdsManager$2; */
/* invoke-direct {v1, p0}, Lcom/natenai/jniutil/NateAdsManager$2;-><init>(Lcom/natenai/jniutil/NateAdsManager;)V */
(( com.natenai.jniutil.NateBaseActivity ) v0 ).runOnUiThread ( v1 ); // invoke-virtual {v0, v1}, Lcom/natenai/jniutil/NateBaseActivity;->runOnUiThread(Ljava/lang/Runnable;)V
/* .line 260 */
} // :cond_1
return;
} // .end method
