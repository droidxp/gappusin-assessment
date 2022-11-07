public class com.wiyun.engine.filters.LightingColorFilter extends com.wiyun.engine.filters.ColorFilter {
	 /* .source "LightingColorFilter.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.filters.LightingColorFilter ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 30 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/filters/ColorFilter;-><init>()V */
		 /* .line 31 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.filters.LightingColorFilter ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 40 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/filters/ColorFilter;-><init>(I)V */
		 /* .line 41 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.filters.LightingColorFilter ( ) {
		 /* .locals 0 */
		 /* .param p1, "mul" # I */
		 /* .param p2, "add" # I */
		 /* .prologue */
		 /* .line 33 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/filters/ColorFilter;-><init>()V */
		 /* .line 34 */
		 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/filters/LightingColorFilter;->nativeInit(II)V */
		 /* .line 35 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.filters.ColorFilter from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.filters.LightingColorFilter .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.filters.LightingColorFilter from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 23 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/filters/LightingColorFilter; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/filters/LightingColorFilter;-><init>(I)V */
} // .end method
public static com.wiyun.engine.filters.LightingColorFilter make ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* .param p0, "mul" # I */
/* .param p1, "add" # I */
/* .prologue */
/* .line 27 */
/* new-instance v0, Lcom/wiyun/engine/filters/LightingColorFilter; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/filters/LightingColorFilter;-><init>(II)V */
} // .end method
private native void nativeInit ( Integer p0, Integer p1 ) {
} // .end method
