public class com.wiyun.engine.afcanim.AFCFrame extends com.wiyun.engine.BaseWYObject {
	 /* .source "AFCFrame.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.afcanim.AFCFrame ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 20 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseWYObject;-><init>(I)V */
		 /* .line 21 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.afcanim.AFCFrame from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 16 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/afcanim/AFCFrame; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/afcanim/AFCFrame;-><init>(I)V */
} // .end method
private native Integer nativeGetClipAt ( Integer p0 ) {
} // .end method
private native Integer nativeGetClipAt ( Integer p0, Integer p1 ) {
} // .end method
private native void nativeGetIncrementation ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.afcanim.AFCClip getClipAt ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "index" # I */
/* .prologue */
/* .line 65 */
v0 = /* invoke-direct {p0, p1}, Lcom/wiyun/engine/afcanim/AFCFrame;->nativeGetClipAt(I)I */
com.wiyun.engine.afcanim.AFCClip .from ( v0 );
} // .end method
public com.wiyun.engine.afcanim.AFCClip getClipAt ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* .param p1, "type" # I */
/* .param p2, "index" # I */
/* .prologue */
/* .line 120 */
v0 = /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/afcanim/AFCFrame;->nativeGetClipAt(II)I */
com.wiyun.engine.afcanim.AFCClip .from ( v0 );
} // .end method
public native Integer getClipCount ( ) {
} // .end method
public native Integer getClipCount ( Integer p0 ) {
} // .end method
public native Float getDelay ( ) {
} // .end method
public com.wiyun.engine.types.WYPoint getIncrementation ( ) {
/* .locals 1 */
/* .prologue */
/* .line 95 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 96 */
/* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/afcanim/AFCFrame;->nativeGetIncrementation(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 97 */
} // .end method
public native Boolean isFlipX ( ) {
} // .end method
public native Boolean isFlipY ( ) {
} // .end method
