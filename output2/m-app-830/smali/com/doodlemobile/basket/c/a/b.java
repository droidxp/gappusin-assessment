public class com.doodlemobile.basket.c.a.b extends com.doodlemobile.basket.game2d.i {
	 /* # instance fields */
	 private Float a;
	 private com.doodlemobile.basket.a.e e;
	 private com.badlogic.gdx.physics.box2d.World f;
	 private java.util.ArrayList g;
	 private java.util.Iterator h;
	 private com.badlogic.gdx.math.Vector2 i;
	 private com.badlogic.gdx.physics.box2d.Transform j;
	 private com.badlogic.gdx.physics.box2d.Fixture k;
	 private com.doodlemobile.basket.game2d.a l;
	 private com.badlogic.gdx.physics.box2d.Body m;
	 private com.badlogic.gdx.physics.box2d.PolygonShape n;
	 private com.badlogic.gdx.physics.box2d.CircleShape o;
	 private com.badlogic.gdx.physics.box2d.EdgeShape p;
	 private com.badlogic.gdx.math.Vector2 q;
	 private com.badlogic.gdx.math.Vector2 r;
	 /* # direct methods */
	 static com.doodlemobile.basket.c.a.b ( ) {
		 /* .locals 1 */
		 final String v0 = "basketphysics"; // const-string v0, "basketphysics"
		 java.lang.System .loadLibrary ( v0 );
		 return;
	 } // .end method
	 public com.doodlemobile.basket.c.a.b ( ) {
		 /* .locals 3 */
		 int v2 = 0; // const/4 v2, 0x0
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {p0, p1}, Lcom/doodlemobile/basket/game2d/i;-><init>(Lcom/doodlemobile/basket/b/b;)V */
		 /* const v0, 0x3c888889 */
		 /* iput v0, p0, Lcom/doodlemobile/basket/c/a/b;->a:F */
		 this.e = v1;
		 this.n = v1;
		 this.o = v1;
		 this.p = v1;
		 /* const/16 v0, 0xa */
		 /* new-array v0, v0, [Lcom/badlogic/gdx/math/Vector2; */
		 this.q = v0;
		 this.r = v1;
		 /* new-instance v0, Lcom/badlogic/gdx/physics/box2d/World; */
		 /* new-instance v1, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v1, v2, v2}, Lcom/badlogic/gdx/math/Vector2;-><init>(FF)V */
		 int v2 = 1; // const/4 v2, 0x1
		 /* invoke-direct {v0, v1, v2}, Lcom/badlogic/gdx/physics/box2d/World;-><init>(Lcom/badlogic/gdx/math/Vector2;Z)V */
		 this.f = v0;
		 return;
	 } // .end method
	 private static void a ( com.badlogic.gdx.physics.box2d.Transform p0, com.badlogic.gdx.math.Vector2 p1, com.badlogic.gdx.math.Vector2 p2 ) {
		 /* .locals 5 */
		 int v4 = 3; // const/4 v4, 0x3
		 int v3 = 2; // const/4 v3, 0x2
		 v0 = this.vals;
		 /* aget v0, v0, v3 */
		 /* iget v1, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 /* mul-float/2addr v0, v1 */
		 v1 = this.vals;
		 /* aget v1, v1, v4 */
		 /* iget v2, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 /* mul-float/2addr v1, v2 */
		 /* sub-float/2addr v0, v1 */
		 (( com.badlogic.gdx.physics.box2d.Transform ) p0 ).getPosition ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/physics/box2d/Transform;->getPosition()Lcom/badlogic/gdx/math/Vector2;
		 /* iget v1, v1, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 /* add-float/2addr v0, v1 */
		 /* iput v0, p2, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 v0 = this.vals;
		 /* aget v0, v0, v4 */
		 /* iget v1, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 /* mul-float/2addr v0, v1 */
		 v1 = this.vals;
		 /* aget v1, v1, v3 */
		 /* iget v2, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 /* mul-float/2addr v1, v2 */
		 /* add-float/2addr v0, v1 */
		 (( com.badlogic.gdx.physics.box2d.Transform ) p0 ).getPosition ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/physics/box2d/Transform;->getPosition()Lcom/badlogic/gdx/math/Vector2;
		 /* iget v1, v1, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 /* add-float/2addr v0, v1 */
		 /* iput v0, p2, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( Long p0 ) {
		 /* .locals 5 */
		 v0 = this.f;
		 /* iget v1, p0, Lcom/doodlemobile/basket/c/a/b;->a:F */
		 /* const/16 v2, 0xa */
		 /* const/16 v3, 0x64 */
		 (( com.badlogic.gdx.physics.box2d.World ) v0 ).step ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lcom/badlogic/gdx/physics/box2d/World;->step(FII)V
		 v0 = this.f;
		 (( com.badlogic.gdx.physics.box2d.World ) v0 ).clearForces ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/World;->clearForces()V
		 v0 = this.f;
		 (( com.badlogic.gdx.physics.box2d.World ) v0 ).getBodies ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/World;->getBodies()Ljava/util/Iterator;
		 this.h = v0;
	 } // :cond_0
	 v0 = 	 v0 = this.h;
	 if ( v0 != null) { // if-eqz v0, :cond_3
		 v0 = this.h;
		 /* check-cast v0, Lcom/badlogic/gdx/physics/box2d/Body; */
		 this.m = v0;
		 v0 = this.m;
		 (( com.badlogic.gdx.physics.box2d.Body ) v0 ).getPosition ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/Body;->getPosition()Lcom/badlogic/gdx/math/Vector2;
		 this.i = v0;
		 v0 = this.m;
		 v1 = 		 (( com.badlogic.gdx.physics.box2d.Body ) v0 ).getAngle ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/Body;->getAngle()F
		 v0 = this.m;
		 (( com.badlogic.gdx.physics.box2d.Body ) v0 ).getUserData ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/Body;->getUserData()Ljava/lang/Object;
		 /* check-cast v0, Lcom/doodlemobile/basket/game2d/a; */
		 this.l = v0;
		 v0 = this.l;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 v0 = this.l;
			 v2 = this.i;
			 /* iget v2, v2, Lcom/badlogic/gdx/math/Vector2;->x:F */
			 v3 = this.i;
			 /* iget v3, v3, Lcom/badlogic/gdx/math/Vector2;->y:F */
			 (( com.doodlemobile.basket.game2d.a ) v0 ).a ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Lcom/doodlemobile/basket/game2d/a;->a(FF)V
			 v0 = this.l;
			 /* iput v1, v0, Lcom/doodlemobile/basket/game2d/a;->e:F */
		 } // :cond_1
		 v0 = this.m;
		 (( com.badlogic.gdx.physics.box2d.Body ) v0 ).getFixtureList ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/Body;->getFixtureList()Ljava/util/ArrayList;
		 this.g = v0;
		 v0 = this.g;
		 v0 = 		 (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
		 int v2 = 1; // const/4 v2, 0x1
		 /* sub-int/2addr v0, v2 */
		 /* move v2, v0 */
	 } // :goto_0
	 /* if-ltz v2, :cond_0 */
	 v0 = this.g;
	 (( java.util.ArrayList ) v0 ).get ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* check-cast v0, Lcom/badlogic/gdx/physics/box2d/Fixture; */
	 this.k = v0;
	 v0 = this.k;
	 (( com.badlogic.gdx.physics.box2d.Fixture ) v0 ).getUserData ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/Fixture;->getUserData()Ljava/lang/Object;
	 /* check-cast v0, Lcom/doodlemobile/basket/game2d/a; */
	 this.l = v0;
	 v0 = this.l;
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 v0 = this.l;
		 v3 = this.i;
		 /* iget v3, v3, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 v4 = this.i;
		 /* iget v4, v4, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 (( com.doodlemobile.basket.game2d.a ) v0 ).a ( v3, v4 ); // invoke-virtual {v0, v3, v4}, Lcom/doodlemobile/basket/game2d/a;->a(FF)V
		 v0 = this.l;
		 /* iput v1, v0, Lcom/doodlemobile/basket/game2d/a;->e:F */
	 } // :cond_2
	 /* add-int/lit8 v0, v2, -0x1 */
	 /* move v2, v0 */
} // :cond_3
/* invoke-super {p0, p1, p2}, Lcom/doodlemobile/basket/game2d/i;->a(J)V */
return;
} // .end method
public final void a ( Object p0 ) {
/* .locals 11 */
int v10 = 0; // const/4 v10, 0x0
int v9 = 0; // const/4 v9, 0x0
/* invoke-super {p0, p1}, Lcom/doodlemobile/basket/game2d/i;->a(Lcom/doodlemobile/basket/p;)V */
v0 = this.e;
/* if-nez v0, :cond_0 */
} // :goto_0
return;
} // :cond_0
com.doodlemobile.basket.e .a ( p1,p0 );
v0 = this.f;
(( com.badlogic.gdx.physics.box2d.World ) v0 ).getBodies ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/World;->getBodies()Ljava/util/Iterator;
this.h = v0;
} // :cond_1
v0 = v0 = this.h;
if ( v0 != null) { // if-eqz v0, :cond_6
v0 = this.h;
/* check-cast v0, Lcom/badlogic/gdx/physics/box2d/Body; */
this.m = v0;
v0 = this.m;
(( com.badlogic.gdx.physics.box2d.Body ) v0 ).getTransform ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/Body;->getTransform()Lcom/badlogic/gdx/physics/box2d/Transform;
this.j = v0;
v0 = this.m;
(( com.badlogic.gdx.physics.box2d.Body ) v0 ).getFixtureList ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/Body;->getFixtureList()Ljava/util/ArrayList;
this.g = v0;
v0 = this.g;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v1 = 1; // const/4 v1, 0x1
/* sub-int/2addr v0, v1 */
/* move v1, v0 */
} // :goto_1
/* if-ltz v1, :cond_1 */
v2 = this.d;
v0 = this.g;
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/badlogic/gdx/physics/box2d/Fixture; */
v3 = this.j;
(( com.badlogic.gdx.physics.box2d.Fixture ) v0 ).getType ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/Fixture;->getType()Lcom/badlogic/gdx/physics/box2d/Shape$Type;
v5 = com.doodlemobile.basket.c.a.a.a;
v4 = (( com.badlogic.gdx.physics.box2d.Shape$Type ) v4 ).ordinal ( ); // invoke-virtual {v4}, Lcom/badlogic/gdx/physics/box2d/Shape$Type;->ordinal()I
/* aget v4, v5, v4 */
/* packed-switch v4, :pswitch_data_0 */
} // :goto_2
/* add-int/lit8 v0, v1, -0x1 */
/* move v1, v0 */
/* :pswitch_0 */
(( com.badlogic.gdx.physics.box2d.Fixture ) v0 ).getShape ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/Fixture;->getShape()Lcom/badlogic/gdx/physics/box2d/Shape;
/* check-cast v0, Lcom/badlogic/gdx/physics/box2d/CircleShape; */
this.o = v0;
v0 = this.r;
/* if-nez v0, :cond_2 */
/* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
/* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
this.r = v0;
} // :cond_2
v0 = this.o;
(( com.badlogic.gdx.physics.box2d.CircleShape ) v0 ).getPosition ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/CircleShape;->getPosition()Lcom/badlogic/gdx/math/Vector2;
v4 = this.r;
com.doodlemobile.basket.c.a.b .a ( v3,v0,v4 );
v0 = this.r;
v3 = this.r;
/* iget v3, v3, Lcom/badlogic/gdx/math/Vector2;->x:F */
v4 = (( com.doodlemobile.basket.game2d.g ) v2 ).a ( ); // invoke-virtual {v2}, Lcom/doodlemobile/basket/game2d/g;->a()F
/* sub-float/2addr v3, v4 */
/* iput v3, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
v0 = this.r;
v3 = this.r;
/* iget v3, v3, Lcom/badlogic/gdx/math/Vector2;->y:F */
v2 = (( com.doodlemobile.basket.game2d.g ) v2 ).b ( ); // invoke-virtual {v2}, Lcom/doodlemobile/basket/game2d/g;->b()F
/* sub-float v2, v3, v2 */
/* iput v2, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
v0 = this.e;
v2 = this.r;
v3 = this.o;
v3 = (( com.badlogic.gdx.physics.box2d.CircleShape ) v3 ).getRadius ( ); // invoke-virtual {v3}, Lcom/badlogic/gdx/physics/box2d/CircleShape;->getRadius()F
(( com.doodlemobile.basket.a.e ) v0 ).a ( p1, v2, v3 ); // invoke-virtual {v0, p1, v2, v3}, Lcom/doodlemobile/basket/a/e;->a(Lcom/doodlemobile/basket/p;Lcom/badlogic/gdx/math/Vector2;F)V
/* :pswitch_1 */
(( com.badlogic.gdx.physics.box2d.Fixture ) v0 ).getShape ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/Fixture;->getShape()Lcom/badlogic/gdx/physics/box2d/Shape;
/* check-cast v0, Lcom/badlogic/gdx/physics/box2d/PolygonShape; */
this.n = v0;
v0 = this.n;
v0 = (( com.badlogic.gdx.physics.box2d.PolygonShape ) v0 ).getVertexCount ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/PolygonShape;->getVertexCount()I
/* move v4, v10 */
} // :goto_3
/* if-ge v4, v0, :cond_4 */
v5 = this.q;
/* aget-object v5, v5, v4 */
/* if-nez v5, :cond_3 */
v5 = this.q;
/* new-instance v6, Lcom/badlogic/gdx/math/Vector2; */
/* invoke-direct {v6}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
/* aput-object v6, v5, v4 */
} // :cond_3
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_4
com.badlogic.gdx.math.Vector2 .tmp ( v9,v9 );
/* move v5, v10 */
} // :goto_4
/* if-ge v5, v0, :cond_5 */
v6 = this.n;
(( com.badlogic.gdx.physics.box2d.PolygonShape ) v6 ).getVertex ( v5, v4 ); // invoke-virtual {v6, v5, v4}, Lcom/badlogic/gdx/physics/box2d/PolygonShape;->getVertex(ILcom/badlogic/gdx/math/Vector2;)V
v6 = this.q;
/* aget-object v6, v6, v5 */
com.doodlemobile.basket.c.a.b .a ( v3,v4,v6 );
v6 = this.q;
/* aget-object v6, v6, v5 */
v7 = this.q;
/* aget-object v7, v7, v5 */
/* iget v7, v7, Lcom/badlogic/gdx/math/Vector2;->x:F */
v8 = (( com.doodlemobile.basket.game2d.g ) v2 ).a ( ); // invoke-virtual {v2}, Lcom/doodlemobile/basket/game2d/g;->a()F
/* sub-float/2addr v7, v8 */
/* iput v7, v6, Lcom/badlogic/gdx/math/Vector2;->x:F */
v6 = this.q;
/* aget-object v6, v6, v5 */
v7 = this.q;
/* aget-object v7, v7, v5 */
/* iget v7, v7, Lcom/badlogic/gdx/math/Vector2;->y:F */
v8 = (( com.doodlemobile.basket.game2d.g ) v2 ).b ( ); // invoke-virtual {v2}, Lcom/doodlemobile/basket/game2d/g;->b()F
/* sub-float/2addr v7, v8 */
/* iput v7, v6, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* add-int/lit8 v5, v5, 0x1 */
} // :cond_5
v2 = this.e;
v3 = this.q;
(( com.doodlemobile.basket.a.e ) v2 ).a ( p1, v3, v0 ); // invoke-virtual {v2, p1, v3, v0}, Lcom/doodlemobile/basket/a/e;->a(Lcom/doodlemobile/basket/p;[Lcom/badlogic/gdx/math/Vector2;I)V
/* goto/16 :goto_2 */
/* :pswitch_2 */
(( com.badlogic.gdx.physics.box2d.Fixture ) v0 ).getShape ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/Fixture;->getShape()Lcom/badlogic/gdx/physics/box2d/Shape;
/* check-cast v0, Lcom/badlogic/gdx/physics/box2d/EdgeShape; */
this.p = v0;
/* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
/* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
/* new-instance v4, Lcom/badlogic/gdx/math/Vector2; */
/* invoke-direct {v4}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
com.badlogic.gdx.math.Vector2 .tmp ( v9,v9 );
v6 = this.p;
(( com.badlogic.gdx.physics.box2d.EdgeShape ) v6 ).getVertex1 ( v5 ); // invoke-virtual {v6, v5}, Lcom/badlogic/gdx/physics/box2d/EdgeShape;->getVertex1(Lcom/badlogic/gdx/math/Vector2;)V
com.doodlemobile.basket.c.a.b .a ( v3,v5,v0 );
v6 = this.p;
(( com.badlogic.gdx.physics.box2d.EdgeShape ) v6 ).getVertex2 ( v5 ); // invoke-virtual {v6, v5}, Lcom/badlogic/gdx/physics/box2d/EdgeShape;->getVertex2(Lcom/badlogic/gdx/math/Vector2;)V
com.doodlemobile.basket.c.a.b .a ( v3,v5,v4 );
/* iget v3, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
v5 = (( com.doodlemobile.basket.game2d.g ) v2 ).a ( ); // invoke-virtual {v2}, Lcom/doodlemobile/basket/game2d/g;->a()F
/* sub-float/2addr v3, v5 */
/* iput v3, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* iget v3, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
v5 = (( com.doodlemobile.basket.game2d.g ) v2 ).b ( ); // invoke-virtual {v2}, Lcom/doodlemobile/basket/game2d/g;->b()F
/* sub-float/2addr v3, v5 */
/* iput v3, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* iget v3, v4, Lcom/badlogic/gdx/math/Vector2;->x:F */
v5 = (( com.doodlemobile.basket.game2d.g ) v2 ).a ( ); // invoke-virtual {v2}, Lcom/doodlemobile/basket/game2d/g;->a()F
/* sub-float/2addr v3, v5 */
/* iput v3, v4, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* iget v3, v4, Lcom/badlogic/gdx/math/Vector2;->y:F */
v2 = (( com.doodlemobile.basket.game2d.g ) v2 ).b ( ); // invoke-virtual {v2}, Lcom/doodlemobile/basket/game2d/g;->b()F
/* sub-float v2, v3, v2 */
/* iput v2, v4, Lcom/badlogic/gdx/math/Vector2;->y:F */
v2 = this.e;
(( com.doodlemobile.basket.a.e ) v2 ).a ( p1, v0, v4 ); // invoke-virtual {v2, p1, v0, v4}, Lcom/doodlemobile/basket/a/e;->a(Lcom/doodlemobile/basket/p;Lcom/badlogic/gdx/math/Vector2;Lcom/badlogic/gdx/math/Vector2;)V
/* goto/16 :goto_2 */
} // :cond_6
com.doodlemobile.basket.e .b ( p1,p0 );
/* goto/16 :goto_0 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
} // .end packed-switch
} // .end method
public final com.badlogic.gdx.physics.box2d.World n ( ) {
/* .locals 1 */
v0 = this.f;
} // .end method
