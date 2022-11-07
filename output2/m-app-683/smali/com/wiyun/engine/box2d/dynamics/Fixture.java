public class com.wiyun.engine.box2d.dynamics.Fixture extends com.wiyun.engine.BaseObject {
	 /* .source "Fixture.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.dynamics.Fixture ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 15 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseObject;-><init>()V */
		 /* .line 16 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.box2d.dynamics.Fixture ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 19 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseObject;-><init>(I)V */
		 /* .line 20 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.dynamics.Fixture from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 12 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/box2d/dynamics/Fixture; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/box2d/dynamics/Fixture;-><init>(I)V */
} // .end method
private native void nativeGetAABB ( com.wiyun.engine.box2d.collision.AABB p0, Integer p1 ) {
} // .end method
private native Integer nativeGetBody ( ) {
} // .end method
private native void nativeGetFilterData ( com.wiyun.engine.box2d.dynamics.Filter p0 ) {
} // .end method
private native void nativeGetMassData ( com.wiyun.engine.box2d.collision.MassData p0 ) {
} // .end method
private native Integer nativeGetNext ( ) {
} // .end method
private native void nativeRayCast ( com.wiyun.engine.box2d.collision.RayCastOutput p0, com.wiyun.engine.box2d.collision.RayCastInput p1, Integer p2 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.box2d.collision.AABB getAABB ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "childIndex" # I */
/* .prologue */
/* .line 168 */
/* new-instance v0, Lcom/wiyun/engine/box2d/collision/AABB; */
/* invoke-direct {v0}, Lcom/wiyun/engine/box2d/collision/AABB;-><init>()V */
/* .line 169 */
/* .local v0, "aabb":Lcom/wiyun/engine/box2d/collision/AABB; */
/* invoke-direct {p0, v0, p1}, Lcom/wiyun/engine/box2d/dynamics/Fixture;->nativeGetAABB(Lcom/wiyun/engine/box2d/collision/AABB;I)V */
/* .line 170 */
} // .end method
public com.wiyun.engine.box2d.dynamics.Body getBody ( ) {
/* .locals 1 */
/* .prologue */
/* .line 23 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/Fixture;->nativeGetBody()I */
com.wiyun.engine.box2d.dynamics.Body .from ( v0 );
} // .end method
public native Float getDensity ( ) {
} // .end method
public com.wiyun.engine.box2d.dynamics.Filter getFilterData ( ) {
/* .locals 1 */
/* .prologue */
/* .line 80 */
/* new-instance v0, Lcom/wiyun/engine/box2d/dynamics/Filter; */
/* invoke-direct {v0}, Lcom/wiyun/engine/box2d/dynamics/Filter;-><init>()V */
/* .line 81 */
/* .local v0, "f":Lcom/wiyun/engine/box2d/dynamics/Filter; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/Fixture;->nativeGetFilterData(Lcom/wiyun/engine/box2d/dynamics/Filter;)V */
/* .line 82 */
} // .end method
public native Float getFriction ( ) {
} // .end method
public com.wiyun.engine.box2d.collision.MassData getMassData ( ) {
/* .locals 1 */
/* .prologue */
/* .line 122 */
/* new-instance v0, Lcom/wiyun/engine/box2d/collision/MassData; */
/* invoke-direct {v0}, Lcom/wiyun/engine/box2d/collision/MassData;-><init>()V */
/* .line 123 */
/* .local v0, "d":Lcom/wiyun/engine/box2d/collision/MassData; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/dynamics/Fixture;->nativeGetMassData(Lcom/wiyun/engine/box2d/collision/MassData;)V */
/* .line 124 */
} // .end method
public com.wiyun.engine.box2d.dynamics.Fixture getNext ( ) {
/* .locals 1 */
/* .prologue */
/* .line 96 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/dynamics/Fixture;->nativeGetNext()I */
com.wiyun.engine.box2d.dynamics.Fixture .from ( v0 );
} // .end method
public native Float getRestitution ( ) {
} // .end method
public native Integer getShape ( ) {
} // .end method
public native java.lang.Object getUserData ( ) {
} // .end method
public native Boolean isSensor ( ) {
} // .end method
public com.wiyun.engine.box2d.collision.RayCastOutput rayCast ( com.wiyun.engine.box2d.collision.RayCastInput p0, Integer p1 ) {
/* .locals 1 */
/* .param p1, "input" # Lcom/wiyun/engine/box2d/collision/RayCastInput; */
/* .param p2, "childIndex" # I */
/* .prologue */
/* .line 109 */
/* new-instance v0, Lcom/wiyun/engine/box2d/collision/RayCastOutput; */
/* invoke-direct {v0}, Lcom/wiyun/engine/box2d/collision/RayCastOutput;-><init>()V */
/* .line 110 */
/* .local v0, "o":Lcom/wiyun/engine/box2d/collision/RayCastOutput; */
/* invoke-direct {p0, v0, p1, p2}, Lcom/wiyun/engine/box2d/dynamics/Fixture;->nativeRayCast(Lcom/wiyun/engine/box2d/collision/RayCastOutput;Lcom/wiyun/engine/box2d/collision/RayCastInput;I)V */
/* .line 111 */
} // .end method
public native void setDensity ( Float p0 ) {
} // .end method
public native void setFilterData ( com.wiyun.engine.box2d.dynamics.Filter p0 ) {
} // .end method
public native void setFriction ( Float p0 ) {
} // .end method
public native void setRestitution ( Float p0 ) {
} // .end method
public native void setSensor ( Boolean p0 ) {
} // .end method
public native void setUserData ( java.lang.Object p0 ) {
} // .end method
public native Boolean testPoint ( Float p0, Float p1 ) {
} // .end method
public Boolean testPoint ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 2 */
/* .param p1, "p" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 44 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
v0 = (( com.wiyun.engine.box2d.dynamics.Fixture ) p0 ).testPoint ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/wiyun/engine/box2d/dynamics/Fixture;->testPoint(FF)Z
} // .end method
