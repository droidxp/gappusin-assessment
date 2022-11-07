public class inal extends java.lang.Enum {
	 /* # static fields */
	 private static final com.badlogic.gdx.physics.box2d.JointDef$JointType $VALUES; //synthetic
	 public static final com.badlogic.gdx.physics.box2d.JointDef$JointType DistanceJoint;
	 public static final com.badlogic.gdx.physics.box2d.JointDef$JointType FrictionJoint;
	 public static final com.badlogic.gdx.physics.box2d.JointDef$JointType GearJoint;
	 public static final com.badlogic.gdx.physics.box2d.JointDef$JointType MouseJoint;
	 public static final com.badlogic.gdx.physics.box2d.JointDef$JointType PrismaticJoint;
	 public static final com.badlogic.gdx.physics.box2d.JointDef$JointType PulleyJoint;
	 public static final com.badlogic.gdx.physics.box2d.JointDef$JointType RevoluteJoint;
	 public static final com.badlogic.gdx.physics.box2d.JointDef$JointType RopeJoint;
	 public static final com.badlogic.gdx.physics.box2d.JointDef$JointType Unknown;
	 public static final com.badlogic.gdx.physics.box2d.JointDef$JointType WeldJoint;
	 public static final com.badlogic.gdx.physics.box2d.JointDef$JointType WheelJoint;
	 public static com.badlogic.gdx.physics.box2d.JointDef$JointType valueTypes;
	 /* # instance fields */
	 private Integer value;
	 /* # direct methods */
	 static inal ( ) {
		 /* .locals 9 */
		 int v8 = 4; // const/4 v8, 0x4
		 int v7 = 3; // const/4 v7, 0x3
		 int v6 = 2; // const/4 v6, 0x2
		 int v5 = 1; // const/4 v5, 0x1
		 int v4 = 0; // const/4 v4, 0x0
		 /* new-instance v0, Lcom/badlogic/gdx/physics/box2d/JointDef$JointType; */
		 final String v1 = "Unknown"; // const-string v1, "Unknown"
		 /* invoke-direct {v0, v1, v4, v4}, Lcom/badlogic/gdx/physics/box2d/JointDef$JointType;-><init>(Ljava/lang/String;II)V */
		 /* new-instance v0, Lcom/badlogic/gdx/physics/box2d/JointDef$JointType; */
		 final String v1 = "RevoluteJoint"; // const-string v1, "RevoluteJoint"
		 /* invoke-direct {v0, v1, v5, v5}, Lcom/badlogic/gdx/physics/box2d/JointDef$JointType;-><init>(Ljava/lang/String;II)V */
		 /* new-instance v0, Lcom/badlogic/gdx/physics/box2d/JointDef$JointType; */
		 final String v1 = "PrismaticJoint"; // const-string v1, "PrismaticJoint"
		 /* invoke-direct {v0, v1, v6, v6}, Lcom/badlogic/gdx/physics/box2d/JointDef$JointType;-><init>(Ljava/lang/String;II)V */
		 /* new-instance v0, Lcom/badlogic/gdx/physics/box2d/JointDef$JointType; */
		 final String v1 = "DistanceJoint"; // const-string v1, "DistanceJoint"
		 /* invoke-direct {v0, v1, v7, v7}, Lcom/badlogic/gdx/physics/box2d/JointDef$JointType;-><init>(Ljava/lang/String;II)V */
		 /* new-instance v0, Lcom/badlogic/gdx/physics/box2d/JointDef$JointType; */
		 final String v1 = "PulleyJoint"; // const-string v1, "PulleyJoint"
		 /* invoke-direct {v0, v1, v8, v8}, Lcom/badlogic/gdx/physics/box2d/JointDef$JointType;-><init>(Ljava/lang/String;II)V */
		 /* new-instance v0, Lcom/badlogic/gdx/physics/box2d/JointDef$JointType; */
		 final String v1 = "MouseJoint"; // const-string v1, "MouseJoint"
		 int v2 = 5; // const/4 v2, 0x5
		 int v3 = 5; // const/4 v3, 0x5
		 /* invoke-direct {v0, v1, v2, v3}, Lcom/badlogic/gdx/physics/box2d/JointDef$JointType;-><init>(Ljava/lang/String;II)V */
		 /* new-instance v0, Lcom/badlogic/gdx/physics/box2d/JointDef$JointType; */
		 final String v1 = "GearJoint"; // const-string v1, "GearJoint"
		 int v2 = 6; // const/4 v2, 0x6
		 int v3 = 6; // const/4 v3, 0x6
		 /* invoke-direct {v0, v1, v2, v3}, Lcom/badlogic/gdx/physics/box2d/JointDef$JointType;-><init>(Ljava/lang/String;II)V */
		 /* new-instance v0, Lcom/badlogic/gdx/physics/box2d/JointDef$JointType; */
		 final String v1 = "WheelJoint"; // const-string v1, "WheelJoint"
		 int v2 = 7; // const/4 v2, 0x7
		 int v3 = 7; // const/4 v3, 0x7
		 /* invoke-direct {v0, v1, v2, v3}, Lcom/badlogic/gdx/physics/box2d/JointDef$JointType;-><init>(Ljava/lang/String;II)V */
		 /* new-instance v0, Lcom/badlogic/gdx/physics/box2d/JointDef$JointType; */
		 final String v1 = "WeldJoint"; // const-string v1, "WeldJoint"
		 /* const/16 v2, 0x8 */
		 /* const/16 v3, 0x8 */
		 /* invoke-direct {v0, v1, v2, v3}, Lcom/badlogic/gdx/physics/box2d/JointDef$JointType;-><init>(Ljava/lang/String;II)V */
		 /* new-instance v0, Lcom/badlogic/gdx/physics/box2d/JointDef$JointType; */
		 final String v1 = "FrictionJoint"; // const-string v1, "FrictionJoint"
		 /* const/16 v2, 0x9 */
		 /* const/16 v3, 0x9 */
		 /* invoke-direct {v0, v1, v2, v3}, Lcom/badlogic/gdx/physics/box2d/JointDef$JointType;-><init>(Ljava/lang/String;II)V */
		 /* new-instance v0, Lcom/badlogic/gdx/physics/box2d/JointDef$JointType; */
		 final String v1 = "RopeJoint"; // const-string v1, "RopeJoint"
		 /* const/16 v2, 0xa */
		 /* const/16 v3, 0xa */
		 /* invoke-direct {v0, v1, v2, v3}, Lcom/badlogic/gdx/physics/box2d/JointDef$JointType;-><init>(Ljava/lang/String;II)V */
		 /* const/16 v0, 0xb */
		 /* new-array v0, v0, [Lcom/badlogic/gdx/physics/box2d/JointDef$JointType; */
		 v1 = com.badlogic.gdx.physics.box2d.JointDef$JointType.Unknown;
		 /* aput-object v1, v0, v4 */
		 v1 = com.badlogic.gdx.physics.box2d.JointDef$JointType.RevoluteJoint;
		 /* aput-object v1, v0, v5 */
		 v1 = com.badlogic.gdx.physics.box2d.JointDef$JointType.PrismaticJoint;
		 /* aput-object v1, v0, v6 */
		 v1 = com.badlogic.gdx.physics.box2d.JointDef$JointType.DistanceJoint;
		 /* aput-object v1, v0, v7 */
		 v1 = com.badlogic.gdx.physics.box2d.JointDef$JointType.PulleyJoint;
		 /* aput-object v1, v0, v8 */
		 int v1 = 5; // const/4 v1, 0x5
		 v2 = com.badlogic.gdx.physics.box2d.JointDef$JointType.MouseJoint;
		 /* aput-object v2, v0, v1 */
		 int v1 = 6; // const/4 v1, 0x6
		 v2 = com.badlogic.gdx.physics.box2d.JointDef$JointType.GearJoint;
		 /* aput-object v2, v0, v1 */
		 int v1 = 7; // const/4 v1, 0x7
		 v2 = com.badlogic.gdx.physics.box2d.JointDef$JointType.WheelJoint;
		 /* aput-object v2, v0, v1 */
		 /* const/16 v1, 0x8 */
		 v2 = com.badlogic.gdx.physics.box2d.JointDef$JointType.WeldJoint;
		 /* aput-object v2, v0, v1 */
		 /* const/16 v1, 0x9 */
		 v2 = com.badlogic.gdx.physics.box2d.JointDef$JointType.FrictionJoint;
		 /* aput-object v2, v0, v1 */
		 /* const/16 v1, 0xa */
		 v2 = com.badlogic.gdx.physics.box2d.JointDef$JointType.RopeJoint;
		 /* aput-object v2, v0, v1 */
		 /* const/16 v0, 0xb */
		 /* new-array v0, v0, [Lcom/badlogic/gdx/physics/box2d/JointDef$JointType; */
		 v1 = com.badlogic.gdx.physics.box2d.JointDef$JointType.Unknown;
		 /* aput-object v1, v0, v4 */
		 v1 = com.badlogic.gdx.physics.box2d.JointDef$JointType.RevoluteJoint;
		 /* aput-object v1, v0, v5 */
		 v1 = com.badlogic.gdx.physics.box2d.JointDef$JointType.PrismaticJoint;
		 /* aput-object v1, v0, v6 */
		 v1 = com.badlogic.gdx.physics.box2d.JointDef$JointType.DistanceJoint;
		 /* aput-object v1, v0, v7 */
		 v1 = com.badlogic.gdx.physics.box2d.JointDef$JointType.PulleyJoint;
		 /* aput-object v1, v0, v8 */
		 int v1 = 5; // const/4 v1, 0x5
		 v2 = com.badlogic.gdx.physics.box2d.JointDef$JointType.MouseJoint;
		 /* aput-object v2, v0, v1 */
		 int v1 = 6; // const/4 v1, 0x6
		 v2 = com.badlogic.gdx.physics.box2d.JointDef$JointType.GearJoint;
		 /* aput-object v2, v0, v1 */
		 int v1 = 7; // const/4 v1, 0x7
		 v2 = com.badlogic.gdx.physics.box2d.JointDef$JointType.WheelJoint;
		 /* aput-object v2, v0, v1 */
		 /* const/16 v1, 0x8 */
		 v2 = com.badlogic.gdx.physics.box2d.JointDef$JointType.WeldJoint;
		 /* aput-object v2, v0, v1 */
		 /* const/16 v1, 0x9 */
		 v2 = com.badlogic.gdx.physics.box2d.JointDef$JointType.FrictionJoint;
		 /* aput-object v2, v0, v1 */
		 /* const/16 v1, 0xa */
		 v2 = com.badlogic.gdx.physics.box2d.JointDef$JointType.RopeJoint;
		 /* aput-object v2, v0, v1 */
		 return;
	 } // .end method
	 private inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V */
		 /* iput p3, p0, Lcom/badlogic/gdx/physics/box2d/JointDef$JointType;->value:I */
		 return;
	 } // .end method
	 public static com.badlogic.gdx.physics.box2d.JointDef$JointType valueOf ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* const-class v0, Lcom/badlogic/gdx/physics/box2d/JointDef$JointType; */
		 java.lang.Enum .valueOf ( v0,p0 );
		 /* check-cast p0, Lcom/badlogic/gdx/physics/box2d/JointDef$JointType; */
	 } // .end method
	 public static com.badlogic.gdx.physics.box2d.JointDef$JointType values ( ) {
		 /* .locals 1 */
		 v0 = com.badlogic.gdx.physics.box2d.JointDef$JointType.$VALUES;
		 (( com.badlogic.gdx.physics.box2d.JointDef$JointType ) v0 ).clone ( ); // invoke-virtual {v0}, [Lcom/badlogic/gdx/physics/box2d/JointDef$JointType;->clone()Ljava/lang/Object;
		 /* check-cast v0, [Lcom/badlogic/gdx/physics/box2d/JointDef$JointType; */
	 } // .end method
	 /* # virtual methods */
	 public final Integer getValue ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lcom/badlogic/gdx/physics/box2d/JointDef$JointType;->value:I */
	 } // .end method
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          2, v3, :cond_2 */
/* check-cast p1, Lcom/badlogic/gdx/physics/box2d/joints/GearJointDef; */
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/badlogic/gdx/physics/box2d/World;->addr:J */
/* move-wide v3, v0 */
/* move-object/from16 v0, p1 */
v0 = this.bodyA;
/* move-object v2, v0 */
/* iget-wide v5, v2, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
/* move-object/from16 v0, p1 */
v0 = this.bodyB;
/* move-object v2, v0 */
/* iget-wide v7, v2, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
/* move-object/from16 v0, p1 */
/* iget-boolean v0, v0, Lcom/badlogic/gdx/physics/box2d/joints/GearJointDef;->collideConnected:Z */
/* move v9, v0 */
/* move-object/from16 v0, p1 */
v0 = this.joint1;
/* move-object v2, v0 */
/* iget-wide v10, v2, Lcom/badlogic/gdx/physics/box2d/Joint;->addr:J */
/* move-object/from16 v0, p1 */
v0 = this.joint2;
/* move-object v2, v0 */
/* iget-wide v12, v2, Lcom/badlogic/gdx/physics/box2d/Joint;->addr:J */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lcom/badlogic/gdx/physics/box2d/joints/GearJointDef;->ratio:F */
/* move v14, v0 */
/* move-object/from16 v2, p0 */
/* invoke-direct/range {v2 ..v14}, Lcom/badlogic/gdx/physics/box2d/World;->jniCreateGearJoint(JJJZJJF)J */
/* move-result-wide v2 */
/* goto/16 :goto_0 */
} // :cond_2
/* move-object/from16 v0, p1 */
v0 = this.type;
/* move-object v2, v0 */
v3 = com.badlogic.gdx.physics.box2d.JointDef$JointType.MouseJoint;
/* if-ne v2, v3, :cond_3 */
/* check-cast p1, Lcom/badlogic/gdx/physics/box2d/joints/MouseJointDef; */
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/badlogic/gdx/physics/box2d/World;->addr:J */
/* move-wide v3, v0 */
/* move-object/from16 v0, p1 */
v0 = this.bodyA;
/* move-object v2, v0 */
/* iget-wide v5, v2, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
/* move-object/from16 v0, p1 */
v0 = this.bodyB;
/* move-object v2, v0 */
/* iget-wide v7, v2, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
/* move-object/from16 v0, p1 */
/* iget-boolean v0, v0, Lcom/badlogic/gdx/physics/box2d/joints/MouseJointDef;->collideConnected:Z */
/* move v9, v0 */
/* move-object/from16 v0, p1 */
v0 = this.target;
/* move-object v2, v0 */
/* iget v10, v2, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* move-object/from16 v0, p1 */
v0 = this.target;
/* move-object v2, v0 */
/* iget v11, v2, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lcom/badlogic/gdx/physics/box2d/joints/MouseJointDef;->maxForce:F */
/* move v12, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lcom/badlogic/gdx/physics/box2d/joints/MouseJointDef;->frequencyHz:F */
/* move v13, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lcom/badlogic/gdx/physics/box2d/joints/MouseJointDef;->dampingRatio:F */
/* move v14, v0 */
/* move-object/from16 v2, p0 */
/* invoke-direct/range {v2 ..v14}, Lcom/badlogic/gdx/physics/box2d/World;->jniCreateMouseJoint(JJJZFFFFF)J */
/* move-result-wide v2 */
/* goto/16 :goto_0 */
} // :cond_3
/* move-object/from16 v0, p1 */
v0 = this.type;
/* move-object v2, v0 */
v3 = com.badlogic.gdx.physics.box2d.JointDef$JointType.PrismaticJoint;
/* if-ne v2, v3, :cond_4 */
/* check-cast p1, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJointDef; */
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/badlogic/gdx/physics/box2d/World;->addr:J */
/* move-wide v3, v0 */
/* move-object/from16 v0, p1 */
v0 = this.bodyA;
/* move-object v2, v0 */
/* iget-wide v5, v2, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
/* move-object/from16 v0, p1 */
v0 = this.bodyB;
/* move-object v2, v0 */
/* iget-wide v7, v2, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
/* move-object/from16 v0, p1 */
/* iget-boolean v0, v0, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJointDef;->collideConnected:Z */
/* move v9, v0 */
/* move-object/from16 v0, p1 */
v0 = this.localAnchorA;
/* move-object v2, v0 */
/* iget v10, v2, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* move-object/from16 v0, p1 */
v0 = this.localAnchorA;
/* move-object v2, v0 */
/* iget v11, v2, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* move-object/from16 v0, p1 */
v0 = this.localAnchorB;
/* move-object v2, v0 */
/* iget v12, v2, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* move-object/from16 v0, p1 */
v0 = this.localAnchorB;
/* move-object v2, v0 */
/* iget v13, v2, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* move-object/from16 v0, p1 */
v0 = this.localAxisA;
/* move-object v2, v0 */
/* iget v14, v2, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* move-object/from16 v0, p1 */
v0 = this.localAxisA;
/* move-object v2, v0 */
/* iget v15, v2, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJointDef;->referenceAngle:F */
/* move/from16 v16, v0 */
/* move-object/from16 v0, p1 */
/* iget-boolean v0, v0, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJointDef;->enableLimit:Z */
/* move/from16 v17, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJointDef;->lowerTranslation:F */
/* move/from16 v18, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJointDef;->upperTranslation:F */
/* move/from16 v19, v0 */
/* move-object/from16 v0, p1 */
/* iget-boolean v0, v0, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJointDef;->enableMotor:Z */
/* move/from16 v20, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJointDef;->maxMotorForce:F */
/* move/from16 v21, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJointDef;->motorSpeed:F */
/* move/from16 v22, v0 */
/* move-object/from16 v2, p0 */
/* invoke-direct/range {v2 ..v22}, Lcom/badlogic/gdx/physics/box2d/World;->jniCreatePrismaticJoint(JJJZFFFFFFFZFFZFF)J */
/* move-result-wide v2 */
/* goto/16 :goto_0 */
} // :cond_4
/* move-object/from16 v0, p1 */
v0 = this.type;
/* move-object v2, v0 */
v3 = com.badlogic.gdx.physics.box2d.JointDef$JointType.PulleyJoint;
/* if-ne v2, v3, :cond_5 */
/* check-cast p1, Lcom/badlogic/gdx/physics/box2d/joints/PulleyJointDef; */
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/badlogic/gdx/physics/box2d/World;->addr:J */
/* move-wide v3, v0 */
/* move-object/from16 v0, p1 */
v0 = this.bodyA;
/* move-object v2, v0 */
/* iget-wide v5, v2, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
/* move-object/from16 v0, p1 */
v0 = this.bodyB;
/* move-object v2, v0 */
/* iget-wide v7, v2, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
/* move-object/from16 v0, p1 */
/* iget-boolean v0, v0, Lcom/badlogic/gdx/physics/box2d/joints/PulleyJointDef;->collideConnected:Z */
/* move v9, v0 */
/* move-object/from16 v0, p1 */
v0 = this.groundAnchorA;
/* move-object v2, v0 */
/* iget v10, v2, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* move-object/from16 v0, p1 */
v0 = this.groundAnchorA;
/* move-object v2, v0 */
/* iget v11, v2, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* move-object/from16 v0, p1 */
v0 = this.groundAnchorB;
/* move-object v2, v0 */
/* iget v12, v2, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* move-object/from16 v0, p1 */
v0 = this.groundAnchorB;
/* move-object v2, v0 */
/* iget v13, v2, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* move-object/from16 v0, p1 */
v0 = this.localAnchorA;
/* move-object v2, v0 */
/* iget v14, v2, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* move-object/from16 v0, p1 */
v0 = this.localAnchorA;
/* move-object v2, v0 */
/* iget v15, v2, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* move-object/from16 v0, p1 */
v0 = this.localAnchorB;
/* move-object v2, v0 */
/* move-object v0, v2 */
/* iget v0, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* move/from16 v16, v0 */
/* move-object/from16 v0, p1 */
v0 = this.localAnchorB;
/* move-object v2, v0 */
/* move-object v0, v2 */
/* iget v0, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* move/from16 v17, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lcom/badlogic/gdx/physics/box2d/joints/PulleyJointDef;->lengthA:F */
/* move/from16 v18, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lcom/badlogic/gdx/physics/box2d/joints/PulleyJointDef;->lengthB:F */
/* move/from16 v19, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lcom/badlogic/gdx/physics/box2d/joints/PulleyJointDef;->ratio:F */
/* move/from16 v20, v0 */
/* move-object/from16 v2, p0 */
/* invoke-direct/range {v2 ..v20}, Lcom/badlogic/gdx/physics/box2d/World;->jniCreatePulleyJoint(JJJZFFFFFFFFFFF)J */
/* move-result-wide v2 */
/* goto/16 :goto_0 */
} // :cond_5
/* move-object/from16 v0, p1 */
v0 = this.type;
/* move-object v2, v0 */
v3 = com.badlogic.gdx.physics.box2d.JointDef$JointType.RevoluteJoint;
/* if-ne v2, v3, :cond_6 */
/* check-cast p1, Lcom/badlogic/gdx/physics/box2d/joints/RevoluteJointDef; */
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/badlogic/gdx/physics/box2d/World;->addr:J */
/* move-wide v3, v0 */
/* move-object/from16 v0, p1 */
v0 = this.bodyA;
/* move-object v2, v0 */
/* iget-wide v5, v2, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
/* move-object/from16 v0, p1 */
v0 = this.bodyB;
/* move-object v2, v0 */
/* iget-wide v7, v2, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
/* move-object/from16 v0, p1 */
/* iget-boolean v0, v0, Lcom/badlogic/gdx/physics/box2d/joints/RevoluteJointDef;->collideConnected:Z */
/* move v9, v0 */
/* move-object/from16 v0, p1 */
v0 = this.localAnchorA;
/* move-object v2, v0 */
/* iget v10, v2, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* move-object/from16 v0, p1 */
v0 = this.localAnchorA;
/* move-object v2, v0 */
/* iget v11, v2, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* move-object/from16 v0, p1 */
v0 = this.localAnchorB;
/* move-object v2, v0 */
/* iget v12, v2, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* move-object/from16 v0, p1 */
v0 = this.localAnchorB;
/* move-object v2, v0 */
/* iget v13, v2, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lcom/badlogic/gdx/physics/box2d/joints/RevoluteJointDef;->referenceAngle:F */
/* move v14, v0 */
/* move-object/from16 v0, p1 */
/* iget-boolean v0, v0, Lcom/badlogic/gdx/physics/box2d/joints/RevoluteJointDef;->enableLimit:Z */
/* move v15, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lcom/badlogic/gdx/physics/box2d/joints/RevoluteJointDef;->lowerAngle:F */
/* move/from16 v16, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lcom/badlogic/gdx/physics/box2d/joints/RevoluteJointDef;->upperAngle:F */
/* move/from16 v17, v0 */
/* move-object/from16 v0, p1 */
/* iget-boolean v0, v0, Lcom/badlogic/gdx/physics/box2d/joints/RevoluteJointDef;->enableMotor:Z */
/* move/from16 v18, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lcom/badlogic/gdx/physics/box2d/joints/RevoluteJointDef;->motorSpeed:F */
/* move/from16 v19, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lcom/badlogic/gdx/physics/box2d/joints/RevoluteJointDef;->maxMotorTorque:F */
/* move/from16 v20, v0 */
/* move-object/from16 v2, p0 */
/* invoke-direct/range {v2 ..v20}, Lcom/badlogic/gdx/physics/box2d/World;->jniCreateRevoluteJoint(JJJZFFFFFZFFZFF)J */
/* move-result-wide v2 */
/* goto/16 :goto_0 */
} // :cond_6
/* move-object/from16 v0, p1 */
v0 = this.type;
/* move-object v2, v0 */
v3 = com.badlogic.gdx.physics.box2d.JointDef$JointType.WeldJoint;
/* if-ne v2, v3, :cond_7 */
/* check-cast p1, Lcom/badlogic/gdx/physics/box2d/joints/WeldJointDef; */
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/badlogic/gdx/physics/box2d/World;->addr:J */
/* move-wide v3, v0 */
/* move-object/from16 v0, p1 */
v0 = this.bodyA;
/* move-object v2, v0 */
/* iget-wide v5, v2, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
/* move-object/from16 v0, p1 */
v0 = this.bodyB;
/* move-object v2, v0 */
/* iget-wide v7, v2, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
/* move-object/from16 v0, p1 */
/* iget-boolean v0, v0, Lcom/badlogic/gdx/physics/box2d/joints/WeldJointDef;->collideConnected:Z */
/* move v9, v0 */
/* move-object/from16 v0, p1 */
v0 = this.localAnchorA;
/* move-object v2, v0 */
/* iget v10, v2, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* move-object/from16 v0, p1 */
v0 = this.localAnchorA;
/* move-object v2, v0 */
/* iget v11, v2, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* move-object/from16 v0, p1 */
v0 = this.localAnchorB;
/* move-object v2, v0 */
/* iget v12, v2, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* move-object/from16 v0, p1 */
v0 = this.localAnchorB;
/* move-object v2, v0 */
/* iget v13, v2, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lcom/badlogic/gdx/physics/box2d/joints/WeldJointDef;->referenceAngle:F */
/* move v14, v0 */
/* move-object/from16 v2, p0 */
/* invoke-direct/range {v2 ..v14}, Lcom/badlogic/gdx/physics/box2d/World;->jniCreateWeldJoint(JJJZFFFFF)J */
/* move-result-wide v2 */
/* goto/16 :goto_0 */
} // :cond_7
/* move-object/from16 v0, p1 */
v0 = this.type;
/* move-object v2, v0 */
v3 = com.badlogic.gdx.physics.box2d.JointDef$JointType.RopeJoint;
/* if-ne v2, v3, :cond_8 */
/* check-cast p1, Lcom/badlogic/gdx/physics/box2d/joints/RopeJointDef; */
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/badlogic/gdx/physics/box2d/World;->addr:J */
/* move-wide v3, v0 */
/* move-object/from16 v0, p1 */
v0 = this.bodyA;
/* move-object v2, v0 */
/* iget-wide v5, v2, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
/* move-object/from16 v0, p1 */
v0 = this.bodyB;
/* move-object v2, v0 */
/* iget-wide v7, v2, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
/* move-object/from16 v0, p1 */
/* iget-boolean v0, v0, Lcom/badlogic/gdx/physics/box2d/joints/RopeJointDef;->collideConnected:Z */
/* move v9, v0 */
/* move-object/from16 v0, p1 */
v0 = this.localAnchorA;
/* move-object v2, v0 */
/* iget v10, v2, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* move-object/from16 v0, p1 */
v0 = this.localAnchorA;
/* move-object v2, v0 */
/* iget v11, v2, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* move-object/from16 v0, p1 */
v0 = this.localAnchorB;
/* move-object v2, v0 */
/* iget v12, v2, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* move-object/from16 v0, p1 */
v0 = this.localAnchorB;
/* move-object v2, v0 */
/* iget v13, v2, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lcom/badlogic/gdx/physics/box2d/joints/RopeJointDef;->maxLength:F */
/* move v14, v0 */
/* move-object/from16 v2, p0 */
/* invoke-direct/range {v2 ..v14}, Lcom/badlogic/gdx/physics/box2d/World;->jniCreateRopeJoint(JJJZFFFFF)J */
/* move-result-wide v2 */
/* goto/16 :goto_0 */
} // :cond_8
/* move-object/from16 v0, p1 */
v0 = this.type;
/* move-object v2, v0 */
v3 = com.badlogic.gdx.physics.box2d.JointDef$JointType.WheelJoint;
/* if-ne v2, v3, :cond_9 */
/* check-cast p1, Lcom/badlogic/gdx/physics/box2d/joints/WheelJointDef; */
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/badlogic/gdx/physics/box2d/World;->addr:J */
/* move-wide v3, v0 */
/* move-object/from16 v0, p1 */
v0 = this.bodyA;
/* move-object v2, v0 */
/* iget-wide v5, v2, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
/* move-object/from16 v0, p1 */
v0 = this.bodyB;
/* move-object v2, v0 */
/* iget-wide v7, v2, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
/* move-object/from16 v0, p1 */
/* iget-boolean v0, v0, Lcom/badlogic/gdx/physics/box2d/joints/WheelJointDef;->collideConnected:Z */
/* move v9, v0 */
/* move-object/from16 v0, p1 */
v0 = this.localAnchorA;
/* move-object v2, v0 */
/* iget v10, v2, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* move-object/from16 v0, p1 */
v0 = this.localAnchorA;
/* move-object v2, v0 */
/* iget v11, v2, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* move-object/from16 v0, p1 */
v0 = this.localAnchorB;
/* move-object v2, v0 */
/* iget v12, v2, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* move-object/from16 v0, p1 */
v0 = this.localAnchorB;
/* move-object v2, v0 */
/* iget v13, v2, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* move-object/from16 v0, p1 */
v0 = this.localAxisA;
/* move-object v2, v0 */
/* iget v14, v2, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* move-object/from16 v0, p1 */
v0 = this.localAxisA;
/* move-object v2, v0 */
/* iget v15, v2, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* move-object/from16 v0, p1 */
/* iget-boolean v0, v0, Lcom/badlogic/gdx/physics/box2d/joints/WheelJointDef;->enableMotor:Z */
/* move/from16 v16, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lcom/badlogic/gdx/physics/box2d/joints/WheelJointDef;->maxMotorTorque:F */
/* move/from16 v17, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lcom/badlogic/gdx/physics/box2d/joints/WheelJointDef;->motorSpeed:F */
/* move/from16 v18, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lcom/badlogic/gdx/physics/box2d/joints/WheelJointDef;->frequencyHz:F */
/* move/from16 v19, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lcom/badlogic/gdx/physics/box2d/joints/WheelJointDef;->dampingRatio:F */
/* move/from16 v20, v0 */
/* move-object/from16 v2, p0 */
/* invoke-direct/range {v2 ..v20}, Lcom/badlogic/gdx/physics/box2d/World;->jniCreateWheelJoint(JJJZFFFFFFZFFFF)J */
/* move-result-wide v2 */
/* goto/16 :goto_0 */
} // :cond_9
/* const-wide/16 v2, 0x0 */
/* goto/16 :goto_0 */
} // .end method
private void endContact ( Long p0 ) {
/* .locals 2 */
v0 = this.contact;
/* iput-wide p1, v0, Lcom/badlogic/gdx/physics/box2d/Contact;->addr:J */
v0 = this.contactListener;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.contactListener;
v1 = this.contact;
} // :cond_0
return;
} // .end method
public static native Float getVelocityThreshold ( ) {
} // .end method
private native void jniClearForces ( Long p0 ) {
} // .end method
private native Long jniCreateBody ( Long p0, Integer p1, Float p2, Float p3, Float p4, Float p5, Float p6, Float p7, Float p8, Float p9, Boolean p10, Boolean p11, Boolean p12, Boolean p13, Boolean p14, Float p15 ) {
} // .end method
private native Long jniCreateDistanceJoint ( Long p0, Long p1, Long p2, Boolean p3, Float p4, Float p5, Float p6, Float p7, Float p8, Float p9, Float p10 ) {
} // .end method
private native Long jniCreateFrictionJoint ( Long p0, Long p1, Long p2, Boolean p3, Float p4, Float p5, Float p6, Float p7, Float p8, Float p9 ) {
} // .end method
private native Long jniCreateGearJoint ( Long p0, Long p1, Long p2, Boolean p3, Long p4, Long p5, Float p6 ) {
} // .end method
private native Long jniCreateMouseJoint ( Long p0, Long p1, Long p2, Boolean p3, Float p4, Float p5, Float p6, Float p7, Float p8 ) {
} // .end method
private native Long jniCreatePrismaticJoint ( Long p0, Long p1, Long p2, Boolean p3, Float p4, Float p5, Float p6, Float p7, Float p8, Float p9, Float p10, Boolean p11, Float p12, Float p13, Boolean p14, Float p15, Float p16 ) {
} // .end method
private native Long jniCreatePulleyJoint ( Long p0, Long p1, Long p2, Boolean p3, Float p4, Float p5, Float p6, Float p7, Float p8, Float p9, Float p10, Float p11, Float p12, Float p13, Float p14 ) {
} // .end method
private native Long jniCreateRevoluteJoint ( Long p0, Long p1, Long p2, Boolean p3, Float p4, Float p5, Float p6, Float p7, Float p8, Boolean p9, Float p10, Float p11, Boolean p12, Float p13, Float p14 ) {
} // .end method
private native Long jniCreateRopeJoint ( Long p0, Long p1, Long p2, Boolean p3, Float p4, Float p5, Float p6, Float p7, Float p8 ) {
} // .end method
private native Long jniCreateWeldJoint ( Long p0, Long p1, Long p2, Boolean p3, Float p4, Float p5, Float p6, Float p7, Float p8 ) {
} // .end method
private native Long jniCreateWheelJoint ( Long p0, Long p1, Long p2, Boolean p3, Float p4, Float p5, Float p6, Float p7, Float p8, Float p9, Boolean p10, Float p11, Float p12, Float p13, Float p14 ) {
} // .end method
private native void jniDestroyBody ( Long p0, Long p1 ) {
} // .end method
private native void jniDestroyJoint ( Long p0, Long p1 ) {
} // .end method
private native void jniDispose ( Long p0 ) {
} // .end method
private native Boolean jniGetAutoClearForces ( Long p0 ) {
} // .end method
private native Integer jniGetBodyCount ( Long p0 ) {
} // .end method
private native Integer jniGetContactCount ( Long p0 ) {
} // .end method
private native void jniGetContactList ( Long p0, Long[] p1 ) {
} // .end method
private native void jniGetGravity ( Long p0, Float[] p1 ) {
} // .end method
private native Integer jniGetJointcount ( Long p0 ) {
} // .end method
private native Integer jniGetProxyCount ( Long p0 ) {
} // .end method
private native Boolean jniIsLocked ( Long p0 ) {
} // .end method
private native void jniQueryAABB ( Long p0, Float p1, Float p2, Float p3, Float p4 ) {
} // .end method
private native void jniRayCast ( Long p0, Float p1, Float p2, Float p3, Float p4 ) {
} // .end method
private native void jniSetAutoClearForces ( Long p0, Boolean p1 ) {
} // .end method
private native void jniSetContiousPhysics ( Long p0, Boolean p1 ) {
} // .end method
private native void jniSetGravity ( Long p0, Float p1, Float p2 ) {
} // .end method
private native void jniSetWarmStarting ( Long p0, Boolean p1 ) {
} // .end method
private native void jniStep ( Long p0, Float p1, Integer p2, Integer p3 ) {
} // .end method
private native Long newWorld ( Float p0, Float p1, Boolean p2 ) {
} // .end method
private void postSolve ( Long p0, Long p1 ) {
/* .locals 3 */
v0 = this.contact;
/* iput-wide p1, v0, Lcom/badlogic/gdx/physics/box2d/Contact;->addr:J */
v0 = this.impulse;
/* iput-wide p3, v0, Lcom/badlogic/gdx/physics/box2d/ContactImpulse;->addr:J */
v0 = this.contactListener;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.contactListener;
v1 = this.contact;
v2 = this.impulse;
} // :cond_0
return;
} // .end method
private void preSolve ( Long p0, Long p1 ) {
/* .locals 3 */
v0 = this.contact;
/* iput-wide p1, v0, Lcom/badlogic/gdx/physics/box2d/Contact;->addr:J */
v0 = this.manifold;
/* iput-wide p3, v0, Lcom/badlogic/gdx/physics/box2d/Manifold;->addr:J */
v0 = this.contactListener;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.contactListener;
v1 = this.contact;
v2 = this.manifold;
} // :cond_0
return;
} // .end method
private Boolean reportFixture ( Long p0 ) {
/* .locals 2 */
v0 = this.queryCallback;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.queryCallback;
v1 = this.fixtures;
(( com.badlogic.gdx.utils.LongMap ) v1 ).get ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Lcom/badlogic/gdx/utils/LongMap;->get(J)Ljava/lang/Object;
v0 = /* check-cast p0, Lcom/badlogic/gdx/physics/box2d/Fixture; */
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
private Float reportRayFixture ( Long p0, Float p1, Float p2, Float p3, Float p4, Float p5 ) {
/* .locals 4 */
v0 = this.rayCastCallback;
if ( v0 != null) { // if-eqz v0, :cond_0
v1 = this.rayCastCallback;
v0 = this.fixtures;
(( com.badlogic.gdx.utils.LongMap ) v0 ).get ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/badlogic/gdx/utils/LongMap;->get(J)Ljava/lang/Object;
/* check-cast v0, Lcom/badlogic/gdx/physics/box2d/Fixture; */
v2 = this.rayPoint;
(( com.badlogic.gdx.math.Vector2 ) v2 ).set ( p3, p4 ); // invoke-virtual {v2, p3, p4}, Lcom/badlogic/gdx/math/Vector2;->set(FF)Lcom/badlogic/gdx/math/Vector2;
v3 = this.rayNormal;
v0 = (( com.badlogic.gdx.math.Vector2 ) v3 ).set ( p5, p6 ); // invoke-virtual {v3, p5, p6}, Lcom/badlogic/gdx/math/Vector2;->set(FF)Lcom/badlogic/gdx/math/Vector2;
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static native void setVelocityThreshold ( Float p0 ) {
} // .end method
/* # virtual methods */
public final void QueryAABB ( com.badlogic.gdx.physics.box2d.QueryCallback p0, Float p1, Float p2, Float p3, Float p4 ) {
/* .locals 7 */
this.queryCallback = p1;
/* iget-wide v1, p0, Lcom/badlogic/gdx/physics/box2d/World;->addr:J */
/* move-object v0, p0 */
/* move v3, p2 */
/* move v4, p3 */
/* move v5, p4 */
/* move v6, p5 */
/* invoke-direct/range {v0 ..v6}, Lcom/badlogic/gdx/physics/box2d/World;->jniQueryAABB(JFFFF)V */
return;
} // .end method
public final void clearForces ( ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/World;->addr:J */
/* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/World;->jniClearForces(J)V */
return;
} // .end method
public final com.badlogic.gdx.physics.box2d.Body createBody ( com.badlogic.gdx.physics.box2d.BodyDef p0 ) {
/* .locals 22 */
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/badlogic/gdx/physics/box2d/World;->addr:J */
/* move-wide v5, v0 */
/* move-object/from16 v0, p1 */
v0 = this.type;
/* move-object v4, v0 */
v7 = (( com.badlogic.gdx.physics.box2d.BodyDef$BodyType ) v4 ).getValue ( ); // invoke-virtual {v4}, Lcom/badlogic/gdx/physics/box2d/BodyDef$BodyType;->getValue()I
/* move-object/from16 v0, p1 */
v0 = this.position;
/* move-object v4, v0 */
/* iget v8, v4, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* move-object/from16 v0, p1 */
v0 = this.position;
/* move-object v4, v0 */
/* iget v9, v4, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lcom/badlogic/gdx/physics/box2d/BodyDef;->angle:F */
/* move v10, v0 */
/* move-object/from16 v0, p1 */
v0 = this.linearVelocity;
/* move-object v4, v0 */
/* iget v11, v4, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* move-object/from16 v0, p1 */
v0 = this.linearVelocity;
/* move-object v4, v0 */
/* iget v12, v4, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lcom/badlogic/gdx/physics/box2d/BodyDef;->angularVelocity:F */
/* move v13, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lcom/badlogic/gdx/physics/box2d/BodyDef;->linearDamping:F */
/* move v14, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lcom/badlogic/gdx/physics/box2d/BodyDef;->angularDamping:F */
/* move v15, v0 */
/* move-object/from16 v0, p1 */
/* iget-boolean v0, v0, Lcom/badlogic/gdx/physics/box2d/BodyDef;->allowSleep:Z */
/* move/from16 v16, v0 */
/* move-object/from16 v0, p1 */
/* iget-boolean v0, v0, Lcom/badlogic/gdx/physics/box2d/BodyDef;->awake:Z */
/* move/from16 v17, v0 */
/* move-object/from16 v0, p1 */
/* iget-boolean v0, v0, Lcom/badlogic/gdx/physics/box2d/BodyDef;->fixedRotation:Z */
/* move/from16 v18, v0 */
/* move-object/from16 v0, p1 */
/* iget-boolean v0, v0, Lcom/badlogic/gdx/physics/box2d/BodyDef;->bullet:Z */
/* move/from16 v19, v0 */
/* move-object/from16 v0, p1 */
/* iget-boolean v0, v0, Lcom/badlogic/gdx/physics/box2d/BodyDef;->active:Z */
/* move/from16 v20, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lcom/badlogic/gdx/physics/box2d/BodyDef;->gravityScale:F */
/* move/from16 v21, v0 */
/* move-object/from16 v4, p0 */
/* invoke-direct/range {v4 ..v21}, Lcom/badlogic/gdx/physics/box2d/World;->jniCreateBody(JIFFFFFFFFZZZZZF)J */
/* move-result-wide v4 */
/* move-object/from16 v0, p0 */
v0 = this.freeBodies;
/* move-object v6, v0 */
(( com.badlogic.gdx.utils.Pool ) v6 ).obtain ( ); // invoke-virtual {v6}, Lcom/badlogic/gdx/utils/Pool;->obtain()Ljava/lang/Object;
/* check-cast p1, Lcom/badlogic/gdx/physics/box2d/Body; */
/* move-object/from16 v0, p1 */
/* move-wide v1, v4 */
(( com.badlogic.gdx.physics.box2d.Body ) v0 ).reset ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/badlogic/gdx/physics/box2d/Body;->reset(J)V
/* move-object/from16 v0, p0 */
v0 = this.bodies;
/* move-object v4, v0 */
/* move-object/from16 v0, p1 */
/* iget-wide v0, v0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
/* move-wide v5, v0 */
/* move-object v0, v4 */
/* move-wide v1, v5 */
/* move-object/from16 v3, p1 */
(( com.badlogic.gdx.utils.LongMap ) v0 ).put ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lcom/badlogic/gdx/utils/LongMap;->put(JLjava/lang/Object;)Ljava/lang/Object;
} // .end method
public final com.badlogic.gdx.physics.box2d.Joint createJoint ( com.badlogic.gdx.physics.box2d.JointDef p0 ) {
/* .locals 5 */
/* invoke-direct {p0, p1}, Lcom/badlogic/gdx/physics/box2d/World;->createProperJoint(Lcom/badlogic/gdx/physics/box2d/JointDef;)J */
/* move-result-wide v0 */
int v2 = 0; // const/4 v2, 0x0
v3 = this.type;
v4 = com.badlogic.gdx.physics.box2d.JointDef$JointType.DistanceJoint;
/* if-ne v3, v4, :cond_0 */
/* new-instance v2, Lcom/badlogic/gdx/physics/box2d/joints/DistanceJoint; */
/* invoke-direct {v2, p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/joints/DistanceJoint;-><init>(Lcom/badlogic/gdx/physics/box2d/World;J)V */
} // :cond_0
v3 = this.type;
v4 = com.badlogic.gdx.physics.box2d.JointDef$JointType.FrictionJoint;
/* if-ne v3, v4, :cond_1 */
/* new-instance v2, Lcom/badlogic/gdx/physics/box2d/joints/FrictionJoint; */
/* invoke-direct {v2, p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/joints/FrictionJoint;-><init>(Lcom/badlogic/gdx/physics/box2d/World;J)V */
} // :cond_1
v3 = this.type;
v4 = com.badlogic.gdx.physics.box2d.JointDef$JointType.GearJoint;
/* if-ne v3, v4, :cond_2 */
/* new-instance v2, Lcom/badlogic/gdx/physics/box2d/joints/GearJoint; */
/* invoke-direct {v2, p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/joints/GearJoint;-><init>(Lcom/badlogic/gdx/physics/box2d/World;J)V */
} // :cond_2
v3 = this.type;
v4 = com.badlogic.gdx.physics.box2d.JointDef$JointType.MouseJoint;
/* if-ne v3, v4, :cond_3 */
/* new-instance v2, Lcom/badlogic/gdx/physics/box2d/joints/MouseJoint; */
/* invoke-direct {v2, p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/joints/MouseJoint;-><init>(Lcom/badlogic/gdx/physics/box2d/World;J)V */
} // :cond_3
v3 = this.type;
v4 = com.badlogic.gdx.physics.box2d.JointDef$JointType.PrismaticJoint;
/* if-ne v3, v4, :cond_4 */
/* new-instance v2, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJoint; */
/* invoke-direct {v2, p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJoint;-><init>(Lcom/badlogic/gdx/physics/box2d/World;J)V */
} // :cond_4
v3 = this.type;
v4 = com.badlogic.gdx.physics.box2d.JointDef$JointType.PulleyJoint;
/* if-ne v3, v4, :cond_5 */
/* new-instance v2, Lcom/badlogic/gdx/physics/box2d/joints/PulleyJoint; */
/* invoke-direct {v2, p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/joints/PulleyJoint;-><init>(Lcom/badlogic/gdx/physics/box2d/World;J)V */
} // :cond_5
v3 = this.type;
v4 = com.badlogic.gdx.physics.box2d.JointDef$JointType.RevoluteJoint;
/* if-ne v3, v4, :cond_6 */
/* new-instance v2, Lcom/badlogic/gdx/physics/box2d/joints/RevoluteJoint; */
/* invoke-direct {v2, p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/joints/RevoluteJoint;-><init>(Lcom/badlogic/gdx/physics/box2d/World;J)V */
} // :cond_6
v3 = this.type;
v4 = com.badlogic.gdx.physics.box2d.JointDef$JointType.WeldJoint;
/* if-ne v3, v4, :cond_7 */
/* new-instance v2, Lcom/badlogic/gdx/physics/box2d/joints/WeldJoint; */
/* invoke-direct {v2, p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/joints/WeldJoint;-><init>(Lcom/badlogic/gdx/physics/box2d/World;J)V */
} // :cond_7
v3 = this.type;
v4 = com.badlogic.gdx.physics.box2d.JointDef$JointType.RopeJoint;
/* if-ne v3, v4, :cond_8 */
/* new-instance v2, Lcom/badlogic/gdx/physics/box2d/joints/RopeJoint; */
/* invoke-direct {v2, p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/joints/RopeJoint;-><init>(Lcom/badlogic/gdx/physics/box2d/World;J)V */
} // :cond_8
v3 = this.type;
v4 = com.badlogic.gdx.physics.box2d.JointDef$JointType.WheelJoint;
/* if-ne v3, v4, :cond_a */
/* new-instance v2, Lcom/badlogic/gdx/physics/box2d/joints/WheelJoint; */
/* invoke-direct {v2, p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/joints/WheelJoint;-><init>(Lcom/badlogic/gdx/physics/box2d/World;J)V */
/* move-object v0, v2 */
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_9
v1 = this.joints;
/* iget-wide v2, v0, Lcom/badlogic/gdx/physics/box2d/Joint;->addr:J */
(( com.badlogic.gdx.utils.LongMap ) v1 ).put ( v2, v3, v0 ); // invoke-virtual {v1, v2, v3, v0}, Lcom/badlogic/gdx/utils/LongMap;->put(JLjava/lang/Object;)Ljava/lang/Object;
} // :cond_9
/* new-instance v1, Lcom/badlogic/gdx/physics/box2d/JointEdge; */
v2 = this.bodyB;
/* invoke-direct {v1, v2, v0}, Lcom/badlogic/gdx/physics/box2d/JointEdge;-><init>(Lcom/badlogic/gdx/physics/box2d/Body;Lcom/badlogic/gdx/physics/box2d/Joint;)V */
/* new-instance v2, Lcom/badlogic/gdx/physics/box2d/JointEdge; */
v3 = this.bodyA;
/* invoke-direct {v2, v3, v0}, Lcom/badlogic/gdx/physics/box2d/JointEdge;-><init>(Lcom/badlogic/gdx/physics/box2d/Body;Lcom/badlogic/gdx/physics/box2d/Joint;)V */
this.jointEdgeA = v1;
this.jointEdgeB = v2;
v3 = this.bodyA;
v3 = this.joints;
(( java.util.ArrayList ) v3 ).add ( v1 ); // invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
v1 = this.bodyB;
v1 = this.joints;
(( java.util.ArrayList ) v1 ).add ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // :cond_a
/* move-object v0, v2 */
} // .end method
public final void destroyBody ( com.badlogic.gdx.physics.box2d.Body p0 ) {
/* .locals 6 */
int v5 = 0; // const/4 v5, 0x0
int v4 = 0; // const/4 v4, 0x0
(( com.badlogic.gdx.physics.box2d.Body ) p1 ).setUserData ( v5 ); // invoke-virtual {p1, v5}, Lcom/badlogic/gdx/physics/box2d/Body;->setUserData(Ljava/lang/Object;)V
v0 = this.bodies;
/* iget-wide v1, p1, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
(( com.badlogic.gdx.utils.LongMap ) v0 ).remove ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/badlogic/gdx/utils/LongMap;->remove(J)Ljava/lang/Object;
/* move v1, v4 */
} // :goto_0
(( com.badlogic.gdx.physics.box2d.Body ) p1 ).getFixtureList ( ); // invoke-virtual {p1}, Lcom/badlogic/gdx/physics/box2d/Body;->getFixtureList()Ljava/util/ArrayList;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* if-ge v1, v0, :cond_1 */
(( com.badlogic.gdx.physics.box2d.Body ) p1 ).getFixtureList ( ); // invoke-virtual {p1}, Lcom/badlogic/gdx/physics/box2d/Body;->getFixtureList()Ljava/util/ArrayList;
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/badlogic/gdx/physics/box2d/Fixture; */
/* iget-wide v2, v0, Lcom/badlogic/gdx/physics/box2d/Fixture;->addr:J */
v0 = this.fixtures;
(( com.badlogic.gdx.utils.LongMap ) v0 ).remove ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Lcom/badlogic/gdx/utils/LongMap;->remove(J)Ljava/lang/Object;
/* check-cast v0, Lcom/badlogic/gdx/physics/box2d/Fixture; */
if ( v0 != null) { // if-eqz v0, :cond_0
(( com.badlogic.gdx.physics.box2d.Fixture ) v0 ).setUserData ( v5 ); // invoke-virtual {v0, v5}, Lcom/badlogic/gdx/physics/box2d/Fixture;->setUserData(Ljava/lang/Object;)V
} // :cond_0
/* add-int/lit8 v0, v1, 0x1 */
/* move v1, v0 */
} // :cond_1
/* move v1, v4 */
} // :goto_1
(( com.badlogic.gdx.physics.box2d.Body ) p1 ).getJointList ( ); // invoke-virtual {p1}, Lcom/badlogic/gdx/physics/box2d/Body;->getJointList()Ljava/util/ArrayList;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* if-ge v1, v0, :cond_2 */
v2 = this.joints;
(( com.badlogic.gdx.physics.box2d.Body ) p1 ).getJointList ( ); // invoke-virtual {p1}, Lcom/badlogic/gdx/physics/box2d/Body;->getJointList()Ljava/util/ArrayList;
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/badlogic/gdx/physics/box2d/JointEdge; */
v0 = this.joint;
/* iget-wide v3, v0, Lcom/badlogic/gdx/physics/box2d/Joint;->addr:J */
(( com.badlogic.gdx.utils.LongMap ) v2 ).remove ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Lcom/badlogic/gdx/utils/LongMap;->remove(J)Ljava/lang/Object;
/* add-int/lit8 v0, v1, 0x1 */
/* move v1, v0 */
} // :cond_2
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/World;->addr:J */
/* iget-wide v2, p1, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
/* invoke-direct {p0, v0, v1, v2, v3}, Lcom/badlogic/gdx/physics/box2d/World;->jniDestroyBody(JJ)V */
v0 = this.freeBodies;
(( com.badlogic.gdx.utils.Pool ) v0 ).free ( p1 ); // invoke-virtual {v0, p1}, Lcom/badlogic/gdx/utils/Pool;->free(Ljava/lang/Object;)V
return;
} // .end method
public final void destroyJoint ( com.badlogic.gdx.physics.box2d.Joint p0 ) {
/* .locals 4 */
v0 = this.joints;
/* iget-wide v1, p1, Lcom/badlogic/gdx/physics/box2d/Joint;->addr:J */
(( com.badlogic.gdx.utils.LongMap ) v0 ).remove ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/badlogic/gdx/utils/LongMap;->remove(J)Ljava/lang/Object;
v0 = this.jointEdgeA;
v0 = this.other;
v0 = this.joints;
v1 = this.jointEdgeB;
(( java.util.ArrayList ) v0 ).remove ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
v0 = this.jointEdgeB;
v0 = this.other;
v0 = this.joints;
v1 = this.jointEdgeA;
(( java.util.ArrayList ) v0 ).remove ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/World;->addr:J */
/* iget-wide v2, p1, Lcom/badlogic/gdx/physics/box2d/Joint;->addr:J */
/* invoke-direct {p0, v0, v1, v2, v3}, Lcom/badlogic/gdx/physics/box2d/World;->jniDestroyJoint(JJ)V */
return;
} // .end method
public final void dispose ( ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/World;->addr:J */
/* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/World;->jniDispose(J)V */
return;
} // .end method
public final Boolean getAutoClearForces ( ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/World;->addr:J */
v0 = /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/World;->jniGetAutoClearForces(J)Z */
} // .end method
public final java.util.Iterator getBodies ( ) {
/* .locals 1 */
v0 = this.bodies;
(( com.badlogic.gdx.utils.LongMap ) v0 ).values ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/utils/LongMap;->values()Lcom/badlogic/gdx/utils/LongMap$Values;
} // .end method
public final Integer getBodyCount ( ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/World;->addr:J */
v0 = /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/World;->jniGetBodyCount(J)I */
} // .end method
public final Integer getContactCount ( ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/World;->addr:J */
v0 = /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/World;->jniGetContactCount(J)I */
} // .end method
public final java.util.List getContactList ( ) {
/* .locals 8 */
int v7 = 0; // const/4 v7, 0x0
v1 = (( com.badlogic.gdx.physics.box2d.World ) p0 ).getContactCount ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/physics/box2d/World;->getContactCount()I
v0 = this.contactAddrs;
/* array-length v0, v0 */
/* if-le v1, v0, :cond_0 */
/* mul-int/lit8 v0, v1, 0x2 */
/* new-array v2, v0, [J */
this.contactAddrs = v2;
v2 = this.contacts;
(( java.util.ArrayList ) v2 ).ensureCapacity ( v0 ); // invoke-virtual {v2, v0}, Ljava/util/ArrayList;->ensureCapacity(I)V
v2 = this.freeContacts;
(( java.util.ArrayList ) v2 ).ensureCapacity ( v0 ); // invoke-virtual {v2, v0}, Ljava/util/ArrayList;->ensureCapacity(I)V
} // :cond_0
v0 = this.freeContacts;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* if-le v1, v0, :cond_1 */
v0 = this.freeContacts;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* move v2, v7 */
} // :goto_0
/* sub-int v3, v1, v0 */
/* if-ge v2, v3, :cond_1 */
v3 = this.freeContacts;
/* new-instance v4, Lcom/badlogic/gdx/physics/box2d/Contact; */
/* const-wide/16 v5, 0x0 */
/* invoke-direct {v4, p0, v5, v6}, Lcom/badlogic/gdx/physics/box2d/Contact;-><init>(Lcom/badlogic/gdx/physics/box2d/World;J)V */
(( java.util.ArrayList ) v3 ).add ( v4 ); // invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
/* iget-wide v2, p0, Lcom/badlogic/gdx/physics/box2d/World;->addr:J */
v0 = this.contactAddrs;
/* invoke-direct {p0, v2, v3, v0}, Lcom/badlogic/gdx/physics/box2d/World;->jniGetContactList(J[J)V */
v0 = this.contacts;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
/* move v2, v7 */
} // :goto_1
/* if-ge v2, v1, :cond_2 */
v0 = this.freeContacts;
(( java.util.ArrayList ) v0 ).get ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/badlogic/gdx/physics/box2d/Contact; */
v3 = this.contactAddrs;
/* aget-wide v3, v3, v2 */
/* iput-wide v3, v0, Lcom/badlogic/gdx/physics/box2d/Contact;->addr:J */
v3 = this.contacts;
(( java.util.ArrayList ) v3 ).add ( v0 ); // invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* add-int/lit8 v0, v2, 0x1 */
/* move v2, v0 */
} // :cond_2
v0 = this.contacts;
} // .end method
public final com.badlogic.gdx.math.Vector2 getGravity ( ) {
/* .locals 3 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/World;->addr:J */
v2 = this.tmpGravity;
/* invoke-direct {p0, v0, v1, v2}, Lcom/badlogic/gdx/physics/box2d/World;->jniGetGravity(J[F)V */
v0 = this.gravity;
v1 = this.tmpGravity;
int v2 = 0; // const/4 v2, 0x0
/* aget v1, v1, v2 */
/* iput v1, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
v0 = this.gravity;
v1 = this.tmpGravity;
int v2 = 1; // const/4 v2, 0x1
/* aget v1, v1, v2 */
/* iput v1, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
v0 = this.gravity;
} // .end method
public final Integer getJointCount ( ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/World;->addr:J */
v0 = /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/World;->jniGetJointcount(J)I */
} // .end method
public final java.util.Iterator getJoints ( ) {
/* .locals 1 */
v0 = this.joints;
(( com.badlogic.gdx.utils.LongMap ) v0 ).values ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/utils/LongMap;->values()Lcom/badlogic/gdx/utils/LongMap$Values;
} // .end method
public final Integer getProxyCount ( ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/World;->addr:J */
v0 = /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/World;->jniGetProxyCount(J)I */
} // .end method
public final Boolean isLocked ( ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/World;->addr:J */
v0 = /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/World;->jniIsLocked(J)Z */
} // .end method
public final void rayCast ( com.badlogic.gdx.physics.box2d.RayCastCallback p0, com.badlogic.gdx.math.Vector2 p1, com.badlogic.gdx.math.Vector2 p2 ) {
/* .locals 7 */
this.rayCastCallback = p1;
/* iget-wide v1, p0, Lcom/badlogic/gdx/physics/box2d/World;->addr:J */
/* iget v3, p2, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* iget v4, p2, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* iget v5, p3, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* iget v6, p3, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* move-object v0, p0 */
/* invoke-direct/range {v0 ..v6}, Lcom/badlogic/gdx/physics/box2d/World;->jniRayCast(JFFFF)V */
return;
} // .end method
public final void setAutoClearForces ( Boolean p0 ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/World;->addr:J */
/* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/World;->jniSetAutoClearForces(JZ)V */
return;
} // .end method
public final void setContactFilter ( com.badlogic.gdx.physics.box2d.ContactFilter p0 ) {
/* .locals 0 */
this.contactFilter = p1;
return;
} // .end method
public final void setContactListener ( com.badlogic.gdx.physics.box2d.ContactListener p0 ) {
/* .locals 0 */
this.contactListener = p1;
return;
} // .end method
public final void setContinuousPhysics ( Boolean p0 ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/World;->addr:J */
/* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/World;->jniSetContiousPhysics(JZ)V */
return;
} // .end method
public final void setDestructionListener ( com.badlogic.gdx.physics.box2d.DestructionListener p0 ) {
/* .locals 0 */
return;
} // .end method
public final void setGravity ( com.badlogic.gdx.math.Vector2 p0 ) {
/* .locals 4 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/World;->addr:J */
/* iget v2, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* iget v3, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* invoke-direct {p0, v0, v1, v2, v3}, Lcom/badlogic/gdx/physics/box2d/World;->jniSetGravity(JFF)V */
return;
} // .end method
public final void setWarmStarting ( Boolean p0 ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/World;->addr:J */
/* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/World;->jniSetWarmStarting(JZ)V */
return;
} // .end method
public final void step ( Float p0, Integer p1, Integer p2 ) {
/* .locals 6 */
/* iget-wide v1, p0, Lcom/badlogic/gdx/physics/box2d/World;->addr:J */
/* move-object v0, p0 */
/* move v3, p1 */
/* move v4, p2 */
/* move v5, p3 */
/* invoke-direct/range {v0 ..v5}, Lcom/badlogic/gdx/physics/box2d/World;->jniStep(JFII)V */
return;
} // .end method
