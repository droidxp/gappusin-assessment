public class com.badlogic.gdx.physics.box2d.Box2DDebugRenderer {
	 /* # static fields */
	 private static com.badlogic.gdx.math.Vector2 axis;
	 private static com.badlogic.gdx.math.Vector2 t;
	 /* # instance fields */
	 private final com.badlogic.gdx.physics.box2d.Box2DDebugRenderer$Color JOINT_COLOR;
	 private final com.badlogic.gdx.physics.box2d.Box2DDebugRenderer$Color SHAPE_AWAKE;
	 private final com.badlogic.gdx.physics.box2d.Box2DDebugRenderer$Color SHAPE_KINEMATIC;
	 private final com.badlogic.gdx.physics.box2d.Box2DDebugRenderer$Color SHAPE_NOT_ACTIVE;
	 private final com.badlogic.gdx.physics.box2d.Box2DDebugRenderer$Color SHAPE_NOT_AWAKE;
	 private final com.badlogic.gdx.physics.box2d.Box2DDebugRenderer$Color SHAPE_STATIC;
	 private final com.badlogic.gdx.math.Vector2 v;
	 /* # direct methods */
	 static com.badlogic.gdx.physics.box2d.Box2DDebugRenderer ( ) {
		 /* .locals 1 */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
		 return;
	 } // .end method
	 public com.badlogic.gdx.physics.box2d.Box2DDebugRenderer ( ) {
		 /* .locals 7 */
		 /* const v6, 0x3f333333 # 0.7f */
		 /* const v5, 0x3f666666 # 0.9f */
		 /* const v2, 0x3f19999a # 0.6f */
		 /* const/high16 v4, 0x3f800000 # 1.0f */
		 /* const/high16 v3, 0x3f000000 # 0.5f */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/physics/box2d/Box2DDebugRenderer$Color; */
		 /* const v1, 0x3e99999a # 0.3f */
		 /* invoke-direct {v0, v3, v3, v1, v4}, Lcom/badlogic/gdx/physics/box2d/Box2DDebugRenderer$Color;-><init>(FFFF)V */
		 this.SHAPE_NOT_ACTIVE = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/physics/box2d/Box2DDebugRenderer$Color; */
		 /* invoke-direct {v0, v3, v5, v3, v4}, Lcom/badlogic/gdx/physics/box2d/Box2DDebugRenderer$Color;-><init>(FFFF)V */
		 this.SHAPE_STATIC = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/physics/box2d/Box2DDebugRenderer$Color; */
		 /* invoke-direct {v0, v3, v3, v5, v4}, Lcom/badlogic/gdx/physics/box2d/Box2DDebugRenderer$Color;-><init>(FFFF)V */
		 this.SHAPE_KINEMATIC = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/physics/box2d/Box2DDebugRenderer$Color; */
		 /* invoke-direct {v0, v2, v2, v2, v4}, Lcom/badlogic/gdx/physics/box2d/Box2DDebugRenderer$Color;-><init>(FFFF)V */
		 this.SHAPE_NOT_AWAKE = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/physics/box2d/Box2DDebugRenderer$Color; */
		 /* invoke-direct {v0, v5, v6, v6, v4}, Lcom/badlogic/gdx/physics/box2d/Box2DDebugRenderer$Color;-><init>(FFFF)V */
		 this.SHAPE_AWAKE = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/physics/box2d/Box2DDebugRenderer$Color; */
		 /* const v1, 0x3f4ccccd # 0.8f */
		 /* const v2, 0x3f4ccccd # 0.8f */
		 /* invoke-direct {v0, v3, v1, v2, v4}, Lcom/badlogic/gdx/physics/box2d/Box2DDebugRenderer$Color;-><init>(FFFF)V */
		 this.JOINT_COLOR = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
		 this.v = v0;
		 return;
	 } // .end method
	 private void drawContact ( com.badlogic.gdx.physics.box2d.Contact p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 private void drawJoint ( com.badlogic.gdx.physics.box2d.Joint p0 ) {
		 /* .locals 2 */
		 (( com.badlogic.gdx.physics.box2d.Joint ) p1 ).getBodyA ( ); // invoke-virtual {p1}, Lcom/badlogic/gdx/physics/box2d/Joint;->getBodyA()Lcom/badlogic/gdx/physics/box2d/Body;
		 (( com.badlogic.gdx.physics.box2d.Joint ) p1 ).getBodyB ( ); // invoke-virtual {p1}, Lcom/badlogic/gdx/physics/box2d/Joint;->getBodyB()Lcom/badlogic/gdx/physics/box2d/Body;
		 (( com.badlogic.gdx.physics.box2d.Body ) v0 ).getTransform ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/Body;->getTransform()Lcom/badlogic/gdx/physics/box2d/Transform;
		 (( com.badlogic.gdx.physics.box2d.Body ) v1 ).getTransform ( ); // invoke-virtual {v1}, Lcom/badlogic/gdx/physics/box2d/Body;->getTransform()Lcom/badlogic/gdx/physics/box2d/Transform;
		 (( com.badlogic.gdx.physics.box2d.Transform ) v0 ).getPosition ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/Transform;->getPosition()Lcom/badlogic/gdx/math/Vector2;
		 (( com.badlogic.gdx.physics.box2d.Transform ) v1 ).getPosition ( ); // invoke-virtual {v1}, Lcom/badlogic/gdx/physics/box2d/Transform;->getPosition()Lcom/badlogic/gdx/math/Vector2;
		 (( com.badlogic.gdx.physics.box2d.Joint ) p1 ).getAnchorA ( ); // invoke-virtual {p1}, Lcom/badlogic/gdx/physics/box2d/Joint;->getAnchorA()Lcom/badlogic/gdx/math/Vector2;
		 (( com.badlogic.gdx.physics.box2d.Joint ) p1 ).getAnchorB ( ); // invoke-virtual {p1}, Lcom/badlogic/gdx/physics/box2d/Joint;->getAnchorB()Lcom/badlogic/gdx/math/Vector2;
		 (( com.badlogic.gdx.physics.box2d.Joint ) p1 ).getType ( ); // invoke-virtual {p1}, Lcom/badlogic/gdx/physics/box2d/Joint;->getType()Lcom/badlogic/gdx/physics/box2d/JointDef$JointType;
		 v1 = com.badlogic.gdx.physics.box2d.JointDef$JointType.DistanceJoint;
		 /* if-ne v0, v1, :cond_0 */
	 } // :goto_0
	 return;
} // :cond_0
(( com.badlogic.gdx.physics.box2d.Joint ) p1 ).getType ( ); // invoke-virtual {p1}, Lcom/badlogic/gdx/physics/box2d/Joint;->getType()Lcom/badlogic/gdx/physics/box2d/JointDef$JointType;
v1 = com.badlogic.gdx.physics.box2d.JointDef$JointType.PulleyJoint;
/* if-ne v0, v1, :cond_1 */
/* check-cast p1, Lcom/badlogic/gdx/physics/box2d/joints/PulleyJoint; */
(( com.badlogic.gdx.physics.box2d.joints.PulleyJoint ) p1 ).getGroundAnchorA ( ); // invoke-virtual {p1}, Lcom/badlogic/gdx/physics/box2d/joints/PulleyJoint;->getGroundAnchorA()Lcom/badlogic/gdx/math/Vector2;
(( com.badlogic.gdx.physics.box2d.joints.PulleyJoint ) p1 ).getGroundAnchorB ( ); // invoke-virtual {p1}, Lcom/badlogic/gdx/physics/box2d/joints/PulleyJoint;->getGroundAnchorB()Lcom/badlogic/gdx/math/Vector2;
} // :cond_1
(( com.badlogic.gdx.physics.box2d.Joint ) p1 ).getType ( ); // invoke-virtual {p1}, Lcom/badlogic/gdx/physics/box2d/Joint;->getType()Lcom/badlogic/gdx/physics/box2d/JointDef$JointType;
} // .end method
private void drawSegment ( com.badlogic.gdx.math.Vector2 p0, com.badlogic.gdx.math.Vector2 p1, com.badlogic.gdx.physics.box2d.Box2DDebugRenderer$Color p2 ) {
/* .locals 0 */
return;
} // .end method
private void drawShape ( com.badlogic.gdx.physics.box2d.Fixture p0, com.badlogic.gdx.physics.box2d.Transform p1, com.badlogic.gdx.physics.box2d.Box2DDebugRenderer$Color p2 ) {
/* .locals 4 */
(( com.badlogic.gdx.physics.box2d.Fixture ) p1 ).getType ( ); // invoke-virtual {p1}, Lcom/badlogic/gdx/physics/box2d/Fixture;->getType()Lcom/badlogic/gdx/physics/box2d/Shape$Type;
v1 = com.badlogic.gdx.physics.box2d.Shape$Type.Circle;
/* if-ne v0, v1, :cond_0 */
(( com.badlogic.gdx.physics.box2d.Fixture ) p1 ).getShape ( ); // invoke-virtual {p1}, Lcom/badlogic/gdx/physics/box2d/Fixture;->getShape()Lcom/badlogic/gdx/physics/box2d/Shape;
/* check-cast p0, Lcom/badlogic/gdx/physics/box2d/CircleShape; */
v0 = com.badlogic.gdx.physics.box2d.Box2DDebugRenderer.t;
(( com.badlogic.gdx.physics.box2d.CircleShape ) p0 ).getPosition ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/physics/box2d/CircleShape;->getPosition()Lcom/badlogic/gdx/math/Vector2;
(( com.badlogic.gdx.math.Vector2 ) v0 ).set ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector2;->set(Lcom/badlogic/gdx/math/Vector2;)Lcom/badlogic/gdx/math/Vector2;
v0 = com.badlogic.gdx.physics.box2d.Box2DDebugRenderer.t;
(( com.badlogic.gdx.physics.box2d.Transform ) p2 ).mul ( v0 ); // invoke-virtual {p2, v0}, Lcom/badlogic/gdx/physics/box2d/Transform;->mul(Lcom/badlogic/gdx/math/Vector2;)Lcom/badlogic/gdx/math/Vector2;
(( com.badlogic.gdx.physics.box2d.CircleShape ) p0 ).getRadius ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/physics/box2d/CircleShape;->getRadius()F
v0 = com.badlogic.gdx.physics.box2d.Box2DDebugRenderer.axis;
v1 = this.vals;
int v2 = 2; // const/4 v2, 0x2
/* aget v1, v1, v2 */
v2 = this.vals;
int v3 = 3; // const/4 v3, 0x3
/* aget v2, v2, v3 */
(( com.badlogic.gdx.math.Vector2 ) v0 ).set ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/badlogic/gdx/math/Vector2;->set(FF)Lcom/badlogic/gdx/math/Vector2;
} // :goto_0
return;
} // :cond_0
(( com.badlogic.gdx.physics.box2d.Fixture ) p1 ).getShape ( ); // invoke-virtual {p1}, Lcom/badlogic/gdx/physics/box2d/Fixture;->getShape()Lcom/badlogic/gdx/physics/box2d/Shape;
/* check-cast p0, Lcom/badlogic/gdx/physics/box2d/PolygonShape; */
(( com.badlogic.gdx.physics.box2d.PolygonShape ) p0 ).getVertexCount ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/physics/box2d/PolygonShape;->getVertexCount()I
} // .end method
private void drawSolidCircle ( com.badlogic.gdx.math.Vector2 p0, Float p1, com.badlogic.gdx.math.Vector2 p2, com.badlogic.gdx.physics.box2d.Box2DDebugRenderer$Color p3 ) {
/* .locals 0 */
return;
} // .end method
private void drawSolidPolygon ( com.badlogic.gdx.math.Vector2[] p0, Integer p1, com.badlogic.gdx.physics.box2d.Box2DDebugRenderer$Color p2 ) {
/* .locals 0 */
return;
} // .end method
private void renderBodies ( com.badlogic.gdx.physics.box2d.World p0 ) {
/* .locals 10 */
int v9 = 0; // const/4 v9, 0x0
(( com.badlogic.gdx.physics.box2d.World ) p1 ).getBodies ( ); // invoke-virtual {p1}, Lcom/badlogic/gdx/physics/box2d/World;->getBodies()Ljava/util/Iterator;
v0 = } // :cond_0
if ( v0 != null) { // if-eqz v0, :cond_5
/* check-cast v0, Lcom/badlogic/gdx/physics/box2d/Body; */
(( com.badlogic.gdx.physics.box2d.Body ) v0 ).getTransform ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/Body;->getTransform()Lcom/badlogic/gdx/physics/box2d/Transform;
(( com.badlogic.gdx.physics.box2d.Body ) v0 ).getFixtureList ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/Body;->getFixtureList()Ljava/util/ArrayList;
v4 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
(( com.badlogic.gdx.physics.box2d.Body ) v0 ).getFixtureList ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/Body;->getFixtureList()Ljava/util/ArrayList;
/* move v6, v9 */
} // :goto_0
/* if-ge v6, v4, :cond_0 */
/* check-cast v1, Lcom/badlogic/gdx/physics/box2d/Fixture; */
v7 = (( com.badlogic.gdx.physics.box2d.Body ) v0 ).isActive ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/Body;->isActive()Z
/* if-nez v7, :cond_1 */
v7 = this.SHAPE_NOT_ACTIVE;
/* invoke-direct {p0, v1, v3, v7}, Lcom/badlogic/gdx/physics/box2d/Box2DDebugRenderer;->drawShape(Lcom/badlogic/gdx/physics/box2d/Fixture;Lcom/badlogic/gdx/physics/box2d/Transform;Lcom/badlogic/gdx/physics/box2d/Box2DDebugRenderer$Color;)V */
} // :goto_1
/* add-int/lit8 v1, v6, 0x1 */
/* move v6, v1 */
} // :cond_1
(( com.badlogic.gdx.physics.box2d.Body ) v0 ).getType ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/Body;->getType()Lcom/badlogic/gdx/physics/box2d/BodyDef$BodyType;
v8 = com.badlogic.gdx.physics.box2d.BodyDef$BodyType.StaticBody;
/* if-ne v7, v8, :cond_2 */
v7 = this.SHAPE_STATIC;
/* invoke-direct {p0, v1, v3, v7}, Lcom/badlogic/gdx/physics/box2d/Box2DDebugRenderer;->drawShape(Lcom/badlogic/gdx/physics/box2d/Fixture;Lcom/badlogic/gdx/physics/box2d/Transform;Lcom/badlogic/gdx/physics/box2d/Box2DDebugRenderer$Color;)V */
} // :cond_2
(( com.badlogic.gdx.physics.box2d.Body ) v0 ).getType ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/Body;->getType()Lcom/badlogic/gdx/physics/box2d/BodyDef$BodyType;
v8 = com.badlogic.gdx.physics.box2d.BodyDef$BodyType.KinematicBody;
/* if-ne v7, v8, :cond_3 */
v7 = this.SHAPE_KINEMATIC;
/* invoke-direct {p0, v1, v3, v7}, Lcom/badlogic/gdx/physics/box2d/Box2DDebugRenderer;->drawShape(Lcom/badlogic/gdx/physics/box2d/Fixture;Lcom/badlogic/gdx/physics/box2d/Transform;Lcom/badlogic/gdx/physics/box2d/Box2DDebugRenderer$Color;)V */
} // :cond_3
v7 = (( com.badlogic.gdx.physics.box2d.Body ) v0 ).isAwake ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/Body;->isAwake()Z
/* if-nez v7, :cond_4 */
v7 = this.SHAPE_NOT_AWAKE;
/* invoke-direct {p0, v1, v3, v7}, Lcom/badlogic/gdx/physics/box2d/Box2DDebugRenderer;->drawShape(Lcom/badlogic/gdx/physics/box2d/Fixture;Lcom/badlogic/gdx/physics/box2d/Transform;Lcom/badlogic/gdx/physics/box2d/Box2DDebugRenderer$Color;)V */
} // :cond_4
v7 = this.SHAPE_AWAKE;
/* invoke-direct {p0, v1, v3, v7}, Lcom/badlogic/gdx/physics/box2d/Box2DDebugRenderer;->drawShape(Lcom/badlogic/gdx/physics/box2d/Fixture;Lcom/badlogic/gdx/physics/box2d/Transform;Lcom/badlogic/gdx/physics/box2d/Box2DDebugRenderer$Color;)V */
} // :cond_5
(( com.badlogic.gdx.physics.box2d.World ) p1 ).getJoints ( ); // invoke-virtual {p1}, Lcom/badlogic/gdx/physics/box2d/World;->getJoints()Ljava/util/Iterator;
v0 = } // :goto_2
if ( v0 != null) { // if-eqz v0, :cond_6
/* check-cast v0, Lcom/badlogic/gdx/physics/box2d/Joint; */
/* invoke-direct {p0, v0}, Lcom/badlogic/gdx/physics/box2d/Box2DDebugRenderer;->drawJoint(Lcom/badlogic/gdx/physics/box2d/Joint;)V */
} // :cond_6
v0 = (( com.badlogic.gdx.physics.box2d.World ) p1 ).getContactList ( ); // invoke-virtual {p1}, Lcom/badlogic/gdx/physics/box2d/World;->getContactList()Ljava/util/List;
/* move v1, v9 */
} // :goto_3
/* if-ge v1, v0, :cond_7 */
(( com.badlogic.gdx.physics.box2d.World ) p1 ).getContactList ( ); // invoke-virtual {p1}, Lcom/badlogic/gdx/physics/box2d/World;->getContactList()Ljava/util/List;
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_7
return;
} // .end method
/* # virtual methods */
public void dispose ( ) {
/* .locals 0 */
return;
} // .end method
public void render ( com.badlogic.gdx.physics.box2d.World p0 ) {
/* .locals 0 */
/* invoke-direct {p0, p1}, Lcom/badlogic/gdx/physics/box2d/Box2DDebugRenderer;->renderBodies(Lcom/badlogic/gdx/physics/box2d/World;)V */
return;
} // .end method
