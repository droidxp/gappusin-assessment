class com.emman.vog.AnimalVoiceActivity$3 implements android.view.View$OnClickListener {
	 /* .source "AnimalVoiceActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/emman/vog/AnimalVoiceActivity;->setContent()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.emman.vog.AnimalVoiceActivity this$0; //synthetic
/* # direct methods */
 com.emman.vog.AnimalVoiceActivity$3 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 177 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.view.View p0 ) {
/* .locals 3 */
/* .param p1, "v" # Landroid/view/View; */
/* .prologue */
/* .line 182 */
v1 = this.this$0;
v1 = this.player;
if ( v1 != null) { // if-eqz v1, :cond_1
	 /* .line 183 */
	 v1 = this.this$0;
	 v1 = this.player;
	 v1 = 	 (( android.media.MediaPlayer ) v1 ).isPlaying ( ); // invoke-virtual {v1}, Landroid/media/MediaPlayer;->isPlaying()Z
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* .line 184 */
		 v1 = this.this$0;
		 v1 = this.player;
		 (( android.media.MediaPlayer ) v1 ).pause ( ); // invoke-virtual {v1}, Landroid/media/MediaPlayer;->pause()V
		 /* .line 185 */
		 v1 = this.this$0;
		 v1 = this.speakBtn;
		 /* const v2, 0x7f020062 */
		 (( android.widget.Button ) v1 ).setBackgroundResource ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
		 /* .line 196 */
	 } // :goto_0
	 return;
	 /* .line 187 */
} // :cond_0
v1 = this.this$0;
v1 = this.player;
(( android.media.MediaPlayer ) v1 ).start ( ); // invoke-virtual {v1}, Landroid/media/MediaPlayer;->start()V
/* .line 188 */
v1 = this.this$0;
v1 = this.speakBtn;
/* const v2, 0x7f020063 */
(( android.widget.Button ) v1 ).setBackgroundResource ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
/* .line 189 */
v1 = this.this$0;
v1 = this.speakBtn;
/* .line 190 */
(( android.widget.Button ) v1 ).getBackground ( ); // invoke-virtual {v1}, Landroid/widget/Button;->getBackground()Landroid/graphics/drawable/Drawable;
/* .line 189 */
/* check-cast v0, Landroid/graphics/drawable/AnimationDrawable; */
/* .line 191 */
/* .local v0, "an":Landroid/graphics/drawable/AnimationDrawable; */
(( android.graphics.drawable.AnimationDrawable ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V
/* .line 194 */
} // .end local v0 # "an":Landroid/graphics/drawable/AnimationDrawable;
} // :cond_1
v1 = this.this$0;
v2 = this.this$0;
v2 = this.list;
com.emman.vog.AnimalVoiceActivity .access$3 ( v1,v2 );
} // .end method
