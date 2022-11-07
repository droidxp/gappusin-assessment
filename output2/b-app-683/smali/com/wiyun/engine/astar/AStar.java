public class com.wiyun.engine.astar.AStar extends com.wiyun.engine.BaseWYObject {
	 /* .source "AStar.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.astar.AStar ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 29 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseWYObject;-><init>(I)V */
		 /* .line 30 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.astar.AStar ( ) {
		 /* .locals 0 */
		 /* .param p1, "map" # Lcom/wiyun/engine/astar/AStarMap; */
		 /* .prologue */
		 /* .line 20 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 /* .line 21 */
		 (( com.wiyun.engine.astar.AStar ) p0 ).doNativeInit ( p1 ); // invoke-virtual {p0, p1}, Lcom/wiyun/engine/astar/AStar;->doNativeInit(Lcom/wiyun/engine/astar/AStarMap;)V
		 /* .line 22 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.astar.AStar from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 25 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/astar/AStar; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/astar/AStar;-><init>(I)V */
} // .end method
public static com.wiyun.engine.astar.AStar make ( com.wiyun.engine.astar.AStarMap p0 ) {
/* .locals 1 */
/* .param p0, "map" # Lcom/wiyun/engine/astar/AStarMap; */
/* .prologue */
/* .line 14 */
/* new-instance v0, Lcom/wiyun/engine/astar/AStar; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/astar/AStar;-><init>(Lcom/wiyun/engine/astar/AStarMap;)V */
} // .end method
private native final Integer nativeGetStarMap ( ) {
} // .end method
private native final void nativeGetStep ( Integer[] p0 ) {
} // .end method
private native Float nativeHeuristic ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
} // .end method
private native void nativeInit ( com.wiyun.engine.astar.AStarMap p0 ) {
} // .end method
/* # virtual methods */
protected void doNativeInit ( com.wiyun.engine.astar.AStarMap p0 ) {
/* .locals 0 */
/* .param p1, "map" # Lcom/wiyun/engine/astar/AStarMap; */
/* .prologue */
/* .line 33 */
/* invoke-direct {p0, p1}, Lcom/wiyun/engine/astar/AStar;->nativeInit(Lcom/wiyun/engine/astar/AStarMap;)V */
/* .line 34 */
return;
} // .end method
public final java.util.ArrayList findPath ( Integer p0, Integer p1, Integer p2, Integer p3, Boolean p4 ) {
/* .locals 7 */
/* .param p1, "startx" # I */
/* .param p2, "starty" # I */
/* .param p3, "endx" # I */
/* .param p4, "endy" # I */
/* .param p5, "ignoreBlock" # Z */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(IIIIZ)", */
/* "Ljava/util/ArrayList", */
/* "<", */
/* "Lcom/wiyun/engine/astar/AStarStep;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 49 */
/* new-instance v3, Ljava/util/ArrayList; */
/* invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V */
/* .line 50 */
/* .local v3, "steps":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/wiyun/engine/astar/AStarStep;>;" */
v2 = /* invoke-virtual/range {p0 ..p5}, Lcom/wiyun/engine/astar/AStar;->nativeFindPath(IIIIZ)I */
/* .line 51 */
/* .local v2, "stepCount":I */
/* if-nez v2, :cond_1 */
/* .line 52 */
int v3 = 0; // const/4 v3, 0x0
/* .line 58 */
} // .end local v3 # "steps":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/wiyun/engine/astar/AStarStep;>;"
} // :cond_0
/* .line 54 */
/* .restart local v3 # "steps":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/wiyun/engine/astar/AStarStep;>;" */
} // :cond_1
/* new-array v1, v2, [I */
/* .line 55 */
/* .local v1, "pointers":[I */
/* invoke-direct {p0, v1}, Lcom/wiyun/engine/astar/AStar;->nativeGetStep([I)V */
/* .line 56 */
/* array-length v5, v1 */
int v4 = 0; // const/4 v4, 0x0
} // :goto_0
/* if-ge v4, v5, :cond_0 */
/* aget v0, v1, v4 */
/* .line 57 */
/* .local v0, "pointer":I */
/* new-instance v6, Lcom/wiyun/engine/astar/AStarStep; */
/* invoke-direct {v6, v0}, Lcom/wiyun/engine/astar/AStarStep;-><init>(I)V */
(( java.util.ArrayList ) v3 ).add ( v6 ); // invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 56 */
/* add-int/lit8 v4, v4, 0x1 */
} // .end method
public final com.wiyun.engine.astar.AStarMap getAStarMap ( ) {
/* .locals 2 */
/* .prologue */
/* .line 71 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/astar/AStar;->nativeGetStarMap()I */
/* .line 72 */
/* .local v0, "pointer":I */
/* new-instance v1, Lcom/wiyun/engine/astar/AStarMap; */
/* invoke-direct {v1, v0}, Lcom/wiyun/engine/astar/AStarMap;-><init>(I)V */
} // .end method
public Float heuristic ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 1 */
/* .param p1, "startx" # I */
/* .param p2, "starty" # I */
/* .param p3, "endx" # I */
/* .param p4, "endy" # I */
/* .prologue */
/* .line 87 */
v0 = /* invoke-direct {p0, p1, p2, p3, p4}, Lcom/wiyun/engine/astar/AStar;->nativeHeuristic(IIII)F */
} // .end method
public native final Integer nativeFindPath ( Integer p0, Integer p1, Integer p2, Integer p3, Boolean p4 ) {
} // .end method
