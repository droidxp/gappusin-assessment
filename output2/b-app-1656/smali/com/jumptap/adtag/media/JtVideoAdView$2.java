class com.jumptap.adtag.media.JtVideoAdView$2 implements android.media.MediaPlayer$OnCompletionListener {
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
 com.jumptap.adtag.media.JtVideoAdView$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 160 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onCompletion ( android.media.MediaPlayer p0 ) {
/* .locals 2 */
/* .param p1, "mp" # Landroid/media/MediaPlayer; */
/* .prologue */
/* .line 162 */
v0 = this.this$0;
com.jumptap.adtag.media.JtVideoAdView .access$100 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 163 */
	 v0 = this.this$0;
	 com.jumptap.adtag.media.JtVideoAdView .access$100 ( v0 );
	 (( android.widget.MediaController ) v0 ).hide ( ); // invoke-virtual {v0}, Landroid/widget/MediaController;->hide()V
	 /* .line 165 */
} // :cond_0
v0 = this.this$0;
com.jumptap.adtag.media.JtVideoAdView .access$200 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 166 */
	 v0 = this.this$0;
	 com.jumptap.adtag.media.JtVideoAdView .access$200 ( v0 );
	 v1 = this.this$0;
	 com.jumptap.adtag.media.JtVideoAdView .access$300 ( v1 );
	 /* .line 170 */
} // :cond_1
v0 = this.this$0;
/* const/16 v1, 0x8 */
(( com.jumptap.adtag.media.JtVideoAdView ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Lcom/jumptap/adtag/media/JtVideoAdView;->setVisibility(I)V
/* .line 181 */
return;
} // .end method
