class com.jumptap.adtag.activity.JTVideoActivity$3 implements java.lang.Runnable {
	 /* .source "JTVideoActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/jumptap/adtag/activity/JTVideoActivity;->closeActivity()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.jumptap.adtag.activity.JTVideoActivity this$0; //synthetic
/* # direct methods */
 com.jumptap.adtag.activity.JTVideoActivity$3 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 200 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 4 */
/* .prologue */
/* .line 203 */
com.jumptap.adtag.media.JTMediaPlayer .getInstance ( );
/* .line 204 */
/* .local v0, "mediaPlayer":Lcom/jumptap/adtag/media/JTMediaPlayer; */
(( com.jumptap.adtag.media.JTMediaPlayer ) v0 ).release ( ); // invoke-virtual {v0}, Lcom/jumptap/adtag/media/JTMediaPlayer;->release()V
/* .line 213 */
com.jumptap.adtag.JtAdWidgetSettingsFactory .createWidgetSettings ( );
/* .line 214 */
/* .local v1, "widgetSettings":Lcom/jumptap/adtag/JtAdWidgetSettings; */
v2 = this.this$0;
int v3 = 1; // const/4 v3, 0x1
com.jumptap.adtag.activity.JTVideo .prepare ( v1,v2,v3 );
/* .line 216 */
v2 = this.this$0;
(( com.jumptap.adtag.activity.JTVideoActivity ) v2 ).finish ( ); // invoke-virtual {v2}, Lcom/jumptap/adtag/activity/JTVideoActivity;->finish()V
/* .line 217 */
return;
} // .end method
