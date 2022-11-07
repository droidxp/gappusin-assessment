public class com.badlogic.gdx.utils.Sort {
	 /* # static fields */
	 private static com.badlogic.gdx.utils.Sort instance;
	 /* # instance fields */
	 private com.badlogic.gdx.utils.ComparableTimSort comparableTimSort;
	 private com.badlogic.gdx.utils.TimSort timSort;
	 /* # direct methods */
	 public com.badlogic.gdx.utils.Sort ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static com.badlogic.gdx.utils.Sort instance ( ) {
		 /* .locals 1 */
		 v0 = com.badlogic.gdx.utils.Sort.instance;
		 /* if-nez v0, :cond_0 */
		 /* new-instance v0, Lcom/badlogic/gdx/utils/Sort; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/utils/Sort;-><init>()V */
	 } // :cond_0
	 v0 = com.badlogic.gdx.utils.Sort.instance;
} // .end method
/* # virtual methods */
public void sort ( com.badlogic.gdx.utils.Array p0 ) {
	 /* .locals 4 */
	 v0 = this.comparableTimSort;
	 /* if-nez v0, :cond_0 */
	 /* new-instance v0, Lcom/badlogic/gdx/utils/ComparableTimSort; */
	 /* invoke-direct {v0}, Lcom/badlogic/gdx/utils/ComparableTimSort;-><init>()V */
	 this.comparableTimSort = v0;
} // :cond_0
v0 = this.comparableTimSort;
v1 = this.items;
int v2 = 0; // const/4 v2, 0x0
/* iget v3, p1, Lcom/badlogic/gdx/utils/Array;->size:I */
(( com.badlogic.gdx.utils.ComparableTimSort ) v0 ).doSort ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lcom/badlogic/gdx/utils/ComparableTimSort;->doSort([Ljava/lang/Object;II)V
return;
} // .end method
public void sort ( com.badlogic.gdx.utils.Array p0, java.util.Comparator p1 ) {
/* .locals 4 */
v0 = this.timSort;
/* if-nez v0, :cond_0 */
/* new-instance v0, Lcom/badlogic/gdx/utils/TimSort; */
/* invoke-direct {v0}, Lcom/badlogic/gdx/utils/TimSort;-><init>()V */
this.timSort = v0;
} // :cond_0
v0 = this.timSort;
v1 = this.items;
int v2 = 0; // const/4 v2, 0x0
/* iget v3, p1, Lcom/badlogic/gdx/utils/Array;->size:I */
(( com.badlogic.gdx.utils.TimSort ) v0 ).doSort ( v1, p2, v2, v3 ); // invoke-virtual {v0, v1, p2, v2, v3}, Lcom/badlogic/gdx/utils/TimSort;->doSort([Ljava/lang/Object;Ljava/util/Comparator;II)V
return;
} // .end method
public void sort ( java.lang.Object[] p0 ) {
/* .locals 3 */
v0 = this.comparableTimSort;
/* if-nez v0, :cond_0 */
/* new-instance v0, Lcom/badlogic/gdx/utils/ComparableTimSort; */
/* invoke-direct {v0}, Lcom/badlogic/gdx/utils/ComparableTimSort;-><init>()V */
this.comparableTimSort = v0;
} // :cond_0
v0 = this.comparableTimSort;
int v1 = 0; // const/4 v1, 0x0
/* array-length v2, p1 */
(( com.badlogic.gdx.utils.ComparableTimSort ) v0 ).doSort ( p1, v1, v2 ); // invoke-virtual {v0, p1, v1, v2}, Lcom/badlogic/gdx/utils/ComparableTimSort;->doSort([Ljava/lang/Object;II)V
return;
} // .end method
public void sort ( java.lang.Object[] p0, Integer p1, Integer p2 ) {
/* .locals 1 */
v0 = this.comparableTimSort;
/* if-nez v0, :cond_0 */
/* new-instance v0, Lcom/badlogic/gdx/utils/ComparableTimSort; */
/* invoke-direct {v0}, Lcom/badlogic/gdx/utils/ComparableTimSort;-><init>()V */
this.comparableTimSort = v0;
} // :cond_0
v0 = this.comparableTimSort;
(( com.badlogic.gdx.utils.ComparableTimSort ) v0 ).doSort ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Lcom/badlogic/gdx/utils/ComparableTimSort;->doSort([Ljava/lang/Object;II)V
return;
} // .end method
public void sort ( java.lang.Object[] p0, java.util.Comparator p1 ) {
/* .locals 3 */
v0 = this.timSort;
/* if-nez v0, :cond_0 */
/* new-instance v0, Lcom/badlogic/gdx/utils/TimSort; */
/* invoke-direct {v0}, Lcom/badlogic/gdx/utils/TimSort;-><init>()V */
this.timSort = v0;
} // :cond_0
v0 = this.timSort;
int v1 = 0; // const/4 v1, 0x0
/* array-length v2, p1 */
(( com.badlogic.gdx.utils.TimSort ) v0 ).doSort ( p1, p2, v1, v2 ); // invoke-virtual {v0, p1, p2, v1, v2}, Lcom/badlogic/gdx/utils/TimSort;->doSort([Ljava/lang/Object;Ljava/util/Comparator;II)V
return;
} // .end method
public void sort ( java.lang.Object[] p0, java.util.Comparator p1, Integer p2, Integer p3 ) {
/* .locals 1 */
v0 = this.timSort;
/* if-nez v0, :cond_0 */
/* new-instance v0, Lcom/badlogic/gdx/utils/TimSort; */
/* invoke-direct {v0}, Lcom/badlogic/gdx/utils/TimSort;-><init>()V */
this.timSort = v0;
} // :cond_0
v0 = this.timSort;
(( com.badlogic.gdx.utils.TimSort ) v0 ).doSort ( p1, p2, p3, p4 ); // invoke-virtual {v0, p1, p2, p3, p4}, Lcom/badlogic/gdx/utils/TimSort;->doSort([Ljava/lang/Object;Ljava/util/Comparator;II)V
return;
} // .end method
