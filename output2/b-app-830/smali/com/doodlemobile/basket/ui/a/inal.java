public class inal extends com.doodlemobile.basket.ui.a.m {
	 /* # static fields */
	 private static java.util.Random k;
	 /* # instance fields */
	 private com.doodlemobile.basket.ui.e b;
	 private Integer c;
	 private Float d;
	 private Float e;
	 private Float f;
	 private Float g;
	 private Float h;
	 private Float i;
	 private Float j;
	 /* # direct methods */
	 static inal ( ) {
		 /* .locals 1 */
		 /* new-instance v0, Ljava/util/Random; */
		 /* invoke-direct {v0}, Ljava/util/Random;-><init>()V */
		 return;
	 } // .end method
	 public inal ( ) {
		 /* .locals 4 */
		 /* const/high16 v3, 0x41a00000 # 20.0f */
		 int v2 = 0; // const/4 v2, 0x0
		 /* invoke-direct {p0, p1}, Lcom/doodlemobile/basket/ui/a/m;-><init>(Landroid/util/AttributeSet;)V */
		 final String v0 = "viewid"; // const-string v0, "viewid"
		 v0 = 		 int v1 = -1; // const/4 v1, -0x1
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/a/g;->c:I */
		 final String v0 = "k"; // const-string v0, "k"
		 v0 = 		 int v1 = 0; // const/4 v1, 0x0
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/a/g;->h:F */
		 v0 = 		 final String v0 = "str"; // const-string v0, "str"
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/a/g;->f:F */
		 v0 = 		 final String v0 = "endstr"; // const-string v0, "endstr"
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/a/g;->g:F */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( ) {
		 /* .locals 3 */
		 int v2 = 0; // const/4 v2, 0x0
		 v0 = this.b;
		 (( com.doodlemobile.basket.ui.e ) v0 ).s ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/e;->s()Lcom/doodlemobile/basket/ui/b;
		 /* iget v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/a/g;->d:F */
		 /* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/a/g;->e:F */
		 /* iput v2, p0, Lcom/doodlemobile/basket/ui/a/g;->i:F */
		 /* iput v2, p0, Lcom/doodlemobile/basket/ui/a/g;->j:F */
		 return;
	 } // .end method
	 public final void a ( Long p0 ) {
		 /* .locals 8 */
		 /* const/high16 v7, 0x40000000 # 2.0f */
		 /* const/high16 v6, 0x3f800000 # 1.0f */
		 /* iget-wide v0, p0, Lcom/doodlemobile/basket/ui/a/g;->a:J */
		 /* const-wide/16 v2, 0x0 */
		 /* cmp-long v0, v0, v2 */
		 /* if-nez v0, :cond_0 */
	 } // :goto_0
	 return;
} // :cond_0
v0 = this.b;
(( com.doodlemobile.basket.ui.e ) v0 ).s ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/e;->s()Lcom/doodlemobile/basket/ui/b;
/* iget v1, p0, Lcom/doodlemobile/basket/ui/a/g;->g:F */
/* iget v2, p0, Lcom/doodlemobile/basket/ui/a/g;->f:F */
/* div-float/2addr v1, v2 */
/* float-to-double v1, v1 */
/* long-to-float v3, p1 */
/* iget-wide v4, p0, Lcom/doodlemobile/basket/ui/a/g;->a:J */
/* long-to-float v4, v4 */
/* div-float/2addr v3, v4 */
/* float-to-double v3, v3 */
java.lang.Math .pow ( v1,v2,v3,v4 );
/* move-result-wide v1 */
/* double-to-float v1, v1 */
/* iget v2, p0, Lcom/doodlemobile/basket/ui/a/g;->f:F */
/* mul-float/2addr v1, v2 */
v2 = com.doodlemobile.basket.ui.a.g.k;
v2 = (( java.util.Random ) v2 ).nextFloat ( ); // invoke-virtual {v2}, Ljava/util/Random;->nextFloat()F
/* mul-float/2addr v2, v7 */
/* sub-float/2addr v2, v6 */
/* mul-float/2addr v2, v1 */
v3 = com.doodlemobile.basket.ui.a.g.k;
v3 = (( java.util.Random ) v3 ).nextFloat ( ); // invoke-virtual {v3}, Ljava/util/Random;->nextFloat()F
/* mul-float/2addr v3, v7 */
/* sub-float/2addr v3, v6 */
/* mul-float/2addr v1, v3 */
/* iget v3, p0, Lcom/doodlemobile/basket/ui/a/g;->h:F */
/* mul-float/2addr v2, v3 */
/* iget v3, p0, Lcom/doodlemobile/basket/ui/a/g;->i:F */
/* iget v4, p0, Lcom/doodlemobile/basket/ui/a/g;->h:F */
/* sub-float v4, v6, v4 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
/* iput v2, p0, Lcom/doodlemobile/basket/ui/a/g;->i:F */
/* iget v2, p0, Lcom/doodlemobile/basket/ui/a/g;->h:F */
/* mul-float/2addr v1, v2 */
/* iget v2, p0, Lcom/doodlemobile/basket/ui/a/g;->j:F */
/* iget v3, p0, Lcom/doodlemobile/basket/ui/a/g;->h:F */
/* sub-float v3, v6, v3 */
/* mul-float/2addr v2, v3 */
/* add-float/2addr v1, v2 */
/* iput v1, p0, Lcom/doodlemobile/basket/ui/a/g;->j:F */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/a/g;->i:F */
/* iget v2, p0, Lcom/doodlemobile/basket/ui/a/g;->d:F */
/* add-float/2addr v1, v2 */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/a/g;->j:F */
/* iget v2, p0, Lcom/doodlemobile/basket/ui/a/g;->e:F */
/* add-float/2addr v1, v2 */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
v0 = this.b;
(( com.doodlemobile.basket.ui.e ) v0 ).q ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/e;->q()V
} // .end method
public final void a ( Object p0 ) {
/* .locals 2 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/a/g;->c:I */
int v1 = -1; // const/4 v1, -0x1
/* if-eq v0, v1, :cond_0 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/a/g;->c:I */
(( com.doodlemobile.basket.ui.e ) p1 ).b ( v0 ); // invoke-virtual {p1, v0}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
this.b = v0;
} // :goto_0
v0 = this.b;
/* if-nez v0, :cond_1 */
/* new-instance v0, Ljava/lang/RuntimeException; */
final String v1 = ""; // const-string v1, ""
/* invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
this.b = v0;
} // :cond_1
return;
} // .end method
public final void b ( ) {
/* .locals 2 */
v0 = this.b;
(( com.doodlemobile.basket.ui.e ) v0 ).s ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/e;->s()Lcom/doodlemobile/basket/ui/b;
/* iget v1, p0, Lcom/doodlemobile/basket/ui/a/g;->d:F */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/a/g;->e:F */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
v0 = this.b;
(( com.doodlemobile.basket.ui.e ) v0 ).q ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/e;->q()V
return;
} // .end method
