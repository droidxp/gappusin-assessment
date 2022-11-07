public class inal extends com.doodlemobile.basket.c.a.b {
	 /* # instance fields */
	 private com.doodlemobile.basket.ui.TextView A;
	 private com.doodlemobile.basket.ui.TextView B;
	 private com.doodlemobile.basket.b.b C;
	 private com.doodlemobile.basket.game2d.c D;
	 private com.doodle.ltcsmyb.MainActivity E;
	 private com.doodlemobile.basket.ui.e F;
	 private Integer G;
	 private Boolean H;
	 private Boolean I;
	 private Integer J;
	 private Integer K;
	 private Boolean L;
	 private Integer M;
	 private Integer N;
	 private Integer O;
	 private Integer P;
	 private Integer Q;
	 private Integer R;
	 private Integer S;
	 private Boolean T;
	 private Boolean U;
	 private Boolean V;
	 private Float W;
	 private Boolean X;
	 private Integer Y;
	 private Long Z;
	 com.doodle.ltcsmyb.c.b a;
	 private Boolean e;
	 private Boolean f;
	 private Boolean g;
	 private Float h;
	 private Float i;
	 private Float j;
	 private Float k;
	 private Float l;
	 private Float m;
	 private final Integer n;
	 private com.doodlemobile.basket.ui.AnimationView o;
	 private com.doodlemobile.basket.ui.AnimationView p;
	 private com.doodlemobile.basket.ui.AnimationView q;
	 private com.doodlemobile.basket.ui.AnimationView r;
	 private com.doodlemobile.basket.ui.AnimationView s;
	 private com.doodlemobile.basket.ui.AnimationView t;
	 private com.doodlemobile.basket.ui.AnimationView u;
	 private com.doodlemobile.basket.ui.AnimationView v;
	 private com.doodlemobile.basket.ui.AnimationView w;
	 private com.doodlemobile.basket.ui.AnimationView x;
	 private com.doodlemobile.basket.ui.TextView y;
	 private com.doodlemobile.basket.ui.TextView z;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 5 */
		 int v2 = 1; // const/4 v2, 0x1
		 int v3 = 0; // const/4 v3, 0x0
		 final String v4 = "0"; // const-string v4, "0"
		 /* invoke-direct {p0, p1}, Lcom/doodlemobile/basket/c/a/b;-><init>(Lcom/doodlemobile/basket/b/b;)V */
		 /* iput-boolean v2, p0, Lcom/doodle/ltcsmyb/a;->e:Z */
		 /* iput-boolean v2, p0, Lcom/doodle/ltcsmyb/a;->f:Z */
		 /* iput-boolean v2, p0, Lcom/doodle/ltcsmyb/a;->g:Z */
		 /* const/16 v0, 0x7d */
		 /* iput v0, p0, Lcom/doodle/ltcsmyb/a;->n:I */
		 /* iput-boolean v3, p0, Lcom/doodle/ltcsmyb/a;->I:Z */
		 this.C = p1;
		 this.E = p3;
		 this.F = p2;
		 /* new-instance v0, Lcom/doodlemobile/basket/game2d/c; */
		 v1 = this.C;
		 /* invoke-direct {v0, v1}, Lcom/doodlemobile/basket/game2d/c;-><init>(Lcom/doodlemobile/basket/b/b;)V */
		 this.D = v0;
		 /* new-array v0, v2, [Lcom/doodlemobile/basket/game2d/h; */
		 v1 = this.D;
		 /* aput-object v1, v0, v3 */
		 (( com.doodle.ltcsmyb.a ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyb/a;->a([Lcom/doodlemobile/basket/game2d/h;)V
		 (( com.doodle.ltcsmyb.a ) p0 ).n ( ); // invoke-virtual {p0}, Lcom/doodle/ltcsmyb/a;->n()Lcom/badlogic/gdx/physics/box2d/World;
		 int v1 = 0; // const/4 v1, 0x0
		 /* const/high16 v2, 0x43160000 # 150.0f */
		 com.badlogic.gdx.math.Vector2 .tmp ( v1,v2 );
		 (( com.badlogic.gdx.physics.box2d.World ) v0 ).setGravity ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/physics/box2d/World;->setGravity(Lcom/badlogic/gdx/math/Vector2;)V
		 /* const/high16 v0, 0x43f00000 # 480.0f */
		 /* const/high16 v1, 0x44480000 # 800.0f */
		 (( com.doodle.ltcsmyb.a ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/doodle/ltcsmyb/a;->a(FF)V
		 /* new-instance v0, Lcom/doodlemobile/basket/game2d/g; */
		 /* invoke-direct {v0, p1}, Lcom/doodlemobile/basket/game2d/g;-><init>(Lcom/doodlemobile/basket/b/b;)V */
		 this.d = v0;
		 (( com.doodle.ltcsmyb.a ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyb/a;->a(Lcom/doodlemobile/basket/game2d/g;)V
		 v0 = this.F;
		 /* const v1, 0x7f09006f */
		 (( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
		 /* check-cast v0, Lcom/doodlemobile/basket/ui/AnimationView; */
		 this.q = v0;
		 v0 = this.F;
		 /* const v1, 0x7f090071 */
		 (( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
		 /* check-cast v0, Lcom/doodlemobile/basket/ui/AnimationView; */
		 this.r = v0;
		 v0 = this.F;
		 /* const v1, 0x7f090072 */
		 (( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
		 /* check-cast v0, Lcom/doodlemobile/basket/ui/AnimationView; */
		 this.s = v0;
		 v0 = this.F;
		 /* const v1, 0x7f09009b */
		 (( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
		 /* check-cast v0, Lcom/doodlemobile/basket/ui/AnimationView; */
		 this.u = v0;
		 v0 = this.F;
		 /* const v1, 0x7f09009d */
		 (( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
		 /* check-cast v0, Lcom/doodlemobile/basket/ui/AnimationView; */
		 this.v = v0;
		 v0 = this.F;
		 /* const v1, 0x7f09009e */
		 (( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
		 /* check-cast v0, Lcom/doodlemobile/basket/ui/AnimationView; */
		 this.w = v0;
		 v0 = this.F;
		 /* const v1, 0x7f090099 */
		 (( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
		 /* check-cast v0, Lcom/doodlemobile/basket/ui/AnimationView; */
		 this.t = v0;
		 v0 = this.F;
		 /* const v1, 0x7f0900a5 */
		 (( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
		 /* check-cast v0, Lcom/doodlemobile/basket/ui/AnimationView; */
		 this.o = v0;
		 v0 = this.F;
		 /* const v1, 0x7f0900a7 */
		 (( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
		 /* check-cast v0, Lcom/doodlemobile/basket/ui/AnimationView; */
		 this.p = v0;
		 v0 = this.F;
		 /* const v1, 0x7f0900a3 */
		 (( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
		 /* check-cast v0, Lcom/doodlemobile/basket/ui/TextView; */
		 this.z = v0;
		 v0 = this.F;
		 /* const v1, 0x7f0900a8 */
		 (( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
		 /* check-cast v0, Lcom/doodlemobile/basket/ui/TextView; */
		 this.A = v0;
		 v0 = this.F;
		 /* const v1, 0x7f090074 */
		 (( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
		 /* check-cast v0, Lcom/doodlemobile/basket/ui/TextView; */
		 this.y = v0;
		 v0 = this.F;
		 /* const v1, 0x7f09006d */
		 (( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
		 /* check-cast v0, Lcom/doodlemobile/basket/ui/TextView; */
		 this.B = v0;
		 v0 = this.F;
		 /* const v1, 0x7f0900a0 */
		 (( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
		 /* check-cast v0, Lcom/doodlemobile/basket/ui/AnimationView; */
		 this.x = v0;
		 v0 = this.y;
		 final String v1 = "0"; // const-string v1, "0"
		 (( com.doodlemobile.basket.ui.TextView ) v0 ).a ( v4 ); // invoke-virtual {v0, v4}, Lcom/doodlemobile/basket/ui/TextView;->a(Ljava/lang/CharSequence;)V
		 v0 = this.A;
		 final String v1 = "0"; // const-string v1, "0"
		 (( com.doodlemobile.basket.ui.TextView ) v0 ).a ( v4 ); // invoke-virtual {v0, v4}, Lcom/doodlemobile/basket/ui/TextView;->a(Ljava/lang/CharSequence;)V
		 v0 = this.z;
		 final String v1 = "0"; // const-string v1, "0"
		 (( com.doodlemobile.basket.ui.TextView ) v0 ).a ( v4 ); // invoke-virtual {v0, v4}, Lcom/doodlemobile/basket/ui/TextView;->a(Ljava/lang/CharSequence;)V
		 /* iput v3, p0, Lcom/doodle/ltcsmyb/a;->G:I */
		 /* iput-boolean v3, p0, Lcom/doodle/ltcsmyb/a;->H:Z */
		 v0 = this.a;
		 /* if-nez v0, :cond_0 */
		 v0 = 		 com.doodle.ltcsmyb.MainActivity .r ( );
		 /* rem-int/lit8 v0, v0, 0x7d */
		 /* add-int/lit8 v0, v0, 0x1 */
		 /* new-instance v1, Lcom/doodle/ltcsmyb/c/b; */
		 /* invoke-direct {v1, p0, v0}, Lcom/doodle/ltcsmyb/c/b;-><init>(Lcom/doodle/ltcsmyb/a;I)V */
		 this.a = v1;
	 } // :cond_0
	 return;
} // .end method
private void a ( Float p0 ) {
	 /* .locals 1 */
	 v0 = this.o;
	 (( com.doodlemobile.basket.ui.AnimationView ) v0 ).a_ ( p1 ); // invoke-virtual {v0, p1}, Lcom/doodlemobile/basket/ui/AnimationView;->a_(F)V
	 return;
} // .end method
private void b ( Float p0 ) {
	 /* .locals 1 */
	 v0 = this.p;
	 (( com.doodlemobile.basket.ui.AnimationView ) v0 ).a_ ( p1 ); // invoke-virtual {v0, p1}, Lcom/doodlemobile/basket/ui/AnimationView;->a_(F)V
	 v0 = this.A;
	 (( com.doodlemobile.basket.ui.TextView ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lcom/doodlemobile/basket/ui/TextView;->b(F)V
	 return;
} // .end method
private void o ( ) {
	 /* .locals 2 */
	 int v1 = 1; // const/4 v1, 0x1
	 v0 = this.q;
	 (( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Z)V
	 v0 = this.r;
	 (( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Z)V
	 v0 = this.s;
	 (( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Z)V
	 int v0 = 0; // const/4 v0, 0x0
	 /* iput v0, p0, Lcom/doodle/ltcsmyb/a;->G:I */
	 v0 = this.y;
	 final String v1 = "0"; // const-string v1, "0"
	 (( com.doodlemobile.basket.ui.TextView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/TextView;->a(Ljava/lang/CharSequence;)V
	 return;
} // .end method
private void p ( ) {
	 /* .locals 3 */
	 /* iget v0, p0, Lcom/doodle/ltcsmyb/a;->G:I */
	 /* const/16 v1, 0x64 */
	 /* if-ge v0, v1, :cond_0 */
	 v0 = this.y;
	 (( com.doodlemobile.basket.ui.TextView ) v0 ).s ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/TextView;->s()Lcom/doodlemobile/basket/ui/b;
	 /* const/high16 v1, -0x3d1a0000 # -115.0f */
	 /* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
} // :goto_0
v0 = this.y;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = ""; // const-string v2, ""
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v2, p0, Lcom/doodle/ltcsmyb/a;->G:I */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.doodlemobile.basket.ui.TextView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/TextView;->a(Ljava/lang/CharSequence;)V
return;
} // :cond_0
v0 = this.y;
(( com.doodlemobile.basket.ui.TextView ) v0 ).s ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/TextView;->s()Lcom/doodlemobile/basket/ui/b;
/* const/high16 v1, -0x3d2e0000 # -105.0f */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
} // .end method
/* # virtual methods */
public final void a ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/doodle/ltcsmyb/a;->e:Z */
/* iput-boolean v0, p0, Lcom/doodle/ltcsmyb/a;->f:Z */
/* iput-boolean v0, p0, Lcom/doodle/ltcsmyb/a;->g:Z */
return;
} // .end method
public final void a ( Integer p0 ) {
/* .locals 3 */
v0 = this.A;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = ""; // const-string v2, ""
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.doodlemobile.basket.ui.TextView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/TextView;->a(Ljava/lang/CharSequence;)V
return;
} // .end method
public final void a ( Long p0 ) {
/* .locals 8 */
/* const-wide v6, 0x4094500000000000L # 1300.0 */
/* const/high16 v3, 0x3f000000 # 0.5f */
/* const v2, 0x3dcccccd # 0.1f */
int v5 = 0; // const/4 v5, 0x0
int v4 = 1; // const/4 v4, 0x1
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/a;->H:Z */
/* if-nez v0, :cond_9 */
try { // :try_start_0
/* invoke-super {p0, p1, p2}, Lcom/doodlemobile/basket/c/a/b;->a(J)V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
(( com.doodle.ltcsmyb.c.b ) v0 ).d ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/c/b;->d()V
} // :cond_0
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/a;->X:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/a;->e:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/a;->e:Z */
	 v0 = this.E;
	 com.doodle.ltcsmyb.a.a .a ( v0 );
	 v0 = 	 (( com.doodle.ltcsmyb.a.a ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->b()Z
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 v0 = this.E;
		 com.doodle.ltcsmyb.d.f .a ( v0 );
		 /* const/16 v1, 0x73 */
		 (( com.doodle.ltcsmyb.d.f ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodle/ltcsmyb/d/f;->a(I)V
	 } // :cond_1
	 /* iget v0, p0, Lcom/doodle/ltcsmyb/a;->Q:I */
	 /* add-int/lit8 v0, v0, 0x1 */
	 /* iput v0, p0, Lcom/doodle/ltcsmyb/a;->Q:I */
	 /* iget v0, p0, Lcom/doodle/ltcsmyb/a;->Q:I */
	 /* const/16 v1, 0x14 */
	 /* if-gt v0, v1, :cond_2 */
	 /* iget v0, p0, Lcom/doodle/ltcsmyb/a;->Q:I */
	 /* if-lez v0, :cond_2 */
	 /* iget v0, p0, Lcom/doodle/ltcsmyb/a;->Q:I */
	 /* if-ne v0, v4, :cond_a */
	 /* iput v3, p0, Lcom/doodle/ltcsmyb/a;->h:F */
	 /* iput v3, p0, Lcom/doodle/ltcsmyb/a;->k:F */
	 v0 = this.u;
	 /* iget v1, p0, Lcom/doodle/ltcsmyb/a;->h:F */
	 (( com.doodlemobile.basket.ui.AnimationView ) v0 ).a_ ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a_(F)V
	 v0 = this.u;
	 /* iget v1, p0, Lcom/doodle/ltcsmyb/a;->k:F */
	 (( com.doodlemobile.basket.ui.AnimationView ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->c(F)V
	 v0 = this.u;
	 /* const v1, 0x7f09009c */
	 (( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(I)V
} // :cond_2
} // :goto_1
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/a;->I:Z */
if ( v0 != null) { // if-eqz v0, :cond_5
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/a;->f:Z */
if ( v0 != null) { // if-eqz v0, :cond_4
	 /* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/a;->f:Z */
	 v0 = this.E;
	 com.doodle.ltcsmyb.a.a .a ( v0 );
	 v0 = 	 (( com.doodle.ltcsmyb.a.a ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->b()Z
	 if ( v0 != null) { // if-eqz v0, :cond_3
		 v0 = this.E;
		 com.doodle.ltcsmyb.d.f .a ( v0 );
		 /* const/16 v1, 0x74 */
		 (( com.doodle.ltcsmyb.d.f ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodle/ltcsmyb/d/f;->a(I)V
	 } // :cond_3
	 java.lang.System .currentTimeMillis ( );
	 /* move-result-wide v0 */
	 /* iput-wide v0, p0, Lcom/doodle/ltcsmyb/a;->Z:J */
} // :cond_4
/* iget v0, p0, Lcom/doodle/ltcsmyb/a;->K:I */
/* iget v1, p0, Lcom/doodle/ltcsmyb/a;->N:I */
/* if-gt v0, v1, :cond_f */
/* iget v0, p0, Lcom/doodle/ltcsmyb/a;->K:I */
(( com.doodle.ltcsmyb.a ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyb/a;->b(I)V
java.lang.System .currentTimeMillis ( );
/* move-result-wide v0 */
/* iget-wide v2, p0, Lcom/doodle/ltcsmyb/a;->Z:J */
/* sub-long/2addr v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyb/a;->J:I */
/* int-to-long v2, v2 */
/* mul-long/2addr v0, v2 */
/* long-to-float v0, v0 */
/* float-to-double v0, v0 */
/* div-double/2addr v0, v6 */
/* double-to-int v0, v0 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/a;->K:I */
} // :cond_5
} // :goto_2
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/a;->U:Z */
if ( v0 != null) { // if-eqz v0, :cond_6
/* iget v0, p0, Lcom/doodle/ltcsmyb/a;->S:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/a;->S:I */
/* iget v0, p0, Lcom/doodle/ltcsmyb/a;->S:I */
int v1 = 5; // const/4 v1, 0x5
/* if-lt v0, v1, :cond_6 */
/* iget v0, p0, Lcom/doodle/ltcsmyb/a;->K:I */
/* iget v1, p0, Lcom/doodle/ltcsmyb/a;->N:I */
/* iget v2, p0, Lcom/doodle/ltcsmyb/a;->M:I */
/* add-int/2addr v1, v2 */
/* if-ge v0, v1, :cond_10 */
/* iget v0, p0, Lcom/doodle/ltcsmyb/a;->K:I */
(( com.doodle.ltcsmyb.a ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyb/a;->b(I)V
java.lang.System .currentTimeMillis ( );
/* move-result-wide v0 */
/* iget-wide v2, p0, Lcom/doodle/ltcsmyb/a;->Z:J */
/* sub-long/2addr v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyb/a;->J:I */
/* int-to-long v2, v2 */
/* mul-long/2addr v0, v2 */
/* long-to-float v0, v0 */
/* float-to-double v0, v0 */
/* div-double/2addr v0, v6 */
/* double-to-int v0, v0 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/a;->K:I */
} // :cond_6
} // :goto_3
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/a;->T:Z */
if ( v0 != null) { // if-eqz v0, :cond_7
/* iget v0, p0, Lcom/doodle/ltcsmyb/a;->R:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/a;->R:I */
/* iget v0, p0, Lcom/doodle/ltcsmyb/a;->R:I */
int v1 = 5; // const/4 v1, 0x5
/* if-lt v0, v1, :cond_7 */
/* iget v0, p0, Lcom/doodle/ltcsmyb/a;->K:I */
/* iget v1, p0, Lcom/doodle/ltcsmyb/a;->N:I */
/* iget v2, p0, Lcom/doodle/ltcsmyb/a;->M:I */
/* add-int/2addr v1, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyb/a;->O:I */
/* add-int/2addr v1, v2 */
/* if-ge v0, v1, :cond_11 */
/* iget v0, p0, Lcom/doodle/ltcsmyb/a;->K:I */
(( com.doodle.ltcsmyb.a ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyb/a;->b(I)V
java.lang.System .currentTimeMillis ( );
/* move-result-wide v0 */
/* iget-wide v2, p0, Lcom/doodle/ltcsmyb/a;->Z:J */
/* sub-long/2addr v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyb/a;->J:I */
/* int-to-long v2, v2 */
/* mul-long/2addr v0, v2 */
/* long-to-float v0, v0 */
/* float-to-double v0, v0 */
/* div-double/2addr v0, v6 */
/* double-to-int v0, v0 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/a;->K:I */
} // :cond_7
} // :goto_4
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/a;->V:Z */
if ( v0 != null) { // if-eqz v0, :cond_9
/* iget v0, p0, Lcom/doodle/ltcsmyb/a;->W:F */
/* const v1, 0x3fa66666 # 1.3f */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_14 */
/* iget v0, p0, Lcom/doodle/ltcsmyb/a;->W:F */
/* const/high16 v1, 0x3f800000 # 1.0f */
/* cmpl-float v0, v0, v1 */
/* if-ltz v0, :cond_13 */
/* iget v0, p0, Lcom/doodle/ltcsmyb/a;->W:F */
/* const v1, 0x3cf5c28f # 0.03f */
/* sub-float/2addr v0, v1 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/a;->W:F */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/a;->L:Z */
if ( v0 != null) { // if-eqz v0, :cond_12
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/a;->g:Z */
if ( v0 != null) { // if-eqz v0, :cond_8
/* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/a;->g:Z */
v0 = this.E;
com.doodle.ltcsmyb.a.a .a ( v0 );
v0 = (( com.doodle.ltcsmyb.a.a ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_8
v0 = this.E;
com.doodle.ltcsmyb.d.f .a ( v0 );
/* const/16 v1, 0x72 */
(( com.doodle.ltcsmyb.d.f ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodle/ltcsmyb/d/f;->a(I)V
} // :cond_8
/* iget v0, p0, Lcom/doodle/ltcsmyb/a;->W:F */
/* invoke-direct {p0, v0}, Lcom/doodle/ltcsmyb/a;->a(F)V */
v0 = this.o;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v4 ); // invoke-virtual {v0, v4}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Z)V
} // :cond_9
} // :goto_5
return;
/* :catch_0 */
/* move-exception v0 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
/* goto/16 :goto_0 */
} // :cond_a
/* iget v0, p0, Lcom/doodle/ltcsmyb/a;->Q:I */
int v1 = 7; // const/4 v1, 0x7
/* if-ge v0, v1, :cond_b */
/* iget v0, p0, Lcom/doodle/ltcsmyb/a;->h:F */
/* add-float/2addr v0, v2 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/a;->h:F */
/* iget v0, p0, Lcom/doodle/ltcsmyb/a;->k:F */
/* add-float/2addr v0, v2 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/a;->k:F */
v0 = this.u;
/* iget v1, p0, Lcom/doodle/ltcsmyb/a;->h:F */
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a_ ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a_(F)V
v0 = this.u;
/* iget v1, p0, Lcom/doodle/ltcsmyb/a;->k:F */
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->c(F)V
/* goto/16 :goto_1 */
} // :cond_b
/* iget v0, p0, Lcom/doodle/ltcsmyb/a;->Q:I */
int v1 = 7; // const/4 v1, 0x7
/* if-ne v0, v1, :cond_c */
/* iget v0, p0, Lcom/doodle/ltcsmyb/a;->P:I */
/* if-le v0, v4, :cond_2 */
/* iput v3, p0, Lcom/doodle/ltcsmyb/a;->i:F */
/* iput v3, p0, Lcom/doodle/ltcsmyb/a;->l:F */
v0 = this.v;
/* iget v1, p0, Lcom/doodle/ltcsmyb/a;->i:F */
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a_ ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a_(F)V
v0 = this.v;
/* iget v1, p0, Lcom/doodle/ltcsmyb/a;->l:F */
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->c(F)V
v0 = this.v;
/* const v1, 0x7f09009c */
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(I)V
/* goto/16 :goto_1 */
} // :cond_c
/* iget v0, p0, Lcom/doodle/ltcsmyb/a;->Q:I */
/* const/16 v1, 0xd */
/* if-ge v0, v1, :cond_d */
/* iget v0, p0, Lcom/doodle/ltcsmyb/a;->P:I */
/* if-le v0, v4, :cond_2 */
/* iget v0, p0, Lcom/doodle/ltcsmyb/a;->i:F */
/* add-float/2addr v0, v2 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/a;->i:F */
/* iget v0, p0, Lcom/doodle/ltcsmyb/a;->l:F */
/* add-float/2addr v0, v2 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/a;->l:F */
v0 = this.v;
/* iget v1, p0, Lcom/doodle/ltcsmyb/a;->i:F */
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a_ ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a_(F)V
v0 = this.v;
/* iget v1, p0, Lcom/doodle/ltcsmyb/a;->l:F */
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->c(F)V
/* goto/16 :goto_1 */
} // :cond_d
/* iget v0, p0, Lcom/doodle/ltcsmyb/a;->Q:I */
/* const/16 v1, 0xd */
/* if-ne v0, v1, :cond_e */
/* iget v0, p0, Lcom/doodle/ltcsmyb/a;->P:I */
int v1 = 2; // const/4 v1, 0x2
/* if-le v0, v1, :cond_2 */
/* iput v3, p0, Lcom/doodle/ltcsmyb/a;->j:F */
/* iput v3, p0, Lcom/doodle/ltcsmyb/a;->m:F */
v0 = this.w;
/* iget v1, p0, Lcom/doodle/ltcsmyb/a;->j:F */
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a_ ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a_(F)V
v0 = this.w;
/* iget v1, p0, Lcom/doodle/ltcsmyb/a;->m:F */
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->c(F)V
v0 = this.w;
/* const v1, 0x7f09009c */
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(I)V
/* goto/16 :goto_1 */
} // :cond_e
/* iget v0, p0, Lcom/doodle/ltcsmyb/a;->Q:I */
/* const/16 v1, 0x13 */
/* if-ge v0, v1, :cond_2 */
/* iget v0, p0, Lcom/doodle/ltcsmyb/a;->P:I */
int v1 = 2; // const/4 v1, 0x2
/* if-le v0, v1, :cond_2 */
/* iget v0, p0, Lcom/doodle/ltcsmyb/a;->j:F */
/* add-float/2addr v0, v2 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/a;->j:F */
/* iget v0, p0, Lcom/doodle/ltcsmyb/a;->m:F */
/* add-float/2addr v0, v2 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/a;->m:F */
v0 = this.w;
/* iget v1, p0, Lcom/doodle/ltcsmyb/a;->j:F */
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a_ ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a_(F)V
v0 = this.w;
/* iget v1, p0, Lcom/doodle/ltcsmyb/a;->m:F */
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->c(F)V
/* goto/16 :goto_1 */
} // :cond_f
/* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/a;->I:Z */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/a;->U:Z */
/* iget v0, p0, Lcom/doodle/ltcsmyb/a;->N:I */
/* iput v0, p0, Lcom/doodle/ltcsmyb/a;->K:I */
/* const v0, 0x7f0901c9 */
(( com.doodle.ltcsmyb.a ) p0 ).d ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyb/a;->d(I)V
/* goto/16 :goto_2 */
} // :cond_10
/* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/a;->U:Z */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/a;->T:Z */
/* iget v0, p0, Lcom/doodle/ltcsmyb/a;->N:I */
/* iget v1, p0, Lcom/doodle/ltcsmyb/a;->M:I */
/* add-int/2addr v0, v1 */
(( com.doodle.ltcsmyb.a ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyb/a;->b(I)V
/* const v0, 0x7f0901ca */
(( com.doodle.ltcsmyb.a ) p0 ).d ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyb/a;->d(I)V
/* goto/16 :goto_3 */
} // :cond_11
/* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/a;->T:Z */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/a;->V:Z */
/* iget v0, p0, Lcom/doodle/ltcsmyb/a;->N:I */
/* iget v1, p0, Lcom/doodle/ltcsmyb/a;->M:I */
/* add-int/2addr v0, v1 */
/* iget v1, p0, Lcom/doodle/ltcsmyb/a;->O:I */
/* add-int/2addr v0, v1 */
(( com.doodle.ltcsmyb.a ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyb/a;->b(I)V
/* const v0, 0x7f0900a1 */
(( com.doodle.ltcsmyb.a ) p0 ).d ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyb/a;->d(I)V
/* goto/16 :goto_4 */
} // :cond_12
/* iget v0, p0, Lcom/doodle/ltcsmyb/a;->W:F */
/* invoke-direct {p0, v0}, Lcom/doodle/ltcsmyb/a;->b(F)V */
v0 = this.p;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v4 ); // invoke-virtual {v0, v4}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Z)V
v0 = this.A;
(( com.doodlemobile.basket.ui.TextView ) v0 ).a ( v4 ); // invoke-virtual {v0, v4}, Lcom/doodlemobile/basket/ui/TextView;->a(Z)V
/* goto/16 :goto_5 */
} // :cond_13
/* const/high16 v0, 0x3f800000 # 1.0f */
/* iput v0, p0, Lcom/doodle/ltcsmyb/a;->W:F */
/* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/a;->V:Z */
/* iget v0, p0, Lcom/doodle/ltcsmyb/a;->W:F */
/* invoke-direct {p0, v0}, Lcom/doodle/ltcsmyb/a;->b(F)V */
/* iget v0, p0, Lcom/doodle/ltcsmyb/a;->W:F */
/* invoke-direct {p0, v0}, Lcom/doodle/ltcsmyb/a;->a(F)V */
/* goto/16 :goto_5 */
} // :cond_14
/* iget v0, p0, Lcom/doodle/ltcsmyb/a;->W:F */
/* const v1, 0x3cf5c28f # 0.03f */
/* sub-float/2addr v0, v1 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/a;->W:F */
/* goto/16 :goto_5 */
} // .end method
public final void a ( Boolean p0 ) {
/* .locals 0 */
/* iput-boolean p1, p0, Lcom/doodle/ltcsmyb/a;->H:Z */
return;
} // .end method
public final void a ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 1 */
/* iput-boolean p1, p0, Lcom/doodle/ltcsmyb/a;->L:Z */
/* iput p3, p0, Lcom/doodle/ltcsmyb/a;->M:I */
/* iput p2, p0, Lcom/doodle/ltcsmyb/a;->N:I */
/* iput p4, p0, Lcom/doodle/ltcsmyb/a;->O:I */
/* iput p5, p0, Lcom/doodle/ltcsmyb/a;->P:I */
/* iget v0, p0, Lcom/doodle/ltcsmyb/a;->Y:I */
/* add-int/2addr v0, p2 */
/* add-int/2addr v0, p4 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/a;->Y:I */
return;
} // .end method
public final void b ( ) {
/* .locals 2 */
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/a;->I:Z */
/* iput v1, p0, Lcom/doodle/ltcsmyb/a;->Q:I */
/* iput v1, p0, Lcom/doodle/ltcsmyb/a;->K:I */
/* iput v1, p0, Lcom/doodle/ltcsmyb/a;->R:I */
/* iput v1, p0, Lcom/doodle/ltcsmyb/a;->S:I */
/* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/a;->T:Z */
/* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/a;->U:Z */
/* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/a;->V:Z */
/* const v0, 0x3fe66666 # 1.8f */
/* iput v0, p0, Lcom/doodle/ltcsmyb/a;->W:F */
/* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/a;->X:Z */
return;
} // .end method
public final void b ( Integer p0 ) {
/* .locals 3 */
v0 = this.z;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = ""; // const-string v2, ""
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.doodlemobile.basket.ui.TextView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/TextView;->a(Ljava/lang/CharSequence;)V
return;
} // .end method
public final com.doodle.ltcsmyb.MainActivity c ( ) {
/* .locals 1 */
v0 = this.E;
} // .end method
public final void c ( Integer p0 ) {
/* .locals 4 */
final String v3 = ""; // const-string v3, ""
/* const/16 v0, 0x1a */
/* if-ge p1, v0, :cond_1 */
v0 = this.B;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = ""; // const-string v2, ""
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.doodlemobile.basket.ui.TextView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/TextView;->a(Ljava/lang/CharSequence;)V
v0 = this.C;
/* const v1, 0x7f02000d */
com.doodlemobile.basket.graphics.d .a ( v0,v1 );
v1 = this.B;
(( com.doodlemobile.basket.ui.TextView ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lcom/doodlemobile/basket/ui/TextView;->a(Lcom/doodlemobile/basket/graphics/d;)V
} // :cond_0
} // :goto_0
return;
} // :cond_1
/* const/16 v0, 0x33 */
/* if-ge p1, v0, :cond_2 */
v0 = this.B;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = ""; // const-string v2, ""
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const/16 v2, 0x19 */
/* sub-int v2, p1, v2 */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.doodlemobile.basket.ui.TextView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/TextView;->a(Ljava/lang/CharSequence;)V
v0 = this.C;
/* const v1, 0x7f02000e */
com.doodlemobile.basket.graphics.d .a ( v0,v1 );
v1 = this.B;
(( com.doodlemobile.basket.ui.TextView ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lcom/doodlemobile/basket/ui/TextView;->a(Lcom/doodlemobile/basket/graphics/d;)V
} // :cond_2
/* const/16 v0, 0x4c */
/* if-ge p1, v0, :cond_3 */
v0 = this.B;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = ""; // const-string v2, ""
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const/16 v2, 0x32 */
/* sub-int v2, p1, v2 */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.doodlemobile.basket.ui.TextView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/TextView;->a(Ljava/lang/CharSequence;)V
v0 = this.C;
/* const v1, 0x7f02000f */
com.doodlemobile.basket.graphics.d .a ( v0,v1 );
v1 = this.B;
(( com.doodlemobile.basket.ui.TextView ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lcom/doodlemobile/basket/ui/TextView;->a(Lcom/doodlemobile/basket/graphics/d;)V
} // :cond_3
/* const/16 v0, 0x65 */
/* if-ge p1, v0, :cond_4 */
v0 = this.B;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = ""; // const-string v2, ""
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const/16 v2, 0x4b */
/* sub-int v2, p1, v2 */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.doodlemobile.basket.ui.TextView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/TextView;->a(Ljava/lang/CharSequence;)V
v0 = this.C;
/* const v1, 0x7f020010 */
com.doodlemobile.basket.graphics.d .a ( v0,v1 );
v1 = this.B;
(( com.doodlemobile.basket.ui.TextView ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lcom/doodlemobile/basket/ui/TextView;->a(Lcom/doodlemobile/basket/graphics/d;)V
/* goto/16 :goto_0 */
} // :cond_4
/* const/16 v0, 0x7e */
/* if-ge p1, v0, :cond_0 */
v0 = this.B;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = ""; // const-string v2, ""
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const/16 v2, 0x64 */
/* sub-int v2, p1, v2 */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.doodlemobile.basket.ui.TextView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/TextView;->a(Ljava/lang/CharSequence;)V
v0 = this.C;
/* const v1, 0x7f020011 */
com.doodlemobile.basket.graphics.d .a ( v0,v1 );
v1 = this.B;
(( com.doodlemobile.basket.ui.TextView ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lcom/doodlemobile/basket/ui/TextView;->a(Lcom/doodlemobile/basket/graphics/d;)V
/* goto/16 :goto_0 */
} // .end method
public final com.doodle.ltcsmyb.c.b d ( ) {
/* .locals 1 */
v0 = this.a;
} // .end method
public final void d ( Integer p0 ) {
/* .locals 1 */
v0 = this.x;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(I)V
return;
} // .end method
public final void e ( ) {
/* .locals 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
(( com.doodle.ltcsmyb.c.b ) v0 ).f ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/c/b;->f()V
} // :cond_0
return;
} // .end method
public final void e ( Integer p0 ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodle/ltcsmyb/a;->G:I */
/* add-int/2addr v0, p1 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/a;->G:I */
/* invoke-direct {p0}, Lcom/doodle/ltcsmyb/a;->p()V */
return;
} // .end method
public final void f ( ) {
/* .locals 2 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
(( com.doodle.ltcsmyb.c.b ) v0 ).r ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/c/b;->r()V
v0 = this.a;
v0 = (( com.doodle.ltcsmyb.c.b ) v0 ).g ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/c/b;->g()I
int v1 = 0; // const/4 v1, 0x0
this.a = v1;
java.lang.System .gc ( );
/* new-instance v1, Lcom/doodle/ltcsmyb/c/b; */
/* invoke-direct {v1, p0, v0}, Lcom/doodle/ltcsmyb/c/b;-><init>(Lcom/doodle/ltcsmyb/a;I)V */
this.a = v1;
/* invoke-direct {p0}, Lcom/doodle/ltcsmyb/a;->o()V */
} // :cond_0
return;
} // .end method
public final void f ( Integer p0 ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodle/ltcsmyb/a;->G:I */
/* sub-int/2addr v0, p1 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/a;->G:I */
/* iget v0, p0, Lcom/doodle/ltcsmyb/a;->G:I */
/* if-gez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/doodle/ltcsmyb/a;->G:I */
} // :cond_0
/* invoke-direct {p0}, Lcom/doodle/ltcsmyb/a;->p()V */
return;
} // .end method
public final com.doodlemobile.basket.game2d.c g ( ) {
/* .locals 1 */
v0 = this.D;
} // .end method
public final void g ( Integer p0 ) {
/* .locals 3 */
int v2 = 1; // const/4 v2, 0x1
int v1 = 0; // const/4 v1, 0x0
/* if-lez p1, :cond_2 */
v0 = this.q;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Z)V
/* if-le p1, v2, :cond_1 */
v0 = this.r;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Z)V
int v0 = 2; // const/4 v0, 0x2
/* if-le p1, v0, :cond_0 */
v0 = this.s;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Z)V
} // :goto_0
return;
} // :cond_0
v0 = this.s;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Z)V
} // :cond_1
v0 = this.r;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Z)V
v0 = this.s;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Z)V
} // :cond_2
v0 = this.q;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Z)V
v0 = this.r;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Z)V
v0 = this.s;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Z)V
} // .end method
public final com.doodlemobile.basket.b.b h ( ) {
/* .locals 1 */
v0 = this.C;
} // .end method
public final void h ( Integer p0 ) {
/* .locals 2 */
int v0 = 1; // const/4 v0, 0x1
/* if-ne p1, v0, :cond_0 */
v0 = this.t;
/* const v1, 0x7f0901cd */
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(I)V
} // :goto_0
return;
} // :cond_0
int v0 = 2; // const/4 v0, 0x2
/* if-ne p1, v0, :cond_1 */
v0 = this.t;
/* const v1, 0x7f0901cb */
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(I)V
} // :cond_1
v0 = this.t;
/* const v1, 0x7f09009a */
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(I)V
} // .end method
public final void i ( ) {
/* .locals 2 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
(( com.doodle.ltcsmyb.c.b ) v0 ).r ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/c/b;->r()V
int v0 = 0; // const/4 v0, 0x0
this.a = v0;
java.lang.System .gc ( );
} // :cond_0
v0 = com.doodle.ltcsmyb.MainActivity .r ( );
/* rem-int/lit8 v0, v0, 0x7d */
/* add-int/lit8 v0, v0, 0x1 */
/* new-instance v1, Lcom/doodle/ltcsmyb/c/b; */
/* invoke-direct {v1, p0, v0}, Lcom/doodle/ltcsmyb/c/b;-><init>(Lcom/doodle/ltcsmyb/a;I)V */
this.a = v1;
/* invoke-direct {p0}, Lcom/doodle/ltcsmyb/a;->o()V */
return;
} // .end method
public final void i ( Integer p0 ) {
/* .locals 2 */
int v1 = 1; // const/4 v1, 0x1
/* const v0, 0x7f09012c */
/* if-ne p1, v0, :cond_1 */
/* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/a;->I:Z */
/* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/a;->X:Z */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
v0 = (( com.doodle.ltcsmyb.c.b ) v0 ).h ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/c/b;->h()I
/* iput v0, p0, Lcom/doodle/ltcsmyb/a;->J:I */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/doodle/ltcsmyb/a;->K:I */
} // :cond_1
return;
} // .end method
public final void j ( ) {
/* .locals 2 */
int v1 = 0; // const/4 v1, 0x0
v0 = this.o;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Z)V
v0 = this.p;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Z)V
v0 = this.A;
(( com.doodlemobile.basket.ui.TextView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/TextView;->a(Z)V
return;
} // .end method
public final Integer k ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodle/ltcsmyb/a;->G:I */
} // .end method
public final void l ( ) {
/* .locals 2 */
/* const v1, 0x7f09009f */
v0 = this.u;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(I)V
v0 = this.v;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(I)V
v0 = this.w;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(I)V
return;
} // .end method
