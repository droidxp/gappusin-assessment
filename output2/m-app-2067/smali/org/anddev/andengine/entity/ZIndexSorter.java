public class org.anddev.andengine.entity.ZIndexSorter extends org.anddev.andengine.util.sort.InsertionSorter {
	 /* # static fields */
	 private static org.anddev.andengine.entity.ZIndexSorter INSTANCE;
	 /* # instance fields */
	 private final java.util.Comparator mZIndexComparator;
	 /* # direct methods */
	 private org.anddev.andengine.entity.ZIndexSorter ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Lorg/anddev/andengine/util/sort/InsertionSorter;-><init>()V */
		 /* new-instance v0, Lorg/anddev/andengine/entity/ZIndexSorter$1; */
		 /* invoke-direct {v0, p0}, Lorg/anddev/andengine/entity/ZIndexSorter$1;-><init>(Lorg/anddev/andengine/entity/ZIndexSorter;)V */
		 this.mZIndexComparator = v0;
		 return;
	 } // .end method
	 public static org.anddev.andengine.entity.ZIndexSorter getInstance ( ) {
		 /* .locals 1 */
		 v0 = org.anddev.andengine.entity.ZIndexSorter.INSTANCE;
		 /* if-nez v0, :cond_0 */
		 /* new-instance v0, Lorg/anddev/andengine/entity/ZIndexSorter; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/entity/ZIndexSorter;-><init>()V */
	 } // :cond_0
	 v0 = org.anddev.andengine.entity.ZIndexSorter.INSTANCE;
} // .end method
/* # virtual methods */
public void sort ( java.util.List p0 ) {
	 /* .locals 1 */
	 v0 = this.mZIndexComparator;
	 (( org.anddev.andengine.entity.ZIndexSorter ) p0 ).sort ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lorg/anddev/andengine/entity/ZIndexSorter;->sort(Ljava/util/List;Ljava/util/Comparator;)V
	 return;
} // .end method
public void sort ( java.util.List p0, Integer p1, Integer p2 ) {
	 /* .locals 1 */
	 v0 = this.mZIndexComparator;
	 (( org.anddev.andengine.entity.ZIndexSorter ) p0 ).sort ( p1, p2, p3, v0 ); // invoke-virtual {p0, p1, p2, p3, v0}, Lorg/anddev/andengine/entity/ZIndexSorter;->sort(Ljava/util/List;IILjava/util/Comparator;)V
	 return;
} // .end method
public void sort ( org.anddev.andengine.entity.IEntity[] p0 ) {
	 /* .locals 1 */
	 v0 = this.mZIndexComparator;
	 (( org.anddev.andengine.entity.ZIndexSorter ) p0 ).sort ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lorg/anddev/andengine/entity/ZIndexSorter;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V
	 return;
} // .end method
public void sort ( org.anddev.andengine.entity.IEntity[] p0, Integer p1, Integer p2 ) {
	 /* .locals 1 */
	 v0 = this.mZIndexComparator;
	 (( org.anddev.andengine.entity.ZIndexSorter ) p0 ).sort ( p1, p2, p3, v0 ); // invoke-virtual {p0, p1, p2, p3, v0}, Lorg/anddev/andengine/entity/ZIndexSorter;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V
	 return;
} // .end method
