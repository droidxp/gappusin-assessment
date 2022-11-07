public class com.doodlemobile.basket.game2d.h implements com.doodlemobile.basket.b implements com.doodlemobile.basket.l {
	 /* # interfaces */
	 /* # instance fields */
	 public com.doodlemobile.basket.game2d.i a;
	 protected com.doodlemobile.basket.game2d.g b;
	 public Float c;
	 public Float d;
	 public Float e;
	 public Float f;
	 protected com.doodlemobile.basket.game2d.g g;
	 private com.doodlemobile.basket.b.b h;
	 private Integer i;
	 /* # direct methods */
	 public com.doodlemobile.basket.game2d.h ( ) {
		 /* .locals 3 */
		 /* const/high16 v2, 0x3f800000 # 1.0f */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = -1; // const/4 v0, -0x1
		 /* iput v0, p0, Lcom/doodlemobile/basket/game2d/h;->i:I */
		 /* iput v2, p0, Lcom/doodlemobile/basket/game2d/h;->c:F */
		 /* iput v2, p0, Lcom/doodlemobile/basket/game2d/h;->d:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/game2d/h;->e:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/game2d/h;->f:F */
		 this.h = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( Integer p0, Integer p1, java.lang.Object p2 ) {
		 /* .locals 0 */
		 /* packed-switch p1, :pswitch_data_0 */
	 } // :goto_0
	 return;
	 /* :pswitch_0 */
	 /* check-cast p3, Lcom/doodlemobile/basket/game2d/g; */
	 this.g = p3;
	 /* nop */
	 /* :pswitch_data_0 */
	 /* .packed-switch 0x1001 */
	 /* :pswitch_0 */
} // .end packed-switch
} // .end method
protected void a ( Long p0 ) {
/* .locals 0 */
return;
} // .end method
public final void a ( Object p0 ) {
/* .locals 3 */
v0 = this.h;
/* const/16 v1, 0x1001 */
int v2 = 0; // const/4 v2, 0x0
this.b = p1;
return;
} // .end method
public final void a ( Object p0, com.doodlemobile.basket.math.MatrixStack p1 ) {
/* .locals 6 */
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = this.g;
	 /* iget v2, p0, Lcom/doodlemobile/basket/game2d/h;->c:F */
	 /* iget v3, p0, Lcom/doodlemobile/basket/game2d/h;->d:F */
	 /* iget v4, p0, Lcom/doodlemobile/basket/game2d/h;->e:F */
	 /* iget v5, p0, Lcom/doodlemobile/basket/game2d/h;->f:F */
	 /* move-object v1, p2 */
	 /* invoke-virtual/range {v0 ..v5}, Lcom/doodlemobile/basket/game2d/g;->a(Lcom/doodlemobile/basket/math/MatrixStack;FFFF)V */
} // :cond_0
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 0 */
com.doodlemobile.basket.e .a ( p1,p0 );
(( com.doodlemobile.basket.game2d.h ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lcom/doodlemobile/basket/game2d/h;->b(Lcom/doodlemobile/basket/p;)V
com.doodlemobile.basket.e .b ( p1,p0 );
return;
} // .end method
public Boolean a ( Object p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void b ( ) {
/* .locals 0 */
return;
} // .end method
public final void b ( Object p0, com.doodlemobile.basket.math.MatrixStack p1 ) {
/* .locals 1 */
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_0
	 (( com.doodlemobile.basket.math.MatrixStack ) p2 ).c ( ); // invoke-virtual {p2}, Lcom/doodlemobile/basket/math/MatrixStack;->c()V
} // :cond_0
return;
} // .end method
protected void b ( Object p0 ) {
/* .locals 0 */
return;
} // .end method
