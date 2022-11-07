public class org.anddev.andengine.util.path.astar.AStarPathFinder implements org.anddev.andengine.util.path.IPathFinder {
	 /* # interfaces */
	 /* # instance fields */
	 private final org.anddev.andengine.util.path.astar.IAStarHeuristic mAStarHeuristic;
	 private final Boolean mAllowDiagonalMovement;
	 private final Integer mMaxSearchDepth;
	 private final Lorg.anddev.andengine.util.path.astar.AStarPathFinder$Node mNodes;
	 private final java.util.ArrayList mOpenNodes;
	 private final org.anddev.andengine.util.path.ITiledMap mTiledMap;
	 private final java.util.ArrayList mVisitedNodes;
	 /* # direct methods */
	 public org.anddev.andengine.util.path.astar.AStarPathFinder ( ) {
		 /* .locals 1 */
		 /* new-instance v0, Lorg/anddev/andengine/util/path/astar/EuclideanHeuristic; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/util/path/astar/EuclideanHeuristic;-><init>()V */
		 /* invoke-direct {p0, p1, p2, p3, v0}, Lorg/anddev/andengine/util/path/astar/AStarPathFinder;-><init>(Lorg/anddev/andengine/util/path/ITiledMap;IZLorg/anddev/andengine/util/path/astar/IAStarHeuristic;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.util.path.astar.AStarPathFinder ( ) {
		 /* .locals 6 */
		 int v5 = 1; // const/4 v5, 0x1
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.mVisitedNodes = v0;
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.mOpenNodes = v0;
		 this.mAStarHeuristic = p4;
		 this.mTiledMap = p1;
		 /* iput p2, p0, Lorg/anddev/andengine/util/path/astar/AStarPathFinder;->mMaxSearchDepth:I */
		 v1 = 		 v0 = 		 /* iput-boolean p3, p0, Lorg/anddev/andengine/util/path/astar/AStarPathFinder;->mAllowDiagonalMovement:Z */
		 /* filled-new-array {v0, v1}, [I */
		 /* const-class v1, Lorg/anddev/andengine/util/path/astar/AStarPathFinder$Node; */
		 java.lang.reflect.Array .newInstance ( v1,v0 );
		 /* check-cast v0, [[Lorg/anddev/andengine/util/path/astar/AStarPathFinder$Node; */
		 this.mNodes = v0;
		 v1 = 		 v0 = this.mNodes;
		 /* sub-int/2addr v1, v5 */
	 } // :goto_0
	 /* if-gez v1, :cond_0 */
	 return;
v2 = } // :cond_0
/* sub-int/2addr v2, v5 */
} // :goto_1
/* if-gez v2, :cond_1 */
/* add-int/lit8 v1, v1, -0x1 */
} // :cond_1
/* aget-object v3, v0, v2 */
/* new-instance v4, Lorg/anddev/andengine/util/path/astar/AStarPathFinder$Node; */
/* invoke-direct {v4, v1, v2}, Lorg/anddev/andengine/util/path/astar/AStarPathFinder$Node;-><init>(II)V */
/* aput-object v4, v3, v1 */
/* add-int/lit8 v2, v2, -0x1 */
} // .end method
/* # virtual methods */
public org.anddev.andengine.util.path.Path findPath ( java.lang.Object p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer p5 ) {
/* .locals 26 */
/* move-object/from16 v0, p0 */
v0 = this.mTiledMap;
/* move-object v13, v0 */
/* move-object v0, v13 */
/* move-object/from16 v1, p1 */
/* move/from16 v2, p5 */
v4 = /* move/from16 v3, p6 */
if ( v4 != null) { // if-eqz v4, :cond_0
int v4 = 0; // const/4 v4, 0x0
} // :goto_0
} // :cond_0
/* move-object/from16 v0, p0 */
v0 = this.mOpenNodes;
/* move-object v14, v0 */
/* move-object/from16 v0, p0 */
v0 = this.mVisitedNodes;
/* move-object v15, v0 */
/* move-object/from16 v0, p0 */
v0 = this.mNodes;
/* move-object/from16 v16, v0 */
/* aget-object v4, v16, p4 */
/* aget-object v17, v4, p3 */
/* aget-object v4, v16, p6 */
/* aget-object v18, v4, p5 */
/* move-object/from16 v0, p0 */
v0 = this.mAStarHeuristic;
/* move-object/from16 v19, v0 */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lorg/anddev/andengine/util/path/astar/AStarPathFinder;->mAllowDiagonalMovement:Z */
/* move/from16 v20, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lorg/anddev/andengine/util/path/astar/AStarPathFinder;->mMaxSearchDepth:I */
/* move/from16 v21, v0 */
int v4 = 0; // const/4 v4, 0x0
/* move v0, v4 */
/* move-object/from16 v1, v17 */
/* iput v0, v1, Lorg/anddev/andengine/util/path/astar/AStarPathFinder$Node;->mCost:F */
int v4 = 0; // const/4 v4, 0x0
/* move v0, v4 */
/* move-object/from16 v1, v17 */
/* iput v0, v1, Lorg/anddev/andengine/util/path/astar/AStarPathFinder$Node;->mDepth:I */
int v4 = 0; // const/4 v4, 0x0
/* move-object v0, v4 */
/* move-object/from16 v1, v18 */
this.mParent = v0;
(( java.util.ArrayList ) v15 ).clear ( ); // invoke-virtual {v15}, Ljava/util/ArrayList;->clear()V
(( java.util.ArrayList ) v14 ).clear ( ); // invoke-virtual {v14}, Ljava/util/ArrayList;->clear()V
/* move-object v0, v14 */
/* move-object/from16 v1, v17 */
(( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
int v4 = 0; // const/4 v4, 0x0
/* move v5, v4 */
} // :goto_1
/* move v0, v5 */
/* move/from16 v1, v21 */
/* if-ge v0, v1, :cond_1 */
v4 = (( java.util.ArrayList ) v14 ).isEmpty ( ); // invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z
if ( v4 != null) { // if-eqz v4, :cond_2
} // :cond_1
/* move-object/from16 v0, v18 */
v0 = this.mParent;
/* move-object v4, v0 */
/* if-nez v4, :cond_9 */
int v4 = 0; // const/4 v4, 0x0
} // :cond_2
int v4 = 0; // const/4 v4, 0x0
(( java.util.ArrayList ) v14 ).remove ( v4 ); // invoke-virtual {v14, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
/* move-object v0, v4 */
/* check-cast v0, Lorg/anddev/andengine/util/path/astar/AStarPathFinder$Node; */
/* move-object v12, v0 */
/* move-object v0, v12 */
/* move-object/from16 v1, v18 */
/* if-eq v0, v1, :cond_1 */
(( java.util.ArrayList ) v15 ).add ( v12 ); // invoke-virtual {v15, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
int v4 = -1; // const/4 v4, -0x1
/* move/from16 v22, v4 */
/* move v4, v5 */
} // :goto_2
int v5 = 1; // const/4 v5, 0x1
/* move/from16 v0, v22 */
/* move v1, v5 */
/* if-le v0, v1, :cond_3 */
/* move v5, v4 */
} // :cond_3
int v5 = -1; // const/4 v5, -0x1
/* move/from16 v23, v5 */
/* move/from16 v24, v4 */
} // :goto_3
int v4 = 1; // const/4 v4, 0x1
/* move/from16 v0, v23 */
/* move v1, v4 */
/* if-le v0, v1, :cond_4 */
/* add-int/lit8 v4, v22, 0x1 */
/* move/from16 v22, v4 */
/* move/from16 v4, v24 */
} // :cond_4
/* if-nez v22, :cond_5 */
if ( v23 != null) { // if-eqz v23, :cond_b
} // :cond_5
/* if-nez v20, :cond_6 */
if ( v22 != null) { // if-eqz v22, :cond_6
/* if-nez v23, :cond_b */
} // :cond_6
/* iget v4, v12, Lorg/anddev/andengine/util/path/astar/AStarPathFinder$Node;->mTileColumn:I */
/* add-int v8, v22, v4 */
/* iget v4, v12, Lorg/anddev/andengine/util/path/astar/AStarPathFinder$Node;->mTileRow:I */
/* add-int v9, v23, v4 */
/* move-object/from16 v4, p0 */
/* move-object/from16 v5, p1 */
/* move/from16 v6, p3 */
/* move/from16 v7, p4 */
v4 = /* invoke-virtual/range {v4 ..v9}, Lorg/anddev/andengine/util/path/astar/AStarPathFinder;->isTileBlocked(Ljava/lang/Object;IIII)Z */
/* if-nez v4, :cond_b */
/* iget v10, v12, Lorg/anddev/andengine/util/path/astar/AStarPathFinder$Node;->mCost:F */
/* iget v6, v12, Lorg/anddev/andengine/util/path/astar/AStarPathFinder$Node;->mTileColumn:I */
/* iget v7, v12, Lorg/anddev/andengine/util/path/astar/AStarPathFinder$Node;->mTileRow:I */
/* move-object v4, v13 */
/* move-object/from16 v5, p1 */
v4 = /* invoke-interface/range {v4 ..v9}, Lorg/anddev/andengine/util/path/ITiledMap;->getStepCost(Ljava/lang/Object;IIII)F */
/* add-float/2addr v4, v10 */
/* aget-object v5, v16, v9 */
/* aget-object v25, v5, v8 */
/* move-object/from16 v0, v25 */
/* iget v0, v0, Lorg/anddev/andengine/util/path/astar/AStarPathFinder$Node;->mCost:F */
/* move v5, v0 */
/* cmpg-float v5, v4, v5 */
/* if-gez v5, :cond_8 */
/* move-object v0, v14 */
/* move-object/from16 v1, v25 */
v5 = (( java.util.ArrayList ) v0 ).contains ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
if ( v5 != null) { // if-eqz v5, :cond_7
/* move-object v0, v14 */
/* move-object/from16 v1, v25 */
(( java.util.ArrayList ) v0 ).remove ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
} // :cond_7
/* move-object v0, v15 */
/* move-object/from16 v1, v25 */
v5 = (( java.util.ArrayList ) v0 ).contains ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
if ( v5 != null) { // if-eqz v5, :cond_8
/* move-object v0, v15 */
/* move-object/from16 v1, v25 */
(( java.util.ArrayList ) v0 ).remove ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
} // :cond_8
/* move-object v0, v14 */
/* move-object/from16 v1, v25 */
v5 = (( java.util.ArrayList ) v0 ).contains ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
/* if-nez v5, :cond_b */
/* move-object v0, v15 */
/* move-object/from16 v1, v25 */
v5 = (( java.util.ArrayList ) v0 ).contains ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
/* if-nez v5, :cond_b */
/* move v0, v4 */
/* move-object/from16 v1, v25 */
/* iput v0, v1, Lorg/anddev/andengine/util/path/astar/AStarPathFinder$Node;->mCost:F */
/* move-object/from16 v0, v25 */
/* iget v0, v0, Lorg/anddev/andengine/util/path/astar/AStarPathFinder$Node;->mCost:F */
/* move v4, v0 */
/* move/from16 v0, p2 */
/* int-to-float v0, v0 */
/* move v5, v0 */
/* cmpg-float v4, v4, v5 */
/* if-gtz v4, :cond_b */
/* move-object/from16 v5, v19 */
/* move-object v6, v13 */
/* move-object/from16 v7, p1 */
/* move/from16 v10, p5 */
/* move/from16 v11, p6 */
v4 = /* invoke-interface/range {v5 ..v11}, Lorg/anddev/andengine/util/path/astar/IAStarHeuristic;->getExpectedRestCost(Lorg/anddev/andengine/util/path/ITiledMap;Ljava/lang/Object;IIII)F */
/* move v0, v4 */
/* move-object/from16 v1, v25 */
/* iput v0, v1, Lorg/anddev/andengine/util/path/astar/AStarPathFinder$Node;->mExpectedRestCost:F */
/* move-object/from16 v0, v25 */
/* move-object v1, v12 */
v4 = (( org.anddev.andengine.util.path.astar.AStarPathFinder$Node ) v0 ).setParent ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/util/path/astar/AStarPathFinder$Node;->setParent(Lorg/anddev/andengine/util/path/astar/AStarPathFinder$Node;)I
/* move/from16 v0, v24 */
/* move v1, v4 */
v4 = java.lang.Math .max ( v0,v1 );
/* move-object v0, v14 */
/* move-object/from16 v1, v25 */
(( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
java.util.Collections .sort ( v14 );
} // :goto_4
/* add-int/lit8 v5, v23, 0x1 */
/* move/from16 v23, v5 */
/* move/from16 v24, v4 */
/* goto/16 :goto_3 */
} // :cond_9
/* new-instance v4, Lorg/anddev/andengine/util/path/Path; */
/* invoke-direct {v4}, Lorg/anddev/andengine/util/path/Path;-><init>()V */
/* aget-object v5, v16, p6 */
/* aget-object v5, v5, p5 */
} // :goto_5
/* move-object v0, v5 */
/* move-object/from16 v1, v17 */
/* if-ne v0, v1, :cond_a */
/* move-object v0, v4 */
/* move/from16 v1, p3 */
/* move/from16 v2, p4 */
(( org.anddev.andengine.util.path.Path ) v0 ).prepend ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/anddev/andengine/util/path/Path;->prepend(II)V
/* goto/16 :goto_0 */
} // :cond_a
/* iget v6, v5, Lorg/anddev/andengine/util/path/astar/AStarPathFinder$Node;->mTileColumn:I */
/* iget v7, v5, Lorg/anddev/andengine/util/path/astar/AStarPathFinder$Node;->mTileRow:I */
(( org.anddev.andengine.util.path.Path ) v4 ).prepend ( v6, v7 ); // invoke-virtual {v4, v6, v7}, Lorg/anddev/andengine/util/path/Path;->prepend(II)V
v5 = this.mParent;
} // :cond_b
/* move/from16 v4, v24 */
} // .end method
protected Boolean isTileBlocked ( java.lang.Object p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 2 */
int v1 = 1; // const/4 v1, 0x1
/* if-ltz p4, :cond_0 */
/* if-ltz p5, :cond_0 */
v0 = v0 = this.mTiledMap;
/* if-ge p4, v0, :cond_0 */
v0 = v0 = this.mTiledMap;
/* if-lt p5, v0, :cond_1 */
} // :cond_0
/* move v0, v1 */
} // :goto_0
} // :cond_1
/* if-ne p2, p4, :cond_2 */
/* if-ne p3, p5, :cond_2 */
/* move v0, v1 */
} // :cond_2
v0 = v0 = this.mTiledMap;
} // .end method
