public class com.wiyun.engine.filters.ColorFilter extends com.wiyun.engine.BaseWYObject {
	 /* .source "ColorFilter.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.filters.ColorFilter ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 23 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 /* .line 24 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.filters.ColorFilter ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 27 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseWYObject;-><init>(I)V */
		 /* .line 28 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.filters.ColorFilter from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 20 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/filters/ColorFilter; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/filters/ColorFilter;-><init>(I)V */
} // .end method
/* # virtual methods */
public native void apply ( Object[] p0, Integer p1, Integer p2 ) {
} // .end method
