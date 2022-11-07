public class com.wiyun.engine.utils.VerletRope extends com.wiyun.engine.BaseWYObject {
	 /* .source "VerletRope.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.utils.VerletRope ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 50 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseWYObject;-><init>(I)V */
		 /* .line 51 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.utils.VerletRope ( ) {
		 /* .locals 0 */
		 /* .param p1, "a" # Lcom/wiyun/engine/types/WYPoint; */
		 /* .param p2, "b" # Lcom/wiyun/engine/types/WYPoint; */
		 /* .param p3, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
		 /* .param p4, "length" # I */
		 /* .prologue */
		 /* .line 45 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 /* .line 46 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Lcom/wiyun/engine/utils/VerletRope;->nativeInit(Lcom/wiyun/engine/types/WYPoint;Lcom/wiyun/engine/types/WYPoint;Lcom/wiyun/engine/opengl/Texture2D;I)V */
		 /* .line 47 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.utils.VerletRope from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 42 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/utils/VerletRope; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/utils/VerletRope;-><init>(I)V */
} // .end method
public static com.wiyun.engine.utils.VerletRope make ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1, com.wiyun.engine.opengl.Texture2D p2 ) {
/* .locals 1 */
/* .param p0, "a" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p1, "b" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p2, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
/* .prologue */
/* .line 26 */
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.utils.VerletRope .make ( p0,p1,p2,v0 );
} // .end method
public static com.wiyun.engine.utils.VerletRope make ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1, com.wiyun.engine.opengl.Texture2D p2, Integer p3 ) {
/* .locals 1 */
/* .param p0, "a" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p1, "b" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p2, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
/* .param p3, "length" # I */
/* .prologue */
/* .line 38 */
/* new-instance v0, Lcom/wiyun/engine/utils/VerletRope; */
/* invoke-direct {v0, p0, p1, p2, p3}, Lcom/wiyun/engine/utils/VerletRope;-><init>(Lcom/wiyun/engine/types/WYPoint;Lcom/wiyun/engine/types/WYPoint;Lcom/wiyun/engine/opengl/Texture2D;I)V */
} // .end method
private native void nativeGetColor ( com.wiyun.engine.types.WYColor3B p0 ) {
} // .end method
private native Integer nativeGetPointAt ( Integer p0 ) {
} // .end method
private native Integer nativeGetStickAt ( Integer p0 ) {
} // .end method
private native void nativeInit ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1, com.wiyun.engine.opengl.Texture2D p2, Integer p3 ) {
} // .end method
private native Integer nativeSubRope ( Integer p0, Integer p1 ) {
} // .end method
/* # virtual methods */
public native void changeLength ( Float p0 ) {
} // .end method
public native void draw ( ) {
} // .end method
public native Integer getAlpha ( ) {
} // .end method
public com.wiyun.engine.types.WYColor3B getColor ( ) {
/* .locals 1 */
/* .prologue */
/* .line 152 */
/* new-instance v0, Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYColor3B;-><init>()V */
/* .line 153 */
/* .local v0, "c":Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/utils/VerletRope;->nativeGetColor(Lcom/wiyun/engine/types/WYColor3B;)V */
/* .line 154 */
} // .end method
public native Float getCurrentLength ( ) {
} // .end method
public native Float getLength ( ) {
} // .end method
public com.wiyun.engine.utils.VerletPoint getPointAt ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "index" # I */
/* .prologue */
/* .line 115 */
v0 = /* invoke-direct {p0, p1}, Lcom/wiyun/engine/utils/VerletRope;->nativeGetPointAt(I)I */
com.wiyun.engine.utils.VerletPoint .from ( v0 );
} // .end method
public native Integer getPointCount ( ) {
} // .end method
public native getPoints ( ) {
} // .end method
public com.wiyun.engine.utils.VerletStick getStickAt ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "index" # I */
/* .prologue */
/* .line 90 */
v0 = /* invoke-direct {p0, p1}, Lcom/wiyun/engine/utils/VerletRope;->nativeGetStickAt(I)I */
com.wiyun.engine.utils.VerletStick .from ( v0 );
} // .end method
public native Integer getStickCount ( ) {
} // .end method
public native getSticks ( ) {
} // .end method
public native Boolean isStretched ( ) {
} // .end method
public native Integer rayCast ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1 ) {
} // .end method
public native void reset ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1 ) {
} // .end method
public native void setAlpha ( Integer p0 ) {
} // .end method
public native void setColor ( com.wiyun.engine.types.WYColor3B p0 ) {
} // .end method
public native void setColor ( com.wiyun.engine.types.WYColor4B p0 ) {
} // .end method
public com.wiyun.engine.utils.VerletRope subRope ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* .param p1, "startPoint" # I */
/* .param p2, "endPoint" # I */
/* .prologue */
/* .line 204 */
v0 = /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/utils/VerletRope;->nativeSubRope(II)I */
com.wiyun.engine.utils.VerletRope .from ( v0 );
} // .end method
public native void update ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1, Float p2 ) {
} // .end method
