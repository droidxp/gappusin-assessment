public class com.wiyun.engine.nodes.CharMap extends com.wiyun.engine.BaseWYObject {
	 /* .source "CharMap.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.nodes.CharMap ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 27 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 /* .line 28 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/CharMap;->nativeInit()V */
		 /* .line 29 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.CharMap ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 34 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseWYObject;-><init>(I)V */
		 /* .line 35 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.CharMap from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 20 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/CharMap; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/CharMap;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.CharMap make ( ) {
/* .locals 1 */
/* .prologue */
/* .line 24 */
/* new-instance v0, Lcom/wiyun/engine/nodes/CharMap; */
/* invoke-direct {v0}, Lcom/wiyun/engine/nodes/CharMap;-><init>()V */
} // .end method
private native void nativeInit ( ) {
} // .end method
/* # virtual methods */
public native Float getSpaceWidth ( ) {
} // .end method
public native Integer getTabSize ( ) {
} // .end method
public native void mapChar ( com.wiyun.engine.types.WYRect p0, Integer p1 ) {
} // .end method
public native void mapChar ( com.wiyun.engine.types.WYRect p0, Integer p1, Float p2, Float p3 ) {
} // .end method
public native void mapChar ( java.lang.String p0, Integer p1 ) {
} // .end method
public native void mapChar ( java.lang.String p0, Integer p1, Float p2, Float p3 ) {
} // .end method
public native void mapChar ( java.lang.String p0, java.lang.String p1, Integer p2 ) {
} // .end method
public native void mapChar ( java.lang.String p0, java.lang.String p1, Integer p2, Float p3, Float p4 ) {
} // .end method
public native void setSpaceWidth ( Float p0 ) {
} // .end method
public native void setTabSize ( Integer p0 ) {
} // .end method
