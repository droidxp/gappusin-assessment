public class com.wiyun.engine.nodes.DotPageIndicator extends com.wiyun.engine.nodes.PageIndicator {
	 /* # direct methods */
	 protected com.wiyun.engine.nodes.DotPageIndicator ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/PageIndicator;-><init>()V */
		 return;
	 } // .end method
	 private com.wiyun.engine.nodes.DotPageIndicator ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/PageIndicator;-><init>(I)V */
		 return;
	 } // .end method
	 private com.wiyun.engine.nodes.DotPageIndicator ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/PageIndicator;-><init>()V */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Lcom/wiyun/engine/nodes/DotPageIndicator;->nativeInit(Lcom/wiyun/engine/opengl/Texture2D;Lcom/wiyun/engine/types/WYRect;Lcom/wiyun/engine/opengl/Texture2D;Lcom/wiyun/engine/types/WYRect;)V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.DotPageIndicator from ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/DotPageIndicator; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/DotPageIndicator;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.PageIndicator from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
com.wiyun.engine.nodes.DotPageIndicator .from ( p0 );
} // .end method
public static com.wiyun.engine.nodes.DotPageIndicator make ( com.wiyun.engine.opengl.Texture2D p0, com.wiyun.engine.opengl.Texture2D p1 ) {
/* .locals 5 */
int v4 = 0; // const/4 v4, 0x0
/* new-instance v0, Lcom/wiyun/engine/nodes/DotPageIndicator; */
v1 = (( com.wiyun.engine.opengl.Texture2D ) p0 ).getWidth ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/opengl/Texture2D;->getWidth()F
v2 = (( com.wiyun.engine.opengl.Texture2D ) p0 ).getHeight ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/opengl/Texture2D;->getHeight()F
com.wiyun.engine.types.WYRect .make ( v4,v4,v1,v2 );
v2 = (( com.wiyun.engine.opengl.Texture2D ) p1 ).getWidth ( ); // invoke-virtual {p1}, Lcom/wiyun/engine/opengl/Texture2D;->getWidth()F
v3 = (( com.wiyun.engine.opengl.Texture2D ) p1 ).getHeight ( ); // invoke-virtual {p1}, Lcom/wiyun/engine/opengl/Texture2D;->getHeight()F
com.wiyun.engine.types.WYRect .make ( v4,v4,v2,v3 );
/* invoke-direct {v0, p0, v1, p1, v2}, Lcom/wiyun/engine/nodes/DotPageIndicator;-><init>(Lcom/wiyun/engine/opengl/Texture2D;Lcom/wiyun/engine/types/WYRect;Lcom/wiyun/engine/opengl/Texture2D;Lcom/wiyun/engine/types/WYRect;)V */
} // .end method
public static com.wiyun.engine.nodes.DotPageIndicator make ( com.wiyun.engine.opengl.Texture2D p0, com.wiyun.engine.types.WYRect p1, com.wiyun.engine.opengl.Texture2D p2, com.wiyun.engine.types.WYRect p3 ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/nodes/DotPageIndicator; */
/* invoke-direct {v0, p0, p1, p2, p3}, Lcom/wiyun/engine/nodes/DotPageIndicator;-><init>(Lcom/wiyun/engine/opengl/Texture2D;Lcom/wiyun/engine/types/WYRect;Lcom/wiyun/engine/opengl/Texture2D;Lcom/wiyun/engine/types/WYRect;)V */
} // .end method
private native void nativeInit ( com.wiyun.engine.opengl.Texture2D p0, com.wiyun.engine.types.WYRect p1, com.wiyun.engine.opengl.Texture2D p2, com.wiyun.engine.types.WYRect p3 ) {
} // .end method
