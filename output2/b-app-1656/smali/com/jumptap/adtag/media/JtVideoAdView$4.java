class com.jumptap.adtag.media.JtVideoAdView$4 implements android.view.SurfaceHolder$Callback {
	 /* .source "JtVideoAdView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/jumptap/adtag/media/JtVideoAdView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.jumptap.adtag.media.JtVideoAdView this$0; //synthetic
/* # direct methods */
 com.jumptap.adtag.media.JtVideoAdView$4 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 279 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void surfaceChanged ( android.view.SurfaceHolder p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 3 */
/* .param p1, "holder" # Landroid/view/SurfaceHolder; */
/* .param p2, "format" # I */
/* .param p3, "w" # I */
/* .param p4, "h" # I */
/* .prologue */
/* .line 283 */
final String v0 = "ZL"; // const-string v0, "ZL"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "####################surfaceChanged getHolder()="; // const-string v2, "####################surfaceChanged getHolder()="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.this$0;
v2 = com.jumptap.adtag.media.JtVideoAdView .access$400 ( v2 );
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v0,v1 );
/* .line 284 */
v0 = this.this$0;
v0 = com.jumptap.adtag.media.JtVideoAdView .access$400 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_1
	 v0 = this.this$0;
	 v0 = 	 com.jumptap.adtag.media.JtVideoAdView .access$600 ( v0 );
	 /* if-ne v0, p3, :cond_1 */
	 v0 = this.this$0;
	 v0 = 	 com.jumptap.adtag.media.JtVideoAdView .access$700 ( v0 );
	 /* if-ne v0, p4, :cond_1 */
	 /* .line 285 */
	 v0 = this.this$0;
	 v0 = 	 com.jumptap.adtag.media.JtVideoAdView .access$800 ( v0 );
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 286 */
		 v0 = this.this$0;
		 com.jumptap.adtag.media.JtVideoAdView .access$300 ( v0 );
		 v1 = this.this$0;
		 v1 = 		 com.jumptap.adtag.media.JtVideoAdView .access$800 ( v1 );
		 (( android.media.MediaPlayer ) v0 ).seekTo ( v1 ); // invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->seekTo(I)V
		 /* .line 289 */
	 } // :cond_0
	 v0 = this.this$0;
	 com.jumptap.adtag.media.JtVideoAdView .access$100 ( v0 );
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 290 */
		 v0 = this.this$0;
		 com.jumptap.adtag.media.JtVideoAdView .access$100 ( v0 );
		 (( android.widget.MediaController ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/widget/MediaController;->show()V
		 /* .line 293 */
	 } // :cond_1
	 return;
} // .end method
public void surfaceCreated ( android.view.SurfaceHolder p0 ) {
	 /* .locals 2 */
	 /* .param p1, "holder" # Landroid/view/SurfaceHolder; */
	 /* .prologue */
	 /* .line 297 */
	 v0 = this.this$0;
	 com.jumptap.adtag.media.JtVideoAdView .access$902 ( v0,p1 );
	 /* .line 298 */
	 final String v0 = "ZL"; // const-string v0, "ZL"
	 final String v1 = "####################surfaceCreated"; // const-string v1, "####################surfaceCreated"
	 android.util.Log .d ( v0,v1 );
	 /* .line 299 */
	 v0 = this.this$0;
	 com.jumptap.adtag.media.JtVideoAdView .access$1000 ( v0 );
	 /* .line 300 */
	 return;
} // .end method
public void surfaceDestroyed ( android.view.SurfaceHolder p0 ) {
	 /* .locals 3 */
	 /* .param p1, "holder" # Landroid/view/SurfaceHolder; */
	 /* .prologue */
	 int v2 = 0; // const/4 v2, 0x0
	 /* .line 304 */
	 final String v0 = "ZL"; // const-string v0, "ZL"
	 final String v1 = "####################surfaceDestroyed"; // const-string v1, "####################surfaceDestroyed"
	 android.util.Log .d ( v0,v1 );
	 /* .line 306 */
	 v0 = this.this$0;
	 com.jumptap.adtag.media.JtVideoAdView .access$902 ( v0,v2 );
	 /* .line 307 */
	 v0 = this.this$0;
	 com.jumptap.adtag.media.JtVideoAdView .access$100 ( v0 );
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 v0 = this.this$0;
		 com.jumptap.adtag.media.JtVideoAdView .access$100 ( v0 );
		 (( android.widget.MediaController ) v0 ).hide ( ); // invoke-virtual {v0}, Landroid/widget/MediaController;->hide()V
		 /* .line 308 */
	 } // :cond_0
	 v0 = this.this$0;
	 com.jumptap.adtag.media.JtVideoAdView .access$300 ( v0 );
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 309 */
		 v0 = this.this$0;
		 com.jumptap.adtag.media.JtVideoAdView .access$300 ( v0 );
		 (( android.media.MediaPlayer ) v0 ).reset ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V
		 /* .line 310 */
		 v0 = this.this$0;
		 com.jumptap.adtag.media.JtVideoAdView .access$300 ( v0 );
		 (( android.media.MediaPlayer ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V
		 /* .line 311 */
		 v0 = this.this$0;
		 com.jumptap.adtag.media.JtVideoAdView .access$302 ( v0,v2 );
		 /* .line 315 */
	 } // :cond_1
	 return;
} // .end method
