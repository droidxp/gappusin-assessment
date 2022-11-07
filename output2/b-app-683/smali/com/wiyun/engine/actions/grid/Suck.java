public class com.wiyun.engine.actions.grid.Suck extends com.wiyun.engine.actions.grid.Grid3DAction {
	 /* .source "Suck.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.grid.Suck ( ) {
		 /* .locals 6 */
		 /* .param p1, "duration" # F */
		 /* .param p2, "gSize" # Lcom/wiyun/engine/types/WYGridSize; */
		 /* .param p3, "suckPos" # Lcom/wiyun/engine/types/WYPoint; */
		 /* .prologue */
		 /* .line 34 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/grid/Grid3DAction;-><init>()V */
		 /* .line 35 */
		 /* iget v2, p2, Lcom/wiyun/engine/types/WYGridSize;->x:I */
		 /* iget v3, p2, Lcom/wiyun/engine/types/WYGridSize;->y:I */
		 /* iget v4, p3, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 /* iget v5, p3, Lcom/wiyun/engine/types/WYPoint;->y:F */
		 /* move-object v0, p0 */
		 /* move v1, p1 */
		 /* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/actions/grid/Suck;->nativeInit(FIIFF)V */
		 /* .line 36 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.grid.Suck ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 49 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/grid/Grid3DAction;-><init>(I)V */
		 /* .line 50 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.actions.grid.Suck .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.grid.Suck from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 45 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/grid/Suck; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/grid/Suck;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.grid.Suck make ( Float p0, com.wiyun.engine.types.WYGridSize p1, com.wiyun.engine.types.WYPoint p2 ) {
/* .locals 1 */
/* .param p0, "duration" # F */
/* .param p1, "gSize" # Lcom/wiyun/engine/types/WYGridSize; */
/* .param p2, "suckPos" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 24 */
/* new-instance v0, Lcom/wiyun/engine/actions/grid/Suck; */
/* invoke-direct {v0, p0, p1, p2}, Lcom/wiyun/engine/actions/grid/Suck;-><init>(FLcom/wiyun/engine/types/WYGridSize;Lcom/wiyun/engine/types/WYPoint;)V */
} // .end method
private native void nativeInit ( Float p0, Integer p1, Integer p2, Float p3, Float p4 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.grid.Grid3DAction copy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 56 */
/* new-instance v0, Lcom/wiyun/engine/actions/grid/Suck; */
v1 = (( com.wiyun.engine.actions.grid.Suck ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/Suck;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/grid/Suck;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.grid.Suck ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/Suck;->copy()Lcom/wiyun/engine/actions/grid/Grid3DAction;
} // .end method
