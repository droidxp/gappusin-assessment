public class com.wiyun.engine.nodes.ProgressTimer extends com.wiyun.engine.nodes.Node {
	 /* # static fields */
	 public static final Integer HORIZONTAL_BAR_LR;
	 public static final Integer HORIZONTAL_BAR_RL;
	 public static final Integer RADIAL_CCW;
	 public static final Integer RADIAL_CW;
	 public static final Integer VERTICAL_BAR_BT;
	 public static final Integer VERTICAL_BAR_TB;
	 /* # direct methods */
	 protected com.wiyun.engine.nodes.ProgressTimer ( ) {
		 /* .locals 1 */
		 com.wiyun.engine.opengl.Texture2D .make ( p1 );
		 (( com.wiyun.engine.opengl.Texture2D ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/opengl/Texture2D;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
		 /* check-cast v0, Lcom/wiyun/engine/opengl/Texture2D; */
		 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/ProgressTimer;-><init>(Lcom/wiyun/engine/opengl/Texture2D;)V */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.ProgressTimer ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p2}, Lcom/wiyun/engine/nodes/Node;-><init>(I)V */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.ProgressTimer ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;-><init>()V */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/ProgressTimer;->nativeInit(Lcom/wiyun/engine/nodes/Sprite;)V */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.ProgressTimer ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;-><init>()V */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/ProgressTimer;->nativeInit(Lcom/wiyun/engine/opengl/Texture2D;)V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.Node from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 com.wiyun.engine.nodes.ProgressTimer .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.nodes.ProgressTimer from ( Integer p0 ) {
		 /* .locals 2 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/ProgressTimer; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, v1, p0}, Lcom/wiyun/engine/nodes/ProgressTimer;-><init>(II)V */
} // .end method
public static com.wiyun.engine.nodes.ProgressTimer make ( Integer p0 ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/nodes/ProgressTimer; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/ProgressTimer;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.ProgressTimer make ( com.wiyun.engine.nodes.Sprite p0 ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/nodes/ProgressTimer; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/ProgressTimer;-><init>(Lcom/wiyun/engine/nodes/Sprite;)V */
} // .end method
public static com.wiyun.engine.nodes.ProgressTimer make ( com.wiyun.engine.opengl.Texture2D p0 ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/nodes/ProgressTimer; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/ProgressTimer;-><init>(Lcom/wiyun/engine/opengl/Texture2D;)V */
} // .end method
private native void nativeInit ( com.wiyun.engine.nodes.Sprite p0 ) {
} // .end method
private native void nativeInit ( com.wiyun.engine.opengl.Texture2D p0 ) {
} // .end method
/* # virtual methods */
protected void doNativeInit ( ) {
/* .locals 0 */
return;
} // .end method
public native Float getPercentage ( ) {
} // .end method
public native void setPercentage ( Float p0 ) {
} // .end method
public native void setSprite ( com.wiyun.engine.nodes.Sprite p0 ) {
} // .end method
public native void setStyle ( Integer p0 ) {
} // .end method
