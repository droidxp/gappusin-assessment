class com.mobfox.video.sdk.MobFoxRichMediaActivity$7 implements com.mobfox.video.sdk.MobFoxVideoView$OnStartListener {
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
 com.mobfox.video.sdk.MobFoxRichMediaActivity$7 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 853 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onVideoStart ( ) {
/* .locals 7 */
/* .prologue */
int v6 = 3; // const/4 v6, 0x3
/* .line 857 */
final String v3 = "MOBFOX"; // const-string v3, "MOBFOX"
v3 = android.util.Log .isLoggable ( v3,v6 );
if ( v3 != null) { // if-eqz v3, :cond_0
	 /* .line 858 */
	 final String v3 = "MOBFOX"; // const-string v3, "MOBFOX"
	 final String v4 = "###########TRACKING START VIDEO"; // const-string v4, "###########TRACKING START VIDEO"
	 android.util.Log .d ( v3,v4 );
	 /* .line 860 */
} // :cond_0
v3 = this.this$0;
com.mobfox.video.sdk.MobFoxRichMediaActivity .access$8 ( v3 );
v2 = this.startEvents;
/* .line 861 */
/* .local v2, "trackers":Ljava/util/Vector;, "Ljava/util/Vector<Ljava/lang/String;>;" */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i":I */
} // :goto_0
v3 = (( java.util.Vector ) v2 ).size ( ); // invoke-virtual {v2}, Ljava/util/Vector;->size()I
/* if-lt v1, v3, :cond_1 */
/* .line 870 */
return;
/* .line 862 */
} // :cond_1
final String v3 = "MOBFOX"; // const-string v3, "MOBFOX"
v3 = android.util.Log .isLoggable ( v3,v6 );
if ( v3 != null) { // if-eqz v3, :cond_2
/* .line 863 */
final String v4 = "MOBFOX"; // const-string v4, "MOBFOX"
/* new-instance v5, Ljava/lang/StringBuilder; */
final String v3 = "Track url:"; // const-string v3, "Track url:"
/* invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.util.Vector ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
/* check-cast v3, Ljava/lang/String; */
(( java.lang.StringBuilder ) v5 ).append ( v3 ); // invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v4,v3 );
/* .line 865 */
} // :cond_2
/* new-instance v0, Lcom/mobfox/video/sdk/TrackEvent; */
/* invoke-direct {v0}, Lcom/mobfox/video/sdk/TrackEvent;-><init>()V */
/* .line 866 */
/* .local v0, "event":Lcom/mobfox/video/sdk/TrackEvent; */
(( java.util.Vector ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
/* check-cast v3, Ljava/lang/String; */
this.url = v3;
/* .line 867 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v3 */
/* iput-wide v3, v0, Lcom/mobfox/video/sdk/TrackEvent;->timestamp:J */
/* .line 868 */
com.mobfox.video.sdk.TrackerService .requestTrack ( v0 );
/* .line 861 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
