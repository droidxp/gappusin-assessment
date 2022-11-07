public class com.badlogic.gdx.utils.LongMap$Entries extends com.badlogic.gdx.utils.LongMap$MapIterator implements java.lang.Iterable implements java.util.Iterator {
	 /* # interfaces */
	 /* # instance fields */
	 private com.badlogic.gdx.utils.LongMap$Entry entry;
	 /* # direct methods */
	 public com.badlogic.gdx.utils.LongMap$Entries ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0, p1}, Lcom/badlogic/gdx/utils/LongMap$MapIterator;-><init>(Lcom/badlogic/gdx/utils/LongMap;)V */
		 /* new-instance v0, Lcom/badlogic/gdx/utils/LongMap$Entry; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/utils/LongMap$Entry;-><init>()V */
		 this.entry = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean hasNext ( ) {
		 /* .locals 1 */
		 /* iget-boolean v0, p0, Lcom/badlogic/gdx/utils/LongMap$Entries;->hasNext:Z */
	 } // .end method
	 public java.util.Iterator iterator ( ) {
		 /* .locals 0 */
	 } // .end method
	 public com.badlogic.gdx.utils.LongMap$Entry next ( ) {
		 /* .locals 4 */
		 /* iget-boolean v0, p0, Lcom/badlogic/gdx/utils/LongMap$Entries;->hasNext:Z */
		 /* if-nez v0, :cond_0 */
		 /* new-instance v0, Ljava/util/NoSuchElementException; */
		 /* invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V */
		 /* throw v0 */
	 } // :cond_0
	 v0 = this.map;
	 v0 = this.keyTable;
	 /* iget v1, p0, Lcom/badlogic/gdx/utils/LongMap$Entries;->nextIndex:I */
	 int v2 = -1; // const/4 v2, -0x1
	 /* if-ne v1, v2, :cond_1 */
	 v0 = this.entry;
	 /* const-wide/16 v1, 0x0 */
	 /* iput-wide v1, v0, Lcom/badlogic/gdx/utils/LongMap$Entry;->key:J */
	 v0 = this.entry;
	 v1 = this.map;
	 v1 = this.zeroValue;
	 this.value = v1;
} // :goto_0
/* iget v0, p0, Lcom/badlogic/gdx/utils/LongMap$Entries;->nextIndex:I */
/* iput v0, p0, Lcom/badlogic/gdx/utils/LongMap$Entries;->currentIndex:I */
(( com.badlogic.gdx.utils.LongMap$Entries ) p0 ).findNextIndex ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/utils/LongMap$Entries;->findNextIndex()V
v0 = this.entry;
} // :cond_1
v1 = this.entry;
/* iget v2, p0, Lcom/badlogic/gdx/utils/LongMap$Entries;->nextIndex:I */
/* aget-wide v2, v0, v2 */
/* iput-wide v2, v1, Lcom/badlogic/gdx/utils/LongMap$Entry;->key:J */
v0 = this.entry;
v1 = this.map;
v1 = this.valueTable;
/* iget v2, p0, Lcom/badlogic/gdx/utils/LongMap$Entries;->nextIndex:I */
/* aget-object v1, v1, v2 */
this.value = v1;
} // .end method
public java.lang.Object next ( ) { //bridge//synthethic
/* .locals 1 */
(( com.badlogic.gdx.utils.LongMap$Entries ) p0 ).next ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/utils/LongMap$Entries;->next()Lcom/badlogic/gdx/utils/LongMap$Entry;
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
