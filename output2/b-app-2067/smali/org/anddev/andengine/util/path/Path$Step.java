public class org.anddev.andengine.util.path.Path$Step {
	 /* # instance fields */
	 private final Integer mTileColumn;
	 private final Integer mTileRow;
	 final org.anddev.andengine.util.path.Path this$0; //synthetic
	 /* # direct methods */
	 public org.anddev.andengine.util.path.Path$Step ( ) {
		 /* .locals 0 */
		 this.this$0 = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput p2, p0, Lorg/anddev/andengine/util/path/Path$Step;->mTileColumn:I */
		 /* iput p3, p0, Lorg/anddev/andengine/util/path/Path$Step;->mTileRow:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean equals ( java.lang.Object p0 ) {
		 /* .locals 4 */
		 int v3 = 1; // const/4 v3, 0x1
		 int v2 = 0; // const/4 v2, 0x0
		 /* if-ne p0, p1, :cond_0 */
		 /* move v0, v3 */
	 } // :goto_0
} // :cond_0
/* if-nez p1, :cond_1 */
/* move v0, v2 */
} // :cond_1
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* if-eq v0, v1, :cond_2 */
/* move v0, v2 */
} // :cond_2
/* check-cast p1, Lorg/anddev/andengine/util/path/Path$Step; */
/* iget v0, p0, Lorg/anddev/andengine/util/path/Path$Step;->mTileColumn:I */
/* iget v1, p1, Lorg/anddev/andengine/util/path/Path$Step;->mTileColumn:I */
/* if-eq v0, v1, :cond_3 */
/* move v0, v2 */
} // :cond_3
/* iget v0, p0, Lorg/anddev/andengine/util/path/Path$Step;->mTileRow:I */
/* iget v1, p1, Lorg/anddev/andengine/util/path/Path$Step;->mTileRow:I */
/* if-eq v0, v1, :cond_4 */
/* move v0, v2 */
} // :cond_4
/* move v0, v3 */
} // .end method
public Integer getTileColumn ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/util/path/Path$Step;->mTileColumn:I */
} // .end method
public Integer getTileRow ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/util/path/Path$Step;->mTileRow:I */
} // .end method
public Integer hashCode ( ) {
/* .locals 2 */
/* iget v0, p0, Lorg/anddev/andengine/util/path/Path$Step;->mTileColumn:I */
/* iget v1, p0, Lorg/anddev/andengine/util/path/Path$Step;->mTileRow:I */
/* add-int/lit8 v1, v1, 0x10 */
/* shl-int/2addr v0, v1 */
} // .end method
