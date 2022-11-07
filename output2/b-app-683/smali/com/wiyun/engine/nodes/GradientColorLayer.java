public class com.wiyun.engine.nodes.GradientColorLayer extends com.wiyun.engine.nodes.Layer implements com.wiyun.engine.nodes.Node$ISizable {
	 /* .source "GradientColorLayer.java" */
	 /* # interfaces */
	 /* # direct methods */
	 protected com.wiyun.engine.nodes.GradientColorLayer ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 53 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Layer;-><init>(I)V */
		 /* .line 54 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.GradientColorLayer ( ) {
		 /* .locals 0 */
		 /* .param p1, "fromColor" # Lcom/wiyun/engine/types/WYColor4B; */
		 /* .param p2, "toColor" # Lcom/wiyun/engine/types/WYColor4B; */
		 /* .param p3, "degree" # I */
		 /* .prologue */
		 /* .line 36 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Layer;-><init>()V */
		 /* .line 38 */
		 /* invoke-direct {p0, p1, p2, p3}, Lcom/wiyun/engine/nodes/GradientColorLayer;->nativeInit(Lcom/wiyun/engine/types/WYColor4B;Lcom/wiyun/engine/types/WYColor4B;I)V */
		 /* .line 39 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.GradientColorLayer from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 49 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/GradientColorLayer; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/GradientColorLayer;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.Layer from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.nodes.GradientColorLayer .from ( p0 );
} // .end method
public static com.wiyun.engine.nodes.GradientColorLayer make ( com.wiyun.engine.types.WYColor4B p0, com.wiyun.engine.types.WYColor4B p1, Integer p2 ) {
/* .locals 1 */
/* .param p0, "fromColor" # Lcom/wiyun/engine/types/WYColor4B; */
/* .param p1, "toColor" # Lcom/wiyun/engine/types/WYColor4B; */
/* .param p2, "degree" # I */
/* .prologue */
/* .line 23 */
/* new-instance v0, Lcom/wiyun/engine/nodes/GradientColorLayer; */
/* invoke-direct {v0, p0, p1, p2}, Lcom/wiyun/engine/nodes/GradientColorLayer;-><init>(Lcom/wiyun/engine/types/WYColor4B;Lcom/wiyun/engine/types/WYColor4B;I)V */
} // .end method
private native void nativeInit ( com.wiyun.engine.types.WYColor4B p0, com.wiyun.engine.types.WYColor4B p1, Integer p2 ) {
} // .end method
/* # virtual methods */
protected void doNativeInit ( ) {
/* .locals 0 */
/* .prologue */
/* .line 61 */
return;
} // .end method
public native Integer getDegree ( ) {
} // .end method
public native void getFromColor ( com.wiyun.engine.types.WYColor3B p0 ) {
} // .end method
public native void getToColor ( com.wiyun.engine.types.WYColor3B p0 ) {
} // .end method
public native void setDegree ( Integer p0 ) {
} // .end method
public native void setFromColor ( Integer p0, Integer p1, Integer p2 ) {
} // .end method
public native void setToColor ( Integer p0, Integer p1, Integer p2 ) {
} // .end method
