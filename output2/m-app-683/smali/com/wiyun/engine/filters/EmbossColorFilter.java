public class com.wiyun.engine.filters.EmbossColorFilter extends com.wiyun.engine.filters.ColorFilter {
	 /* .source "EmbossColorFilter.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.filters.EmbossColorFilter ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 32 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/filters/ColorFilter;-><init>(I)V */
		 /* .line 33 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.filters.EmbossColorFilter ( ) {
		 /* .locals 0 */
		 /* .param p1, "grayLevel" # I */
		 /* .param p2, "dummy" # I */
		 /* .prologue */
		 /* .line 25 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/filters/ColorFilter;-><init>()V */
		 /* .line 26 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/filters/EmbossColorFilter;->nativeInit(I)V */
		 /* .line 27 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.filters.ColorFilter from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.filters.EmbossColorFilter .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.filters.EmbossColorFilter from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 18 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/filters/EmbossColorFilter; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/filters/EmbossColorFilter;-><init>(I)V */
} // .end method
public static com.wiyun.engine.filters.EmbossColorFilter make ( Integer p0 ) {
/* .locals 2 */
/* .param p0, "grayLevel" # I */
/* .prologue */
/* .line 22 */
/* new-instance v0, Lcom/wiyun/engine/filters/EmbossColorFilter; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p0, v1}, Lcom/wiyun/engine/filters/EmbossColorFilter;-><init>(II)V */
} // .end method
private native void nativeInit ( Integer p0 ) {
} // .end method
/* # virtual methods */
public native Integer getGrayLevel ( ) {
} // .end method
public native void setGrayLevel ( Integer p0 ) {
} // .end method
