public class com.wiyun.engine.utils.VerletStick extends com.wiyun.engine.BaseWYObject {
	 /* .source "VerletStick.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.utils.VerletStick ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 27 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseWYObject;-><init>(I)V */
		 /* .line 28 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.utils.VerletStick ( ) {
		 /* .locals 0 */
		 /* .param p1, "a" # Lcom/wiyun/engine/utils/VerletPoint; */
		 /* .param p2, "b" # Lcom/wiyun/engine/utils/VerletPoint; */
		 /* .prologue */
		 /* .line 22 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 /* .line 23 */
		 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/utils/VerletStick;->nativeInit(Lcom/wiyun/engine/utils/VerletPoint;Lcom/wiyun/engine/utils/VerletPoint;)V */
		 /* .line 24 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.utils.VerletStick from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 19 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/utils/VerletStick; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/utils/VerletStick;-><init>(I)V */
} // .end method
public static com.wiyun.engine.utils.VerletStick make ( com.wiyun.engine.utils.VerletPoint p0, com.wiyun.engine.utils.VerletPoint p1 ) {
/* .locals 1 */
/* .param p0, "a" # Lcom/wiyun/engine/utils/VerletPoint; */
/* .param p1, "b" # Lcom/wiyun/engine/utils/VerletPoint; */
/* .prologue */
/* .line 15 */
/* new-instance v0, Lcom/wiyun/engine/utils/VerletStick; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/utils/VerletStick;-><init>(Lcom/wiyun/engine/utils/VerletPoint;Lcom/wiyun/engine/utils/VerletPoint;)V */
} // .end method
private native Integer nativeGetPointA ( ) {
} // .end method
private native Integer nativeGetPointB ( ) {
} // .end method
private native void nativeInit ( com.wiyun.engine.utils.VerletPoint p0, com.wiyun.engine.utils.VerletPoint p1 ) {
} // .end method
/* # virtual methods */
public native void contract ( Boolean p0 ) {
} // .end method
public native Float getCurrentLength ( ) {
} // .end method
public native Float getLength ( ) {
} // .end method
public com.wiyun.engine.utils.VerletPoint getPointA ( ) {
/* .locals 1 */
/* .prologue */
/* .line 59 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/utils/VerletStick;->nativeGetPointA()I */
com.wiyun.engine.utils.VerletPoint .from ( v0 );
} // .end method
public com.wiyun.engine.utils.VerletPoint getPointB ( ) {
/* .locals 1 */
/* .prologue */
/* .line 76 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/utils/VerletStick;->nativeGetPointB()I */
com.wiyun.engine.utils.VerletPoint .from ( v0 );
} // .end method
