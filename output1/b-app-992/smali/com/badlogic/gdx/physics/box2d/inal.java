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
