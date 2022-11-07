public class com.doodle.ltcsmyb.TvPanel extends com.doodlemobile.basket.ui.Panel {
	 /* # static fields */
	 private static Integer D;
	 /* # instance fields */
	 private com.doodlemobile.basket.ui.TextView A;
	 private com.doodle.ltcsmyb.MainActivity B;
	 private com.doodlemobile.basket.ui.b C;
	 private Integer E;
	 private Integer F;
	 private Integer G;
	 private Float t;
	 private com.doodlemobile.basket.ui.AnimationView u;
	 private com.doodlemobile.basket.ui.AnimationView v;
	 private com.doodlemobile.basket.ui.AnimationView w;
	 private com.doodlemobile.basket.ui.AnimationView x;
	 private com.doodlemobile.basket.ui.AnimationView y;
	 private com.doodlemobile.basket.ui.AnimationView z;
	 /* # direct methods */
	 static com.doodle.ltcsmyb.TvPanel ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 return;
	 } // .end method
	 public com.doodle.ltcsmyb.TvPanel ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0, p1, p2}, Lcom/doodlemobile/basket/ui/Panel;-><init>(Lcom/doodlemobile/basket/b/b;Landroid/util/AttributeSet;)V */
		 /* const/16 v0, 0x1e */
		 /* iput v0, p0, Lcom/doodle/ltcsmyb/TvPanel;->E:I */
		 /* const/16 v0, 0x46 */
		 /* iput v0, p0, Lcom/doodle/ltcsmyb/TvPanel;->F:I */
		 /* const/16 v0, 0x78 */
		 /* iput v0, p0, Lcom/doodle/ltcsmyb/TvPanel;->G:I */
		 this.B = p3;
		 return;
	 } // .end method
	 private void b ( Integer p0, Integer p1 ) {
		 /* .locals 4 */
		 /* const/high16 v3, 0x3f800000 # 1.0f */
		 int v2 = 1; // const/4 v2, 0x1
		 v0 = this.x;
		 /* if-nez v0, :cond_0 */
		 /* invoke-direct {p0}, Lcom/doodle/ltcsmyb/TvPanel;->o()V */
	 } // :cond_0
	 v0 = 	 /* invoke-direct {p0}, Lcom/doodle/ltcsmyb/TvPanel;->l()I */
	 /* if-lt v0, p1, :cond_4 */
	 int v0 = 2; // const/4 v0, 0x2
	 /* if-ne p2, v0, :cond_1 */
	 v0 = this.B;
	 com.doodle.ltcsmyb.a.a .a ( v0 );
	 v0 = 	 (( com.doodle.ltcsmyb.a.a ) v0 ).d ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->d()Z
	 /* if-nez v0, :cond_3 */
} // :cond_1
int v0 = 3; // const/4 v0, 0x3
/* if-ne p2, v0, :cond_2 */
v0 = this.B;
com.doodle.ltcsmyb.a.a .a ( v0 );
v0 = (( com.doodle.ltcsmyb.a.a ) v0 ).e ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->e()Z
/* if-nez v0, :cond_3 */
} // :cond_2
int v0 = 4; // const/4 v0, 0x4
/* if-ne p2, v0, :cond_4 */
v0 = this.B;
com.doodle.ltcsmyb.a.a .a ( v0 );
v0 = (( com.doodle.ltcsmyb.a.a ) v0 ).f ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->f()Z
if ( v0 != null) { // if-eqz v0, :cond_4
} // :cond_3
/* invoke-direct {p0}, Lcom/doodle/ltcsmyb/TvPanel;->m()V */
} // :goto_0
return;
} // :cond_4
v0 = this.x;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).c ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/AnimationView;->c(F)V
v0 = this.x;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Z)V
v0 = this.w;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Z)V
v0 = this.w;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).c ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/AnimationView;->c(F)V
v0 = this.w;
/* const v1, 0x7f0900db */
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(I)V
v0 = this.y;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Z)V
v0 = this.A;
(( com.doodlemobile.basket.ui.TextView ) v0 ).c ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/TextView;->c(F)V
v0 = this.A;
(( com.doodlemobile.basket.ui.TextView ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lcom/doodlemobile/basket/ui/TextView;->a(Z)V
v0 = this.A;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = ""; // const-string v2, ""
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.doodlemobile.basket.ui.TextView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/TextView;->a(Ljava/lang/CharSequence;)V
} // .end method
public static Integer e ( ) {
/* .locals 1 */
} // .end method
private Integer l ( ) {
/* .locals 4 */
int v1 = 0; // const/4 v1, 0x0
v0 = this.B;
com.doodle.ltcsmyb.a.a .a ( v0 );
(( com.doodle.ltcsmyb.a.a ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->a()[I
/* move v2, v1 */
} // :goto_0
/* array-length v3, v0 */
/* if-ge v1, v3, :cond_0 */
/* aget v3, v0, v1 */
/* add-int/2addr v2, v3 */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
} // .end method
private void m ( ) {
/* .locals 3 */
/* const/high16 v2, 0x3f800000 # 1.0f */
int v1 = 0; // const/4 v1, 0x0
v0 = this.x;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).c ( v2 ); // invoke-virtual {v0, v2}, Lcom/doodlemobile/basket/ui/AnimationView;->c(F)V
v0 = this.w;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).c ( v2 ); // invoke-virtual {v0, v2}, Lcom/doodlemobile/basket/ui/AnimationView;->c(F)V
v0 = this.A;
(( com.doodlemobile.basket.ui.TextView ) v0 ).c ( v2 ); // invoke-virtual {v0, v2}, Lcom/doodlemobile/basket/ui/TextView;->c(F)V
v0 = this.x;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Z)V
v0 = this.w;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Z)V
v0 = this.y;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Z)V
v0 = this.A;
(( com.doodlemobile.basket.ui.TextView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/TextView;->a(Z)V
return;
} // .end method
private void n ( ) {
/* .locals 2 */
int v1 = 0; // const/4 v1, 0x0
v0 = this.x;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Z)V
v0 = this.w;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Z)V
v0 = this.y;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Z)V
v0 = this.A;
(( com.doodlemobile.basket.ui.TextView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/TextView;->a(Z)V
return;
} // .end method
private void o ( ) {
/* .locals 2 */
v0 = this.B;
(( com.doodle.ltcsmyb.MainActivity ) v0 ).o ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/MainActivity;->o()Lcom/doodlemobile/basket/ui/e;
/* const v1, 0x7f0900d4 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/AnimationView; */
this.u = v0;
v0 = this.B;
(( com.doodle.ltcsmyb.MainActivity ) v0 ).o ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/MainActivity;->o()Lcom/doodlemobile/basket/ui/e;
/* const v1, 0x7f0900ed */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/AnimationView; */
this.v = v0;
v0 = this.B;
(( com.doodle.ltcsmyb.MainActivity ) v0 ).o ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/MainActivity;->o()Lcom/doodlemobile/basket/ui/e;
/* const v1, 0x7f0900da */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/AnimationView; */
this.w = v0;
v0 = this.B;
(( com.doodle.ltcsmyb.MainActivity ) v0 ).o ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/MainActivity;->o()Lcom/doodlemobile/basket/ui/e;
/* const v1, 0x7f0900dc */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/AnimationView; */
this.x = v0;
v0 = this.B;
(( com.doodle.ltcsmyb.MainActivity ) v0 ).o ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/MainActivity;->o()Lcom/doodlemobile/basket/ui/e;
/* const v1, 0x7f0900d8 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/AnimationView; */
this.y = v0;
v0 = this.B;
(( com.doodle.ltcsmyb.MainActivity ) v0 ).o ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/MainActivity;->o()Lcom/doodlemobile/basket/ui/e;
/* const v1, 0x7f0900de */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/TextView; */
this.A = v0;
v0 = this.B;
(( com.doodle.ltcsmyb.MainActivity ) v0 ).o ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/MainActivity;->o()Lcom/doodlemobile/basket/ui/e;
/* const v1, 0x7f0900df */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/AnimationView; */
this.z = v0;
return;
} // .end method
/* # virtual methods */
public final void a ( ) {
/* .locals 2 */
/* const/high16 v1, -0x3d260000 # -109.0f */
/* invoke-direct {p0}, Lcom/doodle/ltcsmyb/TvPanel;->o()V */
v0 = this.v;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).s ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/AnimationView;->s()Lcom/doodlemobile/basket/ui/b;
this.C = v0;
v0 = this.C;
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
v0 = this.u;
v0 = (( com.doodlemobile.basket.ui.AnimationView ) v0 ).d ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/AnimationView;->d()I
/* sparse-switch v0, :sswitch_data_0 */
} // :goto_0
v0 = this.z;
int v1 = 0; // const/4 v1, 0x0
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Z)V
return;
/* :sswitch_0 */
v0 = this.u;
/* const v1, 0x7f09026f */
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(I)V
v0 = this.C;
/* const/high16 v1, -0x3d7c0000 # -66.0f */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
/* const/16 v0, 0x1e */
int v1 = 2; // const/4 v1, 0x2
/* invoke-direct {p0, v0, v1}, Lcom/doodle/ltcsmyb/TvPanel;->b(II)V */
/* :sswitch_1 */
v0 = this.u;
/* const v1, 0x7f090273 */
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(I)V
v0 = this.C;
/* const/high16 v1, -0x3e480000 # -23.0f */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
/* const/16 v0, 0x46 */
int v1 = 3; // const/4 v1, 0x3
/* invoke-direct {p0, v0, v1}, Lcom/doodle/ltcsmyb/TvPanel;->b(II)V */
/* :sswitch_2 */
v0 = this.u;
/* const v1, 0x7f090272 */
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(I)V
v0 = this.C;
/* const/high16 v1, 0x41a00000 # 20.0f */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
/* const/16 v0, 0x78 */
int v1 = 4; // const/4 v1, 0x4
/* invoke-direct {p0, v0, v1}, Lcom/doodle/ltcsmyb/TvPanel;->b(II)V */
/* :sswitch_3 */
v0 = this.u;
/* const v1, 0x7f090270 */
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(I)V
v0 = this.C;
/* const/high16 v1, 0x427c0000 # 63.0f */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
/* invoke-direct {p0}, Lcom/doodle/ltcsmyb/TvPanel;->n()V */
/* :sswitch_4 */
v0 = this.C;
/* const/high16 v1, 0x42d40000 # 106.0f */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
v0 = this.u;
/* const v1, 0x7f090271 */
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(I)V
/* invoke-direct {p0}, Lcom/doodle/ltcsmyb/TvPanel;->n()V */
/* :sswitch_5 */
v0 = this.C;
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
v0 = this.u;
/* const v1, 0x7f0900d5 */
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(I)V
/* invoke-direct {p0}, Lcom/doodle/ltcsmyb/TvPanel;->n()V */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x7f0900d5 -> :sswitch_0 */
/* 0x7f09026f -> :sswitch_1 */
/* 0x7f090270 -> :sswitch_4 */
/* 0x7f090271 -> :sswitch_5 */
/* 0x7f090272 -> :sswitch_3 */
/* 0x7f090273 -> :sswitch_2 */
} // .end sparse-switch
} // .end method
public final Boolean c ( Object p0 ) {
/* .locals 8 */
/* const v7, 0x7f09012f */
/* const v6, 0x7f0900db */
/* const/16 v5, 0x76 */
/* const/16 v4, 0x6d */
int v3 = 1; // const/4 v3, 0x1
v0 = (( com.doodlemobile.basket.util.e ) p1 ).d ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->d()I
/* packed-switch v0, :pswitch_data_0 */
} // :cond_0
} // :goto_0
/* :pswitch_0 */
v0 = (( com.doodlemobile.basket.util.e ) p1 ).a ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->a()F
/* iput v0, p0, Lcom/doodle/ltcsmyb/TvPanel;->t:F */
/* :pswitch_1 */
v0 = (( com.doodlemobile.basket.util.e ) p1 ).a ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->a()F
/* iget v1, p0, Lcom/doodle/ltcsmyb/TvPanel;->t:F */
/* sub-float v1, v0, v1 */
v1 = java.lang.Math .abs ( v1 );
/* const/high16 v2, 0x41200000 # 10.0f */
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_d */
v0 = this.B;
com.doodle.ltcsmyb.a.a .a ( v0 );
v0 = (( com.doodle.ltcsmyb.a.a ) v0 ).i ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->i()Z
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.B;
(( com.doodle.ltcsmyb.MainActivity ) v0 ).i ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/MainActivity;->i()V
} // :cond_1
v0 = this.B;
(( com.doodle.ltcsmyb.MainActivity ) v0 ).o ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/MainActivity;->o()Lcom/doodlemobile/basket/ui/e;
/* const v1, 0x7f0900d4 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/AnimationView; */
this.u = v0;
v0 = this.u;
v0 = (( com.doodlemobile.basket.ui.AnimationView ) v0 ).d ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/AnimationView;->d()I
/* sparse-switch v0, :sswitch_data_0 */
/* :sswitch_0 */
v0 = this.B;
com.doodle.ltcsmyb.a.a .a ( v0 );
v0 = (( com.doodle.ltcsmyb.a.a ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->b()Z
/* if-ne v0, v3, :cond_2 */
v0 = this.B;
com.doodle.ltcsmyb.d.f .a ( v0 );
(( com.doodle.ltcsmyb.d.f ) v0 ).a ( v4 ); // invoke-virtual {v0, v4}, Lcom/doodle/ltcsmyb/d/f;->a(I)V
} // :cond_2
v0 = this.B;
(( com.doodle.ltcsmyb.MainActivity ) v0 ).k ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/MainActivity;->k()V
v0 = this.B;
(( com.doodle.ltcsmyb.MainActivity ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/MainActivity;->a()V
v0 = this.B;
(( com.doodle.ltcsmyb.MainActivity ) v0 ).q ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/MainActivity;->q()V
v0 = this.B;
/* const v1, 0x7f09013c */
(( com.doodle.ltcsmyb.MainActivity ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
v0 = this.B;
/* const v1, 0x7f0900f2 */
(( com.doodle.ltcsmyb.MainActivity ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodle/ltcsmyb/MainActivity;->a(I)V
/* :sswitch_1 */
v0 = /* invoke-direct {p0}, Lcom/doodle/ltcsmyb/TvPanel;->l()I */
/* const/16 v1, 0x1e */
/* if-lt v0, v1, :cond_5 */
v0 = this.B;
com.doodle.ltcsmyb.a.a .a ( v0 );
v0 = (( com.doodle.ltcsmyb.a.a ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->b()Z
/* if-ne v0, v3, :cond_3 */
v0 = this.B;
com.doodle.ltcsmyb.d.f .a ( v0 );
(( com.doodle.ltcsmyb.d.f ) v0 ).a ( v4 ); // invoke-virtual {v0, v4}, Lcom/doodle/ltcsmyb/d/f;->a(I)V
} // :cond_3
v0 = this.B;
com.doodle.ltcsmyb.a.a .a ( v0 );
v0 = (( com.doodle.ltcsmyb.a.a ) v0 ).d ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->d()Z
if ( v0 != null) { // if-eqz v0, :cond_4
v0 = this.w;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v6 ); // invoke-virtual {v0, v6}, Lcom/doodlemobile/basket/ui/AnimationView;->a(I)V
/* invoke-direct {p0}, Lcom/doodle/ltcsmyb/TvPanel;->m()V */
int v0 = 2; // const/4 v0, 0x2
v0 = this.B;
(( com.doodle.ltcsmyb.MainActivity ) v0 ).l ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/MainActivity;->l()V
v0 = this.B;
(( com.doodle.ltcsmyb.MainActivity ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/MainActivity;->b()V
v0 = this.B;
(( com.doodle.ltcsmyb.MainActivity ) v0 ).q ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/MainActivity;->q()V
v0 = this.B;
/* const v1, 0x7f09013e */
(( com.doodle.ltcsmyb.MainActivity ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
v0 = this.B;
/* const v1, 0x7f0900f7 */
(( com.doodle.ltcsmyb.MainActivity ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodle/ltcsmyb/MainActivity;->a(I)V
/* goto/16 :goto_0 */
} // :cond_4
v0 = this.B;
(( com.doodle.ltcsmyb.MainActivity ) v0 ).c ( v7 ); // invoke-virtual {v0, v7}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
v0 = this.B;
com.doodle.ltcsmyb.a.a .a ( v0 );
(( com.doodle.ltcsmyb.a.a ) v0 ).m ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->m()V
/* goto/16 :goto_0 */
} // :cond_5
v0 = this.B;
com.doodle.ltcsmyb.a.a .a ( v0 );
v0 = (( com.doodle.ltcsmyb.a.a ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.B;
com.doodle.ltcsmyb.d.f .a ( v0 );
(( com.doodle.ltcsmyb.d.f ) v0 ).a ( v5 ); // invoke-virtual {v0, v5}, Lcom/doodle/ltcsmyb/d/f;->a(I)V
/* goto/16 :goto_0 */
/* :sswitch_2 */
v0 = /* invoke-direct {p0}, Lcom/doodle/ltcsmyb/TvPanel;->l()I */
/* const/16 v1, 0x46 */
/* if-lt v0, v1, :cond_8 */
v0 = this.B;
com.doodle.ltcsmyb.a.a .a ( v0 );
v0 = (( com.doodle.ltcsmyb.a.a ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->b()Z
/* if-ne v0, v3, :cond_6 */
v0 = this.B;
com.doodle.ltcsmyb.d.f .a ( v0 );
(( com.doodle.ltcsmyb.d.f ) v0 ).a ( v4 ); // invoke-virtual {v0, v4}, Lcom/doodle/ltcsmyb/d/f;->a(I)V
} // :cond_6
v0 = this.B;
com.doodle.ltcsmyb.a.a .a ( v0 );
v0 = (( com.doodle.ltcsmyb.a.a ) v0 ).e ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->e()Z
if ( v0 != null) { // if-eqz v0, :cond_7
v0 = this.w;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v6 ); // invoke-virtual {v0, v6}, Lcom/doodlemobile/basket/ui/AnimationView;->a(I)V
/* invoke-direct {p0}, Lcom/doodle/ltcsmyb/TvPanel;->m()V */
int v0 = 3; // const/4 v0, 0x3
v0 = this.B;
(( com.doodle.ltcsmyb.MainActivity ) v0 ).m ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/MainActivity;->m()V
v0 = this.B;
(( com.doodle.ltcsmyb.MainActivity ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/MainActivity;->c()V
v0 = this.B;
(( com.doodle.ltcsmyb.MainActivity ) v0 ).q ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/MainActivity;->q()V
v0 = this.B;
/* const v1, 0x7f090140 */
(( com.doodle.ltcsmyb.MainActivity ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
v0 = this.B;
/* const v1, 0x7f0900fc */
(( com.doodle.ltcsmyb.MainActivity ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodle/ltcsmyb/MainActivity;->a(I)V
/* goto/16 :goto_0 */
} // :cond_7
v0 = this.B;
(( com.doodle.ltcsmyb.MainActivity ) v0 ).c ( v7 ); // invoke-virtual {v0, v7}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
v0 = this.B;
com.doodle.ltcsmyb.a.a .a ( v0 );
(( com.doodle.ltcsmyb.a.a ) v0 ).o ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->o()V
/* goto/16 :goto_0 */
} // :cond_8
v0 = this.B;
com.doodle.ltcsmyb.a.a .a ( v0 );
v0 = (( com.doodle.ltcsmyb.a.a ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.B;
com.doodle.ltcsmyb.d.f .a ( v0 );
(( com.doodle.ltcsmyb.d.f ) v0 ).a ( v5 ); // invoke-virtual {v0, v5}, Lcom/doodle/ltcsmyb/d/f;->a(I)V
/* goto/16 :goto_0 */
/* :sswitch_3 */
v0 = /* invoke-direct {p0}, Lcom/doodle/ltcsmyb/TvPanel;->l()I */
/* const/16 v1, 0x78 */
/* if-lt v0, v1, :cond_b */
v0 = this.B;
com.doodle.ltcsmyb.a.a .a ( v0 );
v0 = (( com.doodle.ltcsmyb.a.a ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->b()Z
/* if-ne v0, v3, :cond_9 */
v0 = this.B;
com.doodle.ltcsmyb.d.f .a ( v0 );
(( com.doodle.ltcsmyb.d.f ) v0 ).a ( v4 ); // invoke-virtual {v0, v4}, Lcom/doodle/ltcsmyb/d/f;->a(I)V
} // :cond_9
v0 = this.B;
com.doodle.ltcsmyb.a.a .a ( v0 );
v0 = (( com.doodle.ltcsmyb.a.a ) v0 ).f ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->f()Z
if ( v0 != null) { // if-eqz v0, :cond_a
v0 = this.w;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v6 ); // invoke-virtual {v0, v6}, Lcom/doodlemobile/basket/ui/AnimationView;->a(I)V
/* invoke-direct {p0}, Lcom/doodle/ltcsmyb/TvPanel;->m()V */
int v0 = 4; // const/4 v0, 0x4
v0 = this.B;
(( com.doodle.ltcsmyb.MainActivity ) v0 ).n ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/MainActivity;->n()V
v0 = this.B;
(( com.doodle.ltcsmyb.MainActivity ) v0 ).d ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/MainActivity;->d()V
v0 = this.B;
(( com.doodle.ltcsmyb.MainActivity ) v0 ).q ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/MainActivity;->q()V
v0 = this.B;
/* const v1, 0x7f090142 */
(( com.doodle.ltcsmyb.MainActivity ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
v0 = this.B;
/* const v1, 0x7f090101 */
(( com.doodle.ltcsmyb.MainActivity ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodle/ltcsmyb/MainActivity;->a(I)V
/* goto/16 :goto_0 */
} // :cond_a
v0 = this.B;
(( com.doodle.ltcsmyb.MainActivity ) v0 ).c ( v7 ); // invoke-virtual {v0, v7}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
v0 = this.B;
com.doodle.ltcsmyb.a.a .a ( v0 );
(( com.doodle.ltcsmyb.a.a ) v0 ).n ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->n()V
/* goto/16 :goto_0 */
} // :cond_b
v0 = this.B;
com.doodle.ltcsmyb.a.a .a ( v0 );
v0 = (( com.doodle.ltcsmyb.a.a ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.B;
com.doodle.ltcsmyb.d.f .a ( v0 );
(( com.doodle.ltcsmyb.d.f ) v0 ).a ( v5 ); // invoke-virtual {v0, v5}, Lcom/doodle/ltcsmyb/d/f;->a(I)V
/* goto/16 :goto_0 */
/* :sswitch_4 */
v0 = this.B;
com.doodle.ltcsmyb.a.a .a ( v0 );
v0 = (( com.doodle.ltcsmyb.a.a ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->b()Z
/* if-ne v0, v3, :cond_c */
v0 = this.B;
com.doodle.ltcsmyb.d.f .a ( v0 );
(( com.doodle.ltcsmyb.d.f ) v0 ).a ( v4 ); // invoke-virtual {v0, v4}, Lcom/doodle/ltcsmyb/d/f;->a(I)V
} // :cond_c
int v0 = 5; // const/4 v0, 0x5
v0 = this.B;
(( com.doodle.ltcsmyb.MainActivity ) v0 ).j ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/MainActivity;->j()V
v0 = this.B;
(( com.doodle.ltcsmyb.MainActivity ) v0 ).e ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/MainActivity;->e()V
v0 = this.B;
(( com.doodle.ltcsmyb.MainActivity ) v0 ).q ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/MainActivity;->q()V
v0 = this.B;
/* const v1, 0x7f090143 */
(( com.doodle.ltcsmyb.MainActivity ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
v0 = this.B;
/* const v1, 0x7f090106 */
(( com.doodle.ltcsmyb.MainActivity ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodle/ltcsmyb/MainActivity;->a(I)V
/* goto/16 :goto_0 */
/* :sswitch_5 */
v0 = this.B;
com.doodle.ltcsmyb.a.a .a ( v0 );
v0 = (( com.doodle.ltcsmyb.a.a ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->b()Z
/* if-ne v0, v3, :cond_0 */
v0 = this.B;
com.doodle.ltcsmyb.d.f .a ( v0 );
(( com.doodle.ltcsmyb.d.f ) v0 ).a ( v4 ); // invoke-virtual {v0, v4}, Lcom/doodle/ltcsmyb/d/f;->a(I)V
/* goto/16 :goto_0 */
} // :cond_d
/* iget v1, p0, Lcom/doodle/ltcsmyb/TvPanel;->t:F */
/* sub-float/2addr v0, v1 */
int v1 = 0; // const/4 v1, 0x0
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_f */
v0 = this.B;
com.doodle.ltcsmyb.a.a .a ( v0 );
v0 = (( com.doodle.ltcsmyb.a.a ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->b()Z
/* if-ne v0, v3, :cond_e */
v0 = this.B;
com.doodle.ltcsmyb.d.f .a ( v0 );
/* const/16 v1, 0x6e */
(( com.doodle.ltcsmyb.d.f ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodle/ltcsmyb/d/f;->a(I)V
} // :cond_e
v0 = this.B;
/* const v1, 0x7f090136 */
(( com.doodle.ltcsmyb.MainActivity ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
/* invoke-direct {p0}, Lcom/doodle/ltcsmyb/TvPanel;->o()V */
v0 = this.v;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).s ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/AnimationView;->s()Lcom/doodlemobile/basket/ui/b;
this.C = v0;
v0 = this.C;
/* const/high16 v1, -0x3d260000 # -109.0f */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
v0 = this.u;
v0 = (( com.doodlemobile.basket.ui.AnimationView ) v0 ).d ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/AnimationView;->d()I
/* sparse-switch v0, :sswitch_data_1 */
/* goto/16 :goto_0 */
/* :sswitch_6 */
v0 = this.u;
/* const v1, 0x7f090271 */
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(I)V
v0 = this.C;
/* const/high16 v1, 0x42d40000 # 106.0f */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
/* invoke-direct {p0}, Lcom/doodle/ltcsmyb/TvPanel;->n()V */
/* goto/16 :goto_0 */
/* :sswitch_7 */
v0 = this.u;
/* const v1, 0x7f0900d5 */
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(I)V
v0 = this.C;
/* const/high16 v1, -0x3d260000 # -109.0f */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
/* invoke-direct {p0}, Lcom/doodle/ltcsmyb/TvPanel;->n()V */
/* goto/16 :goto_0 */
/* :sswitch_8 */
v0 = this.u;
/* const v1, 0x7f09026f */
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(I)V
v0 = this.C;
/* const/high16 v1, -0x3d7c0000 # -66.0f */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
/* const/16 v0, 0x1e */
int v1 = 2; // const/4 v1, 0x2
/* invoke-direct {p0, v0, v1}, Lcom/doodle/ltcsmyb/TvPanel;->b(II)V */
/* goto/16 :goto_0 */
/* :sswitch_9 */
v0 = this.u;
/* const v1, 0x7f090273 */
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(I)V
v0 = this.C;
/* const/high16 v1, -0x3e480000 # -23.0f */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
/* const/16 v0, 0x46 */
int v1 = 3; // const/4 v1, 0x3
/* invoke-direct {p0, v0, v1}, Lcom/doodle/ltcsmyb/TvPanel;->b(II)V */
/* goto/16 :goto_0 */
/* :sswitch_a */
v0 = this.u;
/* const v1, 0x7f090272 */
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(I)V
v0 = this.C;
/* const/high16 v1, 0x41a00000 # 20.0f */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
/* const/16 v0, 0x78 */
int v1 = 4; // const/4 v1, 0x4
/* invoke-direct {p0, v0, v1}, Lcom/doodle/ltcsmyb/TvPanel;->b(II)V */
/* goto/16 :goto_0 */
/* :sswitch_b */
v0 = this.u;
/* const v1, 0x7f090270 */
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(I)V
v0 = this.C;
/* const/high16 v1, 0x427c0000 # 63.0f */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
/* invoke-direct {p0}, Lcom/doodle/ltcsmyb/TvPanel;->n()V */
/* goto/16 :goto_0 */
} // :cond_f
v0 = this.B;
com.doodle.ltcsmyb.a.a .a ( v0 );
v0 = (( com.doodle.ltcsmyb.a.a ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->b()Z
/* if-ne v0, v3, :cond_10 */
v0 = this.B;
com.doodle.ltcsmyb.d.f .a ( v0 );
/* const/16 v1, 0x6e */
(( com.doodle.ltcsmyb.d.f ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodle/ltcsmyb/d/f;->a(I)V
} // :cond_10
v0 = this.B;
/* const v1, 0x7f090136 */
(( com.doodle.ltcsmyb.MainActivity ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
v0 = this.B;
com.doodle.ltcsmyb.a.a .a ( v0 );
(( com.doodle.ltcsmyb.a.a ) v0 ).j ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->j()V
(( com.doodle.ltcsmyb.TvPanel ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/doodle/ltcsmyb/TvPanel;->a()V
/* goto/16 :goto_0 */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x7f0900d5 -> :sswitch_0 */
/* 0x7f09026f -> :sswitch_1 */
/* 0x7f090270 -> :sswitch_4 */
/* 0x7f090271 -> :sswitch_5 */
/* 0x7f090272 -> :sswitch_3 */
/* 0x7f090273 -> :sswitch_2 */
} // .end sparse-switch
/* :sswitch_data_1 */
/* .sparse-switch */
/* 0x7f0900d5 -> :sswitch_6 */
/* 0x7f09026f -> :sswitch_7 */
/* 0x7f090270 -> :sswitch_a */
/* 0x7f090271 -> :sswitch_b */
/* 0x7f090272 -> :sswitch_9 */
/* 0x7f090273 -> :sswitch_8 */
} // .end sparse-switch
} // .end method
public final void d ( ) {
/* .locals 2 */
v0 = this.B;
(( com.doodle.ltcsmyb.MainActivity ) v0 ).o ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/MainActivity;->o()Lcom/doodlemobile/basket/ui/e;
/* const v1, 0x7f0900d4 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/AnimationView; */
this.u = v0;
v0 = this.u;
v0 = (( com.doodlemobile.basket.ui.AnimationView ) v0 ).d ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/AnimationView;->d()I
/* packed-switch v0, :pswitch_data_0 */
} // :goto_0
/* :pswitch_0 */
return;
/* :pswitch_1 */
/* const/16 v0, 0x1e */
int v1 = 2; // const/4 v1, 0x2
/* invoke-direct {p0, v0, v1}, Lcom/doodle/ltcsmyb/TvPanel;->b(II)V */
/* :pswitch_2 */
/* const/16 v0, 0x46 */
int v1 = 3; // const/4 v1, 0x3
/* invoke-direct {p0, v0, v1}, Lcom/doodle/ltcsmyb/TvPanel;->b(II)V */
/* :pswitch_3 */
/* const/16 v0, 0x78 */
int v1 = 4; // const/4 v1, 0x4
/* invoke-direct {p0, v0, v1}, Lcom/doodle/ltcsmyb/TvPanel;->b(II)V */
/* :pswitch_data_0 */
/* .packed-switch 0x7f09026f */
/* :pswitch_1 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_3 */
/* :pswitch_2 */
} // .end packed-switch
} // .end method
