public class com.badlogic.gdx.math.collision.Segment implements java.io.Serializable {
	 /* # interfaces */
	 /* # static fields */
	 private static final Long serialVersionUID;
	 /* # instance fields */
	 public final com.badlogic.gdx.math.Vector3 a;
	 public final com.badlogic.gdx.math.Vector3 b;
	 /* # direct methods */
	 public com.badlogic.gdx.math.collision.Segment ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
		 this.a = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
		 this.b = v0;
		 v0 = this.a;
		 (( com.badlogic.gdx.math.Vector3 ) v0 ).set ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
		 v0 = this.b;
		 (( com.badlogic.gdx.math.Vector3 ) v0 ).set ( p4, p5, p6 ); // invoke-virtual {v0, p4, p5, p6}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
		 return;
	 } // .end method
	 public com.badlogic.gdx.math.collision.Segment ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
		 this.a = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
		 this.b = v0;
		 v0 = this.a;
		 (( com.badlogic.gdx.math.Vector3 ) v0 ).set ( p1 ); // invoke-virtual {v0, p1}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
		 v0 = this.b;
		 (( com.badlogic.gdx.math.Vector3 ) v0 ).set ( p2 ); // invoke-virtual {v0, p2}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
		 return;
	 } // .end method
