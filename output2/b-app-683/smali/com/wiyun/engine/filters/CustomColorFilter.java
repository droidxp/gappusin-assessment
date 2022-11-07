public class com.wiyun.engine.filters.CustomColorFilter extends com.wiyun.engine.filters.ColorFilter {
	 /* .source "CustomColorFilter.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/wiyun/engine/filters/CustomColorFilter$IColorFilterDelegate; */
	 /* } */
} // .end annotation
/* # direct methods */
protected com.wiyun.engine.filters.CustomColorFilter ( ) {
	 /* .locals 0 */
	 /* .param p1, "pointer" # I */
	 /* .prologue */
	 /* .line 51 */
	 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/filters/ColorFilter;-><init>(I)V */
	 /* .line 52 */
	 return;
} // .end method
protected com.wiyun.engine.filters.CustomColorFilter ( ) {
	 /* .locals 0 */
	 /* .param p1, "delegate" # Lcom/wiyun/engine/filters/CustomColorFilter$IColorFilterDelegate; */
	 /* .prologue */
	 /* .line 44 */
	 /* invoke-direct {p0}, Lcom/wiyun/engine/filters/ColorFilter;-><init>()V */
	 /* .line 45 */
	 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/filters/CustomColorFilter;->nativeInit(Lcom/wiyun/engine/filters/CustomColorFilter$IColorFilterDelegate;)V */
	 /* .line 46 */
	 return;
} // .end method
public static com.wiyun.engine.filters.ColorFilter from ( Integer p0 ) { //bridge//synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 1 */
	 com.wiyun.engine.filters.CustomColorFilter .from ( p0 );
} // .end method
public static com.wiyun.engine.filters.CustomColorFilter from ( Integer p0 ) {
	 /* .locals 1 */
	 /* .param p0, "pointer" # I */
	 /* .prologue */
	 /* .line 37 */
	 /* if-nez p0, :cond_0 */
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/filters/CustomColorFilter; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/filters/CustomColorFilter;-><init>(I)V */
} // .end method
public static com.wiyun.engine.filters.CustomColorFilter make ( com.wiyun.engine.filters.CustomColorFilter$IColorFilterDelegate p0 ) {
/* .locals 1 */
/* .param p0, "delegate" # Lcom/wiyun/engine/filters/CustomColorFilter$IColorFilterDelegate; */
/* .prologue */
/* .line 41 */
/* new-instance v0, Lcom/wiyun/engine/filters/CustomColorFilter; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/filters/CustomColorFilter;-><init>(Lcom/wiyun/engine/filters/CustomColorFilter$IColorFilterDelegate;)V */
} // .end method
private native void nativeInit ( com.wiyun.engine.filters.CustomColorFilter$IColorFilterDelegate p0 ) {
} // .end method
/* # virtual methods */
public native void setDelegate ( com.wiyun.engine.filters.CustomColorFilter$IColorFilterDelegate p0 ) {
} // .end method
