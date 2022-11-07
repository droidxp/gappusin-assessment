public abstract class com.badlogic.gdx.utils.Pool {
	 /* # instance fields */
	 private final com.badlogic.gdx.utils.Array freeObjects;
	 public final Integer max;
	 /* # direct methods */
	 public com.badlogic.gdx.utils.Pool ( ) {
		 /* .locals 2 */
		 /* const/16 v0, 0x10 */
		 /* const v1, 0x7fffffff */
		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/utils/Pool;-><init>(II)V */
		 return;
	 } // .end method
	 public com.badlogic.gdx.utils.Pool ( ) {
		 /* .locals 1 */
		 /* const v0, 0x7fffffff */
		 /* invoke-direct {p0, p1, v0}, Lcom/badlogic/gdx/utils/Pool;-><init>(II)V */
		 return;
	 } // .end method
	 public com.badlogic.gdx.utils.Pool ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/utils/Array; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {v0, v1, p1}, Lcom/badlogic/gdx/utils/Array;-><init>(ZI)V */
		 this.freeObjects = v0;
		 /* iput p2, p0, Lcom/badlogic/gdx/utils/Pool;->max:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void clear ( ) {
		 /* .locals 1 */
		 v0 = this.freeObjects;
		 (( com.badlogic.gdx.utils.Array ) v0 ).clear ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/utils/Array;->clear()V
		 return;
	 } // .end method
	 public void free ( com.badlogic.gdx.utils.Array p0 ) {
		 /* .locals 4 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iget v1, p1, Lcom/badlogic/gdx/utils/Array;->size:I */
		 /* iget v2, p0, Lcom/badlogic/gdx/utils/Pool;->max:I */
		 v3 = this.freeObjects;
		 /* iget v3, v3, Lcom/badlogic/gdx/utils/Array;->size:I */
		 /* sub-int/2addr v2, v3 */
		 v1 = 		 java.lang.Math .min ( v1,v2 );
	 } // :goto_0
	 /* if-ge v0, v1, :cond_0 */
	 v2 = this.freeObjects;
	 (( com.badlogic.gdx.utils.Array ) p1 ).get ( v0 ); // invoke-virtual {p1, v0}, Lcom/badlogic/gdx/utils/Array;->get(I)Ljava/lang/Object;
	 (( com.badlogic.gdx.utils.Array ) v2 ).add ( v3 ); // invoke-virtual {v2, v3}, Lcom/badlogic/gdx/utils/Array;->add(Ljava/lang/Object;)V
	 /* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
return;
} // .end method
public void free ( java.lang.Object p0 ) {
/* .locals 2 */
/* if-nez p1, :cond_0 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "object cannot be null."; // const-string v1, "object cannot be null."
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_0
v0 = this.freeObjects;
/* iget v0, v0, Lcom/badlogic/gdx/utils/Array;->size:I */
/* iget v1, p0, Lcom/badlogic/gdx/utils/Pool;->max:I */
/* if-ge v0, v1, :cond_1 */
v0 = this.freeObjects;
(( com.badlogic.gdx.utils.Array ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Lcom/badlogic/gdx/utils/Array;->add(Ljava/lang/Object;)V
} // :cond_1
return;
} // .end method
protected abstract java.lang.Object newObject ( ) {
} // .end method
public java.lang.Object obtain ( ) {
/* .locals 1 */
v0 = this.freeObjects;
/* iget v0, v0, Lcom/badlogic/gdx/utils/Array;->size:I */
/* if-nez v0, :cond_0 */
(( com.badlogic.gdx.utils.Pool ) p0 ).newObject ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/utils/Pool;->newObject()Ljava/lang/Object;
} // :goto_0
} // :cond_0
v0 = this.freeObjects;
(( com.badlogic.gdx.utils.Array ) v0 ).pop ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/utils/Array;->pop()Ljava/lang/Object;
} // .end method
