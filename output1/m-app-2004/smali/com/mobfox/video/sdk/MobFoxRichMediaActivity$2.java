class com.mobfox.video.sdk.MobFoxRichMediaActivity$2 implements com.mobfox.video.sdk.MobFoxVideoView$OnTimeEventListener {
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
 com.mobfox.video.sdk.MobFoxRichMediaActivity$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 758 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onTimeEvent ( Integer p0 ) {
/* .locals 3 */
/* .param p1, "time" # I */
/* .prologue */
/* .line 762 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
int v1 = 3; // const/4 v1, 0x3
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 763 */
	 final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
	 /* .line 764 */
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 final String v2 = "MobFoxRichMediaActivity mOverlayShowListener show after:"; // const-string v2, "MobFoxRichMediaActivity mOverlayShowListener show after:"
	 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 /* .line 765 */
	 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 /* .line 764 */
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* .line 763 */
	 android.util.Log .d ( v0,v1 );
	 /* .line 767 */
} // :cond_0
v0 = this.this$0;
com.mobfox.video.sdk.MobFoxRichMediaActivity .access$2 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 768 */
	 v0 = this.this$0;
	 com.mobfox.video.sdk.MobFoxRichMediaActivity .access$2 ( v0 );
	 int v1 = 0; // const/4 v1, 0x0
	 (( com.mobfox.video.sdk.MobFoxWebFrame ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Lcom/mobfox/video/sdk/MobFoxWebFrame;->setVisibility(I)V
	 /* .line 769 */
	 v0 = this.this$0;
	 com.mobfox.video.sdk.MobFoxRichMediaActivity .access$2 ( v0 );
	 (( com.mobfox.video.sdk.MobFoxWebFrame ) v0 ).requestLayout ( ); // invoke-virtual {v0}, Lcom/mobfox/video/sdk/MobFoxWebFrame;->requestLayout()V
	 /* .line 771 */
} // :cond_1
return;
} // .end method
