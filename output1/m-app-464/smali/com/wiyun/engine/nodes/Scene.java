public class com.wiyun.engine.nodes.Scene extends com.wiyun.engine.nodes.Node {
	 /* # direct methods */
	 public com.wiyun.engine.nodes.Scene ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;-><init>()V */
		 /* iget v0, p0, Lcom/wiyun/engine/nodes/Scene;->mPointer:I */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 int v0 = 1; // const/4 v0, 0x1
			 (( com.wiyun.engine.nodes.Scene ) p0 ).setKeyEnabled ( v0 ); // invoke-virtual {p0, v0}, Lcom/wiyun/engine/nodes/Scene;->setKeyEnabled(Z)V
		 } // :cond_0
		 return;
	 } // .end method
	 public com.wiyun.engine.nodes.Scene ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Node;-><init>(I)V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.Node from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 com.wiyun.engine.nodes.Scene .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.nodes.Scene from ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/Scene; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/Scene;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.Scene make ( ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/nodes/Scene; */
/* invoke-direct {v0}, Lcom/wiyun/engine/nodes/Scene;-><init>()V */
} // .end method
private native void nativeInit ( ) {
} // .end method
/* # virtual methods */
protected void doNativeInit ( ) {
/* .locals 0 */
/* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Scene;->nativeInit()V */
return;
} // .end method
protected Boolean onBackButton ( ) {
/* .locals 1 */
com.wiyun.engine.nodes.Director .getInstance ( );
(( com.wiyun.engine.nodes.Director ) v0 ).popScene ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->popScene()V
int v0 = 1; // const/4 v0, 0x1
} // .end method
