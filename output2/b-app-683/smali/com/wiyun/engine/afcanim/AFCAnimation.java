public class com.wiyun.engine.afcanim.AFCAnimation extends com.wiyun.engine.BaseWYObject {
	 /* .source "AFCAnimation.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.afcanim.AFCAnimation ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 18 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseWYObject;-><init>(I)V */
		 /* .line 19 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.afcanim.AFCAnimation from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 14 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/afcanim/AFCAnimation; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/afcanim/AFCAnimation;-><init>(I)V */
} // .end method
private native Integer nativeGetFrameAt ( Integer p0 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.afcanim.AFCFrame getFrameAt ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "index" # I */
/* .prologue */
/* .line 48 */
v0 = /* invoke-direct {p0, p1}, Lcom/wiyun/engine/afcanim/AFCAnimation;->nativeGetFrameAt(I)I */
com.wiyun.engine.afcanim.AFCFrame .from ( v0 );
} // .end method
public native Integer getFrameCount ( ) {
} // .end method
