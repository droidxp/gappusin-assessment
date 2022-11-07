class com.mobfox.video.sdk.MobFoxVideoView$4 implements android.media.MediaPlayer$OnErrorListener {
	 /* .source "MobFoxVideoView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/mobfox/video/sdk/MobFoxVideoView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.mobfox.video.sdk.MobFoxVideoView this$0; //synthetic
/* # direct methods */
 com.mobfox.video.sdk.MobFoxVideoView$4 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 327 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public Boolean onError ( android.media.MediaPlayer p0, Integer p1, Integer p2 ) {
/* .locals 5 */
/* .param p1, "mp" # Landroid/media/MediaPlayer; */
/* .param p2, "framework_err" # I */
/* .param p3, "impl_err" # I */
/* .prologue */
int v4 = 1; // const/4 v4, 0x1
int v3 = -1; // const/4 v3, -0x1
/* .line 329 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
int v1 = 3; // const/4 v1, 0x3
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 330 */
	 final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 final String v2 = "Error: "; // const-string v2, "Error: "
	 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 (( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 final String v2 = ","; // const-string v2, ","
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).append ( p3 ); // invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .d ( v0,v1 );
	 /* .line 332 */
} // :cond_0
v0 = this.this$0;
com.mobfox.video.sdk.MobFoxVideoView .access$1 ( v0,v3 );
/* .line 333 */
v0 = this.this$0;
com.mobfox.video.sdk.MobFoxVideoView .access$8 ( v0,v3 );
/* .line 334 */
v0 = this.this$0;
com.mobfox.video.sdk.MobFoxVideoView .access$4 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 335 */
	 v0 = this.this$0;
	 com.mobfox.video.sdk.MobFoxVideoView .access$4 ( v0 );
	 (( com.mobfox.video.sdk.MobFoxMediaController ) v0 ).hide ( ); // invoke-virtual {v0}, Lcom/mobfox/video/sdk/MobFoxMediaController;->hide()V
	 /* .line 337 */
} // :cond_1
v0 = this.this$0;
com.mobfox.video.sdk.MobFoxVideoView .access$10 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_2
	 /* .line 338 */
	 v0 = this.this$0;
	 com.mobfox.video.sdk.MobFoxVideoView .access$10 ( v0 );
	 v1 = this.this$0;
	 v0 = 	 com.mobfox.video.sdk.MobFoxVideoView .access$3 ( v1 );
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 /* .line 344 */
	 } // :cond_2
} // .end method
