public class com.mobfox.video.sdk.MobFoxRichMediaActivity extends android.app.Activity {
	 /* .source "MobFoxRichMediaActivity.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$CanSkipTask;, */
	 /* Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$InterstitialAutocloseTask;, */
	 /* Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$InterstitialLoadingTimeoutTask;, */
	 /* Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$VideoTimeoutTask; */
	 /* } */
} // .end annotation
/* # static fields */
private static final Integer SKIP_IMAGE_RESOURCE_ID;
public static final Integer TYPE_BROWSER;
public static final Integer TYPE_INTERSTITIAL;
public static final Integer TYPE_UNKNOWN;
public static final Integer TYPE_VIDEO;
/* # instance fields */
private com.mobfox.video.sdk.RichMediaAdData mAd;
private Boolean mCanClose;
private android.widget.VideoView mCustomVideoView;
private android.widget.FrameLayout mCustomView;
private android.webkit.WebChromeClient$CustomViewCallback mCustomViewCallback;
private Integer mEnterAnim;
private Integer mExitAnim;
private android.os.Handler mHandler;
protected Boolean mInterstitialAutocloseReset;
private java.util.Timer mInterstitialAutocloseTimer;
private java.util.Timer mInterstitialCanCloseTimer;
private android.view.View$OnClickListener mInterstitialClickListener;
private com.mobfox.video.sdk.MobFoxInterstitialController mInterstitialController;
private com.mobfox.video.sdk.InterstitialData mInterstitialData;
private java.util.Timer mInterstitialLoadingTimer;
private com.mobfox.video.sdk.MobFoxWebFrame mInterstitialView;
private android.widget.FrameLayout mLoadingView;
private com.mobfox.video.sdk.MobFoxMediaController mMediaController;
com.mobfox.video.sdk.MobFoxWebViewClient$OnPageLoadedListener mOnInterstitialLoadedListener;
android.view.View$OnClickListener mOnInterstitialSkipListener;
com.mobfox.video.sdk.MobFoxInterstitialController$OnResetAutocloseListener mOnResetAutocloseListener;
com.mobfox.video.sdk.MobFoxVideoView$OnTimeEventListener mOnVideoCanCloseEventListener;
android.media.MediaPlayer$OnCompletionListener mOnVideoCompletionListener;
android.media.MediaPlayer$OnErrorListener mOnVideoErrorListener;
com.mobfox.video.sdk.MobFoxMediaController$OnPauseListener mOnVideoPauseListener;
android.media.MediaPlayer$OnPreparedListener mOnVideoPreparedListener;
com.mobfox.video.sdk.MobFoxMediaController$OnReplayListener mOnVideoReplayListener;
android.view.View$OnClickListener mOnVideoSkipListener;
com.mobfox.video.sdk.MobFoxVideoView$OnStartListener mOnVideoStartListener;
com.mobfox.video.sdk.MobFoxVideoView$OnTimeEventListener mOnVideoTimeEventListener;
com.mobfox.video.sdk.MobFoxMediaController$OnUnpauseListener mOnVideoUnpauseListener;
com.mobfox.video.sdk.MobFoxWebViewClient$OnPageLoadedListener mOnWebBrowserLoadedListener;
private android.view.View$OnClickListener mOverlayClickListener;
private com.mobfox.video.sdk.MobFoxVideoView$OnTimeEventListener mOverlayShowListener;
private com.mobfox.video.sdk.MobFoxWebFrame mOverlayView;
private Boolean mPageLoaded;
private com.mobfox.video.sdk.ResourceManager mResourceManager;
private Boolean mResult;
private android.widget.FrameLayout mRootLayout;
private android.widget.ImageView mSkipButton;
private Integer mType;
private com.mobfox.video.sdk.VideoData mVideoData;
private Integer mVideoHeight;
private Integer mVideoLastPosition;
private android.widget.FrameLayout mVideoLayout;
private java.util.Timer mVideoTimeoutTimer;
private com.mobfox.video.sdk.MobFoxVideoView mVideoView;
private Integer mVideoWidth;
private com.mobfox.video.sdk.MobFoxWebFrame mWebBrowserView;
private Integer mWindowHeight;
private Integer mWindowWidth;
Integer marginArg;
android.util.DisplayMetrics metrics;
Integer paddingArg;
Integer skipButtonSizeLand;
Integer skipButtonSizePort;
private android.net.Uri uri;
/* # direct methods */
public com.mobfox.video.sdk.MobFoxRichMediaActivity ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 54 */
	 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
	 /* .line 92 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* iput-boolean v0, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mPageLoaded:Z */
	 /* .line 98 */
	 int v0 = 5; // const/4 v0, 0x5
	 /* iput v0, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->paddingArg:I */
	 /* .line 99 */
	 /* const/16 v0, 0x8 */
	 /* iput v0, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->marginArg:I */
	 /* .line 101 */
	 /* const/16 v0, 0x32 */
	 /* iput v0, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->skipButtonSizeLand:I */
	 /* .line 102 */
	 /* const/16 v0, 0x28 */
	 /* iput v0, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->skipButtonSizePort:I */
	 /* .line 349 */
	 /* new-instance v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$1; */
	 /* invoke-direct {v0, p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$1;-><init>(Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;)V */
	 this.mHandler = v0;
	 /* .line 758 */
	 /* new-instance v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$2; */
	 /* invoke-direct {v0, p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$2;-><init>(Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;)V */
	 this.mOverlayShowListener = v0;
	 /* .line 774 */
	 /* new-instance v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$3; */
	 /* invoke-direct {v0, p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$3;-><init>(Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;)V */
	 this.mOverlayClickListener = v0;
	 /* .line 787 */
	 /* new-instance v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$4; */
	 /* invoke-direct {v0, p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$4;-><init>(Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;)V */
	 this.mOnVideoErrorListener = v0;
	 /* .line 797 */
	 /* new-instance v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$5; */
	 /* invoke-direct {v0, p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$5;-><init>(Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;)V */
	 this.mOnVideoPreparedListener = v0;
	 /* .line 815 */
	 /* new-instance v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$6; */
	 /* invoke-direct {v0, p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$6;-><init>(Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;)V */
	 this.mOnVideoCompletionListener = v0;
	 /* .line 853 */
	 /* new-instance v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$7; */
	 /* invoke-direct {v0, p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$7;-><init>(Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;)V */
	 this.mOnVideoStartListener = v0;
	 /* .line 873 */
	 /* new-instance v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$8; */
	 /* invoke-direct {v0, p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$8;-><init>(Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;)V */
	 this.mOnVideoPauseListener = v0;
	 /* .line 893 */
	 /* new-instance v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$9; */
	 /* invoke-direct {v0, p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$9;-><init>(Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;)V */
	 this.mOnVideoUnpauseListener = v0;
	 /* .line 913 */
	 /* new-instance v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$10; */
	 /* invoke-direct {v0, p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$10;-><init>(Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;)V */
	 this.mOnVideoTimeEventListener = v0;
	 /* .line 935 */
	 /* new-instance v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$11; */
	 /* invoke-direct {v0, p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$11;-><init>(Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;)V */
	 this.mOnVideoCanCloseEventListener = v0;
	 /* .line 955 */
	 /* new-instance v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$12; */
	 /* invoke-direct {v0, p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$12;-><init>(Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;)V */
	 this.mOnVideoSkipListener = v0;
	 /* .line 993 */
	 /* new-instance v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$13; */
	 /* invoke-direct {v0, p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$13;-><init>(Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;)V */
	 this.mOnVideoReplayListener = v0;
	 /* .line 1013 */
	 /* new-instance v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$14; */
	 /* invoke-direct {v0, p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$14;-><init>(Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;)V */
	 this.mInterstitialClickListener = v0;
	 /* .line 1027 */
	 /* new-instance v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$15; */
	 /* invoke-direct {v0, p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$15;-><init>(Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;)V */
	 this.mOnInterstitialSkipListener = v0;
	 /* .line 1055 */
	 /* new-instance v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$16; */
	 /* invoke-direct {v0, p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$16;-><init>(Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;)V */
	 this.mOnResetAutocloseListener = v0;
	 /* .line 1070 */
	 /* new-instance v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$17; */
	 /* invoke-direct {v0, p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$17;-><init>(Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;)V */
	 this.mOnInterstitialLoadedListener = v0;
	 /* .line 1109 */
	 /* new-instance v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$18; */
	 /* invoke-direct {v0, p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$18;-><init>(Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;)V */
	 this.mOnWebBrowserLoadedListener = v0;
	 /* .line 54 */
	 return;
} // .end method
static android.widget.ImageView access$0 ( com.mobfox.video.sdk.MobFoxRichMediaActivity p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 74 */
	 v0 = this.mSkipButton;
} // .end method
static com.mobfox.video.sdk.ResourceManager access$1 ( com.mobfox.video.sdk.MobFoxRichMediaActivity p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 62 */
	 v0 = this.mResourceManager;
} // .end method
static com.mobfox.video.sdk.RichMediaAdData access$10 ( com.mobfox.video.sdk.MobFoxRichMediaActivity p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 76 */
	 v0 = this.mAd;
} // .end method
static Integer access$11 ( com.mobfox.video.sdk.MobFoxRichMediaActivity p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 94 */
	 /* iget v0, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mEnterAnim:I */
} // .end method
static Integer access$12 ( com.mobfox.video.sdk.MobFoxRichMediaActivity p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 95 */
	 /* iget v0, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mExitAnim:I */
} // .end method
static void access$13 ( com.mobfox.video.sdk.MobFoxRichMediaActivity p0, Boolean p1 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 96 */
	 /* iput-boolean p1, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mResult:Z */
	 return;
} // .end method
static void access$14 ( com.mobfox.video.sdk.MobFoxRichMediaActivity p0, Boolean p1 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 90 */
	 /* iput-boolean p1, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mCanClose:Z */
	 return;
} // .end method
static com.mobfox.video.sdk.MobFoxInterstitialController access$15 ( com.mobfox.video.sdk.MobFoxRichMediaActivity p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 75 */
	 v0 = this.mInterstitialController;
} // .end method
static java.util.Timer access$16 ( com.mobfox.video.sdk.MobFoxRichMediaActivity p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 81 */
	 v0 = this.mInterstitialAutocloseTimer;
} // .end method
static void access$17 ( com.mobfox.video.sdk.MobFoxRichMediaActivity p0, java.util.Timer p1 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 81 */
	 this.mInterstitialAutocloseTimer = p1;
	 return;
} // .end method
static com.mobfox.video.sdk.InterstitialData access$18 ( com.mobfox.video.sdk.MobFoxRichMediaActivity p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 78 */
	 v0 = this.mInterstitialData;
} // .end method
static java.util.Timer access$19 ( com.mobfox.video.sdk.MobFoxRichMediaActivity p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 82 */
	 v0 = this.mInterstitialCanCloseTimer;
} // .end method
static com.mobfox.video.sdk.MobFoxWebFrame access$2 ( com.mobfox.video.sdk.MobFoxRichMediaActivity p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 70 */
	 v0 = this.mOverlayView;
} // .end method
static void access$20 ( com.mobfox.video.sdk.MobFoxRichMediaActivity p0, java.util.Timer p1 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 82 */
	 this.mInterstitialCanCloseTimer = p1;
	 return;
} // .end method
static java.util.Timer access$21 ( com.mobfox.video.sdk.MobFoxRichMediaActivity p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 80 */
	 v0 = this.mInterstitialLoadingTimer;
} // .end method
static void access$22 ( com.mobfox.video.sdk.MobFoxRichMediaActivity p0, java.util.Timer p1 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 80 */
	 this.mInterstitialLoadingTimer = p1;
	 return;
} // .end method
static void access$23 ( com.mobfox.video.sdk.MobFoxRichMediaActivity p0, Boolean p1 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 92 */
	 /* iput-boolean p1, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mPageLoaded:Z */
	 return;
} // .end method
static com.mobfox.video.sdk.MobFoxMediaController access$3 ( com.mobfox.video.sdk.MobFoxRichMediaActivity p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 73 */
	 v0 = this.mMediaController;
} // .end method
static java.util.Timer access$4 ( com.mobfox.video.sdk.MobFoxRichMediaActivity p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 83 */
	 v0 = this.mVideoTimeoutTimer;
} // .end method
static void access$5 ( com.mobfox.video.sdk.MobFoxRichMediaActivity p0, java.util.Timer p1 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 83 */
	 this.mVideoTimeoutTimer = p1;
	 return;
} // .end method
static android.widget.FrameLayout access$6 ( com.mobfox.video.sdk.MobFoxRichMediaActivity p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 65 */
	 v0 = this.mLoadingView;
} // .end method
static com.mobfox.video.sdk.MobFoxVideoView access$7 ( com.mobfox.video.sdk.MobFoxRichMediaActivity p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 69 */
	 v0 = this.mVideoView;
} // .end method
static com.mobfox.video.sdk.VideoData access$8 ( com.mobfox.video.sdk.MobFoxRichMediaActivity p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 77 */
	 v0 = this.mVideoData;
} // .end method
static Integer access$9 ( com.mobfox.video.sdk.MobFoxRichMediaActivity p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 93 */
	 /* iget v0, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mType:I */
} // .end method
private void initInterstitialView ( ) {
	 /* .locals 12 */
	 /* .prologue */
	 int v11 = -1; // const/4 v11, -0x1
	 int v2 = 1; // const/4 v2, 0x1
	 int v3 = 0; // const/4 v3, 0x0
	 /* .line 619 */
	 v0 = this.mAd;
	 (( com.mobfox.video.sdk.RichMediaAdData ) v0 ).getInterstitial ( ); // invoke-virtual {v0}, Lcom/mobfox/video/sdk/RichMediaAdData;->getInterstitial()Lcom/mobfox/video/sdk/InterstitialData;
	 this.mInterstitialData = v0;
	 /* .line 620 */
	 /* iput-boolean v3, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mInterstitialAutocloseReset:Z */
	 /* .line 622 */
	 v0 = this.mInterstitialData;
	 /* iget v0, v0, Lcom/mobfox/video/sdk/InterstitialData;->orientation:I */
	 (( com.mobfox.video.sdk.MobFoxRichMediaActivity ) p0 ).setRequestedOrientation ( v0 ); // invoke-virtual {p0, v0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->setRequestedOrientation(I)V
	 /* .line 623 */
	 /* new-instance v7, Landroid/widget/FrameLayout; */
	 /* invoke-direct {v7, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V */
	 /* .line 624 */
	 /* .local v7, "layout":Landroid/widget/FrameLayout; */
	 /* new-instance v0, Lcom/mobfox/video/sdk/MobFoxWebFrame; */
	 v5 = this.mResourceManager;
	 /* move-object v1, p0 */
	 /* move v4, v3 */
	 /* invoke-direct/range {v0 ..v5}, Lcom/mobfox/video/sdk/MobFoxWebFrame;-><init>(Landroid/app/Activity;ZZZLcom/mobfox/video/sdk/ResourceManager;)V */
	 this.mInterstitialView = v0;
	 /* .line 625 */
	 v0 = this.mInterstitialView;
	 (( com.mobfox.video.sdk.MobFoxWebFrame ) v0 ).setBackgroundColor ( v3 ); // invoke-virtual {v0, v3}, Lcom/mobfox/video/sdk/MobFoxWebFrame;->setBackgroundColor(I)V
	 /* .line 626 */
	 v0 = this.mInterstitialView;
	 /* .line 627 */
	 v1 = this.mOnInterstitialLoadedListener;
	 (( com.mobfox.video.sdk.MobFoxWebFrame ) v0 ).setOnPageLoadedListener ( v1 ); // invoke-virtual {v0, v1}, Lcom/mobfox/video/sdk/MobFoxWebFrame;->setOnPageLoadedListener(Lcom/mobfox/video/sdk/MobFoxWebViewClient$OnPageLoadedListener;)V
	 /* .line 628 */
	 /* new-instance v0, Lcom/mobfox/video/sdk/MobFoxInterstitialController; */
	 /* .line 629 */
	 v1 = this.mInterstitialData;
	 /* invoke-direct {v0, p0, v1}, Lcom/mobfox/video/sdk/MobFoxInterstitialController;-><init>(Landroid/content/Context;Lcom/mobfox/video/sdk/InterstitialData;)V */
	 /* .line 628 */
	 this.mInterstitialController = v0;
	 /* .line 630 */
	 v0 = this.mInterstitialController;
	 v1 = this.mInterstitialView;
	 (( com.mobfox.video.sdk.MobFoxInterstitialController ) v0 ).setBrowser ( v1 ); // invoke-virtual {v0, v1}, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->setBrowser(Lcom/mobfox/video/sdk/MobFoxInterstitialController$BrowserControl;)V
	 /* .line 631 */
	 v0 = this.mInterstitialController;
	 v1 = this.mInterstitialView;
	 (( com.mobfox.video.sdk.MobFoxInterstitialController ) v0 ).setBrowserView ( v1 ); // invoke-virtual {v0, v1}, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->setBrowserView(Landroid/view/View;)V
	 /* .line 632 */
	 v0 = this.mInterstitialController;
	 /* .line 633 */
	 v1 = this.mOnResetAutocloseListener;
	 (( com.mobfox.video.sdk.MobFoxInterstitialController ) v0 ).setOnResetAutocloseListener ( v1 ); // invoke-virtual {v0, v1}, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->setOnResetAutocloseListener(Lcom/mobfox/video/sdk/MobFoxInterstitialController$OnResetAutocloseListener;)V
	 /* .line 634 */
	 v0 = this.mInterstitialController;
	 /* new-instance v1, Landroid/widget/FrameLayout$LayoutParams; */
	 /* .line 636 */
	 /* const/16 v4, 0x11 */
	 /* invoke-direct {v1, v11, v11, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V */
	 /* .line 634 */
	 (( android.widget.FrameLayout ) v7 ).addView ( v0, v1 ); // invoke-virtual {v7, v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
	 /* .line 637 */
	 v0 = this.mInterstitialData;
	 /* iget-boolean v0, v0, Lcom/mobfox/video/sdk/InterstitialData;->showNavigationBars:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 638 */
		 v0 = this.mInterstitialController;
		 (( com.mobfox.video.sdk.MobFoxInterstitialController ) v0 ).show ( v3 ); // invoke-virtual {v0, v3}, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->show(I)V
		 /* .line 640 */
	 } // :cond_0
	 v0 = this.mInterstitialData;
	 /* iget-boolean v0, v0, Lcom/mobfox/video/sdk/InterstitialData;->showSkipButton:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_6
		 /* .line 642 */
		 /* new-instance v0, Landroid/widget/ImageView; */
		 /* invoke-direct {v0, p0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V */
		 this.mSkipButton = v0;
		 /* .line 643 */
		 v0 = this.mSkipButton;
		 (( android.widget.ImageView ) v0 ).setAdjustViewBounds ( v3 ); // invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setAdjustViewBounds(Z)V
		 /* .line 644 */
		 int v10 = 0; // const/4 v10, 0x0
		 /* .line 647 */
		 /* .local v10, "params":Landroid/widget/FrameLayout$LayoutParams; */
		 /* iget v0, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->skipButtonSizeLand:I */
		 /* int-to-float v0, v0 */
		 (( com.mobfox.video.sdk.MobFoxRichMediaActivity ) p0 ).getResources ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->getResources()Landroid/content/res/Resources;
		 /* .line 648 */
		 (( android.content.res.Resources ) v1 ).getDisplayMetrics ( ); // invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
		 /* .line 646 */
		 v0 = 		 android.util.TypedValue .applyDimension ( v2,v0,v1 );
		 /* float-to-int v6, v0 */
		 /* .line 649 */
		 /* .local v6, "buttonSize":I */
		 v0 = this.mInterstitialData;
		 /* iget v0, v0, Lcom/mobfox/video/sdk/InterstitialData;->orientation:I */
		 /* if-ne v0, v2, :cond_1 */
		 /* .line 651 */
		 /* iget v0, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->skipButtonSizePort:I */
		 /* int-to-float v0, v0 */
		 (( com.mobfox.video.sdk.MobFoxRichMediaActivity ) p0 ).getResources ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->getResources()Landroid/content/res/Resources;
		 /* .line 652 */
		 (( android.content.res.Resources ) v1 ).getDisplayMetrics ( ); // invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
		 /* .line 650 */
		 v0 = 		 android.util.TypedValue .applyDimension ( v2,v0,v1 );
		 /* float-to-int v6, v0 */
		 /* .line 654 */
	 } // :cond_1
	 /* new-instance v10, Landroid/widget/FrameLayout$LayoutParams; */
	 /* .line 656 */
} // .end local v10 # "params":Landroid/widget/FrameLayout$LayoutParams;
/* const/16 v0, 0x35 */
/* .line 654 */
/* invoke-direct {v10, v6, v6, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V */
/* .line 659 */
/* .restart local v10 # "params":Landroid/widget/FrameLayout$LayoutParams; */
v0 = this.mInterstitialData;
/* iget v0, v0, Lcom/mobfox/video/sdk/InterstitialData;->orientation:I */
/* if-ne v0, v2, :cond_3 */
/* .line 661 */
/* const/high16 v0, 0x41000000 # 8.0f */
(( com.mobfox.video.sdk.MobFoxRichMediaActivity ) p0 ).getResources ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->getResources()Landroid/content/res/Resources;
/* .line 662 */
(( android.content.res.Resources ) v1 ).getDisplayMetrics ( ); // invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* .line 660 */
v0 = android.util.TypedValue .applyDimension ( v2,v0,v1 );
/* float-to-int v9, v0 */
/* .line 663 */
/* .local v9, "margin":I */
/* iput v9, v10, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I */
/* .line 664 */
/* iput v9, v10, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I */
/* .line 675 */
} // :goto_0
v0 = this.mInterstitialData;
v0 = this.skipButtonImage;
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 676 */
v0 = this.mInterstitialData;
v0 = this.skipButtonImage;
v0 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* if-lez v0, :cond_4 */
/* .line 677 */
v0 = this.mSkipButton;
int v1 = 0; // const/4 v1, 0x0
(( android.widget.ImageView ) v0 ).setBackgroundDrawable ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 678 */
v0 = this.mResourceManager;
/* .line 679 */
v1 = this.mInterstitialData;
v1 = this.skipButtonImage;
/* .line 678 */
(( com.mobfox.video.sdk.ResourceManager ) v0 ).fetchResource ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/mobfox/video/sdk/ResourceManager;->fetchResource(Ljava/lang/String;I)V
/* .line 686 */
} // :goto_1
v0 = this.mSkipButton;
v1 = this.mOnInterstitialSkipListener;
(( android.widget.ImageView ) v0 ).setOnClickListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 687 */
v0 = this.mInterstitialData;
/* iget v0, v0, Lcom/mobfox/video/sdk/InterstitialData;->showSkipButtonAfter:I */
/* if-lez v0, :cond_5 */
/* .line 688 */
/* iput-boolean v3, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mCanClose:Z */
/* .line 689 */
v0 = this.mSkipButton;
/* const/16 v1, 0x8 */
(( android.widget.ImageView ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V
/* .line 690 */
v0 = this.mInterstitialLoadingTimer;
/* if-nez v0, :cond_2 */
/* .line 691 */
/* new-instance v8, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$InterstitialLoadingTimeoutTask; */
/* invoke-direct {v8, p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$InterstitialLoadingTimeoutTask;-><init>(Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;)V */
/* .line 692 */
/* .local v8, "loadingTimeoutTask":Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$InterstitialLoadingTimeoutTask; */
/* new-instance v0, Ljava/util/Timer; */
/* invoke-direct {v0}, Ljava/util/Timer;-><init>()V */
this.mInterstitialLoadingTimer = v0;
/* .line 693 */
v0 = this.mInterstitialLoadingTimer;
/* .line 694 */
/* const-wide/16 v1, 0x3a98 */
/* .line 693 */
(( java.util.Timer ) v0 ).schedule ( v8, v1, v2 ); // invoke-virtual {v0, v8, v1, v2}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
/* .line 701 */
} // .end local v8 # "loadingTimeoutTask":Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$InterstitialLoadingTimeoutTask;
} // :cond_2
} // :goto_2
v0 = this.mSkipButton;
(( android.widget.FrameLayout ) v7 ).addView ( v0, v10 ); // invoke-virtual {v7, v0, v10}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 705 */
} // .end local v6 # "buttonSize":I
} // .end local v9 # "margin":I
} // .end local v10 # "params":Landroid/widget/FrameLayout$LayoutParams;
} // :goto_3
v0 = this.mInterstitialView;
v1 = this.mInterstitialClickListener;
(( com.mobfox.video.sdk.MobFoxWebFrame ) v0 ).setOnClickListener ( v1 ); // invoke-virtual {v0, v1}, Lcom/mobfox/video/sdk/MobFoxWebFrame;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 706 */
v0 = this.mRootLayout;
(( android.widget.FrameLayout ) v0 ).addView ( v7 ); // invoke-virtual {v0, v7}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V
/* .line 707 */
v0 = this.mInterstitialData;
/* iget v0, v0, Lcom/mobfox/video/sdk/InterstitialData;->interstitialType:I */
/* packed-switch v0, :pswitch_data_0 */
/* .line 716 */
} // :goto_4
return;
/* .line 668 */
/* .restart local v6 # "buttonSize":I */
/* .restart local v10 # "params":Landroid/widget/FrameLayout$LayoutParams; */
} // :cond_3
/* const/high16 v0, 0x41200000 # 10.0f */
(( com.mobfox.video.sdk.MobFoxRichMediaActivity ) p0 ).getResources ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->getResources()Landroid/content/res/Resources;
/* .line 669 */
(( android.content.res.Resources ) v1 ).getDisplayMetrics ( ); // invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* .line 667 */
v0 = android.util.TypedValue .applyDimension ( v2,v0,v1 );
/* float-to-int v9, v0 */
/* .line 670 */
/* .restart local v9 # "margin":I */
/* iput v9, v10, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I */
/* .line 671 */
/* iput v9, v10, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I */
/* .line 682 */
} // :cond_4
v0 = this.mSkipButton;
v1 = this.mResourceManager;
/* .line 683 */
/* const/16 v4, -0x12 */
(( com.mobfox.video.sdk.ResourceManager ) v1 ).getResource ( v4 ); // invoke-virtual {v1, v4}, Lcom/mobfox/video/sdk/ResourceManager;->getResource(I)Landroid/graphics/drawable/Drawable;
/* .line 682 */
(( android.widget.ImageView ) v0 ).setImageDrawable ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 698 */
} // :cond_5
/* iput-boolean v2, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mCanClose:Z */
/* .line 699 */
v0 = this.mSkipButton;
(( android.widget.ImageView ) v0 ).setVisibility ( v3 ); // invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V
/* .line 703 */
} // .end local v6 # "buttonSize":I
} // .end local v9 # "margin":I
} // .end local v10 # "params":Landroid/widget/FrameLayout$LayoutParams;
} // :cond_6
/* iput-boolean v3, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mCanClose:Z */
/* .line 709 */
/* :pswitch_0 */
v0 = this.mInterstitialView;
/* .line 710 */
v1 = this.mInterstitialData;
v1 = this.interstitialMarkup;
(( com.mobfox.video.sdk.MobFoxWebFrame ) v0 ).setMarkup ( v1 ); // invoke-virtual {v0, v1}, Lcom/mobfox/video/sdk/MobFoxWebFrame;->setMarkup(Ljava/lang/String;)V
/* .line 713 */
/* :pswitch_1 */
v0 = this.mInterstitialView;
v1 = this.mInterstitialData;
v1 = this.interstitialUrl;
(( com.mobfox.video.sdk.MobFoxWebFrame ) v0 ).loadUrl ( v1 ); // invoke-virtual {v0, v1}, Lcom/mobfox/video/sdk/MobFoxWebFrame;->loadUrl(Ljava/lang/String;)V
/* .line 707 */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_1 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
private void initRootLayout ( ) {
/* .locals 1 */
/* .prologue */
/* .line 408 */
/* new-instance v0, Landroid/widget/FrameLayout; */
/* invoke-direct {v0, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V */
this.mRootLayout = v0;
/* .line 409 */
return;
} // .end method
private void initVideoView ( ) {
/* .locals 21 */
/* .prologue */
/* .line 420 */
/* move-object/from16 v0, p0 */
v2 = this.mAd;
(( com.mobfox.video.sdk.RichMediaAdData ) v2 ).getVideo ( ); // invoke-virtual {v2}, Lcom/mobfox/video/sdk/RichMediaAdData;->getVideo()Lcom/mobfox/video/sdk/VideoData;
/* move-object/from16 v0, p0 */
this.mVideoData = v2;
/* .line 422 */
/* move-object/from16 v0, p0 */
v2 = this.mVideoData;
/* iget v2, v2, Lcom/mobfox/video/sdk/VideoData;->orientation:I */
/* move-object/from16 v0, p0 */
(( com.mobfox.video.sdk.MobFoxRichMediaActivity ) v0 ).setRequestedOrientation ( v2 ); // invoke-virtual {v0, v2}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->setRequestedOrientation(I)V
/* .line 423 */
/* move-object/from16 v0, p0 */
v2 = this.mVideoData;
/* iget v2, v2, Lcom/mobfox/video/sdk/VideoData;->orientation:I */
/* if-nez v2, :cond_f */
/* .line 424 */
/* move-object/from16 v0, p0 */
/* iget v2, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mWindowWidth:I */
/* move-object/from16 v0, p0 */
/* iget v3, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mWindowHeight:I */
/* if-ge v2, v3, :cond_0 */
/* .line 425 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mWindowWidth:I */
/* move/from16 v20, v0 */
/* .line 426 */
/* .local v20, "size":I */
/* move-object/from16 v0, p0 */
/* iget v2, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mWindowHeight:I */
/* move-object/from16 v0, p0 */
/* iput v2, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mWindowWidth:I */
/* .line 427 */
/* move/from16 v0, v20 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mWindowHeight:I */
/* .line 436 */
} // .end local v20 # "size":I
} // :cond_0
} // :goto_0
/* move-object/from16 v0, p0 */
v2 = this.mVideoData;
/* iget v2, v2, Lcom/mobfox/video/sdk/VideoData;->width:I */
/* move-object/from16 v0, p0 */
/* iput v2, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mVideoWidth:I */
/* .line 437 */
/* move-object/from16 v0, p0 */
v2 = this.mVideoData;
/* iget v2, v2, Lcom/mobfox/video/sdk/VideoData;->height:I */
/* move-object/from16 v0, p0 */
/* iput v2, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mVideoHeight:I */
/* .line 438 */
/* move-object/from16 v0, p0 */
/* iget v2, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mVideoWidth:I */
/* if-gtz v2, :cond_10 */
/* .line 439 */
/* move-object/from16 v0, p0 */
/* iget v2, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mWindowWidth:I */
/* move-object/from16 v0, p0 */
/* iput v2, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mVideoWidth:I */
/* .line 440 */
/* move-object/from16 v0, p0 */
/* iget v2, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mWindowHeight:I */
/* move-object/from16 v0, p0 */
/* iput v2, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mVideoHeight:I */
/* .line 455 */
} // :cond_1
} // :goto_1
final String v2 = "MOBFOX"; // const-string v2, "MOBFOX"
int v3 = 3; // const/4 v3, 0x3
v2 = android.util.Log .isLoggable ( v2,v3 );
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 456 */
final String v2 = "MOBFOX"; // const-string v2, "MOBFOX"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "Video size ("; // const-string v4, "Video size ("
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* move-object/from16 v0, p0 */
/* iget v4, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mVideoWidth:I */
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v4 = ","; // const-string v4, ","
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* move-object/from16 v0, p0 */
/* iget v4, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mVideoHeight:I */
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v4 = ")"; // const-string v4, ")"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v2,v3 );
/* .line 459 */
} // :cond_2
/* new-instance v2, Landroid/widget/FrameLayout; */
/* move-object/from16 v0, p0 */
/* invoke-direct {v2, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V */
/* move-object/from16 v0, p0 */
this.mVideoLayout = v2;
/* .line 460 */
/* new-instance v2, Lcom/mobfox/video/sdk/MobFoxVideoView; */
/* move-object/from16 v0, p0 */
/* iget v3, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mVideoWidth:I */
/* move-object/from16 v0, p0 */
/* iget v4, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mVideoHeight:I */
/* .line 461 */
/* move-object/from16 v0, p0 */
v5 = this.mVideoData;
/* iget v5, v5, Lcom/mobfox/video/sdk/VideoData;->display:I */
/* move-object/from16 v0, p0 */
/* invoke-direct {v2, v0, v3, v4, v5}, Lcom/mobfox/video/sdk/MobFoxVideoView;-><init>(Landroid/content/Context;III)V */
/* .line 460 */
/* move-object/from16 v0, p0 */
this.mVideoView = v2;
/* .line 462 */
/* move-object/from16 v0, p0 */
v2 = this.mVideoLayout;
/* move-object/from16 v0, p0 */
v3 = this.mVideoView;
/* new-instance v4, Landroid/widget/FrameLayout$LayoutParams; */
/* .line 463 */
int v5 = -1; // const/4 v5, -0x1
/* .line 464 */
int v6 = -1; // const/4 v6, -0x1
/* const/16 v7, 0x11 */
/* invoke-direct {v4, v5, v6, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V */
/* .line 462 */
(( android.widget.FrameLayout ) v2 ).addView ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 465 */
/* move-object/from16 v0, p0 */
v2 = this.mVideoData;
/* iget-boolean v2, v2, Lcom/mobfox/video/sdk/VideoData;->showHtmlOverlay:Z */
if ( v2 != null) { // if-eqz v2, :cond_5
/* .line 466 */
/* new-instance v2, Lcom/mobfox/video/sdk/MobFoxWebFrame; */
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
/* move-object/from16 v0, p0 */
v7 = this.mResourceManager;
/* move-object/from16 v3, p0 */
/* invoke-direct/range {v2 ..v7}, Lcom/mobfox/video/sdk/MobFoxWebFrame;-><init>(Landroid/app/Activity;ZZZLcom/mobfox/video/sdk/ResourceManager;)V */
/* move-object/from16 v0, p0 */
this.mOverlayView = v2;
/* .line 467 */
/* move-object/from16 v0, p0 */
v2 = this.mOverlayView;
int v3 = 0; // const/4 v3, 0x0
(( com.mobfox.video.sdk.MobFoxWebFrame ) v2 ).setEnableZoom ( v3 ); // invoke-virtual {v2, v3}, Lcom/mobfox/video/sdk/MobFoxWebFrame;->setEnableZoom(Z)V
/* .line 468 */
/* move-object/from16 v0, p0 */
v2 = this.mOverlayView;
/* move-object/from16 v0, p0 */
v3 = this.mOverlayClickListener;
(( com.mobfox.video.sdk.MobFoxWebFrame ) v2 ).setOnClickListener ( v3 ); // invoke-virtual {v2, v3}, Lcom/mobfox/video/sdk/MobFoxWebFrame;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 469 */
/* move-object/from16 v0, p0 */
v2 = this.mOverlayView;
int v3 = 0; // const/4 v3, 0x0
(( com.mobfox.video.sdk.MobFoxWebFrame ) v2 ).setBackgroundColor ( v3 ); // invoke-virtual {v2, v3}, Lcom/mobfox/video/sdk/MobFoxWebFrame;->setBackgroundColor(I)V
/* .line 470 */
/* move-object/from16 v0, p0 */
v2 = this.mVideoData;
/* iget v2, v2, Lcom/mobfox/video/sdk/VideoData;->showHtmlOverlayAfter:I */
/* if-lez v2, :cond_3 */
/* .line 471 */
/* move-object/from16 v0, p0 */
v2 = this.mOverlayView;
/* const/16 v3, 0x8 */
(( com.mobfox.video.sdk.MobFoxWebFrame ) v2 ).setVisibility ( v3 ); // invoke-virtual {v2, v3}, Lcom/mobfox/video/sdk/MobFoxWebFrame;->setVisibility(I)V
/* .line 472 */
/* move-object/from16 v0, p0 */
v2 = this.mVideoView;
/* .line 473 */
/* move-object/from16 v0, p0 */
v3 = this.mVideoData;
/* iget v3, v3, Lcom/mobfox/video/sdk/VideoData;->showHtmlOverlayAfter:I */
/* move-object/from16 v0, p0 */
v4 = this.mOverlayShowListener;
/* .line 472 */
(( com.mobfox.video.sdk.MobFoxVideoView ) v2 ).setOnTimeEventListener ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Lcom/mobfox/video/sdk/MobFoxVideoView;->setOnTimeEventListener(ILcom/mobfox/video/sdk/MobFoxVideoView$OnTimeEventListener;)V
/* .line 475 */
} // :cond_3
/* move-object/from16 v0, p0 */
v2 = this.mVideoData;
/* iget v2, v2, Lcom/mobfox/video/sdk/VideoData;->htmlOverlayType:I */
/* if-nez v2, :cond_12 */
/* .line 476 */
/* move-object/from16 v0, p0 */
v2 = this.mOverlayView;
/* move-object/from16 v0, p0 */
v3 = this.mVideoData;
v3 = this.htmlOverlayUrl;
(( com.mobfox.video.sdk.MobFoxWebFrame ) v2 ).loadUrl ( v3 ); // invoke-virtual {v2, v3}, Lcom/mobfox/video/sdk/MobFoxWebFrame;->loadUrl(Ljava/lang/String;)V
/* .line 480 */
} // :goto_2
/* new-instance v17, Landroid/widget/FrameLayout$LayoutParams; */
/* .line 481 */
int v2 = -1; // const/4 v2, -0x1
/* .line 482 */
int v3 = -1; // const/4 v3, -0x1
/* .line 480 */
/* move-object/from16 v0, v17 */
/* invoke-direct {v0, v2, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V */
/* .line 483 */
/* .local v17, "overlayParams":Landroid/widget/FrameLayout$LayoutParams; */
/* move-object/from16 v0, p0 */
v2 = this.mVideoData;
/* iget-boolean v2, v2, Lcom/mobfox/video/sdk/VideoData;->showBottomNavigationBar:Z */
if ( v2 != null) { // if-eqz v2, :cond_13
/* move-object/from16 v0, p0 */
v2 = this.mVideoData;
/* iget-boolean v2, v2, Lcom/mobfox/video/sdk/VideoData;->showTopNavigationBar:Z */
if ( v2 != null) { // if-eqz v2, :cond_13
/* .line 484 */
/* move-object/from16 v0, p0 */
/* iget v2, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mWindowWidth:I */
/* int-to-double v2, v2 */
/* const-wide v4, 0x3fbe666666666666L # 0.11875 */
/* mul-double/2addr v2, v4 */
/* double-to-int v2, v2 */
/* move-object/from16 v0, v17 */
/* iput v2, v0, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I */
/* .line 485 */
/* move-object/from16 v0, p0 */
/* iget v2, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mWindowWidth:I */
/* int-to-double v2, v2 */
/* const-wide v4, 0x3fbe666666666666L # 0.11875 */
/* mul-double/2addr v2, v4 */
/* double-to-int v2, v2 */
/* move-object/from16 v0, v17 */
/* iput v2, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I */
/* .line 486 */
/* const/16 v2, 0x11 */
/* move-object/from16 v0, v17 */
/* iput v2, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I */
/* .line 499 */
} // :cond_4
} // :goto_3
/* move-object/from16 v0, p0 */
v2 = this.mVideoLayout;
/* move-object/from16 v0, p0 */
v3 = this.mOverlayView;
/* move-object/from16 v0, v17 */
(( android.widget.FrameLayout ) v2 ).addView ( v3, v0 ); // invoke-virtual {v2, v3, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 501 */
} // .end local v17 # "overlayParams":Landroid/widget/FrameLayout$LayoutParams;
} // :cond_5
/* new-instance v2, Lcom/mobfox/video/sdk/MobFoxMediaController; */
/* move-object/from16 v0, p0 */
v3 = this.mVideoData;
/* move-object/from16 v0, p0 */
/* invoke-direct {v2, v0, v3}, Lcom/mobfox/video/sdk/MobFoxMediaController;-><init>(Landroid/content/Context;Lcom/mobfox/video/sdk/VideoData;)V */
/* move-object/from16 v0, p0 */
this.mMediaController = v2;
/* .line 502 */
/* move-object/from16 v0, p0 */
v2 = this.mVideoView;
/* move-object/from16 v0, p0 */
v3 = this.mMediaController;
(( com.mobfox.video.sdk.MobFoxVideoView ) v2 ).setMediaController ( v3 ); // invoke-virtual {v2, v3}, Lcom/mobfox/video/sdk/MobFoxVideoView;->setMediaController(Lcom/mobfox/video/sdk/MobFoxMediaController;)V
/* .line 503 */
/* move-object/from16 v0, p0 */
v2 = this.mVideoData;
/* iget-boolean v2, v2, Lcom/mobfox/video/sdk/VideoData;->showNavigationBars:Z */
if ( v2 != null) { // if-eqz v2, :cond_6
/* .line 504 */
/* move-object/from16 v0, p0 */
v2 = this.mMediaController;
int v3 = 0; // const/4 v3, 0x0
(( com.mobfox.video.sdk.MobFoxMediaController ) v2 ).show ( v3 ); // invoke-virtual {v2, v3}, Lcom/mobfox/video/sdk/MobFoxMediaController;->show(I)V
/* .line 506 */
} // :cond_6
/* move-object/from16 v0, p0 */
v2 = this.mVideoData;
v2 = this.pauseEvents;
v2 = (( java.util.Vector ) v2 ).isEmpty ( ); // invoke-virtual {v2}, Ljava/util/Vector;->isEmpty()Z
/* if-nez v2, :cond_7 */
/* .line 507 */
/* move-object/from16 v0, p0 */
v2 = this.mMediaController;
/* move-object/from16 v0, p0 */
v3 = this.mOnVideoPauseListener;
(( com.mobfox.video.sdk.MobFoxMediaController ) v2 ).setOnPauseListener ( v3 ); // invoke-virtual {v2, v3}, Lcom/mobfox/video/sdk/MobFoxMediaController;->setOnPauseListener(Lcom/mobfox/video/sdk/MobFoxMediaController$OnPauseListener;)V
/* .line 509 */
} // :cond_7
/* move-object/from16 v0, p0 */
v2 = this.mVideoData;
v2 = this.unpauseEvents;
v2 = (( java.util.Vector ) v2 ).isEmpty ( ); // invoke-virtual {v2}, Ljava/util/Vector;->isEmpty()Z
/* if-nez v2, :cond_8 */
/* .line 510 */
/* move-object/from16 v0, p0 */
v2 = this.mMediaController;
/* move-object/from16 v0, p0 */
v3 = this.mOnVideoUnpauseListener;
(( com.mobfox.video.sdk.MobFoxMediaController ) v2 ).setOnUnpauseListener ( v3 ); // invoke-virtual {v2, v3}, Lcom/mobfox/video/sdk/MobFoxMediaController;->setOnUnpauseListener(Lcom/mobfox/video/sdk/MobFoxMediaController$OnUnpauseListener;)V
/* .line 512 */
} // :cond_8
/* move-object/from16 v0, p0 */
v2 = this.mVideoData;
v2 = this.replayEvents;
v2 = (( java.util.Vector ) v2 ).isEmpty ( ); // invoke-virtual {v2}, Ljava/util/Vector;->isEmpty()Z
/* if-nez v2, :cond_9 */
/* .line 513 */
/* move-object/from16 v0, p0 */
v2 = this.mMediaController;
/* move-object/from16 v0, p0 */
v3 = this.mOnVideoReplayListener;
(( com.mobfox.video.sdk.MobFoxMediaController ) v2 ).setOnReplayListener ( v3 ); // invoke-virtual {v2, v3}, Lcom/mobfox/video/sdk/MobFoxMediaController;->setOnReplayListener(Lcom/mobfox/video/sdk/MobFoxMediaController$OnReplayListener;)V
/* .line 515 */
} // :cond_9
/* move-object/from16 v0, p0 */
v2 = this.mVideoLayout;
/* move-object/from16 v0, p0 */
v3 = this.mMediaController;
/* new-instance v4, Landroid/widget/FrameLayout$LayoutParams; */
/* .line 516 */
int v5 = -1; // const/4 v5, -0x1
/* .line 517 */
int v6 = -1; // const/4 v6, -0x1
int v7 = 7; // const/4 v7, 0x7
/* invoke-direct {v4, v5, v6, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V */
/* .line 515 */
(( android.widget.FrameLayout ) v2 ).addView ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 518 */
/* move-object/from16 v0, p0 */
v2 = this.mVideoData;
/* iget-boolean v2, v2, Lcom/mobfox/video/sdk/VideoData;->showSkipButton:Z */
if ( v2 != null) { // if-eqz v2, :cond_18
/* .line 521 */
/* new-instance v2, Landroid/widget/ImageView; */
/* move-object/from16 v0, p0 */
/* invoke-direct {v2, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V */
/* move-object/from16 v0, p0 */
this.mSkipButton = v2;
/* .line 522 */
/* move-object/from16 v0, p0 */
v2 = this.mSkipButton;
int v3 = 0; // const/4 v3, 0x0
(( android.widget.ImageView ) v2 ).setAdjustViewBounds ( v3 ); // invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setAdjustViewBounds(Z)V
/* .line 523 */
/* const/16 v18, 0x0 */
/* .line 526 */
/* .local v18, "params":Landroid/widget/FrameLayout$LayoutParams; */
int v2 = 1; // const/4 v2, 0x1
/* move-object/from16 v0, p0 */
/* iget v3, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->skipButtonSizeLand:I */
/* int-to-float v3, v3 */
/* invoke-virtual/range {p0 ..p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->getResources()Landroid/content/res/Resources; */
/* .line 527 */
(( android.content.res.Resources ) v4 ).getDisplayMetrics ( ); // invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* .line 525 */
v2 = android.util.TypedValue .applyDimension ( v2,v3,v4 );
/* float-to-int v9, v2 */
/* .line 528 */
/* .local v9, "buttonSize":I */
/* move-object/from16 v0, p0 */
v2 = this.mVideoData;
/* iget v2, v2, Lcom/mobfox/video/sdk/VideoData;->orientation:I */
int v3 = 1; // const/4 v3, 0x1
/* if-ne v2, v3, :cond_a */
/* .line 530 */
int v2 = 1; // const/4 v2, 0x1
/* move-object/from16 v0, p0 */
/* iget v3, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->skipButtonSizePort:I */
/* int-to-float v3, v3 */
/* invoke-virtual/range {p0 ..p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->getResources()Landroid/content/res/Resources; */
/* .line 531 */
(( android.content.res.Resources ) v4 ).getDisplayMetrics ( ); // invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* .line 529 */
v2 = android.util.TypedValue .applyDimension ( v2,v3,v4 );
/* float-to-int v9, v2 */
/* .line 533 */
} // :cond_a
/* new-instance v18, Landroid/widget/FrameLayout$LayoutParams; */
/* .line 535 */
} // .end local v18 # "params":Landroid/widget/FrameLayout$LayoutParams;
/* const/16 v2, 0x35 */
/* .line 533 */
/* move-object/from16 v0, v18 */
/* invoke-direct {v0, v9, v9, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V */
/* .line 537 */
/* .restart local v18 # "params":Landroid/widget/FrameLayout$LayoutParams; */
/* move-object/from16 v0, p0 */
v2 = this.mVideoData;
/* iget v2, v2, Lcom/mobfox/video/sdk/VideoData;->orientation:I */
int v3 = 1; // const/4 v3, 0x1
/* if-ne v2, v3, :cond_15 */
/* .line 539 */
int v2 = 1; // const/4 v2, 0x1
/* const/high16 v3, 0x41000000 # 8.0f */
/* invoke-virtual/range {p0 ..p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->getResources()Landroid/content/res/Resources; */
/* .line 540 */
(( android.content.res.Resources ) v4 ).getDisplayMetrics ( ); // invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* .line 538 */
v2 = android.util.TypedValue .applyDimension ( v2,v3,v4 );
/* float-to-int v0, v2 */
/* move/from16 v16, v0 */
/* .line 541 */
/* .local v16, "margin":I */
/* move/from16 v0, v16 */
/* move-object/from16 v1, v18 */
/* iput v0, v1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I */
/* .line 542 */
/* move/from16 v0, v16 */
/* move-object/from16 v1, v18 */
/* iput v0, v1, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I */
/* .line 553 */
} // :goto_4
/* move-object/from16 v0, p0 */
v2 = this.mVideoData;
v2 = this.skipButtonImage;
if ( v2 != null) { // if-eqz v2, :cond_16
/* .line 554 */
/* move-object/from16 v0, p0 */
v2 = this.mVideoData;
v2 = this.skipButtonImage;
v2 = (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
/* if-lez v2, :cond_16 */
/* .line 555 */
/* move-object/from16 v0, p0 */
v2 = this.mResourceManager;
/* move-object/from16 v0, p0 */
v3 = this.mVideoData;
v3 = this.skipButtonImage;
/* .line 556 */
int v4 = 1; // const/4 v4, 0x1
/* .line 555 */
(( com.mobfox.video.sdk.ResourceManager ) v2 ).fetchResource ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Lcom/mobfox/video/sdk/ResourceManager;->fetchResource(Ljava/lang/String;I)V
/* .line 561 */
} // :goto_5
/* move-object/from16 v0, p0 */
v2 = this.mSkipButton;
/* move-object/from16 v0, p0 */
v3 = this.mOnVideoSkipListener;
(( android.widget.ImageView ) v2 ).setOnClickListener ( v3 ); // invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 562 */
/* move-object/from16 v0, p0 */
v2 = this.mVideoData;
/* iget v2, v2, Lcom/mobfox/video/sdk/VideoData;->showSkipButtonAfter:I */
/* if-lez v2, :cond_17 */
/* .line 563 */
int v2 = 0; // const/4 v2, 0x0
/* move-object/from16 v0, p0 */
/* iput-boolean v2, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mCanClose:Z */
/* .line 564 */
/* move-object/from16 v0, p0 */
v2 = this.mSkipButton;
/* const/16 v3, 0x8 */
(( android.widget.ImageView ) v2 ).setVisibility ( v3 ); // invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setVisibility(I)V
/* .line 569 */
} // :goto_6
/* move-object/from16 v0, p0 */
v2 = this.mVideoLayout;
/* move-object/from16 v0, p0 */
v3 = this.mSkipButton;
/* move-object/from16 v0, v18 */
(( android.widget.FrameLayout ) v2 ).addView ( v3, v0 ); // invoke-virtual {v2, v3, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 573 */
} // .end local v9 # "buttonSize":I
} // .end local v16 # "margin":I
} // .end local v18 # "params":Landroid/widget/FrameLayout$LayoutParams;
} // :goto_7
/* move-object/from16 v0, p0 */
v2 = this.mVideoData;
/* iget v2, v2, Lcom/mobfox/video/sdk/VideoData;->showSkipButtonAfter:I */
/* if-lez v2, :cond_b */
/* .line 574 */
/* move-object/from16 v0, p0 */
v2 = this.mVideoView;
/* move-object/from16 v0, p0 */
v3 = this.mVideoData;
/* iget v3, v3, Lcom/mobfox/video/sdk/VideoData;->showSkipButtonAfter:I */
/* .line 575 */
/* move-object/from16 v0, p0 */
v4 = this.mOnVideoCanCloseEventListener;
/* .line 574 */
(( com.mobfox.video.sdk.MobFoxVideoView ) v2 ).setOnTimeEventListener ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Lcom/mobfox/video/sdk/MobFoxVideoView;->setOnTimeEventListener(ILcom/mobfox/video/sdk/MobFoxVideoView$OnTimeEventListener;)V
/* .line 577 */
} // :cond_b
/* new-instance v18, Landroid/widget/FrameLayout$LayoutParams; */
/* .line 578 */
int v2 = -2; // const/4 v2, -0x2
/* .line 579 */
int v3 = -2; // const/4 v3, -0x2
/* const/16 v4, 0x11 */
/* .line 577 */
/* move-object/from16 v0, v18 */
/* invoke-direct {v0, v2, v3, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V */
/* .line 580 */
/* .restart local v18 # "params":Landroid/widget/FrameLayout$LayoutParams; */
/* new-instance v2, Landroid/widget/FrameLayout; */
/* move-object/from16 v0, p0 */
/* invoke-direct {v2, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V */
/* move-object/from16 v0, p0 */
this.mLoadingView = v2;
/* .line 581 */
/* new-instance v14, Landroid/widget/TextView; */
/* move-object/from16 v0, p0 */
/* invoke-direct {v14, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V */
/* .line 582 */
/* .local v14, "loadingText":Landroid/widget/TextView; */
v2 = com.mobfox.video.sdk.Const.LOADING;
(( android.widget.TextView ) v14 ).setText ( v2 ); // invoke-virtual {v14, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 583 */
/* move-object/from16 v0, p0 */
v2 = this.mLoadingView;
/* move-object/from16 v0, v18 */
(( android.widget.FrameLayout ) v2 ).addView ( v14, v0 ); // invoke-virtual {v2, v14, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 584 */
/* move-object/from16 v0, p0 */
v2 = this.mVideoLayout;
/* move-object/from16 v0, p0 */
v3 = this.mLoadingView;
/* new-instance v4, Landroid/widget/FrameLayout$LayoutParams; */
/* .line 585 */
int v5 = -1; // const/4 v5, -0x1
/* .line 586 */
int v6 = -1; // const/4 v6, -0x1
/* const/16 v7, 0x11 */
/* invoke-direct {v4, v5, v6, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V */
/* .line 584 */
(( android.widget.FrameLayout ) v2 ).addView ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 589 */
/* move-object/from16 v0, p0 */
v2 = this.mVideoView;
/* move-object/from16 v0, p0 */
v3 = this.mOnVideoPreparedListener;
(( com.mobfox.video.sdk.MobFoxVideoView ) v2 ).setOnPreparedListener ( v3 ); // invoke-virtual {v2, v3}, Lcom/mobfox/video/sdk/MobFoxVideoView;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V
/* .line 590 */
/* move-object/from16 v0, p0 */
v2 = this.mVideoView;
/* move-object/from16 v0, p0 */
v3 = this.mOnVideoCompletionListener;
(( com.mobfox.video.sdk.MobFoxVideoView ) v2 ).setOnCompletionListener ( v3 ); // invoke-virtual {v2, v3}, Lcom/mobfox/video/sdk/MobFoxVideoView;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V
/* .line 591 */
/* move-object/from16 v0, p0 */
v2 = this.mVideoView;
/* move-object/from16 v0, p0 */
v3 = this.mOnVideoErrorListener;
(( com.mobfox.video.sdk.MobFoxVideoView ) v2 ).setOnErrorListener ( v3 ); // invoke-virtual {v2, v3}, Lcom/mobfox/video/sdk/MobFoxVideoView;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V
/* .line 592 */
/* move-object/from16 v0, p0 */
v2 = this.mVideoData;
v2 = this.startEvents;
v2 = (( java.util.Vector ) v2 ).isEmpty ( ); // invoke-virtual {v2}, Ljava/util/Vector;->isEmpty()Z
/* if-nez v2, :cond_c */
/* .line 593 */
/* move-object/from16 v0, p0 */
v2 = this.mVideoView;
/* move-object/from16 v0, p0 */
v3 = this.mOnVideoStartListener;
(( com.mobfox.video.sdk.MobFoxVideoView ) v2 ).setOnStartListener ( v3 ); // invoke-virtual {v2, v3}, Lcom/mobfox/video/sdk/MobFoxVideoView;->setOnStartListener(Lcom/mobfox/video/sdk/MobFoxVideoView$OnStartListener;)V
/* .line 595 */
} // :cond_c
/* move-object/from16 v0, p0 */
v2 = this.mVideoData;
v2 = this.timeTrackingEvents;
v2 = (( java.util.HashMap ) v2 ).isEmpty ( ); // invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z
/* if-nez v2, :cond_d */
/* .line 596 */
/* move-object/from16 v0, p0 */
v2 = this.mVideoData;
v2 = this.timeTrackingEvents;
(( java.util.HashMap ) v2 ).keySet ( ); // invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
/* .line 597 */
/* .local v13, "keys":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/Integer;>;" */
/* .local v11, "it":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/Integer;>;" */
v2 = } // :goto_8
/* if-nez v2, :cond_19 */
/* .line 603 */
} // .end local v11 # "it":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/Integer;>;"
} // .end local v13 # "keys":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/Integer;>;"
} // :cond_d
int v2 = 0; // const/4 v2, 0x0
/* move-object/from16 v0, p0 */
/* iput v2, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mVideoLastPosition:I */
/* .line 604 */
/* move-object/from16 v0, p0 */
v2 = this.mVideoData;
v0 = this.videoUrl;
/* move-object/from16 v19, v0 */
/* .line 605 */
/* .local v19, "path":Ljava/lang/String; */
/* move-object/from16 v0, p0 */
v2 = this.mAd;
com.mobfox.video.sdk.MobFoxAdManager .getMobFoxAdManager ( v2 );
/* .line 606 */
/* .local v8, "adManager":Lcom/mobfox/video/sdk/MobFoxAdManager; */
if ( v8 != null) { // if-eqz v8, :cond_e
/* .line 607 */
com.mobfox.video.sdk.CacheManager .getInstance ( v8 );
/* .line 608 */
/* .local v10, "cache":Lcom/mobfox/video/sdk/CacheManager; */
if ( v10 != null) { // if-eqz v10, :cond_e
/* .line 609 */
/* move-object/from16 v0, p0 */
v2 = this.mVideoData;
v2 = this.videoUrl;
(( com.mobfox.video.sdk.CacheManager ) v10 ).getPath ( v2 ); // invoke-virtual {v10, v2}, Lcom/mobfox/video/sdk/CacheManager;->getPath(Ljava/lang/String;)Ljava/lang/String;
/* .line 610 */
/* if-nez v19, :cond_e */
/* .line 611 */
/* move-object/from16 v0, p0 */
v2 = this.mVideoData;
v0 = this.videoUrl;
/* move-object/from16 v19, v0 */
/* .line 615 */
} // .end local v10 # "cache":Lcom/mobfox/video/sdk/CacheManager;
} // :cond_e
/* move-object/from16 v0, p0 */
v2 = this.mVideoView;
/* move-object/from16 v0, v19 */
(( com.mobfox.video.sdk.MobFoxVideoView ) v2 ).setVideoPath ( v0 ); // invoke-virtual {v2, v0}, Lcom/mobfox/video/sdk/MobFoxVideoView;->setVideoPath(Ljava/lang/String;)V
/* .line 616 */
return;
/* .line 430 */
} // .end local v8 # "adManager":Lcom/mobfox/video/sdk/MobFoxAdManager;
} // .end local v14 # "loadingText":Landroid/widget/TextView;
} // .end local v18 # "params":Landroid/widget/FrameLayout$LayoutParams;
} // .end local v19 # "path":Ljava/lang/String;
} // :cond_f
/* move-object/from16 v0, p0 */
/* iget v2, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mWindowHeight:I */
/* move-object/from16 v0, p0 */
/* iget v3, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mWindowWidth:I */
/* if-ge v2, v3, :cond_0 */
/* .line 431 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mWindowHeight:I */
/* move/from16 v20, v0 */
/* .line 432 */
/* .restart local v20 # "size":I */
/* move-object/from16 v0, p0 */
/* iget v2, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mWindowWidth:I */
/* move-object/from16 v0, p0 */
/* iput v2, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mWindowHeight:I */
/* .line 433 */
/* move/from16 v0, v20 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mWindowWidth:I */
/* goto/16 :goto_0 */
/* .line 442 */
} // .end local v20 # "size":I
} // :cond_10
/* invoke-virtual/range {p0 ..p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->getResources()Landroid/content/res/Resources; */
(( android.content.res.Resources ) v2 ).getDisplayMetrics ( ); // invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* .line 444 */
/* .local v15, "m":Landroid/util/DisplayMetrics; */
int v2 = 1; // const/4 v2, 0x1
/* move-object/from16 v0, p0 */
/* iget v3, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mVideoWidth:I */
/* int-to-float v3, v3 */
/* .line 443 */
v2 = android.util.TypedValue .applyDimension ( v2,v3,v15 );
/* float-to-int v2, v2 */
/* move-object/from16 v0, p0 */
/* iput v2, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mVideoWidth:I */
/* .line 446 */
int v2 = 1; // const/4 v2, 0x1
/* move-object/from16 v0, p0 */
/* iget v3, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mVideoHeight:I */
/* int-to-float v3, v3 */
/* .line 445 */
v2 = android.util.TypedValue .applyDimension ( v2,v3,v15 );
/* float-to-int v2, v2 */
/* move-object/from16 v0, p0 */
/* iput v2, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mVideoHeight:I */
/* .line 448 */
/* move-object/from16 v0, p0 */
/* iget v2, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mVideoWidth:I */
/* move-object/from16 v0, p0 */
/* iget v3, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mWindowWidth:I */
/* if-le v2, v3, :cond_11 */
/* .line 449 */
/* move-object/from16 v0, p0 */
/* iget v2, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mWindowWidth:I */
/* move-object/from16 v0, p0 */
/* iput v2, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mVideoWidth:I */
/* .line 451 */
} // :cond_11
/* move-object/from16 v0, p0 */
/* iget v2, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mVideoHeight:I */
/* move-object/from16 v0, p0 */
/* iget v3, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mWindowHeight:I */
/* if-le v2, v3, :cond_1 */
/* .line 452 */
/* move-object/from16 v0, p0 */
/* iget v2, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mWindowHeight:I */
/* move-object/from16 v0, p0 */
/* iput v2, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mVideoHeight:I */
/* goto/16 :goto_1 */
/* .line 478 */
} // .end local v15 # "m":Landroid/util/DisplayMetrics;
} // :cond_12
/* move-object/from16 v0, p0 */
v2 = this.mOverlayView;
/* move-object/from16 v0, p0 */
v3 = this.mVideoData;
v3 = this.htmlOverlayMarkup;
(( com.mobfox.video.sdk.MobFoxWebFrame ) v2 ).setMarkup ( v3 ); // invoke-virtual {v2, v3}, Lcom/mobfox/video/sdk/MobFoxWebFrame;->setMarkup(Ljava/lang/String;)V
/* goto/16 :goto_2 */
/* .line 488 */
/* .restart local v17 # "overlayParams":Landroid/widget/FrameLayout$LayoutParams; */
} // :cond_13
/* move-object/from16 v0, p0 */
v2 = this.mVideoData;
/* iget-boolean v2, v2, Lcom/mobfox/video/sdk/VideoData;->showBottomNavigationBar:Z */
if ( v2 != null) { // if-eqz v2, :cond_14
/* move-object/from16 v0, p0 */
v2 = this.mVideoData;
/* iget-boolean v2, v2, Lcom/mobfox/video/sdk/VideoData;->showTopNavigationBar:Z */
/* if-nez v2, :cond_14 */
/* .line 489 */
/* move-object/from16 v0, p0 */
/* iget v2, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mWindowWidth:I */
/* int-to-double v2, v2 */
/* const-wide v4, 0x3fbe666666666666L # 0.11875 */
/* mul-double/2addr v2, v4 */
/* double-to-int v2, v2 */
/* move-object/from16 v0, v17 */
/* iput v2, v0, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I */
/* .line 490 */
/* const/16 v2, 0x30 */
/* move-object/from16 v0, v17 */
/* iput v2, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I */
/* goto/16 :goto_3 */
/* .line 494 */
} // :cond_14
/* move-object/from16 v0, p0 */
v2 = this.mVideoData;
/* iget-boolean v2, v2, Lcom/mobfox/video/sdk/VideoData;->showTopNavigationBar:Z */
if ( v2 != null) { // if-eqz v2, :cond_4
/* move-object/from16 v0, p0 */
v2 = this.mVideoData;
/* iget-boolean v2, v2, Lcom/mobfox/video/sdk/VideoData;->showBottomNavigationBar:Z */
/* if-nez v2, :cond_4 */
/* .line 496 */
/* move-object/from16 v0, p0 */
/* iget v2, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mWindowWidth:I */
/* int-to-double v2, v2 */
/* const-wide v4, 0x3fbe666666666666L # 0.11875 */
/* mul-double/2addr v2, v4 */
/* double-to-int v2, v2 */
/* move-object/from16 v0, v17 */
/* iput v2, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I */
/* .line 497 */
/* const/16 v2, 0x50 */
/* move-object/from16 v0, v17 */
/* iput v2, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I */
/* goto/16 :goto_3 */
/* .line 546 */
} // .end local v17 # "overlayParams":Landroid/widget/FrameLayout$LayoutParams;
/* .restart local v9 # "buttonSize":I */
/* .restart local v18 # "params":Landroid/widget/FrameLayout$LayoutParams; */
} // :cond_15
int v2 = 1; // const/4 v2, 0x1
/* const/high16 v3, 0x41200000 # 10.0f */
/* invoke-virtual/range {p0 ..p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->getResources()Landroid/content/res/Resources; */
/* .line 547 */
(( android.content.res.Resources ) v4 ).getDisplayMetrics ( ); // invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* .line 545 */
v2 = android.util.TypedValue .applyDimension ( v2,v3,v4 );
/* float-to-int v0, v2 */
/* move/from16 v16, v0 */
/* .line 548 */
/* .restart local v16 # "margin":I */
/* move/from16 v0, v16 */
/* move-object/from16 v1, v18 */
/* iput v0, v1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I */
/* .line 549 */
/* move/from16 v0, v16 */
/* move-object/from16 v1, v18 */
/* iput v0, v1, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I */
/* goto/16 :goto_4 */
/* .line 558 */
} // :cond_16
/* move-object/from16 v0, p0 */
v2 = this.mSkipButton;
/* move-object/from16 v0, p0 */
v3 = this.mResourceManager;
/* .line 559 */
/* const/16 v4, -0x12 */
(( com.mobfox.video.sdk.ResourceManager ) v3 ).getResource ( v4 ); // invoke-virtual {v3, v4}, Lcom/mobfox/video/sdk/ResourceManager;->getResource(I)Landroid/graphics/drawable/Drawable;
/* .line 558 */
(( android.widget.ImageView ) v2 ).setImageDrawable ( v3 ); // invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* goto/16 :goto_5 */
/* .line 566 */
} // :cond_17
int v2 = 1; // const/4 v2, 0x1
/* move-object/from16 v0, p0 */
/* iput-boolean v2, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mCanClose:Z */
/* .line 567 */
/* move-object/from16 v0, p0 */
v2 = this.mSkipButton;
int v3 = 0; // const/4 v3, 0x0
(( android.widget.ImageView ) v2 ).setVisibility ( v3 ); // invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setVisibility(I)V
/* goto/16 :goto_6 */
/* .line 571 */
} // .end local v9 # "buttonSize":I
} // .end local v16 # "margin":I
} // .end local v18 # "params":Landroid/widget/FrameLayout$LayoutParams;
} // :cond_18
int v2 = 0; // const/4 v2, 0x0
/* move-object/from16 v0, p0 */
/* iput-boolean v2, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mCanClose:Z */
/* goto/16 :goto_7 */
/* .line 598 */
/* .restart local v11 # "it":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/Integer;>;" */
/* .restart local v13 # "keys":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/Integer;>;" */
/* .restart local v14 # "loadingText":Landroid/widget/TextView; */
/* .restart local v18 # "params":Landroid/widget/FrameLayout$LayoutParams; */
} // :cond_19
/* check-cast v2, Ljava/lang/Integer; */
v12 = (( java.lang.Integer ) v2 ).intValue ( ); // invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
/* .line 599 */
/* .local v12, "key":I */
/* move-object/from16 v0, p0 */
v2 = this.mVideoView;
/* .line 600 */
/* move-object/from16 v0, p0 */
v3 = this.mOnVideoTimeEventListener;
/* .line 599 */
(( com.mobfox.video.sdk.MobFoxVideoView ) v2 ).setOnTimeEventListener ( v12, v3 ); // invoke-virtual {v2, v12, v3}, Lcom/mobfox/video/sdk/MobFoxVideoView;->setOnTimeEventListener(ILcom/mobfox/video/sdk/MobFoxVideoView$OnTimeEventListener;)V
/* goto/16 :goto_8 */
} // .end method
private void initWebBrowserView ( Boolean p0 ) {
/* .locals 6 */
/* .param p1, "showExit" # Z */
/* .prologue */
int v2 = 1; // const/4 v2, 0x1
/* .line 412 */
/* new-instance v0, Lcom/mobfox/video/sdk/MobFoxWebFrame; */
v5 = this.mResourceManager;
/* move-object v1, p0 */
/* move v3, v2 */
/* move v4, p1 */
/* invoke-direct/range {v0 ..v5}, Lcom/mobfox/video/sdk/MobFoxWebFrame;-><init>(Landroid/app/Activity;ZZZLcom/mobfox/video/sdk/ResourceManager;)V */
this.mWebBrowserView = v0;
/* .line 413 */
v0 = this.mWebBrowserView;
v1 = this.mOnWebBrowserLoadedListener;
(( com.mobfox.video.sdk.MobFoxWebFrame ) v0 ).setOnPageLoadedListener ( v1 ); // invoke-virtual {v0, v1}, Lcom/mobfox/video/sdk/MobFoxWebFrame;->setOnPageLoadedListener(Lcom/mobfox/video/sdk/MobFoxWebViewClient$OnPageLoadedListener;)V
/* .line 415 */
v0 = this.mRootLayout;
v1 = this.mWebBrowserView;
(( android.widget.FrameLayout ) v0 ).addView ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V
/* .line 416 */
return;
} // .end method
public static void setActivityAnimation ( android.app.Activity p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* .param p0, "activity" # Landroid/app/Activity; */
/* .param p1, "in" # I */
/* .param p2, "out" # I */
/* .prologue */
/* .line 106 */
try { // :try_start_0
(( android.app.Activity ) p0 ).overridePendingTransition ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/app/Activity;->overridePendingTransition(II)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 114 */
} // :goto_0
return;
/* .line 111 */
/* :catch_0 */
/* move-exception v0 */
} // .end method
/* # virtual methods */
public void finish ( ) {
/* .locals 5 */
/* .prologue */
int v4 = 3; // const/4 v4, 0x3
int v3 = 1; // const/4 v3, 0x1
/* .line 311 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
v0 = android.util.Log .isLoggable ( v0,v4 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 312 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
/* .line 313 */
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "Finish Activity type:"; // const-string v2, "Finish Activity type:"
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* iget v2, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mType:I */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = " ad Type:"; // const-string v2, " ad Type:"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 314 */
v2 = this.mAd;
v2 = (( com.mobfox.video.sdk.RichMediaAdData ) v2 ).getType ( ); // invoke-virtual {v2}, Lcom/mobfox/video/sdk/RichMediaAdData;->getType()I
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* .line 313 */
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 312 */
android.util.Log .d ( v0,v1 );
/* .line 316 */
} // :cond_0
/* iget v0, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mType:I */
/* packed-switch v0, :pswitch_data_0 */
/* .line 333 */
} // :cond_1
} // :goto_0
/* invoke-super {p0}, Landroid/app/Activity;->finish()V */
/* .line 334 */
v0 = this.mAd;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 335 */
/* iget v0, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mEnterAnim:I */
/* .line 336 */
/* iget v1, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mExitAnim:I */
/* .line 335 */
com.mobfox.video.sdk.MobFoxRichMediaActivity .setActivityAnimation ( p0,v0,v1 );
/* .line 338 */
} // :cond_2
return;
/* .line 318 */
/* :pswitch_0 */
v0 = this.mAd;
v0 = (( com.mobfox.video.sdk.RichMediaAdData ) v0 ).getType ( ); // invoke-virtual {v0}, Lcom/mobfox/video/sdk/RichMediaAdData;->getType()I
int v1 = 2; // const/4 v1, 0x2
/* if-ne v0, v1, :cond_3 */
/* .line 319 */
v0 = this.mAd;
/* iget-boolean v1, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mResult:Z */
com.mobfox.video.sdk.MobFoxAdManager .closeRunningAd ( v0,v1 );
/* .line 320 */
} // :cond_3
v0 = this.mAd;
v0 = (( com.mobfox.video.sdk.RichMediaAdData ) v0 ).getType ( ); // invoke-virtual {v0}, Lcom/mobfox/video/sdk/RichMediaAdData;->getType()I
/* if-ne v0, v3, :cond_1 */
/* .line 321 */
/* iget-boolean v0, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mResult:Z */
/* if-nez v0, :cond_1 */
/* .line 322 */
v0 = this.mAd;
/* iget-boolean v1, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mResult:Z */
com.mobfox.video.sdk.MobFoxAdManager .closeRunningAd ( v0,v1 );
/* .line 326 */
/* :pswitch_1 */
v0 = this.mAd;
v0 = (( com.mobfox.video.sdk.RichMediaAdData ) v0 ).getType ( ); // invoke-virtual {v0}, Lcom/mobfox/video/sdk/RichMediaAdData;->getType()I
/* if-eq v0, v4, :cond_4 */
/* .line 327 */
v0 = this.mAd;
v0 = (( com.mobfox.video.sdk.RichMediaAdData ) v0 ).getType ( ); // invoke-virtual {v0}, Lcom/mobfox/video/sdk/RichMediaAdData;->getType()I
/* if-eq v0, v3, :cond_4 */
/* .line 328 */
v0 = this.mAd;
v0 = (( com.mobfox.video.sdk.RichMediaAdData ) v0 ).getType ( ); // invoke-virtual {v0}, Lcom/mobfox/video/sdk/RichMediaAdData;->getType()I
int v1 = 4; // const/4 v1, 0x4
/* if-ne v0, v1, :cond_1 */
/* .line 329 */
} // :cond_4
v0 = this.mAd;
/* iget-boolean v1, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mResult:Z */
com.mobfox.video.sdk.MobFoxAdManager .closeRunningAd ( v0,v1 );
/* .line 316 */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
public Integer getDipSize ( Integer p0 ) {
/* .locals 3 */
/* .param p1, "argSize" # I */
/* .prologue */
/* .line 1304 */
int v0 = 1; // const/4 v0, 0x1
/* int-to-float v1, p1 */
(( com.mobfox.video.sdk.MobFoxRichMediaActivity ) p0 ).getResources ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->getResources()Landroid/content/res/Resources;
/* .line 1305 */
(( android.content.res.Resources ) v2 ).getDisplayMetrics ( ); // invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* .line 1303 */
v0 = android.util.TypedValue .applyDimension ( v0,v1,v2 );
/* float-to-int v0, v0 */
} // .end method
public android.widget.FrameLayout getRootLayout ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1237 */
v0 = this.mRootLayout;
} // .end method
public void goBack ( ) {
/* .locals 2 */
/* .prologue */
/* .line 372 */
v0 = this.mCustomView;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 373 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
int v1 = 3; // const/4 v1, 0x3
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 374 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
final String v1 = "Closing custom view on back key pressed"; // const-string v1, "Closing custom view on back key pressed"
android.util.Log .d ( v0,v1 );
/* .line 376 */
} // :cond_0
(( com.mobfox.video.sdk.MobFoxRichMediaActivity ) p0 ).onHideCustomView ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->onHideCustomView()V
/* .line 405 */
} // :cond_1
} // :goto_0
return;
/* .line 379 */
} // :cond_2
/* iget v0, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mType:I */
/* packed-switch v0, :pswitch_data_0 */
/* .line 397 */
/* :pswitch_0 */
v0 = this.mWebBrowserView;
v0 = (( com.mobfox.video.sdk.MobFoxWebFrame ) v0 ).canGoBack ( ); // invoke-virtual {v0}, Lcom/mobfox/video/sdk/MobFoxWebFrame;->canGoBack()Z
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 398 */
v0 = this.mWebBrowserView;
(( com.mobfox.video.sdk.MobFoxWebFrame ) v0 ).goBack ( ); // invoke-virtual {v0}, Lcom/mobfox/video/sdk/MobFoxWebFrame;->goBack()V
/* .line 381 */
/* :pswitch_1 */
/* iget-boolean v0, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mCanClose:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 382 */
(( com.mobfox.video.sdk.MobFoxRichMediaActivity ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->finish()V
/* .line 386 */
/* :pswitch_2 */
v0 = this.mInterstitialView;
v0 = (( com.mobfox.video.sdk.MobFoxWebFrame ) v0 ).canGoBack ( ); // invoke-virtual {v0}, Lcom/mobfox/video/sdk/MobFoxWebFrame;->canGoBack()Z
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 387 */
v0 = this.mInterstitialView;
(( com.mobfox.video.sdk.MobFoxWebFrame ) v0 ).goBack ( ); // invoke-virtual {v0}, Lcom/mobfox/video/sdk/MobFoxWebFrame;->goBack()V
/* .line 389 */
} // :cond_3
/* iget-boolean v0, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mCanClose:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 390 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mResult:Z */
/* .line 391 */
int v0 = -1; // const/4 v0, -0x1
(( com.mobfox.video.sdk.MobFoxRichMediaActivity ) p0 ).setResult ( v0 ); // invoke-virtual {p0, v0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->setResult(I)V
/* .line 392 */
(( com.mobfox.video.sdk.MobFoxRichMediaActivity ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->finish()V
/* .line 400 */
} // :cond_4
(( com.mobfox.video.sdk.MobFoxRichMediaActivity ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->finish()V
/* .line 379 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
} // .end packed-switch
} // .end method
public void navigate ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p1, "clickUrl" # Ljava/lang/String; */
/* .prologue */
/* .line 1222 */
/* iget v1, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mType:I */
/* packed-switch v1, :pswitch_data_0 */
/* .line 1230 */
/* :pswitch_0 */
/* new-instance v0, Landroid/content/Intent; */
/* const-class v1, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity; */
/* invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
/* .line 1231 */
/* .local v0, "intent":Landroid/content/Intent; */
android.net.Uri .parse ( p1 );
(( android.content.Intent ) v0 ).setData ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
/* .line 1232 */
(( com.mobfox.video.sdk.MobFoxRichMediaActivity ) p0 ).startActivity ( v0 ); // invoke-virtual {p0, v0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->startActivity(Landroid/content/Intent;)V
/* .line 1234 */
} // .end local v0 # "intent":Landroid/content/Intent;
} // :goto_0
return;
/* .line 1224 */
/* :pswitch_1 */
v1 = this.mWebBrowserView;
(( com.mobfox.video.sdk.MobFoxWebFrame ) v1 ).loadUrl ( p1 ); // invoke-virtual {v1, p1}, Lcom/mobfox/video/sdk/MobFoxWebFrame;->loadUrl(Ljava/lang/String;)V
/* .line 1227 */
/* :pswitch_2 */
v1 = this.mInterstitialView;
(( com.mobfox.video.sdk.MobFoxWebFrame ) v1 ).loadUrl ( p1 ); // invoke-virtual {v1, p1}, Lcom/mobfox/video/sdk/MobFoxWebFrame;->loadUrl(Ljava/lang/String;)V
/* .line 1222 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_1 */
/* :pswitch_0 */
/* :pswitch_2 */
} // .end packed-switch
} // .end method
public void onConfigurationChanged ( android.content.res.Configuration p0 ) {
/* .locals 2 */
/* .param p1, "newConfig" # Landroid/content/res/Configuration; */
/* .prologue */
/* .line 303 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V */
/* .line 304 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
int v1 = 3; // const/4 v1, 0x3
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 305 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
final String v1 = "MobFoxRichMediaActivity onConfigurationChanged"; // const-string v1, "MobFoxRichMediaActivity onConfigurationChanged"
android.util.Log .d ( v0,v1 );
/* .line 307 */
} // :cond_0
return;
} // .end method
public void onCreate ( android.os.Bundle p0 ) {
/* .locals 12 */
/* .param p1, "icicle" # Landroid/os/Bundle; */
/* .prologue */
/* const/16 v7, 0x200 */
int v11 = -1; // const/4 v11, -0x1
int v10 = 3; // const/4 v10, 0x3
int v9 = 0; // const/4 v9, 0x0
int v8 = 1; // const/4 v8, 0x1
/* .line 118 */
final String v5 = "MOBFOX"; // const-string v5, "MOBFOX"
v5 = android.util.Log .isLoggable ( v5,v10 );
if ( v5 != null) { // if-eqz v5, :cond_0
/* .line 119 */
final String v5 = "MOBFOX"; // const-string v5, "MOBFOX"
final String v6 = "MobFoxRichMediaActivity onCreate"; // const-string v6, "MobFoxRichMediaActivity onCreate"
android.util.Log .d ( v5,v6 );
/* .line 121 */
} // :cond_0
/* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
/* .line 122 */
/* iput-boolean v9, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mResult:Z */
/* .line 123 */
/* iput-boolean v9, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mPageLoaded:Z */
/* .line 124 */
(( com.mobfox.video.sdk.MobFoxRichMediaActivity ) p0 ).setResult ( v9 ); // invoke-virtual {p0, v9}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->setResult(I)V
/* .line 125 */
(( com.mobfox.video.sdk.MobFoxRichMediaActivity ) p0 ).getWindow ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->getWindow()Landroid/view/Window;
/* .line 126 */
/* .local v3, "win":Landroid/view/Window; */
/* const/16 v5, 0x400 */
/* .line 127 */
/* const/16 v6, 0x400 */
/* .line 126 */
(( android.view.Window ) v3 ).setFlags ( v5, v6 ); // invoke-virtual {v3, v5, v6}, Landroid/view/Window;->setFlags(II)V
/* .line 128 */
(( com.mobfox.video.sdk.MobFoxRichMediaActivity ) p0 ).requestWindowFeature ( v8 ); // invoke-virtual {p0, v8}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->requestWindowFeature(I)Z
/* .line 129 */
(( android.view.Window ) v3 ).addFlags ( v7 ); // invoke-virtual {v3, v7}, Landroid/view/Window;->addFlags(I)V
/* .line 130 */
(( com.mobfox.video.sdk.MobFoxRichMediaActivity ) p0 ).getWindowManager ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->getWindowManager()Landroid/view/WindowManager;
/* .line 131 */
/* .local v0, "display":Landroid/view/Display; */
/* new-instance v5, Landroid/util/DisplayMetrics; */
/* invoke-direct {v5}, Landroid/util/DisplayMetrics;-><init>()V */
this.metrics = v5;
/* .line 133 */
final String v5 = "window"; // const-string v5, "window"
(( com.mobfox.video.sdk.MobFoxRichMediaActivity ) p0 ).getSystemService ( v5 ); // invoke-virtual {p0, v5}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* .line 132 */
/* check-cast v4, Landroid/view/WindowManager; */
/* .line 134 */
/* .local v4, "wm":Landroid/view/WindowManager; */
v6 = this.metrics;
(( android.view.Display ) v5 ).getMetrics ( v6 ); // invoke-virtual {v5, v6}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V
/* .line 135 */
v5 = (( android.view.Display ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/view/Display;->getWidth()I
/* iput v5, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mWindowWidth:I */
/* .line 136 */
v5 = (( android.view.Display ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/view/Display;->getHeight()I
/* iput v5, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mWindowHeight:I */
/* .line 137 */
(( android.view.Window ) v3 ).clearFlags ( v7 ); // invoke-virtual {v3, v7}, Landroid/view/Window;->clearFlags(I)V
/* .line 138 */
final String v5 = "MOBFOX"; // const-string v5, "MOBFOX"
v5 = android.util.Log .isLoggable ( v5,v10 );
if ( v5 != null) { // if-eqz v5, :cond_1
/* .line 139 */
final String v5 = "MOBFOX"; // const-string v5, "MOBFOX"
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "MobFoxRichMediaActivity Window Size:("; // const-string v7, "MobFoxRichMediaActivity Window Size:("
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* iget v7, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mWindowWidth:I */
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* .line 140 */
final String v7 = ","; // const-string v7, ","
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v7, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mWindowHeight:I */
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v7 = ")"; // const-string v7, ")"
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 139 */
android.util.Log .d ( v5,v6 );
/* .line 143 */
} // :cond_1
(( com.mobfox.video.sdk.MobFoxRichMediaActivity ) p0 ).setVolumeControlStream ( v10 ); // invoke-virtual {p0, v10}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->setVolumeControlStream(I)V
/* .line 145 */
/* iput v11, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mType:I */
/* .line 146 */
(( com.mobfox.video.sdk.MobFoxRichMediaActivity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->getIntent()Landroid/content/Intent;
/* .line 147 */
/* .local v2, "intent":Landroid/content/Intent; */
(( android.content.Intent ) v2 ).getExtras ( ); // invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
/* .line 148 */
/* .local v1, "extras":Landroid/os/Bundle; */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 149 */
final String v5 = "MOBFOX_RICH_AD_DATA"; // const-string v5, "MOBFOX_RICH_AD_DATA"
(( android.os.Bundle ) v1 ).getSerializable ( v5 ); // invoke-virtual {v1, v5}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;
/* if-nez v5, :cond_6 */
/* .line 150 */
} // :cond_2
(( android.content.Intent ) v2 ).getData ( ); // invoke-virtual {v2}, Landroid/content/Intent;->getData()Landroid/net/Uri;
this.uri = v5;
/* .line 151 */
v5 = this.uri;
/* if-nez v5, :cond_5 */
/* .line 152 */
final String v5 = "MOBFOX"; // const-string v5, "MOBFOX"
v5 = android.util.Log .isLoggable ( v5,v10 );
if ( v5 != null) { // if-eqz v5, :cond_3
/* .line 153 */
final String v5 = "MOBFOX"; // const-string v5, "MOBFOX"
final String v6 = "url is null so do not load anything"; // const-string v6, "url is null so do not load anything"
android.util.Log .d ( v5,v6 );
/* .line 155 */
} // :cond_3
(( com.mobfox.video.sdk.MobFoxRichMediaActivity ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->finish()V
/* .line 208 */
} // :cond_4
} // :goto_0
return;
/* .line 158 */
} // :cond_5
/* iput v9, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mType:I */
/* .line 163 */
} // :goto_1
/* new-instance v5, Lcom/mobfox/video/sdk/ResourceManager; */
v6 = this.mHandler;
/* invoke-direct {v5, p0, v6}, Lcom/mobfox/video/sdk/ResourceManager;-><init>(Landroid/content/Context;Landroid/os/Handler;)V */
this.mResourceManager = v5;
/* .line 164 */
/* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->initRootLayout()V */
/* .line 167 */
/* iget v5, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mType:I */
/* if-nez v5, :cond_7 */
/* .line 168 */
/* invoke-direct {p0, v8}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->initWebBrowserView(Z)V */
/* .line 169 */
v5 = this.mWebBrowserView;
v6 = this.uri;
(( android.net.Uri ) v6 ).toString ( ); // invoke-virtual {v6}, Landroid/net/Uri;->toString()Ljava/lang/String;
(( com.mobfox.video.sdk.MobFoxWebFrame ) v5 ).loadUrl ( v6 ); // invoke-virtual {v5, v6}, Lcom/mobfox/video/sdk/MobFoxWebFrame;->loadUrl(Ljava/lang/String;)V
/* .line 171 */
v5 = com.mobfox.video.sdk.Util .getEnterAnimation ( v8 );
/* .line 170 */
/* iput v5, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mEnterAnim:I */
/* .line 173 */
v5 = com.mobfox.video.sdk.Util .getExitAnimation ( v8 );
/* .line 172 */
/* iput v5, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mExitAnim:I */
/* .line 204 */
} // :goto_2
v5 = this.mRootLayout;
(( com.mobfox.video.sdk.MobFoxRichMediaActivity ) p0 ).setContentView ( v5 ); // invoke-virtual {p0, v5}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->setContentView(Landroid/view/View;)V
/* .line 205 */
final String v5 = "MOBFOX"; // const-string v5, "MOBFOX"
v5 = android.util.Log .isLoggable ( v5,v10 );
if ( v5 != null) { // if-eqz v5, :cond_4
/* .line 206 */
final String v5 = "MOBFOX"; // const-string v5, "MOBFOX"
final String v6 = "MobFoxRichMediaActivity onCreate done"; // const-string v6, "MobFoxRichMediaActivity onCreate done"
android.util.Log .d ( v5,v6 );
/* .line 160 */
} // :cond_6
(( com.mobfox.video.sdk.MobFoxRichMediaActivity ) p0 ).requestWindowFeature ( v8 ); // invoke-virtual {p0, v8}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->requestWindowFeature(I)Z
/* .line 175 */
} // :cond_7
final String v5 = "MOBFOX_RICH_AD_DATA"; // const-string v5, "MOBFOX_RICH_AD_DATA"
(( android.os.Bundle ) v1 ).getSerializable ( v5 ); // invoke-virtual {v1, v5}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;
/* check-cast v5, Lcom/mobfox/video/sdk/RichMediaAdData; */
this.mAd = v5;
/* .line 176 */
v5 = this.mAd;
v5 = (( com.mobfox.video.sdk.RichMediaAdData ) v5 ).getAnimation ( ); // invoke-virtual {v5}, Lcom/mobfox/video/sdk/RichMediaAdData;->getAnimation()I
v5 = com.mobfox.video.sdk.Util .getEnterAnimation ( v5 );
/* iput v5, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mEnterAnim:I */
/* .line 177 */
v5 = this.mAd;
v5 = (( com.mobfox.video.sdk.RichMediaAdData ) v5 ).getAnimation ( ); // invoke-virtual {v5}, Lcom/mobfox/video/sdk/RichMediaAdData;->getAnimation()I
v5 = com.mobfox.video.sdk.Util .getExitAnimation ( v5 );
/* iput v5, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mExitAnim:I */
/* .line 179 */
/* iput-boolean v9, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mCanClose:Z */
/* .line 180 */
final String v5 = "MOBFOX_RICH_AD_TYPE"; // const-string v5, "MOBFOX_RICH_AD_TYPE"
v5 = (( android.os.Bundle ) v1 ).getInt ( v5, v11 ); // invoke-virtual {v1, v5, v11}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I
/* iput v5, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mType:I */
/* .line 181 */
/* iget v5, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mType:I */
/* if-ne v5, v11, :cond_8 */
/* .line 182 */
v5 = this.mAd;
v5 = (( com.mobfox.video.sdk.RichMediaAdData ) v5 ).getType ( ); // invoke-virtual {v5}, Lcom/mobfox/video/sdk/RichMediaAdData;->getType()I
/* packed-switch v5, :pswitch_data_0 */
/* .line 193 */
} // :cond_8
} // :goto_3
/* iget v5, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mType:I */
/* packed-switch v5, :pswitch_data_1 */
/* .line 195 */
/* :pswitch_0 */
/* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->initVideoView()V */
/* .line 185 */
/* :pswitch_1 */
/* iput v8, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mType:I */
/* .line 189 */
/* :pswitch_2 */
int v5 = 2; // const/4 v5, 0x2
/* iput v5, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mType:I */
/* .line 198 */
/* :pswitch_3 */
/* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->initInterstitialView()V */
/* .line 182 */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_1 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_2 */
} // .end packed-switch
/* .line 193 */
/* :pswitch_data_1 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_3 */
} // .end packed-switch
} // .end method
protected void onDestroy ( ) {
/* .locals 3 */
/* .prologue */
int v2 = 3; // const/4 v2, 0x3
/* .line 212 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
v0 = android.util.Log .isLoggable ( v0,v2 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 213 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
final String v1 = "MobFoxRichMediaActivity onDestroy"; // const-string v1, "MobFoxRichMediaActivity onDestroy"
android.util.Log .d ( v0,v1 );
/* .line 215 */
} // :cond_0
/* invoke-super {p0}, Landroid/app/Activity;->onDestroy()V */
/* .line 216 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
v0 = android.util.Log .isLoggable ( v0,v2 );
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 217 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
final String v1 = "MobFoxRichMediaActivity onDestroy done"; // const-string v1, "MobFoxRichMediaActivity onDestroy done"
android.util.Log .d ( v0,v1 );
/* .line 219 */
} // :cond_1
return;
} // .end method
public void onHideCustomView ( ) {
/* .locals 5 */
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
int v3 = 3; // const/4 v3, 0x3
/* .line 1273 */
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
v1 = android.util.Log .isLoggable ( v1,v3 );
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 1274 */
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
final String v2 = "onHideCustomView Hidding Custom View"; // const-string v2, "onHideCustomView Hidding Custom View"
android.util.Log .d ( v1,v2 );
/* .line 1276 */
} // :cond_0
v1 = this.mCustomView;
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 1278 */
v1 = this.mCustomView;
/* const/16 v2, 0x8 */
(( android.widget.FrameLayout ) v1 ).setVisibility ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/FrameLayout;->setVisibility(I)V
/* .line 1279 */
this.mCustomView = v4;
/* .line 1280 */
v1 = this.mCustomVideoView;
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 1282 */
try { // :try_start_0
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
int v2 = 3; // const/4 v2, 0x3
v1 = android.util.Log .isLoggable ( v1,v2 );
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 1283 */
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
final String v2 = "onHideCustomView stop video"; // const-string v2, "onHideCustomView stop video"
android.util.Log .d ( v1,v2 );
/* .line 1285 */
} // :cond_1
v1 = this.mCustomVideoView;
(( android.widget.VideoView ) v1 ).stopPlayback ( ); // invoke-virtual {v1}, Landroid/widget/VideoView;->stopPlayback()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 1291 */
} // :cond_2
} // :goto_0
this.mCustomVideoView = v4;
/* .line 1294 */
} // :cond_3
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
v1 = android.util.Log .isLoggable ( v1,v3 );
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 1295 */
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
final String v2 = "onHideCustomView calling callback"; // const-string v2, "onHideCustomView calling callback"
android.util.Log .d ( v1,v2 );
/* .line 1297 */
} // :cond_4
v1 = this.mCustomViewCallback;
/* .line 1298 */
v1 = this.mRootLayout;
int v2 = 0; // const/4 v2, 0x0
(( android.widget.FrameLayout ) v1 ).setVisibility ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/FrameLayout;->setVisibility(I)V
/* .line 1299 */
v1 = this.mRootLayout;
(( com.mobfox.video.sdk.MobFoxRichMediaActivity ) p0 ).setContentView ( v1 ); // invoke-virtual {p0, v1}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->setContentView(Landroid/view/View;)V
/* .line 1300 */
return;
/* .line 1286 */
/* :catch_0 */
/* move-exception v0 */
/* .line 1287 */
/* .local v0, "e":Ljava/lang/Exception; */
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
int v2 = 5; // const/4 v2, 0x5
v1 = android.util.Log .isLoggable ( v1,v2 );
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 1288 */
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
final String v2 = "Couldn\'t stop custom video view"; // const-string v2, "Couldn\'t stop custom video view"
android.util.Log .d ( v1,v2 );
} // .end method
public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 1 */
/* .param p1, "keyCode" # I */
/* .param p2, "event" # Landroid/view/KeyEvent; */
/* .prologue */
/* .line 342 */
int v0 = 4; // const/4 v0, 0x4
/* if-ne p1, v0, :cond_0 */
/* .line 343 */
(( com.mobfox.video.sdk.MobFoxRichMediaActivity ) p0 ).goBack ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->goBack()V
/* .line 344 */
int v0 = 1; // const/4 v0, 0x1
/* .line 346 */
} // :goto_0
} // :cond_0
v0 = /* invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z */
} // .end method
protected void onPause ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 3; // const/4 v3, 0x3
int v2 = 0; // const/4 v2, 0x0
/* .line 223 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
v0 = android.util.Log .isLoggable ( v0,v3 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 224 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
final String v1 = "MobFoxRichMediaActivity onPause"; // const-string v1, "MobFoxRichMediaActivity onPause"
android.util.Log .d ( v0,v1 );
/* .line 226 */
} // :cond_0
/* invoke-super {p0}, Landroid/app/Activity;->onPause()V */
/* .line 227 */
/* iget v0, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mType:I */
/* packed-switch v0, :pswitch_data_0 */
/* .line 252 */
} // :cond_1
} // :goto_0
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
v0 = android.util.Log .isLoggable ( v0,v3 );
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 253 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
final String v1 = "MobFoxRichMediaActivity onPause done"; // const-string v1, "MobFoxRichMediaActivity onPause done"
android.util.Log .d ( v0,v1 );
/* .line 255 */
} // :cond_2
return;
/* .line 229 */
/* :pswitch_0 */
v0 = this.mVideoView;
v0 = (( com.mobfox.video.sdk.MobFoxVideoView ) v0 ).getCurrentPosition ( ); // invoke-virtual {v0}, Lcom/mobfox/video/sdk/MobFoxVideoView;->getCurrentPosition()I
/* iput v0, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mVideoLastPosition:I */
/* .line 230 */
v0 = this.mVideoView;
(( com.mobfox.video.sdk.MobFoxVideoView ) v0 ).stopPlayback ( ); // invoke-virtual {v0}, Lcom/mobfox/video/sdk/MobFoxVideoView;->stopPlayback()V
/* .line 231 */
v0 = this.mRootLayout;
v1 = this.mVideoLayout;
(( android.widget.FrameLayout ) v0 ).removeView ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V
/* .line 232 */
v0 = this.mVideoTimeoutTimer;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 233 */
v0 = this.mVideoTimeoutTimer;
(( java.util.Timer ) v0 ).cancel ( ); // invoke-virtual {v0}, Ljava/util/Timer;->cancel()V
/* .line 234 */
this.mVideoTimeoutTimer = v2;
/* .line 238 */
/* :pswitch_1 */
v0 = this.mInterstitialLoadingTimer;
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 239 */
v0 = this.mInterstitialLoadingTimer;
(( java.util.Timer ) v0 ).cancel ( ); // invoke-virtual {v0}, Ljava/util/Timer;->cancel()V
/* .line 240 */
this.mInterstitialLoadingTimer = v2;
/* .line 242 */
} // :cond_3
v0 = this.mInterstitialAutocloseTimer;
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 243 */
v0 = this.mInterstitialAutocloseTimer;
(( java.util.Timer ) v0 ).cancel ( ); // invoke-virtual {v0}, Ljava/util/Timer;->cancel()V
/* .line 244 */
this.mInterstitialAutocloseTimer = v2;
/* .line 246 */
} // :cond_4
v0 = this.mInterstitialCanCloseTimer;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 247 */
v0 = this.mInterstitialCanCloseTimer;
(( java.util.Timer ) v0 ).cancel ( ); // invoke-virtual {v0}, Ljava/util/Timer;->cancel()V
/* .line 248 */
this.mInterstitialCanCloseTimer = v2;
/* .line 227 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
protected void onResume ( ) {
/* .locals 5 */
/* .prologue */
int v4 = 3; // const/4 v4, 0x3
/* .line 259 */
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
v1 = android.util.Log .isLoggable ( v1,v4 );
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 260 */
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
final String v2 = "MobFoxRichMediaActivity onResume"; // const-string v2, "MobFoxRichMediaActivity onResume"
android.util.Log .d ( v1,v2 );
/* .line 262 */
} // :cond_0
/* invoke-super {p0}, Landroid/app/Activity;->onResume()V */
/* .line 263 */
/* iget v1, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mType:I */
/* packed-switch v1, :pswitch_data_0 */
/* .line 296 */
} // :cond_1
} // :goto_0
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
v1 = android.util.Log .isLoggable ( v1,v4 );
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 297 */
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
final String v2 = "MobFoxRichMediaActivity onResume done"; // const-string v2, "MobFoxRichMediaActivity onResume done"
android.util.Log .d ( v1,v2 );
/* .line 299 */
} // :cond_2
return;
/* .line 265 */
/* :pswitch_0 */
v1 = this.mRootLayout;
v2 = this.mVideoLayout;
(( android.widget.FrameLayout ) v1 ).addView ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V
/* .line 266 */
v1 = this.mVideoView;
/* iget v2, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mVideoLastPosition:I */
(( com.mobfox.video.sdk.MobFoxVideoView ) v1 ).seekTo ( v2 ); // invoke-virtual {v1, v2}, Lcom/mobfox/video/sdk/MobFoxVideoView;->seekTo(I)V
/* .line 267 */
v1 = this.mVideoView;
(( com.mobfox.video.sdk.MobFoxVideoView ) v1 ).start ( ); // invoke-virtual {v1}, Lcom/mobfox/video/sdk/MobFoxVideoView;->start()V
/* .line 268 */
v1 = this.mVideoTimeoutTimer;
/* if-nez v1, :cond_1 */
/* .line 269 */
/* new-instance v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$VideoTimeoutTask; */
/* invoke-direct {v0, p0, p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$VideoTimeoutTask;-><init>(Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;Landroid/app/Activity;)V */
/* .line 271 */
/* .local v0, "autocloseTask":Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$VideoTimeoutTask; */
/* new-instance v1, Ljava/util/Timer; */
/* invoke-direct {v1}, Ljava/util/Timer;-><init>()V */
this.mVideoTimeoutTimer = v1;
/* .line 272 */
v1 = this.mVideoTimeoutTimer;
/* .line 273 */
/* const-wide/16 v2, 0x7530 */
/* .line 272 */
(( java.util.Timer ) v1 ).schedule ( v0, v2, v3 ); // invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
/* .line 278 */
} // .end local v0 # "autocloseTask":Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$VideoTimeoutTask;
/* :pswitch_1 */
v1 = this.mInterstitialData;
/* iget v1, v1, Lcom/mobfox/video/sdk/InterstitialData;->interstitialType:I */
/* packed-switch v1, :pswitch_data_1 */
/* .line 286 */
/* :pswitch_2 */
/* iget-boolean v1, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mPageLoaded:Z */
/* if-nez v1, :cond_1 */
/* .line 287 */
v1 = this.mInterstitialView;
/* .line 288 */
v2 = this.mInterstitialData;
v2 = this.interstitialUrl;
(( com.mobfox.video.sdk.MobFoxWebFrame ) v1 ).loadUrl ( v2 ); // invoke-virtual {v1, v2}, Lcom/mobfox/video/sdk/MobFoxWebFrame;->loadUrl(Ljava/lang/String;)V
/* .line 280 */
/* :pswitch_3 */
/* iget-boolean v1, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mPageLoaded:Z */
/* if-nez v1, :cond_1 */
/* .line 281 */
v1 = this.mInterstitialView;
/* .line 282 */
v2 = this.mInterstitialData;
v2 = this.interstitialMarkup;
(( com.mobfox.video.sdk.MobFoxWebFrame ) v1 ).setMarkup ( v2 ); // invoke-virtual {v1, v2}, Lcom/mobfox/video/sdk/MobFoxWebFrame;->setMarkup(Ljava/lang/String;)V
/* .line 263 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
/* .line 278 */
/* :pswitch_data_1 */
/* .packed-switch 0x0 */
/* :pswitch_2 */
/* :pswitch_3 */
} // .end packed-switch
} // .end method
public void onShowCustomView ( android.view.View p0, android.webkit.WebChromeClient$CustomViewCallback p1 ) {
/* .locals 3 */
/* .param p1, "view" # Landroid/view/View; */
/* .param p2, "callback" # Landroid/webkit/WebChromeClient$CustomViewCallback; */
/* .prologue */
int v2 = 3; // const/4 v2, 0x3
/* .line 1241 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
v0 = android.util.Log .isLoggable ( v0,v2 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 1242 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
final String v1 = " onShowCustomView"; // const-string v1, " onShowCustomView"
android.util.Log .d ( v0,v1 );
/* .line 1244 */
} // :cond_0
/* instance-of v0, p1, Landroid/widget/FrameLayout; */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 1246 */
/* check-cast p1, Landroid/widget/FrameLayout; */
} // .end local p1 # "view":Landroid/view/View;
this.mCustomView = p1;
/* .line 1247 */
this.mCustomViewCallback = p2;
/* .line 1248 */
v0 = this.mCustomView;
(( android.widget.FrameLayout ) v0 ).getFocusedChild ( ); // invoke-virtual {v0}, Landroid/widget/FrameLayout;->getFocusedChild()Landroid/view/View;
/* instance-of v0, v0, Landroid/widget/VideoView; */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 1249 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
v0 = android.util.Log .isLoggable ( v0,v2 );
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 1250 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
final String v1 = " onShowCustomView Starting Video View"; // const-string v1, " onShowCustomView Starting Video View"
android.util.Log .d ( v0,v1 );
/* .line 1252 */
} // :cond_1
v0 = this.mCustomView;
(( android.widget.FrameLayout ) v0 ).getFocusedChild ( ); // invoke-virtual {v0}, Landroid/widget/FrameLayout;->getFocusedChild()Landroid/view/View;
/* check-cast v0, Landroid/widget/VideoView; */
this.mCustomVideoView = v0;
/* .line 1253 */
v0 = this.mCustomVideoView;
/* .line 1254 */
/* new-instance v1, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$19; */
/* invoke-direct {v1, p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$19;-><init>(Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;)V */
(( android.widget.VideoView ) v0 ).setOnCompletionListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/VideoView;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V
/* .line 1264 */
v0 = this.mCustomVideoView;
(( android.widget.VideoView ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/widget/VideoView;->start()V
/* .line 1266 */
} // :cond_2
v0 = this.mRootLayout;
/* const/16 v1, 0x8 */
(( android.widget.FrameLayout ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V
/* .line 1267 */
v0 = this.mCustomView;
int v1 = 0; // const/4 v1, 0x0
(( android.widget.FrameLayout ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V
/* .line 1268 */
v0 = this.mCustomView;
(( com.mobfox.video.sdk.MobFoxRichMediaActivity ) p0 ).setContentView ( v0 ); // invoke-virtual {p0, v0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->setContentView(Landroid/view/View;)V
/* .line 1270 */
} // :cond_3
return;
} // .end method
public void playVideo ( ) {
/* .locals 7 */
/* .prologue */
int v6 = 3; // const/4 v6, 0x3
int v5 = 1; // const/4 v5, 0x1
/* .line 725 */
final String v2 = "MOBFOX"; // const-string v2, "MOBFOX"
v2 = android.util.Log .isLoggable ( v2,v6 );
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 726 */
final String v2 = "MOBFOX"; // const-string v2, "MOBFOX"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "MobFoxRichMediaActivity play video:"; // const-string v4, "MobFoxRichMediaActivity play video:"
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* iget v4, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mType:I */
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v2,v3 );
/* .line 728 */
} // :cond_0
/* iget v2, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mType:I */
/* packed-switch v2, :pswitch_data_0 */
/* .line 756 */
} // :cond_1
} // :goto_0
return;
/* .line 730 */
/* :pswitch_0 */
v2 = this.mMediaController;
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 731 */
v2 = this.mMediaController;
(( com.mobfox.video.sdk.MobFoxMediaController ) v2 ).replay ( ); // invoke-virtual {v2}, Lcom/mobfox/video/sdk/MobFoxMediaController;->replay()V
/* .line 735 */
/* :pswitch_1 */
v2 = this.mAd;
v2 = (( com.mobfox.video.sdk.RichMediaAdData ) v2 ).getType ( ); // invoke-virtual {v2}, Lcom/mobfox/video/sdk/RichMediaAdData;->getType()I
int v3 = 4; // const/4 v3, 0x4
/* if-ne v2, v3, :cond_1 */
/* .line 736 */
final String v2 = "MOBFOX"; // const-string v2, "MOBFOX"
v2 = android.util.Log .isLoggable ( v2,v6 );
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 737 */
final String v2 = "MOBFOX"; // const-string v2, "MOBFOX"
final String v3 = "MobFoxRichMediaActivity launch video"; // const-string v3, "MobFoxRichMediaActivity launch video"
android.util.Log .d ( v2,v3 );
/* .line 739 */
} // :cond_2
/* new-instance v1, Landroid/content/Intent; */
/* .line 740 */
/* const-class v2, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity; */
/* .line 739 */
/* invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
/* .line 741 */
/* .local v1, "intent":Landroid/content/Intent; */
final String v2 = "MOBFOX_RICH_AD_DATA"; // const-string v2, "MOBFOX_RICH_AD_DATA"
v3 = this.mAd;
(( android.content.Intent ) v1 ).putExtra ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;
/* .line 742 */
final String v2 = "MOBFOX_RICH_AD_TYPE"; // const-string v2, "MOBFOX_RICH_AD_TYPE"
(( android.content.Intent ) v1 ).putExtra ( v2, v5 ); // invoke-virtual {v1, v2, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
/* .line 744 */
try { // :try_start_0
(( com.mobfox.video.sdk.MobFoxRichMediaActivity ) p0 ).startActivity ( v1 ); // invoke-virtual {p0, v1}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->startActivity(Landroid/content/Intent;)V
/* .line 746 */
/* iget v2, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mEnterAnim:I */
/* iget v3, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mExitAnim:I */
/* .line 745 */
com.mobfox.video.sdk.MobFoxRichMediaActivity .setActivityAnimation ( p0,v2,v3 );
/* .line 747 */
int v2 = 1; // const/4 v2, 0x1
/* iput-boolean v2, p0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mResult:Z */
/* .line 748 */
int v2 = -1; // const/4 v2, -0x1
(( com.mobfox.video.sdk.MobFoxRichMediaActivity ) p0 ).setResult ( v2 ); // invoke-virtual {p0, v2}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->setResult(I)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 749 */
/* :catch_0 */
/* move-exception v0 */
/* .line 750 */
/* .local v0, "e":Ljava/lang/Exception; */
final String v2 = "MOBFOX"; // const-string v2, "MOBFOX"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "Cannot start MobFox Rich Ad activity:"; // const-string v4, "Cannot start MobFox Rich Ad activity:"
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v2,v3,v0 );
/* .line 728 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
public void replayVideo ( ) {
/* .locals 1 */
/* .prologue */
/* .line 719 */
v0 = this.mMediaController;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 720 */
v0 = this.mMediaController;
(( com.mobfox.video.sdk.MobFoxMediaController ) v0 ).replay ( ); // invoke-virtual {v0}, Lcom/mobfox/video/sdk/MobFoxMediaController;->replay()V
/* .line 722 */
} // :cond_0
return;
} // .end method
