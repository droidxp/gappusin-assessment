public class inal extends java.lang.Enum {
	 /* # static fields */
	 private static final com.badlogic.gdx.math.Plane$PlaneSide $VALUES; //synthetic
	 public static final com.badlogic.gdx.math.Plane$PlaneSide Back;
	 public static final com.badlogic.gdx.math.Plane$PlaneSide Front;
	 public static final com.badlogic.gdx.math.Plane$PlaneSide OnPlane;
	 /* # direct methods */
	 static inal ( ) {
		 /* .locals 5 */
		 int v4 = 2; // const/4 v4, 0x2
		 int v3 = 1; // const/4 v3, 0x1
		 int v2 = 0; // const/4 v2, 0x0
		 /* new-instance v0, Lcom/badlogic/gdx/math/Plane$PlaneSide; */
		 final String v1 = "OnPlane"; // const-string v1, "OnPlane"
		 /* invoke-direct {v0, v1, v2}, Lcom/badlogic/gdx/math/Plane$PlaneSide;-><init>(Ljava/lang/String;I)V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Plane$PlaneSide; */
		 final String v1 = "Back"; // const-string v1, "Back"
		 /* invoke-direct {v0, v1, v3}, Lcom/badlogic/gdx/math/Plane$PlaneSide;-><init>(Ljava/lang/String;I)V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Plane$PlaneSide; */
		 final String v1 = "Front"; // const-string v1, "Front"
		 /* invoke-direct {v0, v1, v4}, Lcom/badlogic/gdx/math/Plane$PlaneSide;-><init>(Ljava/lang/String;I)V */
		 int v0 = 3; // const/4 v0, 0x3
		 /* new-array v0, v0, [Lcom/badlogic/gdx/math/Plane$PlaneSide; */
		 v1 = com.badlogic.gdx.math.Plane$PlaneSide.OnPlane;
		 /* aput-object v1, v0, v2 */
		 v1 = com.badlogic.gdx.math.Plane$PlaneSide.Back;
		 /* aput-object v1, v0, v3 */
		 v1 = com.badlogic.gdx.math.Plane$PlaneSide.Front;
		 /* aput-object v1, v0, v4 */
		 return;
	 } // .end method
	 private inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V */
		 return;
	 } // .end method
	 public static com.badlogic.gdx.math.Plane$PlaneSide valueOf ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* const-class v0, Lcom/badlogic/gdx/math/Plane$PlaneSide; */
		 java.lang.Enum .valueOf ( v0,p0 );
		 /* check-cast p0, Lcom/badlogic/gdx/math/Plane$PlaneSide; */
	 } // .end method
	 public static com.badlogic.gdx.math.Plane$PlaneSide values ( ) {
		 /* .locals 1 */
		 v0 = com.badlogic.gdx.math.Plane$PlaneSide.$VALUES;
		 (( com.badlogic.gdx.math.Plane$PlaneSide ) v0 ).clone ( ); // invoke-virtual {v0}, [Lcom/badlogic/gdx/math/Plane$PlaneSide;->clone()Ljava/lang/Object;
		 /* check-cast v0, [Lcom/badlogic/gdx/math/Plane$PlaneSide; */
	 } // .end method
