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
Integer heightPerLine;
java.lang.String lines;
Integer maxWidth;
Integer totalHeight;
/* # direct methods */
 org.cocos2dx.lib.Cocos2dxBitmap$TextProperty ( ) {
/* .locals 1 */
/* .param p1, "w" # I */
/* .param p2, "h" # I */
/* .param p3, "lines" # [Ljava/lang/String; */
/* .prologue */
/* .line 125 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 126 */
/* iput p1, p0, Lorg/cocos2dx/lib/Cocos2dxBitmap$TextProperty;->maxWidth:I */
/* .line 127 */
/* iput p2, p0, Lorg/cocos2dx/lib/Cocos2dxBitmap$TextProperty;->heightPerLine:I */
/* .line 128 */
/* array-length v0, p3 */
/* mul-int/2addr v0, p2 */
/* iput v0, p0, Lorg/cocos2dx/lib/Cocos2dxBitmap$TextProperty;->totalHeight:I */
/* .line 129 */
this.lines = p3;
/* .line 130 */
return;
} // .end method
