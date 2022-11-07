class org.cocos2dx.lib.Cocos2dxBitmap$TextProperty {
	 /* .source "Cocos2dxBitmap.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lorg/cocos2dx/lib/Cocos2dxBitmap; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "TextProperty" */
} // .end annotation
/* # instance fields */
private final Integer mHeightPerLine;
private final java.lang.String mLines;
private final Integer mMaxWidth;
private final Integer mTotalHeight;
/* # direct methods */
 org.cocos2dx.lib.Cocos2dxBitmap$TextProperty ( ) {
/* .locals 1 */
/* .param p1, "pMaxWidth" # I */
/* .param p2, "pHeightPerLine" # I */
/* .param p3, "pLines" # [Ljava/lang/String; */
/* .prologue */
/* .line 413 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 414 */
/* iput p1, p0, Lorg/cocos2dx/lib/Cocos2dxBitmap$TextProperty;->mMaxWidth:I */
/* .line 415 */
/* iput p2, p0, Lorg/cocos2dx/lib/Cocos2dxBitmap$TextProperty;->mHeightPerLine:I */
/* .line 416 */
/* array-length v0, p3 */
/* mul-int/2addr v0, p2 */
/* iput v0, p0, Lorg/cocos2dx/lib/Cocos2dxBitmap$TextProperty;->mTotalHeight:I */
/* .line 417 */
this.mLines = p3;
/* .line 418 */
return;
} // .end method
static Integer access$0 ( org.cocos2dx.lib.Cocos2dxBitmap$TextProperty p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 409 */
/* iget v0, p0, Lorg/cocos2dx/lib/Cocos2dxBitmap$TextProperty;->mTotalHeight:I */
} // .end method
static Integer access$1 ( org.cocos2dx.lib.Cocos2dxBitmap$TextProperty p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 407 */
/* iget v0, p0, Lorg/cocos2dx/lib/Cocos2dxBitmap$TextProperty;->mMaxWidth:I */
} // .end method
static java.lang.String access$2 ( org.cocos2dx.lib.Cocos2dxBitmap$TextProperty p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 411 */
v0 = this.mLines;
} // .end method
static Integer access$3 ( org.cocos2dx.lib.Cocos2dxBitmap$TextProperty p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 410 */
/* iget v0, p0, Lorg/cocos2dx/lib/Cocos2dxBitmap$TextProperty;->mHeightPerLine:I */
} // .end method
