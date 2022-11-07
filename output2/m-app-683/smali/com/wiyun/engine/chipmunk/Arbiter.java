public class com.wiyun.engine.chipmunk.Arbiter {
	 /* .source "Arbiter.java" */
	 /* # instance fields */
	 Integer mPointer;
	 /* # direct methods */
	 protected com.wiyun.engine.chipmunk.Arbiter ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 19 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 20 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.chipmunk.Arbiter ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 22 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 23 */
		 /* iput p1, p0, Lcom/wiyun/engine/chipmunk/Arbiter;->mPointer:I */
		 /* .line 24 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.chipmunk.Arbiter from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 13 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/chipmunk/Arbiter; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/chipmunk/Arbiter;-><init>(I)V */
} // .end method
private native Float getContactPointX ( Integer p0 ) {
} // .end method
private native Float getContactPointY ( Integer p0 ) {
} // .end method
private native Float getNormalX ( Integer p0 ) {
} // .end method
private native Float getNormalY ( Integer p0 ) {
} // .end method
private native Float getTotalImpulseWithFrictionX ( ) {
} // .end method
private native Float getTotalImpulseWithFrictionY ( ) {
} // .end method
private native Float getTotalImpulseX ( ) {
} // .end method
private native Float getTotalImpulseY ( ) {
} // .end method
private native Integer nativeGetShapeA ( ) {
} // .end method
private native Integer nativeGetShapeB ( ) {
} // .end method
/* # virtual methods */
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 3 */
/* .param p1, "o" # Ljava/lang/Object; */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 32 */
/* instance-of v1, p1, Lcom/wiyun/engine/chipmunk/Arbiter; */
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 33 */
	 /* check-cast p1, Lcom/wiyun/engine/chipmunk/Arbiter; */
} // .end local p1 # "o":Ljava/lang/Object;
/* iget v1, p1, Lcom/wiyun/engine/chipmunk/Arbiter;->mPointer:I */
/* iget v2, p0, Lcom/wiyun/engine/chipmunk/Arbiter;->mPointer:I */
/* if-ne v1, v2, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
/* .line 35 */
} // :cond_0
} // .end method
public com.wiyun.engine.types.WYPoint getContactPoint ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "contactIndex" # I */
/* .prologue */
/* .line 82 */
v0 = /* invoke-direct {p0, p1}, Lcom/wiyun/engine/chipmunk/Arbiter;->getContactPointX(I)F */
v1 = /* invoke-direct {p0, p1}, Lcom/wiyun/engine/chipmunk/Arbiter;->getContactPointY(I)F */
com.wiyun.engine.types.WYPoint .make ( v0,v1 );
} // .end method
public native Integer getContactPointCount ( ) {
} // .end method
public com.wiyun.engine.types.WYPoint getNormal ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "contactIndex" # I */
/* .prologue */
/* .line 72 */
v0 = /* invoke-direct {p0, p1}, Lcom/wiyun/engine/chipmunk/Arbiter;->getNormalX(I)F */
v1 = /* invoke-direct {p0, p1}, Lcom/wiyun/engine/chipmunk/Arbiter;->getNormalY(I)F */
com.wiyun.engine.types.WYPoint .make ( v0,v1 );
} // .end method
public com.wiyun.engine.chipmunk.Shape getShapeA ( ) {
/* .locals 2 */
/* .prologue */
/* .line 50 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/chipmunk/Arbiter;->nativeGetShapeA()I */
/* .line 51 */
/* .local v0, "pointer":I */
com.wiyun.engine.chipmunk.Shape .from ( v0 );
} // .end method
public com.wiyun.engine.chipmunk.Shape getShapeB ( ) {
/* .locals 2 */
/* .prologue */
/* .line 61 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/chipmunk/Arbiter;->nativeGetShapeB()I */
/* .line 62 */
/* .local v0, "pointer":I */
com.wiyun.engine.chipmunk.Shape .from ( v0 );
} // .end method
public native Integer getTimeStamp ( ) {
} // .end method
public com.wiyun.engine.types.WYPoint getTotalImpulse ( ) {
/* .locals 2 */
/* .prologue */
/* .line 106 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/chipmunk/Arbiter;->getTotalImpulseX()F */
v1 = /* invoke-direct {p0}, Lcom/wiyun/engine/chipmunk/Arbiter;->getTotalImpulseY()F */
com.wiyun.engine.types.WYPoint .make ( v0,v1 );
} // .end method
public com.wiyun.engine.types.WYPoint getTotalImpulseWithFriction ( ) {
/* .locals 2 */
/* .prologue */
/* .line 121 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/chipmunk/Arbiter;->getTotalImpulseWithFrictionX()F */
v1 = /* invoke-direct {p0}, Lcom/wiyun/engine/chipmunk/Arbiter;->getTotalImpulseWithFrictionY()F */
com.wiyun.engine.types.WYPoint .make ( v0,v1 );
} // .end method
public Integer hashCode ( ) {
/* .locals 1 */
/* .prologue */
/* .line 40 */
/* iget v0, p0, Lcom/wiyun/engine/chipmunk/Arbiter;->mPointer:I */
} // .end method
public native Boolean isFirstContact ( ) {
} // .end method
public void setPointer ( Integer p0 ) {
/* .locals 0 */
/* .param p1, "pointer" # I */
/* .prologue */
/* .line 27 */
/* iput p1, p0, Lcom/wiyun/engine/chipmunk/Arbiter;->mPointer:I */
/* .line 28 */
return;
} // .end method
