public class com.wiyun.engine.box2d.PELoader extends com.wiyun.engine.BaseObject {
	 /* .source "PELoader.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.PELoader ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 20 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseObject;-><init>(I)V */
		 /* .line 21 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.PELoader from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 16 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/box2d/PELoader; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/box2d/PELoader;-><init>(I)V */
} // .end method
public static com.wiyun.engine.box2d.PELoader make ( Integer p0 ) {
/* .locals 2 */
/* .param p0, "resId" # I */
/* .prologue */
/* .line 42 */
v0 = com.wiyun.engine.box2d.PELoader .nativeNewBodyLoader ( p0 );
/* .line 43 */
/* .local v0, "pointer":I */
com.wiyun.engine.box2d.PELoader .from ( v0 );
} // .end method
public static com.wiyun.engine.box2d.PELoader make ( java.lang.String p0, Boolean p1 ) {
/* .locals 2 */
/* .param p0, "filePath" # Ljava/lang/String; */
/* .param p1, "isFile" # Z */
/* .prologue */
/* .line 30 */
v0 = com.wiyun.engine.box2d.PELoader .nativeNewBodyLoader ( p0,p1 );
/* .line 31 */
/* .local v0, "pointer":I */
com.wiyun.engine.box2d.PELoader .from ( v0 );
} // .end method
private native Integer nativeCreateBodyByName ( com.wiyun.engine.box2d.Box2D p0, java.lang.String p1 ) {
} // .end method
private native void nativeGetAnchorPercent ( java.lang.String p0, com.wiyun.engine.types.WYPoint p1 ) {
} // .end method
private static native Integer nativeNewBodyLoader ( Integer p0 ) {
} // .end method
private static native Integer nativeNewBodyLoader ( java.lang.String p0, Boolean p1 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.box2d.dynamics.Body createBodyByName ( com.wiyun.engine.box2d.Box2D p0, java.lang.String p1 ) {
/* .locals 2 */
/* .param p1, "box2d" # Lcom/wiyun/engine/box2d/Box2D; */
/* .param p2, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 55 */
v0 = /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/box2d/PELoader;->nativeCreateBodyByName(Lcom/wiyun/engine/box2d/Box2D;Ljava/lang/String;)I */
/* .line 56 */
/* .local v0, "pointer":I */
com.wiyun.engine.box2d.dynamics.Body .from ( v0 );
} // .end method
public native void destroy ( ) {
} // .end method
public com.wiyun.engine.types.WYPoint getAnchorPercent ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 67 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 68 */
/* .local v0, "point":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, p1, v0}, Lcom/wiyun/engine/box2d/PELoader;->nativeGetAnchorPercent(Ljava/lang/String;Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 69 */
} // .end method
public native Float getMeterPixels ( ) {
} // .end method
public native Integer getPlistFormat ( ) {
} // .end method
