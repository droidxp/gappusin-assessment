public class com.badlogic.gdx.physics.box2d.Manifold$ManifoldPoint {
	 /* # instance fields */
	 public Integer contactID;
	 public final com.badlogic.gdx.math.Vector2 localPoint;
	 public Float normalImpulse;
	 public Float tangentImpulse;
	 final com.badlogic.gdx.physics.box2d.Manifold this$0; //synthetic
	 /* # direct methods */
	 public com.badlogic.gdx.physics.box2d.Manifold$ManifoldPoint ( ) {
		 /* .locals 1 */
		 this.this$0 = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
		 this.localPoint = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/badlogic/gdx/physics/box2d/Manifold$ManifoldPoint;->contactID:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String toString ( ) {
		 /* .locals 3 */
		 final String v2 = ", "; // const-string v2, ", "
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v1 = "id: "; // const-string v1, "id: "
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget v1, p0, Lcom/badlogic/gdx/physics/box2d/Manifold$ManifoldPoint;->contactID:I */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v1 = ", "; // const-string v1, ", "
		 (( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v1 = this.localPoint;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 final String v1 = ", "; // const-string v1, ", "
		 (( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget v1, p0, Lcom/badlogic/gdx/physics/box2d/Manifold$ManifoldPoint;->normalImpulse:F */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
		 final String v1 = ", "; // const-string v1, ", "
		 (( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget v1, p0, Lcom/badlogic/gdx/physics/box2d/Manifold$ManifoldPoint;->tangentImpulse:F */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // .end method
