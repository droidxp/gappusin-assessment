public class com.wiyun.engine.nodes.Menu extends com.wiyun.engine.nodes.Layer {
	 /* .source "Menu.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.nodes.Menu ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 43 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Layer;-><init>(I)V */
		 /* .line 44 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.Menu ( ) {
		 /* .locals 0 */
		 /* .param p1, "items" # [Lcom/wiyun/engine/nodes/MenuItem; */
		 /* .prologue */
		 /* .line 28 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Layer;-><init>()V */
		 /* .line 29 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Menu;->nativeInit([Lcom/wiyun/engine/nodes/MenuItem;)V */
		 /* .line 30 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.Layer from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.nodes.Menu .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.nodes.Menu from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 39 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/Menu; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/Menu;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.Menu make ( com.wiyun.engine.nodes.MenuItem...p0 ) {
/* .locals 1 */
/* .param p0, "items" # [Lcom/wiyun/engine/nodes/MenuItem; */
/* .prologue */
/* .line 20 */
/* new-instance v0, Lcom/wiyun/engine/nodes/Menu; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/Menu;-><init>([Lcom/wiyun/engine/nodes/MenuItem;)V */
} // .end method
private native void nativeInit ( com.wiyun.engine.nodes.MenuItem...p0 ) {
} // .end method
/* # virtual methods */
public native void alignItemsHorizontally ( ) {
} // .end method
public native void alignItemsHorizontally ( Float p0 ) {
} // .end method
public native void alignItemsInColumns ( Integer[] p0 ) {
} // .end method
public native void alignItemsInColumns ( Integer[] p0, Float p1 ) {
} // .end method
public native void alignItemsInRows ( Integer[] p0 ) {
} // .end method
public native void alignItemsInRows ( Integer[] p0, Float p1 ) {
} // .end method
public native void alignItemsVertically ( ) {
} // .end method
public native void alignItemsVertically ( Float p0 ) {
} // .end method
protected void doNativeInit ( ) {
/* .locals 0 */
/* .prologue */
/* .line 50 */
return;
} // .end method
