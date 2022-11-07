public class com.badlogic.gdx.utils.Array$ArrayIterator implements java.util.Iterator {
	 /* # interfaces */
	 /* # instance fields */
	 private final com.badlogic.gdx.utils.Array array;
	 Integer index;
	 /* # direct methods */
	 public com.badlogic.gdx.utils.Array$ArrayIterator ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.array = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean hasNext ( ) {
		 /* .locals 2 */
		 /* iget v0, p0, Lcom/badlogic/gdx/utils/Array$ArrayIterator;->index:I */
		 v1 = this.array;
		 /* iget v1, v1, Lcom/badlogic/gdx/utils/Array;->size:I */
		 /* if-ge v0, v1, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public java.lang.Object next ( ) {
/* .locals 3 */
/* iget v0, p0, Lcom/badlogic/gdx/utils/Array$ArrayIterator;->index:I */
v1 = this.array;
/* iget v1, v1, Lcom/badlogic/gdx/utils/Array;->size:I */
/* if-lt v0, v1, :cond_0 */
/* new-instance v0, Ljava/util/NoSuchElementException; */
/* iget v1, p0, Lcom/badlogic/gdx/utils/Array$ArrayIterator;->index:I */
java.lang.String .valueOf ( v1 );
/* invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_0
v0 = this.array;
v0 = this.items;
/* iget v1, p0, Lcom/badlogic/gdx/utils/Array$ArrayIterator;->index:I */
/* add-int/lit8 v2, v1, 0x1 */
/* iput v2, p0, Lcom/badlogic/gdx/utils/Array$ArrayIterator;->index:I */
/* aget-object v0, v0, v1 */
} // .end method
public void remove ( ) {
/* .locals 2 */
/* iget v0, p0, Lcom/badlogic/gdx/utils/Array$ArrayIterator;->index:I */
int v1 = 1; // const/4 v1, 0x1
/* sub-int/2addr v0, v1 */
/* iput v0, p0, Lcom/badlogic/gdx/utils/Array$ArrayIterator;->index:I */
v0 = this.array;
/* iget v1, p0, Lcom/badlogic/gdx/utils/Array$ArrayIterator;->index:I */
(( com.badlogic.gdx.utils.Array ) v0 ).removeIndex ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/utils/Array;->removeIndex(I)Ljava/lang/Object;
return;
} // .end method
public void reset ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/badlogic/gdx/utils/Array$ArrayIterator;->index:I */
return;
} // .end method
