public class com.doodlemobile.basket.graphics.TileAnimation extends com.doodlemobile.basket.graphics.Animation {
	 /* # instance fields */
	 protected com.doodlemobile.basket.graphics.e a;
	 protected Float b;
	 protected Float c;
	 protected Integer d;
	 protected Integer e;
	 private com.doodlemobile.basket.b.b g;
	 /* # direct methods */
	 static com.doodlemobile.basket.graphics.TileAnimation ( ) {
		 /* .locals 0 */
		 com.doodlemobile.basket.util.Util .a ( );
		 return;
	 } // .end method
	 public com.doodlemobile.basket.graphics.TileAnimation ( ) {
		 /* .locals 5 */
		 int v4 = 1; // const/4 v4, 0x1
		 int v3 = 0; // const/4 v3, 0x0
		 /* const/high16 v1, -0x40800000 # -1.0f */
		 int v2 = 0; // const/4 v2, 0x0
		 /* invoke-direct {p0}, Lcom/doodlemobile/basket/graphics/Animation;-><init>()V */
		 this.g = p1;
		 v0 = 		 final String v0 = "tile_width"; // const-string v0, "tile_width"
		 /* iput v0, p0, Lcom/doodlemobile/basket/graphics/TileAnimation;->b:F */
		 v0 = 		 final String v0 = "tile_height"; // const-string v0, "tile_height"
		 /* iput v0, p0, Lcom/doodlemobile/basket/graphics/TileAnimation;->c:F */
		 v0 = 		 final String v0 = "columns"; // const-string v0, "columns"
		 /* iput v0, p0, Lcom/doodlemobile/basket/graphics/TileAnimation;->d:I */
		 v0 = 		 final String v0 = "rows"; // const-string v0, "rows"
		 /* iput v0, p0, Lcom/doodlemobile/basket/graphics/TileAnimation;->e:I */
		 final String v0 = "texture"; // const-string v0, "texture"
		 v0 = 		 int v1 = 0; // const/4 v1, 0x0
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 com.doodlemobile.basket.graphics.e .a ( p1,v0 );
			 this.a = v0;
			 /* iget v0, p0, Lcom/doodlemobile/basket/graphics/TileAnimation;->b:F */
			 /* cmpg-float v0, v0, v3 */
			 /* if-gtz v0, :cond_0 */
			 v0 = this.a;
			 v0 = 			 (( com.doodlemobile.basket.graphics.e ) v0 ).j ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/graphics/e;->j()I
			 /* iget v1, p0, Lcom/doodlemobile/basket/graphics/TileAnimation;->d:I */
			 /* div-int/2addr v0, v1 */
			 /* int-to-float v0, v0 */
			 /* iput v0, p0, Lcom/doodlemobile/basket/graphics/TileAnimation;->b:F */
		 } // :cond_0
		 /* iget v0, p0, Lcom/doodlemobile/basket/graphics/TileAnimation;->c:F */
		 /* cmpg-float v0, v0, v3 */
		 /* if-gtz v0, :cond_1 */
		 v0 = this.a;
		 v0 = 		 (( com.doodlemobile.basket.graphics.e ) v0 ).k ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/graphics/e;->k()I
		 /* iget v1, p0, Lcom/doodlemobile/basket/graphics/TileAnimation;->e:I */
		 /* div-int/2addr v0, v1 */
		 /* int-to-float v0, v0 */
		 /* iput v0, p0, Lcom/doodlemobile/basket/graphics/TileAnimation;->c:F */
	 } // :cond_1
	 /* iget-wide v0, p0, Lcom/doodlemobile/basket/graphics/TileAnimation;->f:J */
	 /* const-wide/16 v2, 0x0 */
	 /* cmp-long v0, v0, v2 */
	 /* if-nez v0, :cond_2 */
	 /* iget v0, p0, Lcom/doodlemobile/basket/graphics/TileAnimation;->b:F */
	 v1 = this.a;
	 /* iget v1, v1, Lcom/doodlemobile/basket/graphics/e;->b:I */
	 /* int-to-float v1, v1 */
	 /* div-float/2addr v0, v1 */
	 /* iget v1, p0, Lcom/doodlemobile/basket/graphics/TileAnimation;->c:F */
	 v2 = this.a;
	 /* iget v2, v2, Lcom/doodlemobile/basket/graphics/e;->c:I */
	 /* int-to-float v2, v2 */
	 /* div-float/2addr v1, v2 */
	 /* iget v2, p0, Lcom/doodlemobile/basket/graphics/TileAnimation;->d:I */
	 /* iget v3, p0, Lcom/doodlemobile/basket/graphics/TileAnimation;->e:I */
	 com.doodlemobile.basket.graphics.TileAnimation .createNativeObject ( v0,v1,v2,v3 );
	 /* move-result-wide v0 */
	 /* iput-wide v0, p0, Lcom/doodlemobile/basket/graphics/TileAnimation;->f:J */
} // :cond_2
return;
} // .end method
protected static native Long createNativeObject ( Float p0, Float p1, Integer p2, Integer p3 ) {
} // .end method
protected static native void setTileTexcoord ( Long p0, Integer p1, Float p2, Float p3, Float p4, Float p5 ) {
} // .end method
protected static native void setTileVertices ( Long p0, Integer p1, Float p2, Float p3, Float p4, Float p5 ) {
} // .end method
/* # virtual methods */
public com.doodlemobile.basket.graphics.i a ( ) {
/* .locals 1 */
/* new-instance v0, Lcom/doodlemobile/basket/graphics/h; */
/* invoke-direct {v0, p0}, Lcom/doodlemobile/basket/graphics/h;-><init>(Lcom/doodlemobile/basket/graphics/TileAnimation;)V */
} // .end method
public void a ( com.doodlemobile.basket.math.MatrixStack p0, Integer p1, Float p2, Float p3, Float p4, Float p5 ) {
/* .locals 10 */
/* iget-wide v0, p0, Lcom/doodlemobile/basket/graphics/TileAnimation;->f:J */
/* const-wide/16 v2, 0x0 */
/* cmp-long v0, v0, v2 */
/* if-nez v0, :cond_0 */
/* iget v0, p0, Lcom/doodlemobile/basket/graphics/TileAnimation;->b:F */
v1 = this.a;
/* iget v1, v1, Lcom/doodlemobile/basket/graphics/e;->b:I */
/* int-to-float v1, v1 */
/* div-float/2addr v0, v1 */
/* iget v1, p0, Lcom/doodlemobile/basket/graphics/TileAnimation;->c:F */
v2 = this.a;
/* iget v2, v2, Lcom/doodlemobile/basket/graphics/e;->c:I */
/* int-to-float v2, v2 */
/* div-float/2addr v1, v2 */
/* iget v2, p0, Lcom/doodlemobile/basket/graphics/TileAnimation;->d:I */
/* iget v3, p0, Lcom/doodlemobile/basket/graphics/TileAnimation;->e:I */
com.doodlemobile.basket.graphics.TileAnimation .createNativeObject ( v0,v1,v2,v3 );
/* move-result-wide v0 */
/* iput-wide v0, p0, Lcom/doodlemobile/basket/graphics/TileAnimation;->f:J */
} // :cond_0
/* iget-wide v0, p0, Lcom/doodlemobile/basket/graphics/TileAnimation;->f:J */
(( com.doodlemobile.basket.math.MatrixStack ) p1 ).d ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/math/MatrixStack;->d()J
/* move-result-wide v2 */
v4 = this.a;
v4 = (( com.doodlemobile.basket.graphics.e ) v4 ).o ( ); // invoke-virtual {v4}, Lcom/doodlemobile/basket/graphics/e;->o()I
/* mul-float v6, p3, p6 */
/* mul-float v7, p4, p6 */
/* mul-float v8, p5, p6 */
/* move v5, p2 */
/* move/from16 v9, p6 */
/* invoke-static/range {v0 ..v9}, Lcom/doodlemobile/basket/graphics/Animation;->callrender1(JJIIFFFF)V */
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 1 */
v0 = this.a;
v0 = (( com.doodlemobile.basket.graphics.e ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/graphics/e;->a()Z
/* if-nez v0, :cond_0 */
v0 = this.a;
(( com.doodlemobile.basket.graphics.e ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lcom/doodlemobile/basket/graphics/e;->a(Lcom/doodlemobile/basket/opengl/m;)V
} // :cond_0
return;
} // .end method
public final void b ( ) {
/* .locals 1 */
v0 = this.a;
(( com.doodlemobile.basket.graphics.e ) v0 ).n ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/graphics/e;->n()V
return;
} // .end method
