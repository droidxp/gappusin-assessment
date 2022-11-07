public class com.wiyun.engine.astar.AStarTile extends com.wiyun.engine.BaseWYObject {
	 /* # static fields */
	 public static final Integer TILE_BLOCK;
	 public static final Integer TILE_FREE;
	 /* # direct methods */
	 protected com.wiyun.engine.astar.AStarTile ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseWYObject;-><init>(I)V */
		 return;
	 } // .end method
	 protected com.wiyun.engine.astar.AStarTile ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 (( com.wiyun.engine.astar.AStarTile ) p0 ).doNativeInit ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lcom/wiyun/engine/astar/AStarTile;->doNativeInit(III)V
		 return;
	 } // .end method
	 public static com.wiyun.engine.astar.AStarTile from ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/astar/AStarTile; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/astar/AStarTile;-><init>(I)V */
} // .end method
public static com.wiyun.engine.astar.AStarTile make ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/astar/AStarTile; */
/* invoke-direct {v0, p0, p1, p2}, Lcom/wiyun/engine/astar/AStarTile;-><init>(III)V */
} // .end method
private native void nativeGetChildren ( Integer[] p0 ) {
} // .end method
private native void nativeInit ( Integer p0, Integer p1, Integer p2 ) {
} // .end method
/* # virtual methods */
protected void doNativeInit ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 0 */
/* invoke-direct {p0, p1, p2, p3}, Lcom/wiyun/engine/astar/AStarTile;->nativeInit(III)V */
return;
} // .end method
public native Integer getChildCount ( ) {
} // .end method
public java.util.ArrayList getChildren ( ) {
/* .locals 6 */
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
v0 = (( com.wiyun.engine.astar.AStarTile ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/astar/AStarTile;->getChildCount()I
/* new-array v2, v0, [I */
/* invoke-direct {p0, v2}, Lcom/wiyun/engine/astar/AStarTile;->nativeGetChildren([I)V */
/* array-length v3, v2 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* if-lt v0, v3, :cond_0 */
} // :cond_0
/* aget v4, v2, v0 */
/* new-instance v5, Lcom/wiyun/engine/astar/AStarTile; */
/* invoke-direct {v5, v4}, Lcom/wiyun/engine/astar/AStarTile;-><init>(I)V */
(( java.util.ArrayList ) v1 ).add ( v5 ); // invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public native final Float getGRate ( ) {
} // .end method
public native final Integer getType ( ) {
} // .end method
public native final Integer getX ( ) {
} // .end method
public native final Integer getY ( ) {
} // .end method
public native final Boolean isBlocked ( ) {
} // .end method
public native final Boolean isFree ( ) {
} // .end method
public native final void pushChild ( com.wiyun.engine.astar.AStarTile p0 ) {
} // .end method
public native final void setGRate ( Float p0 ) {
} // .end method
public native final void setType ( Integer p0 ) {
} // .end method
