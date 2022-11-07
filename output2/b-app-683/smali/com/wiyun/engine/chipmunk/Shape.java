public class com.wiyun.engine.chipmunk.Shape {
	 /* .source "Shape.java" */
	 /* # instance fields */
	 Integer mPointer;
	 /* # direct methods */
	 protected com.wiyun.engine.chipmunk.Shape ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 24 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 25 */
		 /* iput p1, p0, Lcom/wiyun/engine/chipmunk/Shape;->mPointer:I */
		 /* .line 26 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.chipmunk.Shape ( ) {
		 /* .locals 0 */
		 /* .param p1, "body" # Lcom/wiyun/engine/chipmunk/Body; */
		 /* .prologue */
		 /* .line 21 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 22 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.chipmunk.Shape from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 15 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/chipmunk/Shape; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/chipmunk/Shape;-><init>(I)V */
} // .end method
private native Integer nativeGetBody ( ) {
} // .end method
private native Integer nativeGetTexture ( ) {
} // .end method
public static native void resetShapeIdCounter ( ) {
} // .end method
/* # virtual methods */
public native void clearAnimation ( ) {
} // .end method
public native void destroy ( ) {
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 3 */
/* .param p1, "o" # Ljava/lang/Object; */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 34 */
/* instance-of v1, p1, Lcom/wiyun/engine/chipmunk/Shape; */
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 35 */
	 /* check-cast p1, Lcom/wiyun/engine/chipmunk/Shape; */
} // .end local p1 # "o":Ljava/lang/Object;
/* iget v1, p1, Lcom/wiyun/engine/chipmunk/Shape;->mPointer:I */
/* iget v2, p0, Lcom/wiyun/engine/chipmunk/Shape;->mPointer:I */
/* if-ne v1, v2, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
/* .line 37 */
} // :cond_0
} // .end method
public com.wiyun.engine.chipmunk.Body getBody ( ) {
/* .locals 1 */
/* .prologue */
/* .line 75 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/chipmunk/Shape;->nativeGetBody()I */
com.wiyun.engine.chipmunk.Body .from ( v0 );
} // .end method
public native void getBoundingBox ( com.wiyun.engine.types.WYRect p0 ) {
} // .end method
public native Integer getCollisionType ( ) {
} // .end method
public native java.lang.Object getData ( ) {
} // .end method
public native Integer getGroup ( ) {
} // .end method
public native Integer getLayerMask ( ) {
} // .end method
public com.wiyun.engine.types.WYPoint getSurfaceVelocity ( ) {
/* .locals 2 */
/* .prologue */
/* .line 148 */
v0 = (( com.wiyun.engine.chipmunk.Shape ) p0 ).getSurfaceVelocityX ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/chipmunk/Shape;->getSurfaceVelocityX()F
v1 = (( com.wiyun.engine.chipmunk.Shape ) p0 ).getSurfaceVelocityY ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/chipmunk/Shape;->getSurfaceVelocityY()F
com.wiyun.engine.types.WYPoint .make ( v0,v1 );
} // .end method
public native Float getSurfaceVelocityX ( ) {
} // .end method
public native Float getSurfaceVelocityY ( ) {
} // .end method
public com.wiyun.engine.opengl.Texture2D getTexture ( ) {
/* .locals 1 */
/* .prologue */
/* .line 204 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/chipmunk/Shape;->nativeGetTexture()I */
com.wiyun.engine.opengl.Texture2D .from ( v0 );
} // .end method
public Integer hashCode ( ) {
/* .locals 1 */
/* .prologue */
/* .line 42 */
/* iget v0, p0, Lcom/wiyun/engine/chipmunk/Shape;->mPointer:I */
} // .end method
public native Boolean isSensor ( ) {
} // .end method
public native void setCollisionType ( Integer p0 ) {
} // .end method
public native void setData ( java.lang.Object p0 ) {
} // .end method
public native void setFriction ( Float p0 ) {
} // .end method
public native void setGroup ( Integer p0 ) {
} // .end method
public native void setIsSensor ( Boolean p0 ) {
} // .end method
public native void setLayerMask ( Integer p0 ) {
} // .end method
public void setPointer ( Integer p0 ) {
/* .locals 0 */
/* .param p1, "pointer" # I */
/* .prologue */
/* .line 29 */
/* iput p1, p0, Lcom/wiyun/engine/chipmunk/Shape;->mPointer:I */
/* .line 30 */
return;
} // .end method
public native void setRestitution ( Float p0 ) {
} // .end method
public native void setSurfaceVelocity ( Float p0, Float p1 ) {
} // .end method
public void setTexture ( com.wiyun.engine.opengl.Texture2D p0 ) {
/* .locals 1 */
/* .param p1, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
/* .prologue */
/* .line 215 */
int v0 = 0; // const/4 v0, 0x0
(( com.wiyun.engine.chipmunk.Shape ) p0 ).setTexture ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/wiyun/engine/chipmunk/Shape;->setTexture(Lcom/wiyun/engine/opengl/Texture2D;Z)V
/* .line 216 */
return;
} // .end method
public void setTexture ( com.wiyun.engine.opengl.Texture2D p0, com.wiyun.engine.types.WYRect p1 ) {
/* .locals 1 */
/* .param p1, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
/* .param p2, "rect" # Lcom/wiyun/engine/types/WYRect; */
/* .prologue */
/* .line 234 */
int v0 = 0; // const/4 v0, 0x0
(( com.wiyun.engine.chipmunk.Shape ) p0 ).setTexture ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Lcom/wiyun/engine/chipmunk/Shape;->setTexture(Lcom/wiyun/engine/opengl/Texture2D;Lcom/wiyun/engine/types/WYRect;Z)V
/* .line 235 */
return;
} // .end method
public native void setTexture ( com.wiyun.engine.opengl.Texture2D p0, com.wiyun.engine.types.WYRect p1, Boolean p2 ) {
} // .end method
public native void setTexture ( com.wiyun.engine.opengl.Texture2D p0, Boolean p1 ) {
} // .end method
public native void setTextureRect ( com.wiyun.engine.types.WYRect p0 ) {
} // .end method
public void startAnimation ( com.wiyun.engine.chipmunk.ShapeAnimation p0 ) {
/* .locals 0 */
/* .param p1, "anim" # Lcom/wiyun/engine/chipmunk/ShapeAnimation; */
/* .prologue */
/* .line 56 */
(( com.wiyun.engine.chipmunk.ShapeAnimation ) p1 ).start ( p0 ); // invoke-virtual {p1, p0}, Lcom/wiyun/engine/chipmunk/ShapeAnimation;->start(Lcom/wiyun/engine/chipmunk/Shape;)V
/* .line 57 */
return;
} // .end method
public native void updateBoundingBox ( ) {
} // .end method
