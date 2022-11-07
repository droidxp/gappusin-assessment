public class com.wiyun.engine.utils.VerletPoint extends com.wiyun.engine.BaseWYObject {
	 /* .source "VerletPoint.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.utils.VerletPoint ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 21 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 /* .line 22 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/utils/VerletPoint;->nativeInit()V */
		 /* .line 23 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.utils.VerletPoint ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 26 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseWYObject;-><init>(I)V */
		 /* .line 27 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.utils.VerletPoint from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 18 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/utils/VerletPoint; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/utils/VerletPoint;-><init>(I)V */
} // .end method
public static com.wiyun.engine.utils.VerletPoint make ( ) {
/* .locals 1 */
/* .prologue */
/* .line 14 */
/* new-instance v0, Lcom/wiyun/engine/utils/VerletPoint; */
/* invoke-direct {v0}, Lcom/wiyun/engine/utils/VerletPoint;-><init>()V */
} // .end method
private native Integer nativeCopy ( ) {
} // .end method
private native void nativeInit ( ) {
} // .end method
/* # virtual methods */
public native void applyGravity ( Float p0 ) {
} // .end method
public native void attenuate ( Float p0 ) {
} // .end method
public com.wiyun.engine.utils.VerletPoint copy ( ) {
/* .locals 1 */
/* .prologue */
/* .line 145 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/utils/VerletPoint;->nativeCopy()I */
com.wiyun.engine.utils.VerletPoint .from ( v0 );
} // .end method
public native Float getX ( ) {
} // .end method
public native Float getY ( ) {
} // .end method
public native void setPosition ( Float p0, Float p1 ) {
} // .end method
public native void setX ( Float p0 ) {
} // .end method
public native void setY ( Float p0 ) {
} // .end method
public native void update ( ) {
} // .end method
