public class com.wiyun.engine.nodes.CoverFlow extends com.wiyun.engine.nodes.Node {
	 /* .source "CoverFlow.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.nodes.CoverFlow ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 29 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;-><init>()V */
		 /* .line 30 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/CoverFlow;->nativeInit()V */
		 /* .line 29 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.CoverFlow ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 34 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Node;-><init>(I)V */
		 /* .line 30 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/CoverFlow;->nativeInit()V */
		 /* .line 35 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.CoverFlow from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 23 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/CoverFlow; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/CoverFlow;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.Node from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.nodes.CoverFlow .from ( p0 );
} // .end method
public static com.wiyun.engine.nodes.CoverFlow make ( ) {
/* .locals 1 */
/* .prologue */
/* .line 19 */
/* new-instance v0, Lcom/wiyun/engine/nodes/CoverFlow; */
/* invoke-direct {v0}, Lcom/wiyun/engine/nodes/CoverFlow;-><init>()V */
} // .end method
private native Integer nativeGetCoverAt ( Integer p0 ) {
} // .end method
private native Integer nativeGetCoverList ( ) {
} // .end method
private native Integer nativeGetFrontCover ( ) {
} // .end method
private native Integer nativeGetTouchedCover ( Float p0, Float p1 ) {
} // .end method
private native void nativeInit ( ) {
} // .end method
/* # virtual methods */
public native void addCover ( com.wiyun.engine.nodes.Cover p0 ) {
} // .end method
protected void doNativeInit ( ) {
/* .locals 0 */
/* .prologue */
/* .line 39 */
return;
} // .end method
public native Float getBrightLevelOfMirror ( ) {
} // .end method
public native Integer getCountLeftVisible ( ) {
} // .end method
public native Integer getCountRightVisible ( ) {
} // .end method
public com.wiyun.engine.nodes.Cover getCoverAt ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "index" # I */
/* .prologue */
/* .line 76 */
v0 = /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/CoverFlow;->nativeGetCoverAt(I)I */
com.wiyun.engine.nodes.Cover .from ( v0 );
} // .end method
public com.wiyun.engine.nodes.Cover getCoverList ( ) {
/* .locals 1 */
/* .prologue */
/* .line 86 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/CoverFlow;->nativeGetCoverList()I */
com.wiyun.engine.nodes.Cover .from ( v0 );
} // .end method
public native Float getDepthZ ( ) {
} // .end method
public native Float getFirstLeftOffset ( ) {
} // .end method
public native Float getFirstRightOffset ( ) {
} // .end method
public com.wiyun.engine.nodes.Cover getFrontCover ( ) {
/* .locals 1 */
/* .prologue */
/* .line 96 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/CoverFlow;->nativeGetFrontCover()I */
com.wiyun.engine.nodes.Cover .from ( v0 );
} // .end method
public native Float getHeightFromMirror ( ) {
} // .end method
public native Integer getIndex ( com.wiyun.engine.nodes.Cover p0 ) {
} // .end method
public native Float getLeftCoverCenterDelta ( ) {
} // .end method
public native Float getRightCoverCenterDelta ( ) {
} // .end method
public native Float getRotateDegreeLeft ( ) {
} // .end method
public native Float getRotateDegreeRight ( ) {
} // .end method
public com.wiyun.engine.nodes.Cover getTouchedCover ( Float p0, Float p1 ) {
/* .locals 1 */
/* .param p1, "x" # F */
/* .param p2, "y" # F */
/* .prologue */
/* .line 289 */
v0 = /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/nodes/CoverFlow;->nativeGetTouchedCover(FF)I */
com.wiyun.engine.nodes.Cover .from ( v0 );
} // .end method
public native void insertCoverBefore ( com.wiyun.engine.nodes.Cover p0, com.wiyun.engine.nodes.Cover p1 ) {
} // .end method
public native Boolean isMirrorEnabled ( ) {
} // .end method
public native void moveLeft ( Float p0 ) {
} // .end method
public native void moveRight ( Float p0 ) {
} // .end method
public native void removeCover ( com.wiyun.engine.nodes.Cover p0 ) {
} // .end method
public native void setBlurredBorderWidth ( Float p0 ) {
} // .end method
public native void setBlurredBorderWidthInPixels ( Integer p0 ) {
} // .end method
public native void setBrightLevelOfMirror ( Float p0 ) {
} // .end method
public native void setCountLeftVisible ( Integer p0 ) {
} // .end method
public native void setCountRightVisible ( Integer p0 ) {
} // .end method
public native void setDepthZ ( Float p0 ) {
} // .end method
public native void setFirstLeftOffset ( Float p0 ) {
} // .end method
public native void setFirstRightOffset ( Float p0 ) {
} // .end method
public native void setFrontCenterPosition ( Integer p0, Integer p1 ) {
} // .end method
public native void setFrontCoverSize ( Float p0, Float p1, Boolean p2 ) {
} // .end method
public native void setHeightFromMirror ( Float p0 ) {
} // .end method
public native void setLeftCoverCenterDelta ( Float p0 ) {
} // .end method
public native void setMirrorEnable ( Boolean p0 ) {
} // .end method
public native void setRightCoverCenterDelta ( Float p0 ) {
} // .end method
public native void setRotateDegreeLeft ( Float p0 ) {
} // .end method
public native void setRotateDegreeRight ( Float p0 ) {
} // .end method
public native void showCover ( com.wiyun.engine.nodes.Cover p0, Float p1 ) {
} // .end method
