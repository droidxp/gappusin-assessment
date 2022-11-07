public class com.mobfox.video.sdk.MobFoxInterstitialController extends android.widget.LinearLayout {
	 /* .source "MobFoxInterstitialController.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/mobfox/video/sdk/MobFoxInterstitialController$BrowserControl;, */
	 /* Lcom/mobfox/video/sdk/MobFoxInterstitialController$OnReloadListener;, */
	 /* Lcom/mobfox/video/sdk/MobFoxInterstitialController$OnResetAutocloseListener; */
	 /* } */
} // .end annotation
/* # static fields */
private static final Integer BACK_IMAGE_RESOURCE_ID;
private static final Integer BOTTOMBAR_BACKGROUND_RESOURCE_ID;
private static final Integer DEFAULT_TIMEOUT;
private static final Integer EXTERNAL_IMAGE_RESOURCE_ID;
private static final Integer FADE_OUT;
private static final Integer FORWARD_IMAGE_RESOURCE_ID;
private static final Integer RELOAD_IMAGE_RESOURCE_ID;
private static final Integer SHOW_PROGRESS;
private static final Integer TOPBAR_BACKGROUND_RESOURCE_ID;
/* # instance fields */
private Double buttonWidthPercent;
private Boolean mAutoclose;
private com.mobfox.video.sdk.AspectRatioImageViewWidth mBackButton;
private android.view.View$OnClickListener mBackListener;
private android.widget.LinearLayout mBottomBar;
private com.mobfox.video.sdk.AspectRatioImageView mBottomBarBackground;
private com.mobfox.video.sdk.MobFoxInterstitialController$BrowserControl mBrowser;
private android.widget.FrameLayout mBrowserView;
private android.content.Context mContext;
private Integer mDefaultTimeout;
private com.mobfox.video.sdk.AspectRatioImageViewWidth mExternalButton;
private android.view.View$OnClickListener mExternalListener;
private Boolean mFixed;
java.lang.StringBuilder mFormatBuilder;
java.util.Formatter mFormatter;
private com.mobfox.video.sdk.AspectRatioImageViewWidth mForwardButton;
private android.view.View$OnClickListener mForwardListener;
private android.os.Handler mHandler;
private com.mobfox.video.sdk.InterstitialData mInterstitialData;
private android.widget.TextView mLeftTime;
private android.widget.LinearLayout mNavIconsLayout;
private com.mobfox.video.sdk.MobFoxInterstitialController$OnReloadListener mOnReloadListener;
private com.mobfox.video.sdk.MobFoxInterstitialController$OnResetAutocloseListener mOnResetAutocloseListener;
private com.mobfox.video.sdk.AspectRatioImageViewWidth mReloadButton;
private android.view.View$OnClickListener mReloadListener;
private com.mobfox.video.sdk.ResourceManager mResourceManager;
private Boolean mShowing;
private java.lang.String mTitle;
private android.widget.TextView mTitleText;
private android.widget.LinearLayout mTopBar;
private com.mobfox.video.sdk.AspectRatioImageView mTopBarBackground;
/* # direct methods */
public com.mobfox.video.sdk.MobFoxInterstitialController ( ) {
	 /* .locals 6 */
	 /* .param p1, "context" # Landroid/content/Context; */
	 /* .param p2, "interstitialData" # Lcom/mobfox/video/sdk/InterstitialData; */
	 /* .prologue */
	 int v3 = 0; // const/4 v3, 0x0
	 /* .line 64 */
	 /* invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V */
	 /* .line 60 */
	 /* const-wide v4, 0x3fb70a3d70a3d70aL # 0.09 */
	 /* iput-wide v4, p0, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->buttonWidthPercent:D */
	 /* .line 506 */
	 /* new-instance v2, Lcom/mobfox/video/sdk/MobFoxInterstitialController$1; */
	 /* invoke-direct {v2, p0}, Lcom/mobfox/video/sdk/MobFoxInterstitialController$1;-><init>(Lcom/mobfox/video/sdk/MobFoxInterstitialController;)V */
	 this.mHandler = v2;
	 /* .line 639 */
	 /* new-instance v2, Lcom/mobfox/video/sdk/MobFoxInterstitialController$2; */
	 /* invoke-direct {v2, p0}, Lcom/mobfox/video/sdk/MobFoxInterstitialController$2;-><init>(Lcom/mobfox/video/sdk/MobFoxInterstitialController;)V */
	 this.mBackListener = v2;
	 /* .line 648 */
	 /* new-instance v2, Lcom/mobfox/video/sdk/MobFoxInterstitialController$3; */
	 /* invoke-direct {v2, p0}, Lcom/mobfox/video/sdk/MobFoxInterstitialController$3;-><init>(Lcom/mobfox/video/sdk/MobFoxInterstitialController;)V */
	 this.mReloadListener = v2;
	 /* .line 654 */
	 /* new-instance v2, Lcom/mobfox/video/sdk/MobFoxInterstitialController$4; */
	 /* invoke-direct {v2, p0}, Lcom/mobfox/video/sdk/MobFoxInterstitialController$4;-><init>(Lcom/mobfox/video/sdk/MobFoxInterstitialController;)V */
	 this.mForwardListener = v2;
	 /* .line 663 */
	 /* new-instance v2, Lcom/mobfox/video/sdk/MobFoxInterstitialController$5; */
	 /* invoke-direct {v2, p0}, Lcom/mobfox/video/sdk/MobFoxInterstitialController$5;-><init>(Lcom/mobfox/video/sdk/MobFoxInterstitialController;)V */
	 this.mExternalListener = v2;
	 /* .line 65 */
	 /* new-instance v0, Landroid/util/DisplayMetrics; */
	 /* invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V */
	 /* .line 67 */
	 /* .local v0, "metrics":Landroid/util/DisplayMetrics; */
	 final String v2 = "window"; // const-string v2, "window"
	 (( android.content.Context ) p1 ).getSystemService ( v2 ); // invoke-virtual {p1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
	 /* .line 66 */
	 /* check-cast v1, Landroid/view/WindowManager; */
	 /* .line 68 */
	 /* .local v1, "wm":Landroid/view/WindowManager; */
	 (( android.view.Display ) v2 ).getMetrics ( v0 ); // invoke-virtual {v2, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V
	 /* .line 69 */
	 this.mContext = p1;
	 /* .line 70 */
	 this.mInterstitialData = p2;
	 /* .line 71 */
	 v2 = this.mInterstitialData;
	 /* if-nez v2, :cond_0 */
	 /* .line 72 */
	 /* new-instance v2, Ljava/lang/IllegalArgumentException; */
	 /* .line 73 */
	 final String v3 = "Interstitial info cannot be null"; // const-string v3, "Interstitial info cannot be null"
	 /* .line 72 */
	 /* invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw v2 */
	 /* .line 75 */
} // :cond_0
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
this.mFormatBuilder = v2;
/* .line 76 */
/* new-instance v2, Ljava/util/Formatter; */
v4 = this.mFormatBuilder;
java.util.Locale .getDefault ( );
/* invoke-direct {v2, v4, v5}, Ljava/util/Formatter;-><init>(Ljava/lang/Appendable;Ljava/util/Locale;)V */
this.mFormatter = v2;
/* .line 77 */
/* iput-boolean v3, p0, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->mFixed:Z */
/* .line 78 */
v2 = this.mInterstitialData;
/* iget v2, v2, Lcom/mobfox/video/sdk/InterstitialData;->autoclose:I */
/* if-lez v2, :cond_2 */
int v2 = 1; // const/4 v2, 0x1
} // :goto_0
/* iput-boolean v2, p0, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->mAutoclose:Z */
/* .line 79 */
/* const/16 v2, 0xbb8 */
/* iput v2, p0, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->mDefaultTimeout:I */
/* .line 80 */
v2 = this.mInterstitialData;
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 81 */
v2 = this.mInterstitialData;
/* iget-boolean v2, v2, Lcom/mobfox/video/sdk/InterstitialData;->allowTapNavigationBars:Z */
/* if-nez v2, :cond_1 */
/* .line 82 */
/* iput v3, p0, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->mDefaultTimeout:I */
/* .line 84 */
} // :cond_1
/* new-instance v2, Lcom/mobfox/video/sdk/ResourceManager; */
v3 = this.mContext;
v4 = this.mHandler;
/* invoke-direct {v2, v3, v4}, Lcom/mobfox/video/sdk/ResourceManager;-><init>(Landroid/content/Context;Landroid/os/Handler;)V */
this.mResourceManager = v2;
/* .line 85 */
/* invoke-direct {p0, v0}, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->buildNavigationBarView(Landroid/util/DisplayMetrics;)V */
/* .line 86 */
return;
} // :cond_2
/* move v2, v3 */
/* .line 78 */
} // .end method
static Integer access$0 ( com.mobfox.video.sdk.MobFoxInterstitialController p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 607 */
v0 = /* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->setProgress()I */
} // .end method
static Boolean access$1 ( com.mobfox.video.sdk.MobFoxInterstitialController p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 53 */
/* iget-boolean v0, p0, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->mShowing:Z */
} // .end method
static com.mobfox.video.sdk.AspectRatioImageViewWidth access$10 ( com.mobfox.video.sdk.MobFoxInterstitialController p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 48 */
v0 = this.mExternalButton;
} // .end method
static com.mobfox.video.sdk.MobFoxInterstitialController$BrowserControl access$11 ( com.mobfox.video.sdk.MobFoxInterstitialController p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 35 */
v0 = this.mBrowser;
} // .end method
static Integer access$12 ( com.mobfox.video.sdk.MobFoxInterstitialController p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 56 */
/* iget v0, p0, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->mDefaultTimeout:I */
} // .end method
static com.mobfox.video.sdk.InterstitialData access$2 ( com.mobfox.video.sdk.MobFoxInterstitialController p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 36 */
v0 = this.mInterstitialData;
} // .end method
static android.widget.LinearLayout access$3 ( com.mobfox.video.sdk.MobFoxInterstitialController p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 40 */
v0 = this.mTopBar;
} // .end method
static com.mobfox.video.sdk.ResourceManager access$4 ( com.mobfox.video.sdk.MobFoxInterstitialController p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 38 */
v0 = this.mResourceManager;
} // .end method
static com.mobfox.video.sdk.AspectRatioImageView access$5 ( com.mobfox.video.sdk.MobFoxInterstitialController p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 43 */
v0 = this.mTopBarBackground;
} // .end method
static android.widget.LinearLayout access$6 ( com.mobfox.video.sdk.MobFoxInterstitialController p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 41 */
v0 = this.mBottomBar;
} // .end method
static com.mobfox.video.sdk.AspectRatioImageViewWidth access$7 ( com.mobfox.video.sdk.MobFoxInterstitialController p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 45 */
v0 = this.mBackButton;
} // .end method
static com.mobfox.video.sdk.AspectRatioImageViewWidth access$8 ( com.mobfox.video.sdk.MobFoxInterstitialController p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 46 */
v0 = this.mForwardButton;
} // .end method
static com.mobfox.video.sdk.AspectRatioImageViewWidth access$9 ( com.mobfox.video.sdk.MobFoxInterstitialController p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 47 */
v0 = this.mReloadButton;
} // .end method
private void buildNavigationBarView ( android.util.DisplayMetrics p0 ) {
/* .locals 13 */
/* .param p1, "metrics" # Landroid/util/DisplayMetrics; */
/* .prologue */
/* const/high16 v12, 0x3f800000 # 1.0f */
int v8 = -1; // const/4 v8, -0x1
int v11 = 1; // const/4 v11, 0x1
int v10 = -2; // const/4 v10, -0x2
int v9 = 0; // const/4 v9, 0x0
/* .line 106 */
(( com.mobfox.video.sdk.MobFoxInterstitialController ) p0 ).setWeightSum ( v12 ); // invoke-virtual {p0, v12}, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->setWeightSum(F)V
/* .line 107 */
(( com.mobfox.video.sdk.MobFoxInterstitialController ) p0 ).setOrientation ( v11 ); // invoke-virtual {p0, v11}, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->setOrientation(I)V
/* .line 108 */
/* new-instance v4, Landroid/widget/LinearLayout$LayoutParams; */
/* .line 110 */
/* invoke-direct {v4, v8, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V */
/* .line 108 */
(( com.mobfox.video.sdk.MobFoxInterstitialController ) p0 ).setLayoutParams ( v4 ); // invoke-virtual {p0, v4}, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
/* .line 112 */
/* new-instance v4, Landroid/widget/LinearLayout; */
v5 = this.mContext;
/* invoke-direct {v4, v5}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V */
this.mTopBar = v4;
/* .line 113 */
v4 = this.mTopBar;
(( android.widget.LinearLayout ) v4 ).setOrientation ( v9 ); // invoke-virtual {v4, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V
/* .line 114 */
/* new-instance v3, Landroid/widget/LinearLayout$LayoutParams; */
/* invoke-direct {v3, v8, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V */
/* .line 117 */
/* .local v3, "params":Landroid/widget/LinearLayout$LayoutParams; */
/* const/16 v4, 0x30 */
/* iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->gravity:I */
/* .line 118 */
int v4 = 0; // const/4 v4, 0x0
/* iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->weight:F */
/* .line 119 */
v4 = this.mTopBar;
(( android.widget.LinearLayout ) v4 ).setLayoutParams ( v3 ); // invoke-virtual {v4, v3}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
/* .line 120 */
v4 = this.mTopBar;
(( android.widget.LinearLayout ) v4 ).setBackgroundColor ( v9 ); // invoke-virtual {v4, v9}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V
/* .line 121 */
v4 = this.mTopBar;
/* const/16 v5, 0x11 */
(( android.widget.LinearLayout ) v4 ).setGravity ( v5 ); // invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->setGravity(I)V
/* .line 123 */
/* const/high16 v4, 0x40800000 # 4.0f */
(( com.mobfox.video.sdk.MobFoxInterstitialController ) p0 ).getResources ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->getResources()Landroid/content/res/Resources;
/* .line 124 */
(( android.content.res.Resources ) v5 ).getDisplayMetrics ( ); // invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* .line 122 */
v4 = android.util.TypedValue .applyDimension ( v11,v4,v5 );
/* float-to-int v2, v4 */
/* .line 125 */
/* .local v2, "padding":I */
v4 = this.mTopBar;
(( android.widget.LinearLayout ) v4 ).setPadding ( v2, v9, v2, v9 ); // invoke-virtual {v4, v2, v9, v2, v9}, Landroid/widget/LinearLayout;->setPadding(IIII)V
/* .line 126 */
/* new-instance v4, Lcom/mobfox/video/sdk/AspectRatioImageView; */
v5 = this.mContext;
/* invoke-direct {v4, v5}, Lcom/mobfox/video/sdk/AspectRatioImageView;-><init>(Landroid/content/Context;)V */
this.mTopBarBackground = v4;
/* .line 127 */
v4 = this.mTopBarBackground;
(( com.mobfox.video.sdk.AspectRatioImageView ) v4 ).setLayoutParams ( v3 ); // invoke-virtual {v4, v3}, Lcom/mobfox/video/sdk/AspectRatioImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
/* .line 128 */
v4 = this.mTopBarBackground;
/* .line 129 */
v5 = (( com.mobfox.video.sdk.MobFoxInterstitialController ) p0 ).getWidth ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->getWidth()I
v6 = this.mTopBar;
v6 = (( android.widget.LinearLayout ) v6 ).getHeight ( ); // invoke-virtual {v6}, Landroid/widget/LinearLayout;->getHeight()I
(( com.mobfox.video.sdk.AspectRatioImageView ) v4 ).fillParent ( v11, v5, v6 ); // invoke-virtual {v4, v11, v5, v6}, Lcom/mobfox/video/sdk/AspectRatioImageView;->fillParent(ZII)V
/* .line 131 */
v4 = this.mTopBarBackground;
(( com.mobfox.video.sdk.MobFoxInterstitialController ) p0 ).addView ( v4, v3 ); // invoke-virtual {p0, v4, v3}, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 132 */
v4 = this.mTopBar;
(( com.mobfox.video.sdk.MobFoxInterstitialController ) p0 ).addView ( v4, v3 ); // invoke-virtual {p0, v4, v3}, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 134 */
/* new-instance v4, Landroid/widget/TextView; */
v5 = this.mContext;
/* invoke-direct {v4, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V */
this.mTitleText = v4;
/* .line 135 */
/* new-instance v3, Landroid/widget/LinearLayout$LayoutParams; */
} // .end local v3 # "params":Landroid/widget/LinearLayout$LayoutParams;
/* invoke-direct {v3, v10, v10, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V */
/* .line 138 */
/* .restart local v3 # "params":Landroid/widget/LinearLayout$LayoutParams; */
/* const/16 v4, 0x11 */
/* iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->gravity:I */
/* .line 139 */
v4 = this.mTitleText;
v5 = this.mContext;
/* .line 140 */
/* const v6, 0x1030046 */
/* .line 139 */
(( android.widget.TextView ) v4 ).setTextAppearance ( v5, v6 ); // invoke-virtual {v4, v5, v6}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V
/* .line 141 */
v4 = this.mTitleText;
android.graphics.Typeface .defaultFromStyle ( v11 );
(( android.widget.TextView ) v4 ).setTypeface ( v5 ); // invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V
/* .line 142 */
v4 = this.mTitleText;
/* const/16 v5, 0x11 */
(( android.widget.TextView ) v4 ).setGravity ( v5 ); // invoke-virtual {v4, v5}, Landroid/widget/TextView;->setGravity(I)V
/* .line 143 */
v4 = this.mTopBar;
v5 = this.mTitleText;
(( android.widget.LinearLayout ) v4 ).addView ( v5, v3 ); // invoke-virtual {v4, v5, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 145 */
/* new-instance v4, Landroid/widget/FrameLayout; */
v5 = this.mContext;
/* invoke-direct {v4, v5}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V */
this.mBrowserView = v4;
/* .line 146 */
/* new-instance v0, Landroid/widget/LinearLayout$LayoutParams; */
/* invoke-direct {v0, v8, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V */
/* .line 149 */
/* .local v0, "browserParams":Landroid/widget/LinearLayout$LayoutParams; */
/* const/16 v4, 0x30 */
/* iput v4, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I */
/* .line 150 */
/* iput v12, v0, Landroid/widget/LinearLayout$LayoutParams;->weight:F */
/* .line 151 */
v4 = this.mBrowserView;
(( android.widget.FrameLayout ) v4 ).setBackgroundColor ( v8 ); // invoke-virtual {v4, v8}, Landroid/widget/FrameLayout;->setBackgroundColor(I)V
/* .line 152 */
v4 = this.mBrowserView;
(( com.mobfox.video.sdk.MobFoxInterstitialController ) p0 ).addView ( v4, v0 ); // invoke-virtual {p0, v4, v0}, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 154 */
/* new-instance v4, Landroid/widget/LinearLayout; */
v5 = this.mContext;
/* invoke-direct {v4, v5}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V */
this.mBottomBar = v4;
/* .line 155 */
v4 = this.mBottomBar;
(( android.widget.LinearLayout ) v4 ).setOrientation ( v9 ); // invoke-virtual {v4, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V
/* .line 156 */
/* new-instance v3, Landroid/widget/LinearLayout$LayoutParams; */
/* .line 158 */
} // .end local v3 # "params":Landroid/widget/LinearLayout$LayoutParams;
/* iget v4, p1, Landroid/util/DisplayMetrics;->widthPixels:I */
/* int-to-double v4, v4 */
/* const-wide v6, 0x3fbe76c8b4395810L # 0.119 */
/* mul-double/2addr v4, v6 */
/* double-to-int v4, v4 */
/* .line 156 */
/* invoke-direct {v3, v8, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V */
/* .line 159 */
/* .restart local v3 # "params":Landroid/widget/LinearLayout$LayoutParams; */
/* const/16 v4, 0x50 */
/* iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->gravity:I */
/* .line 160 */
int v4 = 0; // const/4 v4, 0x0
/* iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->weight:F */
/* .line 161 */
v4 = this.mBottomBar;
(( android.widget.LinearLayout ) v4 ).setLayoutParams ( v3 ); // invoke-virtual {v4, v3}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
/* .line 162 */
v4 = this.mBottomBar;
(( android.widget.LinearLayout ) v4 ).setBackgroundColor ( v9 ); // invoke-virtual {v4, v9}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V
/* .line 163 */
v4 = this.mBottomBar;
/* const/16 v5, 0x10 */
(( android.widget.LinearLayout ) v4 ).setGravity ( v5 ); // invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->setGravity(I)V
/* .line 164 */
v4 = this.mBottomBar;
(( android.widget.LinearLayout ) v4 ).setWeightSum ( v12 ); // invoke-virtual {v4, v12}, Landroid/widget/LinearLayout;->setWeightSum(F)V
/* .line 165 */
/* new-instance v4, Lcom/mobfox/video/sdk/AspectRatioImageView; */
v5 = this.mContext;
/* invoke-direct {v4, v5}, Lcom/mobfox/video/sdk/AspectRatioImageView;-><init>(Landroid/content/Context;)V */
this.mBottomBarBackground = v4;
/* .line 167 */
v4 = this.mBottomBarBackground;
/* .line 168 */
v5 = (( com.mobfox.video.sdk.MobFoxInterstitialController ) p0 ).getWidth ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->getWidth()I
v6 = this.mBottomBar;
v6 = (( android.widget.LinearLayout ) v6 ).getHeight ( ); // invoke-virtual {v6}, Landroid/widget/LinearLayout;->getHeight()I
(( com.mobfox.video.sdk.AspectRatioImageView ) v4 ).fillParent ( v11, v5, v6 ); // invoke-virtual {v4, v11, v5, v6}, Lcom/mobfox/video/sdk/AspectRatioImageView;->fillParent(ZII)V
/* .line 170 */
v4 = this.mBottomBarBackground;
(( com.mobfox.video.sdk.MobFoxInterstitialController ) p0 ).addView ( v4 ); // invoke-virtual {p0, v4}, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->addView(Landroid/view/View;)V
/* .line 171 */
v4 = this.mBottomBar;
(( com.mobfox.video.sdk.MobFoxInterstitialController ) p0 ).addView ( v4, v3 ); // invoke-virtual {p0, v4, v3}, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 173 */
/* new-instance v1, Landroid/widget/LinearLayout; */
v4 = this.mContext;
/* invoke-direct {v1, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V */
/* .line 174 */
/* .local v1, "buttonPanel":Landroid/widget/LinearLayout; */
/* new-instance v3, Landroid/widget/LinearLayout$LayoutParams; */
/* .line 176 */
} // .end local v3 # "params":Landroid/widget/LinearLayout$LayoutParams;
int v4 = 0; // const/4 v4, 0x0
/* .line 174 */
/* invoke-direct {v3, v10, v8, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V */
/* .line 177 */
/* .restart local v3 # "params":Landroid/widget/LinearLayout$LayoutParams; */
/* const/16 v4, 0x13 */
/* iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->gravity:I */
/* .line 178 */
(( android.widget.LinearLayout ) v1 ).setOrientation ( v9 ); // invoke-virtual {v1, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V
/* .line 180 */
v4 = this.mBottomBar;
(( android.widget.LinearLayout ) v4 ).addView ( v1, v3 ); // invoke-virtual {v4, v1, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 189 */
/* const/high16 v4, 0x40800000 # 4.0f */
(( com.mobfox.video.sdk.MobFoxInterstitialController ) p0 ).getResources ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->getResources()Landroid/content/res/Resources;
/* .line 190 */
(( android.content.res.Resources ) v5 ).getDisplayMetrics ( ); // invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* .line 188 */
v4 = android.util.TypedValue .applyDimension ( v11,v4,v5 );
/* float-to-int v2, v4 */
/* .line 191 */
/* new-instance v4, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth; */
v5 = this.mContext;
/* invoke-direct {v4, v5}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;-><init>(Landroid/content/Context;)V */
this.mReloadButton = v4;
/* .line 192 */
/* new-instance v3, Landroid/widget/LinearLayout$LayoutParams; */
/* .line 193 */
} // .end local v3 # "params":Landroid/widget/LinearLayout$LayoutParams;
/* iget v4, p1, Landroid/util/DisplayMetrics;->widthPixels:I */
/* int-to-double v4, v4 */
/* iget-wide v6, p0, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->buttonWidthPercent:D */
/* mul-double/2addr v4, v6 */
/* double-to-int v4, v4 */
/* .line 194 */
/* iget v5, p1, Landroid/util/DisplayMetrics;->widthPixels:I */
/* int-to-double v5, v5 */
/* iget-wide v7, p0, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->buttonWidthPercent:D */
/* mul-double/2addr v5, v7 */
/* double-to-int v5, v5 */
/* .line 192 */
/* invoke-direct {v3, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V */
/* .line 195 */
/* .restart local v3 # "params":Landroid/widget/LinearLayout$LayoutParams; */
int v4 = 4; // const/4 v4, 0x4
/* iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I */
/* .line 196 */
int v4 = 4; // const/4 v4, 0x4
/* iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I */
/* .line 197 */
/* const/16 v4, 0x10 */
/* iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->gravity:I */
/* .line 198 */
v4 = this.mReloadButton;
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v4 ).setAdjustViewBounds ( v11 ); // invoke-virtual {v4, v11}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setAdjustViewBounds(Z)V
/* .line 199 */
v4 = this.mReloadButton;
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v4 ).setPadding ( v2, v9, v2, v9 ); // invoke-virtual {v4, v2, v9, v2, v9}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setPadding(IIII)V
/* .line 202 */
v4 = this.mReloadButton;
(( android.widget.LinearLayout ) v1 ).addView ( v4, v3 ); // invoke-virtual {v1, v4, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 204 */
/* new-instance v4, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth; */
v5 = this.mContext;
/* invoke-direct {v4, v5}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;-><init>(Landroid/content/Context;)V */
this.mBackButton = v4;
/* .line 205 */
v4 = this.mBackButton;
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v4 ).setPadding ( v2, v9, v2, v9 ); // invoke-virtual {v4, v2, v9, v2, v9}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setPadding(IIII)V
/* .line 206 */
v4 = this.mBackButton;
(( android.widget.LinearLayout ) v1 ).addView ( v4, v3 ); // invoke-virtual {v1, v4, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 208 */
/* new-instance v4, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth; */
v5 = this.mContext;
/* invoke-direct {v4, v5}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;-><init>(Landroid/content/Context;)V */
this.mForwardButton = v4;
/* .line 209 */
v4 = this.mForwardButton;
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v4 ).setPadding ( v2, v9, v2, v9 ); // invoke-virtual {v4, v2, v9, v2, v9}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setPadding(IIII)V
/* .line 210 */
v4 = this.mForwardButton;
(( android.widget.LinearLayout ) v1 ).addView ( v4, v3 ); // invoke-virtual {v1, v4, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 212 */
/* new-instance v4, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth; */
v5 = this.mContext;
/* invoke-direct {v4, v5}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;-><init>(Landroid/content/Context;)V */
this.mExternalButton = v4;
/* .line 213 */
v4 = this.mExternalButton;
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v4 ).setPadding ( v2, v9, v2, v9 ); // invoke-virtual {v4, v2, v9, v2, v9}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setPadding(IIII)V
/* .line 214 */
v4 = this.mExternalButton;
(( android.widget.LinearLayout ) v1 ).addView ( v4, v3 ); // invoke-virtual {v1, v4, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 216 */
/* new-instance v4, Lcom/mobfox/video/sdk/AutoResizeTextView; */
v5 = this.mContext;
/* invoke-direct {v4, v5}, Lcom/mobfox/video/sdk/AutoResizeTextView;-><init>(Landroid/content/Context;)V */
this.mLeftTime = v4;
/* .line 217 */
/* new-instance v3, Landroid/widget/LinearLayout$LayoutParams; */
} // .end local v3 # "params":Landroid/widget/LinearLayout$LayoutParams;
/* invoke-direct {v3, v10, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V */
/* .line 220 */
/* .restart local v3 # "params":Landroid/widget/LinearLayout$LayoutParams; */
/* const/16 v4, 0x11 */
/* iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->gravity:I */
/* .line 223 */
v4 = this.mLeftTime;
android.graphics.Typeface .defaultFromStyle ( v11 );
(( android.widget.TextView ) v4 ).setTypeface ( v5 ); // invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V
/* .line 224 */
v4 = this.mLeftTime;
(( android.widget.LinearLayout ) v1 ).addView ( v4, v3 ); // invoke-virtual {v1, v4, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 226 */
/* new-instance v4, Landroid/widget/LinearLayout; */
v5 = this.mContext;
/* invoke-direct {v4, v5}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V */
this.mNavIconsLayout = v4;
/* .line 227 */
/* new-instance v3, Landroid/widget/LinearLayout$LayoutParams; */
} // .end local v3 # "params":Landroid/widget/LinearLayout$LayoutParams;
/* invoke-direct {v3, v10, v10, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V */
/* .line 230 */
/* .restart local v3 # "params":Landroid/widget/LinearLayout$LayoutParams; */
/* const/16 v4, 0x15 */
/* iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->gravity:I */
/* .line 231 */
v4 = this.mNavIconsLayout;
(( android.widget.LinearLayout ) v4 ).setOrientation ( v9 ); // invoke-virtual {v4, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V
/* .line 232 */
v4 = this.mNavIconsLayout;
(( android.widget.LinearLayout ) v4 ).setPadding ( v9, v9, v9, v9 ); // invoke-virtual {v4, v9, v9, v9, v9}, Landroid/widget/LinearLayout;->setPadding(IIII)V
/* .line 233 */
v4 = this.mNavIconsLayout;
/* const/16 v5, 0x15 */
(( android.widget.LinearLayout ) v4 ).setGravity ( v5 ); // invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->setGravity(I)V
/* .line 234 */
v4 = this.mBottomBar;
v5 = this.mNavIconsLayout;
(( android.widget.LinearLayout ) v4 ).addView ( v5, v3 ); // invoke-virtual {v4, v5, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 235 */
/* invoke-direct {p0, v2, p1}, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->initNavigationBarControllerView(ILandroid/util/DisplayMetrics;)V */
/* .line 236 */
return;
} // .end method
private void initNavigationBarControllerView ( Integer p0, android.util.DisplayMetrics p1 ) {
/* .locals 13 */
/* .param p1, "padding" # I */
/* .param p2, "metrics" # Landroid/util/DisplayMetrics; */
/* .prologue */
int v12 = 4; // const/4 v12, 0x4
int v11 = 2; // const/4 v11, 0x2
int v7 = 0; // const/4 v7, 0x0
int v10 = 0; // const/4 v10, 0x0
/* const/16 v9, 0x8 */
/* .line 240 */
v4 = this.mInterstitialData;
/* iget-boolean v4, v4, Lcom/mobfox/video/sdk/InterstitialData;->showBottomNavigationBar:Z */
/* if-nez v4, :cond_4 */
/* .line 241 */
v4 = this.mBottomBar;
(( android.widget.LinearLayout ) v4 ).setVisibility ( v9 ); // invoke-virtual {v4, v9}, Landroid/widget/LinearLayout;->setVisibility(I)V
/* .line 357 */
} // :cond_0
v4 = this.mInterstitialData;
/* iget-boolean v4, v4, Lcom/mobfox/video/sdk/InterstitialData;->showTopNavigationBar:Z */
/* if-nez v4, :cond_14 */
/* .line 358 */
v4 = this.mTopBar;
(( android.widget.LinearLayout ) v4 ).setVisibility ( v12 ); // invoke-virtual {v4, v12}, Landroid/widget/LinearLayout;->setVisibility(I)V
/* .line 381 */
} // :cond_1
} // :goto_0
v4 = this.mInterstitialData;
/* iget-boolean v4, v4, Lcom/mobfox/video/sdk/InterstitialData;->showNavigationBars:Z */
/* if-nez v4, :cond_3 */
/* .line 382 */
v4 = this.mTopBar;
if ( v4 != null) { // if-eqz v4, :cond_2
/* .line 383 */
v4 = this.mTopBar;
(( android.widget.LinearLayout ) v4 ).setVisibility ( v9 ); // invoke-virtual {v4, v9}, Landroid/widget/LinearLayout;->setVisibility(I)V
/* .line 385 */
} // :cond_2
v4 = this.mBottomBar;
if ( v4 != null) { // if-eqz v4, :cond_3
/* .line 386 */
v4 = this.mBottomBar;
(( android.widget.LinearLayout ) v4 ).setVisibility ( v9 ); // invoke-virtual {v4, v9}, Landroid/widget/LinearLayout;->setVisibility(I)V
/* .line 389 */
} // :cond_3
return;
/* .line 243 */
} // :cond_4
v4 = this.mBottomBar;
(( android.widget.LinearLayout ) v4 ).setVisibility ( v10 ); // invoke-virtual {v4, v10}, Landroid/widget/LinearLayout;->setVisibility(I)V
/* .line 244 */
v4 = this.mInterstitialData;
v4 = this.bottomNavigationBarBackground;
if ( v4 != null) { // if-eqz v4, :cond_a
/* .line 245 */
v4 = this.mInterstitialData;
v4 = this.bottomNavigationBarBackground;
/* .line 246 */
v4 = (( java.lang.String ) v4 ).length ( ); // invoke-virtual {v4}, Ljava/lang/String;->length()I
/* if-lez v4, :cond_a */
/* .line 247 */
v4 = this.mResourceManager;
/* .line 248 */
v5 = this.mInterstitialData;
v5 = this.bottomNavigationBarBackground;
/* .line 247 */
(( com.mobfox.video.sdk.ResourceManager ) v4 ).fetchResource ( v5, v11 ); // invoke-virtual {v4, v5, v11}, Lcom/mobfox/video/sdk/ResourceManager;->fetchResource(Ljava/lang/String;I)V
/* .line 256 */
} // :goto_1
v4 = this.mBackButton;
if ( v4 != null) { // if-eqz v4, :cond_5
/* .line 257 */
v4 = this.mInterstitialData;
v4 = this.backButtonImage;
if ( v4 != null) { // if-eqz v4, :cond_b
/* .line 258 */
v4 = this.mInterstitialData;
v4 = this.backButtonImage;
v4 = (( java.lang.String ) v4 ).length ( ); // invoke-virtual {v4}, Ljava/lang/String;->length()I
/* if-lez v4, :cond_b */
/* .line 259 */
v4 = this.mBackButton;
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v4 ).setBackgroundDrawable ( v7 ); // invoke-virtual {v4, v7}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 260 */
v4 = this.mResourceManager;
/* .line 261 */
v5 = this.mInterstitialData;
v5 = this.backButtonImage;
/* .line 262 */
int v6 = 3; // const/4 v6, 0x3
/* .line 260 */
(( com.mobfox.video.sdk.ResourceManager ) v4 ).fetchResource ( v5, v6 ); // invoke-virtual {v4, v5, v6}, Lcom/mobfox/video/sdk/ResourceManager;->fetchResource(Ljava/lang/String;I)V
/* .line 269 */
} // :goto_2
v4 = this.mBackButton;
v5 = this.mBackListener;
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v4 ).setOnClickListener ( v5 ); // invoke-virtual {v4, v5}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 270 */
v4 = this.mInterstitialData;
/* iget-boolean v4, v4, Lcom/mobfox/video/sdk/InterstitialData;->showBackButton:Z */
if ( v4 != null) { // if-eqz v4, :cond_c
/* .line 271 */
v4 = this.mBackButton;
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v4 ).setVisibility ( v10 ); // invoke-virtual {v4, v10}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setVisibility(I)V
/* .line 277 */
} // :cond_5
} // :goto_3
v4 = this.mForwardButton;
if ( v4 != null) { // if-eqz v4, :cond_6
/* .line 278 */
v4 = this.mInterstitialData;
v4 = this.forwardButtonImage;
if ( v4 != null) { // if-eqz v4, :cond_d
/* .line 279 */
v4 = this.mInterstitialData;
v4 = this.forwardButtonImage;
v4 = (( java.lang.String ) v4 ).length ( ); // invoke-virtual {v4}, Ljava/lang/String;->length()I
/* if-lez v4, :cond_d */
/* .line 280 */
v4 = this.mForwardButton;
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v4 ).setBackgroundDrawable ( v7 ); // invoke-virtual {v4, v7}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 281 */
v4 = this.mResourceManager;
/* .line 282 */
v5 = this.mInterstitialData;
v5 = this.forwardButtonImage;
/* .line 281 */
(( com.mobfox.video.sdk.ResourceManager ) v4 ).fetchResource ( v5, v12 ); // invoke-virtual {v4, v5, v12}, Lcom/mobfox/video/sdk/ResourceManager;->fetchResource(Ljava/lang/String;I)V
/* .line 289 */
} // :goto_4
v4 = this.mForwardButton;
v5 = this.mForwardListener;
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v4 ).setOnClickListener ( v5 ); // invoke-virtual {v4, v5}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 290 */
v4 = this.mInterstitialData;
/* iget-boolean v4, v4, Lcom/mobfox/video/sdk/InterstitialData;->showForwardButton:Z */
if ( v4 != null) { // if-eqz v4, :cond_e
/* .line 291 */
v4 = this.mForwardButton;
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v4 ).setVisibility ( v10 ); // invoke-virtual {v4, v10}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setVisibility(I)V
/* .line 297 */
} // :cond_6
} // :goto_5
v4 = this.mReloadButton;
if ( v4 != null) { // if-eqz v4, :cond_7
/* .line 298 */
v4 = this.mInterstitialData;
v4 = this.reloadButtonImage;
if ( v4 != null) { // if-eqz v4, :cond_f
/* .line 299 */
v4 = this.mInterstitialData;
v4 = this.reloadButtonImage;
v4 = (( java.lang.String ) v4 ).length ( ); // invoke-virtual {v4}, Ljava/lang/String;->length()I
/* if-lez v4, :cond_f */
/* .line 300 */
v4 = this.mReloadButton;
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v4 ).setBackgroundDrawable ( v7 ); // invoke-virtual {v4, v7}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 301 */
v4 = this.mResourceManager;
/* .line 302 */
v5 = this.mInterstitialData;
v5 = this.reloadButtonImage;
/* .line 303 */
int v6 = 5; // const/4 v6, 0x5
/* .line 301 */
(( com.mobfox.video.sdk.ResourceManager ) v4 ).fetchResource ( v5, v6 ); // invoke-virtual {v4, v5, v6}, Lcom/mobfox/video/sdk/ResourceManager;->fetchResource(Ljava/lang/String;I)V
/* .line 309 */
} // :goto_6
v4 = this.mReloadButton;
v5 = this.mReloadListener;
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v4 ).setOnClickListener ( v5 ); // invoke-virtual {v4, v5}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 310 */
v4 = this.mInterstitialData;
/* iget-boolean v4, v4, Lcom/mobfox/video/sdk/InterstitialData;->showReloadButton:Z */
if ( v4 != null) { // if-eqz v4, :cond_10
/* .line 311 */
v4 = this.mReloadButton;
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v4 ).setVisibility ( v10 ); // invoke-virtual {v4, v10}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setVisibility(I)V
/* .line 317 */
} // :cond_7
} // :goto_7
v4 = this.mExternalButton;
if ( v4 != null) { // if-eqz v4, :cond_8
/* .line 318 */
v4 = this.mInterstitialData;
v4 = this.externalButtonImage;
if ( v4 != null) { // if-eqz v4, :cond_11
/* .line 319 */
v4 = this.mInterstitialData;
v4 = this.externalButtonImage;
v4 = (( java.lang.String ) v4 ).length ( ); // invoke-virtual {v4}, Ljava/lang/String;->length()I
/* if-lez v4, :cond_11 */
/* .line 320 */
v4 = this.mExternalButton;
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v4 ).setBackgroundDrawable ( v7 ); // invoke-virtual {v4, v7}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 321 */
v4 = this.mResourceManager;
/* .line 322 */
v5 = this.mInterstitialData;
v5 = this.externalButtonImage;
/* .line 323 */
int v6 = 6; // const/4 v6, 0x6
/* .line 321 */
(( com.mobfox.video.sdk.ResourceManager ) v4 ).fetchResource ( v5, v6 ); // invoke-virtual {v4, v5, v6}, Lcom/mobfox/video/sdk/ResourceManager;->fetchResource(Ljava/lang/String;I)V
/* .line 329 */
} // :goto_8
v4 = this.mExternalButton;
v5 = this.mExternalListener;
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v4 ).setOnClickListener ( v5 ); // invoke-virtual {v4, v5}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 330 */
v4 = this.mInterstitialData;
/* iget-boolean v4, v4, Lcom/mobfox/video/sdk/InterstitialData;->showExternalButton:Z */
if ( v4 != null) { // if-eqz v4, :cond_12
/* .line 331 */
v4 = this.mExternalButton;
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v4 ).setVisibility ( v10 ); // invoke-virtual {v4, v10}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setVisibility(I)V
/* .line 337 */
} // :cond_8
} // :goto_9
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
this.mFormatBuilder = v4;
/* .line 338 */
/* new-instance v4, Ljava/util/Formatter; */
v5 = this.mFormatBuilder;
java.util.Locale .getDefault ( );
/* invoke-direct {v4, v5, v6}, Ljava/util/Formatter;-><init>(Ljava/lang/Appendable;Ljava/util/Locale;)V */
this.mFormatter = v4;
/* .line 339 */
v4 = this.mLeftTime;
if ( v4 != null) { // if-eqz v4, :cond_9
/* .line 340 */
v4 = this.mInterstitialData;
/* iget-boolean v4, v4, Lcom/mobfox/video/sdk/InterstitialData;->showTimer:Z */
if ( v4 != null) { // if-eqz v4, :cond_13
/* iget-boolean v4, p0, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->mAutoclose:Z */
if ( v4 != null) { // if-eqz v4, :cond_13
/* .line 341 */
v4 = this.mLeftTime;
(( android.widget.TextView ) v4 ).setVisibility ( v10 ); // invoke-virtual {v4, v10}, Landroid/widget/TextView;->setVisibility(I)V
/* .line 346 */
} // :cond_9
} // :goto_a
v4 = this.mInterstitialData;
v4 = this.icons;
v4 = (( java.util.Vector ) v4 ).isEmpty ( ); // invoke-virtual {v4}, Ljava/util/Vector;->isEmpty()Z
/* if-nez v4, :cond_0 */
/* .line 347 */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
} // :goto_b
v4 = this.mInterstitialData;
v4 = this.icons;
v4 = (( java.util.Vector ) v4 ).size ( ); // invoke-virtual {v4}, Ljava/util/Vector;->size()I
/* if-ge v0, v4, :cond_0 */
/* .line 348 */
v4 = this.mInterstitialData;
v4 = this.icons;
(( java.util.Vector ) v4 ).get ( v0 ); // invoke-virtual {v4, v0}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
/* check-cast v2, Lcom/mobfox/video/sdk/NavIconData; */
/* .line 349 */
/* .local v2, "iconData":Lcom/mobfox/video/sdk/NavIconData; */
/* new-instance v1, Lcom/mobfox/video/sdk/NavIcon; */
v4 = this.mContext;
/* invoke-direct {v1, v4, v2}, Lcom/mobfox/video/sdk/NavIcon;-><init>(Landroid/content/Context;Lcom/mobfox/video/sdk/NavIconData;)V */
/* .line 350 */
/* .local v1, "icon":Lcom/mobfox/video/sdk/NavIcon; */
/* new-instance v3, Landroid/widget/LinearLayout$LayoutParams; */
/* .line 351 */
/* iget v4, p2, Landroid/util/DisplayMetrics;->widthPixels:I */
/* int-to-double v4, v4 */
/* iget-wide v6, p0, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->buttonWidthPercent:D */
/* mul-double/2addr v4, v6 */
/* double-to-int v4, v4 */
/* .line 352 */
/* iget v5, p2, Landroid/util/DisplayMetrics;->widthPixels:I */
/* int-to-double v5, v5 */
/* iget-wide v7, p0, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->buttonWidthPercent:D */
/* mul-double/2addr v5, v7 */
/* double-to-int v5, v5 */
/* .line 350 */
/* invoke-direct {v3, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V */
/* .line 353 */
/* .local v3, "params":Landroid/widget/LinearLayout$LayoutParams; */
v4 = this.mNavIconsLayout;
(( android.widget.LinearLayout ) v4 ).addView ( v1, v3 ); // invoke-virtual {v4, v1, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 347 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 251 */
} // .end local v0 # "i":I
} // .end local v1 # "icon":Lcom/mobfox/video/sdk/NavIcon;
} // .end local v2 # "iconData":Lcom/mobfox/video/sdk/NavIconData;
} // .end local v3 # "params":Landroid/widget/LinearLayout$LayoutParams;
} // :cond_a
v4 = this.mBottomBar;
/* .line 252 */
v5 = this.mResourceManager;
/* .line 253 */
int v6 = -2; // const/4 v6, -0x2
(( com.mobfox.video.sdk.ResourceManager ) v5 ).getResource ( v6 ); // invoke-virtual {v5, v6}, Lcom/mobfox/video/sdk/ResourceManager;->getResource(I)Landroid/graphics/drawable/Drawable;
/* .line 252 */
(( android.widget.LinearLayout ) v4 ).setBackgroundDrawable ( v5 ); // invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
/* goto/16 :goto_1 */
/* .line 264 */
} // :cond_b
v4 = this.mBackButton;
v5 = this.mResourceManager;
/* .line 265 */
/* const/16 v6, -0xe */
(( com.mobfox.video.sdk.ResourceManager ) v5 ).getResource ( v6 ); // invoke-virtual {v5, v6}, Lcom/mobfox/video/sdk/ResourceManager;->getResource(I)Landroid/graphics/drawable/Drawable;
/* .line 264 */
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v4 ).setImageDrawable ( v5 ); // invoke-virtual {v4, v5}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 266 */
v4 = this.mBackButton;
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v4 ).setEnabled ( v10 ); // invoke-virtual {v4, v10}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setEnabled(Z)V
/* goto/16 :goto_2 */
/* .line 273 */
} // :cond_c
v4 = this.mBackButton;
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v4 ).setVisibility ( v9 ); // invoke-virtual {v4, v9}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setVisibility(I)V
/* goto/16 :goto_3 */
/* .line 285 */
} // :cond_d
v4 = this.mForwardButton;
v5 = this.mResourceManager;
/* .line 286 */
/* const/16 v6, -0xf */
(( com.mobfox.video.sdk.ResourceManager ) v5 ).getResource ( v6 ); // invoke-virtual {v5, v6}, Lcom/mobfox/video/sdk/ResourceManager;->getResource(I)Landroid/graphics/drawable/Drawable;
/* .line 285 */
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v4 ).setImageDrawable ( v5 ); // invoke-virtual {v4, v5}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* goto/16 :goto_4 */
/* .line 293 */
} // :cond_e
v4 = this.mForwardButton;
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v4 ).setVisibility ( v9 ); // invoke-virtual {v4, v9}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setVisibility(I)V
/* goto/16 :goto_5 */
/* .line 305 */
} // :cond_f
v4 = this.mReloadButton;
v5 = this.mResourceManager;
/* .line 306 */
/* const/16 v6, -0x10 */
(( com.mobfox.video.sdk.ResourceManager ) v5 ).getResource ( v6 ); // invoke-virtual {v5, v6}, Lcom/mobfox/video/sdk/ResourceManager;->getResource(I)Landroid/graphics/drawable/Drawable;
/* .line 305 */
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v4 ).setImageDrawable ( v5 ); // invoke-virtual {v4, v5}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* goto/16 :goto_6 */
/* .line 313 */
} // :cond_10
v4 = this.mReloadButton;
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v4 ).setVisibility ( v9 ); // invoke-virtual {v4, v9}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setVisibility(I)V
/* goto/16 :goto_7 */
/* .line 325 */
} // :cond_11
v4 = this.mExternalButton;
v5 = this.mResourceManager;
/* .line 326 */
/* const/16 v6, -0x11 */
(( com.mobfox.video.sdk.ResourceManager ) v5 ).getResource ( v6 ); // invoke-virtual {v5, v6}, Lcom/mobfox/video/sdk/ResourceManager;->getResource(I)Landroid/graphics/drawable/Drawable;
/* .line 325 */
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v4 ).setImageDrawable ( v5 ); // invoke-virtual {v4, v5}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* goto/16 :goto_8 */
/* .line 333 */
} // :cond_12
v4 = this.mExternalButton;
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v4 ).setVisibility ( v9 ); // invoke-virtual {v4, v9}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setVisibility(I)V
/* goto/16 :goto_9 */
/* .line 343 */
} // :cond_13
v4 = this.mLeftTime;
(( android.widget.TextView ) v4 ).setVisibility ( v9 ); // invoke-virtual {v4, v9}, Landroid/widget/TextView;->setVisibility(I)V
/* goto/16 :goto_a */
/* .line 360 */
} // :cond_14
v4 = this.mTopBar;
(( android.widget.LinearLayout ) v4 ).setVisibility ( v10 ); // invoke-virtual {v4, v10}, Landroid/widget/LinearLayout;->setVisibility(I)V
/* .line 361 */
v4 = this.mInterstitialData;
v4 = this.topNavigationBarBackground;
if ( v4 != null) { // if-eqz v4, :cond_15
/* .line 362 */
v4 = this.mInterstitialData;
v4 = this.topNavigationBarBackground;
v4 = (( java.lang.String ) v4 ).length ( ); // invoke-virtual {v4}, Ljava/lang/String;->length()I
/* if-lez v4, :cond_15 */
/* .line 363 */
v4 = this.mResourceManager;
/* .line 364 */
v5 = this.mInterstitialData;
v5 = this.topNavigationBarBackground;
/* .line 365 */
int v6 = 1; // const/4 v6, 0x1
/* .line 363 */
(( com.mobfox.video.sdk.ResourceManager ) v4 ).fetchResource ( v5, v6 ); // invoke-virtual {v4, v5, v6}, Lcom/mobfox/video/sdk/ResourceManager;->fetchResource(Ljava/lang/String;I)V
/* .line 371 */
} // :goto_c
v4 = this.mTitleText;
if ( v4 != null) { // if-eqz v4, :cond_1
/* .line 372 */
v4 = this.mInterstitialData;
/* iget v4, v4, Lcom/mobfox/video/sdk/InterstitialData;->topNavigationBarTitleType:I */
/* if-nez v4, :cond_16 */
/* .line 373 */
v4 = this.mTitleText;
v5 = this.mInterstitialData;
v5 = this.topNavigationBarTitle;
(( android.widget.TextView ) v4 ).setText ( v5 ); // invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* goto/16 :goto_0 */
/* .line 367 */
} // :cond_15
v4 = this.mTopBarBackground;
v5 = this.mResourceManager;
/* .line 368 */
int v6 = -1; // const/4 v6, -0x1
(( com.mobfox.video.sdk.ResourceManager ) v5 ).getResource ( v6 ); // invoke-virtual {v5, v6}, Lcom/mobfox/video/sdk/ResourceManager;->getResource(I)Landroid/graphics/drawable/Drawable;
/* .line 367 */
(( com.mobfox.video.sdk.AspectRatioImageView ) v4 ).setImageDrawable ( v5 ); // invoke-virtual {v4, v5}, Lcom/mobfox/video/sdk/AspectRatioImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 375 */
} // :cond_16
v4 = this.mInterstitialData;
/* iget v4, v4, Lcom/mobfox/video/sdk/InterstitialData;->topNavigationBarTitleType:I */
/* if-ne v4, v11, :cond_1 */
/* .line 376 */
v4 = this.mTitleText;
(( android.widget.TextView ) v4 ).setVisibility ( v9 ); // invoke-virtual {v4, v9}, Landroid/widget/TextView;->setVisibility(I)V
/* goto/16 :goto_0 */
} // .end method
private Integer setProgress ( ) {
/* .locals 5 */
/* .prologue */
/* .line 608 */
int v1 = 0; // const/4 v1, 0x0
/* .line 609 */
/* .local v1, "position":I */
v3 = this.mBrowser;
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 610 */
v1 = v3 = this.mBrowser;
/* .line 612 */
} // :cond_0
v3 = this.mInterstitialData;
/* iget v3, v3, Lcom/mobfox/video/sdk/InterstitialData;->autoclose:I */
/* mul-int/lit16 v0, v3, 0x3e8 */
/* .line 613 */
/* .local v0, "duration":I */
/* sub-int v2, v0, v1 */
/* .line 614 */
/* .local v2, "timeLeft":I */
/* iget-boolean v3, p0, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->mAutoclose:Z */
if ( v3 != null) { // if-eqz v3, :cond_4
/* if-lez v0, :cond_4 */
/* if-ltz v2, :cond_4 */
/* .line 615 */
v3 = this.mLeftTime;
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 616 */
v3 = this.mLeftTime;
/* invoke-direct {p0, v2}, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->stringForTime(I)Ljava/lang/String; */
(( android.widget.TextView ) v3 ).setText ( v4 ); // invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 623 */
} // :cond_1
} // :goto_0
v3 = this.mTitleText;
if ( v3 != null) { // if-eqz v3, :cond_3
/* .line 624 */
v3 = this.mInterstitialData;
/* iget v3, v3, Lcom/mobfox/video/sdk/InterstitialData;->topNavigationBarTitleType:I */
int v4 = 1; // const/4 v4, 0x1
/* if-ne v3, v4, :cond_3 */
/* .line 625 */
v3 = this.mBrowser;
if ( v3 != null) { // if-eqz v3, :cond_3
/* .line 626 */
v3 = this.mTitle;
if ( v3 != null) { // if-eqz v3, :cond_2
/* .line 627 */
v3 = this.mTitle;
v4 = this.mBrowser;
v3 = (( java.lang.String ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v3, :cond_3 */
/* .line 628 */
} // :cond_2
v3 = this.mBrowser;
this.mTitle = v3;
/* .line 629 */
v3 = this.mTitleText;
v4 = this.mTitle;
(( android.widget.TextView ) v3 ).setText ( v4 ); // invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 635 */
} // :cond_3
/* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->updateBackForward()V */
/* .line 636 */
/* .line 619 */
} // :cond_4
v3 = this.mLeftTime;
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 620 */
v3 = this.mLeftTime;
/* const/16 v4, 0x8 */
(( android.widget.TextView ) v3 ).setVisibility ( v4 ); // invoke-virtual {v3, v4}, Landroid/widget/TextView;->setVisibility(I)V
} // .end method
private java.lang.String stringForTime ( Integer p0 ) {
/* .locals 11 */
/* .param p1, "timeMs" # I */
/* .prologue */
int v10 = 2; // const/4 v10, 0x2
int v9 = 1; // const/4 v9, 0x1
int v8 = 0; // const/4 v8, 0x0
/* .line 590 */
/* div-int/lit16 v3, p1, 0x3e8 */
/* .line 592 */
/* .local v3, "totalSeconds":I */
/* rem-int/lit8 v2, v3, 0x3c */
/* .line 593 */
/* .local v2, "seconds":I */
/* div-int/lit8 v4, v3, 0x3c */
/* rem-int/lit8 v1, v4, 0x3c */
/* .line 594 */
/* .local v1, "minutes":I */
/* div-int/lit16 v0, v3, 0xe10 */
/* .line 596 */
/* .local v0, "hours":I */
v4 = this.mFormatBuilder;
(( java.lang.StringBuilder ) v4 ).setLength ( v8 ); // invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->setLength(I)V
/* .line 597 */
/* if-lez v0, :cond_0 */
/* .line 598 */
v4 = this.mFormatter;
final String v5 = "%d:%02d:%02d"; // const-string v5, "%d:%02d:%02d"
int v6 = 3; // const/4 v6, 0x3
/* new-array v6, v6, [Ljava/lang/Object; */
java.lang.Integer .valueOf ( v0 );
/* aput-object v7, v6, v8 */
java.lang.Integer .valueOf ( v1 );
/* aput-object v7, v6, v9 */
java.lang.Integer .valueOf ( v2 );
/* aput-object v7, v6, v10 */
(( java.util.Formatter ) v4 ).format ( v5, v6 ); // invoke-virtual {v4, v5, v6}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;
/* .line 599 */
(( java.util.Formatter ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/util/Formatter;->toString()Ljava/lang/String;
/* .line 603 */
} // :goto_0
/* .line 600 */
} // :cond_0
/* if-lez v1, :cond_1 */
/* .line 601 */
v4 = this.mFormatter;
final String v5 = "%02d:%02d"; // const-string v5, "%02d:%02d"
/* new-array v6, v10, [Ljava/lang/Object; */
java.lang.Integer .valueOf ( v1 );
/* aput-object v7, v6, v8 */
java.lang.Integer .valueOf ( v2 );
/* aput-object v7, v6, v9 */
(( java.util.Formatter ) v4 ).format ( v5, v6 ); // invoke-virtual {v4, v5, v6}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;
(( java.util.Formatter ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/util/Formatter;->toString()Ljava/lang/String;
/* .line 603 */
} // :cond_1
v4 = this.mFormatter;
final String v5 = "0:%02d"; // const-string v5, "0:%02d"
/* new-array v6, v9, [Ljava/lang/Object; */
java.lang.Integer .valueOf ( v2 );
/* aput-object v7, v6, v8 */
(( java.util.Formatter ) v4 ).format ( v5, v6 ); // invoke-virtual {v4, v5, v6}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;
(( java.util.Formatter ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/util/Formatter;->toString()Ljava/lang/String;
} // .end method
private void updateBackForward ( ) {
/* .locals 3 */
/* .prologue */
int v2 = 1; // const/4 v2, 0x1
int v1 = 0; // const/4 v1, 0x0
/* .line 672 */
v0 = this.mBrowser;
/* if-nez v0, :cond_1 */
/* .line 693 */
} // :cond_0
} // :goto_0
return;
/* .line 675 */
} // :cond_1
v0 = v0 = this.mBrowser;
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 676 */
v0 = this.mBackButton;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 677 */
v0 = this.mBackButton;
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v0 ).setEnabled ( v2 ); // invoke-virtual {v0, v2}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setEnabled(Z)V
/* .line 684 */
} // :cond_2
} // :goto_1
v0 = v0 = this.mBrowser;
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 685 */
v0 = this.mForwardButton;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 686 */
v0 = this.mForwardButton;
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v0 ).setEnabled ( v2 ); // invoke-virtual {v0, v2}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setEnabled(Z)V
/* .line 680 */
} // :cond_3
v0 = this.mBackButton;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 681 */
v0 = this.mBackButton;
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v0 ).setEnabled ( v1 ); // invoke-virtual {v0, v1}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setEnabled(Z)V
/* .line 689 */
} // :cond_4
v0 = this.mForwardButton;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 690 */
v0 = this.mForwardButton;
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v0 ).setEnabled ( v1 ); // invoke-virtual {v0, v1}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setEnabled(Z)V
} // .end method
/* # virtual methods */
public Boolean canToggle ( ) {
/* .locals 1 */
/* .prologue */
/* .line 696 */
v0 = this.mInterstitialData;
/* iget-boolean v0, v0, Lcom/mobfox/video/sdk/InterstitialData;->allowTapNavigationBars:Z */
} // .end method
public void hide ( ) {
/* .locals 4 */
/* .prologue */
/* const/16 v3, 0x8 */
int v2 = 0; // const/4 v2, 0x0
/* .line 453 */
v0 = (( com.mobfox.video.sdk.MobFoxInterstitialController ) p0 ).canToggle ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->canToggle()Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 454 */
/* iget-boolean v0, p0, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->mShowing:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 455 */
v0 = this.mHandler;
int v1 = 2; // const/4 v1, 0x2
(( android.os.Handler ) v0 ).removeMessages ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
/* .line 456 */
v0 = this.mTopBar;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 457 */
v0 = this.mTopBar;
(( android.widget.LinearLayout ) v0 ).setVisibility ( v3 ); // invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V
/* .line 459 */
} // :cond_0
v0 = this.mBottomBar;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 460 */
v0 = this.mBottomBar;
(( android.widget.LinearLayout ) v0 ).setVisibility ( v3 ); // invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V
/* .line 462 */
} // :cond_1
/* iput-boolean v2, p0, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->mShowing:Z */
/* .line 463 */
/* iput-boolean v2, p0, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->mFixed:Z */
/* .line 466 */
} // :cond_2
return;
} // .end method
public Boolean isShowing ( ) {
/* .locals 1 */
/* .prologue */
/* .line 445 */
/* iget-boolean v0, p0, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->mShowing:Z */
} // .end method
public Boolean onInterceptTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 1 */
/* .param p1, "ev" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 701 */
(( com.mobfox.video.sdk.MobFoxInterstitialController ) p0 ).onTouchEvent ( p1 ); // invoke-virtual {p0, p1}, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->onTouchEvent(Landroid/view/MotionEvent;)Z
/* .line 702 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 1 */
/* .param p1, "event" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 707 */
/* invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z */
/* .line 708 */
(( com.mobfox.video.sdk.MobFoxInterstitialController ) p0 ).resetAutoclose ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->resetAutoclose()V
/* .line 709 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public void pageLoaded ( ) {
/* .locals 0 */
/* .prologue */
/* .line 503 */
/* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->setProgress()I */
/* .line 504 */
return;
} // .end method
public void reload ( ) {
/* .locals 1 */
/* .prologue */
/* .line 492 */
v0 = this.mBrowser;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 493 */
v0 = this.mBrowser;
/* .line 495 */
} // :cond_0
/* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->setProgress()I */
/* .line 496 */
/* iget v0, p0, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->mDefaultTimeout:I */
(( com.mobfox.video.sdk.MobFoxInterstitialController ) p0 ).show ( v0 ); // invoke-virtual {p0, v0}, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->show(I)V
/* .line 497 */
v0 = this.mOnReloadListener;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 498 */
v0 = this.mOnReloadListener;
/* .line 500 */
} // :cond_1
return;
} // .end method
public void resetAutoclose ( ) {
/* .locals 1 */
/* .prologue */
/* .line 392 */
/* iget-boolean v0, p0, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->mAutoclose:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 393 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->mAutoclose:Z */
/* .line 394 */
v0 = this.mOnResetAutocloseListener;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 395 */
v0 = this.mOnResetAutocloseListener;
/* .line 398 */
} // :cond_0
return;
} // .end method
public void resizeTopBar ( Integer p0 ) {
/* .locals 5 */
/* .param p1, "bottom" # I */
/* .prologue */
/* .line 469 */
/* if-gtz p1, :cond_1 */
/* .line 479 */
} // :cond_0
} // :goto_0
return;
/* .line 472 */
} // :cond_1
int v2 = 1; // const/4 v2, 0x1
/* const/high16 v3, 0x40800000 # 4.0f */
(( com.mobfox.video.sdk.MobFoxInterstitialController ) p0 ).getResources ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->getResources()Landroid/content/res/Resources;
/* .line 473 */
(( android.content.res.Resources ) v4 ).getDisplayMetrics ( ); // invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* .line 471 */
v2 = android.util.TypedValue .applyDimension ( v2,v3,v4 );
/* float-to-int v0, v2 */
/* .line 474 */
/* .local v0, "padding":I */
v2 = this.mTopBar;
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 475 */
v2 = this.mTopBar;
(( android.widget.LinearLayout ) v2 ).getLayoutParams ( ); // invoke-virtual {v2}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* .line 476 */
/* .local v1, "params":Landroid/view/ViewGroup$LayoutParams; */
/* add-int v2, p1, v0 */
/* iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I */
/* .line 477 */
v2 = this.mTopBar;
(( android.widget.LinearLayout ) v2 ).setLayoutParams ( v1 ); // invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
} // .end method
public void setBrowser ( com.mobfox.video.sdk.MobFoxInterstitialController$BrowserControl p0 ) {
/* .locals 0 */
/* .param p1, "browser" # Lcom/mobfox/video/sdk/MobFoxInterstitialController$BrowserControl; */
/* .prologue */
/* .line 95 */
this.mBrowser = p1;
/* .line 96 */
/* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->updateBackForward()V */
/* .line 97 */
return;
} // .end method
public void setBrowserView ( android.view.View p0 ) {
/* .locals 4 */
/* .param p1, "browserView" # Landroid/view/View; */
/* .prologue */
int v3 = -1; // const/4 v3, -0x1
/* .line 89 */
v0 = this.mBrowserView;
/* new-instance v1, Landroid/widget/FrameLayout$LayoutParams; */
/* .line 91 */
/* const/16 v2, 0x11 */
/* invoke-direct {v1, v3, v3, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V */
/* .line 89 */
(( android.widget.FrameLayout ) v0 ).addView ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 92 */
return;
} // .end method
public void setOnReloadListener ( com.mobfox.video.sdk.MobFoxInterstitialController$OnReloadListener p0 ) {
/* .locals 0 */
/* .param p1, "l" # Lcom/mobfox/video/sdk/MobFoxInterstitialController$OnReloadListener; */
/* .prologue */
/* .line 713 */
this.mOnReloadListener = p1;
/* .line 714 */
return;
} // .end method
public void setOnResetAutocloseListener ( com.mobfox.video.sdk.MobFoxInterstitialController$OnResetAutocloseListener p0 ) {
/* .locals 0 */
/* .param p1, "l" # Lcom/mobfox/video/sdk/MobFoxInterstitialController$OnResetAutocloseListener; */
/* .prologue */
/* .line 717 */
this.mOnResetAutocloseListener = p1;
/* .line 718 */
return;
} // .end method
public void show ( ) {
/* .locals 1 */
/* .prologue */
/* .line 405 */
/* iget v0, p0, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->mDefaultTimeout:I */
(( com.mobfox.video.sdk.MobFoxInterstitialController ) p0 ).show ( v0 ); // invoke-virtual {p0, v0}, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->show(I)V
/* .line 406 */
return;
} // .end method
public void show ( Integer p0 ) {
/* .locals 4 */
/* .param p1, "timeout" # I */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
int v3 = 1; // const/4 v3, 0x1
/* .line 418 */
/* if-nez p1, :cond_0 */
/* .line 419 */
/* iput-boolean v3, p0, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->mFixed:Z */
/* .line 421 */
} // :cond_0
/* iget-boolean v1, p0, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->mShowing:Z */
/* if-nez v1, :cond_3 */
/* .line 422 */
/* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->setProgress()I */
/* .line 423 */
v1 = this.mTopBar;
if ( v1 != null) { // if-eqz v1, :cond_1
v1 = this.mInterstitialData;
/* iget-boolean v1, v1, Lcom/mobfox/video/sdk/InterstitialData;->showTopNavigationBar:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 424 */
v1 = this.mTopBar;
(( android.widget.LinearLayout ) v1 ).setVisibility ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V
/* .line 426 */
} // :cond_1
v1 = this.mBottomBar;
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 427 */
v1 = this.mInterstitialData;
/* iget-boolean v1, v1, Lcom/mobfox/video/sdk/InterstitialData;->showBottomNavigationBar:Z */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 428 */
v1 = this.mBottomBar;
(( android.widget.LinearLayout ) v1 ).setVisibility ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V
/* .line 430 */
} // :cond_2
/* iput-boolean v3, p0, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->mShowing:Z */
/* .line 432 */
} // :cond_3
/* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->updateBackForward()V */
/* .line 436 */
v1 = this.mHandler;
(( android.os.Handler ) v1 ).removeMessages ( v3 ); // invoke-virtual {v1, v3}, Landroid/os/Handler;->removeMessages(I)V
/* .line 437 */
v1 = this.mHandler;
int v2 = 2; // const/4 v2, 0x2
(( android.os.Handler ) v1 ).sendEmptyMessage ( v2 ); // invoke-virtual {v1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z
/* .line 438 */
if ( p1 != null) { // if-eqz p1, :cond_4
/* iget-boolean v1, p0, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->mFixed:Z */
/* if-nez v1, :cond_4 */
/* .line 439 */
v1 = this.mHandler;
(( android.os.Handler ) v1 ).obtainMessage ( v3 ); // invoke-virtual {v1, v3}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;
/* .line 440 */
/* .local v0, "msg":Landroid/os/Message; */
v1 = this.mHandler;
/* int-to-long v2, p1 */
(( android.os.Handler ) v1 ).sendMessageDelayed ( v0, v2, v3 ); // invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z
/* .line 442 */
} // .end local v0 # "msg":Landroid/os/Message;
} // :cond_4
return;
} // .end method
public void toggle ( ) {
/* .locals 1 */
/* .prologue */
/* .line 482 */
v0 = (( com.mobfox.video.sdk.MobFoxInterstitialController ) p0 ).canToggle ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->canToggle()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 483 */
/* iget-boolean v0, p0, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->mShowing:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 484 */
(( com.mobfox.video.sdk.MobFoxInterstitialController ) p0 ).hide ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->hide()V
/* .line 489 */
} // :cond_0
} // :goto_0
return;
/* .line 486 */
} // :cond_1
(( com.mobfox.video.sdk.MobFoxInterstitialController ) p0 ).show ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->show()V
} // .end method
