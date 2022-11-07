public class com.doodlemobile.basket.game2d.i extends com.doodlemobile.basket.s implements com.doodlemobile.basket.l {
	 /* # interfaces */
	 /* # instance fields */
	 private com.doodlemobile.basket.game2d.h a;
	 public Float b;
	 public Float c;
	 protected com.doodlemobile.basket.game2d.g d;
	 private Boolean e;
	 private com.doodlemobile.basket.game2d.h f;
	 /* # direct methods */
	 public com.doodlemobile.basket.game2d.i ( ) {
		 /* .locals 2 */
		 /* const/high16 v1, -0x40800000 # -1.0f */
		 /* invoke-direct {p0, p1}, Lcom/doodlemobile/basket/s;-><init>(Lcom/doodlemobile/basket/b/b;)V */
		 int v0 = 0; // const/4 v0, 0x0
		 this.a = v0;
		 /* iput v1, p0, Lcom/doodlemobile/basket/game2d/i;->b:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/game2d/i;->c:F */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lcom/doodlemobile/basket/game2d/i;->e:Z */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( Float p0, Float p1 ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lcom/doodlemobile/basket/game2d/i;->b:F */
		 /* cmpl-float v0, v0, p1 */
		 /* if-nez v0, :cond_0 */
		 /* iget v0, p0, Lcom/doodlemobile/basket/game2d/i;->c:F */
		 /* cmpl-float v0, v0, p2 */
		 /* if-nez v0, :cond_0 */
	 } // :goto_0
	 return;
} // :cond_0
/* iput p1, p0, Lcom/doodlemobile/basket/game2d/i;->b:F */
/* iput p2, p0, Lcom/doodlemobile/basket/game2d/i;->c:F */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/doodlemobile/basket/game2d/i;->e:Z */
} // .end method
public final void a ( Integer p0, Integer p1 ) {
/* .locals 2 */
int v1 = 0; // const/4 v1, 0x0
/* iget v0, p0, Lcom/doodlemobile/basket/game2d/i;->b:F */
/* cmpg-float v0, v0, v1 */
/* if-ltz v0, :cond_0 */
/* iget v0, p0, Lcom/doodlemobile/basket/game2d/i;->c:F */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_1 */
} // :cond_0
/* int-to-float v0, p1 */
/* int-to-float v1, p2 */
(( com.doodlemobile.basket.game2d.i ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/doodlemobile/basket/game2d/i;->a(FF)V
} // :cond_1
return;
} // .end method
public void a ( Long p0 ) {
/* .locals 2 */
int v1 = 0; // const/4 v1, 0x0
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/game2d/i;->e:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
/* iput-boolean v1, p0, Lcom/doodlemobile/basket/game2d/i;->e:Z */
} // :cond_0
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
/* move v0, v1 */
} // :goto_0
v1 = this.a;
/* array-length v1, v1 */
/* if-ge v0, v1, :cond_1 */
v1 = this.a;
/* aget-object v1, v1, v0 */
(( com.doodlemobile.basket.game2d.h ) v1 ).a ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Lcom/doodlemobile/basket/game2d/h;->a(J)V
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
return;
} // .end method
public final void a ( Object p0 ) {
/* .locals 2 */
this.d = p1;
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
v1 = this.a;
/* array-length v1, v1 */
/* if-ge v0, v1, :cond_0 */
v1 = this.a;
/* aget-object v1, v1, v0 */
(( com.doodlemobile.basket.game2d.h ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Lcom/doodlemobile/basket/game2d/h;->a(Lcom/doodlemobile/basket/game2d/g;)V
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
return;
} // .end method
public final void a ( Object p0, com.doodlemobile.basket.math.MatrixStack p1 ) {
/* .locals 2 */
(( com.doodlemobile.basket.math.MatrixStack ) p2 ).b ( ); // invoke-virtual {p2}, Lcom/doodlemobile/basket/math/MatrixStack;->b()V
/* iget v0, p0, Lcom/doodlemobile/basket/game2d/i;->b:F */
/* iget v1, p0, Lcom/doodlemobile/basket/game2d/i;->c:F */
(( com.doodlemobile.basket.math.MatrixStack ) p2 ).c ( v0, v1 ); // invoke-virtual {p2, v0, v1}, Lcom/doodlemobile/basket/math/MatrixStack;->c(FF)V
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 2 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
com.doodlemobile.basket.e .a ( p1,p0 );
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
v1 = this.a;
/* array-length v1, v1 */
/* if-ge v0, v1, :cond_0 */
v1 = this.a;
/* aget-object v1, v1, v0 */
(( com.doodlemobile.basket.game2d.h ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Lcom/doodlemobile/basket/game2d/h;->a(Lcom/doodlemobile/basket/p;)V
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
com.doodlemobile.basket.e .b ( p1,p0 );
} // :cond_1
return;
} // .end method
public final void a ( Object[] p0 ) {
/* .locals 3 */
this.a = p1;
if ( p1 != null) { // if-eqz p1, :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* array-length v1, p1 */
/* if-ge v0, v1, :cond_0 */
/* aget-object v1, p1, v0 */
v2 = this.d;
(( com.doodlemobile.basket.game2d.h ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lcom/doodlemobile/basket/game2d/h;->a(Lcom/doodlemobile/basket/game2d/g;)V
/* aget-object v1, p1, v0 */
this.a = p0;
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
return;
} // .end method
public final Boolean a ( Object p0 ) {
/* .locals 6 */
int v5 = 0; // const/4 v5, 0x0
int v2 = 0; // const/4 v2, 0x0
int v4 = 1; // const/4 v4, 0x1
v0 = (( com.doodlemobile.basket.util.e ) p1 ).d ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->d()I
/* iget v1, p0, Lcom/doodlemobile/basket/game2d/i;->b:F */
/* cmpl-float v1, v1, v2 */
/* if-lez v1, :cond_0 */
/* iget v1, p0, Lcom/doodlemobile/basket/game2d/i;->c:F */
/* cmpl-float v1, v1, v2 */
/* if-lez v1, :cond_0 */
/* iget v1, p0, Lcom/doodlemobile/basket/game2d/i;->b:F */
/* iget v2, p0, Lcom/doodlemobile/basket/game2d/i;->c:F */
(( com.doodlemobile.basket.util.e ) p1 ).c ( v1, v2 ); // invoke-virtual {p1, v1, v2}, Lcom/doodlemobile/basket/util/e;->c(FF)V
} // :cond_0
/* if-nez v0, :cond_3 */
v1 = this.f;
if ( v1 != null) { // if-eqz v1, :cond_1
this.f = v5;
} // :cond_1
v1 = this.a;
/* array-length v1, v1 */
/* sub-int/2addr v1, v4 */
} // :goto_0
/* if-ltz v1, :cond_3 */
v2 = this.a;
/* aget-object v2, v2, v1 */
if ( v2 != null) { // if-eqz v2, :cond_2
v3 = (( com.doodlemobile.basket.game2d.h ) v2 ).a ( p1 ); // invoke-virtual {v2, p1}, Lcom/doodlemobile/basket/game2d/h;->a(Lcom/doodlemobile/basket/util/e;)Z
if ( v3 != null) { // if-eqz v3, :cond_2
this.f = v2;
/* move v0, v4 */
} // :goto_1
} // :cond_2
/* add-int/lit8 v1, v1, -0x1 */
} // :cond_3
/* if-eq v0, v4, :cond_4 */
int v1 = 3; // const/4 v1, 0x3
/* if-ne v0, v1, :cond_5 */
} // :cond_4
/* move v0, v4 */
} // :goto_2
v1 = this.f;
/* if-nez v1, :cond_6 */
v0 = /* invoke-super {p0, p1}, Lcom/doodlemobile/basket/s;->a(Lcom/doodlemobile/basket/util/e;)Z */
} // :cond_5
int v0 = 0; // const/4 v0, 0x0
} // :cond_6
if ( v0 != null) { // if-eqz v0, :cond_7
this.f = v5;
} // :cond_7
v0 = (( com.doodlemobile.basket.game2d.h ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Lcom/doodlemobile/basket/game2d/h;->a(Lcom/doodlemobile/basket/util/e;)Z
} // .end method
public final void b ( Object p0, com.doodlemobile.basket.math.MatrixStack p1 ) {
/* .locals 0 */
(( com.doodlemobile.basket.math.MatrixStack ) p2 ).c ( ); // invoke-virtual {p2}, Lcom/doodlemobile/basket/math/MatrixStack;->c()V
return;
} // .end method
public final void m ( ) {
/* .locals 4 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
/* array-length v1, v0 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_0 */
/* aget-object v3, v0, v2 */
(( com.doodlemobile.basket.game2d.h ) v3 ).b ( ); // invoke-virtual {v3}, Lcom/doodlemobile/basket/game2d/h;->b()V
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_0
return;
} // .end method
