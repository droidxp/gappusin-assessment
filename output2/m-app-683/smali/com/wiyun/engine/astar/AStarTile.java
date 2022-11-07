public class com.wiyun.engine.astar.AStarTile extends com.wiyun.engine.BaseWYObject {
	 /* .source "AStarTile.java" */
	 /* # static fields */
	 public static final Integer TILE_BLOCK;
	 public static final Integer TILE_FREE;
	 /* # direct methods */
	 protected com.wiyun.engine.astar.AStarTile ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 27 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseWYObject;-><init>(I)V */
		 /* .line 28 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.astar.AStarTile ( ) {
		 /* .locals 0 */
		 /* .param p1, "type" # I */
		 /* .param p2, "x" # I */
		 /* .param p3, "y" # I */
		 /* .prologue */
		 /* .line 18 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 /* .line 19 */
		 (( com.wiyun.engine.astar.AStarTile ) p0 ).doNativeInit ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lcom/wiyun/engine/astar/AStarTile;->doNativeInit(III)V
		 /* .line 20 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.astar.AStarTile from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 23 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/astar/AStarTile; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/astar/AStarTile;-><init>(I)V */
} // .end method
public static com.wiyun.engine.astar.AStarTile make ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* .param p0, "type" # I */
/* .param p1, "x" # I */
/* .param p2, "y" # I */
/* .prologue */
/* .line 15 */
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
/* .param p1, "type" # I */
/* .param p2, "x" # I */
/* .param p3, "y" # I */
/* .prologue */
/* .line 31 */
/* invoke-direct {p0, p1, p2, p3}, Lcom/wiyun/engine/astar/AStarTile;->nativeInit(III)V */
/* .line 32 */
return;
} // .end method
public native Integer getChildCount ( ) {
} // .end method
public java.util.ArrayList getChildren ( ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/ArrayList", */
/* "<", */
/* "Lcom/wiyun/engine/astar/AStarTile;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 105 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 106 */
/* .local v0, "children":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/wiyun/engine/astar/AStarTile;>;" */
v3 = (( com.wiyun.engine.astar.AStarTile ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/astar/AStarTile;->getChildCount()I
/* new-array v2, v3, [I */
/* .line 107 */
/* .local v2, "pointers":[I */
/* invoke-direct {p0, v2}, Lcom/wiyun/engine/astar/AStarTile;->nativeGetChildren([I)V */
/* .line 108 */
/* array-length v4, v2 */
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-lt v3, v4, :cond_0 */
/* .line 110 */
/* .line 108 */
} // :cond_0
/* aget v1, v2, v3 */
/* .line 109 */
/* .local v1, "pointer":I */
/* new-instance v5, Lcom/wiyun/engine/astar/AStarTile; */
/* invoke-direct {v5, v1}, Lcom/wiyun/engine/astar/AStarTile;-><init>(I)V */
(( java.util.ArrayList ) v0 ).add ( v5 ); // invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 108 */
/* add-int/lit8 v3, v3, 0x1 */
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
