class com.emman.vog.AnimalVoiceActivity$2 implements android.view.View$OnClickListener {
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
 com.emman.vog.AnimalVoiceActivity$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 145 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.view.View p0 ) {
/* .locals 10 */
/* .param p1, "v" # Landroid/view/View; */
/* .prologue */
/* const v9, 0x7f020054 */
int v8 = 0; // const/4 v8, 0x0
/* const/16 v7, 0xc8 */
/* .line 150 */
(( android.view.View ) p1 ).getTag ( ); // invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;
(( java.lang.Object ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;
v1 = java.lang.Integer .parseInt ( v2 );
/* .line 151 */
/* .local v1, "tag":I */
v2 = this.this$0;
/* iget v2, v2, Lcom/emman/vog/AnimalVoiceActivity;->answer:I */
/* if-ne v1, v2, :cond_1 */
/* .line 152 */
v2 = this.this$0;
/* iget-wide v3, v2, Lcom/emman/vog/AnimalVoiceActivity;->totalscore:J */
v5 = this.this$0;
/* iget v5, v5, Lcom/emman/vog/AnimalVoiceActivity;->level:I */
/* div-int/lit8 v5, v5, 0xa */
/* mul-int/lit8 v5, v5, 0x32 */
/* add-int/lit8 v5, v5, 0x32 */
/* int-to-long v5, v5 */
/* add-long/2addr v3, v5 */
/* iput-wide v3, v2, Lcom/emman/vog/AnimalVoiceActivity;->totalscore:J */
/* .line 153 */
v2 = this.this$0;
v3 = this.this$0;
/* iget-wide v3, v3, Lcom/emman/vog/AnimalVoiceActivity;->totalscore:J */
com.emman.vog.AnimalVoiceActivity .access$1 ( v2,v3,v4 );
/* .line 154 */
v2 = this.this$0;
v2 = this.views;
/* check-cast v2, Landroid/widget/ImageView; */
(( android.widget.ImageView ) v2 ).setBackgroundResource ( v9 ); // invoke-virtual {v2, v9}, Landroid/widget/ImageView;->setBackgroundResource(I)V
/* .line 155 */
v2 = this.this$0;
v2 = this.views;
/* check-cast v2, Landroid/widget/ImageView; */
(( android.widget.ImageView ) v2 ).getBackground ( ); // invoke-virtual {v2}, Landroid/widget/ImageView;->getBackground()Landroid/graphics/drawable/Drawable;
(( android.graphics.drawable.Drawable ) v2 ).setAlpha ( v7 ); // invoke-virtual {v2, v7}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V
/* .line 164 */
} // :goto_0
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
} // :goto_1
v2 = this.this$0;
/* iget v2, v2, Lcom/emman/vog/AnimalVoiceActivity;->NUM:I */
/* if-lt v0, v2, :cond_2 */
/* .line 167 */
v2 = this.this$0;
v2 = this.player;
if ( v2 != null) { // if-eqz v2, :cond_0
v2 = this.this$0;
v2 = this.player;
v2 = (( android.media.MediaPlayer ) v2 ).isPlaying ( ); // invoke-virtual {v2}, Landroid/media/MediaPlayer;->isPlaying()Z
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 168 */
v2 = this.this$0;
v2 = this.player;
(( android.media.MediaPlayer ) v2 ).pause ( ); // invoke-virtual {v2}, Landroid/media/MediaPlayer;->pause()V
/* .line 170 */
} // :cond_0
v2 = this.this$0;
v2 = this.speakBtn;
/* const v3, 0x7f020062 */
(( android.widget.Button ) v2 ).setBackgroundResource ( v3 ); // invoke-virtual {v2, v3}, Landroid/widget/Button;->setBackgroundResource(I)V
/* .line 171 */
v2 = this.this$0;
v2 = this.nextBtn;
(( android.widget.Button ) v2 ).setVisibility ( v8 ); // invoke-virtual {v2, v8}, Landroid/widget/Button;->setVisibility(I)V
/* .line 172 */
return;
/* .line 157 */
} // .end local v0 # "i":I
} // :cond_1
v2 = this.this$0;
com.emman.vog.AnimalVoiceActivity .access$2 ( v2 );
/* .line 158 */
v2 = this.this$0;
v2 = this.views;
/* check-cast v2, Landroid/widget/ImageView; */
/* const v3, 0x7f020075 */
(( android.widget.ImageView ) v2 ).setBackgroundResource ( v3 ); // invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setBackgroundResource(I)V
/* .line 159 */
v2 = this.this$0;
v2 = this.views;
/* check-cast v2, Landroid/widget/ImageView; */
(( android.widget.ImageView ) v2 ).getBackground ( ); // invoke-virtual {v2}, Landroid/widget/ImageView;->getBackground()Landroid/graphics/drawable/Drawable;
(( android.graphics.drawable.Drawable ) v2 ).setAlpha ( v7 ); // invoke-virtual {v2, v7}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V
/* .line 160 */
v2 = this.this$0;
v2 = this.views;
v3 = this.this$0;
/* iget v3, v3, Lcom/emman/vog/AnimalVoiceActivity;->answer:I */
/* check-cast v2, Landroid/widget/ImageView; */
(( android.widget.ImageView ) v2 ).setBackgroundResource ( v9 ); // invoke-virtual {v2, v9}, Landroid/widget/ImageView;->setBackgroundResource(I)V
/* .line 162 */
v2 = this.this$0;
v2 = this.views;
v3 = this.this$0;
/* iget v3, v3, Lcom/emman/vog/AnimalVoiceActivity;->answer:I */
/* check-cast v2, Landroid/widget/ImageView; */
(( android.widget.ImageView ) v2 ).getBackground ( ); // invoke-virtual {v2}, Landroid/widget/ImageView;->getBackground()Landroid/graphics/drawable/Drawable;
(( android.graphics.drawable.Drawable ) v2 ).setAlpha ( v7 ); // invoke-virtual {v2, v7}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V
/* .line 165 */
/* .restart local v0 # "i":I */
} // :cond_2
v2 = this.this$0;
v2 = this.images;
/* check-cast v2, Landroid/widget/ImageButton; */
(( android.widget.ImageButton ) v2 ).setClickable ( v8 ); // invoke-virtual {v2, v8}, Landroid/widget/ImageButton;->setClickable(Z)V
/* .line 164 */
/* add-int/lit8 v0, v0, 0x1 */
/* goto/16 :goto_1 */
} // .end method
