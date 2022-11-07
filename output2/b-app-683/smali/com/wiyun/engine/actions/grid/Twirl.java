public class com.wiyun.engine.actions.grid.Twirl extends com.wiyun.engine.actions.grid.Grid3DAction {
	 /* .source "Twirl.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.grid.Twirl ( ) {
		 /* .locals 11 */
		 /* .param p1, "duration" # F */
		 /* .param p2, "gridSize" # Lcom/wiyun/engine/types/WYGridSize; */
		 /* .param p3, "centerX" # F */
		 /* .param p4, "centerY" # F */
		 /* .param p5, "deltaX" # F */
		 /* .param p6, "deltaY" # F */
		 /* .param p7, "amplitude" # F */
		 /* .param p8, "deltaAmplitude" # F */
		 /* .param p9, "twirls" # F */
		 /* .prologue */
		 /* .line 71 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/grid/Grid3DAction;-><init>()V */
		 /* .line 73 */
		 /* iget v2, p2, Lcom/wiyun/engine/types/WYGridSize;->x:I */
		 /* iget v3, p2, Lcom/wiyun/engine/types/WYGridSize;->y:I */
		 /* move-object v0, p0 */
		 /* move v1, p1 */
		 /* move v4, p3 */
		 /* move v5, p4 */
		 /* move/from16 v6, p5 */
		 /* move/from16 v7, p6 */
		 /* move/from16 v8, p7 */
		 /* move/from16 v9, p8 */
		 /* move/from16 v10, p9 */
		 /* invoke-direct/range {v0 ..v10}, Lcom/wiyun/engine/actions/grid/Twirl;->nativeInit(FIIFFFFFFF)V */
		 /* .line 74 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.grid.Twirl ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 87 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/grid/Grid3DAction;-><init>(I)V */
		 /* .line 88 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.actions.grid.Twirl .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.grid.Twirl from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 83 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/grid/Twirl; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/grid/Twirl;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.grid.Twirl make ( Float p0, com.wiyun.engine.types.WYGridSize p1, Float p2, Float p3, Float p4, Float p5 ) {
/* .locals 9 */
/* .param p0, "duration" # F */
/* .param p1, "gridSize" # Lcom/wiyun/engine/types/WYGridSize; */
/* .param p2, "centerX" # F */
/* .param p3, "centerY" # F */
/* .param p4, "amplitude" # F */
/* .param p5, "twirls" # F */
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
/* .line 36 */
/* move v0, p0 */
/* move-object v1, p1 */
/* move v2, p2 */
/* move v3, p3 */
/* move v5, v4 */
/* move v6, p4 */
/* move v7, v4 */
/* move v8, p5 */
/* invoke-static/range {v0 ..v8}, Lcom/wiyun/engine/actions/grid/Twirl;->make(FLcom/wiyun/engine/types/WYGridSize;FFFFFFF)Lcom/wiyun/engine/actions/grid/Twirl; */
} // .end method
public static com.wiyun.engine.actions.grid.Twirl make ( Float p0, com.wiyun.engine.types.WYGridSize p1, Float p2, Float p3, Float p4, Float p5, Float p6, Float p7, Float p8 ) {
/* .locals 10 */
/* .param p0, "duration" # F */
/* .param p1, "gridSize" # Lcom/wiyun/engine/types/WYGridSize; */
/* .param p2, "centerX" # F */
/* .param p3, "centerY" # F */
/* .param p4, "deltaX" # F */
/* .param p5, "deltaY" # F */
/* .param p6, "amplitude" # F */
/* .param p7, "deltaAmplitude" # F */
/* .param p8, "twirls" # F */
/* .prologue */
/* .line 55 */
/* new-instance v0, Lcom/wiyun/engine/actions/grid/Twirl; */
/* move v1, p0 */
/* move-object v2, p1 */
/* move v3, p2 */
/* move v4, p3 */
/* move v5, p4 */
/* move v6, p5 */
/* move/from16 v7, p6 */
/* move/from16 v8, p7 */
/* move/from16 v9, p8 */
/* invoke-direct/range {v0 ..v9}, Lcom/wiyun/engine/actions/grid/Twirl;-><init>(FLcom/wiyun/engine/types/WYGridSize;FFFFFFF)V */
} // .end method
public static com.wiyun.engine.actions.grid.Twirl make ( Float p0, com.wiyun.engine.types.WYGridSize p1, com.wiyun.engine.types.WYPoint p2, Float p3, Float p4 ) {
/* .locals 6 */
/* .param p0, "duration" # F */
/* .param p1, "gridSize" # Lcom/wiyun/engine/types/WYGridSize; */
/* .param p2, "pos" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p3, "amplitude" # F */
/* .param p4, "twirls" # F */
/* .prologue */
/* .line 21 */
/* iget v2, p2, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v3, p2, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* move v0, p0 */
/* move-object v1, p1 */
/* move v4, p3 */
/* move v5, p4 */
/* invoke-static/range {v0 ..v5}, Lcom/wiyun/engine/actions/grid/Twirl;->make(FLcom/wiyun/engine/types/WYGridSize;FFFF)Lcom/wiyun/engine/actions/grid/Twirl; */
} // .end method
private native void nativeInit ( Float p0, Integer p1, Integer p2, Float p3, Float p4, Float p5, Float p6, Float p7, Float p8, Float p9 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.grid.Grid3DAction copy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 95 */
/* new-instance v0, Lcom/wiyun/engine/actions/grid/Twirl; */
v1 = (( com.wiyun.engine.actions.grid.Twirl ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/Twirl;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/grid/Twirl;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.grid.Twirl ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/Twirl;->copy()Lcom/wiyun/engine/actions/grid/Grid3DAction;
} // .end method
