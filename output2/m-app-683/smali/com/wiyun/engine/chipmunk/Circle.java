public class com.wiyun.engine.chipmunk.Circle extends com.wiyun.engine.chipmunk.Shape {
	 /* .source "Circle.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.chipmunk.Circle ( ) {
		 /* .locals 0 */
		 /* .param p1, "body" # Lcom/wiyun/engine/chipmunk/Body; */
		 /* .param p2, "radius" # F */
		 /* .param p3, "centerX" # F */
		 /* .param p4, "centerY" # F */
		 /* .prologue */
		 /* .line 42 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/chipmunk/Shape;-><init>(Lcom/wiyun/engine/chipmunk/Body;)V */
		 /* .line 43 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Lcom/wiyun/engine/chipmunk/Circle;->init(Lcom/wiyun/engine/chipmunk/Body;FFF)V */
		 /* .line 44 */
		 return;
	 } // .end method
	 private native void init ( com.wiyun.engine.chipmunk.Body p0, Float p1, Float p2, Float p3 ) {
	 } // .end method
	 public static com.wiyun.engine.chipmunk.Circle make ( com.wiyun.engine.chipmunk.Body p0, Float p1 ) {
		 /* .locals 1 */
		 /* .param p0, "body" # Lcom/wiyun/engine/chipmunk/Body; */
		 /* .param p1, "radius" # F */
		 /* .prologue */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 17 */
		 com.wiyun.engine.chipmunk.Circle .make ( p0,p1,v0,v0 );
	 } // .end method
	 public static com.wiyun.engine.chipmunk.Circle make ( com.wiyun.engine.chipmunk.Body p0, Float p1, Float p2, Float p3 ) {
		 /* .locals 1 */
		 /* .param p0, "body" # Lcom/wiyun/engine/chipmunk/Body; */
		 /* .param p1, "radius" # F */
		 /* .param p2, "centerX" # F */
		 /* .param p3, "centerY" # F */
		 /* .prologue */
		 /* .line 30 */
		 /* new-instance v0, Lcom/wiyun/engine/chipmunk/Circle; */
		 /* invoke-direct {v0, p0, p1, p2, p3}, Lcom/wiyun/engine/chipmunk/Circle;-><init>(Lcom/wiyun/engine/chipmunk/Body;FFF)V */
	 } // .end method
	 /* # virtual methods */
	 public com.wiyun.engine.types.WYPoint getOffset ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 52 */
		 v0 = 		 (( com.wiyun.engine.chipmunk.Circle ) p0 ).getOffsetX ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/chipmunk/Circle;->getOffsetX()F
		 v1 = 		 (( com.wiyun.engine.chipmunk.Circle ) p0 ).getOffsetY ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/chipmunk/Circle;->getOffsetY()F
		 com.wiyun.engine.types.WYPoint .make ( v0,v1 );
	 } // .end method
	 public native Float getOffsetX ( ) {
	 } // .end method
	 public native Float getOffsetY ( ) {
	 } // .end method
	 public native Float getRadius ( ) {
	 } // .end method
	 public native void setOffset ( Float p0, Float p1 ) {
	 } // .end method
	 public native void setRadius ( Float p0 ) {
	 } // .end method
