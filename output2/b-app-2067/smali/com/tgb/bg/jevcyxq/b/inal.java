public class inal {
	 /* # instance fields */
	 protected Boolean a;
	 protected Integer b;
	 protected com.tgb.bg.jevcyxq.b.q c;
	 public Boolean d;
	 public Integer e;
	 public Boolean f;
	 public Boolean g;
	 private Integer h;
	 private Integer i;
	 private com.tgb.bg.jevcyxq.views.TGBMainGameActivity j;
	 private Integer k;
	 private Boolean l;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 2 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput v1, p0, Lcom/tgb/bg/jevcyxq/b/am;->i:I */
		 /* iput-boolean v1, p0, Lcom/tgb/bg/jevcyxq/b/am;->d:Z */
		 /* iput-boolean v1, p0, Lcom/tgb/bg/jevcyxq/b/am;->l:Z */
		 /* iput-boolean v1, p0, Lcom/tgb/bg/jevcyxq/b/am;->f:Z */
		 /* iput-boolean v1, p0, Lcom/tgb/bg/jevcyxq/b/am;->g:Z */
		 /* iput-boolean p6, p0, Lcom/tgb/bg/jevcyxq/b/am;->a:Z */
		 /* iput-boolean v1, p0, Lcom/tgb/bg/jevcyxq/b/am;->d:Z */
		 if ( p7 != null) { // if-eqz p7, :cond_0
			 /* iput p7, p0, Lcom/tgb/bg/jevcyxq/b/am;->i:I */
		 } // :cond_0
		 /* iput p8, p0, Lcom/tgb/bg/jevcyxq/b/am;->e:I */
		 /* iput p4, p0, Lcom/tgb/bg/jevcyxq/b/am;->k:I */
		 /* iget v0, p0, Lcom/tgb/bg/jevcyxq/b/am;->k:I */
		 /* if-gtz v0, :cond_1 */
	 } // :goto_0
	 return;
} // :cond_1
this.j = p1;
/* iput p5, p0, Lcom/tgb/bg/jevcyxq/b/am;->b:I */
/* iget v0, p0, Lcom/tgb/bg/jevcyxq/b/am;->k:I */
/* new-array v0, v0, [Lcom/tgb/bg/jevcyxq/b/q; */
this.c = v0;
/* invoke-direct {p0, p2, p3}, Lcom/tgb/bg/jevcyxq/b/am;->b(II)V */
/* iput v1, p0, Lcom/tgb/bg/jevcyxq/b/am;->h:I */
} // .end method
static Integer a ( Integer p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* packed-switch p0, :pswitch_data_0 */
} // :goto_0
/* :pswitch_0 */
/* :pswitch_1 */
int v0 = 2; // const/4 v0, 0x2
/* :pswitch_2 */
int v0 = 4; // const/4 v0, 0x4
/* :pswitch_3 */
int v0 = 3; // const/4 v0, 0x3
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_1 */
/* :pswitch_0 */
/* :pswitch_2 */
/* :pswitch_3 */
} // .end packed-switch
} // .end method
private void b ( Integer p0, Integer p1 ) {
/* .locals 10 */
int v9 = 0; // const/4 v9, 0x0
/* move v4, v9 */
} // :goto_0
/* iget v0, p0, Lcom/tgb/bg/jevcyxq/b/am;->k:I */
/* if-lt v4, v0, :cond_0 */
v0 = this.c;
/* aget-object v0, v0, v9 */
int v1 = 1; // const/4 v1, 0x1
(( com.tgb.bg.jevcyxq.b.q ) v0 ).setVisible ( v1 ); // invoke-virtual {v0, v1}, Lcom/tgb/bg/jevcyxq/b/q;->setVisible(Z)V
return;
} // :cond_0
v8 = this.c;
/* new-instance v0, Lcom/tgb/bg/jevcyxq/b/q; */
v3 = this.j;
/* iget-boolean v1, p0, Lcom/tgb/bg/jevcyxq/b/am;->a:Z */
if ( v1 != null) { // if-eqz v1, :cond_2
/* if-nez v4, :cond_1 */
v1 = this.j;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).g ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->g()Lcom/tgb/bg/jevcyxq/c/w;
v1 = this.q;
(( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) v1 ).clone ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->clone()Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;
/* move-object v5, v1 */
} // :goto_1
/* iget-boolean v7, p0, Lcom/tgb/bg/jevcyxq/b/am;->a:Z */
/* move v1, p1 */
/* move v2, p2 */
/* move-object v6, p0 */
/* invoke-direct/range {v0 ..v7}, Lcom/tgb/bg/jevcyxq/b/q;-><init>(IILcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;ILorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;Lcom/tgb/bg/jevcyxq/b/am;Z)V */
/* aput-object v0, v8, v4 */
v0 = this.j;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v0 ).e ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->e()Lorg/anddev/andengine/entity/scene/Scene;
int v1 = 5; // const/4 v1, 0x5
(( org.anddev.andengine.entity.scene.Scene ) v0 ).getChild ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/entity/scene/Scene;->getChild(I)Lorg/anddev/andengine/entity/IEntity;
v1 = this.c;
/* aget-object v1, v1, v4 */
v0 = this.c;
/* aget-object v0, v0, v4 */
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/am;->b:I */
v1 = com.tgb.bg.jevcyxq.d.a .a ( v1 );
(( com.tgb.bg.jevcyxq.b.q ) v0 ).setRotation ( v1 ); // invoke-virtual {v0, v1}, Lcom/tgb/bg/jevcyxq/b/q;->setRotation(F)V
/* add-int/lit8 v0, v4, 0x1 */
/* move v4, v0 */
} // :cond_1
v1 = this.j;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).g ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->g()Lcom/tgb/bg/jevcyxq/c/w;
v1 = this.r;
(( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) v1 ).clone ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->clone()Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;
/* move-object v5, v1 */
} // :cond_2
/* if-nez v4, :cond_3 */
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/am;->i:I */
/* packed-switch v1, :pswitch_data_0 */
v1 = this.j;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).g ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->g()Lcom/tgb/bg/jevcyxq/c/w;
v1 = this.o;
} // :goto_2
(( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) v1 ).clone ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->clone()Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;
/* move-object v5, v1 */
/* :pswitch_0 */
v1 = this.j;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).g ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->g()Lcom/tgb/bg/jevcyxq/c/w;
v1 = this.F;
/* :pswitch_1 */
v1 = this.j;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).g ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->g()Lcom/tgb/bg/jevcyxq/c/w;
v1 = this.G;
/* :pswitch_2 */
v1 = this.j;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).g ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->g()Lcom/tgb/bg/jevcyxq/c/w;
v1 = this.H;
} // :cond_3
/* rem-int/lit8 v1, v4, 0x2 */
/* if-nez v1, :cond_4 */
v1 = this.j;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).g ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->g()Lcom/tgb/bg/jevcyxq/c/w;
v1 = this.m;
(( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) v1 ).clone ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->clone()Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;
/* move-object v5, v1 */
} // :cond_4
v1 = this.j;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).g ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->g()Lcom/tgb/bg/jevcyxq/c/w;
v1 = this.n;
(( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) v1 ).clone ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->clone()Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;
/* move-object v5, v1 */
/* goto/16 :goto_1 */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
} // .end packed-switch
} // .end method
/* # virtual methods */
public final Integer a ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/tgb/bg/jevcyxq/b/am;->i:I */
} // .end method
final void a ( Integer p0, Integer p1 ) {
/* .locals 9 */
int v6 = 0; // const/4 v6, 0x0
/* move v1, v6 */
/* move v4, v6 */
/* move v5, v6 */
} // :goto_0
int v0 = 6; // const/4 v0, 0x6
/* if-lt v1, v0, :cond_0 */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "R :"; // const-string v1, "R :"
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = " C : "; // const-string v1, " C : "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = " r : "; // const-string v1, " r : "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = " c : "; // const-string v1, " c : "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v0 = this.j;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v0 ).i ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->i()Lcom/tgb/bg/jevcyxq/c/z;
v0 = this.a;
/* aget-object v0, v0, v5 */
/* aget-object v3, v0, v4 */
/* check-cast v3, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move v2, v6 */
} // :goto_1
v0 = this.c;
/* array-length v0, v0 */
/* if-lt v2, v0, :cond_4 */
return;
} // :cond_0
/* move v2, v6 */
} // :goto_2
/* const/16 v0, 0x8 */
/* if-lt v2, v0, :cond_1 */
/* move v0, v4 */
/* move v2, v5 */
} // :goto_3
/* add-int/lit8 v1, v1, 0x1 */
/* move v4, v0 */
/* move v5, v2 */
} // :cond_1
v0 = this.j;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v0 ).i ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->i()Lcom/tgb/bg/jevcyxq/c/z;
v0 = this.a;
/* aget-object v0, v0, v1 */
/* aget-object v0, v0, v2 */
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = this.j;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v0 ).i ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->i()Lcom/tgb/bg/jevcyxq/c/z;
v0 = this.a;
/* aget-object v0, v0, v1 */
/* aget-object v0, v0, v2 */
/* instance-of v0, v0, Lcom/tgb/bg/jevcyxq/b/aj; */
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = this.j;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v0 ).i ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->i()Lcom/tgb/bg/jevcyxq/c/z;
v0 = this.a;
/* aget-object v0, v0, v1 */
/* aget-object v0, v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
v0 = (( com.tgb.bg.jevcyxq.b.aj ) v0 ).h ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/aj;->h()Z
if ( v0 != null) { // if-eqz v0, :cond_3
/* if-ne p1, v1, :cond_2 */
/* if-eq p2, v2, :cond_3 */
} // :cond_2
v0 = this.j;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v0 ).i ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->i()Lcom/tgb/bg/jevcyxq/c/z;
v0 = this.a;
/* aget-object v0, v0, v1 */
/* aget-object v0, v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
v3 = (( com.tgb.bg.jevcyxq.b.aj ) v0 ).d ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/aj;->d()I
v0 = this.j;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v0 ).i ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->i()Lcom/tgb/bg/jevcyxq/c/z;
v0 = this.a;
/* aget-object v0, v0, p1 */
/* aget-object v0, v0, p2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
v0 = (( com.tgb.bg.jevcyxq.b.aj ) v0 ).d ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/aj;->d()I
/* if-ne v3, v0, :cond_3 */
/* move v0, v2 */
/* move v2, v1 */
} // :cond_3
/* add-int/lit8 v0, v2, 0x1 */
/* move v2, v0 */
} // :cond_4
v0 = this.c;
/* aget-object v0, v0, v2 */
v1 = (( com.tgb.bg.jevcyxq.b.aj ) v3 ).getX ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/b/aj;->getX()F
v6 = (( com.tgb.bg.jevcyxq.b.aj ) v3 ).getY ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/b/aj;->getY()F
(( com.tgb.bg.jevcyxq.b.q ) v0 ).setPosition ( v1, v6 ); // invoke-virtual {v0, v1, v6}, Lcom/tgb/bg/jevcyxq/b/q;->setPosition(FF)V
v0 = this.c;
/* aget-object v0, v0, v2 */
/* iget v1, v3, Lcom/tgb/bg/jevcyxq/b/aj;->a:I */
v1 = com.tgb.bg.jevcyxq.b.am .a ( v1 );
v1 = com.tgb.bg.jevcyxq.d.a .a ( v1 );
(( com.tgb.bg.jevcyxq.b.q ) v0 ).setRotation ( v1 ); // invoke-virtual {v0, v1}, Lcom/tgb/bg/jevcyxq/b/q;->setRotation(v1, p0 */
		 /* iput v0, v1, Lcom/tgb/bg/jevcyxq/b/aj;->a:I */
		 /* move/from16 v0, p7 */
		 /* move-object v1, p0 */
		 /* iput-boolean v0, v1, Lcom/tgb/bg/jevcyxq/b/aj;->f:Z */
		 /* move/from16 v0, p6 */
		 /* move-object v1, p0 */
		 /* iput-boolean v0, v1, Lcom/tgb/bg/jevcyxq/b/aj;->i:Z */
		 v4 = this.d;
		 int v5 = 1; // const/4 v5, 0x1
		 /* aget-object v4, v4, v5 */
		 if ( v4 != null) { // if-eqz v4, :cond_4
			 int v4 = 1; // const/4 v4, 0x1
			 /* sub-int v4, p5, v4 */
			 /* iput v4, p0, Lcom/tgb/bg/jevcyxq/b/aj;->g:I */
			 /* iget v4, p0, Lcom/tgb/bg/jevcyxq/b/aj;->g:I */
			 (( com.tgb.bg.jevcyxq.b.aj ) p0 ).setCurrentTileIndex ( v4 ); // invoke-virtual {p0, v4}, Lcom/tgb/bg/jevcyxq/b/aj;->setCurrentTileIndex(I)V
		 } // :cond_4
		 v4 = this.d;
		 int v5 = 1; // const/4 v5, 0x1
		 /* aget-object v4, v4, v5 */
		 /* if-nez v4, :cond_5 */
		 /* iget-boolean v4, p0, Lcom/tgb/bg/jevcyxq/b/aj;->i:Z */
		 if ( v4 != null) { // if-eqz v4, :cond_6
		 } // :cond_5
		 /* new-instance v4, Lorg/anddev/andengine/entity/primitive/Rectangle; */
		 v5 = 		 (( com.tgb.bg.jevcyxq.b.aj ) p0 ).getX ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/b/aj;->getX()F
		 v6 = 		 (( com.tgb.bg.jevcyxq.b.aj ) p0 ).getY ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/b/aj;->getY()F
		 /* const/high16 v7, 0x42940000 # 74.0f */
		 /* const/high16 v8, 0x42940000 # 74.0f */
		 /* invoke-direct {v4, v5, v6, v7, v8}, Lorg/anddev/andengine/entity/primitive/Rectangle;-><init>(FFFF)V */
		 this.l = v4;
		 v4 = this.l;
		 /* const/high16 v5, 0x3f000000 # 0.5f */
		 (( org.anddev.andengine.entity.primitive.Rectangle ) v4 ).setAlpha ( v5 ); // invoke-virtual {v4, v5}, Lorg/anddev/andengine/entity/primitive/Rectangle;->setAlpha(F)V
		 v4 = this.l;
		 /* const/high16 v5, 0x3f000000 # 0.5f */
		 int v6 = 0; // const/4 v6, 0x0
		 int v7 = 0; // const/4 v7, 0x0
		 (( org.anddev.andengine.entity.primitive.Rectangle ) v4 ).setColor ( v5, v6, v7 ); // invoke-virtual {v4, v5, v6, v7}, Lorg/anddev/andengine/entity/primitive/Rectangle;->setColor(FFF)V
		 v4 = this.j;
		 (( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v4 ).e ( ); // invoke-virtual {v4}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->e()Lorg/anddev/andengine/entity/scene/Scene;
		 int v5 = 2; // const/4 v5, 0x2
		 (( org.anddev.andengine.entity.scene.Scene ) v4 ).getChild ( v5 ); // invoke-virtual {v4, v5}, Lorg/anddev/andengine/entity/scene/Scene;->getChild(I)Lorg/anddev/andengine/entity/IEntity;
		 v5 = this.l;
	 } // :cond_6
	 /* iget-boolean v4, p0, Lcom/tgb/bg/jevcyxq/b/aj;->t:Z */
	 if ( v4 != null) { // if-eqz v4, :cond_7
		 /* new-instance v4, Lorg/anddev/andengine/entity/primitive/Rectangle; */
		 v5 = 		 (( com.tgb.bg.jevcyxq.b.aj ) p0 ).getX ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/b/aj;->getX()F
		 v6 = 		 (( com.tgb.bg.jevcyxq.b.aj ) p0 ).getY ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/b/aj;->getY()F
		 /* const/high16 v7, 0x42940000 # 74.0f */
		 /* const/high16 v8, 0x42940000 # 74.0f */
		 /* invoke-direct {v4, v5, v6, v7, v8}, Lorg/anddev/andengine/entity/primitive/Rectangle;-><init>(FFFF)V */
		 this.m = v4;
		 v4 = this.m;
		 /* const/high16 v5, 0x3f000000 # 0.5f */
		 (( org.anddev.andengine.entity.primitive.Rectangle ) v4 ).setAlpha ( v5 ); // invoke-virtual {v4, v5}, Lorg/anddev/andengine/entity/primitive/Rectangle;->setAlpha(F)V
		 v4 = this.m;
		 int v5 = 0; // const/4 v5, 0x0
		 /* const/high16 v6, 0x3f000000 # 0.5f */
		 int v7 = 0; // const/4 v7, 0x0
		 (( org.anddev.andengine.entity.primitive.Rectangle ) v4 ).setColor ( v5, v6, v7 ); // invoke-virtual {v4, v5, v6, v7}, Lorg/anddev/andengine/entity/primitive/Rectangle;->setColor(FFF)V
		 v4 = this.j;
		 (( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v4 ).e ( ); // invoke-virtual {v4}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->e()Lorg/anddev/andengine/entity/scene/Scene;
		 int v5 = 2; // const/4 v5, 0x2
		 (( org.anddev.andengine.entity.scene.Scene ) v4 ).getChild ( v5 ); // invoke-virtual {v4, v5}, Lorg/anddev/andengine/entity/scene/Scene;->getChild(I)Lorg/anddev/andengine/entity/IEntity;
		 v5 = this.m;
	 } // :cond_7
	 /* iget-boolean v4, p0, Lcom/tgb/bg/jevcyxq/b/aj;->o:Z */
	 if ( v4 != null) { // if-eqz v4, :cond_8
		 /* new-instance v4, Lcom/tgb/bg/jevcyxq/refurbished/k; */
		 v5 = 		 (( com.tgb.bg.jevcyxq.b.aj ) p0 ).getX ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/b/aj;->getX()F
		 v6 = 		 (( com.tgb.bg.jevcyxq.b.aj ) p0 ).getY ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/b/aj;->getY()F
		 /* iget v7, p0, Lcom/tgb/bg/jevcyxq/b/aj;->n:I */
		 /* packed-switch v7, :pswitch_data_0 */
		 v7 = this.j;
		 (( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v7 ).g ( ); // invoke-virtual {v7}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->g()Lcom/tgb/bg/jevcyxq/c/w;
		 v7 = this.v;
		 (( org.anddev.andengine.opengl.texture.region.TextureRegion ) v7 ).clone ( ); // invoke-virtual {v7}, Lorg/anddev/andengine/opengl/texture/region/TextureRegion;->clone()Lorg/anddev/andengine/opengl/texture/region/TextureRegion;
	 } // :goto_0
	 /* invoke-direct {v4, v5, v6, v7}, Lcom/tgb/bg/jevcyxq/refurbished/k;-><init>(FFLorg/anddev/andengine/opengl/texture/region/TextureRegion;)V */
	 /* iget v5, p0, Lcom/tgb/bg/jevcyxq/b/aj;->a:I */
	 v5 = 	 com.tgb.bg.jevcyxq.d.a .a ( v5 );
	 (( com.tgb.bg.jevcyxq.refurbished.k ) v4 ).setRotation ( v5 ); // invoke-virtual {v4, v5}, Lcom/tgb/bg/jevcyxq/refurbished/k;->setRotation(F)V
	 v5 = this.j;
	 (( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v5 ).e ( ); // invoke-virtual {v5}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->e()Lorg/anddev/andengine/entity/scene/Scene;
	 int v6 = 7; // const/4 v6, 0x7
	 (( org.anddev.andengine.entity.scene.Scene ) v5 ).getChild ( v6 ); // invoke-virtual {v5, v6}, Lorg/anddev/andengine/entity/scene/Scene;->getChild(I)Lorg/anddev/andengine/entity/IEntity;
} // :cond_8
/* iget v4, p0, Lcom/tgb/bg/jevcyxq/b/aj;->e:I */
int v5 = 1; // const/4 v5, 0x1
/* if-ne v4, v5, :cond_b */
/* new-instance v4, Lorg/anddev/andengine/entity/sprite/AnimatedSprite; */
v5 = (( com.tgb.bg.jevcyxq.b.aj ) p0 ).getX ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/b/aj;->getX()F
v6 = (( com.tgb.bg.jevcyxq.b.aj ) p0 ).getY ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/b/aj;->getY()F
/* iget v7, p0, Lcom/tgb/bg/jevcyxq/b/aj;->q:I */
/* packed-switch v7, :pswitch_data_1 */
v7 = this.j;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v7 ).g ( ); // invoke-virtual {v7}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->g()Lcom/tgb/bg/jevcyxq/c/w;
v7 = this.k;
} // :goto_1
/* invoke-direct {v4, v5, v6, v7}, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;-><init>(FFLorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;)V */
v5 = this.j;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v5 ).e ( ); // invoke-virtual {v5}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->e()Lorg/anddev/andengine/entity/scene/Scene;
int v6 = 7; // const/4 v6, 0x7
(( org.anddev.andengine.entity.scene.Scene ) v5 ).getChild ( v6 ); // invoke-virtual {v5, v6}, Lorg/anddev/andengine/entity/scene/Scene;->getChild(I)Lorg/anddev/andengine/entity/IEntity;
/* iget v5, p0, Lcom/tgb/bg/jevcyxq/b/aj;->a:I */
v5 = com.tgb.bg.jevcyxq.d.a .a ( v5 );
(( org.anddev.andengine.entity.sprite.AnimatedSprite ) v4 ).setRotation ( v5 ); // invoke-virtual {v4, v5}, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->setRotation(F)V
v4 = this.j;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v4 ).j ( ); // invoke-virtual {v4}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->j()Lcom/tgb/bg/jevcyxq/c/g;
(( com.tgb.bg.jevcyxq.c.g ) v4 ).e ( ); // invoke-virtual {v4}, Lcom/tgb/bg/jevcyxq/c/g;->e()Ljava/util/ArrayList;
v12 = (( java.util.ArrayList ) v4 ).size ( ); // invoke-virtual {v4}, Ljava/util/ArrayList;->size()I
v4 = this.j;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v4 ).j ( ); // invoke-virtual {v4}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->j()Lcom/tgb/bg/jevcyxq/c/g;
(( com.tgb.bg.jevcyxq.c.g ) v4 ).e ( ); // invoke-virtual {v4}, Lcom/tgb/bg/jevcyxq/c/g;->e()Ljava/util/ArrayList;
/* new-instance v4, Lcom/tgb/bg/jevcyxq/b/am; */
v5 = this.j;
v6 = /* invoke-virtual/range {p2 ..p2}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;->getTileRow()I */
v7 = /* invoke-virtual/range {p2 ..p2}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;->getTileColumn()I */
/* iget v9, p0, Lcom/tgb/bg/jevcyxq/b/aj;->a:I */
int v10 = 0; // const/4 v10, 0x0
/* iget v11, p0, Lcom/tgb/bg/jevcyxq/b/aj;->q:I */
/* move/from16 v8, p10 */
/* invoke-direct/range {v4 ..v12}, Lcom/tgb/bg/jevcyxq/b/am;-><init>(Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;IIIIZII)V */
(( java.util.ArrayList ) v13 ).add ( v4 ); // invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // :cond_9
} // :goto_2
/* iget-boolean v4, p0, Lcom/tgb/bg/jevcyxq/b/aj;->f:Z */
if ( v4 != null) { // if-eqz v4, :cond_a
/* new-instance v4, Lorg/anddev/andengine/entity/sprite/AnimatedSprite; */
v5 = (( com.tgb.bg.jevcyxq.b.aj ) p0 ).getX ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/b/aj;->getX()F
v6 = (( com.tgb.bg.jevcyxq.b.aj ) p0 ).getY ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/b/aj;->getY()F
/* iget v7, p0, Lcom/tgb/bg/jevcyxq/b/aj;->q:I */
/* packed-switch v7, :pswitch_data_2 */
v7 = this.j;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v7 ).g ( ); // invoke-virtual {v7}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->g()Lcom/tgb/bg/jevcyxq/c/w;
v7 = this.l;
} // :goto_3
/* invoke-direct {v4, v5, v6, v7}, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;-><init>(FFLorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;)V */
v5 = this.d;
int v6 = 0; // const/4 v6, 0x0
/* aget-object v5, v5, v6 */
v5 = (( com.tgb.bg.jevcyxq.b.o ) v5 ).a ( ); // invoke-virtual {v5}, Lcom/tgb/bg/jevcyxq/b/o;->a()I
/* packed-switch v5, :pswitch_data_3 */
int v5 = 0; // const/4 v5, 0x0
} // :goto_4
(( org.anddev.andengine.entity.sprite.AnimatedSprite ) v4 ).setRotation ( v5 ); // invoke-virtual {v4, v5}, Lorg/anddev/andengine/entity/sprite/AnimatedSprite;->setRotation(F)V
v5 = this.j;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v5 ).e ( ); // invoke-virtual {v5}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->e()Lorg/anddev/andengine/entity/scene/Scene;
int v6 = 7; // const/4 v6, 0x7
(( org.anddev.andengine.entity.scene.Scene ) v5 ).getChild ( v6 ); // invoke-virtual {v5, v6}, Lorg/anddev/andengine/entity/scene/Scene;->getChild(I)Lorg/anddev/andengine/entity/IEntity;
} // :cond_a
v4 = this.j;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v4 ).e ( ); // invoke-virtual {v4}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->e()Lorg/anddev/andengine/entity/scene/Scene;
(( org.anddev.andengine.entity.scene.Scene ) v4 ).registerTouchArea ( p0 ); // invoke-virtual {v4, p0}, Lorg/anddev/andengine/entity/scene/Scene;->registerTouchArea(Lorg/anddev/andengine/entity/scene/Scene$ITouchArea;)V
return;
/* :pswitch_0 */
v7 = this.j;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v7 ).g ( ); // invoke-virtual {v7}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->g()Lcom/tgb/bg/jevcyxq/c/w;
v7 = this.i;
(( org.anddev.andengine.opengl.texture.region.TextureRegion ) v7 ).clone ( ); // invoke-virtual {v7}, Lorg/anddev/andengine/opengl/texture/region/TextureRegion;->clone()Lorg/anddev/andengine/opengl/texture/region/TextureRegion;
/* goto/16 :goto_0 */
/* :pswitch_1 */
v7 = this.j;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v7 ).g ( ); // invoke-virtual {v7}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->g()Lcom/tgb/bg/jevcyxq/c/w;
v7 = this.j;
(( org.anddev.andengine.opengl.texture.region.TextureRegion ) v7 ).clone ( ); // invoke-virtual {v7}, Lorg/anddev/andengine/opengl/texture/region/TextureRegion;->clone()Lorg/anddev/andengine/opengl/texture/region/TextureRegion;
/* goto/16 :goto_0 */
/* :pswitch_2 */
v7 = this.j;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v7 ).g ( ); // invoke-virtual {v7}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->g()Lcom/tgb/bg/jevcyxq/c/w;
v7 = this.t;
(( org.anddev.andengine.opengl.texture.region.TextureRegion ) v7 ).clone ( ); // invoke-virtual {v7}, Lorg/anddev/andengine/opengl/texture/region/TextureRegion;->clone()Lorg/anddev/andengine/opengl/texture/region/TextureRegion;
/* goto/g/jevcyxq/b/q;->k:I */
/* iget v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->j:I */
/* sub-int/2addr v2, v3 */
(( org.anddev.andengine.entity.layer.tiled.tmx.TMXLayer ) v0 ).getTMXTile ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->getTMXTile(II)Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;
v0 = (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTile ) v0 ).getTileY ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;->getTileY()I
/* int-to-float v0, v0 */
v1 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).m ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->m()Lcom/tgb/bg/jevcyxq/c/aa;
(( com.tgb.bg.jevcyxq.c.aa ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/c/aa;->a()Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;
v1 = (( org.anddev.andengine.entity.layer.tiled.tmx.TMXLayer ) v1 ).getY ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->getY()F
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lcom/tgb/bg/jevcyxq/b/q;->g:F */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/tgb/bg/jevcyxq/b/q;->c:I */
/* iget v0, p0, Lcom/tgb/bg/jevcyxq/b/q;->o:F */
/* const/high16 v1, 0x42940000 # 74.0f */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_0 */
/* new-instance v0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler; */
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->z:F */
/* new-instance v2, Lcom/tgb/bg/jevcyxq/b/v; */
/* invoke-direct {v2, p0}, Lcom/tgb/bg/jevcyxq/b/v;-><init>(Lcom/tgb/bg/jevcyxq/b/q;)V */
/* invoke-direct {v0, v1, v3, v2}, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;-><init>(FZLorg/anddev/andengine/engine/handler/timer/ITimerCallback;)V */
this.d = v0;
(( com.tgb.bg.jevcyxq.b.q ) p0 ).registerUpdateHandler ( v0 ); // invoke-virtual {p0, v0}, Lcom/tgb/bg/jevcyxq/b/q;->registerUpdateHandler(Lorg/anddev/andengine/engine/handler/IUpdateHandler;)V
} // :goto_0
return;
} // :cond_0
/* new-instance v0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler; */
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->z:F */
/* new-instance v2, Lcom/tgb/bg/jevcyxq/b/u; */
/* invoke-direct {v2, p0}, Lcom/tgb/bg/jevcyxq/b/u;-><init>(Lcom/tgb/bg/jevcyxq/b/q;)V */
/* invoke-direct {v0, v1, v3, v2}, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;-><init>(FZLorg/anddev/andengine/engine/handler/timer/ITimerCallback;)V */
this.d = v0;
(( com.tgb.bg.jevcyxq.b.q ) p0 ).registerUpdateHandler ( v0 ); // invoke-virtual {p0, v0}, Lcom/tgb/bg/jevcyxq/b/q;->registerUpdateHandler(Lorg/anddev/andengine/engine/handler/IUpdateHandler;)V
} // .end method
private void p ( ) {
/* .locals 4 */
int v3 = 1; // const/4 v3, 0x1
v0 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v0 ).m ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->m()Lcom/tgb/bg/jevcyxq/c/aa;
(( com.tgb.bg.jevcyxq.c.aa ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/c/aa;->a()Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->k:I */
/* iget v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->j:I */
/* sub-int/2addr v2, v3 */
(( org.anddev.andengine.entity.layer.tiled.tmx.TMXLayer ) v0 ).getTMXTile ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->getTMXTile(II)Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;
v0 = (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTile ) v0 ).getTileY ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;->getTileY()I
/* int-to-float v0, v0 */
v1 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).m ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->m()Lcom/tgb/bg/jevcyxq/c/aa;
(( com.tgb.bg.jevcyxq.c.aa ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/c/aa;->a()Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;
v1 = (( org.anddev.andengine.entity.layer.tiled.tmx.TMXLayer ) v1 ).getY ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->getY()F
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lcom/tgb/bg/jevcyxq/b/q;->g:F */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/tgb/bg/jevcyxq/b/q;->c:I */
/* iget v0, p0, Lcom/tgb/bg/jevcyxq/b/q;->o:F */
/* const/high16 v1, 0x42940000 # 74.0f */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_0 */
/* new-instance v0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler; */
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->z:F */
/* new-instance v2, Lcom/tgb/bg/jevcyxq/b/t; */
/* invoke-direct {v2, p0}, Lcom/tgb/bg/jevcyxq/b/t;-><init>(Lcom/tgb/bg/jevcyxq/b/q;)V */
/* invoke-direct {v0, v1, v3, v2}, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;-><init>(FZLorg/anddev/andengine/engine/handler/timer/ITimerCallback;)V */
this.d = v0;
(( com.tgb.bg.jevcyxq.b.q ) p0 ).registerUpdateHandler ( v0 ); // invoke-virtual {p0, v0}, Lcom/tgb/bg/jevcyxq/b/q;->registerUpdateHandler(Lorg/anddev/andengine/engine/handler/IUpdateHandler;)V
} // :goto_0
return;
} // :cond_0
/* new-instance v0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler; */
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->z:F */
/* new-instance v2, Lcom/tgb/bg/jevcyxq/b/s; */
/* invoke-direct {v2, p0}, Lcom/tgb/bg/jevcyxq/b/s;-><init>(Lcom/tgb/bg/jevcyxq/b/q;)V */
/* invoke-direct {v0, v1, v3, v2}, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;-><init>(FZLorg/anddev/andengine/engine/handler/timer/ITimerCallback;)V */
this.d = v0;
(( com.tgb.bg.jevcyxq.b.q ) p0 ).registerUpdateHandler ( v0 ); // invoke-virtual {p0, v0}, Lcom/tgb/bg/jevcyxq/b/q;->registerUpdateHandler(Lorg/anddev/andengine/engine/handler/IUpdateHandler;)V
} // .end method
private void q ( ) {
/* .locals 4 */
int v3 = 1; // const/4 v3, 0x1
v0 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v0 ).m ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->m()Lcom/tgb/bg/jevcyxq/c/aa;
(( com.tgb.bg.jevcyxq.c.aa ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/c/aa;->a()Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->k:I */
/* sub-int/2addr v1, v3 */
/* iget v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->j:I */
(( org.anddev.andengine.entity.layer.tiled.tmx.TMXLayer ) v0 ).getTMXTile ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->getTMXTile(II)Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;
v0 = (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTile ) v0 ).getTileX ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;->getTileX()I
/* int-to-float v0, v0 */
v1 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).m ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->m()Lcom/tgb/bg/jevcyxq/c/aa;
(( com.tgb.bg.jevcyxq.c.aa ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/c/aa;->a()Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;
v1 = (( org.anddev.andengine.entity.layer.tiled.tmx.TMXLayer ) v1 ).getX ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->getX()F
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lcom/tgb/bg/jevcyxq/b/q;->f:F */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/tgb/bg/jevcyxq/b/q;->c:I */
/* iget v0, p0, Lcom/tgb/bg/jevcyxq/b/q;->n:F */
/* const/high16 v1, 0x42940000 # 74.0f */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_0 */
/* new-instance v0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler; */
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->z:F */
/* new-instance v2, Lcom/tgb/bg/jevcyxq/b/z; */
/* invoke-direct {v2, p0}, Lcom/tgb/bg/jevcyxq/b/z;-><init>(Lcom/tgb/bg/jevcyxq/b/q;)V */
/* invoke-direct {v0, v1, v3, v2}, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;-><init>(FZLorg/anddev/andengine/engine/handler/timer/ITimerCallback;)V */
this.d = v0;
(( com.tgb.bg.jevcyxq.b.q ) p0 ).registerUpdateHandler ( v0 ); // invoke-virtual {p0, v0}, Lcom/tgb/bg/jevcyxq/b/q;->registerUpdateHandler(Lorg/anddev/andengine/engine/handler/IUpdateHandler;)V
} // :goto_0
return;
} // :cond_0
/* new-instance v0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler; */
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->z:F */
/* new-instance v2, Lcom/tgb/bg/jevcyxq/b/y; */
/* invoke-direct {v2, p0}, Lcom/tgb/bg/jevcyxq/b/y;-><init>(Lcom/tgb/bg/jevcyxq/b/q;)V */
/* invoke-direct {v0, v1, v3, v2}, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;-><init>(FZLorg/anddev/andengine/engine/handler/timer/ITimerCallback;)V */
this.d = v0;
(( com.tgb.bg.jevcyxq.b.q ) p0 ).registerUpdateHandler ( v0 ); // invoke-virtual {p0, v0}, Lcom/tgb/bg/jevcyxq/b/q;->registerUpdateHandler(Lorg/anddev/andengine/engine/handler/IUpdateHandler;)V
} // .end method
private void r ( ) {
/* .locals 4 */
int v3 = 1; // const/4 v3, 0x1
v0 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v0 ).m ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->m()Lcom/tgb/bg/jevcyxq/c/aa;
(( com.tgb.bg.jevcyxq.c.aa ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/c/aa;->a()Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->k:I */
/* sub-int/2addr v1, v3 */
/* iget v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->j:I */
(( org.anddev.andengine.entity.layer.tiled.tmx.TMXLayer ) v0 ).getTMXTile ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->getTMXTile(II)Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;
v0 = (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTile ) v0 ).getTileX ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;->getTileX()I
/* int-to-float v0, v0 */
v1 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).m ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->m()Lcom/tgb/bg/jevcyxq/c/aa;
(( com.tgb.bg.jevcyxq.c.aa ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/c/aa;->a()Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;
v1 = (( org.anddev.andengine.entity.layer.tiled.tmx.TMXLayer ) v1 ).getX ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->getX()F
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lcom/tgb/bg/jevcyxq/b/q;->f:F */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/tgb/bg/jevcyxq/b/q;->c:I */
/* iget v0, p0, Lcom/tgb/bg/jevcyxq/b/q;->n:F */
/* const/high16 v1, 0x42940000 # 74.0f */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_0 */
/* new-instance v0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler; */
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->z:F */
/* new-instance v2, Lcom/tgb/bg/jevcyxq/b/x; */
/* invoke-direct {v2, p0}, Lcom/tgb/bg/jevcyxq/b/x;-><init>(Lcom/tgb/bg/jevcyxq/b/q;)V */
/* invoke-direct {v0, v1, v3, v2}, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;-><init>(FZLorg/anddev/andengine/engine/handler/timer/ITimerCallback;)V */
this.d = v0;
(( com.tgb.bg.jevcyxq.b.q ) p0 ).registerUpdateHandler ( v0 ); // invoke-virtual {p0, v0}, Lcom/tgb/bg/jevcyxq/b/q;->registerUpdateHandler(Lorg/anddev/andengine/engine/handler/IUpdateHandler;)V
} // :goto_0
return;
} // :cond_0
/* new-instance v0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler; */
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->z:F */
/* new-instance v2, Lcom/tgb/bg/jevcyxq/b/w; */
/* invoke-direct {v2, p0}, Lcom/tgb/bg/jevcyxq/b/w;-><init>(Lcom/tgb/bg/jevcyxq/b/q;)V */
/* invoke-direct {v0, v1, v3, v2}, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;-><init>(FZLorg/anddev/andengine/engine/handler/timer/ITimerCallback;)V */
this.d = v0;
(( com.tgb.bg.jevcyxq.b.q ) p0 ).registerUpdateHandler ( v0 ); // invoke-virtual {p0, v0}, Lcom/tgb/bg/jevcyxq/b/q;->registerUpdateHandler(Lorg/anddev/andengine/engine/handler/IUpdateHandler;)V
} // .end method
private void s ( ) {
/* .locals 4 */
int v3 = 1; // const/4 v3, 0x1
/* invoke-direct {p0}, Lcom/tgb/bg/jevcyxq/b/q;->j()V */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/tgb/bg/jevcyxq/b/q;->c:I */
v0 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v0 ).m ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->m()Lcom/tgb/bg/jevcyxq/c/aa;
(( com.tgb.bg.jevcyxq.c.aa ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/c/aa;->a()Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->k:I */
/* sub-int/2addr v1, v3 */
/* iget v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->j:I */
(( org.anddev.andengine.entity.layer.tiled.tmx.TMXLayer ) v0 ).getTMXTile ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->getTMXTile(II)Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;
v0 = (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTile ) v0 ).getTileX ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;->getTileX()I
/* int-to-float v0, v0 */
v1 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).m ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->m()Lcom/tgb/bg/jevcyxq/c/aa;
(( com.tgb.bg.jevcyxq.c.aa ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/c/aa;->a()Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;
v1 = (( org.anddev.andengine.entity.layer.tiled.tmx.TMXLayer ) v1 ).getX ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->getX()F
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lcom/tgb/bg/jevcyxq/b/q;->f:F */
/* iget v0, p0, Lcom/tgb/bg/jevcyxq/b/q;->n:F */
/* const/high16 v1, 0x42940000 # 74.0f */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_0 */
/* new-instance v0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler; */
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->z:F */
/* new-instance v2, Lcom/tgb/bg/jevcyxq/b/aa; */
/* invoke-direct {v2, p0}, Lcom/tgb/bg/jevcyxq/b/aa;-><init>(Lcom/tgb/bg/jevcyxq/b/q;)V */
/* invoke-direct {v0, v1, v3, v2}, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;-><init>(FZLorg/anddev/andengine/engine/handler/timer/ITimerCallback;)V */
this.d = v0;
(( com.tgb.bg.jevcyxq.b.q ) p0 ).registerUpdateHandler ( v0 ); // invoke-virtual {p0, v0}, Lcom/tgb/bg/jevcyxq/b/q;->registerUpdateHandler(Lorg/anddev/andengine/engine/handler/IUpdateHandler;)V
} // :goto_0
return;
} // :cond_0
/* new-instance v0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler; */
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->z:F */
/* new-instance v2, Lcom/tgb/bg/jevcyxq/b/ab; */
/* invoke-direct {v2, p0}, Lcom/tgb/bg/jevcyxq/b/ab;-><init>(Lcom/tgb/bg/jevcyxq/b/q;)V */
/* invoke-direct {v0, v1, v3, v2}, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;-><init>(FZLorg/anddev/andengine/engine/handler/timer/ITimerCallback;)V */
this.d = v0;
(( com.tgb.bg.jevcyxq.b.q ) p0 ).registerUpdateHandler ( v0 ); // invoke-virtual {p0, v0}, Lcom/tgb/bg/jevcyxq/b/q;->registerUpdateHandler(Lorg/anddev/andengine/engine/handler/IUpdateHandler;)V
} // .end method
private void t ( ) {
/* .locals 4 */
int v3 = 1; // const/4 v3, 0x1
/* invoke-direct {p0}, Lcom/tgb/bg/jevcyxq/b/q;->j()V */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/tgb/bg/jevcyxq/b/q;->c:I */
v0 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v0 ).m ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->m()Lcom/tgb/bg/jevcyxq/c/aa;
(( com.tgb.bg.jevcyxq.c.aa ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/c/aa;->a()Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->k:I */
/* add-int/lit8 v1, v1, 0x1 */
/* iget v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->j:I */
(( org.anddev.andengine.entity.layer.tiled.tmx.TMXLayer ) v0 ).getTMXTile ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->getTMXTile(II)Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;
v0 = (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTile ) v0 ).getTileX ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;->getTileX()I
/* int-to-float v0, v0 */
v1 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).m ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->m()Lcom/tgb/bg/jevcyxq/c/aa;
(( com.tgb.bg.jevcyxq.c.aa ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/c/aa;->a()Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;
v1 = (( org.anddev.andengine.entity.layer.tiled.tmx.TMXLayer ) v1 ).getX ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->getX()F
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lcom/tgb/bg/jevcyxq/b/q;->f:F */
/* iget v0, p0, Lcom/tgb/bg/jevcyxq/b/q;->n:F */
/* const/high16 v1, 0x42940000 # 74.0f */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_0 */
/* new-instance v0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler; */
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->z:F */
/* new-instance v2, Lcom/tgb/bg/jevcyxq/b/ah; */
/* invoke-direct {v2, p0}, Lcom/tgb/bg/jevcyxq/b/ah;-><init>(Lcom/tgb/bg/jevcyxq/b/q;)V */
/* invoke-direct {v0, v1, v3, v2}, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;-><init>(FZLorg/anddev/andengine/engine/handler/timer/ITimerCallback;)V */
this.d = v0;
(( com.tgb.bg.jevcyxq.b.q ) p0 ).registerUpdateHandler ( v0 ); // invoke-virtual {p0, v0}, Lcom/tgb/bg/jevcyxq/b/q;->registerUpdateHandler(Lorg/anddev/andengine/engine/handler/IUpdateHandler;)V
} // :goto_0
return;
} // :cond_0
/* new-instance v0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler; */
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->z:F */
/* new-instance v2, Lcom/tgb/bg/jevcyxq/b/ad; */
/* invoke-direct {v2, p0}, Lcom/tgb/bg/jevcyxq/b/ad;-><init>(Lcom/tgb/bg/jevcyxq/b/q;)V */
/* invoke-direct {v0, v1, v3, v2}, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;-><init>(FZLorg/anddev/andengine/engine/handler/timer/ITimerCallback;)V */
this.d = v0;
(( com.tgb.bg.jevcyxq.b.q ) p0 ).registerUpdateHandler ( v0 ); // invoke-virtual {p0, v0}, Lcom/tgb/bg/jevcyxq/b/q;->registerUpdateHandler(Lorg/anddev/andengine/engine/handler/IUpdateHandler;)V
} // .end method
private void u ( ) {
/* .locals 4 */
int v3 = 1; // const/4 v3, 0x1
v0 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v0 ).m ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->m()Lcom/tgb/bg/jevcyxq/c/aa;
(( com.tgb.bg.jevcyxq.c.aa ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/c/aa;->a()Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->k:I */
/* add-int/lit8 v1, v1, 0x1 */
/* iget v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->j:I */
(( org.anddev.andengine.entity.layer.tiled.tmx.TMXLayer ) v0 ).getTMXTile ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->getTMXTile(II)Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;
v0 = (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTile ) v0 ).getTileX ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;->getTileX()I
/* int-to-float v0, v0 */
v1 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).m ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->m()Lcom/tgb/bg/jevcyxq/c/aa;
(( com.tgb.bg.jevcyxq.c.aa ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/c/aa;->a()Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;
v1 = (( org.anddev.andengine.entity.layer.tiled.tmx.TMXLayer ) v1 ).getX ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->getX()F
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lcom/tgb/bg/jevcyxq/b/q;->f:F */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/tgb/bg/jevcyxq/b/q;->c:I */
/* iget v0, p0, Lcom/tgb/bg/jevcyxq/b/q;->n:F */
/* const/high16 v1, 0x42940000 # 74.0f */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_0 */
/* new-instance v0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler; */
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->z:F */
/* new-instance v2, Lcom/tgb/bg/jevcyxq/b/ac; */
/* invoke-direct {v2, p0}, Lcom/tgb/bg/jevcyxq/b/ac;-><init>(Lcom/tgb/bg/jevcyxq/b/q;)V */
/* invoke-direct {v0, v1, v3, v2}, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;-><init>(FZLorg/anddev/andengine/engine/handler/timer/ITimerCallback;)V */
this.d = v0;
(( com.tgb.bg.jevcyxq.b.q ) p0 ).registerUpdateHandler ( v0 ); // invoke-virtual {p0, v0}, Lcom/tgb/bg/jevcyxq/b/q;->registerUpdateHandler(Lorg/anddev/andengine/engine/handler/IUpdateHandler;)V
} // :goto_0
return;
} // :cond_0
/* new-instance v0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler; */
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->z:F */
/* new-instance v2, Lcom/tgb/bg/jevcyxq/b/af; */
/* invoke-direct {v2, p0}, Lcom/tgb/bg/jevcyxq/b/af;-><init>(Lcom/tgb/bg/jevcyxq/b/q;)V */
/* invoke-direct {v0, v1, v3, v2}, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;-><init>(FZLorg/anddev/andengine/engine/handler/timer/ITimerCallback;)V */
this.d = v0;
(( com.tgb.bg.jevcyxq.b.q ) p0 ).registerUpdateHandler ( v0 ); // invoke-virtual {p0, v0}, Lcom/tgb/bg/jevcyxq/b/q;->registerUpdateHandler(Lorg/anddev/andengine/engine/handler/IUpdateHandler;)V
} // .end method
private void v ( ) {
/* .locals 4 */
int v3 = 1; // const/4 v3, 0x1
v0 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v0 ).m ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->m()Lcom/tgb/bg/jevcyxq/c/aa;
(( com.tgb.bg.jevcyxq.c.aa ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/c/aa;->a()Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->k:I */
/* add-int/lit8 v1, v1, 0x1 */
/* iget v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->j:I */
(( org.anddev.andengine.entity.layer.tiled.tmx.TMXLayer ) v0 ).getTMXTile ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->getTMXTile(II)Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;
v0 = (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTile ) v0 ).getTileX ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;->getTileX()I
/* int-to-float v0, v0 */
v1 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).m ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->m()Lcom/tgb/bg/jevcyxq/c/aa;
(( com.tgb.bg.jevcyxq.c.aa ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/c/aa;->a()Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;
v1 = (( org.anddev.andengine.entity.layer.tiled.tmx.TMXLayer ) v1 ).getX ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->getX()F
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lcom/tgb/bg/jevcyxq/b/q;->f:F */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/tgb/bg/jevcyxq/b/q;->c:I */
/* iget v0, p0, Lcom/tgb/bg/jevcyxq/b/q;->n:F */
/* const/high16 v1, 0x42940000 # 74.0f */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_0 */
/* new-instance v0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler; */
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->z:F */
/* new-instance v2, Lcom/tgb/bg/jevcyxq/b/ae; */
/* invoke-direct {v2, p0}, Lcom/tgb/bg/jevcyxq/b/ae;-><init>(Lcom/tgb/bg/jevcyxq/b/q;)V */
/* invoke-direct {v0, v1, v3, v2}, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;-><init>(FZLorg/anddev/andengine/engine/handler/timer/ITimerCallback;)V */
this.d = v0;
(( com.tgb.bg.jevcyxq.b.q ) p0 ).registerUpdateHandler ( v0 ); // invoke-virtual {p0, v0}, Lcom/tgb/bg/jevcyxq/b/q;->registerUpdateHandler(Lorg/anddev/andengine/engine/handler/IUpdateHandler;)V
} // :goto_0
return;
} // :cond_0
/* new-instance v0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler; */
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->z:F */
/* new-instance v2, Lcom/tgb/bg/jevcyxq/b/ag; */
/* invoke-direct {v2, p0}, Lcom/tgb/bg/jevcyxq/b/ag;-><init>(Lcom/tgb/bg/jevcyxq/b/q;)V */
/* invoke-direct {v0, v1, v3, v2}, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;-><init>(FZLorg/anddev/andengine/engine/handler/timer/ITimerCallback;)V */
this.d = v0;
(( com.tgb.bg.jevcyxq.b.q ) p0 ).registerUpdateHandler ( v0 ); // invoke-virtual {p0, v0}, Lcom/tgb/bg/jevcyxq/b/q;->registerUpdateHandler(Lorg/anddev/andengine/engine/handler/IUpdateHandler;)V
} // .end method
/* # virtual methods */
public final void a ( Float p0 ) {
/* .locals 0 */
/* iput p1, p0, Lcom/tgb/bg/jevcyxq/b/q;->z:F */
return;
} // .end method
public final void a ( Integer p0 ) {
/* .locals 0 */
/* iput p1, p0, Lcom/tgb/bg/jevcyxq/b/q;->i:I */
return;
} // .end method
public final Boolean a ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/tgb/bg/jevcyxq/b/q;->x:Z */
} // .end method
public final void b ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/tgb/bg/jevcyxq/b/q;->x:Z */
return;
} // .end method
public final void b ( Integer p0 ) {
/* .locals 0 */
/* iput p1, p0, Lcom/tgb/bg/jevcyxq/b/q;->j:I */
return;
} // .end method
public final void c ( Integer p0 ) {
/* .locals 0 */
/* iput p1, p0, Lcom/tgb/bg/jevcyxq/b/q;->k:I */
return;
} // .end method
public final Boolean c ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/tgb/bg/jevcyxq/b/q;->b:Z */
} // .end method
public final Integer d ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/tgb/bg/jevcyxq/b/q;->i:I */
} // .end method
public final Boolean e ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/tgb/bg/jevcyxq/b/q;->w:Z */
} // .end method
public final Integer f ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/tgb/bg/jevcyxq/b/q;->l:I */
} // .end method
public final void g ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/tgb/bg/jevcyxq/b/q;->A:Z */
return;
} // .end method
public final Float h ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/tgb/bg/jevcyxq/b/q;->z:F */
} // .end method
final void i ( ) {
/* .locals 10 */
int v9 = 2; // const/4 v9, 0x2
int v8 = 0; // const/4 v8, 0x0
int v7 = 4; // const/4 v7, 0x4
int v6 = 0; // const/4 v6, 0x0
int v5 = 1; // const/4 v5, 0x1
v1 = this.d;
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = this.d;
(( com.tgb.bg.jevcyxq.b.q ) p0 ).unregisterUpdateHandler ( v1 ); // invoke-virtual {p0, v1}, Lcom/tgb/bg/jevcyxq/b/q;->unregisterUpdateHandler(Lorg/anddev/andengine/engine/handler/IUpdateHandler;)Z
} // :cond_0
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->l:I */
/* if-nez v1, :cond_1 */
v1 = this.a;
(( com.tgb.bg.jevcyxq.b.am ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
/* aget-object v1, v1, v6 */
/* iget-boolean v1, v1, Lcom/tgb/bg/jevcyxq/b/q;->h:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
/* new-instance v1, Lorg/anddev/andengine/engine/handler/timer/TimerHandler; */
/* const/high16 v2, 0x40000000 # 2.0f */
/* new-instance v3, Lcom/tgb/bg/jevcyxq/b/j; */
/* invoke-direct {v3, p0}, Lcom/tgb/bg/jevcyxq/b/j;-><init>(Lcom/tgb/bg/jevcyxq/b/q;)V */
/* invoke-direct {v1, v2, v3}, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;-><init>(FLorg/anddev/andengine/engine/handler/timer/ITimerCallback;)V */
this.e = v1;
(( com.tgb.bg.jevcyxq.b.q ) p0 ).registerUpdateHandler ( v1 ); // invoke-virtual {p0, v1}, Lcom/tgb/bg/jevcyxq/b/q;->registerUpdateHandler(Lorg/anddev/andengine/engine/handler/IUpdateHandler;)V
} // :cond_1
v1 = this.a;
(( com.tgb.bg.jevcyxq.b.am ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
/* aget-object v1, v1, v6 */
/* iget-boolean v1, v1, Lcom/tgb/bg/jevcyxq/b/q;->h:Z */
if ( v1 != null) { // if-eqz v1, :cond_2
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->l:I */
if ( v1 != null) { // if-eqz v1, :cond_3
} // :cond_2
v1 = this.a;
(( com.tgb.bg.jevcyxq.b.am ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
/* aget-object v1, v1, v6 */
/* iget-boolean v1, v1, Lcom/tgb/bg/jevcyxq/b/q;->h:Z */
if ( v1 != null) { // if-eqz v1, :cond_4
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->l:I */
if ( v1 != null) { // if-eqz v1, :cond_4
v1 = this.a;
(( com.tgb.bg.jevcyxq.b.am ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
/* iget v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->l:I */
/* aget-object v1, v1, v2 */
/* iget v1, v1, Lcom/tgb/bg/jevcyxq/b/q;->j:I */
/* add-int/lit8 v1, v1, 0x1 */
v2 = this.a;
(( com.tgb.bg.jevcyxq.b.am ) v2 ).b ( ); // invoke-virtual {v2}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
/* iget v3, p0, Lcom/tgb/bg/jevcyxq/b/q;->l:I */
/* sub-int/2addr v3, v5 */
/* aget-object v2, v2, v3 */
/* iget v2, v2, Lcom/tgb/bg/jevcyxq/b/q;->j:I */
/* if-eq v1, v2, :cond_3 */
v1 = this.a;
(( com.tgb.bg.jevcyxq.b.am ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
/* iget v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->l:I */
/* aget-object v1, v1, v2 */
/* iget v1, v1, Lcom/tgb/bg/jevcyxq/b/q;->j:I */
/* sub-int/2addr v1, v5 */
v2 = this.a;
(( com.tgb.bg.jevcyxq.b.am ) v2 ).b ( ); // invoke-virtual {v2}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
/* iget v3, p0, Lcom/tgb/bg/jevcyxq/b/q;->l:I */
/* sub-int/2addr v3, v5 */
/* aget-object v2, v2, v3 */
/* iget v2, v2, Lcom/tgb/bg/jevcyxq/b/q;->j:I */
/* if-eq v1, v2, :cond_3 */
v1 = this.a;
(( com.tgb.bg.jevcyxq.b.am ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
/* iget v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->l:I */
/* aget-object v1, v1, v2 */
/* iget v1, v1, Lcom/tgb/bg/jevcyxq/b/q;->k:I */
/* add-int/lit8 v1, v1, 0x1 */
v2 = this.a;
(( com.tgb.bg.jevcyxq.b.am ) v2 ).b ( ); // invoke-virtual {v2}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
/* iget v3, p0, Lcom/tgb/bg/jevcyxq/b/q;->l:I */
/* sub-int/2addr v3, v5 */
/* aget-object v2, v2, v3 */
/* iget v2, v2, Lcom/tgb/bg/jevcyxq/b/q;->k:I */
/* if-eq v1, v2, :cond_3 */
v1 = this.a;
(( com.tgb.bg.jevcyxq.b.am ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
/* iget v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->l:I */
/* aget-object v1, v1, v2 */
/* iget v1, v1, Lcom/tgb/bg/jevcyxq/b/q;->k:I */
/* sub-int/2addr v1, v5 */
v2 = this.a;
(( com.tgb.bg.jevcyxq.b.am ) v2 ).b ( ); // invoke-virtual {v2}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
/* iget v3, p0, Lcom/tgb/bg/jevcyxq/b/q;->l:I */
/* sub-int/2addr v3, v5 */
/* aget-object v2, v2, v3 */
/* iget v2, v2, Lcom/tgb/bg/jevcyxq/b/q;->k:I */
/* if-ne v1, v2, :cond_4 */
} // :cond_3
} // :goto_0
return;
} // :cond_4
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->l:I */
v2 = this.a;
(( com.tgb.bg.jevcyxq.b.am ) v2 ).b ( ); // invoke-virtual {v2}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
v3 = this.a;
(( com.tgb.bg.jevcyxq.b.am ) v3 ).b ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
/* array-length v3, v3 */
/* sub-int/2addr v3, v5 */
/* aget-object v2, v2, v3 */
/* iget v2, v2, Lcom/tgb/bg/jevcyxq/b/q;->l:I */
/* if-ne v1, v2, :cond_5 */
v1 = this.a;
(( com.tgb.bg.jevcyxq.b.am ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
v2 = this.a;
(( com.tgb.bg.jevcyxq.b.am ) v2 ).b ( ); // invoke-virtual {v2}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
/* array-length v2, v2 */
/* sub-int/2addr v2, v5 */
/* aget-object v1, v1, v2 */
/* iget-boolean v1, v1, Lcom/tgb/bg/jevcyxq/b/q;->x:Z */
if ( v1 != null) { // if-eqz v1, :cond_5
v1 = this.a;
v2 = this.a;
(( com.tgb.bg.jevcyxq.b.am ) v2 ).b ( ); // invoke-virtual {v2}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
v3 = this.a;
(( com.tgb.bg.jevcyxq.b.am ) v3 ).b ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
/* array-length v3, v3 */
/* sub-int/2addr v3, v5 */
/* aget-object v2, v2, v3 */
/* iget v2, v2, Lcom/tgb/bg/jevcyxq/b/q;->j:I */
v3 = this.a;
(( com.tgb.bg.jevcyxq.b.am ) v3 ).b ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
v4 = this.a;
(( com.tgb.bg.jevcyxq.b.am ) v4 ).b ( ); // invoke-virtual {v4}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
/* array-length v4, v4 */
/* sub-int/2addr v4, v5 */
/* aget-object v3, v3, v4 */
/* iget v3, v3, Lcom/tgb/bg/jevcyxq/b/q;->k:I */
(( com.tgb.bg.jevcyxq.b.am ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/tgb/bg/jevcyxq/b/am;->a(II)V
} // :cond_5
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->l:I */
v2 = this.a;
(( com.tgb.bg.jevcyxq.b.am ) v2 ).b ( ); // invoke-virtual {v2}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
v3 = this.a;
(( com.tgb.bg.jevcyxq.b.am ) v3 ).b ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
/* array-length v3, v3 */
/* sub-int/2addr v3, v5 */
/* aget-object v2, v2, v3 */
/* iget v2, v2, Lcom/tgb/bg/jevcyxq/b/q;->l:I */
/* if-ne v1, v2, :cond_6 */
v1 = this.a;
(( com.tgb.bg.jevcyxq.b.am ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
v2 = this.a;
(( com.tgb.bg.jevcyxq.b.am ) v2 ).b ( ); // invoke-virtual {v2}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
/* array-length v2, v2 */
/* sub-int/2addr v2, v5 */
/* aget-object v1, v1, v2 */
/* iget-boolean v1, v1, Lcom/tgb/bg/jevcyxq/b/q;->A:Z */
if ( v1 != null) { // if-eqz v1, :cond_6
v1 = this.a;
(( com.tgb.bg.jevcyxq.b.am ) v1 ).d ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/am;->d()V
} // :cond_6
/* iget-boolean v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->x:Z */
if ( v1 != null) { // if-eqz v1, :cond_7
(( com.tgb.bg.jevcyxq.b.q ) p0 ).setVisible ( v6 ); // invoke-virtual {p0, v6}, Lcom/tgb/bg/jevcyxq/b/q;->setVisible(Z)V
} // :cond_7
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->l:I */
/* if-nez v1, :cond_2c */
/* iget-boolean v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->w:Z */
/* if-nez v1, :cond_2c */
/* iget-boolean v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->x:Z */
/* if-nez v1, :cond_2c */
/* iget-boolean v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->v:Z */
if ( v1 != null) { // if-eqz v1, :cond_2b
/* move v1, v6 */
} // :goto_1
/* iput-boolean v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->v:Z */
v1 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).k ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->k()Lcom/tgb/bg/jevcyxq/c/y;
(( com.tgb.bg.jevcyxq.c.y ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/c/y;->c()V
/* const/high16 v1, 0x42100000 # 36.0f */
/* const/high16 v2, 0x41d00000 # 26.0f */
(( com.tgb.bg.jevcyxq.b.q ) p0 ).convertLocalToSceneCoordinates ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lcom/tgb/bg/jevcyxq/b/q;->convertLocalToSceneCoordinates(FF)[F
v1 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).j ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->j()Lcom/tgb/bg/jevcyxq/c/g;
/* iget-boolean v3, p0, Lcom/tgb/bg/jevcyxq/b/q;->b:Z */
v4 = this.a;
/* iget v4, v4, Lcom/tgb/bg/jevcyxq/b/am;->e:I */
(( com.tgb.bg.jevcyxq.c.g ) v1 ).a ( v3, v4 ); // invoke-virtual {v1, v3, v4}, Lcom/tgb/bg/jevcyxq/c/g;->a(ZI)Lorg/anddev/andengine/entity/particle/ParticleSystem;
(( org.anddev.andengine.entity.particle.ParticleSystem ) v1 ).getParticleEmitter ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/entity/particle/ParticleSystem;->getParticleEmitter()Lorg/anddev/andengine/entity/particle/emitter/IParticleEmitter;
/* check-cast v1, Lorg/anddev/andengine/entity/particle/emitter/CircleParticleEmitter; */
/* aget v3, v2, v6 */
/* const/high16 v4, 0x40a00000 # 5.0f */
/* sub-float/2addr v3, v4 */
/* aget v2, v2, v5 */
/* const/high16 v4, 0x40a00000 # 5.0f */
/* sub-float/2addr v2, v4 */
(( org.anddev.andengine.entity.particle.emitter.CircleParticleEmitter ) v1 ).setCenter ( v3, v2 ); // invoke-virtual {v1, v3, v2}, Lorg/anddev/andengine/entity/particle/emitter/CircleParticleEmitter;->setCenter(FF)V
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->i:I */
/* if-ne v1, v5, :cond_9 */
v1 = this.y;
if ( v1 != null) { // if-eqz v1, :cond_8
v1 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).j ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->j()Lcom/tgb/bg/jevcyxq/c/g;
/* iget-boolean v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->b:Z */
v3 = this.a;
/* iget v3, v3, Lcom/tgb/bg/jevcyxq/b/am;->e:I */
(( com.tgb.bg.jevcyxq.c.g ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/tgb/bg/jevcyxq/c/g;->a(ZI)Lorg/anddev/andengine/entity/particle/ParticleSystem;
v2 = this.y;
(( org.anddev.andengine.entity.particle.ParticleSystem ) v1 ).removeParticleInitializer ( v2 ); // invoke-virtual {v1, v2}, Lorg/anddev/andengine/entity/particle/ParticleSystem;->removeParticleInitializer(Lorg/anddev/andengine/entity/particle/initializer/IParticleInitializer;)V
} // :cond_8
/* new-instance v1, Lorg/anddev/andengine/entity/particle/initializer/VelocityInitializer; */
/* const/high16 v2, -0x3d600000 # -80.0f */
/* const/high16 v3, -0x3d600000 # -80.0f */
/* invoke-direct {v1, v2, v3, v8, v8}, Lorg/anddev/andengine/entity/particle/initializer/VelocityInitializer;-><init>(FFFF)V */
this.y = v1;
v1 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).j ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->j()Lcom/tgb/bg/jevcyxq/c/g;
/* iget-boolean v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->b:Z */
v3 = this.a;
/* iget v3, v3, Lcom/tgb/bg/jevcyxq/b/am;->e:I */
(( com.tgb.bg.jevcyxq.c.g ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/tgb/bg/jevcyxq/c/g;->a(ZI)Lorg/anddev/andengine/entity/particle/ParticleSystem;
v2 = this.y;
(( org.anddev.andengine.entity.particle.ParticleSystem ) v1 ).addParticleInitializer ( v2 ); // invoke-virtual {v1, v2}, Lorg/anddev/andengine/entity/particle/ParticleSystem;->addParticleInitializer(Lorg/anddev/andengine/entity/particle/initializer/IParticleInitializer;)V
v1 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).j ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->j()Lcom/tgb/bg/jevcyxq/c/g;
/* iget-boolean v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->b:Z */
v3 = this.a;
/* iget v3, v3, Lcom/tgb/bg/jevcyxq/b/am;->e:I */
(( com.tgb.bg.jevcyxq.c.g ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/tgb/bg/jevcyxq/c/g;->a(ZI)Lorg/anddev/andengine/entity/particle/ParticleSystem;
(( org.anddev.andengine.entity.particle.ParticleSystem ) v1 ).setParticlesSpawnEnabled ( v5 ); // invoke-virtual {v1, v5}, Lorg/anddev/andengine/entity/particle/ParticleSystem;->setParticlesSpawnEnabled(Z)V
} // :cond_9
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->i:I */
/* if-ne v1, v9, :cond_b */
v1 = this.y;
if ( v1 != null) { // if-eqz v1, :cond_a
v1 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).j ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->j()Lcom/tgb/bg/jevcyxq/c/g;
/* iget-boolean v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->b:Z */
v3 = this.a;
/* iget v3, v3, Lcom/tgb/bg/jevcyxq/b/am;->e:I */
(( com.tgb.bg.jevcyxq.c.g ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/tgb/bg/jevcyxq/c/g;->a(ZI)Lorg/anddev/andengine/entity/particle/ParticleSystem;
v2 = this.y;
(( org.anddev.andengine.entity.particle.ParticleSystem ) v1 ).removeParticleInitializer ( v2 ); // invoke-virtual {v1, v2}, Lorg/anddev/andengine/entity/particle/ParticleSystem;->removeParticleInitializer(Lorg/anddev/andengine/entity/particle/initializer/IParticleInitializer;)V
} // :cond_a
/* new-instance v1, Lorg/anddev/andengine/entity/particle/initializer/VelocityInitializer; */
/* const/high16 v2, 0x42a00000 # 80.0f */
/* const/high16 v3, 0x42a00000 # 80.0f */
/* invoke-direct {v1, v2, v3, v8, v8}, Lorg/anddev/andengine/entity/particle/initializer/VelocityInitializer;-><init>(FFFF)V */
this.y = v1;
v1 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).j ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->j()Lcom/tgb/bg/jevcyxq/c/g;
/* iget-boolean v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->b:Z */
v3 = this.a;
/* iget v3, v3, Lcom/tgb/bg/jevcyxq/b/am;->e:I */
(( com.tgb.bg.jevcyxq.c.g ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/tgb/bg/jevcyxq/c/g;->a(ZI)Lorg/anddev/andengine/entity/particle/ParticleSystem;
v2 = this.y;
(( org.anddev.andengine.entity.particle.ParticleSystem ) v1 ).addParticleInitializer ( v2 ); // invoke-virtual {v1, v2}, Lorg/anddev/andengine/entity/particle/ParticleSystem;->addParticleInitializer(Lorg/anddev/andengine/entity/particle/initializer/IParticleInitializer;)V
v1 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).j ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->j()Lcom/tgb/bg/jevcyxq/c/g;
/* iget-boolean v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->b:Z */
v3 = this.a;
/* iget v3, v3, Lcom/tgb/bg/jevcyxq/b/am;->e:I */
(( com.tgb.bg.jevcyxq.c.g ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/tgb/bg/jevcyxq/c/g;->a(ZI)Lorg/anddev/andengine/entity/particle/ParticleSystem;
(( org.anddev.andengine.entity.particle.ParticleSystem ) v1 ).setParticlesSpawnEnabled ( v5 ); // invoke-virtual {v1, v5}, Lorg/anddev/andengine/entity/particle/ParticleSystem;->setParticlesSpawnEnabled(Z)V
} // :cond_b
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->i:I */
int v2 = 3; // const/4 v2, 0x3
/* if-ne v1, v2, :cond_d */
v1 = this.y;
if ( v1 != null) { // if-eqz v1, :cond_c
v1 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).j ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->j()Lcom/tgb/bg/jevcyxq/c/g;
/* iget-boolean v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->b:Z */
v3 = this.a;
/* iget v3, v3, Lcom/tgb/bg/jevcyxq/b/am;->e:I */
(( com.tgb.bg.jevcyxq.c.g ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/tgb/bg/jevcyxq/c/g;->a(ZI)Lorg/anddev/andengine/entity/particle/ParticleSystem;
v2 = this.y;
(( org.anddev.andengine.entity.particle.ParticleSystem ) v1 ).removeParticleInitializer ( v2 ); // invoke-virtual {v1, v2}, Lorg/anddev/andengine/entity/particle/ParticleSystem;->removeParticleInitializer(Lorg/anddev/andengine/entity/particle/initializer/IParticleInitializer;)V
} // :cond_c
/* new-instance v1, Lorg/anddev/andengine/entity/particle/initializer/VelocityInitializer; */
/* const/high16 v2, -0x3d600000 # -80.0f */
/* const/high16 v3, -0x3d600000 # -80.0f */
/* invoke-direct {v1, v8, v8, v2, v3}, Lorg/anddev/andengine/entity/particle/initializer/VelocityInitializer;-><init>(FFFF)V */
this.y = v1;
v1 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).j ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->j()Lcom/tgb/bg/jevcyxq/c/g;
/* iget-boolean v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->b:Z */
v3 = this.a;
/* iget v3, v3, Lcom/tgb/bg/jevcyxq/b/am;->e:I */
(( com.tgb.bg.jevcyxq.c.g ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/tgb/bg/jevcyxq/c/g;->a(ZI)Lorg/anddev/andengine/entity/particle/ParticleSystem;
v2 = this.y;
(( org.anddev.andengine.entity.particle.ParticleSystem ) v1 ).addParticleInitializer ( v2 ); // invoke-virtual {v1, v2}, Lorg/anddev/andengine/entity/particle/ParticleSystem;->addParticleInitializer(Lorg/anddev/andengine/entity/particle/initializer/IParticleInitializer;)V
v1 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).j ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->j()Lcom/tgb/bg/jevcyxq/c/g;
/* iget-boolean v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->b:Z */
v3 = this.a;
/* iget v3, v3, Lcom/tgb/bg/jevcyxq/b/am;->e:I */
(( com.tgb.bg.jevcyxq.c.g ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/tgb/bg/jevcyxq/c/g;->a(ZI)Lorg/anddev/andengine/entity/particle/ParticleSystem;
(( org.anddev.andengine.entity.particle.ParticleSystem ) v1 ).setParticlesSpawnEnabled ( v5 ); // invoke-virtual {v1, v5}, Lorg/anddev/andengine/entity/particle/ParticleSystem;->setParticlesSpawnEnabled(Z)V
} // :cond_d
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->i:I */
/* if-ne v1, v7, :cond_f */
v1 = this.y;
if ( v1 != null) { // if-eqz v1, :cond_e
v1 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).j ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->j()Lcom/tgb/bg/jevcyxq/c/g;
/* iget-boolean v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->b:Z */
v3 = this.a;
/* iget v3, v3, Lcom/tgb/bg/jevcyxq/b/am;->e:I */
(( com.tgb.bg.jevcyxq.c.g ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/tgb/bg/jevcyxq/c/g;->a(ZI)Lorg/anddev/andengine/entity/particle/ParticleSystem;
v2 = this.y;
(( org.anddev.andengine.entity.particle.ParticleSystem ) v1 ).removeParticleInitializer ( v2 ); // invoke-virtual {v1, v2}, Lorg/anddev/andengine/entity/particle/ParticleSystem;->removeParticleInitializer(Lorg/anddev/andengine/entity/particle/initializer/IParticleInitializer;)V
} // :cond_e
/* new-instance v1, Lorg/anddev/andengine/entity/particle/initializer/VelocityInitializer; */
/* const/high16 v2, 0x42a00000 # 80.0f */
/* const/high16 v3, 0x42a00000 # 80.0f */
/* invoke-direct {v1, v8, v8, v2, v3}, Lorg/anddev/andengine/entity/particle/initializer/VelocityInitializer;-><init>(FFFF)V */
this.y = v1;
v1 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).j ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->j()Lcom/tgb/bg/jevcyxq/c/g;
/* iget-boolean v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->b:Z */
v3 = this.a;
/* iget v3, v3, Lcom/tgb/bg/jevcyxq/b/am;->e:I */
(( com.tgb.bg.jevcyxq.c.g ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/tgb/bg/jevcyxq/c/g;->a(ZI)Lorg/anddev/andengine/entity/particle/ParticleSystem;
v2 = this.y;
(( org.anddev.andengine.entity.particle.ParticleSystem ) v1 ).addParticleInitializer ( v2 ); // invoke-virtual {v1, v2}, Lorg/anddev/andengine/entity/particle/ParticleSystem;->addParticleInitializer(Lorg/anddev/andengine/entity/particle/initializer/IParticleInitializer;)V
v1 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).j ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->j()Lcom/tgb/bg/jevcyxq/c/g;
/* iget-boolean v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->b:Z */
v3 = this.a;
/* iget v3, v3, Lcom/tgb/bg/jevcyxq/b/am;->e:I */
(( com.tgb.bg.jevcyxq.c.g ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/tgb/bg/jevcyxq/c/g;->a(ZI)Lorg/anddev/andengine/entity/particle/ParticleSystem;
(( org.anddev.andengine.entity.particle.ParticleSystem ) v1 ).setParticlesSpawnEnabled ( v5 ); // invoke-virtual {v1, v5}, Lorg/anddev/andengine/entity/particle/ParticleSystem;->setParticlesSpawnEnabled(Z)V
} // :cond_f
} // :goto_2
/* iget-boolean v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->w:Z */
/* if-nez v1, :cond_3 */
v1 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).i ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->i()Lcom/tgb/bg/jevcyxq/c/z;
v1 = (( com.tgb.bg.jevcyxq.c.z ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/c/z;->b()Z
/* if-nez v1, :cond_3 */
/* iget-boolean v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->x:Z */
/* if-nez v1, :cond_3 */
v1 = this.a;
/* iget-boolean v1, v1, Lcom/tgb/bg/jevcyxq/b/am;->f:Z */
/* if-nez v1, :cond_3 */
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->i:I */
/* if-ne v1, v5, :cond_16 */
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->k:I */
int v2 = 7; // const/4 v2, 0x7
/* if-eq v1, v2, :cond_35 */
v1 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).i ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->i()Lcom/tgb/bg/jevcyxq/c/z;
v1 = this.a;
/* iget v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->j:I */
/* aget-object v1, v1, v2 */
/* iget v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->k:I */
/* add-int/lit8 v2, v2, 0x1 */
/* aget-object v2, v1, v2 */
if ( v2 != null) { // if-eqz v2, :cond_35
/* instance-of v1, v2, Lcom/tgb/bg/jevcyxq/b/aj; */
if ( v1 != null) { // if-eqz v1, :cond_35
/* iget-boolean v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->b:Z */
/* if-nez v1, :cond_10 */
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v1, v0 */
(( com.tgb.bg.jevcyxq.b.aj ) v1 ).a ( v6 ); // invoke-virtual {v1, v6}, Lcom/tgb/bg/jevcyxq/b/aj;->a(Z)V
} // :cond_10
/* iget-boolean v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->b:Z */
/* if-nez v1, :cond_11 */
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->l:I */
v3 = this.a;
(( com.tgb.bg.jevcyxq.b.am ) v3 ).b ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
v4 = this.a;
(( com.tgb.bg.jevcyxq.b.am ) v4 ).b ( ); // invoke-virtual {v4}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
/* array-length v4, v4 */
/* sub-int/2addr v4, v5 */
/* aget-object v3, v3, v4 */
/* iget v3, v3, Lcom/tgb/bg/jevcyxq/b/q;->l:I */
/* if-ne v1, v3, :cond_11 */
v1 = this.m;
v1 = (( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->a()I
/* if-le v1, v7, :cond_11 */
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v3, v0 */
(( com.tgb.bg.jevcyxq.b.aj ) v3 ).a ( v5 ); // invoke-virtual {v3, v5}, Lcom/tgb/bg/jevcyxq/b/aj;->a(Z)V
} // :cond_11
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v3, v0 */
v1 = (( com.tgb.bg.jevcyxq.b.aj ) v3 ).k ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/b/aj;->k()Z
if ( v1 != null) { // if-eqz v1, :cond_12
/* iget-boolean v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->b:Z */
/* if-nez v1, :cond_12 */
v1 = this.a;
v1 = (( com.tgb.bg.jevcyxq.b.am ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/am;->a()I
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v3, v0 */
v3 = (( com.tgb.bg.jevcyxq.b.aj ) v3 ).l ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/b/aj;->l()I
/* if-ne v1, v3, :cond_12 */
/* iput-boolean v5, p0, Lcom/tgb/bg/jevcyxq/b/q;->w:Z */
} // :cond_12
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v3, v0 */
v1 = (( com.tgb.bg.jevcyxq.b.aj ) v3 ).h ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/b/aj;->h()Z
if ( v1 != null) { // if-eqz v1, :cond_13
/* iput-boolean v5, p0, Lcom/tgb/bg/jevcyxq/b/q;->x:Z */
} // :cond_13
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v3, v0 */
v1 = (( com.tgb.bg.jevcyxq.b.aj ) v3 ).f ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/b/aj;->f()Z
if ( v1 != null) { // if-eqz v1, :cond_14
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v3, v0 */
v1 = (( com.tgb.bg.jevcyxq.b.aj ) v3 ).e ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/b/aj;->e()Z
if ( v1 != null) { // if-eqz v1, :cond_14
/* iput-boolean v5, p0, Lcom/tgb/bg/jevcyxq/b/q;->h:Z */
} // :cond_14
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v3, v0 */
v1 = (( com.tgb.bg.jevcyxq.b.aj ) v3 ).c ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/b/aj;->c()Z
if ( v1 != null) { // if-eqz v1, :cond_15
/* iput-boolean v5, p0, Lcom/tgb/bg/jevcyxq/b/q;->A:Z */
v1 = this.a;
(( com.tgb.bg.jevcyxq.b.am ) v1 ).e ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/am;->e()V
} // :cond_15
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v3, v0 */
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v4, v0 */
v1 = (( com.tgb.bg.jevcyxq.b.aj ) v4 ).i ( ); // invoke-virtual {v4}, Lcom/tgb/bg/jevcyxq/b/aj;->i()I
(( com.tgb.bg.jevcyxq.b.aj ) v3 ).a ( v1 ); // invoke-virtual {v3, v1}, Lcom/tgb/bg/jevcyxq/b/aj;->a(I)Lcom/tgb/bg/jevcyxq/b/o;
v3 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->b()I
if ( v3 != null) { // if-eqz v3, :cond_2d
v3 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->b()I
/* if-ne v3, v9, :cond_2d */
/* invoke-direct {p0}, Lcom/tgb/bg/jevcyxq/b/q;->t()V */
} // :cond_16
} // :goto_3
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->i:I */
/* if-ne v1, v9, :cond_1d */
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->k:I */
if ( v1 != null) { // if-eqz v1, :cond_3e
v1 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).i ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->i()Lcom/tgb/bg/jevcyxq/c/z;
v1 = this.a;
/* iget v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->j:I */
/* aget-object v1, v1, v2 */
/* iget v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->k:I */
/* sub-int/2addr v2, v5 */
/* aget-object v2, v1, v2 */
if ( v2 != null) { // if-eqz v2, :cond_3e
/* instance-of v1, v2, Lcom/tgb/bg/jevcyxq/b/aj; */
if ( v1 != null) { // if-eqz v1, :cond_3e
/* iget-boolean v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->b:Z */
/* if-nez v1, :cond_17 */
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v1, v0 */
(( com.tgb.bg.jevcyxq.b.aj ) v1 ).a ( v6 ); // invoke-virtual {v1, v6}, Lcom/tgb/bg/jevcyxq/b/aj;->a(Z)V
} // :cond_17
/* iget-boolean v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->b:Z */
/* if-nez v1, :cond_18 */
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->l:I */
v3 = this.a;
(( com.tgb.bg.jevcyxq.b.am ) v3 ).b ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
v4 = this.a;
(( com.tgb.bg.jevcyxq.b.am ) v4 ).b ( ); // invoke-virtual {v4}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
/* array-length v4, v4 */
/* sub-int/2addr v4, v5 */
/* aget-object v3, v3, v4 */
/* iget v3, v3, Lcom/tgb/bg/jevcyxq/b/q;->l:I */
/* if-ne v1, v3, :cond_18 */
v1 = this.m;
v1 = (( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->a()I
/* if-le v1, v7, :cond_18 */
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v3, v0 */
(( com.tgb.bg.jevcyxq.b.aj ) v3 ).a ( v5 ); // invoke-virtual {v3, v5}, Lcom/tgb/bg/jevcyxq/b/aj;->a(Z)V
} // :cond_18
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v3, v0 */
v1 = (( com.tgb.bg.jevcyxq.b.aj ) v3 ).k ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/b/aj;->k()Z
if ( v1 != null) { // if-eqz v1, :cond_19
/* iget-boolean v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->b:Z */
/* if-nez v1, :cond_19 */
v1 = this.a;
v1 = (( com.tgb.bg.jevcyxq.b.am ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/am;->a()I
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v3, v0 */
v3 = (( com.tgb.bg.jevcyxq.b.aj ) v3 ).l ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/b/aj;->l()I
/* if-ne v1, v3, :cond_19 */
/* iput-boolean v5, p0, Lcom/tgb/bg/jevcyxq/b/q;->w:Z */
} // :cond_19
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v3, v0 */
v1 = (( com.tgb.bg.jevcyxq.b.aj ) v3 ).h ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/b/aj;->h()Z
if ( v1 != null) { // if-eqz v1, :cond_1a
/* iput-boolean v5, p0, Lcom/tgb/bg/jevcyxq/b/q;->x:Z */
} // :cond_1a
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v3, v0 */
v1 = (( com.tgb.bg.jevcyxq.b.aj ) v3 ).f ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/b/aj;->f()Z
if ( v1 != null) { // if-eqz v1, :cond_1b
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v3, v0 */
v1 = (( com.tgb.bg.jevcyxq.b.aj ) v3 ).e ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/b/aj;->e()Z
if ( v1 != null) { // if-eqz v1, :cond_1b
/* iput-boolean v5, p0, Lcom/tgb/bg/jevcyxq/b/q;->h:Z */
} // :cond_1b
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v3, v0 */
v1 = (( com.tgb.bg.jevcyxq.b.aj ) v3 ).c ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/b/aj;->c()Z
if ( v1 != null) { // if-eqz v1, :cond_1c
/* iput-boolean v5, p0, Lcom/tgb/bg/jevcyxq/b/q;->A:Z */
v1 = this.a;
(( com.tgb.bg.jevcyxq.b.am ) v1 ).e ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/am;->e()V
} // :cond_1c
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v3, v0 */
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v4, v0 */
v1 = (( com.tgb.bg.jevcyxq.b.aj ) v4 ).i ( ); // invoke-virtual {v4}, Lcom/tgb/bg/jevcyxq/b/aj;->i()I
(( com.tgb.bg.jevcyxq.b.aj ) v3 ).a ( v1 ); // invoke-virtual {v3, v1}, Lcom/tgb/bg/jevcyxq/b/aj;->a(I)Lcom/tgb/bg/jevcyxq/b/o;
v3 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->c()I
if ( v3 != null) { // if-eqz v3, :cond_36
v3 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->c()I
/* if-ne v3, v5, :cond_36 */
/* invoke-direct {p0}, Lcom/tgb/bg/jevcyxq/b/q;->s()V */
} // :cond_1d
} // :goto_4
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->i:I */
int v2 = 3; // const/4 v2, 0x3
/* if-ne v1, v2, :cond_24 */
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->j:I */
int v2 = 5; // const/4 v2, 0x5
/* if-eq v1, v2, :cond_47 */
v1 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).i ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->i()Lcom/tgb/bg/jevcyxq/c/z;
v1 = this.a;
/* iget v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->j:I */
/* add-int/lit8 v2, v2, 0x1 */
/* aget-object v1, v1, v2 */
/* iget v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->k:I */
/* aget-object v2, v1, v2 */
if ( v2 != null) { // if-eqz v2, :cond_47
/* instance-of v1, v2, Lcom/tgb/bg/jevcyxq/b/aj; */
if ( v1 != null) { // if-eqz v1, :cond_47
/* iget-boolean v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->b:Z */
/* if-nez v1, :cond_1e */
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v1, v0 */
(( com.tgb.bg.jevcyxq.b.aj ) v1 ).a ( v6 ); // invoke-virtual {v1, v6}, Lcom/tgb/bg/jevcyxq/b/aj;->a(Z)V
} // :cond_1e
/* iget-boolean v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->b:Z */
/* if-nez v1, :cond_1f */
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->l:I */
v3 = this.a;
(( com.tgb.bg.jevcyxq.b.am ) v3 ).b ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
v4 = this.a;
(( com.tgb.bg.jevcyxq.b.am ) v4 ).b ( ); // invoke-virtual {v4}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
/* array-length v4, v4 */
/* sub-int/2addr v4, v5 */
/* aget-object v3, v3, v4 */
/* iget v3, v3, Lcom/tgb/bg/jevcyxq/b/q;->l:I */
/* if-ne v1, v3, :cond_1f */
v1 = this.m;
v1 = (( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->a()I
/* if-le v1, v7, :cond_1f */
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v3, v0 */
(( com.tgb.bg.jevcyxq.b.aj ) v3 ).a ( v5 ); // invoke-virtual {v3, v5}, Lcom/tgb/bg/jevcyxq/b/aj;->a(Z)V
} // :cond_1f
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v3, v0 */
v1 = (( com.tgb.bg.jevcyxq.b.aj ) v3 ).k ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/b/aj;->k()Z
if ( v1 != null) { // if-eqz v1, :cond_20
/* iget-boolean v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->b:Z */
/* if-nez v1, :cond_20 */
v1 = this.a;
v1 = (( com.tgb.bg.jevcyxq.b.am ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/am;->a()I
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v3, v0 */
v3 = (( com.tgb.bg.jevcyxq.b.aj ) v3 ).l ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/b/aj;->l()I
/* if-ne v1, v3, :cond_20 */
/* iput-boolean v5, p0, Lcom/tgb/bg/jevcyxq/b/q;->w:Z */
} // :cond_20
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v3, v0 */
v1 = (( com.tgb.bg.jevcyxq.b.aj ) v3 ).h ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/b/aj;->h()Z
if ( v1 != null) { // if-eqz v1, :cond_21
/* iput-boolean v5, p0, Lcom/tgb/bg/jevcyxq/b/q;->x:Z */
} // :cond_21
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v3, v0 */
v1 = (( com.tgb.bg.jevcyxq.b.aj ) v3 ).f ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/b/aj;->f()Z
if ( v1 != null) { // if-eqz v1, :cond_22
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v3, v0 */
v1 = (( com.tgb.bg.jevcyxq.b.aj ) v3 ).e ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/b/aj;->e()Z
if ( v1 != null) { // if-eqz v1, :cond_22
/* iput-boolean v5, p0, Lcom/tgb/bg/jevcyxq/b/q;->h:Z */
} // :cond_22
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v3, v0 */
v1 = (( com.tgb.bg.jevcyxq.b.aj ) v3 ).c ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/b/aj;->c()Z
if ( v1 != null) { // if-eqz v1, :cond_23
/* iput-boolean v5, p0, Lcom/tgb/bg/jevcyxq/b/q;->A:Z */
v1 = this.a;
(( com.tgb.bg.jevcyxq.b.am ) v1 ).e ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/am;->e()V
} // :cond_23
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v3, v0 */
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v4, v0 */
v1 = (( com.tgb.bg.jevcyxq.b.aj ) v4 ).i ( ); // invoke-virtual {v4}, Lcom/tgb/bg/jevcyxq/b/aj;->i()I
(( com.tgb.bg.jevcyxq.b.aj ) v3 ).a ( v1 ); // invoke-virtual {v3, v1}, Lcom/tgb/bg/jevcyxq/b/aj;->a(I)Lcom/tgb/bg/jevcyxq/b/o;
v3 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).d ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->d()I
if ( v3 != null) { // if-eqz v3, :cond_3f
v3 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).d ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->d()I
/* if-ne v3, v5, :cond_3f */
/* invoke-direct {p0}, Lcom/tgb/bg/jevcyxq/b/q;->m()V */
} // :cond_24
} // :goto_5
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->i:I */
/* if-ne v1, v7, :cond_3 */
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->j:I */
if ( v1 != null) { // if-eqz v1, :cond_50
v1 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).i ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->i()Lcom/tgb/bg/jevcyxq/c/z;
v1 = this.a;
/* iget v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->j:I */
/* sub-int/2addr v2, v5 */
/* aget-object v1, v1, v2 */
/* iget v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->k:I */
/* aget-object v2, v1, v2 */
if ( v2 != null) { // if-eqz v2, :cond_50
/* instance-of v1, v2, Lcom/tgb/bg/jevcyxq/b/aj; */
if ( v1 != null) { // if-eqz v1, :cond_50
/* iget-boolean v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->b:Z */
/* if-nez v1, :cond_25 */
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v1, v0 */
(( com.tgb.bg.jevcyxq.b.aj ) v1 ).a ( v6 ); // invoke-virtual {v1, v6}, Lcom/tgb/bg/jevcyxq/b/aj;->a(Z)V
} // :cond_25
/* iget-boolean v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->b:Z */
/* if-nez v1, :cond_26 */
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->l:I */
v3 = this.a;
(( com.tgb.bg.jevcyxq.b.am ) v3 ).b ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
v4 = this.a;
(( com.tgb.bg.jevcyxq.b.am ) v4 ).b ( ); // invoke-virtual {v4}, Lcom/tgb/bg/jevcyxq/b/am;->b()[Lcom/tgb/bg/jevcyxq/b/q;
/* array-length v4, v4 */
/* sub-int/2addr v4, v5 */
/* aget-object v3, v3, v4 */
/* iget v3, v3, Lcom/tgb/bg/jevcyxq/b/q;->l:I */
/* if-ne v1, v3, :cond_26 */
v1 = this.m;
v1 = (( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->a()I
/* if-le v1, v7, :cond_26 */
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v3, v0 */
(( com.tgb.bg.jevcyxq.b.aj ) v3 ).a ( v5 ); // invoke-virtual {v3, v5}, Lcom/tgb/bg/jevcyxq/b/aj;->a(Z)V
} // :cond_26
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v3, v0 */
v1 = (( com.tgb.bg.jevcyxq.b.aj ) v3 ).k ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/b/aj;->k()Z
if ( v1 != null) { // if-eqz v1, :cond_27
/* iget-boolean v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->b:Z */
/* if-nez v1, :cond_27 */
v1 = this.a;
v1 = (( com.tgb.bg.jevcyxq.b.am ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/am;->a()I
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v3, v0 */
v3 = (( com.tgb.bg.jevcyxq.b.aj ) v3 ).l ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/b/aj;->l()I
/* if-ne v1, v3, :cond_27 */
/* iput-boolean v5, p0, Lcom/tgb/bg/jevcyxq/b/q;->w:Z */
} // :cond_27
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v3, v0 */
v1 = (( com.tgb.bg.jevcyxq.b.aj ) v3 ).h ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/b/aj;->h()Z
if ( v1 != null) { // if-eqz v1, :cond_28
/* iput-boolean v5, p0, Lcom/tgb/bg/jevcyxq/b/q;->x:Z */
} // :cond_28
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v3, v0 */
v1 = (( com.tgb.bg.jevcyxq.b.aj ) v3 ).f ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/b/aj;->f()Z
if ( v1 != null) { // if-eqz v1, :cond_29
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v3, v0 */
v1 = (( com.tgb.bg.jevcyxq.b.aj ) v3 ).e ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/b/aj;->e()Z
if ( v1 != null) { // if-eqz v1, :cond_29
/* iput-boolean v5, p0, Lcom/tgb/bg/jevcyxq/b/q;->h:Z */
} // :cond_29
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v3, v0 */
v1 = (( com.tgb.bg.jevcyxq.b.aj ) v3 ).c ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/b/aj;->c()Z
if ( v1 != null) { // if-eqz v1, :cond_2a
/* iput-boolean v5, p0, Lcom/tgb/bg/jevcyxq/b/q;->A:Z */
v1 = this.a;
(( com.tgb.bg.jevcyxq.b.am ) v1 ).e ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/am;->e()V
} // :cond_2a
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v3, v0 */
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v4, v0 */
v1 = (( com.tgb.bg.jevcyxq.b.aj ) v4 ).i ( ); // invoke-virtual {v4}, Lcom/tgb/bg/jevcyxq/b/aj;->i()I
(( com.tgb.bg.jevcyxq.b.aj ) v3 ).a ( v1 ); // invoke-virtual {v3, v1}, Lcom/tgb/bg/jevcyxq/b/aj;->a(I)Lcom/tgb/bg/jevcyxq/b/o;
v3 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).e ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->e()I
if ( v3 != null) { // if-eqz v3, :cond_48
v3 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).e ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->e()I
/* if-ne v3, v5, :cond_48 */
/* invoke-direct {p0}, Lcom/tgb/bg/jevcyxq/b/q;->p()V */
/* goto/16 :goto_0 */
} // :cond_2b
/* move v1, v5 */
/* goto/16 :goto_1 */
} // :cond_2c
/* iget v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->l:I */
/* if-nez v1, :cond_f */
/* iget-boolean v1, p0, Lcom/tgb/bg/jevcyxq/b/q;->w:Z */
if ( v1 != null) { // if-eqz v1, :cond_f
v1 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).j ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->j()Lcom/tgb/bg/jevcyxq/c/g;
/* iget-boolean v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->b:Z */
v3 = this.a;
/* iget v3, v3, Lcom/tgb/bg/jevcyxq/b/am;->e:I */
(( com.tgb.bg.jevcyxq.c.g ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/tgb/bg/jevcyxq/c/g;->a(ZI)Lorg/anddev/andengine/entity/particle/ParticleSystem;
(( org.anddev.andengine.entity.particle.ParticleSystem ) v1 ).setParticlesSpawnEnabled ( v6 ); // invoke-virtual {v1, v6}, Lorg/anddev/andengine/entity/particle/ParticleSystem;->setParticlesSpawnEnabled(Z)V
/* goto/16 :goto_2 */
} // :cond_2d
v3 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->b()I
if ( v3 != null) { // if-eqz v3, :cond_2e
v3 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->b()I
int v4 = 3; // const/4 v4, 0x3
/* if-ne v3, v4, :cond_2e */
/* invoke-direct {p0}, Lcom/tgb/bg/jevcyxq/b/q;->v()V */
/* goto/16 :goto_3 */
} // :cond_2e
v3 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->b()I
if ( v3 != null) { // if-eqz v3, :cond_2f
v1 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->b()I
/* if-ne v1, v7, :cond_2f */
/* invoke-direct {p0}, Lcom/tgb/bg/jevcyxq/b/q;->u()V */
/* goto/16 :goto_3 */
} // :cond_2f
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v3, v0 */
v1 = (( com.tgb.bg.jevcyxq.b.aj ) v3 ).i ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/b/aj;->i()I
/* if-nez v1, :cond_30 */
/* check-cast v2, Lcom/tgb/bg/jevcyxq/b/aj; */
(( com.tgb.bg.jevcyxq.b.aj ) v2 ).a ( v5 ); // invoke-virtual {v2, v5}, Lcom/tgb/bg/jevcyxq/b/aj;->a(I)Lcom/tgb/bg/jevcyxq/b/o;
} // :goto_6
if ( v1 != null) { // if-eqz v1, :cond_34
v2 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->b()I
if ( v2 != null) { // if-eqz v2, :cond_31
v2 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->b()I
/* if-ne v2, v9, :cond_31 */
/* invoke-direct {p0}, Lcom/tgb/bg/jevcyxq/b/q;->t()V */
/* goto/16 :goto_3 */
} // :cond_30
/* check-cast v2, Lcom/tgb/bg/jevcyxq/b/aj; */
(( com.tgb.bg.jevcyxq.b.aj ) v2 ).a ( v6 ); // invoke-virtual {v2, v6}, Lcom/tgb/bg/jevcyxq/b/aj;->a(I)Lcom/tgb/bg/jevcyxq/b/o;
} // :cond_31
v2 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->b()I
if ( v2 != null) { // if-eqz v2, :cond_32
v2 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->b()I
int v3 = 3; // const/4 v3, 0x3
/* if-ne v2, v3, :cond_32 */
/* invoke-direct {p0}, Lcom/tgb/bg/jevcyxq/b/q;->v()V */
/* goto/16 :goto_3 */
} // :cond_32
v2 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->b()I
if ( v2 != null) { // if-eqz v2, :cond_33
v1 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->b()I
/* if-ne v1, v7, :cond_33 */
/* invoke-direct {p0}, Lcom/tgb/bg/jevcyxq/b/q;->u()V */
/* goto/16 :goto_3 */
} // :cond_33
v1 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).i ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->i()Lcom/tgb/bg/jevcyxq/c/z;
/* iget-boolean v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->b:Z */
v3 = this.a;
(( com.tgb.bg.jevcyxq.c.z ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/tgb/bg/jevcyxq/c/z;->a(ZLcom/tgb/bg/jevcyxq/b/am;)V
/* goto/16 :goto_3 */
} // :cond_34
v1 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).i ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->i()Lcom/tgb/bg/jevcyxq/c/z;
/* iget-boolean v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->b:Z */
v3 = this.a;
(( com.tgb.bg.jevcyxq.c.z ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/tgb/bg/jevcyxq/c/z;->a(ZLcom/tgb/bg/jevcyxq/b/am;)V
/* goto/16 :goto_3 */
} // :cond_35
v1 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).i ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->i()Lcom/tgb/bg/jevcyxq/c/z;
/* iget-boolean v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->b:Z */
v3 = this.a;
(( com.tgb.bg.jevcyxq.c.z ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/tgb/bg/jevcyxq/c/z;->a(ZLcom/tgb/bg/jevcyxq/b/am;)V
/* goto/16 :goto_3 */
} // :cond_36
v3 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->c()I
if ( v3 != null) { // if-eqz v3, :cond_37
v3 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->c()I
int v4 = 3; // const/4 v4, 0x3
/* if-ne v3, v4, :cond_37 */
/* invoke-direct {p0}, Lcom/tgb/bg/jevcyxq/b/q;->r()V */
/* goto/16 :goto_4 */
} // :cond_37
v3 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->c()I
if ( v3 != null) { // if-eqz v3, :cond_38
v1 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->c()I
/* if-ne v1, v7, :cond_38 */
/* invoke-direct {p0}, Lcom/tgb/bg/jevcyxq/b/q;->q()V */
/* goto/16 :goto_4 */
} // :cond_38
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v3, v0 */
v1 = (( com.tgb.bg.jevcyxq.b.aj ) v3 ).i ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/b/aj;->i()I
/* if-nez v1, :cond_39 */
/* check-cast v2, Lcom/tgb/bg/jevcyxq/b/aj; */
(( com.tgb.bg.jevcyxq.b.aj ) v2 ).a ( v5 ); // invoke-virtual {v2, v5}, Lcom/tgb/bg/jevcyxq/b/aj;->a(I)Lcom/tgb/bg/jevcyxq/b/o;
} // :goto_7
if ( v1 != null) { // if-eqz v1, :cond_3d
v2 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->c()I
if ( v2 != null) { // if-eqz v2, :cond_3a
v2 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->c()I
/* if-ne v2, v5, :cond_3a */
/* invoke-direct {p0}, Lcom/tgb/bg/jevcyxq/b/q;->s()V */
/* goto/16 :goto_4 */
} // :cond_39
/* check-cast v2, Lcom/tgb/bg/jevcyxq/b/aj; */
(( com.tgb.bg.jevcyxq.b.aj ) v2 ).a ( v6 ); // invoke-virtual {v2, v6}, Lcom/tgb/bg/jevcyxq/b/aj;->a(I)Lcom/tgb/bg/jevcyxq/b/o;
} // :cond_3a
v2 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->c()I
if ( v2 != null) { // if-eqz v2, :cond_3b
v2 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->c()I
int v3 = 3; // const/4 v3, 0x3
/* if-ne v2, v3, :cond_3b */
/* invoke-direct {p0}, Lcom/tgb/bg/jevcyxq/b/q;->r()V */
/* goto/16 :goto_4 */
} // :cond_3b
v2 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->c()I
if ( v2 != null) { // if-eqz v2, :cond_3c
v1 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->c()I
/* if-ne v1, v7, :cond_3c */
/* invoke-direct {p0}, Lcom/tgb/bg/jevcyxq/b/q;->q()V */
/* goto/16 :goto_4 */
} // :cond_3c
v1 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).i ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->i()Lcom/tgb/bg/jevcyxq/c/z;
/* iget-boolean v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->b:Z */
v3 = this.a;
(( com.tgb.bg.jevcyxq.c.z ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/tgb/bg/jevcyxq/c/z;->a(ZLcom/tgb/bg/jevcyxq/b/am;)V
/* goto/16 :goto_4 */
} // :cond_3d
v1 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).i ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->i()Lcom/tgb/bg/jevcyxq/c/z;
/* iget-boolean v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->b:Z */
v3 = this.a;
(( com.tgb.bg.jevcyxq.c.z ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/tgb/bg/jevcyxq/c/z;->a(ZLcom/tgb/bg/jevcyxq/b/am;)V
/* goto/16 :goto_4 */
} // :cond_3e
v1 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).i ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->i()Lcom/tgb/bg/jevcyxq/c/z;
/* iget-boolean v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->b:Z */
v3 = this.a;
(( com.tgb.bg.jevcyxq.c.z ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/tgb/bg/jevcyxq/c/z;->a(ZLcom/tgb/bg/jevcyxq/b/am;)V
/* goto/16 :goto_4 */
} // :cond_3f
v3 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).d ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->d()I
if ( v3 != null) { // if-eqz v3, :cond_40
v3 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).d ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->d()I
/* if-ne v3, v7, :cond_40 */
/* invoke-direct {p0}, Lcom/tgb/bg/jevcyxq/b/q;->l()V */
/* goto/16 :goto_5 */
} // :cond_40
v3 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).d ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->d()I
if ( v3 != null) { // if-eqz v3, :cond_41
v1 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).d ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->d()I
/* if-ne v1, v9, :cond_41 */
/* invoke-direct {p0}, Lcom/tgb/bg/jevcyxq/b/q;->k()V */
/* goto/16 :goto_5 */
} // :cond_41
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v3, v0 */
v1 = (( com.tgb.bg.jevcyxq.b.aj ) v3 ).i ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/b/aj;->i()I
/* if-nez v1, :cond_42 */
/* check-cast v2, Lcom/tgb/bg/jevcyxq/b/aj; */
(( com.tgb.bg.jevcyxq.b.aj ) v2 ).a ( v5 ); // invoke-virtual {v2, v5}, Lcom/tgb/bg/jevcyxq/b/aj;->a(I)Lcom/tgb/bg/jevcyxq/b/o;
} // :goto_8
if ( v1 != null) { // if-eqz v1, :cond_46
v2 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).d ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->d()I
if ( v2 != null) { // if-eqz v2, :cond_43
v2 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).d ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->d()I
/* if-ne v2, v5, :cond_43 */
/* invoke-direct {p0}, Lcom/tgb/bg/jevcyxq/b/q;->m()V */
/* goto/16 :goto_5 */
} // :cond_42
/* check-cast v2, Lcom/tgb/bg/jevcyxq/b/aj; */
(( com.tgb.bg.jevcyxq.b.aj ) v2 ).a ( v6 ); // invoke-virtual {v2, v6}, Lcom/tgb/bg/jevcyxq/b/aj;->a(I)Lcom/tgb/bg/jevcyxq/b/o;
} // :cond_43
v2 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).d ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->d()I
if ( v2 != null) { // if-eqz v2, :cond_44
v2 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).d ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->d()I
/* if-ne v2, v7, :cond_44 */
/* invoke-direct {p0}, Lcom/tgb/bg/jevcyxq/b/q;->l()V */
/* goto/16 :goto_5 */
} // :cond_44
v2 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).d ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->d()I
if ( v2 != null) { // if-eqz v2, :cond_45
v1 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).d ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->d()I
/* if-ne v1, v9, :cond_45 */
/* invoke-direct {p0}, Lcom/tgb/bg/jevcyxq/b/q;->k()V */
/* goto/16 :goto_5 */
} // :cond_45
v1 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).i ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->i()Lcom/tgb/bg/jevcyxq/c/z;
/* iget-boolean v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->b:Z */
v3 = this.a;
(( com.tgb.bg.jevcyxq.c.z ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/tgb/bg/jevcyxq/c/z;->a(ZLcom/tgb/bg/jevcyxq/b/am;)V
/* goto/16 :goto_5 */
} // :cond_46
v1 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).i ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->i()Lcom/tgb/bg/jevcyxq/c/z;
/* iget-boolean v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->b:Z */
v3 = this.a;
(( com.tgb.bg.jevcyxq.c.z ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/tgb/bg/jevcyxq/c/z;->a(ZLcom/tgb/bg/jevcyxq/b/am;)V
/* goto/16 :goto_5 */
} // :cond_47
v1 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).i ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->i()Lcom/tgb/bg/jevcyxq/c/z;
/* iget-boolean v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->b:Z */
v3 = this.a;
(( com.tgb.bg.jevcyxq.c.z ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/tgb/bg/jevcyxq/c/z;->a(ZLcom/tgb/bg/jevcyxq/b/am;)V
/* goto/16 :goto_5 */
} // :cond_48
v3 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).e ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->e()I
if ( v3 != null) { // if-eqz v3, :cond_49
v3 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).e ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->e()I
int v4 = 3; // const/4 v4, 0x3
/* if-ne v3, v4, :cond_49 */
/* invoke-direct {p0}, Lcom/tgb/bg/jevcyxq/b/q;->o()V */
/* goto/16 :goto_0 */
} // :cond_49
v3 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).e ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->e()I
if ( v3 != null) { // if-eqz v3, :cond_4a
v1 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).e ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->e()I
/* if-ne v1, v9, :cond_4a */
/* invoke-direct {p0}, Lcom/tgb/bg/jevcyxq/b/q;->n()V */
/* goto/16 :goto_0 */
} // :cond_4a
/* move-object v0, v2 */
/* check-cast v0, Lcom/tgb/bg/jevcyxq/b/aj; */
/* move-object v3, v0 */
v1 = (( com.tgb.bg.jevcyxq.b.aj ) v3 ).i ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/b/aj;->i()I
/* if-nez v1, :cond_4b */
/* check-cast v2, Lcom/tgb/bg/jevcyxq/b/aj; */
(( com.tgb.bg.jevcyxq.b.aj ) v2 ).a ( v5 ); // invoke-virtual {v2, v5}, Lcom/tgb/bg/jevcyxq/b/aj;->a(I)Lcom/tgb/bg/jevcyxq/b/o;
} // :goto_9
if ( v1 != null) { // if-eqz v1, :cond_4f
v2 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).e ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->e()I
if ( v2 != null) { // if-eqz v2, :cond_4c
v2 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).e ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->e()I
/* if-ne v2, v5, :cond_4c */
/* invoke-direct {p0}, Lcom/tgb/bg/jevcyxq/b/q;->p()V */
/* goto/16 :goto_0 */
} // :cond_4b
/* check-cast v2, Lcom/tgb/bg/jevcyxq/b/aj; */
(( com.tgb.bg.jevcyxq.b.aj ) v2 ).a ( v6 ); // invoke-virtual {v2, v6}, Lcom/tgb/bg/jevcyxq/b/aj;->a(I)Lcom/tgb/bg/jevcyxq/b/o;
} // :cond_4c
v2 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).e ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->e()I
if ( v2 != null) { // if-eqz v2, :cond_4d
v2 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).e ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->e()I
int v3 = 3; // const/4 v3, 0x3
/* if-ne v2, v3, :cond_4d */
/* invoke-direct {p0}, Lcom/tgb/bg/jevcyxq/b/q;->o()V */
/* goto/16 :goto_0 */
} // :cond_4d
v2 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).e ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->e()I
if ( v2 != null) { // if-eqz v2, :cond_4e
v1 = (( com.tgb.bg.jevcyxq.b.o ) v1 ).e ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/o;->e()I
/* if-ne v1, v9, :cond_4e */
/* invoke-direct {p0}, Lcom/tgb/bg/jevcyxq/b/q;->n()V */
/* goto/16 :goto_0 */
} // :cond_4e
v1 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).i ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->i()Lcom/tgb/bg/jevcyxq/c/z;
/* iget-boolean v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->b:Z */
v3 = this.a;
(( com.tgb.bg.jevcyxq.c.z ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/tgb/bg/jevcyxq/c/z;->a(ZLcom/tgb/bg/jevcyxq/b/am;)V
/* goto/16 :goto_0 */
} // :cond_4f
v1 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).i ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->i()Lcom/tgb/bg/jevcyxq/c/z;
/* iget-boolean v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->b:Z */
v3 = this.a;
(( com.tgb.bg.jevcyxq.c.z ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/tgb/bg/jevcyxq/c/z;->a(ZLcom/tgb/bg/jevcyxq/b/am;)V
/* goto/16 :goto_0 */
} // :cond_50
v1 = this.m;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).i ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->i()Lcom/tgb/bg/jevcyxq/c/z;
/* iget-boolean v2, p0, Lcom/tgb/bg/jevcyxq/b/q;->b:Z */
v3 = this.a;
(( com.tgb.bg.jevcyxq.c.z ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/tgb/bg/jevcyxq/c/z;->a(ZLcom/tgb/bg/jevcyxq/b/am;)V
/* goto/16 :goto_0 */
} // .end method
