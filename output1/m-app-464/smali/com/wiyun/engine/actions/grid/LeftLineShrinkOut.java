public class com.wiyun.engine.actions.grid.LeftLineShrinkOut extends com.wiyun.engine.actions.grid.TiledGrid3DAction {
	 /* # direct methods */
	 private com.wiyun.engine.actions.grid.LeftLineShrinkOut ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/grid/TiledGrid3DAction;-><init>()V */
		 /* iget v0, p2, Lcom/wiyun/engine/types/WYGridSize;->x:I */
		 /* iget v1, p2, Lcom/wiyun/engine/types/WYGridSize;->y:I */
		 /* invoke-direct {p0, p1, v0, v1}, Lcom/wiyun/engine/actions/grid/LeftLineShrinkOut;->nativeInit(FII)V */
		 return;
	 } // .end method
	 private com.wiyun.engine.actions.grid.LeftLineShrinkOut ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/grid/TiledGrid3DAction;-><init>(I)V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 com.wiyun.engine.actions.grid.LeftLineShrinkOut .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.grid.LeftLineShrinkOut from ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/grid/LeftLineShrinkOut; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/grid/LeftLineShrinkOut;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.grid.LeftLineShrinkOut make ( Float p0, com.wiyun.engine.types.WYGridSize p1 ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/actions/grid/LeftLineShrinkOut; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/actions/grid/LeftLineShrinkOut;-><init>(FLcom/wiyun/engine/types/WYGridSize;)V */
} // .end method
private native void nativeInit ( Float p0, Integer p1, Integer p2 ) {
} // .end method
/* # virtual methods */
public final com.wiyun.engine.actions.grid.TiledGrid3DAction a ( ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/actions/grid/LeftLineShrinkOut; */
v1 = (( com.wiyun.engine.actions.grid.LeftLineShrinkOut ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/LeftLineShrinkOut;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/grid/LeftLineShrinkOut;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //synthethic
/* .locals 1 */
(( com.wiyun.engine.actions.grid.LeftLineShrinkOut ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/LeftLineShrinkOut;->a()Lcom/wiyun/engine/actions/grid/TiledGrid3DAction;
} // .end method
