public class com.badlogic.gdx.utils.Array$ArrayIterable implements java.lang.Iterable {
	 /* # interfaces */
	 /* # instance fields */
	 private com.badlogic.gdx.utils.Array$ArrayIterator iterator;
	 /* # direct methods */
	 public com.badlogic.gdx.utils.Array$ArrayIterable ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/utils/Array$ArrayIterator; */
		 /* invoke-direct {v0, p1}, Lcom/badlogic/gdx/utils/Array$ArrayIterator;-><init>(Lcom/badlogic/gdx/utils/Array;)V */
		 this.iterator = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.util.Iterator iterator ( ) {
		 /* .locals 1 */
		 v0 = this.iterator;
		 (( com.badlogic.gdx.utils.Array$ArrayIterator ) v0 ).reset ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/utils/Array$ArrayIterator;->reset()V
		 v0 = this.iterator;
	 } // .end method
