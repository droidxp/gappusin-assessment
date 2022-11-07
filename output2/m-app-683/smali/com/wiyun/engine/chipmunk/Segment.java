public class com.wiyun.engine.chipmunk.Segment extends com.wiyun.engine.chipmunk.Shape {
	 /* .source "Segment.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.chipmunk.Segment ( ) {
		 /* .locals 0 */
		 /* .param p1, "body" # Lcom/wiyun/engine/chipmunk/Body; */
		 /* .param p2, "startX" # F */
		 /* .param p3, "startY" # F */
		 /* .param p4, "endX" # F */
		 /* .param p5, "endY" # F */
		 /* .param p6, "thickness" # F */
		 /* .prologue */
		 /* .line 48 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/chipmunk/Shape;-><init>(Lcom/wiyun/engine/chipmunk/Body;)V */
		 /* .line 49 */
		 /* invoke-direct/range {p0 ..p6}, Lcom/wiyun/engine/chipmunk/Segment;->init(Lcom/wiyun/engine/chipmunk/Body;FFFFF)V */
		 /* .line 50 */
		 return;
	 } // .end method
	 private native void init ( com.wiyun.engine.chipmunk.Body p0, Float p1, Float p2, Float p3, Float p4, Float p5 ) {
	 } // .end method
	 public static com.wiyun.engine.chipmunk.Segment make ( com.wiyun.engine.chipmunk.Body p0, Float p1, Float p2, Float p3, Float p4, Float p5 ) {
		 /* .locals 7 */
		 /* .param p0, "body" # Lcom/wiyun/engine/chipmunk/Body; */
		 /* .param p1, "startX" # F */
		 /* .param p2, "startY" # F */
		 /* .param p3, "endX" # F */
		 /* .param p4, "endY" # F */
		 /* .param p5, "thickness" # F */
		 /* .prologue */
		 /* .line 34 */
		 /* new-instance v0, Lcom/wiyun/engine/chipmunk/Segment; */
		 /* move-object v1, p0 */
		 /* move v2, p1 */
		 /* move v3, p2 */
		 /* move v4, p3 */
		 /* move v5, p4 */
		 /* move v6, p5 */
		 /* invoke-direct/range {v0 ..v6}, Lcom/wiyun/engine/chipmunk/Segment;-><init>(Lcom/wiyun/engine/chipmunk/Body;FFFFF)V */
	 } // .end method
	 public static com.wiyun.engine.chipmunk.Segment make ( com.wiyun.engine.chipmunk.Body p0, com.wiyun.engine.types.WYPoint p1, com.wiyun.engine.types.WYPoint p2, Float p3 ) {
		 /* .locals 6 */
		 /* .param p0, "body" # Lcom/wiyun/engine/chipmunk/Body; */
		 /* .param p1, "start" # Lcom/wiyun/engine/types/WYPoint; */
		 /* .param p2, "end" # Lcom/wiyun/engine/types/WYPoint; */
		 /* .param p3, "thickness" # F */
		 /* .prologue */
		 /* .line 19 */
		 /* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 /* iget v2, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
		 /* iget v3, p2, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 /* iget v4, p2, Lcom/wiyun/engine/types/WYPoint;->y:F */
		 /* move-object v0, p0 */
		 /* move v5, p3 */
		 /* invoke-static/range {v0 ..v5}, Lcom/wiyun/engine/chipmunk/Segment;->make(Lcom/wiyun/engine/chipmunk/Body;FFFFF)Lcom/wiyun/engine/chipmunk/Segment; */
	 } // .end method
	 /* # virtual methods */
	 public native void getEndpoints ( com.wiyun.engine.types.WYPoint[] p0 ) {
	 } // .end method
	 public native void getNormal ( com.wiyun.engine.types.WYPoint p0 ) {
	 } // .end method
	 public native Float getThickness ( ) {
	 } // .end method
	 public native void getTransformedEndpoints ( com.wiyun.engine.types.WYPoint[] p0 ) {
	 } // .end method
	 public native void getTransformedNormal ( com.wiyun.engine.types.WYPoint p0 ) {
	 } // .end method
	 public native void setEndpoints ( Float p0, Float p1, Float p2, Float p3 ) {
	 } // .end method
	 public void setEndpoints ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1 ) {
		 /* .locals 4 */
		 /* .param p1, "a" # Lcom/wiyun/engine/types/WYPoint; */
		 /* .param p2, "b" # Lcom/wiyun/engine/types/WYPoint; */
		 /* .prologue */
		 /* .line 71 */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 /* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
		 /* iget v2, p2, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 /* iget v3, p2, Lcom/wiyun/engine/types/WYPoint;->y:F */
		 (( com.wiyun.engine.chipmunk.Segment ) p0 ).setEndpoints ( v0, v1, v2, v3 ); // invoke-virtual {p0, v0, v1, v2, v3}, Lcom/wiyun/engine/chipmunk/Segment;->setEndpoints(FFFF)V
		 /* .line 72 */
		 return;
	 } // .end method
	 public native void setThickness ( Float p0 ) {
	 } // .end method
