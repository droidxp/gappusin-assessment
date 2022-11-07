public class com.wiyun.engine.utils.BitmapFont extends com.wiyun.engine.BaseObject {
	 /* .source "BitmapFont.java" */
	 /* # static fields */
	 public static final Integer BFF_ANGELCODE_TXT;
	 public static final Integer BFF_ANGELCODE_XML;
	 public static final Integer BFF_HGE;
	 /* # direct methods */
	 public com.wiyun.engine.utils.BitmapFont ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 18 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseObject;-><init>()V */
		 return;
	 } // .end method
	 protected com.wiyun.engine.utils.BitmapFont ( ) {
		 /* .locals 0 */
		 /* .param p1, "resId" # I */
		 /* .param p2, "format" # I */
		 /* .prologue */
		 /* .line 30 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseObject;-><init>()V */
		 /* .line 31 */
		 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/utils/BitmapFont;->nativeInit(II)V */
		 /* .line 32 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.utils.BitmapFont ( ) {
		 /* .locals 0 */
		 /* .param p1, "path" # Ljava/lang/String; */
		 /* .param p2, "isFile" # Z */
		 /* .param p3, "format" # I */
		 /* .param p4, "inDensity" # F */
		 /* .prologue */
		 /* .line 43 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseObject;-><init>()V */
		 /* .line 44 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Lcom/wiyun/engine/utils/BitmapFont;->nativeInit(Ljava/lang/String;ZIF)V */
		 /* .line 45 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.utils.BitmapFont loadFont ( Integer p0 ) {
		 /* .locals 2 */
		 /* .param p0, "resId" # I */
		 /* .prologue */
		 /* .line 59 */
		 /* new-instance v0, Lcom/wiyun/engine/utils/BitmapFont; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {v0, p0, v1}, Lcom/wiyun/engine/utils/BitmapFont;-><init>(II)V */
	 } // .end method
	 public static com.wiyun.engine.utils.BitmapFont loadFont ( Integer p0, Integer p1 ) {
		 /* .locals 1 */
		 /* .param p0, "resId" # I */
		 /* .param p1, "format" # I */
		 /* .prologue */
		 /* .line 77 */
		 /* new-instance v0, Lcom/wiyun/engine/utils/BitmapFont; */
		 /* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/utils/BitmapFont;-><init>(II)V */
	 } // .end method
	 public static com.wiyun.engine.utils.BitmapFont loadFont ( java.lang.String p0, Boolean p1 ) {
		 /* .locals 3 */
		 /* .param p0, "path" # Ljava/lang/String; */
		 /* .param p1, "isFile" # Z */
		 /* .prologue */
		 /* .line 96 */
		 /* new-instance v0, Lcom/wiyun/engine/utils/BitmapFont; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* const/high16 v2, 0x3f800000 # 1.0f */
		 /* invoke-direct {v0, p0, p1, v1, v2}, Lcom/wiyun/engine/utils/BitmapFont;-><init>(Ljava/lang/String;ZIF)V */
	 } // .end method
	 public static com.wiyun.engine.utils.BitmapFont loadFont ( java.lang.String p0, Boolean p1, Integer p2 ) {
		 /* .locals 2 */
		 /* .param p0, "path" # Ljava/lang/String; */
		 /* .param p1, "isFile" # Z */
		 /* .param p2, "format" # I */
		 /* .prologue */
		 /* .line 118 */
		 /* new-instance v0, Lcom/wiyun/engine/utils/BitmapFont; */
		 /* const/high16 v1, 0x3f800000 # 1.0f */
		 /* invoke-direct {v0, p0, p1, p2, v1}, Lcom/wiyun/engine/utils/BitmapFont;-><init>(Ljava/lang/String;ZIF)V */
	 } // .end method
	 public static com.wiyun.engine.utils.BitmapFont loadFont ( java.lang.String p0, Boolean p1, Integer p2, Float p3 ) {
		 /* .locals 1 */
		 /* .param p0, "path" # Ljava/lang/String; */
		 /* .param p1, "isFile" # Z */
		 /* .param p2, "format" # I */
		 /* .param p3, "inDensity" # F */
		 /* .prologue */
		 /* .line 142 */
		 /* new-instance v0, Lcom/wiyun/engine/utils/BitmapFont; */
		 /* invoke-direct {v0, p0, p1, p2, p3}, Lcom/wiyun/engine/utils/BitmapFont;-><init>(Ljava/lang/String;ZIF)V */
	 } // .end method
	 private native void nativeInit ( Integer p0, Integer p1 ) {
	 } // .end method
	 private native void nativeInit ( java.lang.String p0, Boolean p1, Integer p2, Float p3 ) {
	 } // .end method
	 public static native void unloadFont ( com.wiyun.engine.utils.BitmapFont p0 ) {
	 } // .end method
