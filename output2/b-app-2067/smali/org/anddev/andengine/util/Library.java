public class org.anddev.andengine.util.Library {
	 /* # instance fields */
	 protected final android.util.SparseArray mItems;
	 /* # direct methods */
	 public org.anddev.andengine.util.Library ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Landroid/util/SparseArray; */
		 /* invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V */
		 this.mItems = v0;
		 return;
	 } // .end method
	 public org.anddev.andengine.util.Library ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Landroid/util/SparseArray; */
		 /* invoke-direct {v0, p1}, Landroid/util/SparseArray;-><init>(I)V */
		 this.mItems = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.Object get ( Integer p0 ) {
		 /* .locals 1 */
		 v0 = this.mItems;
		 (( android.util.SparseArray ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
	 } // .end method
	 public void put ( Integer p0, java.lang.Object p1 ) {
		 /* .locals 4 */
		 v0 = this.mItems;
		 (( android.util.SparseArray ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
		 /* if-nez v0, :cond_0 */
		 v0 = this.mItems;
		 (( android.util.SparseArray ) v0 ).put ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
		 return;
	 } // :cond_0
	 /* new-instance v1, Ljava/lang/IllegalArgumentException; */
	 /* new-instance v2, Ljava/lang/StringBuilder; */
	 final String v3 = "ID: \'"; // const-string v3, "ID: \'"
	 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 (( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 final String v3 = "\' is already associated with item: \'"; // const-string v3, "\' is already associated with item: \'"
	 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.Object ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
	 (( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v2 = "\'."; // const-string v2, "\'."
	 (( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw v1 */
} // .end method
public void remove ( Integer p0 ) {
	 /* .locals 1 */
	 v0 = this.mItems;
	 (( android.util.SparseArray ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Landroid/util/SparseArray;->remove(I)V
	 return;
} // .end method
