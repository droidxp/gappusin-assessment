public class com.jumptap.adtag.activity.JTVideoActivity extends android.app.Activity implements com.jumptap.adtag.listeners.JtAdViewInnerListener implements android.media.MediaPlayer$OnCompletionListener {
	 /* .source "JTVideoActivity.java" */
	 /* # interfaces */
	 /* # static fields */
	 private static final Integer LEARN_MORE_BTN_ID;
	 private static final Integer SKIP_BTN_ID;
	 /* # instance fields */
	 private android.widget.Button learnMoreBtn;
	 private android.widget.RelativeLayout$LayoutParams learnMoreBtnRlp;
	 private android.widget.Button skipBtn;
	 private android.widget.RelativeLayout$LayoutParams skipBtnRlp;
	 private android.widget.VideoView videoView;
	 /* # direct methods */
	 public com.jumptap.adtag.activity.JTVideoActivity ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 36 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 return;
	 } // .end method
	 static void access$000 ( com.jumptap.adtag.activity.JTVideoActivity p0 ) { //synthethic
		 /* .locals 0 */
		 /* .param p0, "x0" # Lcom/jumptap/adtag/activity/JTVideoActivity; */
		 /* .prologue */
		 /* .line 36 */
		 /* invoke-direct {p0}, Lcom/jumptap/adtag/activity/JTVideoActivity;->closeActivity()V */
		 return;
	 } // .end method
	 static android.widget.RelativeLayout$LayoutParams access$100 ( com.jumptap.adtag.activity.JTVideoActivity p0 ) { //synthethic
		 /* .locals 1 */
		 /* .param p0, "x0" # Lcom/jumptap/adtag/activity/JTVideoActivity; */
		 /* .prologue */
		 /* .line 36 */
		 v0 = this.skipBtnRlp;
	 } // .end method
	 static android.widget.Button access$200 ( com.jumptap.adtag.activity.JTVideoActivity p0 ) { //synthethic
		 /* .locals 1 */
		 /* .param p0, "x0" # Lcom/jumptap/adtag/activity/JTVideoActivity; */
		 /* .prologue */
		 /* .line 36 */
		 v0 = this.skipBtn;
	 } // .end method
	 static android.widget.RelativeLayout$LayoutParams access$300 ( com.jumptap.adtag.activity.JTVideoActivity p0 ) { //synthethic
		 /* .locals 1 */
		 /* .param p0, "x0" # Lcom/jumptap/adtag/activity/JTVideoActivity; */
		 /* .prologue */
		 /* .line 36 */
		 v0 = this.learnMoreBtnRlp;
	 } // .end method
	 static android.widget.Button access$400 ( com.jumptap.adtag.activity.JTVideoActivity p0 ) { //synthethic
		 /* .locals 1 */
		 /* .param p0, "x0" # Lcom/jumptap/adtag/activity/JTVideoActivity; */
		 /* .prologue */
		 /* .line 36 */
		 v0 = this.learnMoreBtn;
	 } // .end method
	 private void closeActivity ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 200 */
		 /* new-instance v0, Lcom/jumptap/adtag/activity/JTVideoActivity$3; */
		 /* invoke-direct {v0, p0}, Lcom/jumptap/adtag/activity/JTVideoActivity$3;-><init>(Lcom/jumptap/adtag/activity/JTVideoActivity;)V */
		 (( com.jumptap.adtag.activity.JTVideoActivity ) p0 ).runOnUiThread ( v0 ); // invoke-virtual {p0, v0}, Lcom/jumptap/adtag/activity/JTVideoActivity;->runOnUiThread(Ljava/lang/Runnable;)V
		 /* .line 219 */
		 return;
	 } // .end method
	 private void configLearnMoreBtnOnClickListener ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 67 */
		 com.jumptap.adtag.activity.JTVideo .getClickThroughUrl ( );
		 /* .line 69 */
		 /* .local v0, "clickThroughUrl":Ljava/lang/String; */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 final String v1 = ""; // const-string v1, ""
			 v1 = 			 (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
			 /* if-nez v1, :cond_0 */
			 /* .line 70 */
			 v1 = this.learnMoreBtn;
			 /* new-instance v2, Lcom/jumptap/adtag/activity/JTVideoActivity$1; */
			 /* invoke-direct {v2, p0, v0}, Lcom/jumptap/adtag/activity/JTVideoActivity$1;-><init>(Lcom/jumptap/adtag/activity/JTVideoActivity;Ljava/lang/String;)V */
			 (( android.widget.Button ) v1 ).setOnClickListener ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
			 /* .line 96 */
		 } // :goto_0
		 return;
		 /* .line 94 */
	 } // :cond_0
	 v1 = this.learnMoreBtn;
	 /* const/16 v2, 0x8 */
	 (( android.widget.Button ) v1 ).setVisibility ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/Button;->setVisibility(I)V
} // .end method
private void initJtMediaPlayer ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 106 */
	 com.jumptap.adtag.media.JTMediaPlayer .getInstance ( );
	 /* .line 109 */
	 /* .local v0, "jtMediaPlayer":Lcom/jumptap/adtag/media/JTMediaPlayer; */
	 (( com.jumptap.adtag.media.JTMediaPlayer ) v0 ).setOnCompletionListener ( p0 ); // invoke-virtual {v0, p0}, Lcom/jumptap/adtag/media/JTMediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V
	 /* .line 110 */
	 v1 = this.videoView;
	 (( com.jumptap.adtag.media.JTMediaPlayer ) v0 ).setVideoView ( v1 ); // invoke-virtual {v0, v1}, Lcom/jumptap/adtag/media/JTMediaPlayer;->setVideoView(Landroid/widget/VideoView;)V
	 /* .line 111 */
	 return;
} // .end method
private void initUI ( ) {
	 /* .locals 9 */
	 /* .prologue */
	 /* const/16 v8, 0x23 */
	 int v6 = 6; // const/4 v6, 0x6
	 int v5 = -1; // const/4 v5, -0x1
	 int v7 = -2; // const/4 v7, -0x2
	 /* .line 138 */
	 (( com.jumptap.adtag.activity.JTVideoActivity ) p0 ).getWindowManager ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/activity/JTVideoActivity;->getWindowManager()Landroid/view/WindowManager;
	 /* .line 139 */
	 /* .local v0, "display":Landroid/view/Display; */
	 v3 = 	 (( android.view.Display ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/view/Display;->getWidth()I
	 /* .line 141 */
	 /* .local v3, "width":I */
	 /* new-instance v1, Landroid/widget/RelativeLayout; */
	 /* invoke-direct {v1, p0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V */
	 /* .line 142 */
	 /* .local v1, "relLayout":Landroid/widget/RelativeLayout; */
	 /* new-instance v4, Landroid/view/ViewGroup$LayoutParams; */
	 /* invoke-direct {v4, v5, v5}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V */
	 (( android.widget.RelativeLayout ) v1 ).setLayoutParams ( v4 ); // invoke-virtual {v1, v4}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
	 /* .line 146 */
	 /* invoke-direct {p0}, Lcom/jumptap/adtag/activity/JTVideoActivity;->setLearnMoreButton()V */
	 /* .line 147 */
	 /* new-instance v4, Landroid/widget/RelativeLayout$LayoutParams; */
	 /* div-int/lit8 v5, v3, 0x2 */
	 /* invoke-direct {v4, v5, v8}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V */
	 this.learnMoreBtnRlp = v4;
	 /* .line 148 */
	 v4 = this.learnMoreBtnRlp;
	 (( android.widget.RelativeLayout$LayoutParams ) v4 ).addRule ( v6 ); // invoke-virtual {v4, v6}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
	 /* .line 149 */
	 v4 = this.learnMoreBtn;
	 v5 = this.learnMoreBtnRlp;
	 (( android.widget.RelativeLayout ) v1 ).addView ( v4, v5 ); // invoke-virtual {v1, v4, v5}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
	 /* .line 152 */
	 /* invoke-direct {p0}, Lcom/jumptap/adtag/activity/JTVideoActivity;->setSkipButton()V */
	 /* .line 153 */
	 /* new-instance v4, Landroid/widget/RelativeLayout$LayoutParams; */
	 /* div-int/lit8 v5, v3, 0x2 */
	 /* invoke-direct {v4, v5, v8}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V */
	 this.skipBtnRlp = v4;
	 /* .line 154 */
	 v4 = this.skipBtnRlp;
	 (( android.widget.RelativeLayout$LayoutParams ) v4 ).addRule ( v6 ); // invoke-virtual {v4, v6}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
	 /* .line 155 */
	 v4 = this.skipBtnRlp;
	 int v5 = 1; // const/4 v5, 0x1
	 /* const v6, 0x4a2cb71 */
	 (( android.widget.RelativeLayout$LayoutParams ) v4 ).addRule ( v5, v6 ); // invoke-virtual {v4, v5, v6}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
	 /* .line 156 */
	 v4 = this.skipBtn;
	 v5 = this.skipBtnRlp;
	 (( android.widget.RelativeLayout ) v1 ).addView ( v4, v5 ); // invoke-virtual {v1, v4, v5}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
	 /* .line 159 */
	 /* new-instance v2, Landroid/widget/RelativeLayout$LayoutParams; */
	 /* invoke-direct {v2, v7, v7}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V */
	 /* .line 161 */
	 /* .local v2, "videoLp":Landroid/widget/RelativeLayout$LayoutParams; */
	 int v4 = 3; // const/4 v4, 0x3
	 /* const v5, 0x87a238 */
	 (( android.widget.RelativeLayout$LayoutParams ) v2 ).addRule ( v4, v5 ); // invoke-virtual {v2, v4, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
	 /* .line 162 */
	 /* new-instance v4, Landroid/widget/VideoView; */
	 /* invoke-direct {v4, p0}, Landroid/widget/VideoView;-><init>(Landroid/content/Context;)V */
	 this.videoView = v4;
	 /* .line 163 */
	 v4 = this.videoView;
	 (( android.widget.RelativeLayout ) v1 ).addView ( v4, v2 ); // invoke-virtual {v1, v4, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
	 /* .line 165 */
	 (( com.jumptap.adtag.activity.JTVideoActivity ) p0 ).setContentView ( v1 ); // invoke-virtual {p0, v1}, Lcom/jumptap/adtag/activity/JTVideoActivity;->setContentView(Landroid/view/View;)V
	 /* .line 166 */
	 return;
} // .end method
private void sendTrackingLink ( ) {
	 /* .locals 12 */
	 /* .prologue */
	 int v8 = 1; // const/4 v8, 0x1
	 int v9 = 0; // const/4 v9, 0x0
	 /* .line 114 */
	 com.jumptap.adtag.activity.JTVideo .getTrackingUrl ( );
	 /* .line 116 */
	 /* .local v6, "urlArr":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;" */
	 if ( v6 != null) { // if-eqz v6, :cond_3
		 /* .line 117 */
		 /* new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient; */
		 /* invoke-direct {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V */
		 /* .line 118 */
		 /* .local v0, "client":Lorg/apache/http/client/HttpClient; */
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 119 */
		 /* .local v2, "get":Lorg/apache/http/client/methods/HttpGet; */
		 /* .local v4, "i$":Ljava/util/Iterator; */
	 } // :cond_0
v7 = } // :goto_0
if ( v7 != null) { // if-eqz v7, :cond_3
	 /* check-cast v5, Ljava/lang/String; */
	 /* .line 121 */
	 /* .local v5, "url":Ljava/lang/String; */
	 if ( v5 != null) { // if-eqz v5, :cond_1
		 /* move v7, v8 */
	 } // :goto_1
	 final String v10 = ""; // const-string v10, ""
	 v10 = 	 (( java.lang.String ) v5 ).equals ( v10 ); // invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 /* if-nez v10, :cond_2 */
	 /* move v10, v8 */
} // :goto_2
/* and-int/2addr v7, v10 */
if ( v7 != null) { // if-eqz v7, :cond_0
	 /* .line 123 */
	 try { // :try_start_0
		 /* new-instance v3, Lorg/apache/http/client/methods/HttpGet; */
		 /* invoke-direct {v3, v5}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V */
		 /* :try_end_0 */
		 /* .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
		 /* .line 124 */
	 } // .end local v2 # "get":Lorg/apache/http/client/methods/HttpGet;
	 /* .local v3, "get":Lorg/apache/http/client/methods/HttpGet; */
	 try { // :try_start_1
		 /* .line 125 */
		 final String v7 = "JtAd"; // const-string v7, "JtAd"
		 /* new-instance v10, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v11 = "Sending video tracking url succeeded url="; // const-string v11, "Sending video tracking url succeeded url="
		 (( java.lang.StringBuilder ) v10 ).append ( v11 ); // invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v10 ).append ( v5 ); // invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v10 ).toString ( ); // invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .i ( v7,v10 );
		 /* :try_end_1 */
		 /* .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_1 ..:try_end_1} :catch_3 */
		 /* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_2 */
		 /* move-object v2, v3 */
		 /* .line 130 */
	 } // .end local v3 # "get":Lorg/apache/http/client/methods/HttpGet;
	 /* .restart local v2 # "get":Lorg/apache/http/client/methods/HttpGet; */
} // :cond_1
/* move v7, v9 */
/* .line 121 */
} // :cond_2
/* move v10, v9 */
/* .line 126 */
/* :catch_0 */
/* move-exception v1 */
/* .line 127 */
/* .local v1, "e":Lorg/apache/http/client/ClientProtocolException; */
} // :goto_3
final String v7 = "JtAd"; // const-string v7, "JtAd"
/* new-instance v10, Ljava/lang/StringBuilder; */
/* invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V */
final String v11 = "fail to send video tracking url url="; // const-string v11, "fail to send video tracking url url="
(( java.lang.StringBuilder ) v10 ).append ( v11 ); // invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v10 ).append ( v5 ); // invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v10 ).toString ( ); // invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v7,v10,v1 );
/* .line 128 */
} // .end local v1 # "e":Lorg/apache/http/client/ClientProtocolException;
/* :catch_1 */
/* move-exception v1 */
/* .line 129 */
/* .local v1, "e":Ljava/io/IOException; */
} // :goto_4
final String v7 = "JtAd"; // const-string v7, "JtAd"
/* new-instance v10, Ljava/lang/StringBuilder; */
/* invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V */
final String v11 = "fail to send video tracking url url="; // const-string v11, "fail to send video tracking url url="
(( java.lang.StringBuilder ) v10 ).append ( v11 ); // invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v10 ).append ( v5 ); // invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v10 ).toString ( ); // invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v7,v10,v1 );
/* .line 134 */
} // .end local v0 # "client":Lorg/apache/http/client/HttpClient;
} // .end local v1 # "e":Ljava/io/IOException;
} // .end local v2 # "get":Lorg/apache/http/client/methods/HttpGet;
} // .end local v4 # "i$":Ljava/util/Iterator;
} // .end local v5 # "url":Ljava/lang/String;
} // :cond_3
return;
/* .line 128 */
/* .restart local v0 # "client":Lorg/apache/http/client/HttpClient; */
/* .restart local v3 # "get":Lorg/apache/http/client/methods/HttpGet; */
/* .restart local v4 # "i$":Ljava/util/Iterator; */
/* .restart local v5 # "url":Ljava/lang/String; */
/* :catch_2 */
/* move-exception v1 */
/* move-object v2, v3 */
} // .end local v3 # "get":Lorg/apache/http/client/methods/HttpGet;
/* .restart local v2 # "get":Lorg/apache/http/client/methods/HttpGet; */
/* .line 126 */
} // .end local v2 # "get":Lorg/apache/http/client/methods/HttpGet;
/* .restart local v3 # "get":Lorg/apache/http/client/methods/HttpGet; */
/* :catch_3 */
/* move-exception v1 */
/* move-object v2, v3 */
} // .end local v3 # "get":Lorg/apache/http/client/methods/HttpGet;
/* .restart local v2 # "get":Lorg/apache/http/client/methods/HttpGet; */
} // .end method
private void setLearnMoreButton ( ) {
/* .locals 2 */
/* .prologue */
/* .line 169 */
/* new-instance v0, Landroid/widget/Button; */
/* invoke-direct {v0, p0}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V */
this.learnMoreBtn = v0;
/* .line 170 */
v0 = this.learnMoreBtn;
/* const v1, 0x4a2cb71 */
(( android.widget.Button ) v0 ).setId ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/Button;->setId(I)V
/* .line 171 */
v0 = this.learnMoreBtn;
int v1 = 1; // const/4 v1, 0x1
(( android.widget.Button ) v0 ).setClickable ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/Button;->setClickable(Z)V
/* .line 172 */
v0 = this.learnMoreBtn;
final String v1 = "Learn more"; // const-string v1, "Learn more"
(( android.widget.Button ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
/* .line 173 */
return;
} // .end method
private void setSkipButton ( ) {
/* .locals 2 */
/* .prologue */
/* .line 176 */
/* new-instance v0, Landroid/widget/Button; */
/* invoke-direct {v0, p0}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V */
this.skipBtn = v0;
/* .line 177 */
v0 = this.skipBtn;
/* const v1, 0x87a238 */
(( android.widget.Button ) v0 ).setId ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/Button;->setId(I)V
/* .line 178 */
v0 = this.skipBtn;
int v1 = 1; // const/4 v1, 0x1
(( android.widget.Button ) v0 ).setClickable ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/Button;->setClickable(Z)V
/* .line 179 */
v0 = this.skipBtn;
final String v1 = "Skip"; // const-string v1, "Skip"
(( android.widget.Button ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
/* .line 180 */
v0 = this.skipBtn;
/* new-instance v1, Lcom/jumptap/adtag/activity/JTVideoActivity$2; */
/* invoke-direct {v1, p0}, Lcom/jumptap/adtag/activity/JTVideoActivity$2;-><init>(Lcom/jumptap/adtag/activity/JTVideoActivity;)V */
(( android.widget.Button ) v0 ).setOnClickListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 196 */
return;
} // .end method
/* # virtual methods */
public java.lang.String getAdRequestId ( ) {
/* .locals 1 */
/* .prologue */
/* .line 244 */
com.jumptap.adtag.activity.JTVideo .getAdRequestId ( );
} // .end method
public com.jumptap.adtag.JtAdWidgetSettings getWidgetSettings ( ) {
/* .locals 1 */
/* .prologue */
/* .line 248 */
com.jumptap.adtag.JtAdWidgetSettingsFactory .createWidgetSettings ( );
} // .end method
public void handleClicks ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "URI" # Ljava/lang/String; */
/* .prologue */
/* .line 306 */
return;
} // .end method
public void hide ( ) {
/* .locals 0 */
/* .prologue */
/* .line 289 */
return;
} // .end method
public void onAdError ( Integer p0 ) {
/* .locals 0 */
/* .param p1, "errorCode" # I */
/* .prologue */
/* .line 252 */
return;
} // .end method
public void onBeginAdInteraction ( ) {
/* .locals 0 */
/* .prologue */
/* .line 279 */
return;
} // .end method
public void onCompletion ( android.media.MediaPlayer p0 ) {
/* .locals 0 */
/* .param p1, "mp" # Landroid/media/MediaPlayer; */
/* .prologue */
/* .line 299 */
/* invoke-direct {p0}, Lcom/jumptap/adtag/activity/JTVideoActivity;->closeActivity()V */
/* .line 300 */
return;
} // .end method
public void onConfigurationChanged ( android.content.res.Configuration p0 ) {
/* .locals 1 */
/* .param p1, "newConfig" # Landroid/content/res/Configuration; */
/* .prologue */
/* .line 225 */
/* new-instance v0, Lcom/jumptap/adtag/activity/JTVideoActivity$4; */
/* invoke-direct {v0, p0}, Lcom/jumptap/adtag/activity/JTVideoActivity$4;-><init>(Lcom/jumptap/adtag/activity/JTVideoActivity;)V */
(( com.jumptap.adtag.activity.JTVideoActivity ) p0 ).runOnUiThread ( v0 ); // invoke-virtual {p0, v0}, Lcom/jumptap/adtag/activity/JTVideoActivity;->runOnUiThread(Ljava/lang/Runnable;)V
/* .line 240 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V */
/* .line 241 */
return;
} // .end method
public void onCreate ( android.os.Bundle p0 ) {
/* .locals 0 */
/* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
/* .prologue */
/* .line 51 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
/* .line 54 */
/* invoke-direct {p0}, Lcom/jumptap/adtag/activity/JTVideoActivity;->initUI()V */
/* .line 57 */
/* invoke-direct {p0}, Lcom/jumptap/adtag/activity/JTVideoActivity;->initJtMediaPlayer()V */
/* .line 60 */
/* invoke-direct {p0}, Lcom/jumptap/adtag/activity/JTVideoActivity;->sendTrackingLink()V */
/* .line 62 */
/* invoke-direct {p0}, Lcom/jumptap/adtag/activity/JTVideoActivity;->configLearnMoreBtnOnClickListener()V */
/* .line 64 */
return;
} // .end method
public void onEndAdInteraction ( ) {
/* .locals 0 */
/* .prologue */
/* .line 284 */
return;
} // .end method
public void onInterstitialDismissed ( ) {
/* .locals 0 */
/* .prologue */
/* .line 255 */
return;
} // .end method
public void onNewAd ( ) {
/* .locals 0 */
/* .prologue */
/* .line 258 */
return;
} // .end method
public void onNoAdFound ( ) {
/* .locals 0 */
/* .prologue */
/* .line 261 */
return;
} // .end method
protected void onPause ( ) {
/* .locals 0 */
/* .prologue */
/* .line 100 */
/* invoke-super {p0}, Landroid/app/Activity;->onPause()V */
/* .line 101 */
/* invoke-direct {p0}, Lcom/jumptap/adtag/activity/JTVideoActivity;->closeActivity()V */
/* .line 102 */
return;
} // .end method
public Boolean post ( java.lang.Runnable p0 ) {
/* .locals 1 */
/* .param p1, "action" # Ljava/lang/Runnable; */
/* .prologue */
/* .line 264 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void resize ( Integer p0, Integer p1, Boolean p2 ) {
/* .locals 0 */
/* .param p1, "width" # I */
/* .param p2, "height" # I */
/* .param p3, "shouldExpand" # Z */
/* .prologue */
/* .line 269 */
return;
} // .end method
public void resizeWithCallback ( Boolean p0, Integer p1, Integer p2, java.lang.String p3, Integer p4, java.lang.String p5 ) {
/* .locals 0 */
/* .param p1, "shouldExpand" # Z */
/* .param p2, "width" # I */
/* .param p3, "height" # I */
/* .param p4, "callback" # Ljava/lang/String; */
/* .param p5, "transition" # I */
/* .param p6, "options" # Ljava/lang/String; */
/* .prologue */
/* .line 274 */
return;
} // .end method
public void setContent ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 0 */
/* .param p1, "resContent" # Ljava/lang/String; */
/* .param p2, "adRequestId" # Ljava/lang/String; */
/* .prologue */
/* .line 292 */
return;
} // .end method
