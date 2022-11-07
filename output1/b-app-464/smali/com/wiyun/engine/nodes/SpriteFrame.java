public class com.wiyun.engine.nodes.SpriteFrame extends com.wiyun.engine.nodes.Frame {
	 /* # direct methods */
	 private com.wiyun.engine.nodes.SpriteFrame ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Frame;-><init>()V */
		 /* invoke-direct/range {p0 ..p6}, Lcom/wiyun/engine/nodes/SpriteFrame;->nativeInit(FLcom/wiyun/engine/opengl/Texture2D;Lcom/wiyun/engine/types/WYRect;Lcom/wiyun/engine/types/WYPoint;Lcom/wiyun/engine/types/WYSize;Z)V */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.SpriteFrame ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Frame;-><init>(I)V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.SpriteFrame from ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/SpriteFrame; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/SpriteFrame;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.SpriteFrame make ( Float p0, com.wiyun.engine.opengl.Texture2D p1 ) {
/* .locals 3 */
int v2 = 0; // const/4 v2, 0x0
v0 = (( com.wiyun.engine.opengl.Texture2D ) p1 ).getWidth ( ); // invoke-virtual {p1}, Lcom/wiyun/engine/opengl/Texture2D;->getWidth()F
v1 = (( com.wiyun.engine.opengl.Texture2D ) p1 ).getHeight ( ); // invoke-virtual {p1}, Lcom/wiyun/engine/opengl/Texture2D;->getHeight()F
com.wiyun.engine.types.WYRect .make ( v2,v2,v0,v1 );
com.wiyun.engine.nodes.SpriteFrame .make ( p0,p1,v0 );
} // .end method
public static com.wiyun.engine.nodes.SpriteFrame make ( Float p0, com.wiyun.engine.opengl.Texture2D p1, com.wiyun.engine.types.WYRect p2 ) {
/* .locals 2 */
com.wiyun.engine.types.WYPoint .makeZero ( );
v1 = this.size;
com.wiyun.engine.nodes.SpriteFrame .make ( p0,p1,p2,v0,v1 );
} // .end method
public static com.wiyun.engine.nodes.SpriteFrame make ( Float p0, com.wiyun.engine.opengl.Texture2D p1, com.wiyun.engine.types.WYRect p2, com.wiyun.engine.types.WYPoint p3, com.wiyun.engine.types.WYSize p4 ) {
/* .locals 7 */
/* new-instance v0, Lcom/wiyun/engine/nodes/SpriteFrame; */
int v6 = 0; // const/4 v6, 0x0
/* move v1, p0 */
/* move-object v2, p1 */
/* move-object v3, p2 */
/* move-object v4, p3 */
/* move-object v5, p4 */
/* invoke-direct/range {v0 ..v6}, Lcom/wiyun/engine/nodes/SpriteFrame;-><init>(FLcom/wiyun/engine/opengl/Texture2D;Lcom/wiyun/engine/types/WYRect;Lcom/wiyun/engine/types/WYPoint;Lcom/wiyun/engine/types/WYSize;Z)V */
} // .end method
public static com.wiyun.engine.nodes.SpriteFrame make ( Float p0, com.wiyun.engine.opengl.Texture2D p1, com.wiyun.engine.types.WYRect p2, com.wiyun.engine.types.WYPoint p3, com.wiyun.engine.types.WYSize p4, Boolean p5 ) {
/* .locals 7 */
/* new-instance v0, Lcom/wiyun/engine/nodes/SpriteFrame; */
/* move v1, p0 */
/* move-object v2, p1 */
/* move-object v3, p2 */
/* move-object v4, p3 */
/* move-object v5, p4 */
/* move v6, p5 */
/* invoke-direct/range {v0 ..v6}, Lcom/wiyun/engine/nodes/SpriteFrame;-><init>(FLcom/wiyun/engine/opengl/Texture2D;Lcom/wiyun/engine/types/WYRect;Lcom/wiyun/engine/types/WYPoint;Lcom/wiyun/engine/types/WYSize;Z)V */
} // .end method
public static com.wiyun.engine.nodes.SpriteFrame make ( Float p0, com.wiyun.engine.types.WYRect p1 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.nodes.SpriteFrame .make ( p0,v0,p1 );
} // .end method
private native void nativeInit ( Float p0, com.wiyun.engine.opengl.Texture2D p1, com.wiyun.engine.types.WYRect p2, com.wiyun.engine.types.WYPoint p3, com.wiyun.engine.types.WYSize p4, Boolean p5 ) {
} // .end method
