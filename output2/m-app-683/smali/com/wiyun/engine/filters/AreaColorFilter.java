public class com.wiyun.engine.filters.AreaColorFilter extends com.wiyun.engine.filters.ColorFilter {
	 /* .source "AreaColorFilter.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.filters.AreaColorFilter ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 25 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/filters/ColorFilter;-><init>()V */
		 /* .line 26 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/filters/AreaColorFilter;->nativeInit()V */
		 /* .line 27 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.filters.AreaColorFilter ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 32 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/filters/ColorFilter;-><init>(I)V */
		 /* .line 33 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.filters.AreaColorFilter from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 18 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/filters/AreaColorFilter; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/filters/AreaColorFilter;-><init>(I)V */
} // .end method
public static com.wiyun.engine.filters.ColorFilter from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.filters.AreaColorFilter .from ( p0 );
} // .end method
public static com.wiyun.engine.filters.AreaColorFilter make ( ) {
/* .locals 1 */
/* .prologue */
/* .line 22 */
/* new-instance v0, Lcom/wiyun/engine/filters/AreaColorFilter; */
/* invoke-direct {v0}, Lcom/wiyun/engine/filters/AreaColorFilter;-><init>()V */
} // .end method
private native void nativeInit ( ) {
} // .end method
/* # virtual methods */
public native void mapCircle ( Integer p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer p5, Integer p6 ) {
} // .end method
public native void mapLine ( Integer p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer p5, Integer p6, Integer p7 ) {
} // .end method
public native void mapPoint ( Integer p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer p5 ) {
} // .end method
public native void mapRect ( Integer p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer p5, Integer p6, Integer p7 ) {
} // .end method
public native void removeCircle ( Integer p0, Integer p1, Integer p2 ) {
} // .end method
public native void removeLine ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
} // .end method
public native void removePoint ( Integer p0, Integer p1 ) {
} // .end method
public native void removeRect ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
} // .end method
