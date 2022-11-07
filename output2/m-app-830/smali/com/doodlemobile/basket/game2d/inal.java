public class inal implements com.doodlemobile.basket.b {
	 /* # interfaces */
	 /* # instance fields */
	 private Float a;
	 private Float b;
	 private com.doodlemobile.basket.b.b c;
	 private Float d;
	 private Float e;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput v0, p0, Lcom/doodlemobile/basket/game2d/g;->a:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/game2d/g;->b:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/game2d/g;->d:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/game2d/g;->e:F */
		 this.c = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final Float a ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lcom/doodlemobile/basket/game2d/g;->a:F */
	 } // .end method
	 public final Float a ( Float p0, Float p1 ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lcom/doodlemobile/basket/game2d/g;->a:F */
		 /* mul-float/2addr v0, p1 */
		 /* add-float/2addr v0, p2 */
	 } // .end method
	 public final void a ( Integer p0, Integer p1, java.lang.Object p2 ) {
		 /* .locals 1 */
		 /* packed-switch p1, :pswitch_data_0 */
	 } // :goto_0
	 return;
	 /* :pswitch_0 */
	 v0 = 	 java.lang.Float .intBitsToFloat ( p2 );
	 /* iput v0, p0, Lcom/doodlemobile/basket/game2d/g;->d:F */
	 /* :pswitch_1 */
	 v0 = 	 java.lang.Float .intBitsToFloat ( p2 );
	 /* iput v0, p0, Lcom/doodlemobile/basket/game2d/g;->e:F */
	 /* :pswitch_data_0 */
	 /* .packed-switch 0x0 */
	 /* :pswitch_0 */
	 /* :pswitch_1 */
} // .end packed-switch
} // .end method
public final void a ( com.doodlemobile.basket.math.MatrixStack p0, Float p1, Float p2, Float p3, Float p4 ) {
/* .locals 2 */
(( com.doodlemobile.basket.math.MatrixStack ) p1 ).b ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/math/MatrixStack;->b()V
/* iget v0, p0, Lcom/doodlemobile/basket/game2d/g;->d:F */
/* mul-float/2addr v0, p2 */
/* add-float/2addr v0, p4 */
/* iget v1, p0, Lcom/doodlemobile/basket/game2d/g;->e:F */
/* mul-float/2addr v1, p3 */
/* add-float/2addr v1, p5 */
/* neg-float v0, v0 */
/* neg-float v1, v1 */
(( com.doodlemobile.basket.math.MatrixStack ) p1 ).a ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lcom/doodlemobile/basket/math/MatrixStack;->a(FF)V
return;
} // .end method
public final Float b ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/game2d/g;->b:F */
} // .end method
public final Float b ( Float p0, Float p1 ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/game2d/g;->b:F */
/* mul-float/2addr v0, p1 */
/* add-float/2addr v0, p2 */
} // .end method
d_0
(( com.doodlemobile.basket.game2d.c ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/doodlemobile/basket/game2d/c;->a()V
return;
} // .end method
public final void a ( Object p0 ) {
/* .locals 2 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
/* new-instance v0, Ljava/lang/RuntimeException; */
final String v1 = "Sprite already added to layer!"; // const-string v1, "Sprite already added to layer!"
/* invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_0
v0 = (( com.doodlemobile.basket.game2d.a ) p1 ).f ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/game2d/a;->f()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* new-instance v0, Ljava/lang/RuntimeException; */
final String v1 = "Sprite is already dead.It\'s dangerous."; // const-string v1, "Sprite is already dead.It\'s dangerous."
/* invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_1
v0 = this.h;
(( java.util.ArrayList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
(( com.doodlemobile.basket.game2d.a ) p1 ).a ( p0 ); // invoke-virtual {p1, p0}, Lcom/doodlemobile/basket/game2d/a;->a(Lcom/doodlemobile/basket/game2d/c;)V
return;
} // .end method
public final void a ( Object p0 ) {
/* .locals 0 */
(( com.doodlemobile.basket.game2d.c ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lcom/doodlemobile/basket/game2d/c;->b(Lcom/doodlemobile/basket/p;)V
return;
} // .end method
public final Boolean a ( Object p0 ) {
/* .locals 8 */
int v7 = 0; // const/4 v7, 0x0
int v6 = 1; // const/4 v6, 0x1
v1 = (( com.doodlemobile.basket.util.e ) p1 ).d ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->d()I
v2 = (( com.doodlemobile.basket.util.e ) p1 ).a ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->a()F
v3 = (( com.doodlemobile.basket.util.e ) p1 ).b ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->b()F
/* if-nez v1, :cond_3 */
v0 = this.i;
if ( v0 != null) { // if-eqz v0, :cond_0
this.i = v7;
} // :cond_0
v0 = this.h;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* sub-int/2addr v0, v6 */
/* move v4, v0 */
} // :goto_0
/* if-ltz v4, :cond_2 */
v0 = this.h;
(( java.util.ArrayList ) v0 ).get ( v4 ); // invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/doodlemobile/basket/game2d/a; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* iget-boolean v5, v0, Lcom/doodlemobile/basket/game2d/a;->d:Z */
if ( v5 != null) { // if-eqz v5, :cond_1
v5 = this.g;
v5 = (( com.doodlemobile.basket.game2d.a ) v0 ).a ( p1, v5 ); // invoke-virtual {v0, p1, v5}, Lcom/doodlemobile/basket/game2d/a;->a(Lcom/doodlemobile/basket/util/e;Lcom/doodlemobile/basket/game2d/g;)Z
if ( v5 != null) { // if-eqz v5, :cond_1
v5 = (( com.doodlemobile.basket.game2d.a ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lcom/doodlemobile/basket/game2d/a;->b(Lcom/doodlemobile/basket/util/e;)Z
if ( v5 != null) { // if-eqz v5, :cond_1
this.i = v0;
/* move v0, v6 */
} // :goto_1
} // :cond_1
/* add-int/lit8 v0, v4, -0x1 */
/* move v4, v0 */
} // :cond_2
(( com.doodlemobile.basket.util.e ) p1 ).a ( v2, v3 ); // invoke-virtual {p1, v2, v3}, Lcom/doodlemobile/basket/util/e;->a(FF)V
} // :cond_3
/* if-eq v1, v6, :cond_4 */
int v0 = 3; // const/4 v0, 0x3
/* if-ne v1, v0, :cond_5 */
} // :cond_4
/* move v0, v6 */
} // :goto_2
v1 = this.i;
/* if-nez v1, :cond_6 */
v0 = /* invoke-super {p0, p1}, Lcom/doodlemobile/basket/game2d/h;->a(Lcom/doodlemobile/basket/util/e;)Z */
} // :cond_5
int v0 = 0; // const/4 v0, 0x0
} // :cond_6
if ( v0 != null) { // if-eqz v0, :cond_7
this.i = v7;
} // :cond_7
v0 = (( com.doodlemobile.basket.game2d.a ) v1 ).b ( p1 ); // invoke-virtual {v1, p1}, Lcom/doodlemobile/basket/game2d/a;->b(Lcom/doodlemobile/basket/util/e;)Z
} // .end method
public final void b ( ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* move v1, v0 */
} // :goto_0
v0 = this.h;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* if-ge v1, v0, :cond_0 */
v0 = this.h;
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/doodlemobile/basket/game2d/a; */
(( com.doodlemobile.basket.game2d.a ) v0 ).h ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/game2d/a;->h()V
/* add-int/lit8 v0, v1, 0x1 */
/* move v1, v0 */
} // :cond_0
return;
} // .end method
public final void b ( Object p0 ) {
/* .locals 2 */
(( com.doodlemobile.basket.game2d.a ) p1 ).g ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/game2d/a;->g()Lcom/doodlemobile/basket/game2d/h;
/* if-eq v0, p0, :cond_0 */
/* new-instance v0, Ljava/lang/RuntimeException; */
final String v1 = "Removing sprite that does not belong to this layer!"; // const-string v1, "Removing sprite that does not belong to this layer!"
/* invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_0
(( com.doodlemobile.basket.game2d.a ) p1 ).e ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/game2d/a;->e()V
return;
} // .end method
public final void b ( Object p0 ) {
/* .locals 6 */
int v4 = 0; // const/4 v4, 0x0
v0 = this.b;
/* if-nez v0, :cond_1 */
v0 = this.h;
v1 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* move v2, v4 */
} // :goto_0
/* if-ge v2, v1, :cond_3 */
v0 = this.h;
(( java.util.ArrayList ) v0 ).get ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/doodlemobile/basket/game2d/a; */
/* iget-boolean v3, v0, Lcom/doodlemobile/basket/game2d/a;->h:Z */
/* if-nez v3, :cond_0 */
v3 = (( com.doodlemobile.basket.game2d.a ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/game2d/a;->b()Z
if ( v3 != null) { // if-eqz v3, :cond_0
(( com.doodlemobile.basket.game2d.a ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lcom/doodlemobile/basket/game2d/a;->a(Lcom/doodlemobile/basket/p;)V
} // :cond_0
/* add-int/lit8 v0, v2, 0x1 */
/* move v2, v0 */
} // :cond_1
/* iget v1, p0, Lcom/doodlemobile/basket/game2d/c;->c:F */
/* iget v2, p0, Lcom/doodlemobile/basket/game2d/c;->e:F */
v1 = (( com.doodlemobile.basket.game2d.g ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/doodlemobile/basket/game2d/g;->a(FF)F
/* iget v2, p0, Lcom/doodlemobile/basket/game2d/c;->d:F */
/* iget v3, p0, Lcom/doodlemobile/basket/game2d/c;->f:F */
v2 = (( com.doodlemobile.basket.game2d.g ) v0 ).b ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Lcom/doodlemobile/basket/game2d/g;->b(FF)F
v0 = this.h;
v3 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
} // :goto_1
/* if-ge v4, v3, :cond_3 */
v0 = this.h;
(( java.util.ArrayList ) v0 ).get ( v4 ); // invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/doodlemobile/basket/game2d/a; */
/* iget-boolean v5, v0, Lcom/doodlemobile/basket/game2d/a;->h:Z */
/* if-nez v5, :cond_2 */
v5 = (( com.doodlemobile.basket.game2d.a ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/game2d/a;->b()Z
if ( v5 != null) { // if-eqz v5, :cond_2
(( com.doodlemobile.basket.game2d.a ) v0 ).a ( p1, v1, v2 ); // invoke-virtual {v0, p1, v1, v2}, Lcom/doodlemobile/basket/game2d/a;->a(Lcom/doodlemobile/basket/p;FF)V
} // :cond_2
/* add-int/lit8 v0, v4, 0x1 */
/* move v4, v0 */
} // :cond_3
return;
} // .end method
