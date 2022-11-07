public class com.wiyun.engine.filters.MappingColorFilter extends com.wiyun.engine.filters.ColorFilter {
	 /* .source "MappingColorFilter.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.filters.MappingColorFilter ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 35 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/filters/ColorFilter;-><init>()V */
		 /* .line 36 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/filters/MappingColorFilter;->nativeInit()V */
		 /* .line 37 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.filters.MappingColorFilter ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 42 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/filters/ColorFilter;-><init>(I)V */
		 /* .line 43 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.filters.ColorFilter from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.filters.MappingColorFilter .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.filters.MappingColorFilter from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 28 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/filters/MappingColorFilter; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/filters/MappingColorFilter;-><init>(I)V */
} // .end method
public static com.wiyun.engine.filters.MappingColorFilter make ( ) {
/* .locals 1 */
/* .prologue */
/* .line 32 */
/* new-instance v0, Lcom/wiyun/engine/filters/MappingColorFilter; */
/* invoke-direct {v0}, Lcom/wiyun/engine/filters/MappingColorFilter;-><init>()V */
} // .end method
private native void nativeInit ( ) {
} // .end method
/* # virtual methods */
public native void mapColor ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
} // .end method
public native void unmapColor ( Integer p0 ) {
} // .end method
