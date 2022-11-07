public class com.wiyun.engine.afcanim.AFCClip extends com.wiyun.engine.BaseWYObject {
	 /* .source "AFCClip.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.afcanim.AFCClip ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 21 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseWYObject;-><init>(I)V */
		 /* .line 22 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.afcanim.AFCClip from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 17 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/afcanim/AFCClip; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/afcanim/AFCClip;-><init>(I)V */
} // .end method
private native void nativeGetClipPos ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
private native void nativeGetCollisionRectSize ( com.wiyun.engine.types.WYSize p0 ) {
} // .end method
private native void nativeGetEllipseSize ( com.wiyun.engine.types.WYSize p0 ) {
} // .end method
private native void nativeGetImageRect ( com.wiyun.engine.types.WYRect p0 ) {
} // .end method
private native void nativeGetLineEndPoint ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
private native void nativeGetRectangleSize ( com.wiyun.engine.types.WYSize p0 ) {
} // .end method
private native void nativeGetRoundRectSize ( com.wiyun.engine.types.WYSize p0 ) {
} // .end method
private native void nativeGetTrianglePoint2 ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
private native void nativeGetTrianglePoint3 ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.types.WYPoint getClipPos ( ) {
/* .locals 1 */
/* .prologue */
/* .line 73 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 74 */
/* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/afcanim/AFCClip;->nativeGetClipPos(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 75 */
} // .end method
public com.wiyun.engine.types.WYRect getCollisionRect ( ) {
/* .locals 6 */
/* .prologue */
/* const/high16 v5, 0x40000000 # 2.0f */
/* .line 349 */
(( com.wiyun.engine.afcanim.AFCClip ) p0 ).getCollisionRectSize ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/afcanim/AFCClip;->getCollisionRectSize()Lcom/wiyun/engine/types/WYSize;
/* .line 350 */
/* .local v1, "s":Lcom/wiyun/engine/types/WYSize; */
(( com.wiyun.engine.afcanim.AFCClip ) p0 ).getClipPos ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/afcanim/AFCClip;->getClipPos()Lcom/wiyun/engine/types/WYPoint;
/* .line 351 */
/* .local v0, "c":Lcom/wiyun/engine/types/WYPoint; */
/* iget v2, v0, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v3, v1, Lcom/wiyun/engine/types/WYSize;->width:F */
/* div-float/2addr v3, v5 */
/* sub-float/2addr v2, v3 */
/* iget v3, v0, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* iget v4, v1, Lcom/wiyun/engine/types/WYSize;->height:F */
/* div-float/2addr v4, v5 */
/* sub-float/2addr v3, v4 */
/* iget v4, v1, Lcom/wiyun/engine/types/WYSize;->width:F */
/* iget v5, v1, Lcom/wiyun/engine/types/WYSize;->height:F */
com.wiyun.engine.types.WYRect .make ( v2,v3,v4,v5 );
} // .end method
public com.wiyun.engine.types.WYSize getCollisionRectSize ( ) {
/* .locals 1 */
/* .prologue */
/* .line 330 */
com.wiyun.engine.types.WYSize .makeZero ( );
/* .line 331 */
/* .local v0, "s":Lcom/wiyun/engine/types/WYSize; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/afcanim/AFCClip;->nativeGetCollisionRectSize(Lcom/wiyun/engine/types/WYSize;)V */
/* .line 332 */
} // .end method
public native Integer getEllipseColor ( ) {
} // .end method
public native Float getEllipseEndAngle ( ) {
} // .end method
public com.wiyun.engine.types.WYSize getEllipseSize ( ) {
/* .locals 1 */
/* .prologue */
/* .line 163 */
com.wiyun.engine.types.WYSize .makeZero ( );
/* .line 164 */
/* .local v0, "s":Lcom/wiyun/engine/types/WYSize; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/afcanim/AFCClip;->nativeGetEllipseSize(Lcom/wiyun/engine/types/WYSize;)V */
/* .line 165 */
} // .end method
public native Float getEllipseStartAngle ( ) {
} // .end method
public native Integer getImageIndex ( ) {
} // .end method
public com.wiyun.engine.types.WYRect getImageRect ( ) {
/* .locals 1 */
/* .prologue */
/* .line 105 */
com.wiyun.engine.types.WYRect .makeZero ( );
/* .line 106 */
/* .local v0, "r":Lcom/wiyun/engine/types/WYRect; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/afcanim/AFCClip;->nativeGetImageRect(Lcom/wiyun/engine/types/WYRect;)V */
/* .line 107 */
} // .end method
public native Float getImageRotation ( ) {
} // .end method
public native Integer getIndex ( ) {
} // .end method
public native Integer getLineColor ( ) {
} // .end method
public com.wiyun.engine.types.WYPoint getLineEndPoint ( ) {
/* .locals 1 */
/* .prologue */
/* .line 221 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 222 */
/* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/afcanim/AFCClip;->nativeGetLineEndPoint(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 223 */
} // .end method
public native Integer getRectangleColor ( ) {
} // .end method
public com.wiyun.engine.types.WYSize getRectangleSize ( ) {
/* .locals 1 */
/* .prologue */
/* .line 253 */
com.wiyun.engine.types.WYSize .makeZero ( );
/* .line 254 */
/* .local v0, "s":Lcom/wiyun/engine/types/WYSize; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/afcanim/AFCClip;->nativeGetRectangleSize(Lcom/wiyun/engine/types/WYSize;)V */
/* .line 255 */
} // .end method
public native Float getRoundRectArcHeight ( ) {
} // .end method
public native Float getRoundRectArcWidth ( ) {
} // .end method
public native Integer getRoundRectColor ( ) {
} // .end method
public com.wiyun.engine.types.WYSize getRoundRectSize ( ) {
/* .locals 1 */
/* .prologue */
/* .line 285 */
com.wiyun.engine.types.WYSize .makeZero ( );
/* .line 286 */
/* .local v0, "s":Lcom/wiyun/engine/types/WYSize; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/afcanim/AFCClip;->nativeGetRoundRectSize(Lcom/wiyun/engine/types/WYSize;)V */
/* .line 287 */
} // .end method
public com.wiyun.engine.types.WYPoint getTrianglePoint2 ( ) {
/* .locals 1 */
/* .prologue */
/* .line 366 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 367 */
/* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/afcanim/AFCClip;->nativeGetTrianglePoint2(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 368 */
} // .end method
public com.wiyun.engine.types.WYPoint getTrianglePoint3 ( ) {
/* .locals 1 */
/* .prologue */
/* .line 383 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 384 */
/* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/afcanim/AFCClip;->nativeGetTrianglePoint3(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 385 */
} // .end method
public native Integer getType ( ) {
} // .end method
public native Boolean isImageFlipX ( ) {
} // .end method
