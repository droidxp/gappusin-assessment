class org.anddev.andengine.util.path.astar.AStarPathFinder$Node implements java.lang.Comparable {
	 /* # interfaces */
	 /* # instance fields */
	 Float mCost;
	 Integer mDepth;
	 Float mExpectedRestCost;
	 org.anddev.andengine.util.path.astar.AStarPathFinder$Node mParent;
	 final Integer mTileColumn;
	 final Integer mTileRow;
	 /* # direct methods */
	 public org.anddev.andengine.util.path.astar.AStarPathFinder$Node ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput p1, p0, Lorg/anddev/andengine/util/path/astar/AStarPathFinder$Node;->mTileColumn:I */
		 /* iput p2, p0, Lorg/anddev/andengine/util/path/astar/AStarPathFinder$Node;->mTileRow:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer compareTo ( java.lang.Object p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* check-cast p1, Lorg/anddev/andengine/util/path/astar/AStarPathFinder$Node; */
		 v0 = 		 (( org.anddev.andengine.util.path.astar.AStarPathFinder$Node ) p0 ).compareTo ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/util/path/astar/AStarPathFinder$Node;->compareTo(Lorg/anddev/andengine/util/path/astar/AStarPathFinder$Node;)I
	 } // .end method
	 public Integer compareTo ( org.anddev.andengine.util.path.astar.AStarPathFinder$Node p0 ) {
		 /* .locals 3 */
		 /* iget v0, p0, Lorg/anddev/andengine/util/path/astar/AStarPathFinder$Node;->mExpectedRestCost:F */
		 /* iget v1, p0, Lorg/anddev/andengine/util/path/astar/AStarPathFinder$Node;->mCost:F */
		 /* add-float/2addr v0, v1 */
		 /* iget v1, p1, Lorg/anddev/andengine/util/path/astar/AStarPathFinder$Node;->mExpectedRestCost:F */
		 /* iget v2, p1, Lorg/anddev/andengine/util/path/astar/AStarPathFinder$Node;->mCost:F */
		 /* add-float/2addr v1, v2 */
		 /* cmpg-float v2, v0, v1 */
		 /* if-gez v2, :cond_0 */
		 int v0 = -1; // const/4 v0, -0x1
	 } // :goto_0
} // :cond_0
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Integer setParent ( org.anddev.andengine.util.path.astar.AStarPathFinder$Node p0 ) {
/* .locals 1 */
/* iget v0, p1, Lorg/anddev/andengine/util/path/astar/AStarPathFinder$Node;->mDepth:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lorg/anddev/andengine/util/path/astar/AStarPathFinder$Node;->mDepth:I */
this.mParent = p1;
/* iget v0, p0, Lorg/anddev/andengine/util/path/astar/AStarPathFinder$Node;->mDepth:I */
} // .end method
