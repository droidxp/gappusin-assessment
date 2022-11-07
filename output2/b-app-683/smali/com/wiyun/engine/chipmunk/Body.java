public class com.wiyun.engine.chipmunk.Body {
	 /* .source "Body.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/wiyun/engine/chipmunk/Body$IPositionUpdater;, */
	 /* Lcom/wiyun/engine/chipmunk/Body$IVelocityUpdater; */
	 /* } */
} // .end annotation
/* # instance fields */
Integer mPointer;
/* # direct methods */
protected com.wiyun.engine.chipmunk.Body ( ) {
	 /* .locals 0 */
	 /* .param p1, "mass" # F */
	 /* .param p2, "momentOfInertia" # F */
	 /* .prologue */
	 /* .line 76 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 77 */
	 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/chipmunk/Body;->init(FF)V */
	 /* .line 78 */
	 return;
} // .end method
protected com.wiyun.engine.chipmunk.Body ( ) {
	 /* .locals 0 */
	 /* .param p1, "pointer" # I */
	 /* .prologue */
	 /* .line 80 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 81 */
	 /* iput p1, p0, Lcom/wiyun/engine/chipmunk/Body;->mPointer:I */
	 /* .line 82 */
	 return;
} // .end method
public static com.wiyun.engine.chipmunk.Body from ( Integer p0 ) {
	 /* .locals 1 */
	 /* .param p0, "pointer" # I */
	 /* .prologue */
	 /* .line 67 */
	 /* if-nez p0, :cond_0 */
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/chipmunk/Body; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/chipmunk/Body;-><init>(I)V */
} // .end method
private native void init ( Float p0, Float p1 ) {
} // .end method
public static com.wiyun.engine.chipmunk.Body make ( Float p0, Float p1 ) {
/* .locals 1 */
/* .param p0, "mass" # F */
/* .param p1, "momentOfInertia" # F */
/* .prologue */
/* .line 54 */
/* new-instance v0, Lcom/wiyun/engine/chipmunk/Body; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/chipmunk/Body;-><init>(FF)V */
} // .end method
public static com.wiyun.engine.chipmunk.Body makeStatic ( ) {
/* .locals 2 */
/* .prologue */
/* const v1, 0x7f7fffff # Float.MAX_VALUE */
/* .line 63 */
/* new-instance v0, Lcom/wiyun/engine/chipmunk/Body; */
/* invoke-direct {v0, v1, v1}, Lcom/wiyun/engine/chipmunk/Body;-><init>(FF)V */
} // .end method
private native void nativeApplyForce ( Float p0, Float p1, Float p2, Float p3 ) {
} // .end method
private native void slew ( Float p0, Float p1, Float p2 ) {
} // .end method
/* # virtual methods */
public void applyForce ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1 ) {
/* .locals 4 */
/* .param p1, "force" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p2, "r" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 206 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* iget v2, p2, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v3, p2, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* invoke-direct {p0, v0, v1, v2, v3}, Lcom/wiyun/engine/chipmunk/Body;->nativeApplyForce(FFFF)V */
/* .line 207 */
return;
} // .end method
public native void applyImpulse ( Float p0, Float p1, Float p2, Float p3 ) {
} // .end method
public void applyImpulse ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1 ) {
/* .locals 4 */
/* .param p1, "impulse" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p2, "direction" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 515 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* iget v2, p2, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v3, p2, Lcom/wiyun/engine/types/WYPoint;->y:F */
(( com.wiyun.engine.chipmunk.Body ) p0 ).applyImpulse ( v0, v1, v2, v3 ); // invoke-virtual {p0, v0, v1, v2, v3}, Lcom/wiyun/engine/chipmunk/Body;->applyImpulse(FFFF)V
/* .line 516 */
return;
} // .end method
public com.wiyun.engine.types.WYPoint convertLocalToWorld ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 2 */
/* .param p1, "v" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 173 */
(( com.wiyun.engine.chipmunk.Body ) p0 ).getPosition ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/chipmunk/Body;->getPosition()Lcom/wiyun/engine/types/WYPoint;
(( com.wiyun.engine.chipmunk.Body ) p0 ).getAngleUnitVector ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/chipmunk/Body;->getAngleUnitVector()Lcom/wiyun/engine/types/WYPoint;
com.wiyun.engine.types.WYPoint .rotate ( p1,v1 );
com.wiyun.engine.types.WYPoint .add ( v0,v1 );
} // .end method
public com.wiyun.engine.types.WYPoint convertWorldToLocal ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 2 */
/* .param p1, "v" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 163 */
(( com.wiyun.engine.chipmunk.Body ) p0 ).getPosition ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/chipmunk/Body;->getPosition()Lcom/wiyun/engine/types/WYPoint;
com.wiyun.engine.types.WYPoint .sub ( p1,v0 );
(( com.wiyun.engine.chipmunk.Body ) p0 ).getAngleUnitVector ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/chipmunk/Body;->getAngleUnitVector()Lcom/wiyun/engine/types/WYPoint;
com.wiyun.engine.types.WYPoint .unrotate ( v0,v1 );
} // .end method
public native void destroy ( ) {
} // .end method
public native Float getAngle ( ) {
} // .end method
public com.wiyun.engine.types.WYPoint getAngleUnitVector ( ) {
/* .locals 2 */
/* .prologue */
/* .line 182 */
v0 = (( com.wiyun.engine.chipmunk.Body ) p0 ).getAngleUnitVectorX ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/chipmunk/Body;->getAngleUnitVectorX()F
v1 = (( com.wiyun.engine.chipmunk.Body ) p0 ).getAngllUnitVectorY ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/chipmunk/Body;->getAngllUnitVectorY()F
com.wiyun.engine.types.WYPoint .make ( v0,v1 );
} // .end method
public native Float getAngleUnitVectorX ( ) {
} // .end method
public native Float getAngllUnitVectorY ( ) {
} // .end method
public native Float getAngularVelocity ( ) {
} // .end method
public native Float getAngularVelocityBias ( ) {
} // .end method
public native java.lang.Object getData ( ) {
} // .end method
public com.wiyun.engine.types.WYPoint getForce ( ) {
/* .locals 2 */
/* .prologue */
/* .line 139 */
v0 = (( com.wiyun.engine.chipmunk.Body ) p0 ).getForceX ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/chipmunk/Body;->getForceX()F
v1 = (( com.wiyun.engine.chipmunk.Body ) p0 ).getForceY ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/chipmunk/Body;->getForceY()F
com.wiyun.engine.types.WYPoint .make ( v0,v1 );
} // .end method
public native Float getForceX ( ) {
} // .end method
public native Float getForceY ( ) {
} // .end method
public native Float getMass ( ) {
} // .end method
public native Float getMassInverse ( ) {
} // .end method
public native Float getMaxAngularVelocity ( ) {
} // .end method
public native Float getMaxVelocity ( ) {
} // .end method
public native Float getMomentOfInertia ( ) {
} // .end method
public native Float getMomentOfInertiaInverse ( ) {
} // .end method
public Integer getPointer ( ) {
/* .locals 1 */
/* .prologue */
/* .line 89 */
/* iget v0, p0, Lcom/wiyun/engine/chipmunk/Body;->mPointer:I */
} // .end method
public com.wiyun.engine.types.WYPoint getPosition ( ) {
/* .locals 2 */
/* .prologue */
/* .line 112 */
v0 = (( com.wiyun.engine.chipmunk.Body ) p0 ).getPositionX ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/chipmunk/Body;->getPositionX()F
v1 = (( com.wiyun.engine.chipmunk.Body ) p0 ).getPositionY ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/chipmunk/Body;->getPositionY()F
com.wiyun.engine.types.WYPoint .make ( v0,v1 );
} // .end method
public native Float getPositionX ( ) {
} // .end method
public native Float getPositionY ( ) {
} // .end method
public native Float getTorque ( ) {
} // .end method
public com.wiyun.engine.types.WYPoint getVelocity ( ) {
/* .locals 2 */
/* .prologue */
/* .line 121 */
v0 = (( com.wiyun.engine.chipmunk.Body ) p0 ).getVelocityX ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/chipmunk/Body;->getVelocityX()F
v1 = (( com.wiyun.engine.chipmunk.Body ) p0 ).getVelocityY ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/chipmunk/Body;->getVelocityY()F
com.wiyun.engine.types.WYPoint .make ( v0,v1 );
} // .end method
public com.wiyun.engine.types.WYPoint getVelocityBias ( ) {
/* .locals 2 */
/* .prologue */
/* .line 191 */
v0 = (( com.wiyun.engine.chipmunk.Body ) p0 ).getVelocityBiasX ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/chipmunk/Body;->getVelocityBiasX()F
v1 = (( com.wiyun.engine.chipmunk.Body ) p0 ).getVelocityBiasY ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/chipmunk/Body;->getVelocityBiasY()F
com.wiyun.engine.types.WYPoint .make ( v0,v1 );
} // .end method
public native Float getVelocityBiasX ( ) {
} // .end method
public native Float getVelocityBiasY ( ) {
} // .end method
public native Float getVelocityX ( ) {
} // .end method
public native Float getVelocityY ( ) {
} // .end method
public native void resetForces ( ) {
} // .end method
public native void setAngle ( Float p0 ) {
} // .end method
public native void setAngularVelocity ( Float p0 ) {
} // .end method
public native void setAngularVelocityBias ( Float p0 ) {
} // .end method
public native void setData ( java.lang.Object p0 ) {
} // .end method
public native void setForce ( Float p0, Float p1 ) {
} // .end method
public void setForce ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 2 */
/* .param p1, "f" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 385 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
(( com.wiyun.engine.chipmunk.Body ) p0 ).setForce ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/wiyun/engine/chipmunk/Body;->setForce(FF)V
/* .line 386 */
return;
} // .end method
public native void setMass ( Float p0 ) {
} // .end method
public native void setMaxAngularVelocity ( Float p0 ) {
} // .end method
public native void setMaxVelocity ( Float p0 ) {
} // .end method
public native void setMomentOfInertia ( Float p0 ) {
} // .end method
public void setPointer ( Integer p0 ) {
/* .locals 0 */
/* .param p1, "pointer" # I */
/* .prologue */
/* .line 85 */
/* iput p1, p0, Lcom/wiyun/engine/chipmunk/Body;->mPointer:I */
/* .line 86 */
return;
} // .end method
public native void setPosition ( Float p0, Float p1 ) {
} // .end method
public void setPosition ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 2 */
/* .param p1, "p" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 103 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
(( com.wiyun.engine.chipmunk.Body ) p0 ).setPosition ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/wiyun/engine/chipmunk/Body;->setPosition(FF)V
/* .line 104 */
return;
} // .end method
public native void setPositionUpdater ( com.wiyun.engine.chipmunk.Body$IPositionUpdater p0 ) {
} // .end method
public native void setTorque ( Float p0 ) {
} // .end method
public native void setVelocity ( Float p0, Float p1 ) {
} // .end method
public void setVelocity ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 2 */
/* .param p1, "v" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 130 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
(( com.wiyun.engine.chipmunk.Body ) p0 ).setVelocity ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/wiyun/engine/chipmunk/Body;->setVelocity(FF)V
/* .line 131 */
return;
} // .end method
public native void setVelocityBias ( Float p0, Float p1 ) {
} // .end method
public native void setVelocityUpdater ( com.wiyun.engine.chipmunk.Body$IVelocityUpdater p0 ) {
} // .end method
public void slew ( com.wiyun.engine.types.WYPoint p0, Float p1 ) {
/* .locals 2 */
/* .param p1, "pos" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p2, "delta" # F */
/* .prologue */
/* .line 496 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* invoke-direct {p0, v0, v1, p2}, Lcom/wiyun/engine/chipmunk/Body;->slew(FFF)V */
/* .line 497 */
return;
} // .end method
public native void updatePosition ( Float p0 ) {
} // .end method
public native void updateVelocity ( Float p0, Float p1, Float p2, Float p3 ) {
} // .end method
