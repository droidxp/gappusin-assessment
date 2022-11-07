public class com.wiyun.engine.filters.ColorMatrixColorFilter extends com.wiyun.engine.filters.ColorFilter {
	 /* .source "ColorMatrixColorFilter.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.filters.ColorMatrixColorFilter ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 25 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/filters/ColorFilter;-><init>()V */
		 /* .line 26 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.filters.ColorMatrixColorFilter ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 35 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/filters/ColorFilter;-><init>(I)V */
		 /* .line 36 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.filters.ColorMatrixColorFilter ( ) {
		 /* .locals 0 */
		 /* .param p1, "m" # Lcom/wiyun/engine/filters/ColorMatrix; */
		 /* .prologue */
		 /* .line 28 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/filters/ColorFilter;-><init>()V */
		 /* .line 29 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/filters/ColorMatrixColorFilter;->nativeInit(Lcom/wiyun/engine/filters/ColorMatrix;)V */
		 /* .line 30 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.filters.ColorFilter from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.filters.ColorMatrixColorFilter .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.filters.ColorMatrixColorFilter from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 18 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/filters/ColorMatrixColorFilter; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/filters/ColorMatrixColorFilter;-><init>(I)V */
} // .end method
public static com.wiyun.engine.filters.ColorMatrixColorFilter make ( com.wiyun.engine.filters.ColorMatrix p0 ) {
/* .locals 1 */
/* .param p0, "m" # Lcom/wiyun/engine/filters/ColorMatrix; */
/* .prologue */
/* .line 22 */
/* new-instance v0, Lcom/wiyun/engine/filters/ColorMatrixColorFilter; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/filters/ColorMatrixColorFilter;-><init>(Lcom/wiyun/engine/filters/ColorMatrix;)V */
} // .end method
private native void nativeInit ( com.wiyun.engine.filters.ColorMatrix p0 ) {
} // .end method
