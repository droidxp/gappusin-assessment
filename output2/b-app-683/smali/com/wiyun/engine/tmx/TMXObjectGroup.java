public class com.wiyun.engine.tmx.TMXObjectGroup extends com.wiyun.engine.BaseWYObject {
	 /* .source "TMXObjectGroup.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.tmx.TMXObjectGroup ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 17 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 /* .line 18 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/tmx/TMXObjectGroup;->nativeInit()V */
		 /* .line 19 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.tmx.TMXObjectGroup ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 22 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseWYObject;-><init>(I)V */
		 /* .line 23 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.tmx.TMXObjectGroup from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 14 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/tmx/TMXObjectGroup; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/tmx/TMXObjectGroup;-><init>(I)V */
} // .end method
private native Integer nativeGetObject ( java.lang.String p0 ) {
} // .end method
private native Integer nativeGetObjectAt ( Integer p0 ) {
} // .end method
private native void nativeInit ( ) {
} // .end method
/* # virtual methods */
public native void addProperty ( java.lang.String p0, java.lang.String p1 ) {
} // .end method
public native Integer getColor ( ) {
} // .end method
public native java.lang.String getName ( ) {
} // .end method
public com.wiyun.engine.tmx.TMXObject getObject ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 71 */
v0 = /* invoke-direct {p0, p1}, Lcom/wiyun/engine/tmx/TMXObjectGroup;->nativeGetObject(Ljava/lang/String;)I */
com.wiyun.engine.tmx.TMXObject .from ( v0 );
} // .end method
public com.wiyun.engine.tmx.TMXObject getObjectAt ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "index" # I */
/* .prologue */
/* .line 92 */
v0 = /* invoke-direct {p0, p1}, Lcom/wiyun/engine/tmx/TMXObjectGroup;->nativeGetObjectAt(I)I */
com.wiyun.engine.tmx.TMXObject .from ( v0 );
} // .end method
public native Integer getObjectCount ( ) {
} // .end method
public native Float getOffsetX ( ) {
} // .end method
public native Float getOffsetY ( ) {
} // .end method
public native Float getOpacity ( ) {
} // .end method
public native java.lang.String getProperty ( java.lang.String p0 ) {
} // .end method
public native void setColor ( Integer p0 ) {
} // .end method
public native void setName ( java.lang.String p0 ) {
} // .end method
public native void setOffsetX ( Float p0 ) {
} // .end method
public native void setOffsetY ( Float p0 ) {
} // .end method
public native void setOpacity ( Float p0 ) {
} // .end method
