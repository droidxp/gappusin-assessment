public class com.badlogic.gdx.utils.LongMap$Keys extends com.badlogic.gdx.utils.LongMap$MapIterator {
	 /* # direct methods */
	 public com.badlogic.gdx.utils.LongMap$Keys ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/badlogic/gdx/utils/LongMap$MapIterator;-><init>(Lcom/badlogic/gdx/utils/LongMap;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Long next ( ) {
		 /* .locals 3 */
		 /* iget v0, p0, Lcom/badlogic/gdx/utils/LongMap$Keys;->nextIndex:I */
		 int v1 = -1; // const/4 v1, -0x1
		 /* if-ne v0, v1, :cond_0 */
		 /* const-wide/16 v0, 0x0 */
	 } // :goto_0
	 /* iget v2, p0, Lcom/badlogic/gdx/utils/LongMap$Keys;->nextIndex:I */
	 /* iput v2, p0, Lcom/badlogic/gdx/utils/LongMap$Keys;->currentIndex:I */
	 (( com.badlogic.gdx.utils.LongMap$Keys ) p0 ).findNextIndex ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/utils/LongMap$Keys;->findNextIndex()V
	 /* return-wide v0 */
} // :cond_0
v0 = this.map;
v0 = this.keyTable;
/* iget v1, p0, Lcom/badlogic/gdx/utils/LongMap$Keys;->nextIndex:I */
/* aget-wide v0, v0, v1 */
} // .end method
public void remove ( ) { //bridge//synthethic
/* .locals 0 */
/* invoke-super {p0}, Lcom/badlogic/gdx/utils/LongMap$MapIterator;->remove()V */
return;
} // .end method
public void reset ( ) { //bridge//synthethic
/* .locals 0 */
/* invoke-super {p0}, Lcom/badlogic/gdx/utils/LongMap$MapIterator;->reset()V */
return;
} // .end method
public com.badlogic.gdx.utils.LongArray toArray ( ) {
/* .locals 3 */
/* new-instance v0, Lcom/badlogic/gdx/utils/LongArray; */
int v1 = 1; // const/4 v1, 0x1
v2 = this.map;
/* iget v2, v2, Lcom/badlogic/gdx/utils/LongMap;->size:I */
/* invoke-direct {v0, v1, v2}, Lcom/badlogic/gdx/utils/LongArray;-><init>(ZI)V */
} // :goto_0
/* iget-boolean v1, p0, Lcom/badlogic/gdx/utils/LongMap$Keys;->hasNext:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
(( com.badlogic.gdx.utils.LongMap$Keys ) p0 ).next ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/utils/LongMap$Keys;->next()J
/* move-result-wide v1 */
(( com.badlogic.gdx.utils.LongArray ) v0 ).add ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/badlogic/gdx/utils/LongArray;->add(J)V
} // :cond_0
} // .end method
