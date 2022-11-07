public class com.badlogic.gdx.math.collision.Ray implements java.io.Serializable {
	 /* # interfaces */
	 /* # static fields */
	 private static final Long serialVersionUID;
	 static com.badlogic.gdx.math.Vector3 tmp;
	 /* # instance fields */
	 public final com.badlogic.gdx.math.Vector3 direction;
	 public final com.badlogic.gdx.math.Vector3 origin;
	 /* # direct methods */
	 static com.badlogic.gdx.math.collision.Ray ( ) {
		 /* .locals 1 */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
		 return;
	 } // .end method
	 public com.badlogic.gdx.math.collision.Ray ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
		 this.origin = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
		 this.direction = v0;
		 v0 = this.origin;
		 (( com.badlogic.gdx.math.Vector3 ) v0 ).set ( p1 ); // invoke-virtual {v0, p1}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
		 v0 = this.direction;
		 (( com.badlogic.gdx.math.Vector3 ) v0 ).set ( p2 ); // invoke-virtual {v0, p2}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
		 (( com.badlogic.gdx.math.Vector3 ) v0 ).nor ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/math/Vector3;->nor()Lcom/badlogic/gdx/math/Vector3;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public com.badlogic.gdx.math.collision.Ray cpy ( ) {
		 /* .locals 3 */
		 /* new-instance v0, Lcom/badlogic/gdx/math/collision/Ray; */
		 v1 = this.origin;
		 v2 = this.direction;
		 /* invoke-direct {v0, v1, v2}, Lcom/badlogic/gdx/math/collision/Ray;-><init>(Lcom/badlogic/gdx/math/Vector3;Lcom/badlogic/gdx/math/Vector3;)V */
	 } // .end method
	 public com.badlogic.gdx.math.Vector3 getEndPoint ( Float p0 ) {
		 /* .locals 2 */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 v1 = this.origin;
		 /* invoke-direct {v0, v1}, Lcom/badlogic/gdx/math/Vector3;-><init>(Lcom/badlogic/gdx/math/Vector3;)V */
		 v1 = this.direction;
		 (( com.badlogic.gdx.math.Vector3 ) v1 ).tmp ( ); // invoke-virtual {v1}, Lcom/badlogic/gdx/math/Vector3;->tmp()Lcom/badlogic/gdx/math/Vector3;
		 (( com.badlogic.gdx.math.Vector3 ) v1 ).mul ( p1 ); // invoke-virtual {v1, p1}, Lcom/badlogic/gdx/math/Vector3;->mul(F)Lcom/badlogic/gdx/math/Vector3;
		 (( com.badlogic.gdx.math.Vector3 ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector3;->add(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
	 } // .end method
	 public com.badlogic.gdx.math.collision.Ray mul ( com.badlogic.gdx.math.Matrix4 p0 ) {
		 /* .locals 3 */
		 v0 = com.badlogic.gdx.math.collision.Ray.tmp;
		 v1 = this.origin;
		 (( com.badlogic.gdx.math.Vector3 ) v0 ).set ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
		 v1 = this.direction;
		 (( com.badlogic.gdx.math.Vector3 ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector3;->add(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
		 v0 = com.badlogic.gdx.math.collision.Ray.tmp;
		 (( com.badlogic.gdx.math.Vector3 ) v0 ).mul ( p1 ); // invoke-virtual {v0, p1}, Lcom/badlogic/gdx/math/Vector3;->mul(Lcom/badlogic/gdx/math/Matrix4;)Lcom/badlogic/gdx/math/Vector3;
		 v0 = this.origin;
		 (( com.badlogic.gdx.math.Vector3 ) v0 ).mul ( p1 ); // invoke-virtual {v0, p1}, Lcom/badlogic/gdx/math/Vector3;->mul(Lcom/badlogic/gdx/math/Matrix4;)Lcom/badlogic/gdx/math/Vector3;
		 v0 = this.direction;
		 v1 = com.badlogic.gdx.math.collision.Ray.tmp;
		 v2 = this.origin;
		 (( com.badlogic.gdx.math.Vector3 ) v1 ).sub ( v2 ); // invoke-virtual {v1, v2}, Lcom/badlogic/gdx/math/Vector3;->sub(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
		 (( com.badlogic.gdx.math.Vector3 ) v0 ).set ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
	 } // .end method
	 public com.badlogic.gdx.math.collision.Ray set ( Float p0, Float p1, Float p2, Float p3, Float p4, Float p5 ) {
		 /* .locals 1 */
		 v0 = this.origin;
		 (( com.badlogic.gdx.math.Vector3 ) v0 ).set ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
		 v0 = this.direction;
		 (( com.badlogic.gdx.math.Vector3 ) v0 ).set ( p4, p5, p6 ); // invoke-virtual {v0, p4, p5, p6}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
	 } // .end method
	 public com.badlogic.gdx.math.collision.Ray set ( com.badlogic.gdx.math.Vector3 p0, com.badlogic.gdx.math.Vector3 p1 ) {
		 /* .locals 1 */
		 v0 = this.origin;
		 (( com.badlogic.gdx.math.Vector3 ) v0 ).set ( p1 ); // invoke-virtual {v0, p1}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
		 v0 = this.direction;
		 (( com.badlogic.gdx.math.Vector3 ) v0 ).set ( p2 ); // invoke-virtual {v0, p2}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
	 } // .end method
	 public com.badlogic.gdx.math.collision.Ray set ( com.badlogic.gdx.math.collision.Ray p0 ) {
		 /* .locals 2 */
		 v0 = this.origin;
		 v1 = this.origin;
		 (( com.badlogic.gdx.math.Vector3 ) v0 ).set ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
		 v0 = this.direction;
		 v1 = this.direction;
		 (( com.badlogic.gdx.math.Vector3 ) v0 ).set ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
	 } // .end method
	 public java.lang.String toString ( ) {
		 /* .locals 2 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v1 = "ray ["; // const-string v1, "ray ["
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v1 = this.origin;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 final String v1 = ":"; // const-string v1, ":"
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v1 = this.direction;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 final String v1 = "]"; // const-string v1, "]"
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // .end method
