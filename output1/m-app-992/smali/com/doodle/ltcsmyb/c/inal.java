public class inal {
	 /* # static fields */
	 private static Boolean L;
	 private static Long U;
	 /* # instance fields */
	 private final Float A;
	 private Float B;
	 private Float C;
	 private Float D;
	 private Float E;
	 private Boolean F;
	 private Boolean G;
	 private Boolean H;
	 private Boolean I;
	 private com.doodlemobile.basket.graphics.e J;
	 private com.doodle.ltcsmyb.a K;
	 private final Long M;
	 private final Long N;
	 private final Long O;
	 private Long P;
	 private Boolean Q;
	 private Boolean R;
	 private Long S;
	 private Integer T;
	 private Integer V;
	 private Integer W;
	 private Integer X;
	 private Integer Y;
	 private F Z;
	 private Boolean a;
	 private F aa;
	 private Integer ab;
	 private Boolean ac;
	 private Integer ad;
	 private final Integer ae;
	 private Boolean b;
	 private Long c;
	 private java.util.ArrayList d;
	 private java.util.ArrayList e;
	 private java.util.ArrayList f;
	 private java.util.ArrayList g;
	 private java.util.ArrayList h;
	 private java.util.ArrayList i;
	 private com.badlogic.gdx.physics.box2d.BodyDef j;
	 private com.badlogic.gdx.physics.box2d.PolygonShape k;
	 private com.badlogic.gdx.physics.box2d.FixtureDef l;
	 private com.badlogic.gdx.physics.box2d.World m;
	 private com.doodlemobile.basket.game2d.c n;
	 private com.doodlemobile.basket.b.b o;
	 private com.badlogic.gdx.physics.box2d.Body p;
	 private com.doodlemobile.basket.game2d.j q;
	 private com.doodlemobile.basket.game2d.b r;
	 private com.doodlemobile.basket.game2d.b s;
	 private final Float t;
	 private final Float u;
	 private final Float v;
	 private final Float w;
	 private final Float x;
	 private final Float y;
	 private final Float z;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 9 */
		 /* const/high16 v8, 0x41200000 # 10.0f */
		 int v7 = 3; // const/4 v7, 0x3
		 int v6 = 0; // const/4 v6, 0x0
		 int v5 = 0; // const/4 v5, 0x0
		 int v4 = 1; // const/4 v4, 0x1
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/c/b;->a:Z */
		 /* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/c/b;->b:Z */
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.d = v0;
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.e = v0;
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.f = v0;
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.g = v0;
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.h = v0;
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.i = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/physics/box2d/BodyDef; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/physics/box2d/BodyDef;-><init>()V */
		 this.j = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/physics/box2d/PolygonShape; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/physics/box2d/PolygonShape;-><init>()V */
		 this.k = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/physics/box2d/FixtureDef; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/physics/box2d/FixtureDef;-><init>()V */
		 this.l = v0;
		 /* iput v8, p0, Lcom/doodle/ltcsmyb/c/b;->t:F */
		 /* const v0, 0x40490fda */
		 /* iput v0, p0, Lcom/doodle/ltcsmyb/c/b;->u:F */
		 /* const/high16 v0, 0x43e10000 # 450.0f */
		 /* iput v0, p0, Lcom/doodle/ltcsmyb/c/b;->v:F */
		 /* const/high16 v0, 0x43fa0000 # 500.0f */
		 /* iput v0, p0, Lcom/doodle/ltcsmyb/c/b;->w:F */
		 /* const/high16 v0, -0x3c790000 # -270.0f */
		 /* iput v0, p0, Lcom/doodle/ltcsmyb/c/b;->x:F */
		 /* const/high16 v0, 0x43870000 # 270.0f */
		 /* iput v0, p0, Lcom/doodle/ltcsmyb/c/b;->y:F */
		 /* const/high16 v0, -0x3c600000 # -320.0f */
		 /* iput v0, p0, Lcom/doodle/ltcsmyb/c/b;->z:F */
		 /* const/high16 v0, 0x43a00000 # 320.0f */
		 /* iput v0, p0, Lcom/doodle/ltcsmyb/c/b;->A:F */
		 /* const/high16 v0, 0x43b90000 # 370.0f */
		 /* iput v0, p0, Lcom/doodle/ltcsmyb/c/b;->D:F */
		 /* iput v8, p0, Lcom/doodle/ltcsmyb/c/b;->E:F */
		 /* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/c/b;->F:Z */
		 /* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/c/b;->G:Z */
		 /* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/c/b;->H:Z */
		 /* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/c/b;->I:Z */
		 /* const-wide/16 v0, 0x7d0 */
		 /* iput-wide v0, p0, Lcom/doodle/ltcsmyb/c/b;->M:J */
		 /* const-wide/16 v0, 0x4e20 */
		 /* iput-wide v0, p0, Lcom/doodle/ltcsmyb/c/b;->N:J */
		 /* const-wide/16 v0, 0x3e8 */
		 /* iput-wide v0, p0, Lcom/doodle/ltcsmyb/c/b;->O:J */
		 /* const/16 v0, 0xa */
		 /* const/16 v1, 0x1e */
		 /* filled-new-array {v0, v1}, [I */
		 v1 = java.lang.Float.TYPE;
		 java.lang.reflect.Array .newInstance ( v1,v0 );
		 /* check-cast v0, [[F */
		 this.Z = v0;
		 /* const/16 v0, 0xa */
		 /* const/16 v1, 0x1e */
		 /* filled-new-array {v0, v1}, [I */
		 v1 = java.lang.Float.TYPE;
		 java.lang.reflect.Array .newInstance ( v1,v0 );
		 /* check-cast v0, [[F */
		 this.aa = v0;
		 /* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/c/b;->ac:Z */
		 /* const/16 v0, 0x7d */
		 /* iput v0, p0, Lcom/doodle/ltcsmyb/c/b;->ae:I */
		 this.K = p1;
		 (( com.doodle.ltcsmyb.a ) p1 ).g ( ); // invoke-virtual {p1}, Lcom/doodle/ltcsmyb/a;->g()Lcom/doodlemobile/basket/game2d/c;
		 this.n = v0;
		 (( com.doodle.ltcsmyb.a ) p1 ).n ( ); // invoke-virtual {p1}, Lcom/doodle/ltcsmyb/a;->n()Lcom/badlogic/gdx/physics/box2d/World;
		 this.m = v0;
		 (( com.doodle.ltcsmyb.a ) p1 ).h ( ); // invoke-virtual {p1}, Lcom/doodle/ltcsmyb/a;->h()Lcom/doodlemobile/basket/b/b;
		 this.o = v0;
		 /* iget v0, p1, Lcom/doodle/ltcsmyb/a;->b:F */
		 /* iput v0, p0, Lcom/doodle/ltcsmyb/c/b;->B:F */
		 /* iget v0, p1, Lcom/doodle/ltcsmyb/a;->c:F */
		 /* iput v0, p0, Lcom/doodle/ltcsmyb/c/b;->C:F */
		 /* iget v0, p0, Lcom/doodle/ltcsmyb/c/b;->C:F */
		 /* const/high16 v1, 0x40000000 # 2.0f */
		 /* div-float/2addr v0, v1 */
		 /* const/high16 v1, 0x41f00000 # 30.0f */
		 /* sub-float/2addr v0, v1 */
		 /* iput v0, p0, Lcom/doodle/ltcsmyb/c/b;->D:F */
		 /* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/c/b;->I:Z */
		 /* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/c/b;->H:Z */
		 /* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/c/b;->G:Z */
		 /* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/c/b;->F:Z */
		 com.doodle.ltcsmyb.c.b.L = (v4!= 0);
		 /* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/c/b;->Q:Z */
		 /* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/c/b;->R:Z */
		 int v0 = 0; // const/4 v0, 0x0
		 /* new-instance v1, Lcom/doodlemobile/basket/game2d/b; */
		 v2 = this.o;
		 /* const v3, 0x7f02000c */
		 /* invoke-direct {v1, v2, v3}, Lcom/doodlemobile/basket/game2d/b;-><init>(Lcom/doodlemobile/basket/b/b;I)V */
		 this.r = v1;
		 v1 = 		 com.doodle.ltcsmyb.TvPanel .e ( );
		 /* if-ne v1, v4, :cond_3 */
		 v0 = this.r;
		 /* const/high16 v1, -0x3c580000 # -336.0f */
		 (( com.doodlemobile.basket.game2d.b ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/game2d/b;->b(F)V
		 v0 = this.r;
		 (( com.doodlemobile.basket.game2d.b ) v0 ).a ( v6 ); // invoke-virtual {v0, v6}, Lcom/doodlemobile/basket/game2d/b;->a(F)V
		 v0 = this.r;
		 /* const v1, 0x7f0901d3 */
		 (( com.doodlemobile.basket.game2d.b ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/game2d/b;->a(I)V
		 v0 = this.o;
		 com.doodle.ltcsmyb.c.c .a ( v0 );
		 (( com.doodle.ltcsmyb.c.c ) v0 ).l ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/c/c;->l()Lcom/doodlemobile/basket/graphics/e;
	 } // :cond_0
} // :goto_0
/* new-instance v1, Lcom/doodlemobile/basket/game2d/j; */
v2 = this.o;
/* invoke-direct {v1, v2, v0}, Lcom/doodlemobile/basket/game2d/j;-><init>(Lcom/doodlemobile/basket/b/b;Lcom/doodlemobile/basket/graphics/e;)V */
this.q = v1;
v0 = this.n;
v1 = this.q;
(( com.doodlemobile.basket.game2d.c ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/game2d/c;->a(Lcom/doodlemobile/basket/game2d/a;)V
v0 = this.n;
v1 = this.r;
(( com.doodlemobile.basket.game2d.c ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/game2d/c;->a(Lcom/doodlemobile/basket/game2d/a;)V
v0 = this.j;
v1 = com.badlogic.gdx.physics.box2d.BodyDef$BodyType.StaticBody;
this.type = v1;
v0 = this.j;
v0 = this.position;
/* iget v1, p0, Lcom/doodle/ltcsmyb/c/b;->D:F */
(( com.badlogic.gdx.math.Vector2 ) v0 ).set ( v6, v1 ); // invoke-virtual {v0, v6, v1}, Lcom/badlogic/gdx/math/Vector2;->set(FF)Lcom/badlogic/gdx/math/Vector2;
v0 = this.k;
/* const/high16 v1, 0x43340000 # 180.0f */
(( com.badlogic.gdx.physics.box2d.PolygonShape ) v0 ).setAsBox ( v1, v8 ); // invoke-virtual {v0, v1, v8}, Lcom/badlogic/gdx/physics/box2d/PolygonShape;->setAsBox(FF)V
v0 = this.l;
v1 = this.k;
this.shape = v1;
v0 = this.l;
/* const/high16 v1, 0x3f800000 # 1.0f */
/* iput v1, v0, Lcom/badlogic/gdx/physics/box2d/FixtureDef;->density:F */
v0 = this.l;
/* const/high16 v1, 0x3f800000 # 1.0f */
/* iput v1, v0, Lcom/badlogic/gdx/physics/box2d/FixtureDef;->friction:F */
v0 = this.l;
/* iput v6, v0, Lcom/badlogic/gdx/physics/box2d/FixtureDef;->restitution:F */
v0 = this.m;
v1 = this.j;
(( com.badlogic.gdx.physics.box2d.World ) v0 ).createBody ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/physics/box2d/World;->createBody(Lcom/badlogic/gdx/physics/box2d/BodyDef;)Lcom/badlogic/gdx/physics/box2d/Body;
this.p = v0;
v0 = this.p;
v1 = this.l;
(( com.badlogic.gdx.physics.box2d.Body ) v0 ).createFixture ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/physics/box2d/Body;->createFixture(Lcom/badlogic/gdx/physics/box2d/FixtureDef;)Lcom/badlogic/gdx/physics/box2d/Fixture;
/* new-instance v0, Lcom/doodlemobile/basket/game2d/b; */
v1 = this.o;
/* const v2, 0x7f020003 */
/* invoke-direct {v0, v1, v2}, Lcom/doodlemobile/basket/game2d/b;-><init>(Lcom/doodlemobile/basket/b/b;I)V */
this.s = v0;
v0 = this.s;
/* const/high16 v1, -0x3ee00000 # -10.0f */
(( com.doodlemobile.basket.game2d.b ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/game2d/b;->a(F)V
v0 = this.s;
/* const v1, 0x43ba8000 # 373.0f */
(( com.doodlemobile.basket.game2d.b ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/game2d/b;->b(F)V
int v0 = 0; // const/4 v0, 0x0
v1 = com.doodle.ltcsmyb.TvPanel .e ( );
/* if-ne v1, v4, :cond_7 */
v0 = this.s;
/* const v1, 0x7f090146 */
(( com.doodlemobile.basket.game2d.b ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/game2d/b;->a(I)V
/* new-instance v0, Lcom/doodle/ltcsmyb/b/b; */
v1 = this.K;
v2 = this.o;
com.doodle.ltcsmyb.c.c .a ( v2 );
(( com.doodle.ltcsmyb.c.c ) v2 ).k ( ); // invoke-virtual {v2}, Lcom/doodle/ltcsmyb/c/c;->k()Lcom/doodlemobile/basket/graphics/Animation;
/* invoke-direct {v0, v1, v2, v4}, Lcom/doodle/ltcsmyb/b/b;-><init>(Lcom/doodle/ltcsmyb/a;Lcom/doodlemobile/basket/graphics/Animation;I)V */
} // :cond_1
} // :goto_1
(( com.doodle.ltcsmyb.b.b ) v0 ).i ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/b/b;->i()V
v1 = this.p;
(( com.badlogic.gdx.physics.box2d.Body ) v1 ).setUserData ( v0 ); // invoke-virtual {v1, v0}, Lcom/badlogic/gdx/physics/box2d/Body;->setUserData(Ljava/lang/Object;)V
v1 = this.n;
(( com.doodlemobile.basket.game2d.c ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lcom/doodlemobile/basket/game2d/c;->a(Lcom/doodlemobile/basket/game2d/a;)V
v0 = this.s;
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.n;
v1 = this.s;
(( com.doodlemobile.basket.game2d.c ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/game2d/c;->a(Lcom/doodlemobile/basket/game2d/a;)V
} // :cond_2
v0 = this.o;
com.doodle.ltcsmyb.c.c .a ( v0 );
(( com.doodle.ltcsmyb.c.c ) v0 ).q ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/c/c;->q()Lcom/doodlemobile/basket/graphics/e;
this.J = v0;
/* iput p2, p0, Lcom/doodle/ltcsmyb/c/b;->ad:I */
v0 = this.e;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
v0 = this.f;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
/* invoke-direct {p0, p2}, Lcom/doodle/ltcsmyb/c/b;->a(I)V */
v0 = this.K;
(( com.doodle.ltcsmyb.a ) v0 ).c ( p2 ); // invoke-virtual {v0, p2}, Lcom/doodle/ltcsmyb/a;->c(I)V
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/c/b;->F:Z */
/* iput v7, p0, Lcom/doodle/ltcsmyb/c/b;->T:I */
/* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/c/b;->ac:Z */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "LEVEL"; // const-string v1, "LEVEL"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lcom/doodle/ltcsmyb/c/b;->ad:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.FlurryAgent .b ( v0 );
return;
} // :cond_3
v1 = com.doodle.ltcsmyb.TvPanel .e ( );
int v2 = 2; // const/4 v2, 0x2
/* if-ne v1, v2, :cond_4 */
v0 = this.r;
/* const/high16 v1, -0x3c6d0000 # -294.0f */
(( com.doodlemobile.basket.game2d.b ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/game2d/b;->b(F)V
v0 = this.r;
(( com.doodlemobile.basket.game2d.b ) v0 ).a ( v6 ); // invoke-virtual {v0, v6}, Lcom/doodlemobile/basket/game2d/b;->a(F)V
v0 = this.o;
com.doodle.ltcsmyb.c.c .a ( v0 );
(( com.doodle.ltcsmyb.c.c ) v0 ).m ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/c/c;->m()Lcom/doodlemobile/basket/graphics/e;
v1 = this.r;
/* const v2, 0x7f0901d2 */
(( com.doodlemobile.basket.game2d.b ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lcom/doodlemobile/basket/game2d/b;->a(I)V
/* goto/16 :goto_0 */
} // :cond_4
v1 = com.doodle.ltcsmyb.TvPanel .e ( );
/* if-ne v1, v7, :cond_5 */
v0 = this.r;
/* const/high16 v1, -0x3c690000 # -302.0f */
(( com.doodlemobile.basket.game2d.b ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/game2d/b;->b(F)V
v0 = this.r;
(( com.doodlemobile.basket.game2d.b ) v0 ).a ( v6 ); // invoke-virtual {v0, v6}, Lcom/doodlemobile/basket/game2d/b;->a(F)V
v0 = this.o;
com.doodle.ltcsmyb.c.c .a ( v0 );
(( com.doodle.ltcsmyb.c.c ) v0 ).n ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/c/c;->n()Lcom/doodlemobile/basket/graphics/e;
v1 = this.r;
/* const v2, 0x7f0901ce */
(( com.doodlemobile.basket.game2d.b ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lcom/doodlemobile/basket/game2d/b;->a(I)V
/* goto/16 :goto_0 */
} // :cond_5
v1 = com.doodle.ltcsmyb.TvPanel .e ( );
int v2 = 4; // const/4 v2, 0x4
/* if-ne v1, v2, :cond_6 */
v0 = this.r;
/* const/high16 v1, -0x3c890000 # -247.0f */
(( com.doodlemobile.basket.game2d.b ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/game2d/b;->b(F)V
v0 = this.r;
(( com.doodlemobile.basket.game2d.b ) v0 ).a ( v6 ); // invoke-virtual {v0, v6}, Lcom/doodlemobile/basket/game2d/b;->a(F)V
v0 = this.o;
com.doodle.ltcsmyb.c.c .a ( v0 );
(( com.doodle.ltcsmyb.c.c ) v0 ).o ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/c/c;->o()Lcom/doodlemobile/basket/graphics/e;
v1 = this.r;
/* const v2, 0x7f0901d1 */
(( com.doodlemobile.basket.game2d.b ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lcom/doodlemobile/basket/game2d/b;->a(I)V
/* goto/16 :goto_0 */
} // :cond_6
v1 = com.doodle.ltcsmyb.TvPanel .e ( );
int v2 = 5; // const/4 v2, 0x5
/* if-ne v1, v2, :cond_0 */
v0 = this.r;
/* const/high16 v1, -0x3c890000 # -247.0f */
(( com.doodlemobile.basket.game2d.b ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/game2d/b;->b(F)V
v0 = this.r;
/* const/high16 v1, -0x3f800000 # -4.0f */
(( com.doodlemobile.basket.game2d.b ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/game2d/b;->a(F)V
v0 = this.o;
com.doodle.ltcsmyb.c.c .a ( v0 );
(( com.doodle.ltcsmyb.c.c ) v0 ).p ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/c/c;->p()Lcom/doodlemobile/basket/graphics/e;
v1 = this.r;
/* const v2, 0x7f0901cf */
(( com.doodlemobile.basket.game2d.b ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lcom/doodlemobile/basket/game2d/b;->a(I)V
/* goto/16 :goto_0 */
} // :cond_7
v1 = com.doodle.ltcsmyb.TvPanel .e ( );
int v2 = 2; // const/4 v2, 0x2
/* if-ne v1, v2, :cond_8 */
v0 = this.s;
/* const v1, 0x7f090147 */
(( com.doodlemobile.basket.game2d.b ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/game2d/b;->a(I)V
/* new-instance v0, Lcom/doodle/ltcsmyb/b/b; */
v1 = this.K;
v2 = this.o;
com.doodle.ltcsmyb.c.c .a ( v2 );
(( com.doodle.ltcsmyb.c.c ) v2 ).k ( ); // invoke-virtual {v2}, Lcom/doodle/ltcsmyb/c/c;->k()Lcom/doodlemobile/basket/graphics/Animation;
int v3 = 2; // const/4 v3, 0x2
/* invoke-direct {v0, v1, v2, v3}, Lcom/doodle/ltcsmyb/b/b;-><init>(Lcom/doodle/ltcsmyb/a;Lcom/doodlemobile/basket/graphics/Animation;I)V */
/* goto/16 :goto_1 */
} // :cond_8
v1 = com.doodle.ltcsmyb.TvPanel .e ( );
/* if-ne v1, v7, :cond_9 */
v0 = this.s;
/* const v1, 0x7f09014f */
(( com.doodlemobile.basket.game2d.b ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/game2d/b;->a(I)V
/* new-instance v0, Lcom/doodle/ltcsmyb/b/b; */
v1 = this.K;
v2 = this.o;
com.doodle.ltcsmyb.c.c .a ( v2 );
(( com.doodle.ltcsmyb.c.c ) v2 ).k ( ); // invoke-virtual {v2}, Lcom/doodle/ltcsmyb/c/c;->k()Lcom/doodlemobile/basket/graphics/Animation;
/* invoke-direct {v0, v1, v2, v7}, Lcom/doodle/ltcsmyb/b/b;-><init>(Lcom/doodle/ltcsmyb/a;Lcom/doodlemobile/basket/graphics/Animation;I)V */
/* goto/16 :goto_1 */
} // :cond_9
v1 = com.doodle.ltcsmyb.TvPanel .e ( );
int v2 = 4; // const/4 v2, 0x4
/* if-ne v1, v2, :cond_a */
v0 = this.s;
/* const v1, 0x7f09014e */
(( com.doodlemobile.basket.game2d.b ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/game2d/b;->a(I)V
/* new-instance v0, Lcom/doodle/ltcsmyb/b/b; */
v1 = this.K;
v2 = this.o;
com.doodle.ltcsmyb.c.c .a ( v2 );
(( com.doodle.ltcsmyb.c.c ) v2 ).k ( ); // invoke-virtual {v2}, Lcom/doodle/ltcsmyb/c/c;->k()Lcom/doodlemobile/basket/graphics/Animation;
int v3 = 4; // const/4 v3, 0x4
/* invoke-direct {v0, v1, v2, v3}, Lcom/doodle/ltcsmyb/b/b;-><init>(Lcom/doodle/ltcsmyb/a;Lcom/doodlemobile/basket/graphics/Animation;I)V */
/* goto/16 :goto_1 */
} // :cond_a
v1 = com.doodle.ltcsmyb.TvPanel .e ( );
int v2 = 5; // const/4 v2, 0x5
/* if-ne v1, v2, :cond_1 */
v0 = this.s;
/* const v1, 0x7f090148 */
(( com.doodlemobile.basket.game2d.b ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/game2d/b;->a(I)V
/* new-instance v0, Lcom/doodle/ltcsmyb/b/b; */
v1 = this.K;
v2 = this.o;
com.doodle.ltcsmyb.c.c .a ( v2 );
(( com.doodle.ltcsmyb.c.c ) v2 ).k ( ); // invoke-virtual {v2}, Lcom/doodle/ltcsmyb/c/c;->k()Lcom/doodlemobile/basket/graphics/Animation;
int v3 = 5; // const/4 v3, 0x5
/* invoke-direct {v0, v1, v2, v3}, Lcom/doodle/ltcsmyb/b/b;-><init>(Lcom/doodle/ltcsmyb/a;Lcom/doodlemobile/basket/graphics/Animation;I)V */
/* goto/16 :goto_1 */
} // .end method
private Integer a ( java.util.ArrayList p0 ) {
/* .locals 9 */
/* const/16 v8, 0xa */
int v0 = 0; // const/4 v0, 0x0
/* const/16 v7, 0x28 */
/* const/16 v6, 0x1e */
/* const/16 v5, 0x14 */
/* move v2, v0 */
/* move v1, v0 */
} // :goto_0
v0 = (( java.util.ArrayList ) p1 ).size ( ); // invoke-virtual {p1}, Ljava/util/ArrayList;->size()I
/* if-ge v2, v0, :cond_3 */
(( java.util.ArrayList ) p1 ).get ( v2 ); // invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/badlogic/gdx/physics/box2d/Body; */
if ( v0 != null) { // if-eqz v0, :cond_5
/* add-int/lit8 v3, v1, 0x1 */
(( com.badlogic.gdx.physics.box2d.Body ) v0 ).getPosition ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/Body;->getPosition()Lcom/badlogic/gdx/math/Vector2;
/* iget v1, v1, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* const/high16 v4, 0x43fa0000 # 500.0f */
/* cmpl-float v1, v1, v4 */
/* if-lez v1, :cond_4 */
(( com.badlogic.gdx.physics.box2d.Body ) v0 ).getUserData ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/Body;->getUserData()Ljava/lang/Object;
/* instance-of v1, v1, Lcom/doodle/ltcsmyb/b/f; */
if ( v1 != null) { // if-eqz v1, :cond_2
(( com.badlogic.gdx.physics.box2d.Body ) v0 ).getUserData ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/Body;->getUserData()Ljava/lang/Object;
/* check-cast v1, Lcom/doodle/ltcsmyb/b/f; */
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = (( com.doodle.ltcsmyb.b.f ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/doodle/ltcsmyb/b/f;->a()I
/* packed-switch v1, :pswitch_data_0 */
} // :cond_0
} // :goto_1
(( com.badlogic.gdx.physics.box2d.Body ) v0 ).getUserData ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/Body;->getUserData()Ljava/lang/Object;
/* check-cast v1, Lcom/doodlemobile/basket/game2d/a; */
if ( v1 != null) { // if-eqz v1, :cond_1
(( com.doodlemobile.basket.game2d.a ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/doodlemobile/basket/game2d/a;->c()V
v4 = this.n;
(( com.doodlemobile.basket.game2d.c ) v4 ).b ( v1 ); // invoke-virtual {v4, v1}, Lcom/doodlemobile/basket/game2d/c;->b(Lcom/doodlemobile/basket/game2d/a;)V
} // :cond_1
(( java.util.ArrayList ) p1 ).remove ( v2 ); // invoke-virtual {p1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
/* add-int/lit8 v1, v2, -0x1 */
v2 = this.m;
(( com.badlogic.gdx.physics.box2d.World ) v2 ).destroyBody ( v0 ); // invoke-virtual {v2, v0}, Lcom/badlogic/gdx/physics/box2d/World;->destroyBody(Lcom/badlogic/gdx/physics/box2d/Body;)V
/* move v0, v1 */
/* move v1, v3 */
} // :goto_2
/* add-int/lit8 v0, v0, 0x1 */
/* move v2, v0 */
/* :pswitch_0 */
/* invoke-direct {p0, v8, v0}, Lcom/doodle/ltcsmyb/c/b;->a(ILcom/badlogic/gdx/physics/box2d/Body;)V */
/* :pswitch_1 */
/* invoke-direct {p0, v5, v0}, Lcom/doodle/ltcsmyb/c/b;->a(ILcom/badlogic/gdx/physics/box2d/Body;)V */
/* :pswitch_2 */
/* invoke-direct {p0, v6, v0}, Lcom/doodle/ltcsmyb/c/b;->a(ILcom/badlogic/gdx/physics/box2d/Body;)V */
/* :pswitch_3 */
/* invoke-direct {p0, v7, v0}, Lcom/doodle/ltcsmyb/c/b;->a(ILcom/badlogic/gdx/physics/box2d/Body;)V */
/* :pswitch_4 */
/* invoke-direct {p0, v7, v0}, Lcom/doodle/ltcsmyb/c/b;->a(ILcom/badlogic/gdx/physics/box2d/Body;)V */
/* :pswitch_5 */
/* invoke-direct {p0, v6, v0}, Lcom/doodle/ltcsmyb/c/b;->a(ILcom/badlogic/gdx/physics/box2d/Body;)V */
/* :pswitch_6 */
/* invoke-direct {p0, v5, v0}, Lcom/doodle/ltcsmyb/c/b;->a(ILcom/badlogic/gdx/physics/box2d/Body;)V */
} // :cond_2
(( com.badlogic.gdx.physics.box2d.Body ) v0 ).getUserData ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/Body;->getUserData()Ljava/lang/Object;
/* instance-of v1, v1, Lcom/doodle/ltcsmyb/b/a; */
if ( v1 != null) { // if-eqz v1, :cond_0
(( com.badlogic.gdx.physics.box2d.Body ) v0 ).getUserData ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/Body;->getUserData()Ljava/lang/Object;
/* check-cast v1, Lcom/doodle/ltcsmyb/b/a; */
v1 = (( com.doodle.ltcsmyb.b.a ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/doodle/ltcsmyb/b/a;->a()I
/* packed-switch v1, :pswitch_data_1 */
/* :pswitch_7 */
/* invoke-direct {p0, v8, v0}, Lcom/doodle/ltcsmyb/c/b;->b(ILcom/badlogic/gdx/physics/box2d/Body;)V */
/* :pswitch_8 */
/* invoke-direct {p0, v5, v0}, Lcom/doodle/ltcsmyb/c/b;->b(ILcom/badlogic/gdx/physics/box2d/Body;)V */
/* :pswitch_9 */
/* invoke-direct {p0, v6, v0}, Lcom/doodle/ltcsmyb/c/b;->b(ILcom/badlogic/gdx/physics/box2d/Body;)V */
/* :pswitch_a */
/* invoke-direct {p0, v7, v0}, Lcom/doodle/ltcsmyb/c/b;->b(ILcom/badlogic/gdx/physics/box2d/Body;)V */
/* :pswitch_b */
/* invoke-direct {p0, v7, v0}, Lcom/doodle/ltcsmyb/c/b;->b(ILcom/badlogic/gdx/physics/box2d/Body;)V */
/* :pswitch_c */
/* invoke-direct {p0, v6, v0}, Lcom/doodle/ltcsmyb/c/b;->b(ILcom/badlogic/gdx/physics/box2d/Body;)V */
/* :pswitch_d */
/* invoke-direct {p0, v5, v0}, Lcom/doodle/ltcsmyb/c/b;->b(ILcom/badlogic/gdx/physics/box2d/Body;)V */
} // :cond_3
} // :cond_4
/* move v0, v2 */
/* move v1, v3 */
} // :cond_5
/* move v0, v2 */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_3 */
/* :pswitch_4 */
/* :pswitch_5 */
/* :pswitch_6 */
} // .end packed-switch
/* :pswitch_data_1 */
/* .packed-switch 0x1 */
/* :pswitch_7 */
/* :pswitch_8 */
/* :pswitch_9 */
/* :pswitch_a */
/* :pswitch_b */
/* :pswitch_c */
/* :pswitch_d */
} // .end packed-switch
} // .end method
private void a ( Integer p0 ) {
/* .locals 14 */
v0 = com.doodle.ltcsmyb.MainActivity.c;
(( com.doodle.ltcsmyb.c.a ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lcom/doodle/ltcsmyb/c/a;->a(I)Ljava/lang/String;
int v0 = 0; // const/4 v0, 0x0
v7 = (( java.lang.String ) v6 ).length ( ); // invoke-virtual {v6}, Ljava/lang/String;->length()I
} // :goto_0
/* const/16 v1, 0xa */
/* sub-int v1, v7, v1 */
/* if-ge v0, v1, :cond_2 */
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
int v8 = 0; // const/4 v8, 0x0
/* move v12, v8 */
/* move v8, v0 */
/* move v0, v12 */
} // :goto_1
int v9 = 5; // const/4 v9, 0x5
/* if-ge v0, v9, :cond_1 */
int v9 = 0; // const/4 v9, 0x0
} // :goto_2
v10 = (( java.lang.String ) v6 ).charAt ( v8 ); // invoke-virtual {v6, v8}, Ljava/lang/String;->charAt(I)C
/* const/16 v11, 0x20 */
/* if-ne v10, v11, :cond_3 */
/* add-int/lit8 v8, v8, 0x1 */
} // :goto_3
v10 = (( java.lang.String ) v6 ).charAt ( v9 ); // invoke-virtual {v6, v9}, Ljava/lang/String;->charAt(I)C
/* const/16 v11, 0x20 */
/* if-eq v10, v11, :cond_0 */
/* mul-int/lit8 v8, v8, 0xa */
v10 = (( java.lang.String ) v6 ).charAt ( v9 ); // invoke-virtual {v6, v9}, Ljava/lang/String;->charAt(I)C
/* const/16 v11, 0x30 */
/* sub-int/2addr v10, v11 */
/* add-int/2addr v8, v10 */
/* add-int/lit8 v9, v9, 0x1 */
} // :cond_0
/* packed-switch v0, :pswitch_data_0 */
/* move v12, v5 */
/* move v5, v1 */
/* move v1, v12 */
/* move v13, v2 */
/* move v2, v4 */
/* move v4, v13 */
} // :goto_4
/* add-int/lit8 v0, v0, 0x1 */
/* move v8, v9 */
/* move v12, v2 */
/* move v2, v4 */
/* move v4, v12 */
/* move v13, v5 */
/* move v5, v1 */
/* move v1, v13 */
/* :pswitch_0 */
/* move v1, v5 */
/* move v5, v8 */
/* move v12, v2 */
/* move v2, v4 */
/* move v4, v12 */
/* :pswitch_1 */
/* move v2, v4 */
/* move v4, v8 */
/* move v12, v5 */
/* move v5, v1 */
/* move v1, v12 */
/* :pswitch_2 */
/* move v3, v8 */
/* move v12, v4 */
/* move v4, v2 */
/* move v2, v12 */
/* move v13, v5 */
/* move v5, v1 */
/* move v1, v13 */
/* :pswitch_3 */
/* move v4, v2 */
/* move v2, v8 */
/* move v12, v5 */
/* move v5, v1 */
/* move v1, v12 */
/* :pswitch_4 */
/* move v5, v1 */
/* move v1, v8 */
/* move v12, v2 */
/* move v2, v4 */
/* move v4, v12 */
} // :cond_1
/* rem-int/lit8 v0, v3, 0x4 */
/* int-to-float v0, v0 */
/* const v3, 0x40490fda */
/* mul-float/2addr v0, v3 */
/* const/high16 v3, 0x40000000 # 2.0f */
/* div-float v3, v0, v3 */
/* const/16 v0, 0xf0 */
/* sub-int v0, v4, v0 */
/* int-to-float v4, v0 */
/* iget v0, p0, Lcom/doodle/ltcsmyb/c/b;->D:F */
/* iget v9, p0, Lcom/doodle/ltcsmyb/c/b;->E:F */
/* sub-float/2addr v0, v9 */
/* int-to-float v5, v5 */
/* sub-float/2addr v0, v5 */
/* float-to-int v0, v0 */
/* int-to-float v5, v0 */
/* move-object v0, p0 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyb/c/b;->a(IIFFF)V */
(( com.doodle.ltcsmyb.c.b ) p0 ).k ( ); // invoke-virtual {p0}, Lcom/doodle/ltcsmyb/c/b;->k()V
/* move v0, v8 */
/* goto/16 :goto_0 */
} // :cond_2
return;
} // :cond_3
/* move v12, v9 */
/* move v9, v8 */
/* move v8, v12 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_3 */
/* :pswitch_4 */
} // .end packed-switch
} // .end method
private void a ( Integer p0, Float p1 ) {
/* .locals 2 */
/* const/high16 v1, 0x43b40000 # 360.0f */
int v0 = 0; // const/4 v0, 0x0
/* cmpl-float v0, p2, v0 */
/* if-lez v0, :cond_0 */
/* const/high16 v0, 0x43480000 # 200.0f */
(( com.doodle.ltcsmyb.c.b ) p0 ).a ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Lcom/doodle/ltcsmyb/c/b;->a(IFF)V
} // :goto_0
return;
} // :cond_0
/* const/high16 v0, -0x3cb80000 # -200.0f */
(( com.doodle.ltcsmyb.c.b ) p0 ).a ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Lcom/doodle/ltcsmyb/c/b;->a(IFF)V
} // .end method
private void a ( Integer p0, com.badlogic.gdx.physics.box2d.Body p1 ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodle/ltcsmyb/c/b;->T:I */
/* if-lez v0, :cond_0 */
v0 = this.K;
(( com.doodle.ltcsmyb.a ) v0 ).e ( p1 ); // invoke-virtual {v0, p1}, Lcom/doodle/ltcsmyb/a;->e(I)V
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/c/b;->I:Z */
/* if-nez v0, :cond_0 */
(( com.badlogic.gdx.physics.box2d.Body ) p2 ).getPosition ( ); // invoke-virtual {p2}, Lcom/badlogic/gdx/physics/box2d/Body;->getPosition()Lcom/badlogic/gdx/math/Vector2;
/* iget v0, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* invoke-direct {p0, p1, v0}, Lcom/doodle/ltcsmyb/c/b;->a(IF)V */
} // :cond_0
return;
} // .end method
private void b ( Integer p0, com.badlogic.gdx.physics.box2d.Body p1 ) {
/* .locals 2 */
v0 = this.K;
(( com.doodle.ltcsmyb.a ) v0 ).f ( p1 ); // invoke-virtual {v0, p1}, Lcom/doodle/ltcsmyb/a;->f(I)V
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/c/b;->I:Z */
/* if-nez v0, :cond_0 */
/* neg-int v0, p1 */
(( com.badlogic.gdx.physics.box2d.Body ) p2 ).getPosition ( ); // invoke-virtual {p2}, Lcom/badlogic/gdx/physics/box2d/Body;->getPosition()Lcom/badlogic/gdx/math/Vector2;
/* iget v1, v1, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* invoke-direct {p0, v0, v1}, Lcom/doodle/ltcsmyb/c/b;->a(IF)V */
} // :cond_0
(( com.doodle.ltcsmyb.c.b ) p0 ).o ( ); // invoke-virtual {p0}, Lcom/doodle/ltcsmyb/c/b;->o()V
return;
} // .end method
public static Boolean l ( ) {
/* .locals 1 */
/* sget-boolean v0, Lcom/doodle/ltcsmyb/c/b;->L:Z */
} // .end method
public static void m ( ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
com.doodle.ltcsmyb.c.b.L = (v0!= 0);
java.lang.System .currentTimeMillis ( );
/* move-result-wide v0 */
/* sput-wide v0, Lcom/doodle/ltcsmyb/c/b;->U:J */
return;
} // .end method
/* # virtual methods */
public final void a ( Integer p0, Float p1, Float p2 ) {
/* .locals 7 */
v6 = this.d;
/* new-instance v0, Lcom/doodle/ltcsmyb/a/b; */
v1 = this.K;
(( com.doodle.ltcsmyb.a ) v1 ).h ( ); // invoke-virtual {v1}, Lcom/doodle/ltcsmyb/a;->h()Lcom/doodlemobile/basket/b/b;
v2 = this.K;
(( com.doodle.ltcsmyb.a ) v2 ).c ( ); // invoke-virtual {v2}, Lcom/doodle/ltcsmyb/a;->c()Lcom/doodle/ltcsmyb/MainActivity;
(( com.doodle.ltcsmyb.MainActivity ) v2 ).p ( ); // invoke-virtual {v2}, Lcom/doodle/ltcsmyb/MainActivity;->p()Lcom/doodlemobile/basket/ui/Panel;
/* move v3, p1 */
/* move v4, p2 */
/* move v5, p3 */
/* invoke-direct/range {v0 ..v5}, Lcom/doodle/ltcsmyb/a/b;-><init>(Lcom/doodlemobile/basket/b/b;Lcom/doodlemobile/basket/ui/Panel;IFF)V */
(( java.util.ArrayList ) v6 ).add ( v0 ); // invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
return;
} // .end method
public final void a ( Integer p0, Integer p1, Float p2, Float p3, Float p4 ) {
/* .locals 6 */
int v0 = 4; // const/4 v0, 0x4
/* if-ne p1, v0, :cond_2 */
v0 = this.j;
v1 = com.badlogic.gdx.physics.box2d.BodyDef$BodyType.StaticBody;
this.type = v1;
} // :goto_0
v0 = this.m;
v1 = this.j;
(( com.badlogic.gdx.physics.box2d.World ) v0 ).createBody ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/physics/box2d/World;->createBody(Lcom/badlogic/gdx/physics/box2d/BodyDef;)Lcom/badlogic/gdx/physics/box2d/Body;
int v1 = 1; // const/4 v1, 0x1
/* if-ne p2, v1, :cond_3 */
v1 = this.k;
/* const/high16 v2, 0x41f00000 # 30.0f */
/* const/high16 v3, 0x41f00000 # 30.0f */
(( com.badlogic.gdx.physics.box2d.PolygonShape ) v1 ).setAsBox ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/badlogic/gdx/physics/box2d/PolygonShape;->setAsBox(FF)V
} // :cond_0
} // :goto_1
v1 = this.l;
v2 = this.k;
this.shape = v2;
v1 = this.l;
/* const/high16 v2, 0x3f800000 # 1.0f */
/* iput v2, v1, Lcom/badlogic/gdx/physics/box2d/FixtureDef;->friction:F */
v1 = this.l;
/* const/high16 v2, 0x3f800000 # 1.0f */
/* iput v2, v1, Lcom/badlogic/gdx/physics/box2d/FixtureDef;->density:F */
v1 = this.l;
int v2 = 0; // const/4 v2, 0x0
/* iput v2, v1, Lcom/badlogic/gdx/physics/box2d/FixtureDef;->restitution:F */
v1 = this.l;
(( com.badlogic.gdx.physics.box2d.Body ) v0 ).createFixture ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/physics/box2d/Body;->createFixture(Lcom/badlogic/gdx/physics/box2d/FixtureDef;)Lcom/badlogic/gdx/physics/box2d/Fixture;
int v1 = 1; // const/4 v1, 0x1
(( com.badlogic.gdx.physics.box2d.Body ) v0 ).setSleepingAllowed ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/physics/box2d/Body;->setSleepingAllowed(Z)V
int v1 = 0; // const/4 v1, 0x0
int v2 = 1; // const/4 v2, 0x1
/* if-ne p1, v2, :cond_f */
v2 = this.e;
(( java.util.ArrayList ) v2 ).add ( v0 ); // invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
int v2 = 1; // const/4 v2, 0x1
/* if-ne p2, v2, :cond_9 */
v1 = this.o;
com.doodle.ltcsmyb.c.c .a ( v1 );
(( com.doodle.ltcsmyb.c.c ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/doodle/ltcsmyb/c/c;->a()Lcom/doodlemobile/basket/graphics/Animation;
/* new-instance v2, Lcom/doodle/ltcsmyb/b/f; */
v3 = this.K;
int v4 = 1; // const/4 v4, 0x1
/* invoke-direct {v2, v3, v1, v4, v0}, Lcom/doodle/ltcsmyb/b/f;-><init>(Lcom/doodle/ltcsmyb/a;Lcom/doodlemobile/basket/graphics/Animation;ILcom/badlogic/gdx/physics/box2d/Body;)V */
/* move-object v1, v2 */
} // :cond_1
} // :goto_2
(( com.badlogic.gdx.physics.box2d.Body ) v0 ).setUserData ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/physics/box2d/Body;->setUserData(Ljava/lang/Object;)V
v2 = this.n;
(( com.doodlemobile.basket.game2d.c ) v2 ).a ( v1 ); // invoke-virtual {v2, v1}, Lcom/doodlemobile/basket/game2d/c;->a(Lcom/doodlemobile/basket/game2d/a;)V
/* new-instance v1, Lcom/badlogic/gdx/math/Vector2; */
/* invoke-direct {v1, p4, p5}, Lcom/badlogic/gdx/math/Vector2;-><init>(FF)V */
(( com.badlogic.gdx.physics.box2d.Body ) v0 ).setTransform ( v1, p3 ); // invoke-virtual {v0, v1, p3}, Lcom/badlogic/gdx/physics/box2d/Body;->setTransform(Lcom/badlogic/gdx/math/Vector2;F)V
return;
} // :cond_2
v0 = this.j;
v1 = com.badlogic.gdx.physics.box2d.BodyDef$BodyType.DynamicBody;
this.type = v1;
} // :cond_3
int v1 = 2; // const/4 v1, 0x2
/* if-ne p2, v1, :cond_4 */
v1 = this.k;
/* const/high16 v2, 0x42700000 # 60.0f */
/* const/high16 v3, 0x41f00000 # 30.0f */
(( com.badlogic.gdx.physics.box2d.PolygonShape ) v1 ).setAsBox ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/badlogic/gdx/physics/box2d/PolygonShape;->setAsBox(FF)V
} // :cond_4
int v1 = 3; // const/4 v1, 0x3
/* if-ne p2, v1, :cond_5 */
v1 = this.k;
/* const/high16 v2, 0x42b40000 # 90.0f */
/* const/high16 v3, 0x41f00000 # 30.0f */
(( com.badlogic.gdx.physics.box2d.PolygonShape ) v1 ).setAsBox ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/badlogic/gdx/physics/box2d/PolygonShape;->setAsBox(FF)V
} // :cond_5
int v1 = 4; // const/4 v1, 0x4
/* if-ne p2, v1, :cond_6 */
v1 = this.k;
/* const/high16 v2, 0x42f00000 # 120.0f */
/* const/high16 v3, 0x41f00000 # 30.0f */
(( com.badlogic.gdx.physics.box2d.PolygonShape ) v1 ).setAsBox ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/badlogic/gdx/physics/box2d/PolygonShape;->setAsBox(FF)V
} // :cond_6
int v1 = 5; // const/4 v1, 0x5
/* if-ne p2, v1, :cond_7 */
v1 = this.k;
/* const/high16 v2, 0x42700000 # 60.0f */
/* const/high16 v3, 0x42700000 # 60.0f */
(( com.badlogic.gdx.physics.box2d.PolygonShape ) v1 ).setAsBox ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/badlogic/gdx/physics/box2d/PolygonShape;->setAsBox(FF)V
/* goto/16 :goto_1 */
} // :cond_7
int v1 = 6; // const/4 v1, 0x6
/* if-ne p2, v1, :cond_8 */
int v1 = 4; // const/4 v1, 0x4
/* new-array v1, v1, [Lcom/badlogic/gdx/math/Vector2; */
int v2 = 0; // const/4 v2, 0x0
/* new-instance v3, Lcom/badlogic/gdx/math/Vector2; */
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
/* invoke-direct {v3, v4, v5}, Lcom/badlogic/gdx/math/Vector2;-><init>(FF)V */
/* aput-object v3, v1, v2 */
int v2 = 1; // const/4 v2, 0x1
/* new-instance v3, Lcom/badlogic/gdx/math/Vector2; */
/* const/high16 v4, 0x42700000 # 60.0f */
int v5 = 0; // const/4 v5, 0x0
/* invoke-direct {v3, v4, v5}, Lcom/badlogic/gdx/math/Vector2;-><init>(FF)V */
/* aput-object v3, v1, v2 */
int v2 = 2; // const/4 v2, 0x2
/* new-instance v3, Lcom/badlogic/gdx/math/Vector2; */
/* const/high16 v4, 0x42700000 # 60.0f */
/* const/high16 v5, 0x42700000 # 60.0f */
/* invoke-direct {v3, v4, v5}, Lcom/badlogic/gdx/math/Vector2;-><init>(FF)V */
/* aput-object v3, v1, v2 */
int v2 = 3; // const/4 v2, 0x3
/* new-instance v3, Lcom/badlogic/gdx/math/Vector2; */
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x42700000 # 60.0f */
/* invoke-direct {v3, v4, v5}, Lcom/badlogic/gdx/math/Vector2;-><init>(FF)V */
/* aput-object v3, v1, v2 */
v2 = this.k;
(( com.badlogic.gdx.physics.box2d.PolygonShape ) v2 ).set ( v1 ); // invoke-virtual {v2, v1}, Lcom/badlogic/gdx/physics/box2d/PolygonShape;->set([Lcom/badlogic/gdx/math/Vector2;)V
int v1 = 4; // const/4 v1, 0x4
/* new-array v1, v1, [Lcom/badlogic/gdx/math/Vector2; */
int v2 = 0; // const/4 v2, 0x0
/* new-instance v3, Lcom/badlogic/gdx/math/Vector2; */
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, -0x3d900000 # -60.0f */
/* invoke-direct {v3, v4, v5}, Lcom/badlogic/gdx/math/Vector2;-><init>(FF)V */
/* aput-object v3, v1, v2 */
int v2 = 1; // const/4 v2, 0x1
/* new-instance v3, Lcom/badlogic/gdx/math/Vector2; */
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x42700000 # 60.0f */
/* invoke-direct {v3, v4, v5}, Lcom/badlogic/gdx/math/Vector2;-><init>(FF)V */
/* aput-object v3, v1, v2 */
int v2 = 2; // const/4 v2, 0x2
/* new-instance v3, Lcom/badlogic/gdx/math/Vector2; */
/* const/high16 v4, -0x3d900000 # -60.0f */
/* const/high16 v5, 0x42700000 # 60.0f */
/* invoke-direct {v3, v4, v5}, Lcom/badlogic/gdx/math/Vector2;-><init>(FF)V */
/* aput-object v3, v1, v2 */
int v2 = 3; // const/4 v2, 0x3
/* new-instance v3, Lcom/badlogic/gdx/math/Vector2; */
/* const/high16 v4, -0x3d900000 # -60.0f */
/* const/high16 v5, -0x3d900000 # -60.0f */
/* invoke-direct {v3, v4, v5}, Lcom/badlogic/gdx/math/Vector2;-><init>(FF)V */
/* aput-object v3, v1, v2 */
/* new-instance v2, Lcom/badlogic/gdx/physics/box2d/PolygonShape; */
/* invoke-direct {v2}, Lcom/badlogic/gdx/physics/box2d/PolygonShape;-><init>()V */
(( com.badlogic.gdx.physics.box2d.PolygonShape ) v2 ).set ( v1 ); // invoke-virtual {v2, v1}, Lcom/badlogic/gdx/physics/box2d/PolygonShape;->set([Lcom/badlogic/gdx/math/Vector2;)V
v1 = this.l;
this.shape = v2;
v1 = this.l;
/* const/high16 v2, 0x3f800000 # 1.0f */
/* iput v2, v1, Lcom/badlogic/gdx/physics/box2d/FixtureDef;->friction:F */
v1 = this.l;
/* const/high16 v2, 0x3f800000 # 1.0f */
/* iput v2, v1, Lcom/badlogic/gdx/physics/box2d/FixtureDef;->density:F */
v1 = this.l;
int v2 = 0; // const/4 v2, 0x0
/* iput v2, v1, Lcom/badlogic/gdx/physics/box2d/FixtureDef;->restitution:F */
v1 = this.l;
(( com.badlogic.gdx.physics.box2d.Body ) v0 ).createFixture ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/physics/box2d/Body;->createFixture(Lcom/badlogic/gdx/physics/box2d/FixtureDef;)Lcom/badlogic/gdx/physics/box2d/Fixture;
/* goto/16 :goto_1 */
} // :cond_8
int v1 = 7; // const/4 v1, 0x7
/* if-ne p2, v1, :cond_0 */
int v1 = 3; // const/4 v1, 0x3
/* new-array v1, v1, [Lcom/badlogic/gdx/math/Vector2; */
int v2 = 0; // const/4 v2, 0x0
/* new-instance v3, Lcom/badlogic/gdx/math/Vector2; */
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, -0x3e100000 # -30.0f */
/* invoke-direct {v3, v4, v5}, Lcom/badlogic/gdx/math/Vector2;-><init>(FF)V */
/* aput-object v3, v1, v2 */
int v2 = 1; // const/4 v2, 0x1
/* new-instance v3, Lcom/badlogic/gdx/math/Vector2; */
/* const/high16 v4, 0x42700000 # 60.0f */
/* const/high16 v5, 0x41f00000 # 30.0f */
/* invoke-direct {v3, v4, v5}, Lcom/badlogic/gdx/math/Vector2;-><init>(FF)V */
/* aput-object v3, v1, v2 */
int v2 = 2; // const/4 v2, 0x2
/* new-instance v3, Lcom/badlogic/gdx/math/Vector2; */
/* const/high16 v4, -0x3d900000 # -60.0f */
/* const/high16 v5, 0x41f00000 # 30.0f */
/* invoke-direct {v3, v4, v5}, Lcom/badlogic/gdx/math/Vector2;-><init>(FF)V */
/* aput-object v3, v1, v2 */
v2 = this.k;
(( com.badlogic.gdx.physics.box2d.PolygonShape ) v2 ).set ( v1 ); // invoke-virtual {v2, v1}, Lcom/badlogic/gdx/physics/box2d/PolygonShape;->set([Lcom/badlogic/gdx/math/Vector2;)V
/* goto/16 :goto_1 */
} // :cond_9
int v2 = 2; // const/4 v2, 0x2
/* if-ne p2, v2, :cond_a */
v1 = this.o;
com.doodle.ltcsmyb.c.c .a ( v1 );
(( com.doodle.ltcsmyb.c.c ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/doodle/ltcsmyb/c/c;->b()Lcom/doodlemobile/basket/graphics/Animation;
/* new-instance v2, Lcom/doodle/ltcsmyb/b/f; */
v3 = this.K;
int v4 = 2; // const/4 v4, 0x2
/* invoke-direct {v2, v3, v1, v4, v0}, Lcom/doodle/ltcsmyb/b/f;-><init>(Lcom/doodle/ltcsmyb/a;Lcom/doodlemobile/basket/graphics/Animation;ILcom/badlogic/gdx/physics/box2d/Body;)V */
/* move-object v1, v2 */
/* goto/16 :goto_2 */
} // :cond_a
int v2 = 3; // const/4 v2, 0x3
/* if-ne p2, v2, :cond_b */
v1 = this.o;
com.doodle.ltcsmyb.c.c .a ( v1 );
(( com.doodle.ltcsmyb.c.c ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/doodle/ltcsmyb/c/c;->c()Lcom/doodlemobile/basket/graphics/Animation;
/* new-instance v2, Lcom/doodle/ltcsmyb/b/f; */
v3 = this.K;
int v4 = 3; // const/4 v4, 0x3
/* invoke-direct {v2, v3, v1, v4, v0}, Lcom/doodle/ltcsmyb/b/f;-><init>(Lcom/doodle/ltcsmyb/a;Lcom/doodlemobile/basket/graphics/Animation;ILcom/badlogic/gdx/physics/box2d/Body;)V */
/* move-object v1, v2 */
/* goto/16 :goto_2 */
} // :cond_b
int v2 = 4; // const/4 v2, 0x4
/* if-ne p2, v2, :cond_c */
v1 = this.o;
com.doodle.ltcsmyb.c.c .a ( v1 );
(( com.doodle.ltcsmyb.c.c ) v1 ).d ( ); // invoke-virtual {v1}, Lcom/doodle/ltcsmyb/c/c;->d()Lcom/doodlemobile/basket/graphics/Animation;
/* new-instance v2, Lcom/doodle/ltcsmyb/b/f; */
v3 = this.K;
int v4 = 4; // const/4 v4, 0x4
/* invoke-direct {v2, v3, v1, v4, v0}, Lcom/doodle/ltcsmyb/b/f;-><init>(Lcom/doodle/ltcsmyb/a;Lcom/doodlemobile/basket/graphics/Animation;ILcom/badlogic/gdx/physics/box2d/Body;)V */
/* move-object v1, v2 */
/* goto/16 :goto_2 */
} // :cond_c
int v2 = 5; // const/4 v2, 0x5
/* if-ne p2, v2, :cond_d */
v1 = this.o;
com.doodle.ltcsmyb.c.c .a ( v1 );
(( com.doodle.ltcsmyb.c.c ) v1 ).e ( ); // invoke-virtual {v1}, Lcom/doodle/ltcsmyb/c/c;->e()Lcom/doodlemobile/basket/graphics/Animation;
/* new-instance v2, Lcom/doodle/ltcsmyb/b/f; */
v3 = this.K;
int v4 = 5; // const/4 v4, 0x5
/* invoke-direct {v2, v3, v1, v4, v0}, Lcom/doodle/ltcsmyb/b/f;-><init>(Lcom/doodle/ltcsmyb/a;Lcom/doodlemobile/basket/graphics/Animation;ILcom/badlogic/gdx/physics/box2d/Body;)V */
/* move-object v1, v2 */
/* goto/16 :goto_2 */
} // :cond_d
int v2 = 6; // const/4 v2, 0x6
/* if-ne p2, v2, :cond_e */
v1 = this.o;
com.doodle.ltcsmyb.c.c .a ( v1 );
(( com.doodle.ltcsmyb.c.c ) v1 ).f ( ); // invoke-virtual {v1}, Lcom/doodle/ltcsmyb/c/c;->f()Lcom/doodlemobile/basket/graphics/Animation;
/* new-instance v2, Lcom/doodle/ltcsmyb/b/f; */
v3 = this.K;
int v4 = 6; // const/4 v4, 0x6
/* invoke-direct {v2, v3, v1, v4, v0}, Lcom/doodle/ltcsmyb/b/f;-><init>(Lcom/doodle/ltcsmyb/a;Lcom/doodlemobile/basket/graphics/Animation;ILcom/badlogic/gdx/physics/box2d/Body;)V */
/* move-object v1, v2 */
/* goto/16 :goto_2 */
} // :cond_e
int v2 = 7; // const/4 v2, 0x7
/* if-ne p2, v2, :cond_1 */
v1 = this.o;
com.doodle.ltcsmyb.c.c .a ( v1 );
(( com.doodle.ltcsmyb.c.c ) v1 ).g ( ); // invoke-virtual {v1}, Lcom/doodle/ltcsmyb/c/c;->g()Lcom/doodlemobile/basket/graphics/Animation;
/* new-instance v2, Lcom/doodle/ltcsmyb/b/f; */
v3 = this.K;
int v4 = 7; // const/4 v4, 0x7
/* invoke-direct {v2, v3, v1, v4, v0}, Lcom/doodle/ltcsmyb/b/f;-><init>(Lcom/doodle/ltcsmyb/a;Lcom/doodlemobile/basket/graphics/Animation;ILcom/badlogic/gdx/physics/box2d/Body;)V */
/* move-object v1, v2 */
/* goto/16 :goto_2 */
} // :cond_f
/* if-nez p1, :cond_16 */
v2 = this.f;
(( java.util.ArrayList ) v2 ).add ( v0 ); // invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
v2 = this.o;
com.doodle.ltcsmyb.c.c .a ( v2 );
(( com.doodle.ltcsmyb.c.c ) v2 ).h ( ); // invoke-virtual {v2}, Lcom/doodle/ltcsmyb/c/c;->h()Lcom/doodlemobile/basket/graphics/Animation;
int v3 = 1; // const/4 v3, 0x1
/* if-ne p2, v3, :cond_10 */
/* new-instance v1, Lcom/doodle/ltcsmyb/b/a; */
v3 = this.K;
int v4 = 1; // const/4 v4, 0x1
/* invoke-direct {v1, v3, v2, v4, v0}, Lcom/doodle/ltcsmyb/b/a;-><init>(Lcom/doodle/ltcsmyb/a;Lcom/doodlemobile/basket/graphics/Animation;ILcom/badlogic/gdx/physics/box2d/Body;)V */
/* goto/16 :goto_2 */
} // :cond_10
int v3 = 2; // const/4 v3, 0x2
/* if-ne p2, v3, :cond_11 */
/* new-instance v1, Lcom/doodle/ltcsmyb/b/a; */
v3 = this.K;
int v4 = 2; // const/4 v4, 0x2
/* invoke-direct {v1, v3, v2, v4, v0}, Lcom/doodle/ltcsmyb/b/a;-><init>(Lcom/doodle/ltcsmyb/a;Lcom/doodlemobile/basket/graphics/Animation;ILcom/badlogic/gdx/physics/box2d/Body;)V */
/* goto/16 :goto_2 */
} // :cond_11
int v3 = 3; // const/4 v3, 0x3
/* if-ne p2, v3, :cond_12 */
/* new-instance v1, Lcom/doodle/ltcsmyb/b/a; */
v3 = this.K;
int v4 = 3; // const/4 v4, 0x3
/* invoke-direct {v1, v3, v2, v4, v0}, Lcom/doodle/ltcsmyb/b/a;-><init>(Lcom/doodle/ltcsmyb/a;Lcom/doodlemobile/basket/graphics/Animation;ILcom/badlogic/gdx/physics/box2d/Body;)V */
/* goto/16 :goto_2 */
} // :cond_12
int v3 = 4; // const/4 v3, 0x4
/* if-ne p2, v3, :cond_13 */
/* new-instance v1, Lcom/doodle/ltcsmyb/b/a; */
v3 = this.K;
int v4 = 4; // const/4 v4, 0x4
/* invoke-direct {v1, v3, v2, v4, v0}, Lcom/doodle/ltcsmyb/b/a;-><init>(Lcom/doodle/ltcsmyb/a;Lcom/doodlemobile/basket/graphics/Animation;ILcom/badlogic/gdx/physics/box2d/Body;)V */
/* goto/16 :goto_2 */
} // :cond_13
int v3 = 5; // const/4 v3, 0x5
/* if-ne p2, v3, :cond_14 */
/* new-instance v1, Lcom/doodle/ltcsmyb/b/a; */
v3 = this.K;
int v4 = 5; // const/4 v4, 0x5
/* invoke-direct {v1, v3, v2, v4, v0}, Lcom/doodle/ltcsmyb/b/a;-><init>(Lcom/doodle/ltcsmyb/a;Lcom/doodlemobile/basket/graphics/Animation;ILcom/badlogic/gdx/physics/box2d/Body;)V */
/* goto/16 :goto_2 */
} // :cond_14
int v3 = 6; // const/4 v3, 0x6
/* if-ne p2, v3, :cond_15 */
/* new-instance v1, Lcom/doodle/ltcsmyb/b/a; */
v3 = this.K;
int v4 = 6; // const/4 v4, 0x6
/* invoke-direct {v1, v3, v2, v4, v0}, Lcom/doodle/ltcsmyb/b/a;-><init>(Lcom/doodle/ltcsmyb/a;Lcom/doodlemobile/basket/graphics/Animation;ILcom/badlogic/gdx/physics/box2d/Body;)V */
/* goto/16 :goto_2 */
} // :cond_15
int v3 = 7; // const/4 v3, 0x7
/* if-ne p2, v3, :cond_1 */
/* new-instance v1, Lcom/doodle/ltcsmyb/b/a; */
v3 = this.K;
int v4 = 7; // const/4 v4, 0x7
/* invoke-direct {v1, v3, v2, v4, v0}, Lcom/doodle/ltcsmyb/b/a;-><init>(Lcom/doodle/ltcsmyb/a;Lcom/doodlemobile/basket/graphics/Animation;ILcom/badlogic/gdx/physics/box2d/Body;)V */
/* goto/16 :goto_2 */
} // :cond_16
int v2 = 3; // const/4 v2, 0x3
/* if-ne p1, v2, :cond_17 */
v1 = this.g;
(( java.util.ArrayList ) v1 ).add ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
v1 = this.o;
com.doodle.ltcsmyb.c.c .a ( v1 );
(( com.doodle.ltcsmyb.c.c ) v1 ).j ( ); // invoke-virtual {v1}, Lcom/doodle/ltcsmyb/c/c;->j()Lcom/doodlemobile/basket/graphics/Animation;
/* new-instance v2, Lcom/doodle/ltcsmyb/b/c; */
v3 = this.K;
/* invoke-direct {v2, v3, v1, v0}, Lcom/doodle/ltcsmyb/b/c;-><init>(Lcom/doodle/ltcsmyb/a;Lcom/doodlemobile/basket/graphics/Animation;Lcom/badlogic/gdx/physics/box2d/Body;)V */
/* move-object v1, v2 */
/* goto/16 :goto_2 */
} // :cond_17
int v2 = 4; // const/4 v2, 0x4
/* if-ne p1, v2, :cond_18 */
v1 = this.h;
(( java.util.ArrayList ) v1 ).add ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
v1 = this.h;
v1 = (( java.util.ArrayList ) v1 ).indexOf ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I
/* new-instance v2, Lcom/doodle/ltcsmyb/b/e; */
v3 = this.K;
v4 = this.J;
v5 = this.h;
/* invoke-direct {v2, v3, v4, v5, v1}, Lcom/doodle/ltcsmyb/b/e;-><init>(Lcom/doodle/ltcsmyb/a;Lcom/doodlemobile/basket/graphics/e;Ljava/util/ArrayList;I)V */
/* move-object v1, v2 */
/* goto/16 :goto_2 */
} // :cond_18
int v2 = 2; // const/4 v2, 0x2
/* if-ne p1, v2, :cond_1 */
v2 = this.i;
(( java.util.ArrayList ) v2 ).add ( v0 ); // invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
v2 = this.o;
com.doodle.ltcsmyb.c.c .a ( v2 );
(( com.doodle.ltcsmyb.c.c ) v2 ).i ( ); // invoke-virtual {v2}, Lcom/doodle/ltcsmyb/c/c;->i()Lcom/doodlemobile/basket/graphics/Animation;
int v3 = 2; // const/4 v3, 0x2
/* if-ne p2, v3, :cond_19 */
/* new-instance v1, Lcom/doodle/ltcsmyb/b/g; */
v3 = this.K;
int v4 = 2; // const/4 v4, 0x2
/* invoke-direct {v1, v3, v2, v4, v0}, Lcom/doodle/ltcsmyb/b/g;-><init>(Lcom/doodle/ltcsmyb/a;Lcom/doodlemobile/basket/graphics/Animation;ILcom/badlogic/gdx/physics/box2d/Body;)V */
/* goto/16 :goto_2 */
} // :cond_19
int v3 = 3; // const/4 v3, 0x3
/* if-ne p2, v3, :cond_1a */
/* new-instance v1, Lcom/doodle/ltcsmyb/b/g; */
v3 = this.K;
int v4 = 3; // const/4 v4, 0x3
/* invoke-direct {v1, v3, v2, v4, v0}, Lcom/doodle/ltcsmyb/b/g;-><init>(Lcom/doodle/ltcsmyb/a;Lcom/doodlemobile/basket/graphics/Animation;ILcom/badlogic/gdx/physics/box2d/Body;)V */
/* goto/16 :goto_2 */
} // :cond_1a
int v3 = 4; // const/4 v3, 0x4
/* if-ne p2, v3, :cond_1b */
/* new-instance v1, Lcom/doodle/ltcsmyb/b/g; */
v3 = this.K;
int v4 = 4; // const/4 v4, 0x4
/* invoke-direct {v1, v3, v2, v4, v0}, Lcom/doodle/ltcsmyb/b/g;-><init>(Lcom/doodle/ltcsmyb/a;Lcom/doodlemobile/basket/graphics/Animation;ILcom/badlogic/gdx/physics/box2d/Body;)V */
/* goto/16 :goto_2 */
} // :cond_1b
int v3 = 5; // const/4 v3, 0x5
/* if-ne p2, v3, :cond_1c */
/* new-instance v1, Lcom/doodle/ltcsmyb/b/g; */
v3 = this.K;
int v4 = 5; // const/4 v4, 0x5
/* invoke-direct {v1, v3, v2, v4, v0}, Lcom/doodle/ltcsmyb/b/g;-><init>(Lcom/doodle/ltcsmyb/a;Lcom/doodlemobile/basket/graphics/Animation;ILcom/badlogic/gdx/physics/box2d/Body;)V */
/* goto/16 :goto_2 */
} // :cond_1c
int v3 = 6; // const/4 v3, 0x6
/* if-ne p2, v3, :cond_1 */
/* new-instance v1, Lcom/doodle/ltcsmyb/b/g; */
v3 = this.K;
int v4 = 6; // const/4 v4, 0x6
/* invoke-direct {v1, v3, v2, v4, v0}, Lcom/doodle/ltcsmyb/b/g;-><init>(Lcom/doodle/ltcsmyb/a;Lcom/doodlemobile/basket/graphics/Animation;ILcom/badlogic/gdx/physics/box2d/Body;)V */
/* goto/16 :goto_2 */
} // .end method
public final void a ( com.doodlemobile.basket.graphics.Animation p0, Integer p1, Float p2, Float p3, Float p4 ) {
/* .locals 7 */
/* new-instance v0, Lcom/doodle/ltcsmyb/b/d; */
v1 = this.K;
/* move-object v2, p1 */
/* move v3, p2 */
/* move v4, p3 */
/* move v5, p4 */
/* move v6, p5 */
/* invoke-direct/range {v0 ..v6}, Lcom/doodle/ltcsmyb/b/d;-><init>(Lcom/doodle/ltcsmyb/a;Lcom/doodlemobile/basket/graphics/Animation;IFFF)V */
v1 = this.n;
(( com.doodlemobile.basket.game2d.c ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lcom/doodlemobile/basket/game2d/c;->a(Lcom/doodlemobile/basket/game2d/a;)V
return;
} // .end method
public final Boolean a ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/c/b;->I:Z */
} // .end method
public final void b ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/doodle/ltcsmyb/c/b;->I:Z */
return;
} // .end method
public final void c ( ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* move v1, v0 */
} // :goto_0
v0 = this.d;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* if-ge v1, v0, :cond_1 */
v0 = this.d;
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.d;
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/doodle/ltcsmyb/a/b; */
(( com.doodle.ltcsmyb.a.b ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/b;->b()V
} // :cond_0
/* add-int/lit8 v0, v1, 0x1 */
/* move v1, v0 */
} // :cond_1
v0 = this.d;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
return;
} // .end method
public final void d ( ) {
/* .locals 14 */
/* const/16 v10, 0x63 */
/* const v8, 0x3dcccccd # 0.1f */
/* const/16 v13, 0x65 */
int v1 = 1; // const/4 v1, 0x1
int v7 = 0; // const/4 v7, 0x0
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/c/b;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_5
v0 = com.doodlemobile.basket.n .e ( );
/* if-nez v0, :cond_0 */
/* iput-boolean v7, p0, Lcom/doodle/ltcsmyb/c/b;->a:Z */
v0 = this.K;
(( com.doodle.ltcsmyb.a ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a;->c()Lcom/doodle/ltcsmyb/MainActivity;
com.doodle.ltcsmyb.a.a .a ( v0 );
v0 = (( com.doodle.ltcsmyb.a.a ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.K;
(( com.doodle.ltcsmyb.a ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a;->c()Lcom/doodle/ltcsmyb/MainActivity;
com.doodle.ltcsmyb.d.f .a ( v0 );
(( com.doodle.ltcsmyb.d.f ) v0 ).a ( v13 ); // invoke-virtual {v0, v13}, Lcom/doodle/ltcsmyb/d/f;->a(I)V
} // :cond_0
} // :goto_0
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/c/b;->F:Z */
if ( v0 != null) { // if-eqz v0, :cond_7
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/c/b;->G:Z */
/* if-nez v0, :cond_7 */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/c/b;->R:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
java.lang.System .currentTimeMillis ( );
/* move-result-wide v2 */
/* iget-wide v4, p0, Lcom/doodle/ltcsmyb/c/b;->S:J */
/* sub-long/2addr v2, v4 */
/* const-wide/16 v4, 0x7d0 */
/* cmp-long v0, v2, v4 */
/* if-lez v0, :cond_1 */
/* iput-boolean v7, p0, Lcom/doodle/ltcsmyb/c/b;->R:Z */
(( com.doodle.ltcsmyb.c.b ) p0 ).i ( ); // invoke-virtual {p0}, Lcom/doodle/ltcsmyb/c/b;->i()V
} // :cond_1
v0 = this.e;
v0 = /* invoke-direct {p0, v0}, Lcom/doodle/ltcsmyb/c/b;->a(Ljava/util/ArrayList;)I */
v2 = this.g;
v2 = /* invoke-direct {p0, v2}, Lcom/doodle/ltcsmyb/c/b;->a(Ljava/util/ArrayList;)I */
v3 = this.h;
/* invoke-direct {p0, v3}, Lcom/doodle/ltcsmyb/c/b;->a(Ljava/util/ArrayList;)I */
v3 = this.f;
/* invoke-direct {p0, v3}, Lcom/doodle/ltcsmyb/c/b;->a(Ljava/util/ArrayList;)I */
v3 = this.i;
v3 = /* invoke-direct {p0, v3}, Lcom/doodle/ltcsmyb/c/b;->a(Ljava/util/ArrayList;)I */
/* iget v4, p0, Lcom/doodle/ltcsmyb/c/b;->T:I */
/* if-gtz v4, :cond_6 */
/* move v0, v7 */
} // :goto_1
if ( v0 != null) { // if-eqz v0, :cond_1b
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/c/b;->ac:Z */
/* if-nez v0, :cond_4 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "LEVEL"; // const-string v2, "LEVEL"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v2, p0, Lcom/doodle/ltcsmyb/c/b;->ad:I */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.FlurryAgent .c ( v0 );
/* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/c/b;->ac:Z */
/* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/c/b;->I:Z */
(( com.doodle.ltcsmyb.c.b ) p0 ).c ( ); // invoke-virtual {p0}, Lcom/doodle/ltcsmyb/c/b;->c()V
java.lang.System .currentTimeMillis ( );
/* move-result-wide v2 */
/* sget-wide v4, Lcom/doodle/ltcsmyb/c/b;->U:J */
/* sub-long/2addr v2, v4 */
v0 = this.K;
(( com.doodle.ltcsmyb.a ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a;->c()Lcom/doodle/ltcsmyb/MainActivity;
com.doodle.ltcsmyb.a.a .a ( v0 );
/* iget v4, p0, Lcom/doodle/ltcsmyb/c/b;->ad:I */
/* sub-int/2addr v4, v1 */
v0 = (( com.doodle.ltcsmyb.a.a ) v0 ).a ( v4 ); // invoke-virtual {v0, v4}, Lcom/doodle/ltcsmyb/a/a;->a(I)I
v4 = this.K;
(( com.doodle.ltcsmyb.a ) v4 ).c ( ); // invoke-virtual {v4}, Lcom/doodle/ltcsmyb/a;->c()Lcom/doodle/ltcsmyb/MainActivity;
com.doodle.ltcsmyb.a.a .a ( v4 );
/* iget v5, p0, Lcom/doodle/ltcsmyb/c/b;->ad:I */
/* sub-int/2addr v5, v1 */
v12 = (( com.doodle.ltcsmyb.a.a ) v4 ).b ( v5 ); // invoke-virtual {v4, v5}, Lcom/doodle/ltcsmyb/a/a;->b(I)I
/* iget v5, p0, Lcom/doodle/ltcsmyb/c/b;->T:I */
/* const-wide/16 v8, 0x7530 */
/* cmp-long v4, v2, v8 */
/* if-gez v4, :cond_15 */
/* const-wide/16 v8, 0x7530 */
/* sub-long v2, v8, v2 */
/* const-wide/16 v8, 0xc8 */
/* div-long/2addr v2, v8 */
/* long-to-int v2, v2 */
/* iput v2, p0, Lcom/doodle/ltcsmyb/c/b;->Y:I */
/* iget v2, p0, Lcom/doodle/ltcsmyb/c/b;->Y:I */
/* if-le v2, v10, :cond_2 */
/* iput v10, p0, Lcom/doodle/ltcsmyb/c/b;->Y:I */
} // :cond_2
} // :goto_2
v2 = this.K;
v2 = (( com.doodle.ltcsmyb.a ) v2 ).k ( ); // invoke-virtual {v2}, Lcom/doodle/ltcsmyb/a;->k()I
/* iput v2, p0, Lcom/doodle/ltcsmyb/c/b;->X:I */
/* mul-int/lit8 v2, v5, 0x64 */
/* iput v2, p0, Lcom/doodle/ltcsmyb/c/b;->W:I */
/* iget v2, p0, Lcom/doodle/ltcsmyb/c/b;->Y:I */
/* iget v3, p0, Lcom/doodle/ltcsmyb/c/b;->W:I */
/* add-int/2addr v2, v3 */
/* iget v3, p0, Lcom/doodle/ltcsmyb/c/b;->X:I */
/* add-int/2addr v2, v3 */
/* iput v2, p0, Lcom/doodle/ltcsmyb/c/b;->V:I */
v2 = this.K;
(( com.doodle.ltcsmyb.a ) v2 ).b ( v7 ); // invoke-virtual {v2, v7}, Lcom/doodle/ltcsmyb/a;->b(I)V
v2 = this.K;
(( com.doodle.ltcsmyb.a ) v2 ).l ( ); // invoke-virtual {v2}, Lcom/doodle/ltcsmyb/a;->l()V
v2 = this.K;
(( com.doodle.ltcsmyb.a ) v2 ).b ( ); // invoke-virtual {v2}, Lcom/doodle/ltcsmyb/a;->b()V
/* iget v2, p0, Lcom/doodle/ltcsmyb/c/b;->V:I */
/* if-le v2, v0, :cond_16 */
v0 = this.K;
/* iget v2, p0, Lcom/doodle/ltcsmyb/c/b;->X:I */
/* iget v3, p0, Lcom/doodle/ltcsmyb/c/b;->W:I */
/* iget v4, p0, Lcom/doodle/ltcsmyb/c/b;->Y:I */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyb/a;->a(ZIIII)V */
v0 = this.K;
(( com.doodle.ltcsmyb.a ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a;->c()Lcom/doodle/ltcsmyb/MainActivity;
com.doodle.ltcsmyb.a.a .a ( v0 );
/* iget v2, p0, Lcom/doodle/ltcsmyb/c/b;->ad:I */
/* sub-int/2addr v2, v1 */
/* iget v3, p0, Lcom/doodle/ltcsmyb/c/b;->V:I */
(( com.doodle.ltcsmyb.a.a ) v0 ).a ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Lcom/doodle/ltcsmyb/a/a;->a(II)V
} // :goto_3
v0 = this.K;
(( com.doodle.ltcsmyb.a ) v0 ).j ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a;->j()V
v0 = this.K;
/* const v2, 0x7f0901cc */
(( com.doodle.ltcsmyb.a ) v0 ).d ( v2 ); // invoke-virtual {v0, v2}, Lcom/doodle/ltcsmyb/a;->d(I)V
v0 = this.K;
(( com.doodle.ltcsmyb.a ) v0 ).h ( v5 ); // invoke-virtual {v0, v5}, Lcom/doodle/ltcsmyb/a;->h(I)V
v0 = this.K;
(( com.doodle.ltcsmyb.a ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a;->a()V
/* if-le v5, v12, :cond_3 */
v0 = this.K;
(( com.doodle.ltcsmyb.a ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a;->c()Lcom/doodle/ltcsmyb/MainActivity;
com.doodle.ltcsmyb.a.a .a ( v0 );
/* iget v2, p0, Lcom/doodle/ltcsmyb/c/b;->ad:I */
/* sub-int/2addr v2, v1 */
(( com.doodle.ltcsmyb.a.a ) v0 ).b ( v2, v5 ); // invoke-virtual {v0, v2, v5}, Lcom/doodle/ltcsmyb/a/a;->b(II)V
} // :cond_3
/* iget v0, p0, Lcom/doodle/ltcsmyb/c/b;->ad:I */
/* if-ge v0, v13, :cond_17 */
v0 = this.K;
(( com.doodle.ltcsmyb.a ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a;->c()Lcom/doodle/ltcsmyb/MainActivity;
/* const v2, 0x7f09011b */
(( com.doodle.ltcsmyb.MainActivity ) v0 ).c ( v2 ); // invoke-virtual {v0, v2}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
} // :goto_4
/* iget v0, p0, Lcom/doodle/ltcsmyb/c/b;->ad:I */
/* rem-int/lit8 v0, v0, 0x5 */
/* if-nez v0, :cond_18 */
v0 = this.K;
(( com.doodle.ltcsmyb.a ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a;->c()Lcom/doodle/ltcsmyb/MainActivity;
(( com.doodle.ltcsmyb.MainActivity ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodle/ltcsmyb/MainActivity;->a(Z)V
} // :goto_5
/* iget v0, p0, Lcom/doodle/ltcsmyb/c/b;->ad:I */
/* const/16 v1, 0x64 */
/* if-ne v0, v1, :cond_19 */
v0 = this.K;
(( com.doodle.ltcsmyb.a ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a;->c()Lcom/doodle/ltcsmyb/MainActivity;
com.doodle.ltcsmyb.a.a .a ( v0 );
v0 = (( com.doodle.ltcsmyb.a.a ) v0 ).g ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->g()Z
if ( v0 != null) { // if-eqz v0, :cond_19
v0 = this.K;
(( com.doodle.ltcsmyb.a ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a;->c()Lcom/doodle/ltcsmyb/MainActivity;
/* const v1, 0x7f090120 */
(( com.doodle.ltcsmyb.MainActivity ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
v0 = this.K;
(( com.doodle.ltcsmyb.a ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a;->c()Lcom/doodle/ltcsmyb/MainActivity;
/* const v1, 0x7f090092 */
(( com.doodle.ltcsmyb.MainActivity ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodle/ltcsmyb/MainActivity;->b(I)V
v0 = this.K;
(( com.doodle.ltcsmyb.a ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a;->c()Lcom/doodle/ltcsmyb/MainActivity;
com.doodle.ltcsmyb.a.a .a ( v0 );
(( com.doodle.ltcsmyb.a.a ) v0 ).k ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->k()V
} // :cond_4
} // :goto_6
return;
} // :cond_5
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/c/b;->b:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iput-boolean v7, p0, Lcom/doodle/ltcsmyb/c/b;->b:Z */
v0 = this.K;
(( com.doodle.ltcsmyb.a ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a;->c()Lcom/doodle/ltcsmyb/MainActivity;
com.doodle.ltcsmyb.a.a .a ( v0 );
v0 = (( com.doodle.ltcsmyb.a.a ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->c()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.K;
(( com.doodle.ltcsmyb.a ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a;->c()Lcom/doodle/ltcsmyb/MainActivity;
com.doodle.ltcsmyb.d.f .a ( v0 );
final String v2 = "background"; // const-string v2, "background"
(( com.doodle.ltcsmyb.d.f ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lcom/doodle/ltcsmyb/d/f;->a(Ljava/lang/String;)V
/* goto/16 :goto_0 */
} // :cond_6
/* if-nez v0, :cond_14 */
/* if-nez v2, :cond_14 */
/* if-nez v3, :cond_14 */
/* move v2, v7 */
} // :goto_7
v0 = this.f;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* if-ge v2, v0, :cond_9 */
v0 = this.f;
(( java.util.ArrayList ) v0 ).get ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/badlogic/gdx/physics/box2d/Body; */
v0 = (( com.badlogic.gdx.physics.box2d.Body ) v0 ).isAwake ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/Body;->isAwake()Z
if ( v0 != null) { // if-eqz v0, :cond_8
/* move v0, v7 */
} // :goto_8
if ( v0 != null) { // if-eqz v0, :cond_c
/* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/c/b;->G:Z */
} // :cond_7
} // :goto_9
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/c/b;->G:Z */
/* goto/16 :goto_1 */
} // :cond_8
/* add-int/lit8 v0, v2, 0x1 */
/* move v2, v0 */
} // :cond_9
/* move v2, v7 */
} // :goto_a
v0 = this.h;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* if-ge v2, v0, :cond_b */
v0 = this.h;
(( java.util.ArrayList ) v0 ).get ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/badlogic/gdx/physics/box2d/Body; */
v0 = (( com.badlogic.gdx.physics.box2d.Body ) v0 ).isAwake ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/Body;->isAwake()Z
if ( v0 != null) { // if-eqz v0, :cond_a
/* move v0, v7 */
} // :cond_a
/* add-int/lit8 v0, v2, 0x1 */
/* move v2, v0 */
} // :cond_b
/* move v0, v1 */
} // :cond_c
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/c/b;->Q:Z */
if ( v0 != null) { // if-eqz v0, :cond_d
/* iput-boolean v7, p0, Lcom/doodle/ltcsmyb/c/b;->Q:Z */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v2 */
/* iput-wide v2, p0, Lcom/doodle/ltcsmyb/c/b;->P:J */
/* iput v7, p0, Lcom/doodle/ltcsmyb/c/b;->ab:I */
} // :cond_d
java.lang.System .currentTimeMillis ( );
/* move-result-wide v2 */
/* iget-wide v4, p0, Lcom/doodle/ltcsmyb/c/b;->P:J */
/* sub-long/2addr v2, v4 */
/* const-wide/16 v4, 0x4e20 */
/* cmp-long v0, v2, v4 */
/* if-lez v0, :cond_e */
/* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/c/b;->G:Z */
} // :cond_e
java.lang.System .currentTimeMillis ( );
/* move-result-wide v2 */
/* iget-wide v4, p0, Lcom/doodle/ltcsmyb/c/b;->P:J */
/* sub-long/2addr v2, v4 */
/* const-wide/16 v4, 0x3e8 */
/* cmp-long v0, v2, v4 */
/* if-lez v0, :cond_7 */
v0 = this.m;
(( com.badlogic.gdx.physics.box2d.World ) v0 ).getBodies ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/World;->getBodies()Ljava/util/Iterator;
/* move v3, v7 */
v0 = } // :goto_b
if ( v0 != null) { // if-eqz v0, :cond_12
/* check-cast v0, Lcom/badlogic/gdx/physics/box2d/Body; */
(( com.badlogic.gdx.physics.box2d.Body ) v0 ).getPosition ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/Body;->getPosition()Lcom/badlogic/gdx/math/Vector2;
/* iget v4, v4, Lcom/badlogic/gdx/math/Vector2;->y:F */
v5 = this.Z;
/* iget v6, p0, Lcom/doodle/ltcsmyb/c/b;->ab:I */
/* add-int/lit8 v6, v6, 0xa */
/* rem-int/lit8 v6, v6, 0xa */
/* aget-object v5, v5, v6 */
/* aget v5, v5, v3 */
/* sub-float/2addr v4, v5 */
v4 = java.lang.Math .abs ( v4 );
/* cmpl-float v4, v4, v8 */
/* if-lez v4, :cond_f */
v2 = this.Z;
/* iget v4, p0, Lcom/doodle/ltcsmyb/c/b;->ab:I */
/* aget-object v2, v2, v4 */
(( com.badlogic.gdx.physics.box2d.Body ) v0 ).getPosition ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/Body;->getPosition()Lcom/badlogic/gdx/math/Vector2;
/* iget v0, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* aput v0, v2, v3 */
/* move v0, v7 */
/* goto/16 :goto_1 */
} // :cond_f
(( com.badlogic.gdx.physics.box2d.Body ) v0 ).getPosition ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/Body;->getPosition()Lcom/badlogic/gdx/math/Vector2;
/* iget v4, v4, Lcom/badlogic/gdx/math/Vector2;->x:F */
v5 = this.aa;
/* iget v6, p0, Lcom/doodle/ltcsmyb/c/b;->ab:I */
/* add-int/lit8 v6, v6, 0xa */
/* rem-int/lit8 v6, v6, 0xa */
/* aget-object v5, v5, v6 */
/* aget v5, v5, v3 */
/* sub-float/2addr v4, v5 */
v4 = java.lang.Math .abs ( v4 );
/* cmpl-float v4, v4, v8 */
/* if-lez v4, :cond_10 */
v2 = this.aa;
/* iget v4, p0, Lcom/doodle/ltcsmyb/c/b;->ab:I */
/* aget-object v2, v2, v4 */
(( com.badlogic.gdx.physics.box2d.Body ) v0 ).getPosition ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/Body;->getPosition()Lcom/badlogic/gdx/math/Vector2;
/* iget v0, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* aput v0, v2, v3 */
/* move v0, v7 */
/* goto/16 :goto_1 */
} // :cond_10
/* add-int/lit8 v0, v3, 0x1 */
/* iget v3, p0, Lcom/doodle/ltcsmyb/c/b;->ab:I */
/* add-int/lit8 v3, v3, 0x1 */
/* iput v3, p0, Lcom/doodle/ltcsmyb/c/b;->ab:I */
/* iget v3, p0, Lcom/doodle/ltcsmyb/c/b;->ab:I */
/* const/16 v4, 0x9 */
/* if-le v3, v4, :cond_11 */
/* iput v7, p0, Lcom/doodle/ltcsmyb/c/b;->ab:I */
} // :cond_11
/* move v3, v0 */
} // :cond_12
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/c/b;->R:Z */
/* if-nez v0, :cond_7 */
v0 = this.m;
(( com.badlogic.gdx.physics.box2d.World ) v0 ).getBodies ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/World;->getBodies()Ljava/util/Iterator;
v0 = } // :goto_c
if ( v0 != null) { // if-eqz v0, :cond_13
/* check-cast v0, Lcom/badlogic/gdx/physics/box2d/Body; */
(( com.badlogic.gdx.physics.box2d.Body ) v0 ).setAwake ( v7 ); // invoke-virtual {v0, v7}, Lcom/badlogic/gdx/physics/box2d/Body;->setAwake(Z)V
} // :cond_13
/* move v0, v1 */
/* goto/16 :goto_1 */
} // :cond_14
/* iput-boolean v7, p0, Lcom/doodle/ltcsmyb/c/b;->G:Z */
/* goto/16 :goto_9 */
} // :cond_15
/* iput v7, p0, Lcom/doodle/ltcsmyb/c/b;->Y:I */
/* goto/16 :goto_2 */
} // :cond_16
v2 = this.K;
(( com.doodle.ltcsmyb.a ) v2 ).a ( v0 ); // invoke-virtual {v2, v0}, Lcom/doodle/ltcsmyb/a;->a(I)V
v6 = this.K;
/* iget v8, p0, Lcom/doodle/ltcsmyb/c/b;->X:I */
/* iget v9, p0, Lcom/doodle/ltcsmyb/c/b;->W:I */
/* iget v10, p0, Lcom/doodle/ltcsmyb/c/b;->Y:I */
/* move v11, v5 */
/* invoke-virtual/range {v6 ..v11}, Lcom/doodle/ltcsmyb/a;->a(ZIIII)V */
/* goto/16 :goto_3 */
} // :cond_17
v0 = this.K;
(( com.doodle.ltcsmyb.a ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a;->c()Lcom/doodle/ltcsmyb/MainActivity;
/* const v2, 0x7f09011d */
(( com.doodle.ltcsmyb.MainActivity ) v0 ).c ( v2 ); // invoke-virtual {v0, v2}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
/* goto/16 :goto_4 */
} // :cond_18
v0 = this.K;
(( com.doodle.ltcsmyb.a ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a;->c()Lcom/doodle/ltcsmyb/MainActivity;
(( com.doodle.ltcsmyb.MainActivity ) v0 ).a ( v7 ); // invoke-virtual {v0, v7}, Lcom/doodle/ltcsmyb/MainActivity;->a(Z)V
/* goto/16 :goto_5 */
} // :cond_19
/* iget v0, p0, Lcom/doodle/ltcsmyb/c/b;->ad:I */
/* const/16 v1, 0x7d */
/* if-ne v0, v1, :cond_1a */
v0 = this.K;
(( com.doodle.ltcsmyb.a ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a;->c()Lcom/doodle/ltcsmyb/MainActivity;
com.doodle.ltcsmyb.a.a .a ( v0 );
v0 = (( com.doodle.ltcsmyb.a.a ) v0 ).h ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->h()Z
if ( v0 != null) { // if-eqz v0, :cond_1a
v0 = this.K;
(( com.doodle.ltcsmyb.a ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a;->c()Lcom/doodle/ltcsmyb/MainActivity;
/* const v1, 0x7f090121 */
(( com.doodle.ltcsmyb.MainActivity ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
v0 = this.K;
(( com.doodle.ltcsmyb.a ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a;->c()Lcom/doodle/ltcsmyb/MainActivity;
/* const v1, 0x7f090095 */
(( com.doodle.ltcsmyb.MainActivity ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodle/ltcsmyb/MainActivity;->b(I)V
v0 = this.K;
(( com.doodle.ltcsmyb.a ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a;->c()Lcom/doodle/ltcsmyb/MainActivity;
com.doodle.ltcsmyb.a.a .a ( v0 );
(( com.doodle.ltcsmyb.a.a ) v0 ).l ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->l()V
/* goto/16 :goto_6 */
} // :cond_1a
v0 = this.K;
(( com.doodle.ltcsmyb.a ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a;->c()Lcom/doodle/ltcsmyb/MainActivity;
/* const v1, 0x7f09012c */
(( com.doodle.ltcsmyb.MainActivity ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
v0 = this.K;
(( com.doodle.ltcsmyb.a ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a;->c()Lcom/doodle/ltcsmyb/MainActivity;
/* const v1, 0x7f090098 */
(( com.doodle.ltcsmyb.MainActivity ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodle/ltcsmyb/MainActivity;->b(I)V
/* goto/16 :goto_6 */
} // :cond_1b
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/c/b;->F:Z */
if ( v0 != null) { // if-eqz v0, :cond_1c
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/c/b;->G:Z */
/* if-nez v0, :cond_1c */
v0 = this.K;
(( com.doodle.ltcsmyb.a ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a;->c()Lcom/doodle/ltcsmyb/MainActivity;
(( com.doodle.ltcsmyb.MainActivity ) v0 ).h ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/MainActivity;->h()Lcom/doodlemobile/basket/ui/a/p;
/* if-nez v0, :cond_1c */
/* iget v0, p0, Lcom/doodle/ltcsmyb/c/b;->T:I */
/* if-gtz v0, :cond_1c */
/* move v0, v1 */
} // :goto_d
if ( v0 != null) { // if-eqz v0, :cond_1e
/* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/c/b;->I:Z */
/* iget v0, p0, Lcom/doodle/ltcsmyb/c/b;->ad:I */
/* if-ge v0, v13, :cond_1d */
v0 = this.K;
(( com.doodle.ltcsmyb.a ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a;->c()Lcom/doodle/ltcsmyb/MainActivity;
/* const v1, 0x7f09011a */
(( com.doodle.ltcsmyb.MainActivity ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
} // :goto_e
(( com.doodle.ltcsmyb.c.b ) p0 ).c ( ); // invoke-virtual {p0}, Lcom/doodle/ltcsmyb/c/b;->c()V
(( com.doodle.ltcsmyb.c.b ) p0 ).f ( ); // invoke-virtual {p0}, Lcom/doodle/ltcsmyb/c/b;->f()V
/* goto/16 :goto_6 */
} // :cond_1c
/* move v0, v7 */
} // :cond_1d
v0 = this.K;
(( com.doodle.ltcsmyb.a ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a;->c()Lcom/doodle/ltcsmyb/MainActivity;
/* const v1, 0x7f090119 */
(( com.doodle.ltcsmyb.MainActivity ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
} // :cond_1e
/* move v1, v7 */
} // :goto_f
v0 = this.d;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* if-ge v1, v0, :cond_4 */
v0 = this.d;
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
if ( v0 != null) { // if-eqz v0, :cond_1f
v0 = this.d;
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/doodle/ltcsmyb/a/b; */
(( com.doodle.ltcsmyb.a.b ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/b;->a()V
} // :goto_10
/* add-int/lit8 v0, v1, 0x1 */
/* move v1, v0 */
} // :cond_1f
v0 = this.d;
(( java.util.ArrayList ) v0 ).remove ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
} // .end method
public final void e ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodle/ltcsmyb/c/b;->ad:I */
/* add-int/lit8 v0, v0, 0x1 */
/* rem-int/lit8 v0, v0, 0x7d */
/* iput v0, p0, Lcom/doodle/ltcsmyb/c/b;->ad:I */
/* iget v0, p0, Lcom/doodle/ltcsmyb/c/b;->ad:I */
/* if-nez v0, :cond_0 */
/* const/16 v0, 0x7d */
/* iput v0, p0, Lcom/doodle/ltcsmyb/c/b;->ad:I */
} // :cond_0
(( com.doodle.ltcsmyb.c.b ) p0 ).f ( ); // invoke-virtual {p0}, Lcom/doodle/ltcsmyb/c/b;->f()V
return;
} // .end method
public final void f ( ) {
/* .locals 2 */
v0 = this.K;
(( com.doodle.ltcsmyb.a ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a;->c()Lcom/doodle/ltcsmyb/MainActivity;
/* const v1, 0x7f090128 */
(( com.doodle.ltcsmyb.MainActivity ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
v0 = this.K;
(( com.doodle.ltcsmyb.a ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a;->c()Lcom/doodle/ltcsmyb/MainActivity;
/* const v1, 0x7f090129 */
(( com.doodle.ltcsmyb.MainActivity ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
return;
} // .end method
public final Integer g ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodle/ltcsmyb/c/b;->ad:I */
} // .end method
public final Integer h ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodle/ltcsmyb/c/b;->V:I */
} // .end method
public final void i ( ) {
/* .locals 2 */
v0 = this.m;
(( com.badlogic.gdx.physics.box2d.World ) v0 ).getBodies ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/World;->getBodies()Ljava/util/Iterator;
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* check-cast p0, Lcom/badlogic/gdx/physics/box2d/Body; */
int v1 = 1; // const/4 v1, 0x1
(( com.badlogic.gdx.physics.box2d.Body ) p0 ).setActive ( v1 ); // invoke-virtual {p0, v1}, Lcom/badlogic/gdx/physics/box2d/Body;->setActive(Z)V
} // :cond_0
return;
} // .end method
public final void j ( ) {
/* .locals 2 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/doodle/ltcsmyb/c/b;->R:Z */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v0 */
/* iput-wide v0, p0, Lcom/doodle/ltcsmyb/c/b;->S:J */
return;
} // .end method
public final void k ( ) {
/* .locals 2 */
v0 = this.m;
(( com.badlogic.gdx.physics.box2d.World ) v0 ).getBodies ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/World;->getBodies()Ljava/util/Iterator;
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* check-cast p0, Lcom/badlogic/gdx/physics/box2d/Body; */
int v1 = 0; // const/4 v1, 0x0
(( com.badlogic.gdx.physics.box2d.Body ) p0 ).setActive ( v1 ); // invoke-virtual {p0, v1}, Lcom/badlogic/gdx/physics/box2d/Body;->setActive(Z)V
} // :cond_0
return;
} // .end method
public final void n ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/c/b;->R:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
(( com.doodle.ltcsmyb.c.b ) p0 ).k ( ); // invoke-virtual {p0}, Lcom/doodle/ltcsmyb/c/b;->k()V
} // :cond_0
return;
} // .end method
public final void o ( ) {
/* .locals 2 */
/* iget v0, p0, Lcom/doodle/ltcsmyb/c/b;->T:I */
int v1 = 1; // const/4 v1, 0x1
/* sub-int/2addr v0, v1 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/c/b;->T:I */
v0 = this.K;
/* iget v1, p0, Lcom/doodle/ltcsmyb/c/b;->T:I */
(( com.doodle.ltcsmyb.a ) v0 ).g ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodle/ltcsmyb/a;->g(I)V
return;
} // .end method
public final void p ( ) {
/* .locals 2 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v0 */
/* iput-wide v0, p0, Lcom/doodle/ltcsmyb/c/b;->c:J */
return;
} // .end method
public final void q ( ) {
/* .locals 6 */
/* iget-wide v0, p0, Lcom/doodle/ltcsmyb/c/b;->P:J */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v2 */
/* iget-wide v4, p0, Lcom/doodle/ltcsmyb/c/b;->c:J */
/* sub-long/2addr v2, v4 */
/* add-long/2addr v0, v2 */
/* iput-wide v0, p0, Lcom/doodle/ltcsmyb/c/b;->P:J */
return;
} // .end method
public final void r ( ) {
/* .locals 4 */
v0 = this.e;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
v0 = this.f;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
v0 = this.g;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
v0 = this.h;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
v0 = this.i;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
v0 = this.m;
(( com.badlogic.gdx.physics.box2d.World ) v0 ).getBodies ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/World;->getBodies()Ljava/util/Iterator;
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_0
/* check-cast v0, Lcom/badlogic/gdx/physics/box2d/Body; */
(( com.badlogic.gdx.physics.box2d.Body ) v0 ).getUserData ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/Body;->getUserData()Ljava/lang/Object;
/* check-cast v1, Lcom/doodlemobile/basket/game2d/a; */
(( com.doodlemobile.basket.game2d.a ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/doodlemobile/basket/game2d/a;->c()V
v3 = this.n;
(( com.doodlemobile.basket.game2d.c ) v3 ).b ( v1 ); // invoke-virtual {v3, v1}, Lcom/doodlemobile/basket/game2d/c;->b(Lcom/doodlemobile/basket/game2d/a;)V
v1 = this.m;
(( com.badlogic.gdx.physics.box2d.World ) v1 ).destroyBody ( v0 ); // invoke-virtual {v1, v0}, Lcom/badlogic/gdx/physics/box2d/World;->destroyBody(Lcom/badlogic/gdx/physics/box2d/Body;)V
} // :cond_0
v0 = this.q;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.n;
v1 = this.q;
(( com.doodlemobile.basket.game2d.c ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/game2d/c;->b(Lcom/doodlemobile/basket/game2d/a;)V
} // :cond_1
v0 = this.r;
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.n;
v1 = this.r;
(( com.doodlemobile.basket.game2d.c ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/game2d/c;->b(Lcom/doodlemobile/basket/game2d/a;)V
} // :cond_2
v0 = this.s;
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = this.n;
v1 = this.s;
(( com.doodlemobile.basket.game2d.c ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/game2d/c;->b(Lcom/doodlemobile/basket/game2d/a;)V
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
} // :goto_1
v1 = this.m;
v1 = (( com.badlogic.gdx.physics.box2d.World ) v1 ).getBodyCount ( ); // invoke-virtual {v1}, Lcom/badlogic/gdx/physics/box2d/World;->getBodyCount()I
/* if-ge v0, v1, :cond_4 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_4
return;
} // .end method
public final java.util.ArrayList s ( ) {
/* .locals 1 */
v0 = this.e;
} // .end method
public final java.util.ArrayList t ( ) {
/* .locals 1 */
v0 = this.g;
} // .end method
public final java.util.ArrayList u ( ) {
/* .locals 1 */
v0 = this.i;
} // .end method
