public class com.wiyun.engine.filters.ColorMatrix extends com.wiyun.engine.BaseWYObject {
	 /* .source "ColorMatrix.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.filters.ColorMatrix ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 80 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 /* .line 81 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/filters/ColorMatrix;->nativeInit([F)V */
		 /* .line 82 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.filters.ColorMatrix ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 85 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseWYObject;-><init>(I)V */
		 /* .line 86 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.filters.ColorMatrix ( ) {
		 /* .locals 0 */
		 /* .param p1, "m" # [F */
		 /* .prologue */
		 /* .line 88 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 /* .line 89 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/filters/ColorMatrix;->nativeInit([F)V */
		 /* .line 90 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.filters.ColorMatrix from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 44 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/filters/ColorMatrix; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/filters/ColorMatrix;-><init>(I)V */
} // .end method
public static com.wiyun.engine.filters.ColorMatrix make ( ) {
/* .locals 1 */
/* .prologue */
/* .line 59 */
/* new-instance v0, Lcom/wiyun/engine/filters/ColorMatrix; */
/* invoke-direct {v0}, Lcom/wiyun/engine/filters/ColorMatrix;-><init>()V */
} // .end method
public static com.wiyun.engine.filters.ColorMatrix make ( Float[] p0 ) {
/* .locals 1 */
/* .param p0, "m" # [F */
/* .prologue */
/* .line 77 */
/* new-instance v0, Lcom/wiyun/engine/filters/ColorMatrix; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/filters/ColorMatrix;-><init>([F)V */
} // .end method
private native void nativeInit ( Float[] p0 ) {
} // .end method
/* # virtual methods */
public native getMatrix ( ) {
} // .end method
public native void postConcat ( com.wiyun.engine.filters.ColorMatrix p0 ) {
} // .end method
public native void preConcat ( com.wiyun.engine.filters.ColorMatrix p0 ) {
} // .end method
public native void reset ( ) {
} // .end method
public native void setConcat ( com.wiyun.engine.filters.ColorMatrix p0, com.wiyun.engine.filters.ColorMatrix p1 ) {
} // .end method
public native void setMatrix ( com.wiyun.engine.filters.ColorMatrix p0 ) {
} // .end method
public native void setMatrix ( Float[] p0 ) {
} // .end method
public native void setNegative ( ) {
} // .end method
public native void setRGB2YUV ( ) {
} // .end method
public native void setRotate ( Integer p0, Float p1 ) {
} // .end method
public native void setSaturation ( Float p0 ) {
} // .end method
public native void setScale ( Float p0, Float p1, Float p2, Float p3 ) {
} // .end method
public native void setYUV2RGB ( ) {
} // .end method
