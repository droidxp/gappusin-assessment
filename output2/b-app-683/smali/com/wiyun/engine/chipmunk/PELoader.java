public class com.wiyun.engine.chipmunk.PELoader extends com.wiyun.engine.BaseObject {
	 /* .source "PELoader.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.chipmunk.PELoader ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 12 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseObject;-><init>(I)V */
		 /* .line 13 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.chipmunk.PELoader from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 8 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/chipmunk/PELoader; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/chipmunk/PELoader;-><init>(I)V */
} // .end method
public static com.wiyun.engine.chipmunk.PELoader make ( Integer p0 ) {
/* .locals 2 */
/* .param p0, "resId" # I */
/* .prologue */
/* .line 34 */
v0 = com.wiyun.engine.chipmunk.PELoader .nativeNewBodyLoader ( p0 );
/* .line 35 */
/* .local v0, "pointer":I */
com.wiyun.engine.chipmunk.PELoader .from ( v0 );
} // .end method
public static com.wiyun.engine.chipmunk.PELoader make ( java.lang.String p0, Boolean p1 ) {
/* .locals 2 */
/* .param p0, "filePath" # Ljava/lang/String; */
/* .param p1, "isFile" # Z */
/* .prologue */
/* .line 22 */
v0 = com.wiyun.engine.chipmunk.PELoader .nativeNewBodyLoader ( p0,p1 );
/* .line 23 */
/* .local v0, "pointer":I */
com.wiyun.engine.chipmunk.PELoader .from ( v0 );
} // .end method
private native Integer nativeCreateBodyByName ( com.wiyun.engine.chipmunk.Chipmunk p0, java.lang.String p1 ) {
} // .end method
private native void nativeGetAnchorPercent ( java.lang.String p0, com.wiyun.engine.types.WYPoint p1 ) {
} // .end method
private static native Integer nativeNewBodyLoader ( Integer p0 ) {
} // .end method
private static native Integer nativeNewBodyLoader ( java.lang.String p0, Boolean p1 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.chipmunk.Body createBodyByName ( com.wiyun.engine.chipmunk.Chipmunk p0, java.lang.String p1 ) {
/* .locals 2 */
/* .param p1, "chipmunk" # Lcom/wiyun/engine/chipmunk/Chipmunk; */
/* .param p2, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 47 */
v0 = /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/chipmunk/PELoader;->nativeCreateBodyByName(Lcom/wiyun/engine/chipmunk/Chipmunk;Ljava/lang/String;)I */
/* .line 48 */
/* .local v0, "pointer":I */
com.wiyun.engine.chipmunk.Body .from ( v0 );
} // .end method
public native void destroy ( ) {
} // .end method
public com.wiyun.engine.types.WYPoint getAnchorPercent ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 59 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 60 */
/* .local v0, "point":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, p1, v0}, Lcom/wiyun/engine/chipmunk/PELoader;->nativeGetAnchorPercent(Ljava/lang/String;Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 61 */
} // .end method
public native Integer getPlistFormat ( ) {
} // .end method
