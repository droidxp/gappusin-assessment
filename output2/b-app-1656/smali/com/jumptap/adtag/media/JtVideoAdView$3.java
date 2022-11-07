class com.jumptap.adtag.media.JtVideoAdView$3 implements android.media.MediaPlayer$OnPreparedListener {
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
 com.jumptap.adtag.media.JtVideoAdView$3 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 185 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onPrepared ( android.media.MediaPlayer p0 ) {
/* .locals 3 */
/* .param p1, "mp" # Landroid/media/MediaPlayer; */
/* .prologue */
int v2 = 1; // const/4 v2, 0x1
/* .line 187 */
final String v0 = "ZL"; // const-string v0, "ZL"
final String v1 = "OnPreparedListenerOnPreparedListener"; // const-string v1, "OnPreparedListenerOnPreparedListener"
android.util.Log .d ( v0,v1 );
/* .line 189 */
v0 = this.this$0;
com.jumptap.adtag.media.JtVideoAdView .access$402 ( v0,v2 );
/* .line 190 */
v0 = this.this$0;
com.jumptap.adtag.media.JtVideoAdView .access$500 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 191 */
	 v0 = this.this$0;
	 com.jumptap.adtag.media.JtVideoAdView .access$500 ( v0 );
	 v1 = this.this$0;
	 com.jumptap.adtag.media.JtVideoAdView .access$300 ( v1 );
	 /* .line 193 */
} // :cond_0
v0 = this.this$0;
com.jumptap.adtag.media.JtVideoAdView .access$100 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 194 */
	 v0 = this.this$0;
	 com.jumptap.adtag.media.JtVideoAdView .access$100 ( v0 );
	 (( android.widget.MediaController ) v0 ).setEnabled ( v2 ); // invoke-virtual {v0, v2}, Landroid/widget/MediaController;->setEnabled(Z)V
	 /* .line 196 */
} // :cond_1
v0 = this.this$0;
v1 = (( android.media.MediaPlayer ) p1 ).getVideoWidth ( ); // invoke-virtual {p1}, Landroid/media/MediaPlayer;->getVideoWidth()I
com.jumptap.adtag.media.JtVideoAdView .access$602 ( v0,v1 );
/* .line 197 */
v0 = this.this$0;
v1 = (( android.media.MediaPlayer ) p1 ).getVideoHeight ( ); // invoke-virtual {p1}, Landroid/media/MediaPlayer;->getVideoHeight()I
com.jumptap.adtag.media.JtVideoAdView .access$702 ( v0,v1 );
/* .line 198 */
v0 = this.this$0;
v0 = com.jumptap.adtag.media.JtVideoAdView .access$600 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_3
	 v0 = this.this$0;
	 v0 = 	 com.jumptap.adtag.media.JtVideoAdView .access$700 ( v0 );
	 if ( v0 != null) { // if-eqz v0, :cond_3
		 /* .line 199 */
		 v0 = this.this$0;
		 (( com.jumptap.adtag.media.JtVideoAdView ) v0 ).getHolder ( ); // invoke-virtual {v0}, Lcom/jumptap/adtag/media/JtVideoAdView;->getHolder()Landroid/view/SurfaceHolder;
		 v1 = this.this$0;
		 v1 = 		 com.jumptap.adtag.media.JtVideoAdView .access$600 ( v1 );
		 v2 = this.this$0;
		 v2 = 		 com.jumptap.adtag.media.JtVideoAdView .access$700 ( v2 );
		 /* .line 203 */
		 v0 = this.this$0;
		 v0 = 		 com.jumptap.adtag.media.JtVideoAdView .access$800 ( v0 );
		 if ( v0 != null) { // if-eqz v0, :cond_2
			 /* .line 204 */
			 v0 = this.this$0;
			 com.jumptap.adtag.media.JtVideoAdView .access$300 ( v0 );
			 v1 = this.this$0;
			 v1 = 			 com.jumptap.adtag.media.JtVideoAdView .access$800 ( v1 );
			 (( android.media.MediaPlayer ) v0 ).seekTo ( v1 ); // invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->seekTo(I)V
			 /* .line 209 */
		 } // :cond_2
		 v0 = this.this$0;
		 com.jumptap.adtag.media.JtVideoAdView .access$100 ( v0 );
		 if ( v0 != null) { // if-eqz v0, :cond_3
			 /* .line 210 */
			 v0 = this.this$0;
			 com.jumptap.adtag.media.JtVideoAdView .access$100 ( v0 );
			 (( android.widget.MediaController ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/widget/MediaController;->show()V
			 /* .line 213 */
		 } // :cond_3
		 return;
	 } // .end method
