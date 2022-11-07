class com.emman.vog.AnimalVoiceActivity$5 implements android.content.DialogInterface$OnClickListener {
	 /* .source "AnimalVoiceActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/emman/vog/AnimalVoiceActivity;->gameover()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.emman.vog.AnimalVoiceActivity this$0; //synthetic
/* # direct methods */
 com.emman.vog.AnimalVoiceActivity$5 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 256 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.content.DialogInterface p0, Integer p1 ) {
/* .locals 3 */
/* .param p1, "dialog" # Landroid/content/DialogInterface; */
/* .param p2, "which" # I */
/* .prologue */
/* .line 260 */
/* .line 261 */
v0 = this.this$0;
int v1 = 1; // const/4 v1, 0x1
/* iput v1, v0, Lcom/emman/vog/AnimalVoiceActivity;->level:I */
/* .line 262 */
v0 = this.this$0;
int v1 = 5; // const/4 v1, 0x5
/* iput v1, v0, Lcom/emman/vog/AnimalVoiceActivity;->life:I */
/* .line 263 */
v0 = this.this$0;
/* const-wide/16 v1, 0x0 */
/* iput-wide v1, v0, Lcom/emman/vog/AnimalVoiceActivity;->totalscore:J */
/* .line 264 */
v0 = this.this$0;
v0 = this.score;
final String v1 = "0"; // const-string v1, "0"
(( android.widget.TextView ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 265 */
v0 = this.this$0;
com.emman.vog.AnimalVoiceActivity .access$0 ( v0 );
/* .line 266 */
v0 = this.this$0;
/* const/high16 v1, 0x10a0000 */
/* .line 267 */
/* const v2, 0x10a0001 */
/* .line 266 */
(( com.emman.vog.AnimalVoiceActivity ) v0 ).overridePendingTransition ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/emman/vog/AnimalVoiceActivity;->overridePendingTransition(II)V
/* .line 268 */
return;
} // .end method
