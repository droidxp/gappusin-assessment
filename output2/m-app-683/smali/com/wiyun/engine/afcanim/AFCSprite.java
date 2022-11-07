public class com.wiyun.engine.afcanim.AFCSprite extends com.wiyun.engine.nodes.Node {
	 /* .source "AFCSprite.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/wiyun/engine/afcanim/AFCSprite$IAFCSpriteCallback; */
	 /* } */
} // .end annotation
/* # direct methods */
protected com.wiyun.engine.afcanim.AFCSprite ( ) {
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 87 */
	 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;-><init>()V */
	 /* .line 88 */
	 return;
} // .end method
protected com.wiyun.engine.afcanim.AFCSprite ( ) {
	 /* .locals 0 */
	 /* .param p1, "pointer" # I */
	 /* .prologue */
	 /* .line 95 */
	 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Node;-><init>(I)V */
	 /* .line 96 */
	 return;
} // .end method
private native Integer getBlendFuncDst ( ) {
} // .end method
private native Integer getBlendFuncSrc ( ) {
} // .end method
private native Integer nativeGetAnimationAt ( Integer p0 ) {
} // .end method
private native Integer nativeGetClipMappingByTag ( Integer p0 ) {
} // .end method
private native void nativeGetCollisionRect ( Integer p0, com.wiyun.engine.types.WYRect p1 ) {
} // .end method
private native void nativeGetCollisionRectRelativeToParent ( Integer p0, com.wiyun.engine.types.WYRect p1 ) {
} // .end method
private native void nativeGetCollisionRectRelativeToWorld ( Integer p0, com.wiyun.engine.types.WYRect p1 ) {
} // .end method
private native void nativeGetColor ( com.wiyun.engine.types.WYColor3B p0 ) {
} // .end method
private native Integer nativeGetCurrentAnimationData ( ) {
} // .end method
private native void nativeGetFrameOffset ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
private native void nativeGetFrameRect ( com.wiyun.engine.types.WYRect p0 ) {
} // .end method
private native void nativeGetFrameRectRelativeToParent ( com.wiyun.engine.types.WYRect p0 ) {
} // .end method
private native void nativeGetFrameRectRelativeToWorld ( com.wiyun.engine.types.WYRect p0 ) {
} // .end method
private native void nativeSetColor ( Integer p0, Integer p1, Integer p2 ) {
} // .end method
private native void setBlendFunc ( Integer p0, Integer p1 ) {
} // .end method
/* # virtual methods */
public native void addClipMapping ( com.wiyun.engine.afcanim.AFCClipMapping p0 ) {
} // .end method
protected void doNativeInit ( ) {
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 92 */
	 return;
} // .end method
public native Integer getAlpha ( ) {
} // .end method
public com.wiyun.engine.afcanim.AFCAnimation getAnimationAt ( Integer p0 ) {
	 /* .locals 1 */
	 /* .param p1, "index" # I */
	 /* .prologue */
	 /* .line 110 */
	 v0 = 	 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/afcanim/AFCSprite;->nativeGetAnimationAt(I)I */
	 com.wiyun.engine.afcanim.AFCAnimation .from ( v0 );
} // .end method
public native Integer getAnimationCount ( ) {
} // .end method
public com.wiyun.engine.types.WYBlendFunc getBlendFunc ( ) {
	 /* .locals 3 */
	 /* .prologue */
	 /* .line 774 */
	 /* new-instance v0, Lcom/wiyun/engine/types/WYBlendFunc; */
	 v1 = 	 /* invoke-direct {p0}, Lcom/wiyun/engine/afcanim/AFCSprite;->getBlendFuncSrc()I */
	 v2 = 	 /* invoke-direct {p0}, Lcom/wiyun/engine/afcanim/AFCSprite;->getBlendFuncDst()I */
	 /* invoke-direct {v0, v1, v2}, Lcom/wiyun/engine/types/WYBlendFunc;-><init>(II)V */
} // .end method
public com.wiyun.engine.afcanim.AFCClipMapping getClipMappingByTag ( Integer p0 ) {
	 /* .locals 1 */
	 /* .param p1, "tag" # I */
	 /* .prologue */
	 /* .line 768 */
	 v0 = 	 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/afcanim/AFCSprite;->nativeGetClipMappingByTag(I)I */
	 com.wiyun.engine.afcanim.AFCClipMapping .from ( v0 );
} // .end method
public com.wiyun.engine.types.WYRect getCollisionRect ( Integer p0 ) {
	 /* .locals 1 */
	 /* .param p1, "index" # I */
	 /* .prologue */
	 /* .line 586 */
	 com.wiyun.engine.types.WYRect .makeZero ( );
	 /* .line 587 */
	 /* .local v0, "r":Lcom/wiyun/engine/types/WYRect; */
	 /* invoke-direct {p0, p1, v0}, Lcom/wiyun/engine/afcanim/AFCSprite;->nativeGetCollisionRect(ILcom/wiyun/engine/types/WYRect;)V */
	 /* .line 588 */
} // .end method
public native Integer getCollisionRectCount ( ) {
} // .end method
public com.wiyun.engine.types.WYRect getCollisionRectRelativeToParent ( Integer p0 ) {
	 /* .locals 1 */
	 /* .param p1, "index" # I */
	 /* .prologue */
	 /* .line 610 */
	 com.wiyun.engine.types.WYRect .makeZero ( );
	 /* .line 611 */
	 /* .local v0, "r":Lcom/wiyun/engine/types/WYRect; */
	 /* invoke-direct {p0, p1, v0}, Lcom/wiyun/engine/afcanim/AFCSprite;->nativeGetCollisionRectRelativeToParent(ILcom/wiyun/engine/types/WYRect;)V */
	 /* .line 612 */
} // .end method
public com.wiyun.engine.types.WYRect getCollisionRectRelativeToWorld ( Integer p0 ) {
	 /* .locals 1 */
	 /* .param p1, "index" # I */
	 /* .prologue */
	 /* .line 634 */
	 com.wiyun.engine.types.WYRect .makeZero ( );
	 /* .line 635 */
	 /* .local v0, "r":Lcom/wiyun/engine/types/WYRect; */
	 /* invoke-direct {p0, p1, v0}, Lcom/wiyun/engine/afcanim/AFCSprite;->nativeGetCollisionRectRelativeToWorld(ILcom/wiyun/engine/types/WYRect;)V */
	 /* .line 636 */
} // .end method
public com.wiyun.engine.types.WYColor3B getColor ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 493 */
	 /* new-instance v0, Lcom/wiyun/engine/types/WYColor3B; */
	 /* invoke-direct {v0}, Lcom/wiyun/engine/types/WYColor3B;-><init>()V */
	 /* .line 494 */
	 /* .local v0, "color":Lcom/wiyun/engine/types/WYColor3B; */
	 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/afcanim/AFCSprite;->nativeGetColor(Lcom/wiyun/engine/types/WYColor3B;)V */
	 /* .line 495 */
} // .end method
public com.wiyun.engine.afcanim.AFCAnimation getCurrentAnimationData ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 483 */
	 v0 = 	 /* invoke-direct {p0}, Lcom/wiyun/engine/afcanim/AFCSprite;->nativeGetCurrentAnimationData()I */
	 com.wiyun.engine.afcanim.AFCAnimation .from ( v0 );
} // .end method
public native Integer getCurrentAnimationIndex ( ) {
} // .end method
public native Integer getCurrentFrame ( ) {
} // .end method
public native Integer getFrameCount ( ) {
} // .end method
public com.wiyun.engine.types.WYPoint getFrameOffset ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 261 */
	 com.wiyun.engine.types.WYPoint .makeZero ( );
	 /* .line 262 */
	 /* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
	 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/afcanim/AFCSprite;->nativeGetFrameOffset(Lcom/wiyun/engine/types/WYPoint;)V */
	 /* .line 263 */
} // .end method
public com.wiyun.engine.types.WYRect getFrameRect ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 654 */
	 com.wiyun.engine.types.WYRect .makeZero ( );
	 /* .line 655 */
	 /* .local v0, "r":Lcom/wiyun/engine/types/WYRect; */
	 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/afcanim/AFCSprite;->nativeGetFrameRect(Lcom/wiyun/engine/types/WYRect;)V */
	 /* .line 656 */
} // .end method
public com.wiyun.engine.types.WYRect getFrameRectRelativeToParent ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 675 */
	 com.wiyun.engine.types.WYRect .makeZero ( );
	 /* .line 676 */
	 /* .local v0, "r":Lcom/wiyun/engine/types/WYRect; */
	 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/afcanim/AFCSprite;->nativeGetFrameRectRelativeToParent(Lcom/wiyun/engine/types/WYRect;)V */
	 /* .line 677 */
} // .end method
public com.wiyun.engine.types.WYRect getFrameRectRelativeToWorld ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 695 */
	 com.wiyun.engine.types.WYRect .makeZero ( );
	 /* .line 696 */
	 /* .local v0, "r":Lcom/wiyun/engine/types/WYRect; */
	 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/afcanim/AFCSprite;->nativeGetFrameRectRelativeToWorld(Lcom/wiyun/engine/types/WYRect;)V */
	 /* .line 697 */
} // .end method
public native Integer getImageCount ( ) {
} // .end method
public native Integer getLoopCount ( ) {
} // .end method
public native Float getUnitInterval ( ) {
} // .end method
public native Boolean isAnimationEnded ( ) {
} // .end method
public native Boolean isFlipX ( ) {
} // .end method
public native Boolean isFlipY ( ) {
} // .end method
public native Boolean isForceTickMode ( ) {
} // .end method
public native Boolean isIgnoreFrameOffset ( ) {
} // .end method
public native Boolean isPaused ( ) {
} // .end method
public native Boolean isReverse ( ) {
} // .end method
public native void playAnimation ( Integer p0 ) {
} // .end method
public native void playAnimation ( Integer p0, Integer p1 ) {
} // .end method
public native void playAnimation ( Integer p0, com.wiyun.engine.afcanim.AFCClipMapping p1 ) {
} // .end method
public native void removeClipMappingByTag ( Integer p0 ) {
} // .end method
public native void replaceTextures ( com.wiyun.engine.opengl.Texture2D...p0 ) {
} // .end method
public native void setAFCSpriteCallback ( com.wiyun.engine.afcanim.AFCSprite$IAFCSpriteCallback p0 ) {
} // .end method
public native void setAlpha ( Integer p0 ) {
} // .end method
public void setBlendFunc ( com.wiyun.engine.types.WYBlendFunc p0 ) {
	 /* .locals 2 */
	 /* .param p1, "blendFunc" # Lcom/wiyun/engine/types/WYBlendFunc; */
	 /* .prologue */
	 /* .line 781 */
	 /* iget v0, p1, Lcom/wiyun/engine/types/WYBlendFunc;->src:I */
	 /* iget v1, p1, Lcom/wiyun/engine/types/WYBlendFunc;->dst:I */
	 /* invoke-direct {p0, v0, v1}, Lcom/wiyun/engine/afcanim/AFCSprite;->setBlendFunc(II)V */
	 /* .line 782 */
	 return;
} // .end method
public void setColor ( com.wiyun.engine.types.WYColor3B p0 ) {
	 /* .locals 3 */
	 /* .param p1, "color" # Lcom/wiyun/engine/types/WYColor3B; */
	 /* .prologue */
	 /* .line 501 */
	 /* iget v0, p1, Lcom/wiyun/engine/types/WYColor3B;->r:I */
	 /* iget v1, p1, Lcom/wiyun/engine/types/WYColor3B;->g:I */
	 /* iget v2, p1, Lcom/wiyun/engine/types/WYColor3B;->b:I */
	 /* invoke-direct {p0, v0, v1, v2}, Lcom/wiyun/engine/afcanim/AFCSprite;->nativeSetColor(III)V */
	 /* .line 502 */
	 return;
} // .end method
public native void setDebugDrawCollisionRect ( Boolean p0 ) {
} // .end method
public native void setDebugDrawFrameRect ( Boolean p0 ) {
} // .end method
public native void setFlipX ( Boolean p0 ) {
} // .end method
public native void setFlipY ( Boolean p0 ) {
} // .end method
public native void setForceTickMode ( Boolean p0 ) {
} // .end method
public native void setFrameIndex ( Integer p0 ) {
} // .end method
public native void setIgnoreFrameOffset ( Boolean p0 ) {
} // .end method
public native void setLoopCount ( Integer p0 ) {
} // .end method
public native void setPaused ( Boolean p0 ) {
} // .end method
public native void setReverse ( Boolean p0 ) {
} // .end method
public native void setUnitInterval ( Float p0 ) {
} // .end method
public native void tick ( Float p0 ) {
} // .end method
