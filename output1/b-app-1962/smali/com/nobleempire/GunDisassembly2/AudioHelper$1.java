class com.nobleempire.GunDisassembly2.AudioHelper$1 implements android.media.SoundPool$OnLoadCompleteListener {
	 /* .source "AudioHelper.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/nobleempire/GunDisassembly2/AudioHelper;->Initialise()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.nobleempire.GunDisassembly2.AudioHelper this$0; //synthetic
/* # direct methods */
 com.nobleempire.GunDisassembly2.AudioHelper$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 56 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onLoadComplete ( android.media.SoundPool p0, Integer p1, Integer p2 ) {
/* .locals 10 */
/* .param p1, "pool" # Landroid/media/SoundPool; */
/* .param p2, "sampleId" # I */
/* .param p3, "status" # I */
/* .prologue */
/* .line 59 */
/* const/high16 v2, 0x3f800000 # 1.0f */
/* .local v2, "lv":F */
/* const/high16 v3, 0x3f800000 # 1.0f */
/* .local v3, "rv":F */
/* const/high16 v6, 0x3f800000 # 1.0f */
/* .line 60 */
/* .local v6, "rate":F */
int v4 = 1; // const/4 v4, 0x1
/* .local v4, "priority":I */
int v5 = 0; // const/4 v5, 0x0
/* .line 61 */
/* .local v5, "loop":I */
/* new-instance v7, Ljava/lang/Integer; */
/* invoke-direct {v7, p2}, Ljava/lang/Integer;-><init>(I)V */
/* .line 62 */
/* .local v7, "key":Ljava/lang/Integer; */
v0 = this.this$0;
com.nobleempire.GunDisassembly2.AudioHelper .access$0 ( v0 );
/* check-cast v8, Lcom/nobleempire/GunDisassembly2/AudioHelper$play_settings_t; */
/* .line 63 */
/* .local v8, "ps":Lcom/nobleempire/GunDisassembly2/AudioHelper$play_settings_t; */
if ( v8 != null) { // if-eqz v8, :cond_0
	 /* .line 64 */
	 /* iget v2, v8, Lcom/nobleempire/GunDisassembly2/AudioHelper$play_settings_t;->lv:F */
	 /* .line 65 */
	 /* iget v3, v8, Lcom/nobleempire/GunDisassembly2/AudioHelper$play_settings_t;->rv:F */
	 /* .line 66 */
	 /* iget v6, v8, Lcom/nobleempire/GunDisassembly2/AudioHelper$play_settings_t;->rate:F */
	 /* .line 67 */
	 /* iget v4, v8, Lcom/nobleempire/GunDisassembly2/AudioHelper$play_settings_t;->priority:I */
	 /* .line 68 */
	 /* iget v5, v8, Lcom/nobleempire/GunDisassembly2/AudioHelper$play_settings_t;->loop:I */
	 /* .line 69 */
	 v0 = this.this$0;
	 com.nobleempire.GunDisassembly2.AudioHelper .access$0 ( v0 );
	 /* .line 71 */
	 v0 = this.this$0;
	 com.nobleempire.GunDisassembly2.AudioHelper .access$1 ( v0 );
	 /* move v1, p2 */
	 /* invoke-virtual/range {v0 ..v6}, Landroid/media/SoundPool;->play(IFFIIF)I */
	 /* .line 72 */
	 v0 = this.this$0;
	 com.nobleempire.GunDisassembly2.AudioHelper .access$1 ( v0 );
	 (( android.media.SoundPool ) v0 ).setVolume ( p2, v2, v3 ); // invoke-virtual {v0, p2, v2, v3}, Landroid/media/SoundPool;->setVolume(IFF)V
	 /* .line 76 */
} // :goto_0
return;
/* .line 74 */
} // :cond_0
final String v0 = "==>AudioHelper.java"; // const-string v0, "==>AudioHelper.java"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v9 = "~~*** play settings not found: "; // const-string v9, "~~*** play settings not found: "
/* invoke-direct {v1, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v0,v1 );
} // .end method
