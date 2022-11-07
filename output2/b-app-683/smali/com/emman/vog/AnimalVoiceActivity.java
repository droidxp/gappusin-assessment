public class com.emman.vog.AnimalVoiceActivity extends android.app.Activity {
	 /* .source "AnimalVoiceActivity.java" */
	 /* # instance fields */
	 Integer NUM;
	 final java.lang.String RECORD;
	 final java.lang.String TAG;
	 Integer answer;
	 android.content.SharedPreferences$Editor editor;
	 com.emman.vog.GameAd gameAd;
	 java.util.List hearts;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List", */
	 /* "<", */
	 /* "Landroid/widget/ImageView;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
java.util.List images;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List", */
/* "<", */
/* "Landroid/widget/ImageButton;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
Integer level;
Integer life;
java.util.List list;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List", */
/* "<", */
/* "Lcom/emman/vog/util/VoiceUtil$VoiceImage;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
java.util.List names;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List", */
/* "<", */
/* "Landroid/widget/TextView;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
android.widget.Button nextBtn;
android.media.MediaPlayer player;
android.content.SharedPreferences preferences;
android.widget.TextView record;
android.content.res.Resources res;
android.widget.TextView score;
android.widget.Button speakBtn;
Long totalscore;
java.util.List views;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List", */
/* "<", */
/* "Landroid/widget/ImageView;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public com.emman.vog.AnimalVoiceActivity ( ) {
/* .locals 2 */
/* .prologue */
/* .line 28 */
/* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
/* .line 29 */
final String v0 = "AnimalVoiceActivity"; // const-string v0, "AnimalVoiceActivity"
this.TAG = v0;
final String v0 = "AnimalVoiceRecord"; // const-string v0, "AnimalVoiceRecord"
this.RECORD = v0;
/* .line 30 */
int v0 = 4; // const/4 v0, 0x4
/* iput v0, p0, Lcom/emman/vog/AnimalVoiceActivity;->NUM:I */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/emman/vog/AnimalVoiceActivity;->answer:I */
int v0 = 5; // const/4 v0, 0x5
/* iput v0, p0, Lcom/emman/vog/AnimalVoiceActivity;->life:I */
int v0 = 1; // const/4 v0, 0x1
/* iput v0, p0, Lcom/emman/vog/AnimalVoiceActivity;->level:I */
/* .line 31 */
/* const-wide/16 v0, 0x0 */
/* iput-wide v0, p0, Lcom/emman/vog/AnimalVoiceActivity;->totalscore:J */
/* .line 43 */
/* new-instance v0, Lcom/emman/vog/GameAd; */
/* invoke-direct {v0}, Lcom/emman/vog/GameAd;-><init>()V */
this.gameAd = v0;
/* .line 28 */
return;
} // .end method
static void access$0 ( com.emman.vog.AnimalVoiceActivity p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 133 */
/* invoke-direct {p0}, Lcom/emman/vog/AnimalVoiceActivity;->setContent()V */
return;
} // .end method
static void access$1 ( com.emman.vog.AnimalVoiceActivity p0, Long p1 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 232 */
/* invoke-direct {p0, p1, p2}, Lcom/emman/vog/AnimalVoiceActivity;->setScore(J)V */
return;
} // .end method
static void access$2 ( com.emman.vog.AnimalVoiceActivity p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 224 */
/* invoke-direct {p0}, Lcom/emman/vog/AnimalVoiceActivity;->loselife()V */
return;
} // .end method
static void access$3 ( com.emman.vog.AnimalVoiceActivity p0, java.util.List p1 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 200 */
/* invoke-direct {p0, p1}, Lcom/emman/vog/AnimalVoiceActivity;->initPlayer(Ljava/util/List;)V */
return;
} // .end method
private void gameover ( ) {
/* .locals 4 */
/* .prologue */
/* .line 243 */
v1 = this.player;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 245 */
try { // :try_start_0
v1 = this.player;
(( android.media.MediaPlayer ) v1 ).stop ( ); // invoke-virtual {v1}, Landroid/media/MediaPlayer;->stop()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 250 */
} // :cond_0
} // :goto_0
/* new-instance v0, Landroid/app/AlertDialog$Builder; */
/* invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
/* .line 251 */
/* .local v0, "builder":Landroid/app/AlertDialog$Builder; */
/* new-instance v1, Ljava/lang/StringBuilder; */
v2 = this.res;
/* const v3, 0x7f050032 */
(( android.content.res.Resources ) v2 ).getString ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
java.lang.String .valueOf ( v2 );
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* iget-wide v2, p0, Lcom/emman/vog/AnimalVoiceActivity;->totalscore:J */
(( java.lang.StringBuilder ) v1 ).append ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( android.app.AlertDialog$Builder ) v0 ).setMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
/* .line 253 */
v1 = this.res;
/* const v2, 0x7f050033 */
(( android.content.res.Resources ) v1 ).getString ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
(( android.app.AlertDialog$Builder ) v0 ).setTitle ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
/* .line 255 */
v1 = this.res;
/* const v2, 0x7f050034 */
(( android.content.res.Resources ) v1 ).getString ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
/* .line 256 */
/* new-instance v2, Lcom/emman/vog/AnimalVoiceActivity$5; */
/* invoke-direct {v2, p0}, Lcom/emman/vog/AnimalVoiceActivity$5;-><init>(Lcom/emman/vog/AnimalVoiceActivity;)V */
/* .line 255 */
(( android.app.AlertDialog$Builder ) v0 ).setPositiveButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* .line 270 */
v1 = this.res;
/* const v2, 0x7f050035 */
(( android.content.res.Resources ) v1 ).getString ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
/* .line 271 */
/* new-instance v2, Lcom/emman/vog/AnimalVoiceActivity$6; */
/* invoke-direct {v2, p0}, Lcom/emman/vog/AnimalVoiceActivity$6;-><init>(Lcom/emman/vog/AnimalVoiceActivity;)V */
/* .line 270 */
(( android.app.AlertDialog$Builder ) v0 ).setNegativeButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* .line 279 */
int v1 = 0; // const/4 v1, 0x0
(( android.app.AlertDialog$Builder ) v0 ).setCancelable ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;
/* .line 280 */
(( android.app.AlertDialog$Builder ) v0 ).create ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
(( android.app.AlertDialog ) v1 ).show ( ); // invoke-virtual {v1}, Landroid/app/AlertDialog;->show()V
/* .line 281 */
return;
/* .line 246 */
} // .end local v0 # "builder":Landroid/app/AlertDialog$Builder;
/* :catch_0 */
/* move-exception v1 */
} // .end method
private void initPlayer ( java.util.List p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List", */
/* "<", */
/* "Lcom/emman/vog/util/VoiceUtil$VoiceImage;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 201 */
/* .local p1, "list":Ljava/util/List;, "Ljava/util/List<Lcom/emman/vog/util/VoiceUtil$VoiceImage;>;" */
/* iget v0, p0, Lcom/emman/vog/AnimalVoiceActivity;->answer:I */
/* check-cast v0, Lcom/emman/vog/util/VoiceUtil$VoiceImage; */
v0 = (( com.emman.vog.util.VoiceUtil$VoiceImage ) v0 ).getVoiceId ( ); // invoke-virtual {v0}, Lcom/emman/vog/util/VoiceUtil$VoiceImage;->getVoiceId()I
android.media.MediaPlayer .create ( p0,v0 );
this.player = v0;
/* .line 202 */
v0 = this.player;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 203 */
v0 = this.player;
/* new-instance v1, Lcom/emman/vog/AnimalVoiceActivity$4; */
/* invoke-direct {v1, p0}, Lcom/emman/vog/AnimalVoiceActivity$4;-><init>(Lcom/emman/vog/AnimalVoiceActivity;)V */
(( android.media.MediaPlayer ) v0 ).setOnCompletionListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V
/* .line 211 */
} // :cond_0
return;
} // .end method
private void loselife ( ) {
/* .locals 1 */
/* .prologue */
/* .line 225 */
/* iget v0, p0, Lcom/emman/vog/AnimalVoiceActivity;->life:I */
/* add-int/lit8 v0, v0, -0x1 */
/* iput v0, p0, Lcom/emman/vog/AnimalVoiceActivity;->life:I */
/* .line 226 */
/* iget v0, p0, Lcom/emman/vog/AnimalVoiceActivity;->life:I */
/* invoke-direct {p0, v0}, Lcom/emman/vog/AnimalVoiceActivity;->setLife(I)V */
/* .line 227 */
/* iget v0, p0, Lcom/emman/vog/AnimalVoiceActivity;->life:I */
/* if-gtz v0, :cond_0 */
/* .line 228 */
/* invoke-direct {p0}, Lcom/emman/vog/AnimalVoiceActivity;->gameover()V */
/* .line 230 */
} // :cond_0
return;
} // .end method
private void setContent ( ) {
/* .locals 5 */
/* .prologue */
/* .line 134 */
/* iget v1, p0, Lcom/emman/vog/AnimalVoiceActivity;->life:I */
/* invoke-direct {p0, v1}, Lcom/emman/vog/AnimalVoiceActivity;->setLife(I)V */
/* .line 135 */
v1 = this.speakBtn;
/* const v2, 0x7f020062 */
(( android.widget.Button ) v1 ).setBackgroundResource ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V
/* .line 136 */
v1 = this.nextBtn;
/* const/16 v2, 0x8 */
(( android.widget.Button ) v1 ).setVisibility ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/Button;->setVisibility(I)V
/* .line 137 */
/* iget v1, p0, Lcom/emman/vog/AnimalVoiceActivity;->NUM:I */
/* int-to-double v1, v1 */
java.lang.Math .random ( );
/* move-result-wide v3 */
/* mul-double/2addr v1, v3 */
/* double-to-int v1, v1 */
/* iput v1, p0, Lcom/emman/vog/AnimalVoiceActivity;->answer:I */
/* .line 138 */
/* iget v1, p0, Lcom/emman/vog/AnimalVoiceActivity;->NUM:I */
com.emman.vog.util.VoiceUtil .getRandomVoiceImage ( v1 );
this.list = v1;
/* .line 139 */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
} // :goto_0
/* iget v1, p0, Lcom/emman/vog/AnimalVoiceActivity;->NUM:I */
/* if-lt v0, v1, :cond_0 */
/* .line 176 */
v1 = this.list;
/* invoke-direct {p0, v1}, Lcom/emman/vog/AnimalVoiceActivity;->initPlayer(Ljava/util/List;)V */
/* .line 177 */
v1 = this.speakBtn;
/* new-instance v2, Lcom/emman/vog/AnimalVoiceActivity$3; */
/* invoke-direct {v2, p0}, Lcom/emman/vog/AnimalVoiceActivity$3;-><init>(Lcom/emman/vog/AnimalVoiceActivity;)V */
(( android.widget.Button ) v1 ).setOnClickListener ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 198 */
return;
/* .line 140 */
} // :cond_0
v1 = this.names;
/* check-cast v1, Landroid/widget/TextView; */
v2 = this.list;
/* check-cast v2, Lcom/emman/vog/util/VoiceUtil$VoiceImage; */
v2 = (( com.emman.vog.util.VoiceUtil$VoiceImage ) v2 ).getNameId ( ); // invoke-virtual {v2}, Lcom/emman/vog/util/VoiceUtil$VoiceImage;->getNameId()I
(( android.widget.TextView ) v1 ).setText ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V
/* .line 141 */
v1 = this.views;
/* check-cast v1, Landroid/widget/ImageView; */
/* const v2, 0x7f02001d */
(( android.widget.ImageView ) v1 ).setBackgroundResource ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setBackgroundResource(I)V
/* .line 142 */
v1 = this.images;
/* check-cast v1, Landroid/widget/ImageButton; */
int v2 = 1; // const/4 v2, 0x1
(( android.widget.ImageButton ) v1 ).setClickable ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/ImageButton;->setClickable(Z)V
/* .line 143 */
v1 = this.images;
/* check-cast v1, Landroid/widget/ImageButton; */
java.lang.Integer .valueOf ( v0 );
(( android.widget.ImageButton ) v1 ).setTag ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/ImageButton;->setTag(Ljava/lang/Object;)V
/* .line 144 */
v1 = this.images;
/* check-cast v1, Landroid/widget/ImageButton; */
v2 = this.list;
/* check-cast v2, Lcom/emman/vog/util/VoiceUtil$VoiceImage; */
v2 = (( com.emman.vog.util.VoiceUtil$VoiceImage ) v2 ).getImageId ( ); // invoke-virtual {v2}, Lcom/emman/vog/util/VoiceUtil$VoiceImage;->getImageId()I
(( android.widget.ImageButton ) v1 ).setBackgroundResource ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/ImageButton;->setBackgroundResource(I)V
/* .line 145 */
v1 = this.images;
/* check-cast v1, Landroid/widget/ImageButton; */
/* new-instance v2, Lcom/emman/vog/AnimalVoiceActivity$2; */
/* invoke-direct {v2, p0}, Lcom/emman/vog/AnimalVoiceActivity$2;-><init>(Lcom/emman/vog/AnimalVoiceActivity;)V */
(( android.widget.ImageButton ) v1 ).setOnClickListener ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 139 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
private void setLife ( Integer p0 ) {
/* .locals 3 */
/* .param p1, "life" # I */
/* .prologue */
/* .line 214 */
/* iput p1, p0, Lcom/emman/vog/AnimalVoiceActivity;->life:I */
/* .line 215 */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
} // :goto_0
v1 = v1 = this.hearts;
/* if-lt v0, v1, :cond_0 */
/* .line 222 */
return;
/* .line 216 */
} // :cond_0
/* if-ge v0, p1, :cond_1 */
/* .line 217 */
v1 = this.hearts;
/* check-cast v1, Landroid/widget/ImageView; */
/* const v2, 0x7f02002e */
(( android.widget.ImageView ) v1 ).setBackgroundResource ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setBackgroundResource(I)V
/* .line 215 */
} // :goto_1
/* add-int/lit8 v0, v0, 0x1 */
/* .line 219 */
} // :cond_1
v1 = this.hearts;
/* check-cast v1, Landroid/widget/ImageView; */
/* const v2, 0x7f02002d */
(( android.widget.ImageView ) v1 ).setBackgroundResource ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setBackgroundResource(I)V
} // .end method
private void setScore ( Long p0 ) {
/* .locals 6 */
/* .param p1, "s" # J */
/* .prologue */
/* .line 233 */
v2 = this.score;
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v3 ).append ( p1, p2 ); // invoke-virtual {v3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( android.widget.TextView ) v2 ).setText ( v3 ); // invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 234 */
v2 = this.preferences;
final String v3 = "AnimalVoiceRecord"; // const-string v3, "AnimalVoiceRecord"
/* const-wide/16 v4, 0x0 */
/* move-result-wide v0 */
/* .line 235 */
/* .local v0, "r":J */
/* cmp-long v2, p1, v0 */
/* if-lez v2, :cond_0 */
/* .line 236 */
v2 = this.record;
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v3 ).append ( p1, p2 ); // invoke-virtual {v3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( android.widget.TextView ) v2 ).setText ( v3 ); // invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 237 */
v2 = this.editor;
final String v3 = "AnimalVoiceRecord"; // const-string v3, "AnimalVoiceRecord"
/* .line 238 */
v2 = this.editor;
/* .line 240 */
} // :cond_0
return;
} // .end method
/* # virtual methods */
public void onCreate ( android.os.Bundle p0 ) {
/* .locals 27 */
/* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
/* .prologue */
/* .line 48 */
/* invoke-super/range {p0 ..p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
/* .line 49 */
/* const/high16 v21, 0x7f030000 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v21 */
(( com.emman.vog.AnimalVoiceActivity ) v0 ).setContentView ( v1 ); // invoke-virtual {v0, v1}, Lcom/emman/vog/AnimalVoiceActivity;->setContentView(I)V
/* .line 51 */
final String v21 = "AnimalVoiceActivity"; // const-string v21, "AnimalVoiceActivity"
/* const/16 v22, 0x0 */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v21 */
/* move/from16 v2, v22 */
(( com.emman.vog.AnimalVoiceActivity ) v0 ).getSharedPreferences ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/emman/vog/AnimalVoiceActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
/* move-object/from16 v0, v21 */
/* move-object/from16 v1, p0 */
this.preferences = v0;
/* .line 52 */
/* move-object/from16 v0, p0 */
v0 = this.preferences;
/* move-object/from16 v21, v0 */
/* invoke-interface/range {v21 ..v21}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor; */
/* move-object/from16 v0, v21 */
/* move-object/from16 v1, p0 */
this.editor = v0;
/* .line 53 */
/* invoke-virtual/range {p0 ..p0}, Lcom/emman/vog/AnimalVoiceActivity;->getResources()Landroid/content/res/Resources; */
/* move-object/from16 v0, v21 */
/* move-object/from16 v1, p0 */
this.res = v0;
/* .line 55 */
/* const v21, 0x7f060007 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v21 */
(( com.emman.vog.AnimalVoiceActivity ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Lcom/emman/vog/AnimalVoiceActivity;->findViewById(I)Landroid/view/View;
/* check-cast v21, Landroid/widget/Button; */
/* move-object/from16 v0, v21 */
/* move-object/from16 v1, p0 */
this.speakBtn = v0;
/* .line 56 */
/* const v21, 0x7f060008 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v21 */
(( com.emman.vog.AnimalVoiceActivity ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Lcom/emman/vog/AnimalVoiceActivity;->findViewById(I)Landroid/view/View;
/* check-cast v21, Landroid/widget/Button; */
/* move-object/from16 v0, v21 */
/* move-object/from16 v1, p0 */
this.nextBtn = v0;
/* .line 57 */
/* new-instance v21, Ljava/util/ArrayList; */
/* invoke-direct/range {v21 ..v21}, Ljava/util/ArrayList;-><init>()V */
/* move-object/from16 v0, v21 */
/* move-object/from16 v1, p0 */
this.images = v0;
/* .line 58 */
/* const v21, 0x7f060009 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v21 */
(( com.emman.vog.AnimalVoiceActivity ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Lcom/emman/vog/AnimalVoiceActivity;->findViewById(I)Landroid/view/View;
/* check-cast v8, Landroid/widget/ImageButton; */
/* .line 59 */
/* .local v8, "image1":Landroid/widget/ImageButton; */
/* const v21, 0x7f06000b */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v21 */
(( com.emman.vog.AnimalVoiceActivity ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Lcom/emman/vog/AnimalVoiceActivity;->findViewById(I)Landroid/view/View;
/* check-cast v9, Landroid/widget/ImageButton; */
/* .line 60 */
/* .local v9, "image2":Landroid/widget/ImageButton; */
/* const v21, 0x7f06000d */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v21 */
(( com.emman.vog.AnimalVoiceActivity ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Lcom/emman/vog/AnimalVoiceActivity;->findViewById(I)Landroid/view/View;
/* check-cast v10, Landroid/widget/ImageButton; */
/* .line 61 */
/* .local v10, "image3":Landroid/widget/ImageButton; */
/* const v21, 0x7f06000f */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v21 */
(( com.emman.vog.AnimalVoiceActivity ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Lcom/emman/vog/AnimalVoiceActivity;->findViewById(I)Landroid/view/View;
/* check-cast v11, Landroid/widget/ImageButton; */
/* .line 62 */
/* .local v11, "image4":Landroid/widget/ImageButton; */
/* move-object/from16 v0, p0 */
v0 = this.images;
/* move-object/from16 v21, v0 */
/* move-object/from16 v0, v21 */
/* .line 63 */
/* move-object/from16 v0, p0 */
v0 = this.images;
/* move-object/from16 v21, v0 */
/* move-object/from16 v0, v21 */
/* .line 64 */
/* move-object/from16 v0, p0 */
v0 = this.images;
/* move-object/from16 v21, v0 */
/* move-object/from16 v0, v21 */
/* .line 65 */
/* move-object/from16 v0, p0 */
v0 = this.images;
/* move-object/from16 v21, v0 */
/* move-object/from16 v0, v21 */
/* .line 67 */
/* new-instance v21, Ljava/util/ArrayList; */
/* invoke-direct/range {v21 ..v21}, Ljava/util/ArrayList;-><init>()V */
/* move-object/from16 v0, v21 */
/* move-object/from16 v1, p0 */
this.views = v0;
/* .line 68 */
/* const v21, 0x7f06000a */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v21 */
(( com.emman.vog.AnimalVoiceActivity ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Lcom/emman/vog/AnimalVoiceActivity;->findViewById(I)Landroid/view/View;
/* check-cast v17, Landroid/widget/ImageView; */
/* .line 69 */
/* .local v17, "view1":Landroid/widget/ImageView; */
/* const v21, 0x7f06000c */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v21 */
(( com.emman.vog.AnimalVoiceActivity ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Lcom/emman/vog/AnimalVoiceActivity;->findViewById(I)Landroid/view/View;
/* check-cast v18, Landroid/widget/ImageView; */
/* .line 70 */
/* .local v18, "view2":Landroid/widget/ImageView; */
/* const v21, 0x7f06000e */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v21 */
(( com.emman.vog.AnimalVoiceActivity ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Lcom/emman/vog/AnimalVoiceActivity;->findViewById(I)Landroid/view/View;
/* check-cast v19, Landroid/widget/ImageView; */
/* .line 71 */
/* .local v19, "view3":Landroid/widget/ImageView; */
/* const v21, 0x7f060010 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v21 */
(( com.emman.vog.AnimalVoiceActivity ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Lcom/emman/vog/AnimalVoiceActivity;->findViewById(I)Landroid/view/View;
/* check-cast v20, Landroid/widget/ImageView; */
/* .line 72 */
/* .local v20, "view4":Landroid/widget/ImageView; */
/* move-object/from16 v0, p0 */
v0 = this.views;
/* move-object/from16 v21, v0 */
/* move-object/from16 v0, v21 */
/* move-object/from16 v1, v17 */
/* .line 73 */
/* move-object/from16 v0, p0 */
v0 = this.views;
/* move-object/from16 v21, v0 */
/* move-object/from16 v0, v21 */
/* move-object/from16 v1, v18 */
/* .line 74 */
/* move-object/from16 v0, p0 */
v0 = this.views;
/* move-object/from16 v21, v0 */
/* move-object/from16 v0, v21 */
/* move-object/from16 v1, v19 */
/* .line 75 */
/* move-object/from16 v0, p0 */
v0 = this.views;
/* move-object/from16 v21, v0 */
/* move-object/from16 v0, v21 */
/* move-object/from16 v1, v20 */
/* .line 77 */
/* new-instance v21, Ljava/util/ArrayList; */
/* invoke-direct/range {v21 ..v21}, Ljava/util/ArrayList;-><init>()V */
/* move-object/from16 v0, v21 */
/* move-object/from16 v1, p0 */
this.names = v0;
/* .line 78 */
/* const v21, 0x7f060011 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v21 */
(( com.emman.vog.AnimalVoiceActivity ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Lcom/emman/vog/AnimalVoiceActivity;->findViewById(I)Landroid/view/View;
/* check-cast v12, Landroid/widget/TextView; */
/* .line 79 */
/* .local v12, "name1":Landroid/widget/TextView; */
/* const v21, 0x7f060012 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v21 */
(( com.emman.vog.AnimalVoiceActivity ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Lcom/emman/vog/AnimalVoiceActivity;->findViewById(I)Landroid/view/View;
/* check-cast v13, Landroid/widget/TextView; */
/* .line 80 */
/* .local v13, "name2":Landroid/widget/TextView; */
/* const v21, 0x7f060013 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v21 */
(( com.emman.vog.AnimalVoiceActivity ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Lcom/emman/vog/AnimalVoiceActivity;->findViewById(I)Landroid/view/View;
/* check-cast v14, Landroid/widget/TextView; */
/* .line 81 */
/* .local v14, "name3":Landroid/widget/TextView; */
/* const v21, 0x7f060014 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v21 */
(( com.emman.vog.AnimalVoiceActivity ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Lcom/emman/vog/AnimalVoiceActivity;->findViewById(I)Landroid/view/View;
/* check-cast v15, Landroid/widget/TextView; */
/* .line 82 */
/* .local v15, "name4":Landroid/widget/TextView; */
/* move-object/from16 v0, p0 */
v0 = this.names;
/* move-object/from16 v21, v0 */
/* move-object/from16 v0, v21 */
/* .line 83 */
/* move-object/from16 v0, p0 */
v0 = this.names;
/* move-object/from16 v21, v0 */
/* move-object/from16 v0, v21 */
/* .line 84 */
/* move-object/from16 v0, p0 */
v0 = this.names;
/* move-object/from16 v21, v0 */
/* move-object/from16 v0, v21 */
/* .line 85 */
/* move-object/from16 v0, p0 */
v0 = this.names;
/* move-object/from16 v21, v0 */
/* move-object/from16 v0, v21 */
/* .line 87 */
/* invoke-virtual/range {p0 ..p0}, Lcom/emman/vog/AnimalVoiceActivity;->getAssets()Landroid/content/res/AssetManager; */
/* .line 88 */
final String v22 = "androgyne.otf"; // const-string v22, "androgyne.otf"
/* .line 87 */
/* invoke-static/range {v21 ..v22}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface; */
/* .line 89 */
/* .local v16, "typeface":Landroid/graphics/Typeface; */
/* move-object/from16 v0, v16 */
(( android.widget.TextView ) v12 ).setTypeface ( v0 ); // invoke-virtual {v12, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V
/* .line 90 */
/* move-object/from16 v0, v16 */
(( android.widget.TextView ) v13 ).setTypeface ( v0 ); // invoke-virtual {v13, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V
/* .line 91 */
/* move-object/from16 v0, v16 */
(( android.widget.TextView ) v14 ).setTypeface ( v0 ); // invoke-virtual {v14, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V
/* .line 92 */
/* invoke-virtual/range {v15 ..v16}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V */
/* .line 94 */
/* new-instance v21, Ljava/util/ArrayList; */
/* invoke-direct/range {v21 ..v21}, Ljava/util/ArrayList;-><init>()V */
/* move-object/from16 v0, v21 */
/* move-object/from16 v1, p0 */
this.hearts = v0;
/* .line 95 */
/* const v21, 0x7f060002 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v21 */
(( com.emman.vog.AnimalVoiceActivity ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Lcom/emman/vog/AnimalVoiceActivity;->findViewById(I)Landroid/view/View;
/* check-cast v3, Landroid/widget/ImageView; */
/* .line 96 */
/* .local v3, "heart1":Landroid/widget/ImageView; */
/* const v21, 0x7f060003 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v21 */
(( com.emman.vog.AnimalVoiceActivity ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Lcom/emman/vog/AnimalVoiceActivity;->findViewById(I)Landroid/view/View;
/* check-cast v4, Landroid/widget/ImageView; */
/* .line 97 */
/* .local v4, "heart2":Landroid/widget/ImageView; */
/* const v21, 0x7f060004 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v21 */
(( com.emman.vog.AnimalVoiceActivity ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Lcom/emman/vog/AnimalVoiceActivity;->findViewById(I)Landroid/view/View;
/* check-cast v5, Landroid/widget/ImageView; */
/* .line 98 */
/* .local v5, "heart3":Landroid/widget/ImageView; */
/* const v21, 0x7f060005 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v21 */
(( com.emman.vog.AnimalVoiceActivity ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Lcom/emman/vog/AnimalVoiceActivity;->findViewById(I)Landroid/view/View;
/* check-cast v6, Landroid/widget/ImageView; */
/* .line 99 */
/* .local v6, "heart4":Landroid/widget/ImageView; */
/* const v21, 0x7f060006 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v21 */
(( com.emman.vog.AnimalVoiceActivity ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Lcom/emman/vog/AnimalVoiceActivity;->findViewById(I)Landroid/view/View;
/* check-cast v7, Landroid/widget/ImageView; */
/* .line 100 */
/* .local v7, "heart5":Landroid/widget/ImageView; */
/* move-object/from16 v0, p0 */
v0 = this.hearts;
/* move-object/from16 v21, v0 */
/* move-object/from16 v0, v21 */
/* .line 101 */
/* move-object/from16 v0, p0 */
v0 = this.hearts;
/* move-object/from16 v21, v0 */
/* move-object/from16 v0, v21 */
/* .line 102 */
/* move-object/from16 v0, p0 */
v0 = this.hearts;
/* move-object/from16 v21, v0 */
/* move-object/from16 v0, v21 */
/* .line 103 */
/* move-object/from16 v0, p0 */
v0 = this.hearts;
/* move-object/from16 v21, v0 */
/* move-object/from16 v0, v21 */
/* .line 104 */
/* move-object/from16 v0, p0 */
v0 = this.hearts;
/* move-object/from16 v21, v0 */
/* move-object/from16 v0, v21 */
/* .line 106 */
/* const/high16 v21, 0x7f060000 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v21 */
(( com.emman.vog.AnimalVoiceActivity ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Lcom/emman/vog/AnimalVoiceActivity;->findViewById(I)Landroid/view/View;
/* check-cast v21, Landroid/widget/TextView; */
/* move-object/from16 v0, v21 */
/* move-object/from16 v1, p0 */
this.score = v0;
/* .line 107 */
/* const v21, 0x7f060001 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v21 */
(( com.emman.vog.AnimalVoiceActivity ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Lcom/emman/vog/AnimalVoiceActivity;->findViewById(I)Landroid/view/View;
/* check-cast v21, Landroid/widget/TextView; */
/* move-object/from16 v0, v21 */
/* move-object/from16 v1, p0 */
this.record = v0;
/* .line 108 */
/* move-object/from16 v0, p0 */
v0 = this.score;
/* move-object/from16 v21, v0 */
/* new-instance v22, Ljava/lang/StringBuilder; */
/* invoke-direct/range {v22 ..v22}, Ljava/lang/StringBuilder;-><init>()V */
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/emman/vog/AnimalVoiceActivity;->totalscore:J */
/* move-wide/from16 v23, v0 */
/* invoke-virtual/range {v22 ..v24}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder; */
/* invoke-virtual/range {v22 ..v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
/* invoke-virtual/range {v21 ..v22}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V */
/* .line 109 */
/* move-object/from16 v0, p0 */
v0 = this.record;
/* move-object/from16 v21, v0 */
/* new-instance v22, Ljava/lang/StringBuilder; */
/* invoke-direct/range {v22 ..v22}, Ljava/lang/StringBuilder;-><init>()V */
/* move-object/from16 v0, p0 */
v0 = this.preferences;
/* move-object/from16 v23, v0 */
final String v24 = "AnimalVoiceRecord"; // const-string v24, "AnimalVoiceRecord"
/* const-wide/16 v25, 0x0 */
/* invoke-interface/range {v23 ..v26}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J */
/* move-result-wide v23 */
/* invoke-virtual/range {v22 ..v24}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder; */
/* invoke-virtual/range {v22 ..v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
/* invoke-virtual/range {v21 ..v22}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V */
/* .line 111 */
/* invoke-direct/range {p0 ..p0}, Lcom/emman/vog/AnimalVoiceActivity;->setContent()V */
/* .line 113 */
/* move-object/from16 v0, p0 */
v0 = this.nextBtn;
/* move-object/from16 v21, v0 */
/* new-instance v22, Lcom/emman/vog/AnimalVoiceActivity$1; */
/* move-object/from16 v0, v22 */
/* move-object/from16 v1, p0 */
/* invoke-direct {v0, v1}, Lcom/emman/vog/AnimalVoiceActivity$1;-><init>(Lcom/emman/vog/AnimalVoiceActivity;)V */
/* invoke-virtual/range {v21 ..v22}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V */
/* .line 130 */
/* move-object/from16 v0, p0 */
v0 = this.gameAd;
/* move-object/from16 v21, v0 */
/* move-object/from16 v0, v21 */
/* move-object/from16 v1, p0 */
(( com.emman.vog.GameAd ) v0 ).Advertise ( v1 ); // invoke-virtual {v0, v1}, Lcom/emman/vog/GameAd;->Advertise(Landroid/app/Activity;)V
/* .line 131 */
return;
} // .end method
protected void onPause ( ) {
/* .locals 2 */
/* .prologue */
/* .line 286 */
v0 = this.player;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 288 */
try { // :try_start_0
v0 = this.player;
(( android.media.MediaPlayer ) v0 ).pause ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 293 */
} // :cond_0
} // :goto_0
v0 = this.speakBtn;
/* const v1, 0x7f020062 */
(( android.widget.Button ) v0 ).setBackgroundResource ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V
/* .line 294 */
/* invoke-super {p0}, Landroid/app/Activity;->onPause()V */
/* .line 295 */
return;
/* .line 289 */
/* :catch_0 */
/* move-exception v0 */
} // .end method
