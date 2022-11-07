public abstract class org.anddev.andengine.util.sort.Sorter {
	 /* # direct methods */
	 public org.anddev.andengine.util.sort.Sorter ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public abstract void sort ( java.util.List p0, Integer p1, Integer p2, java.util.Comparator p3 ) {
	 } // .end method
	 public final void sort ( java.util.List p0, java.util.Comparator p1 ) {
		 /* .locals 2 */
		 v1 = 		 int v0 = 0; // const/4 v0, 0x0
		 (( org.anddev.andengine.util.sort.Sorter ) p0 ).sort ( p1, v0, v1, p2 ); // invoke-virtual {p0, p1, v0, v1, p2}, Lorg/anddev/andengine/util/sort/Sorter;->sort(Ljava/util/List;IILjava/util/Comparator;)V
		 return;
	 } // .end method
	 public abstract void sort ( java.lang.Object[] p0, Integer p1, Integer p2, java.util.Comparator p3 ) {
	 } // .end method
	 public final void sort ( java.lang.Object[] p0, java.util.Comparator p1 ) {
		 /* .locals 2 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* array-length v1, p1 */
		 (( org.anddev.andengine.util.sort.Sorter ) p0 ).sort ( p1, v0, v1, p2 ); // invoke-virtual {p0, p1, v0, v1, p2}, Lorg/anddev/andengine/util/sort/Sorter;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V
		 return;
	 } // .end method
