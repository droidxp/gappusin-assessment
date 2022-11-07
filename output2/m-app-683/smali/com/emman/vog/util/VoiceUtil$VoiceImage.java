public class com.emman.vog.util.VoiceUtil$VoiceImage {
	 /* .source "VoiceUtil.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/emman/vog/util/VoiceUtil; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "VoiceImage" */
} // .end annotation
/* # instance fields */
private Integer imageId1;
private Integer imageId2;
private Integer nameId;
private Integer voiceId;
/* # direct methods */
public com.emman.vog.util.VoiceUtil$VoiceImage ( ) {
/* .locals 0 */
/* .param p1, "nameId" # I */
/* .param p2, "voiceId" # I */
/* .param p3, "imageId1" # I */
/* .param p4, "imageId2" # I */
/* .prologue */
/* .line 17 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 18 */
/* iput p1, p0, Lcom/emman/vog/util/VoiceUtil$VoiceImage;->nameId:I */
/* .line 19 */
/* iput p2, p0, Lcom/emman/vog/util/VoiceUtil$VoiceImage;->voiceId:I */
/* .line 20 */
/* iput p3, p0, Lcom/emman/vog/util/VoiceUtil$VoiceImage;->imageId1:I */
/* .line 21 */
/* iput p4, p0, Lcom/emman/vog/util/VoiceUtil$VoiceImage;->imageId2:I */
/* .line 22 */
return;
} // .end method
/* # virtual methods */
public Integer getImageId ( ) {
/* .locals 4 */
/* .prologue */
/* .line 33 */
java.lang.Math .random ( );
/* move-result-wide v0 */
/* const-wide/high16 v2, 0x3fe0000000000000L # 0.5 */
/* cmpl-double v0, v0, v2 */
/* if-lez v0, :cond_0 */
/* .line 34 */
/* iget v0, p0, Lcom/emman/vog/util/VoiceUtil$VoiceImage;->imageId1:I */
/* .line 36 */
} // :goto_0
} // :cond_0
/* iget v0, p0, Lcom/emman/vog/util/VoiceUtil$VoiceImage;->imageId2:I */
} // .end method
public Integer getNameId ( ) {
/* .locals 1 */
/* .prologue */
/* .line 25 */
/* iget v0, p0, Lcom/emman/vog/util/VoiceUtil$VoiceImage;->nameId:I */
} // .end method
public Integer getVoiceId ( ) {
/* .locals 1 */
/* .prologue */
/* .line 29 */
/* iget v0, p0, Lcom/emman/vog/util/VoiceUtil$VoiceImage;->voiceId:I */
} // .end method
