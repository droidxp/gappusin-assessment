public class org.anddev.andengine.engine.handler.collision.CollisionHandler implements org.anddev.andengine.engine.handler.IUpdateHandler {
	 /* # interfaces */
	 /* # instance fields */
	 private final org.anddev.andengine.entity.shape.IShape mCheckShape;
	 private final org.anddev.andengine.engine.handler.collision.ICollisionCallback mCollisionCallback;
	 private final java.util.ArrayList mTargetStaticEntities;
	 /* # direct methods */
	 public org.anddev.andengine.engine.handler.collision.CollisionHandler ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* if-nez p1, :cond_0 */
		 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
		 final String v1 = "pCollisionCallback must not be null!"; // const-string v1, "pCollisionCallback must not be null!"
		 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw v0 */
	 } // :cond_0
	 /* if-nez p2, :cond_1 */
	 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
	 final String v1 = "pCheckShape must not be null!"; // const-string v1, "pCheckShape must not be null!"
	 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
} // :cond_1
/* if-nez p3, :cond_2 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "pTargetStaticEntities must not be null!"; // const-string v1, "pTargetStaticEntities must not be null!"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_2
this.mCollisionCallback = p1;
this.mCheckShape = p2;
this.mTargetStaticEntities = p3;
return;
} // .end method
public org.anddev.andengine.engine.handler.collision.CollisionHandler ( ) {
/* .locals 1 */
org.anddev.andengine.util.ListUtils .toList ( p3 );
/* invoke-direct {p0, p1, p2, v0}, Lorg/anddev/andengine/engine/handler/collision/CollisionHandler;-><init>(Lorg/anddev/andengine/engine/handler/collision/ICollisionCallback;Lorg/anddev/andengine/entity/shape/IShape;Ljava/util/ArrayList;)V */
return;
} // .end method
/* # virtual methods */
public void onUpdate ( Float p0 ) {
/* .locals 6 */
v1 = this.mCheckShape;
v2 = this.mTargetStaticEntities;
v3 = (( java.util.ArrayList ) v2 ).size ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
int v0 = 0; // const/4 v0, 0x0
/* move v4, v0 */
} // :goto_0
/* if-lt v4, v3, :cond_1 */
} // :cond_0
return;
} // :cond_1
(( java.util.ArrayList ) v2 ).get ( v4 ); // invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
v0 = /* check-cast v0, Lorg/anddev/andengine/entity/shape/IShape; */
if ( v0 != null) { // if-eqz v0, :cond_2
v5 = this.mCollisionCallback;
(( java.util.ArrayList ) v2 ).get ( v4 ); // invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
v0 = /* check-cast v0, Lorg/anddev/andengine/entity/shape/IShape; */
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_2
/* add-int/lit8 v0, v4, 0x1 */
/* move v4, v0 */
} // .end method
public void reset ( ) {
/* .locals 0 */
return;
} // .end method
