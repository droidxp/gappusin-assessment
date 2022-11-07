class com.emman.vog.AnimalVoiceActivity$1 implements android.view.View$OnClickListener {
	 /* .source "AnimalVoiceActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/emman/vog/AnimalVoiceActivity;->onCreate(Landroid/os/Bundle;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.emman.vog.AnimalVoiceActivity this$0; //synthetic
/* # direct methods */
 com.emman.vog.AnimalVoiceActivity$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 113 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.view.View p0 ) {
/* .locals 3 */
/* .param p1, "v" # Landroid/view/View; */
/* .prologue */
/* .line 115 */
v0 = this.this$0;
/* iget v1, v0, Lcom/emman/vog/AnimalVoiceActivity;->level:I */
/* add-int/lit8 v1, v1, 0x1 */
/* iput v1, v0, Lcom/emman/vog/AnimalVoiceActivity;->level:I */
/* .line 116 */
v0 = this.this$0;
v0 = this.player;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 118 */
	 try { // :try_start_0
		 v0 = this.this$0;
		 v0 = this.player;
		 (( android.media.MediaPlayer ) v0 ).stop ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .line 123 */
	 } // :cond_0
} // :goto_0
v0 = this.this$0;
com.emman.vog.AnimalVoiceActivity .access$0 ( v0 );
/* .line 124 */
v0 = this.this$0;
/* const/high16 v1, 0x10a0000 */
/* .line 125 */
/* const v2, 0x10a0001 */
/* .line 124 */
(( com.emman.vog.AnimalVoiceActivity ) v0 ).overridePendingTransition ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/emman/vog/AnimalVoiceActivity;->overridePendingTransition(II)V
/* .line 126 */
return;
/* .line 119 */
/* :catch_0 */
/* move-exception v0 */
} // .end method
