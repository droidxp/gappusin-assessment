public class com.badlogic.gdx.physics.box2d.Fixture {
	 /* # instance fields */
	 protected Long addr;
	 private com.badlogic.gdx.physics.box2d.Body body;
	 private final com.badlogic.gdx.physics.box2d.Filter filter;
	 protected com.badlogic.gdx.physics.box2d.Shape shape;
	 private final tmp;
	 protected java.lang.Object userData;
	 /* # direct methods */
	 protected com.badlogic.gdx.physics.box2d.Fixture ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 3; // const/4 v0, 0x3
		 /* new-array v0, v0, [S */
		 this.tmp = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/physics/box2d/Filter; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/physics/box2d/Filter;-><init>()V */
		 this.filter = v0;
		 this.body = p1;
		 /* iput-wide p2, p0, Lcom/badlogic/gdx/physics/box2d/Fixture;->addr:J */
		 return;
	 } // .end method
	 private native Float jniGetDensity ( Long p0 ) {
	 } // .end method
	 private native void jniGetFilterData ( Long p0, Object[] p1 ) {
	 } // .end method
	 private native Float jniGetFriction ( Long p0 ) {
	 } // .end method
	 private native Float jniGetRestitution ( Long p0 ) {
	 } // .end method
	 private native Long jniGetShape ( Long p0 ) {
	 } // .end method
	 private native Integer jniGetType ( Long p0 ) {
	 } // .end method
	 private native Boolean jniIsSensor ( Long p0 ) {
	 } // .end method
	 private native void jniRefilter ( Long p0 ) {
	 } // .end method
	 private native void jniSetDensity ( Long p0, Float p1 ) {
	 } // .end method
	 private native void jniSetFilterData ( Long p0, Object p1, Object p2, Object p3 ) {
	 } // .end method
	 private native void jniSetFriction ( Long p0, Float p1 ) {
	 } // .end method
	 private native void jniSetRestitution ( Long p0, Float p1 ) {
	 } // .end method
	 private native void jniSetSensor ( Long p0, Boolean p1 ) {
	 } // .end method
	 private native Boolean jniTestPoint ( Long p0, Float p1, Float p2 ) {
	 } // .end method
	 /* # virtual methods */
	 public com.badlogic.gdx.physics.box2d.Body getBody ( ) {
		 /* .locals 1 */
		 v0 = this.body;
	 } // .end method
	 public Float getDensity ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Fixture;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/Fixture;->jniGetDensity(J)F */
	 } // .end method
	 public com.badlogic.gdx.physics.box2d.Filter getFilterData ( ) {
		 /* .locals 3 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Fixture;->addr:J */
		 v2 = this.tmp;
		 /* invoke-direct {p0, v0, v1, v2}, Lcom/badlogic/gdx/physics/box2d/Fixture;->jniGetFilterData(J[S)V */
		 v0 = this.filter;
		 v1 = this.tmp;
		 int v2 = 0; // const/4 v2, 0x0
		 /* aget-short v1, v1, v2 */
		 /* iput-short v1, v0, Lcom/badlogic/gdx/physics/box2d/Filter;->maskBits:S */
		 v0 = this.filter;
		 v1 = this.tmp;
		 int v2 = 1; // const/4 v2, 0x1
		 /* aget-short v1, v1, v2 */
		 /* iput-short v1, v0, Lcom/badlogic/gdx/physics/box2d/Filter;->categoryBits:S */
		 v0 = this.filter;
		 v1 = this.tmp;
		 int v2 = 2; // const/4 v2, 0x2
		 /* aget-short v1, v1, v2 */
		 /* iput-short v1, v0, Lcom/badlogic/gdx/physics/box2d/Filter;->groupIndex:S */
		 v0 = this.filter;
	 } // .end method
	 public Float getFriction ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Fixture;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/Fixture;->jniGetFriction(J)F */
	 } // .end method
	 public Float getRestitution ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Fixture;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/Fixture;->jniGetRestitution(J)F */
	 } // .end method
	 public com.badlogic.gdx.physics.box2d.Shape getShape ( ) {
		 /* .locals 3 */
		 v0 = this.shape;
		 /* if-nez v0, :cond_0 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Fixture;->addr:J */
		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/Fixture;->jniGetShape(J)J */
		 /* move-result-wide v0 */
		 v2 = 		 com.badlogic.gdx.physics.box2d.Shape .jniGetType ( v0,v1 );
		 /* packed-switch v2, :pswitch_data_0 */
		 /* new-instance v0, Lcom/badlogic/gdx/utils/GdxRuntimeException; */
		 final String v1 = "Unknown shape type!"; // const-string v1, "Unknown shape type!"
		 /* invoke-direct {v0, v1}, Lcom/badlogic/gdx/utils/GdxRuntimeException;-><init>(Ljava/lang/String;)V */
		 /* throw v0 */
		 /* :pswitch_0 */
		 /* new-instance v2, Lcom/badlogic/gdx/physics/box2d/CircleShape; */
		 /* invoke-direct {v2, v0, v1}, Lcom/badlogic/gdx/physics/box2d/CircleShape;-><init>(J)V */
		 this.shape = v2;
	 } // :cond_0
} // :goto_0
v0 = this.shape;
/* :pswitch_1 */
/* new-instance v2, Lcom/badlogic/gdx/physics/box2d/EdgeShape; */
/* invoke-direct {v2, v0, v1}, Lcom/badlogic/gdx/physics/box2d/EdgeShape;-><init>(J)V */
this.shape = v2;
/* :pswitch_2 */
/* new-instance v2, Lcom/badlogic/gdx/physics/box2d/PolygonShape; */
/* invoke-direct {v2, v0, v1}, Lcom/badlogic/gdx/physics/box2d/PolygonShape;-><init>(J)V */
this.shape = v2;
/* :pswitch_3 */
/* new-instance v2, Lcom/badlogic/gdx/physics/box2d/ChainShape; */
/* invoke-direct {v2, v0, v1}, Lcom/badlogic/gdx/physics/box2d/ChainShape;-><init>(J)V */
this.shape = v2;
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_3 */
} // .end packed-switch
} // .end method
public com.badlogic.gdx.physics.box2d.Shape$Type getType ( ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Fixture;->addr:J */
v0 = /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/Fixture;->jniGetType(J)I */
/* packed-switch v0, :pswitch_data_0 */
/* new-instance v0, Lcom/badlogic/gdx/utils/GdxRuntimeException; */
final String v1 = "Unknown shape type!"; // const-string v1, "Unknown shape type!"
/* invoke-direct {v0, v1}, Lcom/badlogic/gdx/utils/GdxRuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* :pswitch_0 */
v0 = com.badlogic.gdx.physics.box2d.Shape$Type.Circle;
} // :goto_0
/* :pswitch_1 */
v0 = com.badlogic.gdx.physics.box2d.Shape$Type.Edge;
/* :pswitch_2 */
v0 = com.badlogic.gdx.physics.box2d.Shape$Type.Polygon;
/* :pswitch_3 */
v0 = com.badlogic.gdx.physics.box2d.Shape$Type.Chain;
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_3 */
} // .end packed-switch
} // .end method
public java.lang.Object getUserData ( ) {
/* .locals 1 */
v0 = this.userData;
} // .end method
public Boolean isSensor ( ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Fixture;->addr:J */
v0 = /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/Fixture;->jniIsSensor(J)Z */
} // .end method
public void refilter ( ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Fixture;->addr:J */
/* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/Fixture;->jniRefilter(J)V */
return;
} // .end method
protected void reset ( com.badlogic.gdx.physics.box2d.Body p0, Long p1 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
this.body = p1;
/* iput-wide p2, p0, Lcom/badlogic/gdx/physics/box2d/Fixture;->addr:J */
this.shape = v0;
this.userData = v0;
return;
} // .end method
public void setDensity ( Float p0 ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Fixture;->addr:J */
/* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/Fixture;->jniSetDensity(JF)V */
return;
} // .end method
public void setFilterData ( com.badlogic.gdx.physics.box2d.Filter p0 ) {
/* .locals 6 */
/* iget-wide v1, p0, Lcom/badlogic/gdx/physics/box2d/Fixture;->addr:J */
/* iget-short v3, p1, Lcom/badlogic/gdx/physics/box2d/Filter;->categoryBits:S */
/* iget-short v4, p1, Lcom/badlogic/gdx/physics/box2d/Filter;->maskBits:S */
/* iget-short v5, p1, Lcom/badlogic/gdx/physics/box2d/Filter;->groupIndex:S */
/* move-object v0, p0 */
/* invoke-direct/range {v0 ..v5}, Lcom/badlogic/gdx/physics/box2d/Fixture;->jniSetFilterData(JSSS)V */
return;
} // .end method
public void setFriction ( Float p0 ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Fixture;->addr:J */
/* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/Fixture;->jniSetFriction(JF)V */
return;
} // .end method
public void setRestitution ( Float p0 ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Fixture;->addr:J */
/* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/Fixture;->jniSetRestitution(JF)V */
return;
} // .end method
public void setSensor ( Boolean p0 ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Fixture;->addr:J */
/* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/Fixture;->jniSetSensor(JZ)V */
return;
} // .end method
public void setUserData ( java.lang.Object p0 ) {
/* .locals 0 */
this.userData = p1;
return;
} // .end method
public Boolean testPoint ( Float p0, Float p1 ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Fixture;->addr:J */
v0 = /* invoke-direct {p0, v0, v1, p1, p2}, Lcom/badlogic/gdx/physics/box2d/Fixture;->jniTestPoint(JFF)Z */
} // .end method
public Boolean testPoint ( com.badlogic.gdx.math.Vector2 p0 ) {
/* .locals 4 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Fixture;->addr:J */
/* iget v2, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* iget v3, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
v0 = /* invoke-direct {p0, v0, v1, v2, v3}, Lcom/badlogic/gdx/physics/box2d/Fixture;->jniTestPoint(JFF)Z */
} // .end method
