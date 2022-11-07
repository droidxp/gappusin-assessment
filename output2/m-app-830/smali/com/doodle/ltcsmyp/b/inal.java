public class inal extends com.doodlemobile.basket.game2d.b {
	 /* # instance fields */
	 private Integer A;
	 private com.badlogic.gdx.physics.box2d.World i;
	 private com.badlogic.gdx.physics.box2d.Body j;
	 private com.doodle.ltcsmyp.b.g k;
	 private com.doodlemobile.basket.game2d.c l;
	 private java.util.ArrayList m;
	 private com.doodle.ltcsmyp.c.b n;
	 private com.doodle.ltcsmyp.a o;
	 private java.util.ArrayList p;
	 private com.doodle.ltcsmyp.a.d q;
	 private Float r;
	 private Float s;
	 private Integer t;
	 private Float u;
	 private Float v;
	 private Float w;
	 private java.util.Random x;
	 private Float y;
	 private com.doodlemobile.basket.graphics.Animation z;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 3 */
		 /* const/high16 v2, 0x42f00000 # 120.0f */
		 /* const/high16 v1, 0x42700000 # 60.0f */
		 (( com.doodle.ltcsmyp.a ) p1 ).h ( ); // invoke-virtual {p1}, Lcom/doodle/ltcsmyp/a;->h()Lcom/doodlemobile/basket/b/b;
		 /* invoke-direct {p0, v0, p2}, Lcom/doodlemobile/basket/game2d/b;-><init>(Lcom/doodlemobile/basket/b/b;Lcom/doodlemobile/basket/graphics/Animation;)V */
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.p = v0;
		 /* new-instance v0, Lcom/doodle/ltcsmyp/a/d; */
		 /* invoke-direct {v0}, Lcom/doodle/ltcsmyp/a/d;-><init>()V */
		 this.q = v0;
		 /* new-instance v0, Ljava/util/Random; */
		 /* invoke-direct {v0}, Ljava/util/Random;-><init>()V */
		 this.x = v0;
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 /* iput v0, p0, Lcom/doodle/ltcsmyp/b/g;->y:F */
		 /* packed-switch p3, :pswitch_data_0 */
	 } // :goto_0
	 /* iput p3, p0, Lcom/doodle/ltcsmyp/b/g;->t:I */
	 this.j = p4;
	 this.o = p1;
	 this.z = p2;
	 (( com.doodle.ltcsmyp.a ) p1 ).g ( ); // invoke-virtual {p1}, Lcom/doodle/ltcsmyp/a;->g()Lcom/doodlemobile/basket/game2d/c;
	 this.l = v0;
	 (( com.doodle.ltcsmyp.a ) p1 ).n ( ); // invoke-virtual {p1}, Lcom/doodle/ltcsmyp/a;->n()Lcom/badlogic/gdx/physics/box2d/World;
	 this.i = v0;
	 return;
	 /* :pswitch_0 */
	 /* const v0, 0x7f090171 */
	 (( com.doodle.ltcsmyp.b.g ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyp/b/g;->a(I)V
	 /* iput v2, p0, Lcom/doodle/ltcsmyp/b/g;->u:F */
	 /* iput v1, p0, Lcom/doodle/ltcsmyp/b/g;->v:F */
	 /* :pswitch_1 */
	 /* const v0, 0x7f090170 */
	 (( com.doodle.ltcsmyp.b.g ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyp/b/g;->a(I)V
	 /* const/high16 v0, 0x43340000 # 180.0f */
	 /* iput v0, p0, Lcom/doodle/ltcsmyp/b/g;->u:F */
	 /* iput v1, p0, Lcom/doodle/ltcsmyp/b/g;->v:F */
	 /* :pswitch_2 */
	 /* const v0, 0x7f090172 */
	 (( com.doodle.ltcsmyp.b.g ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyp/b/g;->a(I)V
	 /* const/high16 v0, 0x43700000 # 240.0f */
	 /* iput v0, p0, Lcom/doodle/ltcsmyp/b/g;->u:F */
	 /* iput v1, p0, Lcom/doodle/ltcsmyp/b/g;->v:F */
	 /* :pswitch_3 */
	 /* const v0, 0x7f090173 */
	 (( com.doodle.ltcsmyp.b.g ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyp/b/g;->a(I)V
	 /* iput v2, p0, Lcom/doodle/ltcsmyp/b/g;->u:F */
	 /* iput v2, p0, Lcom/doodle/ltcsmyp/b/g;->v:F */
	 /* :pswitch_4 */
	 /* const v0, 0x7f090174 */
	 (( com.doodle.ltcsmyp.b.g ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyp/b/g;->a(I)V
	 /* nop */
	 /* :pswitch_data_0 */
	 /* .packed-switch 0x2 */
	 /* :pswitch_0 */
	 /* :pswitch_1 */
	 /* :pswitch_2 */
	 /* :pswitch_3 */
	 /* :pswitch_4 */
} // .end packed-switch
} // .end method
private void a ( ) {
/* .locals 15 */
/* const v13, 0x4016cbe4 */
/* const-wide/high16 v9, 0x403e000000000000L # 30.0 */
int v1 = 0; // const/4 v1, 0x0
/* const-wide v11, 0x404535c2a0000000L # 42.42000198364258 */
int v14 = 1; // const/4 v14, 0x1
v0 = this.o;
(( com.doodle.ltcsmyp.a ) v0 ).d ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyp/a;->d()Lcom/doodle/ltcsmyp/c/b;
this.n = v0;
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->t:I */
int v2 = 2; // const/4 v2, 0x2
/* if-ne v0, v2, :cond_1 */
v0 = this.x;
int v2 = 6; // const/4 v2, 0x6
v0 = (( java.util.Random ) v0 ).nextInt ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/Random;->nextInt(I)I
/* packed-switch v0, :pswitch_data_0 */
} // :cond_0
} // :goto_0
return;
/* :pswitch_0 */
v0 = this.n;
int v2 = 2; // const/4 v2, 0x2
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* iget v4, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* iget v5, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* :pswitch_1 */
v0 = this.n;
int v2 = 2; // const/4 v2, 0x2
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* iget v4, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* iget v5, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* move v1, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* :pswitch_2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v9 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v9 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v2 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* const-wide/high16 v2, -0x3fc2000000000000L # -30.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v4, v0 */
java.lang.Math .cos ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v2 */
/* const-wide/high16 v2, -0x3fc2000000000000L # -30.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v5, v0 */
java.lang.Math .sin ( v5,v6 );
/* move-result-wide v5 */
/* mul-double/2addr v2, v5 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v2 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* :pswitch_3 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v0, v0 */
java.lang.Math .cos ( v0,v1 );
/* move-result-wide v0 */
/* mul-double/2addr v0, v9 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v1 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v0, v0 */
java.lang.Math .sin ( v0,v1 );
/* move-result-wide v0 */
/* mul-double/2addr v0, v9 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v1 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v1, v14 */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* const-wide/high16 v0, -0x3fc2000000000000L # -30.0 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v2 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v1 */
/* const-wide/high16 v0, -0x3fc2000000000000L # -30.0 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v2 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v1 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v1, v14 */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
/* :pswitch_4 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v9 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v6, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v9 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v7, v0, v2 */
v2 = this.n;
/* iget v5, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v3, v14 */
/* move v4, v14 */
/* invoke-virtual/range {v2 ..v7}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* const-wide/high16 v2, -0x3fc2000000000000L # -30.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v4, v0 */
java.lang.Math .cos ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v2 */
/* const-wide/high16 v2, -0x3fc2000000000000L # -30.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v5, v0 */
java.lang.Math .sin ( v5,v6 );
/* move-result-wide v5 */
/* mul-double/2addr v2, v5 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v2 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
/* :pswitch_5 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v9 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v9 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v2 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* const-wide/high16 v0, -0x3fc2000000000000L # -30.0 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v2 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v1 */
/* const-wide/high16 v0, -0x3fc2000000000000L # -30.0 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v2 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v1 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v1, v14 */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_1
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->t:I */
int v2 = 3; // const/4 v2, 0x3
/* if-ne v0, v2, :cond_2 */
v0 = this.x;
/* const/16 v2, 0x8 */
v0 = (( java.util.Random ) v0 ).nextInt ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/Random;->nextInt(I)I
/* packed-switch v0, :pswitch_data_1 */
/* goto/16 :goto_0 */
/* :pswitch_6 */
v0 = this.n;
int v2 = 3; // const/4 v2, 0x3
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* iget v4, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* iget v5, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
/* :pswitch_7 */
v0 = this.n;
int v2 = 3; // const/4 v2, 0x3
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* iget v4, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* iget v5, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* move v1, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
/* :pswitch_8 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v9 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v6, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v9 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v7, v0, v2 */
v2 = this.n;
int v4 = 2; // const/4 v4, 0x2
/* iget v5, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v3, v14 */
/* invoke-virtual/range {v2 ..v7}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* const-wide/high16 v2, -0x3fb2000000000000L # -60.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v4, v0 */
java.lang.Math .cos ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v2 */
/* const-wide/high16 v2, -0x3fb2000000000000L # -60.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v5, v0 */
java.lang.Math .sin ( v5,v6 );
/* move-result-wide v5 */
/* mul-double/2addr v2, v5 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v2 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
/* :pswitch_9 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v9 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v9 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v2 */
v0 = this.n;
int v2 = 2; // const/4 v2, 0x2
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* const-wide/high16 v0, -0x3fb2000000000000L # -60.0 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v2 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v1 */
/* const-wide/high16 v0, -0x3fb2000000000000L # -60.0 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v2 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v1 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v1, v14 */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
/* :pswitch_a */
/* const-wide/high16 v0, 0x404e000000000000L # 60.0 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v2 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v1 */
/* const-wide/high16 v0, 0x404e000000000000L # 60.0 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v2 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v1 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v1, v14 */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* const-wide/high16 v0, -0x3fb2000000000000L # -60.0 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v2 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v1 */
/* const-wide/high16 v0, -0x3fb2000000000000L # -60.0 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v2 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v1 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v1, v14 */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* iget v4, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* iget v5, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* move v1, v14 */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
/* :pswitch_b */
/* const-wide/high16 v2, 0x404e000000000000L # 60.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v4, v0 */
java.lang.Math .cos ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v2 */
/* const-wide/high16 v2, 0x404e000000000000L # 60.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v5, v0 */
java.lang.Math .sin ( v5,v6 );
/* move-result-wide v5 */
/* mul-double/2addr v2, v5 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v2 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* const-wide/high16 v0, -0x3fb2000000000000L # -60.0 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v2 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v1 */
/* const-wide/high16 v0, -0x3fb2000000000000L # -60.0 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v2 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v1 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v1, v14 */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* iget v4, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* iget v5, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* move v1, v14 */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
/* :pswitch_c */
/* const-wide/high16 v2, 0x404e000000000000L # 60.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v4, v0 */
java.lang.Math .cos ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v2 */
/* const-wide/high16 v2, 0x404e000000000000L # 60.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v5, v0 */
java.lang.Math .sin ( v5,v6 );
/* move-result-wide v5 */
/* mul-double/2addr v2, v5 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v2 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* const-wide/high16 v2, -0x3fb2000000000000L # -60.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v4, v0 */
java.lang.Math .cos ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v6, v0, v2 */
/* const-wide/high16 v2, -0x3fb2000000000000L # -60.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v4, v0 */
java.lang.Math .sin ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v7, v0, v2 */
v2 = this.n;
/* iget v5, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v3, v14 */
/* move v4, v14 */
/* invoke-virtual/range {v2 ..v7}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* iget v4, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* iget v5, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
/* :pswitch_d */
/* const-wide/high16 v2, 0x404e000000000000L # 60.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v4, v0 */
java.lang.Math .cos ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v2 */
/* const-wide/high16 v2, 0x404e000000000000L # 60.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v5, v0 */
java.lang.Math .sin ( v5,v6 );
/* move-result-wide v5 */
/* mul-double/2addr v2, v5 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v2 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* const-wide/high16 v2, -0x3fb2000000000000L # -60.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v4, v0 */
java.lang.Math .cos ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v2 */
/* const-wide/high16 v2, -0x3fb2000000000000L # -60.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v5, v0 */
java.lang.Math .sin ( v5,v6 );
/* move-result-wide v5 */
/* mul-double/2addr v2, v5 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v2 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* iget v4, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* iget v5, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_2
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->t:I */
int v2 = 4; // const/4 v2, 0x4
/* if-ne v0, v2, :cond_12 */
v0 = this.x;
/* const/16 v2, 0x10 */
v0 = (( java.util.Random ) v0 ).nextInt ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/Random;->nextInt(I)I
/* if-nez v0, :cond_3 */
v0 = this.n;
int v2 = 4; // const/4 v2, 0x4
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* iget v4, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* iget v5, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_3
/* if-ne v0, v14, :cond_4 */
v0 = this.n;
int v2 = 4; // const/4 v2, 0x4
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* iget v4, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* iget v5, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* move v1, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_4
int v2 = 2; // const/4 v2, 0x2
/* if-ne v0, v2, :cond_5 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v9 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v6, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v9 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v7, v0, v2 */
v2 = this.n;
int v4 = 3; // const/4 v4, 0x3
/* iget v5, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v3, v14 */
/* invoke-virtual/range {v2 ..v7}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* const-wide v2, -0x3fa9800000000000L # -90.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v4, v0 */
java.lang.Math .cos ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v2 */
/* const-wide v2, -0x3fa9800000000000L # -90.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v5, v0 */
java.lang.Math .sin ( v5,v6 );
/* move-result-wide v5 */
/* mul-double/2addr v2, v5 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v2 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_5
int v2 = 3; // const/4 v2, 0x3
/* if-ne v0, v2, :cond_6 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v9 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v9 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v2 */
v0 = this.n;
int v2 = 3; // const/4 v2, 0x3
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* const-wide v0, -0x3fa9800000000000L # -90.0 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v2 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v1 */
/* const-wide v0, -0x3fa9800000000000L # -90.0 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v2 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v1 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v1, v14 */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_6
int v2 = 4; // const/4 v2, 0x4
/* if-ne v0, v2, :cond_7 */
/* const-wide/high16 v2, 0x404e000000000000L # 60.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v4, v0 */
java.lang.Math .cos ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v6, v0, v2 */
/* const-wide/high16 v2, 0x404e000000000000L # 60.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v4, v0 */
java.lang.Math .sin ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v7, v0, v2 */
v2 = this.n;
int v4 = 2; // const/4 v4, 0x2
/* iget v5, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v3, v14 */
/* invoke-virtual/range {v2 ..v7}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* const-wide/high16 v2, -0x3fb2000000000000L # -60.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v4, v0 */
java.lang.Math .cos ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v2 */
/* const-wide/high16 v2, -0x3fb2000000000000L # -60.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v5, v0 */
java.lang.Math .sin ( v5,v6 );
/* move-result-wide v5 */
/* mul-double/2addr v2, v5 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v2 */
v0 = this.n;
int v2 = 2; // const/4 v2, 0x2
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_7
int v2 = 5; // const/4 v2, 0x5
/* if-ne v0, v2, :cond_8 */
/* const-wide/high16 v2, 0x404e000000000000L # 60.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v4, v0 */
java.lang.Math .cos ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v2 */
/* const-wide/high16 v2, 0x404e000000000000L # 60.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v5, v0 */
java.lang.Math .sin ( v5,v6 );
/* move-result-wide v5 */
/* mul-double/2addr v2, v5 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v2 */
v0 = this.n;
int v2 = 2; // const/4 v2, 0x2
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* const-wide/high16 v0, -0x3fb2000000000000L # -60.0 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v2 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v1 */
/* const-wide/high16 v0, -0x3fb2000000000000L # -60.0 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v2 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v1 */
v0 = this.n;
int v2 = 2; // const/4 v2, 0x2
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v1, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_8
int v2 = 6; // const/4 v2, 0x6
/* if-ne v0, v2, :cond_9 */
/* const-wide v0, 0x4056800000000000L # 90.0 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v2 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v1 */
/* const-wide v0, 0x4056800000000000L # 90.0 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v2 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v1 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v1, v14 */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v0, v0 */
java.lang.Math .cos ( v0,v1 );
/* move-result-wide v0 */
/* mul-double/2addr v0, v9 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v1 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v0, v0 */
java.lang.Math .sin ( v0,v1 );
/* move-result-wide v0 */
/* mul-double/2addr v0, v9 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v1 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v1, v14 */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* const-wide/high16 v0, -0x3fc2000000000000L # -30.0 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v2 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v1 */
/* const-wide/high16 v0, -0x3fc2000000000000L # -30.0 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v2 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v1 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v1, v14 */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* const-wide v0, -0x3fa9800000000000L # -90.0 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v2 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v1 */
/* const-wide v0, -0x3fa9800000000000L # -90.0 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v2 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v1 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v1, v14 */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_9
int v2 = 7; // const/4 v2, 0x7
/* if-ne v0, v2, :cond_a */
/* const-wide v2, 0x4056800000000000L # 90.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v4, v0 */
java.lang.Math .cos ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v2 */
/* const-wide v2, 0x4056800000000000L # 90.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v5, v0 */
java.lang.Math .sin ( v5,v6 );
/* move-result-wide v5 */
/* mul-double/2addr v2, v5 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v2 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v0, v0 */
java.lang.Math .cos ( v0,v1 );
/* move-result-wide v0 */
/* mul-double/2addr v0, v9 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v1 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v0, v0 */
java.lang.Math .sin ( v0,v1 );
/* move-result-wide v0 */
/* mul-double/2addr v0, v9 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v1 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v1, v14 */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* const-wide/high16 v0, -0x3fc2000000000000L # -30.0 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v2 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v1 */
/* const-wide/high16 v0, -0x3fc2000000000000L # -30.0 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v2 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v1 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v1, v14 */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* const-wide v0, -0x3fa9800000000000L # -90.0 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v2 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v1 */
/* const-wide v0, -0x3fa9800000000000L # -90.0 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v2 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v1 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v1, v14 */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_a
/* const/16 v2, 0x8 */
/* if-ne v0, v2, :cond_b */
/* const-wide v2, 0x4056800000000000L # 90.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v4, v0 */
java.lang.Math .cos ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v2 */
/* const-wide v2, 0x4056800000000000L # 90.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v5, v0 */
java.lang.Math .sin ( v5,v6 );
/* move-result-wide v5 */
/* mul-double/2addr v2, v5 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v2 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v9 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v9 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v2 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* const-wide/high16 v0, -0x3fc2000000000000L # -30.0 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v2 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v1 */
/* const-wide/high16 v0, -0x3fc2000000000000L # -30.0 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v2 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v1 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v1, v14 */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* const-wide v0, -0x3fa9800000000000L # -90.0 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v2 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v1 */
/* const-wide v0, -0x3fa9800000000000L # -90.0 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v2 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v1 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v1, v14 */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_b
/* const/16 v2, 0x9 */
/* if-ne v0, v2, :cond_c */
/* const-wide v2, 0x4056800000000000L # 90.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v4, v0 */
java.lang.Math .cos ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v2 */
/* const-wide v2, 0x4056800000000000L # 90.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v5, v0 */
java.lang.Math .sin ( v5,v6 );
/* move-result-wide v5 */
/* mul-double/2addr v2, v5 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v2 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v9 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v9 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v2 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* const-wide/high16 v2, -0x3fc2000000000000L # -30.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v4, v0 */
java.lang.Math .cos ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v2 */
/* const-wide/high16 v2, -0x3fc2000000000000L # -30.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v5, v0 */
java.lang.Math .sin ( v5,v6 );
/* move-result-wide v5 */
/* mul-double/2addr v2, v5 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v2 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* const-wide v0, -0x3fa9800000000000L # -90.0 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v2 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v1 */
/* const-wide v0, -0x3fa9800000000000L # -90.0 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v2 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v1 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v1, v14 */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_c
/* const/16 v2, 0xa */
/* if-ne v0, v2, :cond_d */
/* const-wide v2, 0x4056800000000000L # 90.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v4, v0 */
java.lang.Math .cos ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v2 */
/* const-wide v2, 0x4056800000000000L # 90.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v5, v0 */
java.lang.Math .sin ( v5,v6 );
/* move-result-wide v5 */
/* mul-double/2addr v2, v5 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v2 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v9 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v9 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v2 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* const-wide/high16 v2, -0x3fc2000000000000L # -30.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v4, v0 */
java.lang.Math .cos ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v2 */
/* const-wide/high16 v2, -0x3fc2000000000000L # -30.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v5, v0 */
java.lang.Math .sin ( v5,v6 );
/* move-result-wide v5 */
/* mul-double/2addr v2, v5 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v2 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* const-wide v2, -0x3fa9800000000000L # -90.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v4, v0 */
java.lang.Math .cos ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v2 */
/* const-wide v2, -0x3fa9800000000000L # -90.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v5, v0 */
java.lang.Math .sin ( v5,v6 );
/* move-result-wide v5 */
/* mul-double/2addr v2, v5 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v2 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_d
/* const/16 v2, 0xb */
/* if-ne v0, v2, :cond_e */
/* const-wide v2, 0x4056800000000000L # 90.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v4, v0 */
java.lang.Math .cos ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v2 */
/* const-wide v2, 0x4056800000000000L # 90.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v5, v0 */
java.lang.Math .sin ( v5,v6 );
/* move-result-wide v5 */
/* mul-double/2addr v2, v5 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v2 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
v2 = this.n;
int v4 = 2; // const/4 v4, 0x2
/* iget v5, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* iget v6, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* iget v7, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* move v3, v14 */
/* invoke-virtual/range {v2 ..v7}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* const-wide v2, -0x3fa9800000000000L # -90.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v4, v0 */
java.lang.Math .cos ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v2 */
/* const-wide v2, -0x3fa9800000000000L # -90.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v5, v0 */
java.lang.Math .sin ( v5,v6 );
/* move-result-wide v5 */
/* mul-double/2addr v2, v5 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v2 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_e
/* const/16 v2, 0xc */
/* if-ne v0, v2, :cond_f */
/* const-wide/high16 v2, 0x404e000000000000L # 60.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v4, v0 */
java.lang.Math .cos ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v2 */
/* const-wide/high16 v2, 0x404e000000000000L # 60.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v5, v0 */
java.lang.Math .sin ( v5,v6 );
/* move-result-wide v5 */
/* mul-double/2addr v2, v5 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v2 */
v0 = this.n;
int v2 = 2; // const/4 v2, 0x2
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* const-wide/high16 v2, -0x3fc2000000000000L # -30.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v4, v0 */
java.lang.Math .cos ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v6, v0, v2 */
/* const-wide/high16 v2, -0x3fc2000000000000L # -30.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v4, v0 */
java.lang.Math .sin ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v7, v0, v2 */
v2 = this.n;
/* iget v5, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v3, v14 */
/* move v4, v14 */
/* invoke-virtual/range {v2 ..v7}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* const-wide v2, -0x3fa9800000000000L # -90.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v4, v0 */
java.lang.Math .cos ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v2 */
/* const-wide v2, -0x3fa9800000000000L # -90.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v5, v0 */
java.lang.Math .sin ( v5,v6 );
/* move-result-wide v5 */
/* mul-double/2addr v2, v5 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v2 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_f
/* const/16 v2, 0xd */
/* if-ne v0, v2, :cond_10 */
/* const-wide v2, 0x4056800000000000L # 90.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v4, v0 */
java.lang.Math .cos ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v2 */
/* const-wide v2, 0x4056800000000000L # 90.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v5, v0 */
java.lang.Math .sin ( v5,v6 );
/* move-result-wide v5 */
/* mul-double/2addr v2, v5 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v2 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* const-wide/high16 v0, -0x3fb2000000000000L # -60.0 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v2 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v1 */
/* const-wide/high16 v0, -0x3fb2000000000000L # -60.0 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v2 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v1 */
v0 = this.n;
int v2 = 2; // const/4 v2, 0x2
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v1, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v0, v0 */
java.lang.Math .cos ( v0,v1 );
/* move-result-wide v0 */
/* mul-double/2addr v0, v9 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v1 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v0, v0 */
java.lang.Math .sin ( v0,v1 );
/* move-result-wide v0 */
/* mul-double/2addr v0, v9 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v1 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v1, v14 */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_10
/* const/16 v2, 0xe */
/* if-ne v0, v2, :cond_11 */
/* const-wide/high16 v0, 0x404e000000000000L # 60.0 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v2 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v1 */
/* const-wide/high16 v0, 0x404e000000000000L # 60.0 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v2 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v1 */
v0 = this.n;
int v2 = 2; // const/4 v2, 0x2
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v1, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* const-wide/high16 v0, -0x3fb2000000000000L # -60.0 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v2 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v1 */
/* const-wide/high16 v0, -0x3fb2000000000000L # -60.0 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v2, v2 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v1 */
v0 = this.n;
int v2 = 2; // const/4 v2, 0x2
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v1, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_11
/* const/16 v2, 0xf */
/* if-ne v0, v2, :cond_0 */
/* const-wide/high16 v2, 0x404e000000000000L # 60.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v4, v0 */
java.lang.Math .cos ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v2 */
/* const-wide/high16 v2, 0x404e000000000000L # 60.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v5, v0 */
java.lang.Math .sin ( v5,v6 );
/* move-result-wide v5 */
/* mul-double/2addr v2, v5 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v2 */
v0 = this.n;
int v2 = 2; // const/4 v2, 0x2
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* const-wide/high16 v2, -0x3fb2000000000000L # -60.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v4, v0 */
java.lang.Math .cos ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v2 */
/* const-wide/high16 v2, -0x3fb2000000000000L # -60.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* float-to-double v5, v0 */
java.lang.Math .sin ( v5,v6 );
/* move-result-wide v5 */
/* mul-double/2addr v2, v5 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v2 */
v0 = this.n;
int v2 = 2; // const/4 v2, 0x2
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_12
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->t:I */
int v2 = 5; // const/4 v2, 0x5
/* if-ne v0, v2, :cond_23 */
v0 = this.x;
/* const/16 v2, 0x11 */
v0 = (( java.util.Random ) v0 ).nextInt ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/Random;->nextInt(I)I
/* if-ne v0, v14, :cond_13 */
v0 = this.n;
int v2 = 5; // const/4 v2, 0x5
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* iget v4, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* iget v5, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_13
int v2 = 2; // const/4 v2, 0x2
/* if-ne v0, v2, :cond_14 */
v0 = this.n;
int v2 = 5; // const/4 v2, 0x5
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* iget v4, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* iget v5, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* move v1, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_14
int v2 = 3; // const/4 v2, 0x3
/* if-ne v0, v2, :cond_15 */
v0 = this.n;
int v2 = 6; // const/4 v2, 0x6
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* iget v4, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* iget v5, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v1, 0x3f490fda */
/* sub-float/2addr v0, v1 */
/* float-to-double v0, v0 */
java.lang.Math .cos ( v0,v1 );
/* move-result-wide v0 */
/* mul-double/2addr v0, v11 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v1 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v1, 0x3f490fda */
/* sub-float/2addr v0, v1 */
/* float-to-double v0, v0 */
java.lang.Math .sin ( v0,v1 );
/* move-result-wide v0 */
/* mul-double/2addr v0, v11 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v1 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v1, v14 */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_15
int v2 = 4; // const/4 v2, 0x4
/* if-ne v0, v2, :cond_16 */
v0 = this.n;
int v2 = 6; // const/4 v2, 0x6
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* iget v4, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* iget v5, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x3f490fda */
/* sub-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x3f490fda */
/* sub-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v2 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_16
int v2 = 5; // const/4 v2, 0x5
/* if-ne v0, v2, :cond_17 */
v0 = this.n;
int v2 = 6; // const/4 v2, 0x6
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* iget v4, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* iget v5, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* move v1, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v1, 0x3f490fda */
/* sub-float/2addr v0, v1 */
/* float-to-double v0, v0 */
java.lang.Math .cos ( v0,v1 );
/* move-result-wide v0 */
/* mul-double/2addr v0, v11 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v1 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v1, 0x3f490fda */
/* sub-float/2addr v0, v1 */
/* float-to-double v0, v0 */
java.lang.Math .sin ( v0,v1 );
/* move-result-wide v0 */
/* mul-double/2addr v0, v11 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v1 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v1, v14 */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_17
int v2 = 6; // const/4 v2, 0x6
/* if-ne v0, v2, :cond_18 */
v2 = this.n;
int v4 = 6; // const/4 v4, 0x6
/* iget v5, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* iget v6, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* iget v7, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* move v3, v14 */
/* invoke-virtual/range {v2 ..v7}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x3f490fda */
/* sub-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x3f490fda */
/* sub-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v2 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_18
int v2 = 7; // const/4 v2, 0x7
/* if-ne v0, v2, :cond_19 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x3fc90fda */
/* sub-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v9 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x3fc90fda */
/* sub-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v9 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v2 */
/* const-wide/high16 v2, -0x3fc2000000000000L # -30.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v6, 0x3fc90fda */
/* sub-float/2addr v0, v6 */
/* float-to-double v6, v0 */
java.lang.Math .cos ( v6,v7 );
/* move-result-wide v6 */
/* mul-double/2addr v2, v6 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v6, v0, v2 */
/* const-wide/high16 v2, -0x3fc2000000000000L # -30.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v7, 0x3fc90fda */
/* sub-float/2addr v0, v7 */
/* float-to-double v7, v0 */
java.lang.Math .sin ( v7,v8 );
/* move-result-wide v7 */
/* mul-double/2addr v2, v7 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v7, v0, v2 */
v0 = this.n;
int v2 = 2; // const/4 v2, 0x2
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
v0 = this.n;
int v2 = 2; // const/4 v2, 0x2
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v4, v6 */
/* move v5, v7 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_19
/* const/16 v2, 0x8 */
/* if-ne v0, v2, :cond_1a */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v1, 0x3fc90fda */
/* sub-float/2addr v0, v1 */
/* float-to-double v0, v0 */
java.lang.Math .cos ( v0,v1 );
/* move-result-wide v0 */
/* mul-double/2addr v0, v9 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v1 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v1, 0x3fc90fda */
/* sub-float/2addr v0, v1 */
/* float-to-double v0, v0 */
java.lang.Math .sin ( v0,v1 );
/* move-result-wide v0 */
/* mul-double/2addr v0, v9 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v1 */
/* const-wide/high16 v0, -0x3fc2000000000000L # -30.0 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v3, 0x3fc90fda */
/* sub-float/2addr v2, v3 */
/* float-to-double v2, v2 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v6, v0, v1 */
/* const-wide/high16 v0, -0x3fc2000000000000L # -30.0 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v3, 0x3fc90fda */
/* sub-float/2addr v2, v3 */
/* float-to-double v2, v2 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v7, v0, v1 */
v0 = this.n;
int v2 = 2; // const/4 v2, 0x2
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v1, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
v0 = this.n;
int v2 = 2; // const/4 v2, 0x2
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v1, v14 */
/* move v4, v6 */
/* move v5, v7 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_1a
/* const/16 v2, 0x9 */
/* if-ne v0, v2, :cond_1b */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x3fc90fda */
/* sub-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v9 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v6, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x3fc90fda */
/* sub-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v9 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v7, v0, v2 */
/* const-wide/high16 v2, -0x3fc2000000000000L # -30.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v4, 0x3fc90fda */
/* sub-float/2addr v0, v4 */
/* float-to-double v4, v0 */
java.lang.Math .cos ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v8, v0, v2 */
/* const-wide/high16 v2, -0x3fc2000000000000L # -30.0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v4, 0x3fc90fda */
/* sub-float/2addr v0, v4 */
/* float-to-double v4, v0 */
java.lang.Math .sin ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v9, v0, v2 */
v2 = this.n;
int v4 = 2; // const/4 v4, 0x2
/* iget v5, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v3, v14 */
/* invoke-virtual/range {v2 ..v7}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
v0 = this.n;
int v2 = 2; // const/4 v2, 0x2
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v4, v8 */
/* move v5, v9 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_1b
/* const/16 v2, 0xa */
/* if-ne v0, v2, :cond_1c */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x3f490fda */
/* sub-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x3f490fda */
/* sub-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v2 */
/* const-wide v2, -0x3fbaca3d60000000L # -42.42000198364258 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* sub-float/2addr v0, v13 */
/* float-to-double v6, v0 */
java.lang.Math .cos ( v6,v7 );
/* move-result-wide v6 */
/* mul-double/2addr v2, v6 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v6, v0, v2 */
/* const-wide v2, -0x3fbaca3d60000000L # -42.42000198364258 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* sub-float/2addr v0, v13 */
/* float-to-double v7, v0 */
java.lang.Math .sin ( v7,v8 );
/* move-result-wide v7 */
/* mul-double/2addr v2, v7 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v7, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x407b53d0 */
/* sub-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v8, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x407b53d0 */
/* sub-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v9, v0, v2 */
/* const-wide v2, -0x3fbaca3d60000000L # -42.42000198364258 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v10, 0x40afeddf */
/* sub-float/2addr v0, v10 */
/* float-to-double v10, v0 */
java.lang.Math .cos ( v10,v11 );
/* move-result-wide v10 */
/* mul-double/2addr v2, v10 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v10, v0, v2 */
/* const-wide v2, -0x3fbaca3d60000000L # -42.42000198364258 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v11, 0x40afeddf */
/* sub-float/2addr v0, v11 */
/* float-to-double v11, v0 */
java.lang.Math .sin ( v11,v12 );
/* move-result-wide v11 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v11, v0, v2 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* move v4, v6 */
/* move v5, v7 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* move v4, v8 */
/* move v5, v9 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* move v4, v10 */
/* move v5, v11 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_1c
/* const/16 v2, 0xb */
/* if-ne v0, v2, :cond_1d */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x3f490fda */
/* sub-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x3f490fda */
/* sub-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* sub-float/2addr v0, v13 */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v6, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* sub-float/2addr v0, v13 */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v7, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x3fc90fda */
/* add-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v9 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v8, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x3fc90fda */
/* add-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v9 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v9, v0, v2 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* move v4, v6 */
/* move v5, v7 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
v0 = this.n;
int v2 = 2; // const/4 v2, 0x2
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v4, v8 */
/* move v5, v9 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_1d
/* const/16 v2, 0xc */
/* if-ne v0, v2, :cond_1e */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x3f490fda */
/* sub-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x3f490fda */
/* sub-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* sub-float/2addr v0, v13 */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v6, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* sub-float/2addr v0, v13 */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v7, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x3fc90fda */
/* add-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v9 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v8, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x3fc90fda */
/* add-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v9 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v9, v0, v2 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v1, v14 */
/* move v2, v14 */
/* move v4, v6 */
/* move v5, v7 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
v0 = this.n;
int v2 = 2; // const/4 v2, 0x2
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v1, v14 */
/* move v4, v8 */
/* move v5, v9 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_1e
/* const/16 v2, 0xd */
/* if-ne v0, v2, :cond_1f */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x3f490fda */
/* sub-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x3f490fda */
/* sub-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* sub-float/2addr v0, v13 */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v6, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* sub-float/2addr v0, v13 */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v7, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x3fc90fda */
/* add-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v9 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v8, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x3fc90fda */
/* add-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v9 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v9, v0, v2 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
v2 = this.n;
/* iget v5, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v3, v14 */
/* move v4, v14 */
/* invoke-virtual/range {v2 ..v7}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
v0 = this.n;
int v2 = 2; // const/4 v2, 0x2
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v4, v8 */
/* move v5, v9 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_1f
/* const/16 v2, 0xe */
/* if-ne v0, v2, :cond_20 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v1, 0x3f490fda */
/* sub-float/2addr v0, v1 */
/* float-to-double v0, v0 */
java.lang.Math .cos ( v0,v1 );
/* move-result-wide v0 */
/* mul-double/2addr v0, v11 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v1 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v1, 0x3f490fda */
/* sub-float/2addr v0, v1 */
/* float-to-double v0, v0 */
java.lang.Math .sin ( v0,v1 );
/* move-result-wide v0 */
/* mul-double/2addr v0, v11 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v1 */
/* const-wide v0, -0x3fbaca3d60000000L # -42.42000198364258 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* sub-float/2addr v2, v13 */
/* float-to-double v2, v2 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v6, v0, v1 */
/* const-wide v0, -0x3fbaca3d60000000L # -42.42000198364258 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* sub-float/2addr v2, v13 */
/* float-to-double v2, v2 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v7, v0, v1 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v1, 0x407b53d0 */
/* sub-float/2addr v0, v1 */
/* float-to-double v0, v0 */
java.lang.Math .cos ( v0,v1 );
/* move-result-wide v0 */
/* mul-double/2addr v0, v11 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v8, v0, v1 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v1, 0x407b53d0 */
/* sub-float/2addr v0, v1 */
/* float-to-double v0, v0 */
java.lang.Math .sin ( v0,v1 );
/* move-result-wide v0 */
/* mul-double/2addr v0, v11 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v9, v0, v1 */
/* const-wide v0, -0x3fbaca3d60000000L # -42.42000198364258 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v3, 0x40afeddf */
/* sub-float/2addr v2, v3 */
/* float-to-double v2, v2 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v10, v0, v1 */
/* const-wide v0, -0x3fbaca3d60000000L # -42.42000198364258 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v3, 0x40afeddf */
/* sub-float/2addr v2, v3 */
/* float-to-double v2, v2 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v11, v0, v1 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v1, v14 */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v1, v14 */
/* move v2, v14 */
/* move v4, v6 */
/* move v5, v7 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v1, v14 */
/* move v2, v14 */
/* move v4, v8 */
/* move v5, v9 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v1, v14 */
/* move v2, v14 */
/* move v4, v10 */
/* move v5, v11 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_20
/* const/16 v2, 0xf */
/* if-ne v0, v2, :cond_21 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x3f490fda */
/* sub-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v6, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x3f490fda */
/* sub-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v7, v0, v2 */
/* const-wide v2, -0x3fbaca3d60000000L # -42.42000198364258 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* sub-float/2addr v0, v13 */
/* float-to-double v4, v0 */
java.lang.Math .cos ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float/2addr v0, v2 */
/* const-wide v2, -0x3fbaca3d60000000L # -42.42000198364258 */
/* iget v4, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* sub-float/2addr v4, v13 */
/* float-to-double v4, v4 */
java.lang.Math .sin ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v2, v2 */
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v8, v2, v3 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v3, 0x407b53d0 */
/* sub-float/2addr v2, v3 */
/* float-to-double v2, v2 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v2, v2 */
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v9, v2, v3 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v3, 0x407b53d0 */
/* sub-float/2addr v2, v3 */
/* float-to-double v2, v2 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v2, v2 */
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v10, v2, v3 */
/* const-wide v2, -0x3fbaca3d60000000L # -42.42000198364258 */
/* iget v4, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v5, 0x40afeddf */
/* sub-float/2addr v4, v5 */
/* float-to-double v4, v4 */
java.lang.Math .cos ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v2, v2 */
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v11, v2, v3 */
/* const-wide v2, -0x3fbaca3d60000000L # -42.42000198364258 */
/* iget v4, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v5, 0x40afeddf */
/* sub-float/2addr v4, v5 */
/* float-to-double v4, v4 */
java.lang.Math .sin ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v2, v2 */
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v12, v2, v3 */
v2 = this.n;
/* iget v5, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v3, v14 */
/* move v4, v14 */
/* invoke-virtual/range {v2 ..v7}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
v2 = this.n;
/* iget v5, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v3, v14 */
/* move v4, v14 */
/* move v6, v0 */
/* move v7, v8 */
/* invoke-virtual/range {v2 ..v7}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
v2 = this.n;
/* iget v5, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v3, v14 */
/* move v4, v14 */
/* move v6, v9 */
/* move v7, v10 */
/* invoke-virtual/range {v2 ..v7}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* move v4, v11 */
/* move v5, v12 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_21
/* const/16 v2, 0x10 */
/* if-ne v0, v2, :cond_22 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x3f490fda */
/* sub-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v6, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x3f490fda */
/* sub-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v7, v0, v2 */
/* const-wide v2, -0x3fbaca3d60000000L # -42.42000198364258 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* sub-float/2addr v0, v13 */
/* float-to-double v4, v0 */
java.lang.Math .cos ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v8, v0, v2 */
/* const-wide v2, -0x3fbaca3d60000000L # -42.42000198364258 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* sub-float/2addr v0, v13 */
/* float-to-double v4, v0 */
java.lang.Math .sin ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v9, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x407b53d0 */
/* sub-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v10, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x407b53d0 */
/* sub-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v11, v0, v2 */
/* const-wide v2, -0x3fbaca3d60000000L # -42.42000198364258 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v4, 0x40afeddf */
/* sub-float/2addr v0, v4 */
/* float-to-double v4, v0 */
java.lang.Math .cos ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v12, v0, v2 */
/* const-wide v2, -0x3fbaca3d60000000L # -42.42000198364258 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v4, 0x40afeddf */
/* sub-float/2addr v0, v4 */
/* float-to-double v4, v0 */
java.lang.Math .sin ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v13, v0, v2 */
v2 = this.n;
/* iget v5, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v3, v14 */
/* move v4, v14 */
/* invoke-virtual/range {v2 ..v7}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* move v4, v8 */
/* move v5, v9 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
v2 = this.n;
/* iget v5, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v3, v14 */
/* move v4, v14 */
/* move v6, v10 */
/* move v7, v11 */
/* invoke-virtual/range {v2 ..v7}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* move v4, v12 */
/* move v5, v13 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_22
/* if-nez v0, :cond_0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x3f490fda */
/* sub-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v6, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x3f490fda */
/* sub-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v7, v0, v2 */
/* const-wide v2, -0x3fbaca3d60000000L # -42.42000198364258 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* sub-float/2addr v0, v13 */
/* float-to-double v4, v0 */
java.lang.Math .cos ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float/2addr v0, v2 */
/* const-wide v2, -0x3fbaca3d60000000L # -42.42000198364258 */
/* iget v4, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* sub-float/2addr v4, v13 */
/* float-to-double v4, v4 */
java.lang.Math .sin ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v2, v2 */
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v8, v2, v3 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v3, 0x407b53d0 */
/* sub-float/2addr v2, v3 */
/* float-to-double v2, v2 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v2, v2 */
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v9, v2, v3 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v3, 0x407b53d0 */
/* sub-float/2addr v2, v3 */
/* float-to-double v2, v2 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v2, v2 */
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v10, v2, v3 */
/* const-wide v2, -0x3fbaca3d60000000L # -42.42000198364258 */
/* iget v4, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v5, 0x40afeddf */
/* sub-float/2addr v4, v5 */
/* float-to-double v4, v4 */
java.lang.Math .cos ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v2, v2 */
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v11, v2, v3 */
/* const-wide v2, -0x3fbaca3d60000000L # -42.42000198364258 */
/* iget v4, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v5, 0x40afeddf */
/* sub-float/2addr v4, v5 */
/* float-to-double v4, v4 */
java.lang.Math .sin ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* double-to-float v2, v2 */
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v12, v2, v3 */
v2 = this.n;
/* iget v5, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v3, v14 */
/* move v4, v14 */
/* invoke-virtual/range {v2 ..v7}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
v2 = this.n;
/* iget v5, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v3, v14 */
/* move v4, v14 */
/* move v6, v0 */
/* move v7, v8 */
/* invoke-virtual/range {v2 ..v7}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* move v4, v9 */
/* move v5, v10 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* move v4, v11 */
/* move v5, v12 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_23
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->t:I */
int v2 = 6; // const/4 v2, 0x6
/* if-ne v0, v2, :cond_0 */
v0 = this.x;
/* const/16 v2, 0xb */
v0 = (( java.util.Random ) v0 ).nextInt ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/Random;->nextInt(I)I
/* if-nez v0, :cond_24 */
v0 = this.n;
int v2 = 6; // const/4 v2, 0x6
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* iget v4, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* iget v5, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_24
/* if-ne v0, v14, :cond_25 */
v0 = this.n;
int v2 = 6; // const/4 v2, 0x6
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* iget v4, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* iget v5, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* move v1, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_25
int v2 = 3; // const/4 v2, 0x3
/* if-ne v0, v2, :cond_26 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* sub-float/2addr v0, v13 */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* sub-float/2addr v0, v13 */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x3fc90fda */
/* add-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v9 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v6, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x3fc90fda */
/* add-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v9 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v7, v0, v2 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
v0 = this.n;
int v2 = 2; // const/4 v2, 0x2
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v1, v14 */
/* move v4, v6 */
/* move v5, v7 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_26
int v2 = 4; // const/4 v2, 0x4
/* if-ne v0, v2, :cond_27 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* sub-float/2addr v0, v13 */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* sub-float/2addr v0, v13 */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x3fc90fda */
/* add-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v9 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v6, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x3fc90fda */
/* add-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v9 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v7, v0, v2 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
v0 = this.n;
int v2 = 2; // const/4 v2, 0x2
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v4, v6 */
/* move v5, v7 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_27
int v2 = 5; // const/4 v2, 0x5
/* if-ne v0, v2, :cond_28 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* sub-float/2addr v0, v13 */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v6, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* sub-float/2addr v0, v13 */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v7, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x3fc90fda */
/* add-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v9 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v8, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x3fc90fda */
/* add-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v9 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v9, v0, v2 */
v2 = this.n;
/* iget v5, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v3, v14 */
/* move v4, v14 */
/* invoke-virtual/range {v2 ..v7}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
v0 = this.n;
int v2 = 2; // const/4 v2, 0x2
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v4, v8 */
/* move v5, v9 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_28
int v2 = 6; // const/4 v2, 0x6
/* if-ne v0, v2, :cond_29 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* sub-float/2addr v0, v13 */
/* float-to-double v0, v0 */
java.lang.Math .cos ( v0,v1 );
/* move-result-wide v0 */
/* mul-double/2addr v0, v11 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v1 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* sub-float/2addr v0, v13 */
/* float-to-double v0, v0 */
java.lang.Math .sin ( v0,v1 );
/* move-result-wide v0 */
/* mul-double/2addr v0, v11 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v1 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v1, 0x3fc90fda */
/* add-float/2addr v0, v1 */
/* float-to-double v0, v0 */
java.lang.Math .cos ( v0,v1 );
/* move-result-wide v0 */
/* mul-double/2addr v0, v9 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v6, v0, v1 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v1, 0x3fc90fda */
/* add-float/2addr v0, v1 */
/* float-to-double v0, v0 */
java.lang.Math .sin ( v0,v1 );
/* move-result-wide v0 */
/* mul-double/2addr v0, v9 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v7, v0, v1 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v1, v14 */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
v0 = this.n;
int v2 = 2; // const/4 v2, 0x2
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v1, v14 */
/* move v4, v6 */
/* move v5, v7 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_29
int v2 = 7; // const/4 v2, 0x7
/* if-ne v0, v2, :cond_2a */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* sub-float/2addr v0, v13 */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v6, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* sub-float/2addr v0, v13 */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v7, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x3f490fda */
/* add-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float/2addr v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v3, 0x3f490fda */
/* add-float/2addr v2, v3 */
/* float-to-double v2, v2 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v2, v2 */
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v8, v2, v3 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* add-float/2addr v2, v13 */
/* float-to-double v2, v2 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v2, v2 */
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v9, v2, v3 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* add-float/2addr v2, v13 */
/* float-to-double v2, v2 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v2, v2 */
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v10, v2, v3 */
v2 = this.n;
/* iget v5, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v3, v14 */
/* move v4, v14 */
/* invoke-virtual/range {v2 ..v7}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
v2 = this.n;
/* iget v5, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v3, v14 */
/* move v4, v14 */
/* move v6, v0 */
/* move v7, v8 */
/* invoke-virtual/range {v2 ..v7}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* move v4, v9 */
/* move v5, v10 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_2a
/* const/16 v2, 0x8 */
/* if-ne v0, v2, :cond_2b */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* sub-float/2addr v0, v13 */
/* float-to-double v0, v0 */
java.lang.Math .cos ( v0,v1 );
/* move-result-wide v0 */
/* mul-double/2addr v0, v11 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v1 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* sub-float/2addr v0, v13 */
/* float-to-double v0, v0 */
java.lang.Math .sin ( v0,v1 );
/* move-result-wide v0 */
/* mul-double/2addr v0, v11 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v1 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v1, 0x3f490fda */
/* add-float/2addr v0, v1 */
/* float-to-double v0, v0 */
java.lang.Math .cos ( v0,v1 );
/* move-result-wide v0 */
/* mul-double/2addr v0, v11 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v6, v0, v1 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v1, 0x3f490fda */
/* add-float/2addr v0, v1 */
/* float-to-double v0, v0 */
java.lang.Math .sin ( v0,v1 );
/* move-result-wide v0 */
/* mul-double/2addr v0, v11 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v7, v0, v1 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* add-float/2addr v0, v13 */
/* float-to-double v0, v0 */
java.lang.Math .cos ( v0,v1 );
/* move-result-wide v0 */
/* mul-double/2addr v0, v11 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v8, v0, v1 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* add-float/2addr v0, v13 */
/* float-to-double v0, v0 */
java.lang.Math .sin ( v0,v1 );
/* move-result-wide v0 */
/* mul-double/2addr v0, v11 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v9, v0, v1 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v1, v14 */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v1, v14 */
/* move v2, v14 */
/* move v4, v6 */
/* move v5, v7 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v1, v14 */
/* move v2, v14 */
/* move v4, v8 */
/* move v5, v9 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_2b
/* const/16 v2, 0x9 */
/* if-ne v0, v2, :cond_2c */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* sub-float/2addr v0, v13 */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v6, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* sub-float/2addr v0, v13 */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v7, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x3f490fda */
/* add-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v8, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x3f490fda */
/* add-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v9, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* add-float/2addr v0, v13 */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v10, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* add-float/2addr v0, v13 */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v11, v0, v2 */
v2 = this.n;
/* iget v5, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v3, v14 */
/* move v4, v14 */
/* invoke-virtual/range {v2 ..v7}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* move v4, v8 */
/* move v5, v9 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v1, v14 */
/* move v2, v14 */
/* move v4, v10 */
/* move v5, v11 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_2c
/* const/16 v2, 0xa */
/* if-ne v0, v2, :cond_2d */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* sub-float/2addr v0, v13 */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v6, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* sub-float/2addr v0, v13 */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v7, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x3f490fda */
/* add-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v8, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x3f490fda */
/* add-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v9, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* add-float/2addr v0, v13 */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v10, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* add-float/2addr v0, v13 */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v11, v0, v2 */
v2 = this.n;
/* iget v5, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v3, v14 */
/* move v4, v14 */
/* invoke-virtual/range {v2 ..v7}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* move v4, v8 */
/* move v5, v9 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* move v4, v10 */
/* move v5, v11 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
} // :cond_2d
int v2 = 2; // const/4 v2, 0x2
/* if-ne v0, v2, :cond_0 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* sub-float/2addr v0, v13 */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v4, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* sub-float/2addr v0, v13 */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v5, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x3f490fda */
/* add-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v6, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* const v2, 0x3f490fda */
/* add-float/2addr v0, v2 */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v7, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* add-float/2addr v0, v13 */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* add-float v8, v0, v2 */
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* add-float/2addr v0, v13 */
/* float-to-double v2, v0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* mul-double/2addr v2, v11 */
/* double-to-float v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* add-float v9, v0, v2 */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* move v4, v6 */
/* move v5, v7 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
v0 = this.n;
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* move v2, v14 */
/* move v4, v8 */
/* move v5, v9 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(IIFFF)V */
/* goto/16 :goto_0 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_3 */
/* :pswitch_4 */
/* :pswitch_5 */
} // .end packed-switch
/* :pswitch_data_1 */
/* .packed-switch 0x0 */
/* :pswitch_6 */
/* :pswitch_7 */
/* :pswitch_8 */
/* :pswitch_9 */
/* :pswitch_a */
/* :pswitch_b */
/* :pswitch_c */
/* :pswitch_d */
} // .end packed-switch
} // .end method
/* # virtual methods */
public final void a ( Long p0 ) {
/* .locals 0 */
/* invoke-super {p0, p1, p2}, Lcom/doodlemobile/basket/game2d/b;->a(J)V */
return;
} // .end method
public final Boolean a ( Object p0 ) {
/* .locals 7 */
int v6 = 1; // const/4 v6, 0x1
v0 = (( com.doodlemobile.basket.util.e ) p1 ).d ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->d()I
/* if-nez v0, :cond_5 */
v0 = this.o;
(( com.doodle.ltcsmyp.a ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyp/a;->c()Lcom/doodle/ltcsmyp/MainActivity;
com.doodle.ltcsmyp.a.a .a ( v0 );
v0 = (( com.doodle.ltcsmyp.a.a ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyp/a/a;->b()Z
/* if-ne v0, v6, :cond_0 */
v0 = this.o;
(( com.doodle.ltcsmyp.a ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyp/a;->c()Lcom/doodle/ltcsmyp/MainActivity;
com.doodle.ltcsmyp.d.f .a ( v0 );
/* const/16 v1, 0x71 */
(( com.doodle.ltcsmyp.d.f ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodle/ltcsmyp/d/f;->a(I)V
} // :cond_0
v0 = this.j;
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.j;
(( com.badlogic.gdx.physics.box2d.Body ) v0 ).getPosition ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/Body;->getPosition()Lcom/badlogic/gdx/math/Vector2;
/* iget v0, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* iput v0, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
v0 = this.j;
(( com.badlogic.gdx.physics.box2d.Body ) v0 ).getPosition ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/Body;->getPosition()Lcom/badlogic/gdx/math/Vector2;
/* iget v0, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* iput v0, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
v0 = this.j;
v0 = (( com.badlogic.gdx.physics.box2d.Body ) v0 ).getAngle ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/Body;->getAngle()F
/* iput v0, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
v0 = this.j;
(( com.badlogic.gdx.physics.box2d.Body ) v0 ).getUserData ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/Body;->getUserData()Ljava/lang/Object;
/* instance-of v0, v0, Lcom/doodle/ltcsmyp/b/g; */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.j;
(( com.badlogic.gdx.physics.box2d.Body ) v0 ).getUserData ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/Body;->getUserData()Ljava/lang/Object;
/* check-cast v0, Lcom/doodle/ltcsmyp/b/g; */
this.k = v0;
v0 = this.k;
v0 = (( com.doodle.ltcsmyp.b.g ) v0 ).k ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyp/b/g;->k()I
/* iput v0, p0, Lcom/doodle/ltcsmyp/b/g;->A:I */
v0 = this.l;
v1 = this.k;
(( com.doodlemobile.basket.game2d.c ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/game2d/c;->b(Lcom/doodlemobile/basket/game2d/a;)V
v0 = this.l;
(( com.doodlemobile.basket.game2d.c ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/game2d/c;->a()V
} // :cond_1
v0 = this.o;
(( com.doodle.ltcsmyp.a ) v0 ).d ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyp/a;->d()Lcom/doodle/ltcsmyp/c/b;
(( com.doodle.ltcsmyp.c.b ) v0 ).u ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyp/c/b;->u()Ljava/util/ArrayList;
this.m = v0;
v0 = this.m;
v1 = this.j;
(( java.util.ArrayList ) v0 ).remove ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
v0 = this.i;
v1 = this.j;
(( com.badlogic.gdx.physics.box2d.World ) v0 ).destroyBody ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/physics/box2d/World;->destroyBody(Lcom/badlogic/gdx/physics/box2d/Body;)V
} // :cond_2
/* invoke-direct {p0}, Lcom/doodle/ltcsmyp/b/g;->a()V */
v0 = this.o;
(( com.doodle.ltcsmyp.a ) v0 ).d ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyp/a;->d()Lcom/doodle/ltcsmyp/c/b;
v1 = this.z;
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->A:I */
/* iget v3, p0, Lcom/doodle/ltcsmyp/b/g;->r:F */
/* iget v4, p0, Lcom/doodle/ltcsmyp/b/g;->s:F */
/* iget v5, p0, Lcom/doodle/ltcsmyp/b/g;->w:F */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodle/ltcsmyp/c/b;->a(Lcom/doodlemobile/basket/graphics/Animation;IFFF)V */
v0 = com.doodle.ltcsmyp.c.b .l ( );
/* if-nez v0, :cond_3 */
v0 = this.o;
(( com.doodle.ltcsmyp.a ) v0 ).d ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyp/a;->d()Lcom/doodle/ltcsmyp/c/b;
this.n = v0;
v0 = this.n;
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = this.n;
(( com.doodle.ltcsmyp.c.b ) v0 ).n ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyp/c/b;->n()V
} // :cond_3
v0 = com.doodle.ltcsmyp.c.b .l ( );
/* if-ne v0, v6, :cond_4 */
v0 = this.o;
(( com.doodle.ltcsmyp.a ) v0 ).d ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyp/a;->d()Lcom/doodle/ltcsmyp/c/b;
this.n = v0;
v0 = this.n;
if ( v0 != null) { // if-eqz v0, :cond_4
v0 = this.n;
(( com.doodle.ltcsmyp.c.b ) v0 ).i ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyp/c/b;->i()V
com.doodle.ltcsmyp.c.b .m ( );
} // :cond_4
/* move v0, v6 */
} // :goto_0
} // :cond_5
int v0 = 0; // const/4 v0, 0x0
} // .end method
public final Boolean a ( Object p0, Object p1 ) {
/* .locals 11 */
v0 = this.n;
/* if-nez v0, :cond_2 */
v0 = this.o;
(( com.doodle.ltcsmyp.a ) v0 ).d ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyp/a;->d()Lcom/doodle/ltcsmyp/c/b;
this.n = v0;
} // :cond_0
/* iget v0, p0, Lcom/doodle/ltcsmyp/b/g;->t:I */
/* packed-switch v0, :pswitch_data_0 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_2
v0 = this.n;
v0 = (( com.doodle.ltcsmyp.c.b ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyp/c/b;->a()Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
/* :pswitch_0 */
v0 = (( com.doodlemobile.basket.util.e ) p1 ).a ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->a()F
v1 = (( com.doodlemobile.basket.util.e ) p1 ).b ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->b()F
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->b:F */
/* sub-float/2addr v0, v2 */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->c:F */
/* sub-float/2addr v1, v2 */
v2 = this.j;
if ( v2 != null) { // if-eqz v2, :cond_3
v2 = this.j;
v2 = (( com.badlogic.gdx.physics.box2d.Body ) v2 ).getAngle ( ); // invoke-virtual {v2}, Lcom/badlogic/gdx/physics/box2d/Body;->getAngle()F
/* float-to-double v3, v0 */
/* float-to-double v5, v2 */
java.lang.Math .cos ( v5,v6 );
/* move-result-wide v5 */
/* mul-double/2addr v3, v5 */
/* float-to-double v5, v1 */
/* float-to-double v7, v2 */
java.lang.Math .sin ( v7,v8 );
/* move-result-wide v7 */
/* mul-double/2addr v5, v7 */
/* sub-double/2addr v3, v5 */
/* double-to-float v3, v3 */
/* iget v4, p0, Lcom/doodle/ltcsmyp/b/g;->b:F */
/* add-float/2addr v3, v4 */
/* float-to-double v4, v0 */
/* float-to-double v6, v2 */
java.lang.Math .sin ( v6,v7 );
/* move-result-wide v6 */
/* mul-double/2addr v4, v6 */
/* float-to-double v0, v1 */
/* float-to-double v6, v2 */
java.lang.Math .cos ( v6,v7 );
/* move-result-wide v6 */
/* mul-double/2addr v0, v6 */
/* add-double/2addr v0, v4 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->c:F */
/* add-float/2addr v0, v1 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->b:F */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->u:F */
/* const/high16 v4, 0x40000000 # 2.0f */
/* div-float/2addr v2, v4 */
/* sub-float/2addr v1, v2 */
/* cmpl-float v1, v3, v1 */
/* if-lez v1, :cond_3 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->b:F */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->u:F */
/* const/high16 v4, 0x40000000 # 2.0f */
/* div-float/2addr v2, v4 */
/* add-float/2addr v1, v2 */
/* cmpg-float v1, v3, v1 */
/* if-gez v1, :cond_3 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->c:F */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->v:F */
/* const/high16 v3, 0x40000000 # 2.0f */
/* div-float/2addr v2, v3 */
/* sub-float/2addr v1, v2 */
/* cmpl-float v1, v0, v1 */
/* if-lez v1, :cond_3 */
/* iget v1, p0, Lcom/doodle/ltcsmyp/b/g;->c:F */
/* iget v2, p0, Lcom/doodle/ltcsmyp/b/g;->v:F */
/* const/high16 v3, 0x40000000 # 2.0f */
/* div-float/2addr v2, v3 */
/* add-float/2addr v1, v2 */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_3 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
if ( v0 != null) { // if-eqz v0, :cond_1
int v0 = 1; // const/4 v0, 0x1
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
/* :pswitch_1 */
v0 = this.j;
if ( v0 != null) { // if-eqz v0, :cond_4
v0 = this.p;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
/* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
/* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
v0 = this.j;
(( com.badlogic.gdx.physics.box2d.Body ) v0 ).getPosition ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/Body;->getPosition()Lcom/badlogic/gdx/math/Vector2;
v1 = this.j;
v1 = (( com.badlogic.gdx.physics.box2d.Body ) v1 ).getAngle ( ); // invoke-virtual {v1}, Lcom/badlogic/gdx/physics/box2d/Body;->getAngle()F
v2 = this.p;
/* new-instance v3, Lcom/badlogic/gdx/math/Vector2; */
/* iget v4, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* iget v5, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* invoke-direct {v3, v4, v5}, Lcom/badlogic/gdx/math/Vector2;-><init>(FF)V */
(( java.util.ArrayList ) v2 ).add ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
v2 = this.p;
/* new-instance v3, Lcom/badlogic/gdx/math/Vector2; */
/* iget v4, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* float-to-double v4, v4 */
/* const-wide/high16 v6, 0x404e000000000000L # 60.0 */
/* float-to-double v8, v1 */
java.lang.Math .cos ( v8,v9 );
/* move-result-wide v8 */
/* mul-double/2addr v6, v8 */
/* add-double/2addr v4, v6 */
/* double-to-float v4, v4 */
/* iget v5, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* float-to-double v5, v5 */
/* const-wide/high16 v7, 0x404e000000000000L # 60.0 */
/* float-to-double v9, v1 */
java.lang.Math .sin ( v9,v10 );
/* move-result-wide v9 */
/* mul-double/2addr v7, v9 */
/* add-double/2addr v5, v7 */
/* double-to-float v5, v5 */
/* invoke-direct {v3, v4, v5}, Lcom/badlogic/gdx/math/Vector2;-><init>(FF)V */
(( java.util.ArrayList ) v2 ).add ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
v2 = this.p;
/* new-instance v3, Lcom/badlogic/gdx/math/Vector2; */
/* iget v4, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* float-to-double v4, v4 */
/* const-wide/high16 v6, 0x404e000000000000L # 60.0 */
/* float-to-double v8, v1 */
java.lang.Math .cos ( v8,v9 );
/* move-result-wide v8 */
/* mul-double/2addr v6, v8 */
/* add-double/2addr v4, v6 */
/* float-to-double v6, v1 */
java.lang.Math .sin ( v6,v7 );
/* move-result-wide v6 */
/* const-wide/high16 v8, 0x404e000000000000L # 60.0 */
/* mul-double/2addr v6, v8 */
/* sub-double/2addr v4, v6 */
/* double-to-float v4, v4 */
/* iget v5, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* float-to-double v5, v5 */
/* const-wide/high16 v7, 0x404e000000000000L # 60.0 */
/* float-to-double v9, v1 */
java.lang.Math .sin ( v9,v10 );
/* move-result-wide v9 */
/* mul-double/2addr v7, v9 */
/* add-double/2addr v5, v7 */
/* float-to-double v7, v1 */
java.lang.Math .cos ( v7,v8 );
/* move-result-wide v7 */
/* const-wide/high16 v9, 0x404e000000000000L # 60.0 */
/* mul-double/2addr v7, v9 */
/* add-double/2addr v5, v7 */
/* double-to-float v5, v5 */
/* invoke-direct {v3, v4, v5}, Lcom/badlogic/gdx/math/Vector2;-><init>(FF)V */
(( java.util.ArrayList ) v2 ).add ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
v2 = this.p;
/* new-instance v3, Lcom/badlogic/gdx/math/Vector2; */
/* iget v4, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* float-to-double v4, v4 */
/* float-to-double v6, v1 */
java.lang.Math .sin ( v6,v7 );
/* move-result-wide v6 */
/* const-wide/high16 v8, 0x404e000000000000L # 60.0 */
/* mul-double/2addr v6, v8 */
/* sub-double/2addr v4, v6 */
/* double-to-float v4, v4 */
/* iget v5, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* float-to-double v5, v5 */
/* float-to-double v7, v1 */
java.lang.Math .cos ( v7,v8 );
/* move-result-wide v7 */
/* const-wide/high16 v9, 0x404e000000000000L # 60.0 */
/* mul-double/2addr v7, v9 */
/* add-double/2addr v5, v7 */
/* double-to-float v5, v5 */
/* invoke-direct {v3, v4, v5}, Lcom/badlogic/gdx/math/Vector2;-><init>(FF)V */
(( java.util.ArrayList ) v2 ).add ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
v2 = this.p;
/* new-instance v3, Lcom/badlogic/gdx/math/Vector2; */
/* iget v4, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* float-to-double v4, v4 */
/* const-wide/high16 v6, 0x404e000000000000L # 60.0 */
/* float-to-double v8, v1 */
java.lang.Math .cos ( v8,v9 );
/* move-result-wide v8 */
/* mul-double/2addr v6, v8 */
/* sub-double/2addr v4, v6 */
/* float-to-double v6, v1 */
java.lang.Math .sin ( v6,v7 );
/* move-result-wide v6 */
/* const-wide/high16 v8, 0x404e000000000000L # 60.0 */
/* mul-double/2addr v6, v8 */
/* sub-double/2addr v4, v6 */
/* double-to-float v4, v4 */
/* iget v5, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* float-to-double v5, v5 */
/* const-wide/high16 v7, 0x404e000000000000L # 60.0 */
/* float-to-double v9, v1 */
java.lang.Math .sin ( v9,v10 );
/* move-result-wide v9 */
/* mul-double/2addr v7, v9 */
/* sub-double/2addr v5, v7 */
/* float-to-double v7, v1 */
java.lang.Math .cos ( v7,v8 );
/* move-result-wide v7 */
/* const-wide/high16 v9, 0x404e000000000000L # 60.0 */
/* mul-double/2addr v7, v9 */
/* add-double/2addr v5, v7 */
/* double-to-float v5, v5 */
/* invoke-direct {v3, v4, v5}, Lcom/badlogic/gdx/math/Vector2;-><init>(FF)V */
(( java.util.ArrayList ) v2 ).add ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
v2 = this.p;
/* new-instance v3, Lcom/badlogic/gdx/math/Vector2; */
/* iget v4, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* float-to-double v4, v4 */
/* const-wide/high16 v6, 0x404e000000000000L # 60.0 */
/* float-to-double v8, v1 */
java.lang.Math .cos ( v8,v9 );
/* move-result-wide v8 */
/* mul-double/2addr v6, v8 */
/* sub-double/2addr v4, v6 */
/* double-to-float v4, v4 */
/* iget v5, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* float-to-double v5, v5 */
/* const-wide/high16 v7, 0x404e000000000000L # 60.0 */
/* float-to-double v9, v1 */
java.lang.Math .sin ( v9,v10 );
/* move-result-wide v9 */
/* mul-double/2addr v7, v9 */
/* sub-double/2addr v5, v7 */
/* double-to-float v5, v5 */
/* invoke-direct {v3, v4, v5}, Lcom/badlogic/gdx/math/Vector2;-><init>(FF)V */
(( java.util.ArrayList ) v2 ).add ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
v2 = this.p;
/* new-instance v3, Lcom/badlogic/gdx/math/Vector2; */
/* iget v4, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* float-to-double v4, v4 */
/* const-wide/high16 v6, 0x404e000000000000L # 60.0 */
/* float-to-double v8, v1 */
java.lang.Math .cos ( v8,v9 );
/* move-result-wide v8 */
/* mul-double/2addr v6, v8 */
/* sub-double/2addr v4, v6 */
/* float-to-double v6, v1 */
java.lang.Math .sin ( v6,v7 );
/* move-result-wide v6 */
/* const-wide/high16 v8, 0x404e000000000000L # 60.0 */
/* mul-double/2addr v6, v8 */
/* add-double/2addr v4, v6 */
/* double-to-float v4, v4 */
/* iget v5, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* float-to-double v5, v5 */
/* const-wide/high16 v7, 0x404e000000000000L # 60.0 */
/* float-to-double v9, v1 */
java.lang.Math .sin ( v9,v10 );
/* move-result-wide v9 */
/* mul-double/2addr v7, v9 */
/* sub-double/2addr v5, v7 */
/* float-to-double v7, v1 */
java.lang.Math .cos ( v7,v8 );
/* move-result-wide v7 */
/* const-wide/high16 v9, 0x404e000000000000L # 60.0 */
/* mul-double/2addr v7, v9 */
/* sub-double/2addr v5, v7 */
/* double-to-float v5, v5 */
/* invoke-direct {v3, v4, v5}, Lcom/badlogic/gdx/math/Vector2;-><init>(FF)V */
(( java.util.ArrayList ) v2 ).add ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
v2 = this.p;
/* new-instance v3, Lcom/badlogic/gdx/math/Vector2; */
/* iget v4, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* float-to-double v4, v4 */
/* float-to-double v6, v1 */
java.lang.Math .sin ( v6,v7 );
/* move-result-wide v6 */
/* const-wide/high16 v8, 0x404e000000000000L # 60.0 */
/* mul-double/2addr v6, v8 */
/* add-double/2addr v4, v6 */
/* double-to-float v4, v4 */
/* iget v5, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* float-to-double v5, v5 */
/* float-to-double v7, v1 */
java.lang.Math .cos ( v7,v8 );
/* move-result-wide v7 */
/* const-wide/high16 v9, 0x404e000000000000L # 60.0 */
/* mul-double/2addr v7, v9 */
/* sub-double/2addr v5, v7 */
/* double-to-float v1, v5 */
/* invoke-direct {v3, v4, v1}, Lcom/badlogic/gdx/math/Vector2;-><init>(FF)V */
(( java.util.ArrayList ) v2 ).add ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
v1 = (( com.doodlemobile.basket.util.e ) p1 ).a ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->a()F
/* iput v1, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
v1 = (( com.doodlemobile.basket.util.e ) p1 ).b ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->b()F
/* iput v1, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
v1 = this.p;
v0 = com.doodle.ltcsmyp.a.d .a ( v1,v0 );
if ( v0 != null) { // if-eqz v0, :cond_4
int v0 = 1; // const/4 v0, 0x1
} // :goto_2
if ( v0 != null) { // if-eqz v0, :cond_1
int v0 = 1; // const/4 v0, 0x1
/* goto/16 :goto_0 */
} // :cond_4
int v0 = 0; // const/4 v0, 0x0
/* :pswitch_data_0 */
/* .packed-switch 0x2 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
