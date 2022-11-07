public class org.anddev.andengine.util.ListUtils {
	 /* # direct methods */
	 public org.anddev.andengine.util.ListUtils ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static java.util.ArrayList toList ( java.lang.Object p0 ) {
		 /* .locals 1 */
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 (( java.util.ArrayList ) v0 ).add ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
	 } // .end method
	 public static java.util.ArrayList toList ( java.lang.Object...p0 ) {
		 /* .locals 4 */
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 /* array-length v1, p0 */
		 int v2 = 0; // const/4 v2, 0x0
	 } // :goto_0
	 /* if-lt v2, v1, :cond_0 */
} // :cond_0
/* aget-object v3, p0, v2 */
(( java.util.ArrayList ) v0 ).add ( v3 ); // invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* add-int/lit8 v2, v2, 0x1 */
} // .end method
