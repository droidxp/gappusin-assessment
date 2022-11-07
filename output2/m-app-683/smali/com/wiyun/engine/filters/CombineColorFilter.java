public class com.wiyun.engine.filters.CombineColorFilter extends com.wiyun.engine.filters.ColorFilter {
	 /* .source "CombineColorFilter.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.filters.CombineColorFilter ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 40 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/filters/ColorFilter;-><init>()V */
		 /* .line 41 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.filters.CombineColorFilter ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 50 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/filters/ColorFilter;-><init>(I)V */
		 /* .line 51 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.filters.CombineColorFilter ( ) {
		 /* .locals 0 */
		 /* .param p1, "filter1" # Lcom/wiyun/engine/filters/ColorFilter; */
		 /* .param p2, "filters" # [Lcom/wiyun/engine/filters/ColorFilter; */
		 /* .prologue */
		 /* .line 43 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/filters/ColorFilter;-><init>()V */
		 /* .line 44 */
		 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/filters/CombineColorFilter;->nativeInit(Lcom/wiyun/engine/filters/ColorFilter;[Lcom/wiyun/engine/filters/ColorFilter;)V */
		 /* .line 45 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.filters.ColorFilter from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.filters.CombineColorFilter .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.filters.CombineColorFilter from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 20 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/filters/CombineColorFilter; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/filters/CombineColorFilter;-><init>(I)V */
} // .end method
public static com.wiyun.engine.filters.CombineColorFilter make ( com.wiyun.engine.filters.ColorFilter p0, com.wiyun.engine.filters.ColorFilter...p1 ) {
/* .locals 1 */
/* .param p0, "filter1" # Lcom/wiyun/engine/filters/ColorFilter; */
/* .param p1, "filters" # [Lcom/wiyun/engine/filters/ColorFilter; */
/* .prologue */
/* .line 37 */
/* new-instance v0, Lcom/wiyun/engine/filters/CombineColorFilter; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/filters/CombineColorFilter;-><init>(Lcom/wiyun/engine/filters/ColorFilter;[Lcom/wiyun/engine/filters/ColorFilter;)V */
} // .end method
private native void nativeInit ( com.wiyun.engine.filters.ColorFilter p0, com.wiyun.engine.filters.ColorFilter[] p1 ) {
} // .end method
/* # virtual methods */
public native void addFilter ( com.wiyun.engine.filters.ColorFilter p0 ) {
} // .end method
