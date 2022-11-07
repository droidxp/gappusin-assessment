class com.mobfox.video.sdk.MobFoxVideoView$6 implements android.view.SurfaceHolder$Callback {
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
 com.mobfox.video.sdk.MobFoxVideoView$6 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 354 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void surfaceChanged ( android.view.SurfaceHolder p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 2 */
/* .param p1, "holder" # Landroid/view/SurfaceHolder; */
/* .param p2, "format" # I */
/* .param p3, "w" # I */
/* .param p4, "h" # I */
/* .prologue */
/* .line 357 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
int v1 = 3; // const/4 v1, 0x3
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 358 */
	 final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
	 final String v1 = "MobFoxVideoView surfaceChanged"; // const-string v1, "MobFoxVideoView surfaceChanged"
	 android.util.Log .d ( v0,v1 );
	 /* .line 360 */
} // :cond_0
v0 = this.this$0;
com.mobfox.video.sdk.MobFoxVideoView .access$12 ( v0,p3 );
/* .line 361 */
v0 = this.this$0;
com.mobfox.video.sdk.MobFoxVideoView .access$13 ( v0,p4 );
/* .line 362 */
v0 = this.this$0;
com.mobfox.video.sdk.MobFoxVideoView .access$0 ( v0 );
/* .line 363 */
return;
} // .end method
public void surfaceCreated ( android.view.SurfaceHolder p0 ) {
/* .locals 2 */
/* .param p1, "holder" # Landroid/view/SurfaceHolder; */
/* .prologue */
/* .line 366 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
int v1 = 3; // const/4 v1, 0x3
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 367 */
	 final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
	 final String v1 = "Surface created"; // const-string v1, "Surface created"
	 android.util.Log .d ( v0,v1 );
	 /* .line 369 */
} // :cond_0
v0 = this.this$0;
int v1 = 1; // const/4 v1, 0x1
com.mobfox.video.sdk.MobFoxVideoView .access$14 ( v0,v1 );
/* .line 370 */
v0 = this.this$0;
v0 = com.mobfox.video.sdk.MobFoxVideoView .access$15 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 371 */
	 v0 = this.this$0;
	 com.mobfox.video.sdk.MobFoxVideoView .access$16 ( v0 );
	 /* .line 373 */
} // :cond_1
return;
} // .end method
public void surfaceDestroyed ( android.view.SurfaceHolder p0 ) {
/* .locals 2 */
/* .param p1, "holder" # Landroid/view/SurfaceHolder; */
/* .prologue */
/* .line 376 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
int v1 = 3; // const/4 v1, 0x3
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 377 */
	 final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
	 final String v1 = "Surface destroyed"; // const-string v1, "Surface destroyed"
	 android.util.Log .d ( v0,v1 );
	 /* .line 379 */
} // :cond_0
v0 = this.this$0;
int v1 = 0; // const/4 v1, 0x0
com.mobfox.video.sdk.MobFoxVideoView .access$14 ( v0,v1 );
/* .line 380 */
v0 = this.this$0;
com.mobfox.video.sdk.MobFoxVideoView .access$4 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 381 */
	 v0 = this.this$0;
	 com.mobfox.video.sdk.MobFoxVideoView .access$4 ( v0 );
	 (( com.mobfox.video.sdk.MobFoxMediaController ) v0 ).hide ( ); // invoke-virtual {v0}, Lcom/mobfox/video/sdk/MobFoxMediaController;->hide()V
	 /* .line 383 */
} // :cond_1
v0 = this.this$0;
int v1 = 1; // const/4 v1, 0x1
com.mobfox.video.sdk.MobFoxVideoView .access$17 ( v0,v1 );
/* .line 384 */
return;
} // .end method
