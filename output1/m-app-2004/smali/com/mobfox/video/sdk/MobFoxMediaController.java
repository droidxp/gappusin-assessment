public class com.mobfox.video.sdk.MobFoxMediaController extends android.widget.FrameLayout {
	 /* .source "MobFoxMediaController.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/mobfox/video/sdk/MobFoxMediaController$MediaPlayerControl;, */
	 /* Lcom/mobfox/video/sdk/MobFoxMediaController$OnPauseListener;, */
	 /* Lcom/mobfox/video/sdk/MobFoxMediaController$OnReplayListener;, */
	 /* Lcom/mobfox/video/sdk/MobFoxMediaController$OnUnpauseListener; */
	 /* } */
} // .end annotation
/* # static fields */
private static final Integer BOTTOMBAR_BACKGROUND_RESOURCE_ID;
private static final Integer DEFAULT_TIMEOUT;
private static final Integer FADE_OUT;
private static final Integer PAUSE_IMAGE_RESOURCE_ID;
private static final Integer PLAY_IMAGE_RESOURCE_ID;
private static final Integer REPLAY_IMAGE_RESOURCE_ID;
private static final Integer SHOW_PROGRESS;
private static final Integer TOPBAR_BACKGROUND_RESOURCE_ID;
/* # instance fields */
private Double buttonWidthPercent;
private android.widget.LinearLayout mBottomBar;
private android.widget.ImageView mBottomBarBackground;
private android.content.Context mContext;
private Boolean mFixed;
java.lang.StringBuilder mFormatBuilder;
java.util.Formatter mFormatter;
private android.os.Handler mHandler;
private android.widget.TextView mLeftTime;
private android.widget.LinearLayout mNavIconsLayout;
private com.mobfox.video.sdk.MobFoxMediaController$OnPauseListener mOnPauseListener;
private com.mobfox.video.sdk.MobFoxMediaController$OnReplayListener mOnReplayListener;
private com.mobfox.video.sdk.MobFoxMediaController$OnUnpauseListener mOnUnpauseListener;
private com.mobfox.video.sdk.AspectRatioImageViewWidth mPauseButton;
private android.view.View$OnClickListener mPauseListener;
private com.mobfox.video.sdk.MobFoxMediaController$MediaPlayerControl mPlayer;
private com.mobfox.video.sdk.AspectRatioImageViewWidth mReplayButton;
private android.view.View$OnClickListener mReplayListener;
private com.mobfox.video.sdk.ResourceManager mResourceManager;
private Boolean mShowing;
private android.widget.LinearLayout mTopBar;
private android.widget.ImageView mTopBarBackground;
private com.mobfox.video.sdk.VideoData mVideoData;
/* # direct methods */
public com.mobfox.video.sdk.MobFoxMediaController ( ) {
	 /* .locals 5 */
	 /* .param p1, "context" # Landroid/content/Context; */
	 /* .param p2, "videoData" # Lcom/mobfox/video/sdk/VideoData; */
	 /* .prologue */
	 int v4 = 0; // const/4 v4, 0x0
	 /* .line 62 */
	 /* invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V */
	 /* .line 39 */
	 /* const-wide v2, 0x3fb70a3d70a3d70aL # 0.09 */
	 /* iput-wide v2, p0, Lcom/mobfox/video/sdk/MobFoxMediaController;->buttonWidthPercent:D */
	 /* .line 441 */
	 /* new-instance v2, Lcom/mobfox/video/sdk/MobFoxMediaController$1; */
	 /* invoke-direct {v2, p0}, Lcom/mobfox/video/sdk/MobFoxMediaController$1;-><init>(Lcom/mobfox/video/sdk/MobFoxMediaController;)V */
	 this.mHandler = v2;
	 /* .line 566 */
	 /* new-instance v2, Lcom/mobfox/video/sdk/MobFoxMediaController$2; */
	 /* invoke-direct {v2, p0}, Lcom/mobfox/video/sdk/MobFoxMediaController$2;-><init>(Lcom/mobfox/video/sdk/MobFoxMediaController;)V */
	 this.mPauseListener = v2;
	 /* .line 652 */
	 /* new-instance v2, Lcom/mobfox/video/sdk/MobFoxMediaController$3; */
	 /* invoke-direct {v2, p0}, Lcom/mobfox/video/sdk/MobFoxMediaController$3;-><init>(Lcom/mobfox/video/sdk/MobFoxMediaController;)V */
	 this.mReplayListener = v2;
	 /* .line 63 */
	 int v2 = 4; // const/4 v2, 0x4
	 (( com.mobfox.video.sdk.MobFoxMediaController ) p0 ).setVisibility ( v2 ); // invoke-virtual {p0, v2}, Lcom/mobfox/video/sdk/MobFoxMediaController;->setVisibility(I)V
	 /* .line 64 */
	 /* new-instance v0, Landroid/util/DisplayMetrics; */
	 /* invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V */
	 /* .line 66 */
	 /* .local v0, "metrics":Landroid/util/DisplayMetrics; */
	 final String v2 = "window"; // const-string v2, "window"
	 (( android.content.Context ) p1 ).getSystemService ( v2 ); // invoke-virtual {p1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
	 /* .line 65 */
	 /* check-cast v1, Landroid/view/WindowManager; */
	 /* .line 67 */
	 /* .local v1, "wm":Landroid/view/WindowManager; */
	 (( android.view.Display ) v2 ).getMetrics ( v0 ); // invoke-virtual {v2, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V
	 /* .line 71 */
	 /* iput-boolean v4, p0, Lcom/mobfox/video/sdk/MobFoxMediaController;->mShowing:Z */
	 /* .line 72 */
	 /* iput-boolean v4, p0, Lcom/mobfox/video/sdk/MobFoxMediaController;->mFixed:Z */
	 /* .line 73 */
	 this.mContext = p1;
	 /* .line 74 */
	 this.mVideoData = p2;
	 /* .line 75 */
	 v2 = this.mVideoData;
	 /* if-nez v2, :cond_0 */
	 /* .line 76 */
	 /* new-instance v2, Ljava/lang/IllegalArgumentException; */
	 final String v3 = "Video info cannot be null"; // const-string v3, "Video info cannot be null"
	 /* invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw v2 */
	 /* .line 78 */
} // :cond_0
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
this.mFormatBuilder = v2;
/* .line 79 */
/* new-instance v2, Ljava/util/Formatter; */
v3 = this.mFormatBuilder;
java.util.Locale .getDefault ( );
/* invoke-direct {v2, v3, v4}, Ljava/util/Formatter;-><init>(Ljava/lang/Appendable;Ljava/util/Locale;)V */
this.mFormatter = v2;
/* .line 80 */
/* new-instance v2, Lcom/mobfox/video/sdk/ResourceManager; */
v3 = this.mContext;
v4 = this.mHandler;
/* invoke-direct {v2, v3, v4}, Lcom/mobfox/video/sdk/ResourceManager;-><init>(Landroid/content/Context;Landroid/os/Handler;)V */
this.mResourceManager = v2;
/* .line 81 */
(( com.mobfox.video.sdk.MobFoxMediaController ) p0 ).buildNavigationBarView ( v0 ); // invoke-virtual {p0, v0}, Lcom/mobfox/video/sdk/MobFoxMediaController;->buildNavigationBarView(Landroid/util/DisplayMetrics;)V
/* .line 82 */
final String v2 = "MOBFOX"; // const-string v2, "MOBFOX"
int v3 = 3; // const/4 v3, 0x3
v2 = android.util.Log .isLoggable ( v2,v3 );
if ( v2 != null) { // if-eqz v2, :cond_1
	 /* .line 83 */
	 final String v2 = "MOBFOX"; // const-string v2, "MOBFOX"
	 final String v3 = "MobFoxMediaController created"; // const-string v3, "MobFoxMediaController created"
	 android.util.Log .d ( v2,v3 );
	 /* .line 85 */
} // :cond_1
return;
} // .end method
static void access$0 ( com.mobfox.video.sdk.MobFoxMediaController p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 636 */
/* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxMediaController;->refreshProgress()V */
return;
} // .end method
static android.widget.LinearLayout access$1 ( com.mobfox.video.sdk.MobFoxMediaController p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 45 */
v0 = this.mTopBar;
} // .end method
static com.mobfox.video.sdk.ResourceManager access$2 ( com.mobfox.video.sdk.MobFoxMediaController p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 43 */
v0 = this.mResourceManager;
} // .end method
static android.widget.ImageView access$3 ( com.mobfox.video.sdk.MobFoxMediaController p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 44 */
v0 = this.mTopBarBackground;
} // .end method
static android.widget.LinearLayout access$4 ( com.mobfox.video.sdk.MobFoxMediaController p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 46 */
v0 = this.mBottomBar;
} // .end method
static android.widget.ImageView access$5 ( com.mobfox.video.sdk.MobFoxMediaController p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 47 */
v0 = this.mBottomBarBackground;
} // .end method
static com.mobfox.video.sdk.AspectRatioImageViewWidth access$6 ( com.mobfox.video.sdk.MobFoxMediaController p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 48 */
v0 = this.mPauseButton;
} // .end method
static void access$7 ( com.mobfox.video.sdk.MobFoxMediaController p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 572 */
/* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxMediaController;->updatePausePlay()V */
return;
} // .end method
static com.mobfox.video.sdk.AspectRatioImageViewWidth access$8 ( com.mobfox.video.sdk.MobFoxMediaController p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 49 */
v0 = this.mReplayButton;
} // .end method
static void access$9 ( com.mobfox.video.sdk.MobFoxMediaController p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 601 */
/* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxMediaController;->doPauseResume()V */
return;
} // .end method
private void doPauseResume ( ) {
/* .locals 1 */
/* .prologue */
/* .line 602 */
v0 = this.mPlayer;
/* if-nez v0, :cond_0 */
/* .line 616 */
} // :goto_0
return;
/* .line 604 */
} // :cond_0
v0 = v0 = this.mPlayer;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 605 */
v0 = this.mPlayer;
/* .line 606 */
v0 = this.mOnPauseListener;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 607 */
v0 = this.mOnPauseListener;
/* .line 615 */
} // :cond_1
} // :goto_1
/* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxMediaController;->updatePausePlay()V */
/* .line 610 */
} // :cond_2
v0 = this.mPlayer;
/* .line 611 */
v0 = this.mOnUnpauseListener;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 612 */
v0 = this.mOnUnpauseListener;
} // .end method
private void initNavigationBarControllerView ( Integer p0, android.util.DisplayMetrics p1 ) {
/* .locals 12 */
/* .param p1, "padding" # I */
/* .param p2, "metrics" # Landroid/util/DisplayMetrics; */
/* .prologue */
int v7 = 0; // const/4 v7, 0x0
int v11 = 4; // const/4 v11, 0x4
/* const/16 v10, 0x8 */
int v9 = 0; // const/4 v9, 0x0
/* .line 225 */
v4 = this.mVideoData;
/* iget-boolean v4, v4, Lcom/mobfox/video/sdk/VideoData;->showBottomNavigationBar:Z */
/* if-nez v4, :cond_2 */
/* .line 226 */
v4 = this.mBottomBar;
(( android.widget.LinearLayout ) v4 ).setVisibility ( v10 ); // invoke-virtual {v4, v10}, Landroid/widget/LinearLayout;->setVisibility(I)V
/* .line 227 */
v4 = this.mBottomBarBackground;
(( android.widget.ImageView ) v4 ).setVisibility ( v10 ); // invoke-virtual {v4, v10}, Landroid/widget/ImageView;->setVisibility(I)V
/* .line 321 */
} // :cond_0
v4 = this.mVideoData;
/* iget-boolean v4, v4, Lcom/mobfox/video/sdk/VideoData;->showTopNavigationBar:Z */
/* if-nez v4, :cond_d */
/* .line 322 */
v4 = this.mTopBar;
(( android.widget.LinearLayout ) v4 ).setVisibility ( v10 ); // invoke-virtual {v4, v10}, Landroid/widget/LinearLayout;->setVisibility(I)V
/* .line 323 */
v4 = this.mTopBarBackground;
(( android.widget.ImageView ) v4 ).setVisibility ( v10 ); // invoke-virtual {v4, v10}, Landroid/widget/ImageView;->setVisibility(I)V
/* .line 346 */
} // :goto_0
v4 = this.mVideoData;
/* iget-boolean v4, v4, Lcom/mobfox/video/sdk/VideoData;->showNavigationBars:Z */
/* if-nez v4, :cond_1 */
/* .line 347 */
(( com.mobfox.video.sdk.MobFoxMediaController ) p0 ).setVisibility ( v11 ); // invoke-virtual {p0, v11}, Lcom/mobfox/video/sdk/MobFoxMediaController;->setVisibility(I)V
/* .line 349 */
} // :cond_1
return;
/* .line 229 */
} // :cond_2
v4 = this.mBottomBar;
(( android.widget.LinearLayout ) v4 ).setVisibility ( v9 ); // invoke-virtual {v4, v9}, Landroid/widget/LinearLayout;->setVisibility(I)V
/* .line 230 */
v4 = this.mBottomBarBackground;
(( android.widget.ImageView ) v4 ).setVisibility ( v9 ); // invoke-virtual {v4, v9}, Landroid/widget/ImageView;->setVisibility(I)V
/* .line 231 */
v4 = this.mBottomBar;
/* new-instance v5, Lcom/mobfox/video/sdk/MobFoxMediaController$4; */
/* invoke-direct {v5, p0}, Lcom/mobfox/video/sdk/MobFoxMediaController$4;-><init>(Lcom/mobfox/video/sdk/MobFoxMediaController;)V */
(( android.widget.LinearLayout ) v4 ).setOnClickListener ( v5 ); // invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 238 */
v4 = this.mVideoData;
v4 = this.bottomNavigationBarBackground;
if ( v4 != null) { // if-eqz v4, :cond_7
/* .line 239 */
v4 = this.mVideoData;
v4 = this.bottomNavigationBarBackground;
v4 = (( java.lang.String ) v4 ).length ( ); // invoke-virtual {v4}, Ljava/lang/String;->length()I
/* if-lez v4, :cond_7 */
/* .line 240 */
v4 = this.mResourceManager;
/* .line 241 */
v5 = this.mVideoData;
v5 = this.bottomNavigationBarBackground;
/* .line 242 */
int v6 = 5; // const/4 v6, 0x5
/* .line 240 */
(( com.mobfox.video.sdk.ResourceManager ) v4 ).fetchResource ( v5, v6 ); // invoke-virtual {v4, v5, v6}, Lcom/mobfox/video/sdk/ResourceManager;->fetchResource(Ljava/lang/String;I)V
/* .line 249 */
} // :goto_1
v4 = this.mPauseButton;
if ( v4 != null) { // if-eqz v4, :cond_4
/* .line 250 */
v4 = this.mVideoData;
v4 = this.pauseButtonImage;
if ( v4 != null) { // if-eqz v4, :cond_8
/* .line 251 */
v4 = this.mVideoData;
v4 = this.pauseButtonImage;
v4 = (( java.lang.String ) v4 ).length ( ); // invoke-virtual {v4}, Ljava/lang/String;->length()I
/* if-lez v4, :cond_8 */
/* .line 252 */
v4 = this.mPauseButton;
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v4 ).setBackgroundDrawable ( v7 ); // invoke-virtual {v4, v7}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 253 */
v4 = this.mResourceManager;
v5 = this.mVideoData;
v5 = this.pauseButtonImage;
/* .line 254 */
int v6 = 1; // const/4 v6, 0x1
/* .line 253 */
(( com.mobfox.video.sdk.ResourceManager ) v4 ).fetchResource ( v5, v6 ); // invoke-virtual {v4, v5, v6}, Lcom/mobfox/video/sdk/ResourceManager;->fetchResource(Ljava/lang/String;I)V
/* .line 261 */
} // :goto_2
v4 = this.mVideoData;
v4 = this.playButtonImage;
if ( v4 != null) { // if-eqz v4, :cond_3
/* .line 262 */
v4 = this.mVideoData;
v4 = this.playButtonImage;
v4 = (( java.lang.String ) v4 ).length ( ); // invoke-virtual {v4}, Ljava/lang/String;->length()I
/* if-lez v4, :cond_3 */
/* .line 263 */
v4 = this.mResourceManager;
v5 = this.mVideoData;
v5 = this.playButtonImage;
/* .line 264 */
int v6 = 2; // const/4 v6, 0x2
/* .line 263 */
(( com.mobfox.video.sdk.ResourceManager ) v4 ).fetchResource ( v5, v6 ); // invoke-virtual {v4, v5, v6}, Lcom/mobfox/video/sdk/ResourceManager;->fetchResource(Ljava/lang/String;I)V
/* .line 266 */
} // :cond_3
v4 = this.mPauseButton;
v5 = this.mPauseListener;
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v4 ).setOnClickListener ( v5 ); // invoke-virtual {v4, v5}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 267 */
v4 = this.mVideoData;
/* iget-boolean v4, v4, Lcom/mobfox/video/sdk/VideoData;->showPauseButton:Z */
if ( v4 != null) { // if-eqz v4, :cond_9
/* .line 268 */
v4 = this.mPauseButton;
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v4 ).setVisibility ( v9 ); // invoke-virtual {v4, v9}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setVisibility(I)V
/* .line 274 */
} // :cond_4
} // :goto_3
v4 = this.mReplayButton;
if ( v4 != null) { // if-eqz v4, :cond_5
/* .line 275 */
v4 = this.mVideoData;
v4 = this.replayButtonImage;
if ( v4 != null) { // if-eqz v4, :cond_a
/* .line 276 */
v4 = this.mVideoData;
v4 = this.replayButtonImage;
v4 = (( java.lang.String ) v4 ).length ( ); // invoke-virtual {v4}, Ljava/lang/String;->length()I
/* if-lez v4, :cond_a */
/* .line 279 */
v4 = this.mReplayButton;
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v4 ).setImageDrawable ( v7 ); // invoke-virtual {v4, v7}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 280 */
v4 = this.mResourceManager;
/* .line 281 */
v5 = this.mVideoData;
v5 = this.replayButtonImage;
/* .line 282 */
int v6 = 3; // const/4 v6, 0x3
/* .line 280 */
(( com.mobfox.video.sdk.ResourceManager ) v4 ).fetchResource ( v5, v6 ); // invoke-virtual {v4, v5, v6}, Lcom/mobfox/video/sdk/ResourceManager;->fetchResource(Ljava/lang/String;I)V
/* .line 294 */
} // :goto_4
v4 = this.mReplayButton;
v5 = this.mReplayListener;
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v4 ).setOnClickListener ( v5 ); // invoke-virtual {v4, v5}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 295 */
v4 = this.mVideoData;
/* iget-boolean v4, v4, Lcom/mobfox/video/sdk/VideoData;->showReplayButton:Z */
if ( v4 != null) { // if-eqz v4, :cond_b
/* .line 296 */
v4 = this.mReplayButton;
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v4 ).setVisibility ( v9 ); // invoke-virtual {v4, v9}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setVisibility(I)V
/* .line 302 */
} // :cond_5
} // :goto_5
v4 = this.mLeftTime;
if ( v4 != null) { // if-eqz v4, :cond_6
/* .line 303 */
v4 = this.mVideoData;
/* iget-boolean v4, v4, Lcom/mobfox/video/sdk/VideoData;->showTimer:Z */
if ( v4 != null) { // if-eqz v4, :cond_c
/* .line 304 */
v4 = this.mLeftTime;
(( android.widget.TextView ) v4 ).setVisibility ( v9 ); // invoke-virtual {v4, v9}, Landroid/widget/TextView;->setVisibility(I)V
/* .line 309 */
} // :cond_6
} // :goto_6
v4 = this.mVideoData;
v4 = this.icons;
v4 = (( java.util.Vector ) v4 ).isEmpty ( ); // invoke-virtual {v4}, Ljava/util/Vector;->isEmpty()Z
/* if-nez v4, :cond_0 */
/* .line 310 */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
} // :goto_7
v4 = this.mVideoData;
v4 = this.icons;
v4 = (( java.util.Vector ) v4 ).size ( ); // invoke-virtual {v4}, Ljava/util/Vector;->size()I
/* if-ge v0, v4, :cond_0 */
/* .line 311 */
v4 = this.mVideoData;
v4 = this.icons;
(( java.util.Vector ) v4 ).get ( v0 ); // invoke-virtual {v4, v0}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
/* check-cast v2, Lcom/mobfox/video/sdk/NavIconData; */
/* .line 312 */
/* .local v2, "iconData":Lcom/mobfox/video/sdk/NavIconData; */
/* new-instance v1, Lcom/mobfox/video/sdk/NavIcon; */
v4 = this.mContext;
/* invoke-direct {v1, v4, v2}, Lcom/mobfox/video/sdk/NavIcon;-><init>(Landroid/content/Context;Lcom/mobfox/video/sdk/NavIconData;)V */
/* .line 313 */
/* .local v1, "icon":Lcom/mobfox/video/sdk/NavIcon; */
/* new-instance v3, Landroid/widget/LinearLayout$LayoutParams; */
/* .line 314 */
/* iget v4, p2, Landroid/util/DisplayMetrics;->widthPixels:I */
/* int-to-double v4, v4 */
/* iget-wide v6, p0, Lcom/mobfox/video/sdk/MobFoxMediaController;->buttonWidthPercent:D */
/* mul-double/2addr v4, v6 */
/* double-to-int v4, v4 */
/* .line 315 */
/* iget v5, p2, Landroid/util/DisplayMetrics;->widthPixels:I */
/* int-to-double v5, v5 */
/* iget-wide v7, p0, Lcom/mobfox/video/sdk/MobFoxMediaController;->buttonWidthPercent:D */
/* mul-double/2addr v5, v7 */
/* double-to-int v5, v5 */
/* .line 313 */
/* invoke-direct {v3, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V */
/* .line 317 */
/* .local v3, "params":Landroid/widget/LinearLayout$LayoutParams; */
v4 = this.mNavIconsLayout;
(( android.widget.LinearLayout ) v4 ).addView ( v1, v3 ); // invoke-virtual {v4, v1, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 310 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 244 */
} // .end local v0 # "i":I
} // .end local v1 # "icon":Lcom/mobfox/video/sdk/NavIcon;
} // .end local v2 # "iconData":Lcom/mobfox/video/sdk/NavIconData;
} // .end local v3 # "params":Landroid/widget/LinearLayout$LayoutParams;
} // :cond_7
v4 = this.mBottomBarBackground;
/* .line 245 */
v5 = this.mResourceManager;
/* .line 246 */
int v6 = -2; // const/4 v6, -0x2
(( com.mobfox.video.sdk.ResourceManager ) v5 ).getResource ( v6 ); // invoke-virtual {v5, v6}, Lcom/mobfox/video/sdk/ResourceManager;->getResource(I)Landroid/graphics/drawable/Drawable;
/* .line 245 */
(( android.widget.ImageView ) v4 ).setImageDrawable ( v5 ); // invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* goto/16 :goto_1 */
/* .line 257 */
} // :cond_8
v4 = this.mPauseButton;
/* .line 258 */
v5 = this.mResourceManager;
/* .line 259 */
/* const/16 v6, -0xc */
(( com.mobfox.video.sdk.ResourceManager ) v5 ).getResource ( v6 ); // invoke-virtual {v5, v6}, Lcom/mobfox/video/sdk/ResourceManager;->getResource(I)Landroid/graphics/drawable/Drawable;
/* .line 258 */
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v4 ).setImageDrawable ( v5 ); // invoke-virtual {v4, v5}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* goto/16 :goto_2 */
/* .line 270 */
} // :cond_9
v4 = this.mPauseButton;
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v4 ).setVisibility ( v10 ); // invoke-virtual {v4, v10}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setVisibility(I)V
/* goto/16 :goto_3 */
/* .line 285 */
} // :cond_a
v4 = this.mReplayButton;
/* .line 286 */
v5 = this.mResourceManager;
/* .line 287 */
/* const/16 v6, -0xd */
(( com.mobfox.video.sdk.ResourceManager ) v5 ).getResource ( v6 ); // invoke-virtual {v5, v6}, Lcom/mobfox/video/sdk/ResourceManager;->getResource(I)Landroid/graphics/drawable/Drawable;
/* .line 286 */
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v4 ).setImageDrawable ( v5 ); // invoke-virtual {v4, v5}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* goto/16 :goto_4 */
/* .line 298 */
} // :cond_b
v4 = this.mReplayButton;
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v4 ).setVisibility ( v10 ); // invoke-virtual {v4, v10}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setVisibility(I)V
/* goto/16 :goto_5 */
/* .line 306 */
} // :cond_c
v4 = this.mLeftTime;
(( android.widget.TextView ) v4 ).setVisibility ( v10 ); // invoke-virtual {v4, v10}, Landroid/widget/TextView;->setVisibility(I)V
/* .line 325 */
} // :cond_d
v4 = this.mTopBar;
(( android.widget.LinearLayout ) v4 ).setVisibility ( v9 ); // invoke-virtual {v4, v9}, Landroid/widget/LinearLayout;->setVisibility(I)V
/* .line 326 */
v4 = this.mTopBarBackground;
(( android.widget.ImageView ) v4 ).setVisibility ( v9 ); // invoke-virtual {v4, v9}, Landroid/widget/ImageView;->setVisibility(I)V
/* .line 327 */
v4 = this.mTopBar;
/* new-instance v5, Lcom/mobfox/video/sdk/MobFoxMediaController$5; */
/* invoke-direct {v5, p0}, Lcom/mobfox/video/sdk/MobFoxMediaController$5;-><init>(Lcom/mobfox/video/sdk/MobFoxMediaController;)V */
(( android.widget.LinearLayout ) v4 ).setOnClickListener ( v5 ); // invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 334 */
v4 = this.mVideoData;
v4 = this.topNavigationBarBackground;
if ( v4 != null) { // if-eqz v4, :cond_e
/* .line 335 */
v4 = this.mVideoData;
v4 = this.topNavigationBarBackground;
v4 = (( java.lang.String ) v4 ).length ( ); // invoke-virtual {v4}, Ljava/lang/String;->length()I
/* if-lez v4, :cond_e */
/* .line 336 */
v4 = this.mResourceManager;
/* .line 337 */
v5 = this.mVideoData;
v5 = this.topNavigationBarBackground;
/* .line 336 */
(( com.mobfox.video.sdk.ResourceManager ) v4 ).fetchResource ( v5, v11 ); // invoke-virtual {v4, v5, v11}, Lcom/mobfox/video/sdk/ResourceManager;->fetchResource(Ljava/lang/String;I)V
/* goto/16 :goto_0 */
/* .line 340 */
} // :cond_e
v4 = this.mTopBarBackground;
/* .line 341 */
v5 = this.mResourceManager;
/* .line 342 */
int v6 = -1; // const/4 v6, -0x1
(( com.mobfox.video.sdk.ResourceManager ) v5 ).getResource ( v6 ); // invoke-virtual {v5, v6}, Lcom/mobfox/video/sdk/ResourceManager;->getResource(I)Landroid/graphics/drawable/Drawable;
/* .line 341 */
(( android.widget.ImageView ) v4 ).setImageDrawable ( v5 ); // invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* goto/16 :goto_0 */
} // .end method
private void refreshProgress ( ) {
/* .locals 5 */
/* .prologue */
int v3 = 2; // const/4 v3, 0x2
/* .line 637 */
/* iget-boolean v2, p0, Lcom/mobfox/video/sdk/MobFoxMediaController;->mShowing:Z */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 638 */
/* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxMediaController;->updatePausePlay()V */
/* .line 639 */
v1 = /* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxMediaController;->setProgress()I */
/* .line 640 */
/* .local v1, "pos":I */
v2 = this.mPlayer;
if ( v2 != null) { // if-eqz v2, :cond_0
v2 = v2 = this.mPlayer;
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 641 */
v2 = this.mHandler;
(( android.os.Handler ) v2 ).removeMessages ( v3 ); // invoke-virtual {v2, v3}, Landroid/os/Handler;->removeMessages(I)V
/* .line 642 */
v2 = this.mHandler;
(( android.os.Handler ) v2 ).obtainMessage ( v3 ); // invoke-virtual {v2, v3}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;
/* .line 643 */
/* .local v0, "msg":Landroid/os/Message; */
v2 = this.mHandler;
/* rem-int/lit16 v3, v1, 0x3e8 */
/* rsub-int v3, v3, 0x3e8 */
/* int-to-long v3, v3 */
(( android.os.Handler ) v2 ).sendMessageDelayed ( v0, v3, v4 ); // invoke-virtual {v2, v0, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z
/* .line 646 */
} // .end local v0 # "msg":Landroid/os/Message;
} // .end local v1 # "pos":I
} // :cond_0
return;
} // .end method
private Integer setProgress ( ) {
/* .locals 5 */
/* .prologue */
/* .line 528 */
v3 = this.mPlayer;
/* if-nez v3, :cond_1 */
/* .line 529 */
int v1 = 0; // const/4 v1, 0x0
/* .line 538 */
} // :cond_0
} // :goto_0
/* .line 531 */
} // :cond_1
v1 = v3 = this.mPlayer;
/* .line 532 */
/* .local v1, "position":I */
v0 = v3 = this.mPlayer;
/* .line 534 */
/* .local v0, "duration":I */
/* sub-int v2, v0, v1 */
/* .line 535 */
/* .local v2, "timeLeft":I */
v3 = this.mLeftTime;
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 536 */
v3 = this.mLeftTime;
/* invoke-direct {p0, v2}, Lcom/mobfox/video/sdk/MobFoxMediaController;->stringForTime(I)Ljava/lang/String; */
(( android.widget.TextView ) v3 ).setText ( v4 ); // invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
} // .end method
private java.lang.String stringForTime ( Integer p0 ) {
/* .locals 11 */
/* .param p1, "timeMs" # I */
/* .prologue */
int v10 = 2; // const/4 v10, 0x2
int v9 = 1; // const/4 v9, 0x1
int v8 = 0; // const/4 v8, 0x0
/* .line 510 */
/* div-int/lit16 v3, p1, 0x3e8 */
/* .line 512 */
/* .local v3, "totalSeconds":I */
/* rem-int/lit8 v2, v3, 0x3c */
/* .line 513 */
/* .local v2, "seconds":I */
/* div-int/lit8 v4, v3, 0x3c */
/* rem-int/lit8 v1, v4, 0x3c */
/* .line 514 */
/* .local v1, "minutes":I */
/* div-int/lit16 v0, v3, 0xe10 */
/* .line 516 */
/* .local v0, "hours":I */
v4 = this.mFormatBuilder;
(( java.lang.StringBuilder ) v4 ).setLength ( v8 ); // invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->setLength(I)V
/* .line 517 */
/* if-lez v0, :cond_0 */
/* .line 518 */
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
/* .line 519 */
(( java.util.Formatter ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/util/Formatter;->toString()Ljava/lang/String;
/* .line 523 */
} // :goto_0
/* .line 520 */
} // :cond_0
/* if-lez v1, :cond_1 */
/* .line 521 */
v4 = this.mFormatter;
final String v5 = "%02d:%02d"; // const-string v5, "%02d:%02d"
/* new-array v6, v10, [Ljava/lang/Object; */
java.lang.Integer .valueOf ( v1 );
/* aput-object v7, v6, v8 */
java.lang.Integer .valueOf ( v2 );
/* aput-object v7, v6, v9 */
(( java.util.Formatter ) v4 ).format ( v5, v6 ); // invoke-virtual {v4, v5, v6}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;
(( java.util.Formatter ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/util/Formatter;->toString()Ljava/lang/String;
/* .line 523 */
} // :cond_1
v4 = this.mFormatter;
final String v5 = "0:%02d"; // const-string v5, "0:%02d"
/* new-array v6, v9, [Ljava/lang/Object; */
java.lang.Integer .valueOf ( v2 );
/* aput-object v7, v6, v8 */
(( java.util.Formatter ) v4 ).format ( v5, v6 ); // invoke-virtual {v4, v5, v6}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;
(( java.util.Formatter ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/util/Formatter;->toString()Ljava/lang/String;
} // .end method
private void updatePausePlay ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 2; // const/4 v3, 0x2
int v2 = 1; // const/4 v2, 0x1
/* .line 573 */
v1 = this.mPauseButton;
/* if-nez v1, :cond_0 */
/* .line 599 */
} // :goto_0
return;
/* .line 576 */
} // :cond_0
v1 = this.mPlayer;
if ( v1 != null) { // if-eqz v1, :cond_2
v1 = v1 = this.mPlayer;
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 577 */
v1 = this.mResourceManager;
v1 = (( com.mobfox.video.sdk.ResourceManager ) v1 ).containsResource ( v2 ); // invoke-virtual {v1, v2}, Lcom/mobfox/video/sdk/ResourceManager;->containsResource(I)Z
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 578 */
v1 = this.mResourceManager;
/* .line 579 */
(( com.mobfox.video.sdk.ResourceManager ) v1 ).getResource ( v2 ); // invoke-virtual {v1, v2}, Lcom/mobfox/video/sdk/ResourceManager;->getResource(I)Landroid/graphics/drawable/Drawable;
/* .line 580 */
/* .local v0, "d":Landroid/graphics/drawable/Drawable; */
v1 = this.mPauseButton;
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v1 ).setImageDrawable ( v0 ); // invoke-virtual {v1, v0}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 582 */
} // .end local v0 # "d":Landroid/graphics/drawable/Drawable;
} // :cond_1
v1 = this.mResourceManager;
/* .line 583 */
/* const/16 v2, -0xc */
(( com.mobfox.video.sdk.ResourceManager ) v1 ).getResource ( v2 ); // invoke-virtual {v1, v2}, Lcom/mobfox/video/sdk/ResourceManager;->getResource(I)Landroid/graphics/drawable/Drawable;
/* .line 584 */
/* .restart local v0 # "d":Landroid/graphics/drawable/Drawable; */
v1 = this.mPauseButton;
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v1 ).setImageDrawable ( v0 ); // invoke-virtual {v1, v0}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 588 */
} // .end local v0 # "d":Landroid/graphics/drawable/Drawable;
} // :cond_2
v1 = this.mResourceManager;
v1 = (( com.mobfox.video.sdk.ResourceManager ) v1 ).containsResource ( v3 ); // invoke-virtual {v1, v3}, Lcom/mobfox/video/sdk/ResourceManager;->containsResource(I)Z
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 589 */
v1 = this.mResourceManager;
/* .line 590 */
(( com.mobfox.video.sdk.ResourceManager ) v1 ).getResource ( v3 ); // invoke-virtual {v1, v3}, Lcom/mobfox/video/sdk/ResourceManager;->getResource(I)Landroid/graphics/drawable/Drawable;
/* .line 591 */
/* .restart local v0 # "d":Landroid/graphics/drawable/Drawable; */
v1 = this.mPauseButton;
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v1 ).setImageDrawable ( v0 ); // invoke-virtual {v1, v0}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 593 */
} // .end local v0 # "d":Landroid/graphics/drawable/Drawable;
} // :cond_3
v1 = this.mResourceManager;
/* .line 594 */
/* const/16 v2, -0xb */
(( com.mobfox.video.sdk.ResourceManager ) v1 ).getResource ( v2 ); // invoke-virtual {v1, v2}, Lcom/mobfox/video/sdk/ResourceManager;->getResource(I)Landroid/graphics/drawable/Drawable;
/* .line 595 */
/* .restart local v0 # "d":Landroid/graphics/drawable/Drawable; */
v1 = this.mPauseButton;
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v1 ).setImageDrawable ( v0 ); // invoke-virtual {v1, v0}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
} // .end method
/* # virtual methods */
protected void buildNavigationBarView ( android.util.DisplayMetrics p0 ) {
/* .locals 11 */
/* .param p1, "metrics" # Landroid/util/DisplayMetrics; */
/* .prologue */
/* .line 99 */
/* new-instance v6, Landroid/widget/FrameLayout$LayoutParams; */
/* .line 100 */
int v7 = -1; // const/4 v7, -0x1
/* .line 101 */
int v8 = -1; // const/4 v8, -0x1
/* invoke-direct {v6, v7, v8}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V */
/* .line 99 */
(( com.mobfox.video.sdk.MobFoxMediaController ) p0 ).setLayoutParams ( v6 ); // invoke-virtual {p0, v6}, Lcom/mobfox/video/sdk/MobFoxMediaController;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
/* .line 102 */
/* new-instance v6, Landroid/widget/LinearLayout; */
v7 = this.mContext;
/* invoke-direct {v6, v7}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V */
this.mTopBar = v6;
/* .line 103 */
v6 = this.mTopBar;
int v7 = 0; // const/4 v7, 0x0
(( android.widget.LinearLayout ) v6 ).setOrientation ( v7 ); // invoke-virtual {v6, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V
/* .line 104 */
v6 = this.mTopBar;
/* const/high16 v7, 0x3f800000 # 1.0f */
(( android.widget.LinearLayout ) v6 ).setWeightSum ( v7 ); // invoke-virtual {v6, v7}, Landroid/widget/LinearLayout;->setWeightSum(F)V
/* .line 105 */
v6 = this.mTopBar;
int v7 = 0; // const/4 v7, 0x0
(( android.widget.LinearLayout ) v6 ).setBackgroundColor ( v7 ); // invoke-virtual {v6, v7}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V
/* .line 106 */
/* new-instance v4, Landroid/widget/FrameLayout$LayoutParams; */
/* .line 107 */
int v6 = -1; // const/4 v6, -0x1
/* .line 108 */
int v7 = -2; // const/4 v7, -0x2
/* .line 106 */
/* invoke-direct {v4, v6, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V */
/* .line 109 */
/* .local v4, "paramsFrame":Landroid/widget/FrameLayout$LayoutParams; */
/* const/16 v6, 0x37 */
/* iput v6, v4, Landroid/widget/FrameLayout$LayoutParams;->gravity:I */
/* .line 110 */
v6 = this.mTopBar;
/* const/16 v7, 0x10 */
(( android.widget.LinearLayout ) v6 ).setGravity ( v7 ); // invoke-virtual {v6, v7}, Landroid/widget/LinearLayout;->setGravity(I)V
/* .line 112 */
int v6 = 1; // const/4 v6, 0x1
/* const/high16 v7, 0x40a00000 # 5.0f */
(( com.mobfox.video.sdk.MobFoxMediaController ) p0 ).getResources ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxMediaController;->getResources()Landroid/content/res/Resources;
/* .line 113 */
(( android.content.res.Resources ) v8 ).getDisplayMetrics ( ); // invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* .line 111 */
v6 = android.util.TypedValue .applyDimension ( v6,v7,v8 );
/* float-to-int v2, v6 */
/* .line 117 */
/* .local v2, "padding":I */
/* new-instance v6, Landroid/widget/ImageView; */
v7 = this.mContext;
/* invoke-direct {v6, v7}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V */
this.mTopBarBackground = v6;
/* .line 118 */
v6 = this.mTopBarBackground;
int v7 = 0; // const/4 v7, 0x0
(( android.widget.ImageView ) v6 ).setAdjustViewBounds ( v7 ); // invoke-virtual {v6, v7}, Landroid/widget/ImageView;->setAdjustViewBounds(Z)V
/* .line 119 */
/* new-instance v5, Landroid/widget/FrameLayout$LayoutParams; */
/* iget v6, p1, Landroid/util/DisplayMetrics;->widthPixels:I */
/* .line 120 */
/* iget v7, p1, Landroid/util/DisplayMetrics;->widthPixels:I */
/* int-to-double v7, v7 */
/* const-wide v9, 0x3fbe666666666666L # 0.11875 */
/* mul-double/2addr v7, v9 */
/* double-to-int v7, v7 */
/* .line 119 */
/* invoke-direct {v5, v6, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V */
/* .line 121 */
/* .local v5, "topBarParams":Landroid/widget/FrameLayout$LayoutParams; */
v6 = this.mTopBarBackground;
v7 = android.widget.ImageView$ScaleType.FIT_XY;
(( android.widget.ImageView ) v6 ).setScaleType ( v7 ); // invoke-virtual {v6, v7}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V
/* .line 122 */
int v6 = 7; // const/4 v6, 0x7
/* iput v6, v5, Landroid/widget/FrameLayout$LayoutParams;->gravity:I */
/* .line 125 */
v6 = this.mTopBarBackground;
(( com.mobfox.video.sdk.MobFoxMediaController ) p0 ).addView ( v6, v5 ); // invoke-virtual {p0, v6, v5}, Lcom/mobfox/video/sdk/MobFoxMediaController;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 126 */
v6 = this.mTopBar;
(( com.mobfox.video.sdk.MobFoxMediaController ) p0 ).addView ( v6, v4 ); // invoke-virtual {p0, v6, v4}, Lcom/mobfox/video/sdk/MobFoxMediaController;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 128 */
/* new-instance v6, Landroid/widget/LinearLayout; */
v7 = this.mContext;
/* invoke-direct {v6, v7}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V */
this.mBottomBar = v6;
/* .line 129 */
v6 = this.mBottomBar;
int v7 = 0; // const/4 v7, 0x0
(( android.widget.LinearLayout ) v6 ).setOrientation ( v7 ); // invoke-virtual {v6, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V
/* .line 130 */
/* new-instance v4, Landroid/widget/FrameLayout$LayoutParams; */
/* .line 131 */
} // .end local v4 # "paramsFrame":Landroid/widget/FrameLayout$LayoutParams;
int v6 = -1; // const/4 v6, -0x1
/* .line 132 */
/* iget v7, p1, Landroid/util/DisplayMetrics;->widthPixels:I */
/* int-to-double v7, v7 */
/* const-wide v9, 0x3fbe76c8b4395810L # 0.119 */
/* mul-double/2addr v7, v9 */
/* double-to-int v7, v7 */
/* .line 130 */
/* invoke-direct {v4, v6, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V */
/* .line 133 */
/* .restart local v4 # "paramsFrame":Landroid/widget/FrameLayout$LayoutParams; */
/* const/16 v6, 0x50 */
/* iput v6, v4, Landroid/widget/FrameLayout$LayoutParams;->gravity:I */
/* .line 135 */
v6 = this.mBottomBar;
/* const/high16 v7, 0x3f800000 # 1.0f */
(( android.widget.LinearLayout ) v6 ).setWeightSum ( v7 ); // invoke-virtual {v6, v7}, Landroid/widget/LinearLayout;->setWeightSum(F)V
/* .line 136 */
v6 = this.mBottomBar;
int v7 = 0; // const/4 v7, 0x0
int v8 = 0; // const/4 v8, 0x0
(( android.widget.LinearLayout ) v6 ).setPadding ( v2, v7, v2, v8 ); // invoke-virtual {v6, v2, v7, v2, v8}, Landroid/widget/LinearLayout;->setPadding(IIII)V
/* .line 137 */
v6 = this.mBottomBar;
int v7 = 0; // const/4 v7, 0x0
(( android.widget.LinearLayout ) v6 ).setBackgroundColor ( v7 ); // invoke-virtual {v6, v7}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V
/* .line 139 */
/* new-instance v6, Landroid/widget/ImageView; */
v7 = this.mContext;
/* invoke-direct {v6, v7}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V */
this.mBottomBarBackground = v6;
/* .line 140 */
v6 = this.mBottomBarBackground;
int v7 = 0; // const/4 v7, 0x0
(( android.widget.ImageView ) v6 ).setAdjustViewBounds ( v7 ); // invoke-virtual {v6, v7}, Landroid/widget/ImageView;->setAdjustViewBounds(Z)V
/* .line 141 */
/* new-instance v0, Landroid/widget/FrameLayout$LayoutParams; */
/* iget v6, p1, Landroid/util/DisplayMetrics;->widthPixels:I */
/* .line 142 */
/* iget v7, p1, Landroid/util/DisplayMetrics;->widthPixels:I */
/* int-to-double v7, v7 */
/* const-wide v9, 0x3fbe666666666666L # 0.11875 */
/* mul-double/2addr v7, v9 */
/* double-to-int v7, v7 */
/* .line 141 */
/* invoke-direct {v0, v6, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V */
/* .line 143 */
/* .local v0, "bottomBarParams":Landroid/widget/FrameLayout$LayoutParams; */
v6 = this.mBottomBarBackground;
v7 = android.widget.ImageView$ScaleType.FIT_XY;
(( android.widget.ImageView ) v6 ).setScaleType ( v7 ); // invoke-virtual {v6, v7}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V
/* .line 144 */
/* const/16 v6, 0x50 */
/* iput v6, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I */
/* .line 146 */
v6 = this.mBottomBarBackground;
(( com.mobfox.video.sdk.MobFoxMediaController ) p0 ).addView ( v6, v0 ); // invoke-virtual {p0, v6, v0}, Lcom/mobfox/video/sdk/MobFoxMediaController;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 147 */
v6 = this.mBottomBar;
(( com.mobfox.video.sdk.MobFoxMediaController ) p0 ).addView ( v6, v4 ); // invoke-virtual {p0, v6, v4}, Lcom/mobfox/video/sdk/MobFoxMediaController;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 155 */
/* new-instance v1, Landroid/widget/LinearLayout; */
v6 = this.mContext;
/* invoke-direct {v1, v6}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V */
/* .line 156 */
/* .local v1, "buttonPanel":Landroid/widget/LinearLayout; */
/* new-instance v3, Landroid/widget/LinearLayout$LayoutParams; */
/* .line 157 */
int v6 = -2; // const/4 v6, -0x2
/* .line 158 */
int v7 = -1; // const/4 v7, -0x1
int v8 = 0; // const/4 v8, 0x0
/* .line 156 */
/* invoke-direct {v3, v6, v7, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V */
/* .line 159 */
/* .local v3, "params":Landroid/widget/LinearLayout$LayoutParams; */
int v6 = 3; // const/4 v6, 0x3
/* iput v6, v3, Landroid/widget/LinearLayout$LayoutParams;->gravity:I */
/* .line 160 */
int v6 = 0; // const/4 v6, 0x0
(( android.widget.LinearLayout ) v1 ).setOrientation ( v6 ); // invoke-virtual {v1, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V
/* .line 161 */
/* const/16 v6, 0x10 */
(( android.widget.LinearLayout ) v1 ).setGravity ( v6 ); // invoke-virtual {v1, v6}, Landroid/widget/LinearLayout;->setGravity(I)V
/* .line 162 */
v6 = this.mBottomBar;
(( android.widget.LinearLayout ) v6 ).addView ( v1, v3 ); // invoke-virtual {v6, v1, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 175 */
/* new-instance v6, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth; */
v7 = this.mContext;
/* invoke-direct {v6, v7}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;-><init>(Landroid/content/Context;)V */
this.mReplayButton = v6;
/* .line 177 */
/* new-instance v3, Landroid/widget/LinearLayout$LayoutParams; */
/* .line 178 */
} // .end local v3 # "params":Landroid/widget/LinearLayout$LayoutParams;
/* iget v6, p1, Landroid/util/DisplayMetrics;->widthPixels:I */
/* int-to-double v6, v6 */
/* iget-wide v8, p0, Lcom/mobfox/video/sdk/MobFoxMediaController;->buttonWidthPercent:D */
/* mul-double/2addr v6, v8 */
/* double-to-int v6, v6 */
/* .line 179 */
/* iget v7, p1, Landroid/util/DisplayMetrics;->widthPixels:I */
/* int-to-double v7, v7 */
/* iget-wide v9, p0, Lcom/mobfox/video/sdk/MobFoxMediaController;->buttonWidthPercent:D */
/* mul-double/2addr v7, v9 */
/* double-to-int v7, v7 */
/* .line 177 */
/* invoke-direct {v3, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V */
/* .line 180 */
/* .restart local v3 # "params":Landroid/widget/LinearLayout$LayoutParams; */
/* const/16 v6, 0x10 */
/* iput v6, v3, Landroid/widget/LinearLayout$LayoutParams;->gravity:I */
/* .line 181 */
v6 = this.mReplayButton;
int v7 = 1; // const/4 v7, 0x1
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v6 ).setAdjustViewBounds ( v7 ); // invoke-virtual {v6, v7}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setAdjustViewBounds(Z)V
/* .line 182 */
v6 = this.mReplayButton;
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v6 ).setPadding ( v2, v2, v2, v2 ); // invoke-virtual {v6, v2, v2, v2, v2}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setPadding(IIII)V
/* .line 183 */
v6 = this.mReplayButton;
(( android.widget.LinearLayout ) v1 ).addView ( v6, v3 ); // invoke-virtual {v1, v6, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 185 */
/* new-instance v6, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth; */
v7 = this.mContext;
/* invoke-direct {v6, v7}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;-><init>(Landroid/content/Context;)V */
this.mPauseButton = v6;
/* .line 186 */
/* new-instance v3, Landroid/widget/LinearLayout$LayoutParams; */
/* .line 187 */
} // .end local v3 # "params":Landroid/widget/LinearLayout$LayoutParams;
/* iget v6, p1, Landroid/util/DisplayMetrics;->widthPixels:I */
/* int-to-double v6, v6 */
/* iget-wide v8, p0, Lcom/mobfox/video/sdk/MobFoxMediaController;->buttonWidthPercent:D */
/* mul-double/2addr v6, v8 */
/* double-to-int v6, v6 */
/* .line 188 */
/* iget v7, p1, Landroid/util/DisplayMetrics;->widthPixels:I */
/* int-to-double v7, v7 */
/* iget-wide v9, p0, Lcom/mobfox/video/sdk/MobFoxMediaController;->buttonWidthPercent:D */
/* mul-double/2addr v7, v9 */
/* double-to-int v7, v7 */
/* .line 186 */
/* invoke-direct {v3, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V */
/* .line 189 */
/* .restart local v3 # "params":Landroid/widget/LinearLayout$LayoutParams; */
/* const/16 v6, 0x10 */
/* iput v6, v3, Landroid/widget/LinearLayout$LayoutParams;->gravity:I */
/* .line 192 */
v6 = this.mPauseButton;
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v6 ).setPadding ( v2, v2, v2, v2 ); // invoke-virtual {v6, v2, v2, v2, v2}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setPadding(IIII)V
/* .line 194 */
v6 = this.mPauseButton;
int v7 = 1; // const/4 v7, 0x1
(( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v6 ).setAdjustViewBounds ( v7 ); // invoke-virtual {v6, v7}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setAdjustViewBounds(Z)V
/* .line 195 */
v6 = this.mPauseButton;
(( android.widget.LinearLayout ) v1 ).addView ( v6, v3 ); // invoke-virtual {v1, v6, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 197 */
/* new-instance v6, Lcom/mobfox/video/sdk/AutoResizeTextView; */
v7 = this.mContext;
/* invoke-direct {v6, v7}, Lcom/mobfox/video/sdk/AutoResizeTextView;-><init>(Landroid/content/Context;)V */
this.mLeftTime = v6;
/* .line 198 */
/* new-instance v3, Landroid/widget/LinearLayout$LayoutParams; */
/* .line 199 */
} // .end local v3 # "params":Landroid/widget/LinearLayout$LayoutParams;
int v6 = -1; // const/4 v6, -0x1
/* .line 200 */
int v7 = -1; // const/4 v7, -0x1
/* .line 198 */
/* invoke-direct {v3, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V */
/* .line 201 */
/* .restart local v3 # "params":Landroid/widget/LinearLayout$LayoutParams; */
/* const/16 v6, 0x10 */
/* iput v6, v3, Landroid/widget/LinearLayout$LayoutParams;->gravity:I */
/* .line 204 */
v6 = this.mLeftTime;
int v7 = 1; // const/4 v7, 0x1
android.graphics.Typeface .defaultFromStyle ( v7 );
(( android.widget.TextView ) v6 ).setTypeface ( v7 ); // invoke-virtual {v6, v7}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V
/* .line 205 */
v6 = this.mLeftTime;
(( android.widget.TextView ) v6 ).setPadding ( v2, v2, v2, v2 ); // invoke-virtual {v6, v2, v2, v2, v2}, Landroid/widget/TextView;->setPadding(IIII)V
/* .line 206 */
v6 = this.mLeftTime;
/* const/16 v7, 0x10 */
(( android.widget.TextView ) v6 ).setGravity ( v7 ); // invoke-virtual {v6, v7}, Landroid/widget/TextView;->setGravity(I)V
/* .line 207 */
v6 = this.mLeftTime;
/* const/high16 v7, 0x41b80000 # 23.0f */
(( android.widget.TextView ) v6 ).setTextSize ( v7 ); // invoke-virtual {v6, v7}, Landroid/widget/TextView;->setTextSize(F)V
/* .line 208 */
v6 = this.mLeftTime;
(( android.widget.LinearLayout ) v1 ).addView ( v6, v3 ); // invoke-virtual {v1, v6, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 210 */
/* new-instance v6, Landroid/widget/LinearLayout; */
v7 = this.mContext;
/* invoke-direct {v6, v7}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V */
this.mNavIconsLayout = v6;
/* .line 211 */
/* new-instance v3, Landroid/widget/LinearLayout$LayoutParams; */
/* .line 212 */
} // .end local v3 # "params":Landroid/widget/LinearLayout$LayoutParams;
int v6 = -2; // const/4 v6, -0x2
/* .line 213 */
int v7 = -2; // const/4 v7, -0x2
/* const/high16 v8, 0x3f800000 # 1.0f */
/* .line 211 */
/* invoke-direct {v3, v6, v7, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V */
/* .line 214 */
/* .restart local v3 # "params":Landroid/widget/LinearLayout$LayoutParams; */
/* const/16 v6, 0x15 */
/* iput v6, v3, Landroid/widget/LinearLayout$LayoutParams;->gravity:I */
/* .line 215 */
v6 = this.mNavIconsLayout;
int v7 = 0; // const/4 v7, 0x0
(( android.widget.LinearLayout ) v6 ).setOrientation ( v7 ); // invoke-virtual {v6, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V
/* .line 216 */
v6 = this.mNavIconsLayout;
int v7 = 0; // const/4 v7, 0x0
int v8 = 0; // const/4 v8, 0x0
int v9 = 0; // const/4 v9, 0x0
int v10 = 0; // const/4 v10, 0x0
(( android.widget.LinearLayout ) v6 ).setPadding ( v7, v8, v9, v10 ); // invoke-virtual {v6, v7, v8, v9, v10}, Landroid/widget/LinearLayout;->setPadding(IIII)V
/* .line 217 */
v6 = this.mNavIconsLayout;
/* const/16 v7, 0x15 */
(( android.widget.LinearLayout ) v6 ).setGravity ( v7 ); // invoke-virtual {v6, v7}, Landroid/widget/LinearLayout;->setGravity(I)V
/* .line 218 */
v6 = this.mBottomBar;
v7 = this.mNavIconsLayout;
(( android.widget.LinearLayout ) v6 ).addView ( v7, v3 ); // invoke-virtual {v6, v7, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 219 */
/* invoke-direct {p0, v2, p1}, Lcom/mobfox/video/sdk/MobFoxMediaController;->initNavigationBarControllerView(ILandroid/util/DisplayMetrics;)V */
/* .line 221 */
return;
} // .end method
public Boolean canToggle ( ) {
/* .locals 1 */
/* .prologue */
/* .line 619 */
v0 = this.mVideoData;
/* iget-boolean v0, v0, Lcom/mobfox/video/sdk/VideoData;->allowTapNavigationBars:Z */
} // .end method
public void hide ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
int v2 = 3; // const/4 v2, 0x3
/* .line 398 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
v0 = android.util.Log .isLoggable ( v0,v2 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 399 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
final String v1 = "HIDE"; // const-string v1, "HIDE"
android.util.Log .d ( v0,v1 );
/* .line 401 */
} // :cond_0
/* iput-boolean v3, p0, Lcom/mobfox/video/sdk/MobFoxMediaController;->mFixed:Z */
/* .line 402 */
v0 = (( com.mobfox.video.sdk.MobFoxMediaController ) p0 ).canToggle ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxMediaController;->canToggle()Z
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 403 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
v0 = android.util.Log .isLoggable ( v0,v2 );
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 404 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
final String v1 = "Hide can toggle"; // const-string v1, "Hide can toggle"
android.util.Log .d ( v0,v1 );
/* .line 406 */
} // :cond_1
/* iget-boolean v0, p0, Lcom/mobfox/video/sdk/MobFoxMediaController;->mShowing:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 407 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
v0 = android.util.Log .isLoggable ( v0,v2 );
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 408 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
final String v1 = "Hide change visibility"; // const-string v1, "Hide change visibility"
android.util.Log .d ( v0,v1 );
/* .line 410 */
} // :cond_2
v0 = this.mHandler;
int v1 = 2; // const/4 v1, 0x2
(( android.os.Handler ) v0 ).removeMessages ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
/* .line 411 */
int v0 = 4; // const/4 v0, 0x4
(( com.mobfox.video.sdk.MobFoxMediaController ) p0 ).setVisibility ( v0 ); // invoke-virtual {p0, v0}, Lcom/mobfox/video/sdk/MobFoxMediaController;->setVisibility(I)V
/* .line 412 */
/* iput-boolean v3, p0, Lcom/mobfox/video/sdk/MobFoxMediaController;->mShowing:Z */
/* .line 415 */
} // :cond_3
return;
} // .end method
public Boolean isShowing ( ) {
/* .locals 1 */
/* .prologue */
/* .line 391 */
/* iget-boolean v0, p0, Lcom/mobfox/video/sdk/MobFoxMediaController;->mShowing:Z */
} // .end method
public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 1 */
/* .param p1, "keyCode" # I */
/* .param p2, "event" # Landroid/view/KeyEvent; */
/* .prologue */
/* .line 543 */
int v0 = 4; // const/4 v0, 0x4
/* if-eq p1, v0, :cond_2 */
/* .line 544 */
/* const/16 v0, 0x18 */
/* if-eq p1, v0, :cond_2 */
/* .line 545 */
/* const/16 v0, 0x19 */
/* if-eq p1, v0, :cond_2 */
/* .line 546 */
/* const/16 v0, 0x52 */
/* if-eq p1, v0, :cond_2 */
/* .line 547 */
int v0 = 5; // const/4 v0, 0x5
/* if-eq p1, v0, :cond_2 */
/* .line 548 */
int v0 = 6; // const/4 v0, 0x6
/* if-eq p1, v0, :cond_2 */
/* .line 549 */
/* const/16 v0, 0x4f */
/* if-eq p1, v0, :cond_0 */
/* .line 550 */
/* const/16 v0, 0x55 */
/* if-ne p1, v0, :cond_1 */
/* .line 551 */
} // :cond_0
/* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxMediaController;->doPauseResume()V */
/* .line 552 */
int v0 = 1; // const/4 v0, 0x1
/* .line 563 */
} // :goto_0
/* .line 553 */
} // :cond_1
/* const/16 v0, 0x56 */
/* if-ne p1, v0, :cond_3 */
/* .line 554 */
v0 = this.mPlayer;
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = v0 = this.mPlayer;
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 555 */
v0 = this.mPlayer;
/* .line 556 */
v0 = this.mOnPauseListener;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 557 */
v0 = this.mOnPauseListener;
/* .line 563 */
} // :cond_2
} // :goto_1
v0 = /* invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onKeyDown(ILandroid/view/KeyEvent;)Z */
/* .line 560 */
} // :cond_3
(( com.mobfox.video.sdk.MobFoxMediaController ) p0 ).toggle ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxMediaController;->toggle()V
} // .end method
public void onPause ( ) {
/* .locals 1 */
/* .prologue */
/* .line 649 */
int v0 = 0; // const/4 v0, 0x0
(( com.mobfox.video.sdk.MobFoxMediaController ) p0 ).show ( v0 ); // invoke-virtual {p0, v0}, Lcom/mobfox/video/sdk/MobFoxMediaController;->show(I)V
/* .line 650 */
return;
} // .end method
public void onStart ( ) {
/* .locals 0 */
/* .prologue */
/* .line 633 */
/* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxMediaController;->refreshProgress()V */
/* .line 634 */
return;
} // .end method
public void replay ( ) {
/* .locals 2 */
/* .prologue */
/* .line 431 */
v0 = this.mPlayer;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 432 */
v0 = this.mPlayer;
int v1 = 0; // const/4 v1, 0x0
/* .line 433 */
v0 = this.mPlayer;
/* .line 435 */
} // :cond_0
/* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxMediaController;->refreshProgress()V */
/* .line 436 */
v0 = this.mOnReplayListener;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 437 */
v0 = this.mOnReplayListener;
/* .line 439 */
} // :cond_1
return;
} // .end method
public void resizeTopBar ( Integer p0 ) {
/* .locals 5 */
/* .param p1, "bottom" # I */
/* .prologue */
/* .line 418 */
/* if-gtz p1, :cond_1 */
/* .line 428 */
} // :cond_0
} // :goto_0
return;
/* .line 421 */
} // :cond_1
int v2 = 1; // const/4 v2, 0x1
/* const/high16 v3, 0x40800000 # 4.0f */
(( com.mobfox.video.sdk.MobFoxMediaController ) p0 ).getResources ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxMediaController;->getResources()Landroid/content/res/Resources;
/* .line 422 */
(( android.content.res.Resources ) v4 ).getDisplayMetrics ( ); // invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* .line 420 */
v2 = android.util.TypedValue .applyDimension ( v2,v3,v4 );
/* float-to-int v0, v2 */
/* .line 423 */
/* .local v0, "padding":I */
v2 = this.mTopBar;
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 424 */
v2 = this.mTopBar;
(( android.widget.LinearLayout ) v2 ).getLayoutParams ( ); // invoke-virtual {v2}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* .line 425 */
/* .local v1, "params":Landroid/view/ViewGroup$LayoutParams; */
/* add-int v2, p1, v0 */
/* iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I */
/* .line 426 */
v2 = this.mTopBar;
(( android.widget.LinearLayout ) v2 ).setLayoutParams ( v1 ); // invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
} // .end method
public void setMediaPlayer ( com.mobfox.video.sdk.MobFoxMediaController$MediaPlayerControl p0 ) {
/* .locals 0 */
/* .param p1, "player" # Lcom/mobfox/video/sdk/MobFoxMediaController$MediaPlayerControl; */
/* .prologue */
/* .line 88 */
this.mPlayer = p1;
/* .line 89 */
/* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxMediaController;->updatePausePlay()V */
/* .line 90 */
return;
} // .end method
public void setOnPauseListener ( com.mobfox.video.sdk.MobFoxMediaController$OnPauseListener p0 ) {
/* .locals 0 */
/* .param p1, "l" # Lcom/mobfox/video/sdk/MobFoxMediaController$OnPauseListener; */
/* .prologue */
/* .line 659 */
this.mOnPauseListener = p1;
/* .line 660 */
return;
} // .end method
public void setOnReplayListener ( com.mobfox.video.sdk.MobFoxMediaController$OnReplayListener p0 ) {
/* .locals 0 */
/* .param p1, "l" # Lcom/mobfox/video/sdk/MobFoxMediaController$OnReplayListener; */
/* .prologue */
/* .line 667 */
this.mOnReplayListener = p1;
/* .line 668 */
return;
} // .end method
public void setOnUnpauseListener ( com.mobfox.video.sdk.MobFoxMediaController$OnUnpauseListener p0 ) {
/* .locals 0 */
/* .param p1, "l" # Lcom/mobfox/video/sdk/MobFoxMediaController$OnUnpauseListener; */
/* .prologue */
/* .line 663 */
this.mOnUnpauseListener = p1;
/* .line 664 */
return;
} // .end method
public void show ( ) {
/* .locals 1 */
/* .prologue */
/* .line 356 */
/* const/16 v0, 0x1388 */
(( com.mobfox.video.sdk.MobFoxMediaController ) p0 ).show ( v0 ); // invoke-virtual {p0, v0}, Lcom/mobfox/video/sdk/MobFoxMediaController;->show(I)V
/* .line 357 */
return;
} // .end method
public void show ( Integer p0 ) {
/* .locals 6 */
/* .param p1, "timeout" # I */
/* .prologue */
int v5 = 3; // const/4 v5, 0x3
int v4 = 1; // const/4 v4, 0x1
/* .line 369 */
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
v1 = android.util.Log .isLoggable ( v1,v5 );
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 370 */
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "SHOW:"; // const-string v3, "SHOW:"
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v1,v2 );
/* .line 372 */
} // :cond_0
/* if-nez p1, :cond_1 */
/* .line 373 */
/* iput-boolean v4, p0, Lcom/mobfox/video/sdk/MobFoxMediaController;->mFixed:Z */
/* .line 375 */
} // :cond_1
/* iget-boolean v1, p0, Lcom/mobfox/video/sdk/MobFoxMediaController;->mShowing:Z */
/* if-nez v1, :cond_2 */
/* .line 376 */
int v1 = 0; // const/4 v1, 0x0
(( com.mobfox.video.sdk.MobFoxMediaController ) p0 ).setVisibility ( v1 ); // invoke-virtual {p0, v1}, Lcom/mobfox/video/sdk/MobFoxMediaController;->setVisibility(I)V
/* .line 377 */
/* iput-boolean v4, p0, Lcom/mobfox/video/sdk/MobFoxMediaController;->mShowing:Z */
/* .line 378 */
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
v1 = android.util.Log .isLoggable ( v1,v5 );
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 379 */
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
final String v2 = "Change Visibility"; // const-string v2, "Change Visibility"
android.util.Log .d ( v1,v2 );
/* .line 382 */
} // :cond_2
/* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxMediaController;->refreshProgress()V */
/* .line 383 */
v1 = this.mHandler;
(( android.os.Handler ) v1 ).removeMessages ( v4 ); // invoke-virtual {v1, v4}, Landroid/os/Handler;->removeMessages(I)V
/* .line 384 */
if ( p1 != null) { // if-eqz p1, :cond_3
/* iget-boolean v1, p0, Lcom/mobfox/video/sdk/MobFoxMediaController;->mFixed:Z */
/* if-nez v1, :cond_3 */
/* .line 385 */
v1 = this.mHandler;
(( android.os.Handler ) v1 ).obtainMessage ( v4 ); // invoke-virtual {v1, v4}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;
/* .line 386 */
/* .local v0, "msg":Landroid/os/Message; */
v1 = this.mHandler;
/* int-to-long v2, p1 */
(( android.os.Handler ) v1 ).sendMessageDelayed ( v0, v2, v3 ); // invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z
/* .line 388 */
} // .end local v0 # "msg":Landroid/os/Message;
} // :cond_3
return;
} // .end method
public void toggle ( ) {
/* .locals 1 */
/* .prologue */
/* .line 623 */
v0 = (( com.mobfox.video.sdk.MobFoxMediaController ) p0 ).canToggle ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxMediaController;->canToggle()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 624 */
/* iget-boolean v0, p0, Lcom/mobfox/video/sdk/MobFoxMediaController;->mShowing:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 625 */
(( com.mobfox.video.sdk.MobFoxMediaController ) p0 ).hide ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxMediaController;->hide()V
/* .line 630 */
} // :cond_0
} // :goto_0
return;
/* .line 627 */
} // :cond_1
(( com.mobfox.video.sdk.MobFoxMediaController ) p0 ).show ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxMediaController;->show()V
} // .end method
