class com.mobfox.video.sdk.MobFoxRichMediaActivity$17 implements com.mobfox.video.sdk.MobFoxWebViewClient$OnPageLoadedListener {
	 /* .source "MobFoxRichMediaActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/mobfox/video/sdk/MobFoxRichMediaActivity; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.mobfox.video.sdk.MobFoxRichMediaActivity this$0; //synthetic
/* # direct methods */
 com.mobfox.video.sdk.MobFoxRichMediaActivity$17 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 1070 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onPageLoaded ( ) {
/* .locals 6 */
/* .prologue */
int v5 = 1; // const/4 v5, 0x1
/* .line 1074 */
final String v2 = "MOBFOX"; // const-string v2, "MOBFOX"
final String v3 = "onPageLoaded"; // const-string v3, "onPageLoaded"
android.util.Log .v ( v2,v3 );
/* .line 1075 */
v2 = this.this$0;
com.mobfox.video.sdk.MobFoxRichMediaActivity .access$18 ( v2 );
if ( v2 != null) { // if-eqz v2, :cond_0
	 /* .line 1076 */
	 v2 = this.this$0;
	 com.mobfox.video.sdk.MobFoxRichMediaActivity .access$18 ( v2 );
	 /* iget v2, v2, Lcom/mobfox/video/sdk/InterstitialData;->autoclose:I */
	 /* if-lez v2, :cond_0 */
	 /* .line 1077 */
	 v2 = this.this$0;
	 com.mobfox.video.sdk.MobFoxRichMediaActivity .access$16 ( v2 );
	 /* if-nez v2, :cond_0 */
	 /* .line 1078 */
	 v2 = this.this$0;
	 /* iget-boolean v2, v2, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mInterstitialAutocloseReset:Z */
	 /* if-nez v2, :cond_0 */
	 /* .line 1079 */
	 /* new-instance v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$InterstitialAutocloseTask; */
	 v2 = this.this$0;
	 /* .line 1080 */
	 v3 = this.this$0;
	 /* .line 1079 */
	 /* invoke-direct {v0, v2, v3}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$InterstitialAutocloseTask;-><init>(Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;Landroid/app/Activity;)V */
	 /* .line 1081 */
	 /* .local v0, "autocloseTask":Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$InterstitialAutocloseTask; */
	 v2 = this.this$0;
	 /* new-instance v3, Ljava/util/Timer; */
	 /* invoke-direct {v3}, Ljava/util/Timer;-><init>()V */
	 com.mobfox.video.sdk.MobFoxRichMediaActivity .access$17 ( v2,v3 );
	 /* .line 1082 */
	 v2 = this.this$0;
	 com.mobfox.video.sdk.MobFoxRichMediaActivity .access$16 ( v2 );
	 /* .line 1083 */
	 v3 = this.this$0;
	 com.mobfox.video.sdk.MobFoxRichMediaActivity .access$18 ( v3 );
	 /* iget v3, v3, Lcom/mobfox/video/sdk/InterstitialData;->autoclose:I */
	 /* mul-int/lit16 v3, v3, 0x3e8 */
	 /* int-to-long v3, v3 */
	 /* .line 1082 */
	 (( java.util.Timer ) v2 ).schedule ( v0, v3, v4 ); // invoke-virtual {v2, v0, v3, v4}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
	 /* .line 1084 */
	 final String v2 = "MOBFOX"; // const-string v2, "MOBFOX"
	 final String v3 = "onPageLoaded mInterstitialAutocloseTimer"; // const-string v3, "onPageLoaded mInterstitialAutocloseTimer"
	 android.util.Log .v ( v2,v3 );
	 /* .line 1087 */
} // .end local v0 # "autocloseTask":Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$InterstitialAutocloseTask;
} // :cond_0
v2 = this.this$0;
com.mobfox.video.sdk.MobFoxRichMediaActivity .access$18 ( v2 );
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 1088 */
v2 = this.this$0;
com.mobfox.video.sdk.MobFoxRichMediaActivity .access$18 ( v2 );
/* iget v2, v2, Lcom/mobfox/video/sdk/InterstitialData;->showSkipButtonAfter:I */
/* if-lez v2, :cond_3 */
/* .line 1089 */
v2 = this.this$0;
com.mobfox.video.sdk.MobFoxRichMediaActivity .access$19 ( v2 );
/* if-nez v2, :cond_1 */
/* .line 1090 */
/* new-instance v1, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$CanSkipTask; */
v2 = this.this$0;
/* .line 1091 */
v3 = this.this$0;
/* .line 1090 */
/* invoke-direct {v1, v2, v3}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$CanSkipTask;-><init>(Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;)V */
/* .line 1092 */
/* .local v1, "skipTask":Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$CanSkipTask; */
v2 = this.this$0;
/* new-instance v3, Ljava/util/Timer; */
/* invoke-direct {v3}, Ljava/util/Timer;-><init>()V */
com.mobfox.video.sdk.MobFoxRichMediaActivity .access$20 ( v2,v3 );
/* .line 1093 */
v2 = this.this$0;
com.mobfox.video.sdk.MobFoxRichMediaActivity .access$19 ( v2 );
/* .line 1094 */
v3 = this.this$0;
com.mobfox.video.sdk.MobFoxRichMediaActivity .access$18 ( v3 );
/* iget v3, v3, Lcom/mobfox/video/sdk/InterstitialData;->showSkipButtonAfter:I */
/* mul-int/lit16 v3, v3, 0x3e8 */
/* int-to-long v3, v3 */
/* .line 1093 */
(( java.util.Timer ) v2 ).schedule ( v1, v3, v4 ); // invoke-virtual {v2, v1, v3, v4}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
/* .line 1095 */
final String v2 = "MOBFOX"; // const-string v2, "MOBFOX"
final String v3 = "onPageLoaded mInterstitialCanCloseTimer"; // const-string v3, "onPageLoaded mInterstitialCanCloseTimer"
android.util.Log .v ( v2,v3 );
/* .line 1100 */
} // .end local v1 # "skipTask":Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$CanSkipTask;
} // :cond_1
} // :goto_0
v2 = this.this$0;
com.mobfox.video.sdk.MobFoxRichMediaActivity .access$21 ( v2 );
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 1101 */
v2 = this.this$0;
com.mobfox.video.sdk.MobFoxRichMediaActivity .access$21 ( v2 );
(( java.util.Timer ) v2 ).cancel ( ); // invoke-virtual {v2}, Ljava/util/Timer;->cancel()V
/* .line 1102 */
v2 = this.this$0;
int v3 = 0; // const/4 v3, 0x0
com.mobfox.video.sdk.MobFoxRichMediaActivity .access$22 ( v2,v3 );
/* .line 1104 */
} // :cond_2
v2 = this.this$0;
com.mobfox.video.sdk.MobFoxRichMediaActivity .access$23 ( v2,v5 );
/* .line 1105 */
v2 = this.this$0;
com.mobfox.video.sdk.MobFoxRichMediaActivity .access$15 ( v2 );
(( com.mobfox.video.sdk.MobFoxInterstitialController ) v2 ).pageLoaded ( ); // invoke-virtual {v2}, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->pageLoaded()V
/* .line 1106 */
return;
/* .line 1098 */
} // :cond_3
v2 = this.this$0;
com.mobfox.video.sdk.MobFoxRichMediaActivity .access$14 ( v2,v5 );
} // .end method
