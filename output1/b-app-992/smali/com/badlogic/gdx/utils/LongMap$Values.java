public class com.badlogic.gdx.utils.LongMap$Values extends com.badlogic.gdx.utils.LongMap$MapIterator implements java.lang.Iterable implements java.util.Iterator {
	 /* # interfaces */
	 /* # direct methods */
	 public com.badlogic.gdx.utils.LongMap$Values ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/badlogic/gdx/utils/LongMap$MapIterator;-><init>(Lcom/badlogic/gdx/utils/LongMap;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean hasNext ( ) {
		 /* .locals 1 */
		 /* iget-boolean v0, p0, Lcom/badlogic/gdx/utils/LongMap$Values;->hasNext:Z */
	 } // .end method
	 public java.util.Iterator iterator ( ) {
		 /* .locals 0 */
	 } // .end method
	 public java.lang.Object next ( ) {
		 /* .locals 2 */
		 /* iget v0, p0, Lcom/badlogic/gdx/utils/LongMap$Values;->nextIndex:I */
		 int v1 = -1; // const/4 v1, -0x1
		 /* if-ne v0, v1, :cond_0 */
		 v0 = this.map;
		 v0 = this.zeroValue;
	 } // :goto_0
	 /* iget v1, p0, Lcom/badlogic/gdx/utils/LongMap$Values;->nextIndex:I */
	 /* iput v1, p0, Lcom/badlogic/gdx/utils/LongMap$Values;->currentIndex:I */
	 (( com.badlogic.gdx.utils.LongMap$Values ) p0 ).findNextIndex ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/utils/LongMap$Values;->findNextIndex()V
} // :cond_0
v0 = this.map;
v0 = this.valueTable;
/* iget v1, p0, Lcom/badlogic/gdx/utils/LongMap$Values;->nextIndex:I */
/* aget-object v0, v0, v1 */
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
public com.badlogic.gdx.utils.Array toArray ( ) {
/* .locals 3 */
/* new-instance v0, Lcom/badlogic/gdx/utils/Array; */
int v1 = 1; // const/4 v1, 0x1
v2 = this.map;
/* iget v2, v2, Lcom/badlogic/gdx/utils/LongMap;->size:I */
/* invoke-direct {v0, v1, v2}, Lcom/badlogic/gdx/utils/Array;-><init>(ZI)V */
} // :goto_0
/* iget-boolean v1, p0, Lcom/badlogic/gdx/utils/LongMap$Values;->hasNext:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
(( com.badlogic.gdx.utils.LongMap$Values ) p0 ).next ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/utils/LongMap$Values;->next()Ljava/lang/Object;
(( com.badlogic.gdx.utils.Array ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/utils/Array;->add(Ljava/lang/Object;)V
} // :cond_0
} // .end method
