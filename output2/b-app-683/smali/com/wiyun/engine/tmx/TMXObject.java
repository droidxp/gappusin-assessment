public class com.wiyun.engine.tmx.TMXObject extends com.wiyun.engine.BaseWYObject {
	 /* .source "TMXObject.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/wiyun/engine/tmx/TMXObject$Type; */
	 /* } */
} // .end annotation
/* # direct methods */
protected com.wiyun.engine.tmx.TMXObject ( ) {
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 56 */
	 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
	 /* .line 57 */
	 /* invoke-direct {p0}, Lcom/wiyun/engine/tmx/TMXObject;->nativeInit()V */
	 /* .line 58 */
	 return;
} // .end method
protected com.wiyun.engine.tmx.TMXObject ( ) {
	 /* .locals 0 */
	 /* .param p1, "pointer" # I */
	 /* .prologue */
	 /* .line 61 */
	 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseWYObject;-><init>(I)V */
	 /* .line 62 */
	 return;
} // .end method
public static com.wiyun.engine.tmx.TMXObject from ( Integer p0 ) {
	 /* .locals 1 */
	 /* .param p0, "pointer" # I */
	 /* .prologue */
	 /* .line 53 */
	 /* if-nez p0, :cond_0 */
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/tmx/TMXObject; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/tmx/TMXObject;-><init>(I)V */
} // .end method
private native void nativeGetPoints ( com.wiyun.engine.types.WYPointList p0 ) {
} // .end method
private native void nativeGetPosition ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
private native void nativeGetSize ( com.wiyun.engine.types.WYSize p0 ) {
} // .end method
private native Integer nativeGetType ( ) {
} // .end method
private native void nativeInit ( ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.types.WYPointList getPoints ( ) {
/* .locals 1 */
/* .prologue */
/* .line 145 */
/* new-instance v0, Lcom/wiyun/engine/types/WYPointList; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYPointList;-><init>()V */
/* .line 146 */
/* .local v0, "plist":Lcom/wiyun/engine/types/WYPointList; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/tmx/TMXObject;->nativeGetPoints(Lcom/wiyun/engine/types/WYPointList;)V */
/* .line 147 */
} // .end method
public com.wiyun.engine.types.WYPoint getPosition ( ) {
/* .locals 1 */
/* .prologue */
/* .line 107 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 108 */
/* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/tmx/TMXObject;->nativeGetPosition(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 109 */
} // .end method
public native java.lang.String getProperty ( java.lang.String p0 ) {
} // .end method
public com.wiyun.engine.types.WYSize getSize ( ) {
/* .locals 1 */
/* .prologue */
/* .line 126 */
com.wiyun.engine.types.WYSize .makeZero ( );
/* .line 127 */
/* .local v0, "s":Lcom/wiyun/engine/types/WYSize; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/tmx/TMXObject;->nativeGetSize(Lcom/wiyun/engine/types/WYSize;)V */
/* .line 128 */
} // .end method
public com.wiyun.engine.tmx.TMXObject$Type getType ( ) {
/* .locals 2 */
/* .prologue */
/* .line 89 */
com.wiyun.engine.tmx.TMXObject$Type .values ( );
v1 = /* invoke-direct {p0}, Lcom/wiyun/engine/tmx/TMXObject;->nativeGetType()I */
/* aget-object v0, v0, v1 */
} // .end method
