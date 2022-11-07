class com.badlogic.gdx.utils.LongMap$MapIterator {
	 /* # static fields */
	 static final Integer INDEX_ILLEGAL;
	 static final Integer INDEX_ZERO;
	 /* # instance fields */
	 Integer currentIndex;
	 public Boolean hasNext;
	 final com.badlogic.gdx.utils.LongMap map;
	 Integer nextIndex;
	 /* # direct methods */
	 public com.badlogic.gdx.utils.LongMap$MapIterator ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.map = p1;
		 (( com.badlogic.gdx.utils.LongMap$MapIterator ) p0 ).reset ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/utils/LongMap$MapIterator;->reset()V
		 return;
	 } // .end method
	 /* # virtual methods */
	 void findNextIndex ( ) {
		 /* .locals 6 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lcom/badlogic/gdx/utils/LongMap$MapIterator;->hasNext:Z */
		 v0 = this.map;
		 v0 = this.keyTable;
		 v1 = this.map;
		 /* iget v1, v1, Lcom/badlogic/gdx/utils/LongMap;->capacity:I */
		 v2 = this.map;
		 /* iget v2, v2, Lcom/badlogic/gdx/utils/LongMap;->stashSize:I */
		 /* add-int/2addr v1, v2 */
	 } // :cond_0
	 /* iget v2, p0, Lcom/badlogic/gdx/utils/LongMap$MapIterator;->nextIndex:I */
	 /* add-int/lit8 v2, v2, 0x1 */
	 /* iput v2, p0, Lcom/badlogic/gdx/utils/LongMap$MapIterator;->nextIndex:I */
	 /* if-ge v2, v1, :cond_1 */
	 /* iget v2, p0, Lcom/badlogic/gdx/utils/LongMap$MapIterator;->nextIndex:I */
	 /* aget-wide v2, v0, v2 */
	 /* const-wide/16 v4, 0x0 */
	 /* cmp-long v2, v2, v4 */
	 if ( v2 != null) { // if-eqz v2, :cond_0
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p0, Lcom/badlogic/gdx/utils/LongMap$MapIterator;->hasNext:Z */
	 } // :cond_1
	 return;
} // .end method
public void remove ( ) {
	 /* .locals 5 */
	 int v4 = 0; // const/4 v4, 0x0
	 /* iget v0, p0, Lcom/badlogic/gdx/utils/LongMap$MapIterator;->currentIndex:I */
	 int v1 = -1; // const/4 v1, -0x1
	 /* if-ne v0, v1, :cond_0 */
	 v0 = this.map;
	 /* iget-boolean v0, v0, Lcom/badlogic/gdx/utils/LongMap;->hasZeroValue:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 v0 = this.map;
		 this.zeroValue = v4;
		 v0 = this.map;
		 int v1 = 0; // const/4 v1, 0x0
		 /* iput-boolean v1, v0, Lcom/badlogic/gdx/utils/LongMap;->hasZeroValue:Z */
	 } // :goto_0
	 int v0 = -2; // const/4 v0, -0x2
	 /* iput v0, p0, Lcom/badlogic/gdx/utils/LongMap$MapIterator;->currentIndex:I */
	 v0 = this.map;
	 /* iget v1, v0, Lcom/badlogic/gdx/utils/LongMap;->size:I */
	 int v2 = 1; // const/4 v2, 0x1
	 /* sub-int/2addr v1, v2 */
	 /* iput v1, v0, Lcom/badlogic/gdx/utils/LongMap;->size:I */
	 return;
} // :cond_0
/* iget v0, p0, Lcom/badlogic/gdx/utils/LongMap$MapIterator;->currentIndex:I */
/* if-gez v0, :cond_1 */
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "next must be called before remove."; // const-string v1, "next must be called before remove."
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_1
/* iget v0, p0, Lcom/badlogic/gdx/utils/LongMap$MapIterator;->currentIndex:I */
v1 = this.map;
/* iget v1, v1, Lcom/badlogic/gdx/utils/LongMap;->capacity:I */
/* if-lt v0, v1, :cond_2 */
v0 = this.map;
/* iget v1, p0, Lcom/badlogic/gdx/utils/LongMap$MapIterator;->currentIndex:I */
(( com.badlogic.gdx.utils.LongMap ) v0 ).removeStashIndex ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/utils/LongMap;->removeStashIndex(I)V
} // :cond_2
v0 = this.map;
v0 = this.keyTable;
/* iget v1, p0, Lcom/badlogic/gdx/utils/LongMap$MapIterator;->currentIndex:I */
/* const-wide/16 v2, 0x0 */
/* aput-wide v2, v0, v1 */
v0 = this.map;
v0 = this.valueTable;
/* iget v1, p0, Lcom/badlogic/gdx/utils/LongMap$MapIterator;->currentIndex:I */
/* aput-object v4, v0, v1 */
} // .end method
public void reset ( ) {
/* .locals 1 */
int v0 = -2; // const/4 v0, -0x2
/* iput v0, p0, Lcom/badlogic/gdx/utils/LongMap$MapIterator;->currentIndex:I */
int v0 = -1; // const/4 v0, -0x1
/* iput v0, p0, Lcom/badlogic/gdx/utils/LongMap$MapIterator;->nextIndex:I */
v0 = this.map;
/* iget-boolean v0, v0, Lcom/badlogic/gdx/utils/LongMap;->hasZeroValue:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/badlogic/gdx/utils/LongMap$MapIterator;->hasNext:Z */
} // :goto_0
return;
} // :cond_0
(( com.badlogic.gdx.utils.LongMap$MapIterator ) p0 ).findNextIndex ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/utils/LongMap$MapIterator;->findNextIndex()V
} // .end method
