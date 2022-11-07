class com.mobfox.video.sdk.MobFoxRichMediaActivity$6 implements android.media.MediaPlayer$OnCompletionListener {
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
 com.mobfox.video.sdk.MobFoxRichMediaActivity$6 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 815 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onCompletion ( android.media.MediaPlayer p0 ) {
/* .locals 10 */
/* .param p1, "mp" # Landroid/media/MediaPlayer; */
/* .prologue */
int v9 = 3; // const/4 v9, 0x3
int v8 = 1; // const/4 v8, 0x1
/* .line 819 */
final String v5 = "MOBFOX"; // const-string v5, "MOBFOX"
v5 = android.util.Log .isLoggable ( v5,v9 );
if ( v5 != null) { // if-eqz v5, :cond_0
	 /* .line 820 */
	 final String v5 = "MOBFOX"; // const-string v5, "MOBFOX"
	 final String v6 = "###########TRACKING END VIDEO"; // const-string v6, "###########TRACKING END VIDEO"
	 android.util.Log .d ( v5,v6 );
	 /* .line 822 */
} // :cond_0
v5 = this.this$0;
com.mobfox.video.sdk.MobFoxRichMediaActivity .access$8 ( v5 );
v4 = this.completeEvents;
/* .line 823 */
/* .local v4, "trackers":Ljava/util/Vector;, "Ljava/util/Vector<Ljava/lang/String;>;" */
int v2 = 0; // const/4 v2, 0x0
/* .local v2, "i":I */
} // :goto_0
v5 = (( java.util.Vector ) v4 ).size ( ); // invoke-virtual {v4}, Ljava/util/Vector;->size()I
/* if-lt v2, v5, :cond_2 */
/* .line 832 */
v5 = this.this$0;
v5 = com.mobfox.video.sdk.MobFoxRichMediaActivity .access$9 ( v5 );
/* if-ne v5, v8, :cond_1 */
/* .line 833 */
v5 = this.this$0;
com.mobfox.video.sdk.MobFoxRichMediaActivity .access$10 ( v5 );
v5 = (( com.mobfox.video.sdk.RichMediaAdData ) v5 ).getType ( ); // invoke-virtual {v5}, Lcom/mobfox/video/sdk/RichMediaAdData;->getType()I
/* if-ne v5, v8, :cond_1 */
/* .line 834 */
/* new-instance v3, Landroid/content/Intent; */
v5 = this.this$0;
/* .line 835 */
/* const-class v6, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity; */
/* .line 834 */
/* invoke-direct {v3, v5, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
/* .line 836 */
/* .local v3, "intent":Landroid/content/Intent; */
final String v5 = "MOBFOX_RICH_AD_DATA"; // const-string v5, "MOBFOX_RICH_AD_DATA"
v6 = this.this$0;
com.mobfox.video.sdk.MobFoxRichMediaActivity .access$10 ( v6 );
(( android.content.Intent ) v3 ).putExtra ( v5, v6 ); // invoke-virtual {v3, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;
/* .line 837 */
final String v5 = "MOBFOX_RICH_AD_TYPE"; // const-string v5, "MOBFOX_RICH_AD_TYPE"
int v6 = 2; // const/4 v6, 0x2
(( android.content.Intent ) v3 ).putExtra ( v5, v6 ); // invoke-virtual {v3, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
/* .line 839 */
try { // :try_start_0
v5 = this.this$0;
(( com.mobfox.video.sdk.MobFoxRichMediaActivity ) v5 ).startActivity ( v3 ); // invoke-virtual {v5, v3}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->startActivity(Landroid/content/Intent;)V
/* .line 841 */
v5 = this.this$0;
/* .line 842 */
v6 = this.this$0;
v6 = com.mobfox.video.sdk.MobFoxRichMediaActivity .access$11 ( v6 );
v7 = this.this$0;
v7 = com.mobfox.video.sdk.MobFoxRichMediaActivity .access$12 ( v7 );
/* .line 841 */
com.mobfox.video.sdk.MobFoxRichMediaActivity .setActivityAnimation ( v5,v6,v7 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 847 */
} // .end local v3 # "intent":Landroid/content/Intent;
} // :cond_1
} // :goto_1
v5 = this.this$0;
com.mobfox.video.sdk.MobFoxRichMediaActivity .access$13 ( v5,v8 );
/* .line 848 */
v5 = this.this$0;
int v6 = -1; // const/4 v6, -0x1
(( com.mobfox.video.sdk.MobFoxRichMediaActivity ) v5 ).setResult ( v6 ); // invoke-virtual {v5, v6}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->setResult(I)V
/* .line 849 */
v5 = this.this$0;
(( com.mobfox.video.sdk.MobFoxRichMediaActivity ) v5 ).finish ( ); // invoke-virtual {v5}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->finish()V
/* .line 850 */
return;
/* .line 824 */
} // :cond_2
final String v5 = "MOBFOX"; // const-string v5, "MOBFOX"
v5 = android.util.Log .isLoggable ( v5,v9 );
if ( v5 != null) { // if-eqz v5, :cond_3
/* .line 825 */
final String v6 = "MOBFOX"; // const-string v6, "MOBFOX"
/* new-instance v7, Ljava/lang/StringBuilder; */
final String v5 = "Track url:"; // const-string v5, "Track url:"
/* invoke-direct {v7, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.util.Vector ) v4 ).get ( v2 ); // invoke-virtual {v4, v2}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
/* check-cast v5, Ljava/lang/String; */
(( java.lang.StringBuilder ) v7 ).append ( v5 ); // invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v6,v5 );
/* .line 827 */
} // :cond_3
/* new-instance v1, Lcom/mobfox/video/sdk/TrackEvent; */
/* invoke-direct {v1}, Lcom/mobfox/video/sdk/TrackEvent;-><init>()V */
/* .line 828 */
/* .local v1, "event":Lcom/mobfox/video/sdk/TrackEvent; */
(( java.util.Vector ) v4 ).get ( v2 ); // invoke-virtual {v4, v2}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
/* check-cast v5, Ljava/lang/String; */
this.url = v5;
/* .line 829 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v5 */
/* iput-wide v5, v1, Lcom/mobfox/video/sdk/TrackEvent;->timestamp:J */
/* .line 830 */
com.mobfox.video.sdk.TrackerService .requestTrack ( v1 );
/* .line 823 */
/* add-int/lit8 v2, v2, 0x1 */
/* goto/16 :goto_0 */
/* .line 843 */
} // .end local v1 # "event":Lcom/mobfox/video/sdk/TrackEvent;
/* .restart local v3 # "intent":Landroid/content/Intent; */
/* :catch_0 */
/* move-exception v0 */
/* .line 844 */
/* .local v0, "e":Ljava/lang/Exception; */
final String v5 = "MOBFOX"; // const-string v5, "MOBFOX"
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "Cannot start MobFox Rich Ad activity:"; // const-string v7, "Cannot start MobFox Rich Ad activity:"
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v6 ).append ( v0 ); // invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v5,v6,v0 );
} // .end method
