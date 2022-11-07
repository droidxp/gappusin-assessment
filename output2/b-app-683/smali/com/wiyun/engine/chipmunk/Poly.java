public class com.wiyun.engine.chipmunk.Poly extends com.wiyun.engine.chipmunk.Shape {
	 /* .source "Poly.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.chipmunk.Poly ( ) {
		 /* .locals 0 */
		 /* .param p1, "body" # Lcom/wiyun/engine/chipmunk/Body; */
		 /* .param p2, "verts" # [Lcom/wiyun/engine/types/WYPoint; */
		 /* .param p3, "offset" # Lcom/wiyun/engine/types/WYPoint; */
		 /* .prologue */
		 /* .line 51 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/chipmunk/Shape;-><init>(Lcom/wiyun/engine/chipmunk/Body;)V */
		 /* .line 52 */
		 /* invoke-direct {p0, p1, p2, p3}, Lcom/wiyun/engine/chipmunk/Poly;->init(Lcom/wiyun/engine/chipmunk/Body;[Lcom/wiyun/engine/types/WYPoint;Lcom/wiyun/engine/types/WYPoint;)V */
		 /* .line 53 */
		 return;
	 } // .end method
	 private native void init ( com.wiyun.engine.chipmunk.Body p0, com.wiyun.engine.types.WYPoint[] p1, com.wiyun.engine.types.WYPoint p2 ) {
	 } // .end method
	 public static com.wiyun.engine.chipmunk.Poly make ( com.wiyun.engine.chipmunk.Body p0, com.wiyun.engine.types.WYPoint[] p1, com.wiyun.engine.types.WYPoint p2 ) {
		 /* .locals 1 */
		 /* .param p0, "body" # Lcom/wiyun/engine/chipmunk/Body; */
		 /* .param p1, "verts" # [Lcom/wiyun/engine/types/WYPoint; */
		 /* .param p2, "offset" # Lcom/wiyun/engine/types/WYPoint; */
		 /* .prologue */
		 /* .line 18 */
		 /* new-instance v0, Lcom/wiyun/engine/chipmunk/Poly; */
		 /* invoke-direct {v0, p0, p1, p2}, Lcom/wiyun/engine/chipmunk/Poly;-><init>(Lcom/wiyun/engine/chipmunk/Body;[Lcom/wiyun/engine/types/WYPoint;Lcom/wiyun/engine/types/WYPoint;)V */
	 } // .end method
	 public static com.wiyun.engine.chipmunk.Poly makeBox ( com.wiyun.engine.chipmunk.Body p0, Float p1, Float p2 ) {
		 /* .locals 6 */
		 /* .param p0, "body" # Lcom/wiyun/engine/chipmunk/Body; */
		 /* .param p1, "width" # F */
		 /* .param p2, "height" # F */
		 /* .prologue */
		 /* const/high16 v3, 0x40000000 # 2.0f */
		 /* .line 30 */
		 /* div-float v1, p1, v3 */
		 /* .line 31 */
		 /* .local v1, "hw":F */
		 /* div-float v0, p2, v3 */
		 /* .line 33 */
		 /* .local v0, "hh":F */
		 int v3 = 4; // const/4 v3, 0x4
		 /* new-array v2, v3, [Lcom/wiyun/engine/types/WYPoint; */
		 int v3 = 0; // const/4 v3, 0x0
		 /* .line 34 */
		 /* neg-float v4, v1 */
		 /* neg-float v5, v0 */
		 com.wiyun.engine.types.WYPoint .make ( v4,v5 );
		 /* aput-object v4, v2, v3 */
		 int v3 = 1; // const/4 v3, 0x1
		 /* .line 35 */
		 /* neg-float v4, v1 */
		 com.wiyun.engine.types.WYPoint .make ( v4,v0 );
		 /* aput-object v4, v2, v3 */
		 int v3 = 2; // const/4 v3, 0x2
		 /* .line 36 */
		 com.wiyun.engine.types.WYPoint .make ( v1,v0 );
		 /* aput-object v4, v2, v3 */
		 int v3 = 3; // const/4 v3, 0x3
		 /* .line 37 */
		 /* neg-float v4, v0 */
		 com.wiyun.engine.types.WYPoint .make ( v1,v4 );
		 /* aput-object v4, v2, v3 */
		 /* .line 40 */
		 /* .local v2, "verts":[Lcom/wiyun/engine/types/WYPoint; */
		 com.wiyun.engine.types.WYPoint .makeZero ( );
		 com.wiyun.engine.chipmunk.Poly .make ( p0,v2,v3 );
	 } // .end method
	 /* # virtual methods */
	 public com.wiyun.engine.types.WYPoint getOffset ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 106 */
		 v0 = 		 (( com.wiyun.engine.chipmunk.Poly ) p0 ).getOffsetX ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/chipmunk/Poly;->getOffsetX()F
		 v1 = 		 (( com.wiyun.engine.chipmunk.Poly ) p0 ).getOffsetY ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/chipmunk/Poly;->getOffsetY()F
		 com.wiyun.engine.types.WYPoint .make ( v0,v1 );
	 } // .end method
	 public native Float getOffsetX ( ) {
	 } // .end method
	 public native Float getOffsetY ( ) {
	 } // .end method
	 public native Float getOriginHeight ( ) {
	 } // .end method
	 public native Float getOriginWidth ( ) {
	 } // .end method
	 public native Integer getVertexCount ( ) {
	 } // .end method
	 public native void getVertices ( com.wiyun.engine.types.WYPoint[] p0 ) {
	 } // .end method
	 public native void setVertices ( com.wiyun.engine.types.WYPoint[] p0, com.wiyun.engine.types.WYPoint p1 ) {
	 } // .end method
