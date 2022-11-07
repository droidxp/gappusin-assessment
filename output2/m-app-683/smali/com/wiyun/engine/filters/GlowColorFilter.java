public class com.wiyun.engine.filters.GlowColorFilter extends com.wiyun.engine.filters.ColorFilter {
	 /* .source "GlowColorFilter.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.filters.GlowColorFilter ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 34 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/filters/ColorFilter;-><init>(I)V */
		 /* .line 35 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.filters.GlowColorFilter ( ) {
		 /* .locals 0 */
		 /* .param p1, "color" # Lcom/wiyun/engine/types/WYColor3B; */
		 /* .param p2, "radius" # I */
		 /* .param p3, "highlightRadius" # I */
		 /* .param p4, "opacity" # I */
		 /* .prologue */
		 /* .line 27 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/filters/ColorFilter;-><init>()V */
		 /* .line 28 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Lcom/wiyun/engine/filters/GlowColorFilter;->nativeInit(Lcom/wiyun/engine/types/WYColor3B;III)V */
		 /* .line 29 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.filters.ColorFilter from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.filters.GlowColorFilter .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.filters.GlowColorFilter from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 20 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/filters/GlowColorFilter; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/filters/GlowColorFilter;-><init>(I)V */
} // .end method
public static com.wiyun.engine.filters.GlowColorFilter make ( com.wiyun.engine.types.WYColor3B p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 1 */
/* .param p0, "color" # Lcom/wiyun/engine/types/WYColor3B; */
/* .param p1, "radius" # I */
/* .param p2, "highlightRadius" # I */
/* .param p3, "opacity" # I */
/* .prologue */
/* .line 24 */
/* new-instance v0, Lcom/wiyun/engine/filters/GlowColorFilter; */
/* invoke-direct {v0, p0, p1, p2, p3}, Lcom/wiyun/engine/filters/GlowColorFilter;-><init>(Lcom/wiyun/engine/types/WYColor3B;III)V */
} // .end method
private native void nativeInit ( com.wiyun.engine.types.WYColor3B p0, Integer p1, Integer p2, Integer p3 ) {
} // .end method
/* # virtual methods */
public native Integer getHighlightRadius ( ) {
} // .end method
public native Integer getOpacity ( ) {
} // .end method
public native Integer getRadius ( ) {
} // .end method
public native void setHighlightRadius ( Integer p0 ) {
} // .end method
public native void setOpacity ( Integer p0 ) {
} // .end method
public native void setRadius ( Integer p0 ) {
} // .end method
