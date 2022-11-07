public class inal implements com.doodlemobile.basket.graphics.i {
	 /* # interfaces */
	 /* # instance fields */
	 private Integer a;
	 private Integer b;
	 private Long c;
	 private Integer d;
	 private Integer e;
	 private com.doodlemobile.basket.graphics.DTileAnimation f; //synthetic
	 /* # direct methods */
	 protected inal ( ) {
		 /* .locals 3 */
		 int v2 = -1; // const/4 v2, -0x1
		 this.f = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput v2, p0, Lcom/doodlemobile/basket/graphics/g;->a:I */
		 /* const-wide/16 v0, 0x0 */
		 /* iput-wide v0, p0, Lcom/doodlemobile/basket/graphics/g;->c:J */
		 /* const/16 v0, 0x3e8 */
		 /* iput v0, p0, Lcom/doodlemobile/basket/graphics/g;->d:I */
		 /* iput v2, p0, Lcom/doodlemobile/basket/graphics/g;->e:I */
		 return;
	 } // .end method
	 private void b ( Integer p0 ) {
		 /* .locals 2 */
		 /* iput p1, p0, Lcom/doodlemobile/basket/graphics/g;->a:I */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/doodlemobile/basket/graphics/g;->b:I */
		 /* const-wide/16 v0, 0x0 */
		 /* iput-wide v0, p0, Lcom/doodlemobile/basket/graphics/g;->c:J */
		 /* iget v0, p0, Lcom/doodlemobile/basket/graphics/g;->a:I */
		 /* if-ltz v0, :cond_0 */
		 v0 = this.f;
		 v0 = this.i;
		 /* iget v1, p0, Lcom/doodlemobile/basket/graphics/g;->a:I */
		 /* aget-object v0, v0, v1 */
		 /* array-length v0, v0 */
		 /* iget v1, p0, Lcom/doodlemobile/basket/graphics/g;->b:I */
		 /* if-le v0, v1, :cond_0 */
		 v0 = this.f;
		 v0 = this.i;
		 /* iget v1, p0, Lcom/doodlemobile/basket/graphics/g;->a:I */
		 /* aget-object v0, v0, v1 */
		 /* iget v1, p0, Lcom/doodlemobile/basket/graphics/g;->b:I */
		 /* aget v0, v0, v1 */
		 /* iput v0, p0, Lcom/doodlemobile/basket/graphics/g;->e:I */
	 } // :goto_0
	 return;
} // :cond_0
int v0 = -1; // const/4 v0, -0x1
/* iput v0, p0, Lcom/doodlemobile/basket/graphics/g;->e:I */
} // .end method
/* # virtual methods */
public final Integer a ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/graphics/g;->e:I */
} // .end method
public final void a ( Integer p0 ) {
/* .locals 3 */
int v2 = -1; // const/4 v2, -0x1
/* if-eq p1, v2, :cond_1 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
v1 = this.f;
v1 = this.h;
/* array-length v1, v1 */
/* if-ge v0, v1, :cond_1 */
v1 = this.f;
v1 = this.h;
/* aget v1, v1, v0 */
/* if-ne p1, v1, :cond_0 */
/* invoke-direct {p0, v0}, Lcom/doodlemobile/basket/graphics/g;->b(I)V */
} // :goto_1
return;
} // :cond_0
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
/* invoke-direct {p0, v2}, Lcom/doodlemobile/basket/graphics/g;->b(I)V */
} // .end method
public final void a ( Long p0 ) {
/* .locals 7 */
int v6 = -1; // const/4 v6, -0x1
/* iget v0, p0, Lcom/doodlemobile/basket/graphics/g;->a:I */
/* if-ltz v0, :cond_2 */
v0 = this.f;
v0 = this.j;
/* iget v1, p0, Lcom/doodlemobile/basket/graphics/g;->a:I */
/* aget-object v0, v0, v1 */
/* array-length v0, v0 */
/* iget v1, p0, Lcom/doodlemobile/basket/graphics/g;->b:I */
/* if-le v0, v1, :cond_2 */
v0 = this.f;
v0 = this.j;
/* iget v1, p0, Lcom/doodlemobile/basket/graphics/g;->a:I */
/* aget-object v0, v0, v1 */
/* iget v1, p0, Lcom/doodlemobile/basket/graphics/g;->b:I */
/* aget v0, v0, v1 */
/* if-lez v0, :cond_2 */
/* iget-wide v0, p0, Lcom/doodlemobile/basket/graphics/g;->c:J */
/* iget v2, p0, Lcom/doodlemobile/basket/graphics/g;->d:I */
/* int-to-long v2, v2 */
/* mul-long/2addr v2, p1 */
/* const-wide/16 v4, 0x3e8 */
/* div-long/2addr v2, v4 */
/* add-long/2addr v0, v2 */
/* iput-wide v0, p0, Lcom/doodlemobile/basket/graphics/g;->c:J */
} // :cond_0
/* iget v0, p0, Lcom/doodlemobile/basket/graphics/g;->a:I */
/* if-ltz v0, :cond_2 */
/* iget v0, p0, Lcom/doodlemobile/basket/graphics/g;->b:I */
/* if-ltz v0, :cond_2 */
/* iget-wide v0, p0, Lcom/doodlemobile/basket/graphics/g;->c:J */
v2 = this.f;
v2 = this.j;
/* iget v3, p0, Lcom/doodlemobile/basket/graphics/g;->a:I */
/* aget-object v2, v2, v3 */
/* iget v3, p0, Lcom/doodlemobile/basket/graphics/g;->b:I */
/* aget v2, v2, v3 */
/* int-to-long v2, v2 */
/* cmp-long v0, v0, v2 */
/* if-ltz v0, :cond_2 */
v0 = this.f;
v0 = this.j;
/* iget v1, p0, Lcom/doodlemobile/basket/graphics/g;->a:I */
/* aget-object v0, v0, v1 */
/* iget v1, p0, Lcom/doodlemobile/basket/graphics/g;->b:I */
/* aget v0, v0, v1 */
/* if-lez v0, :cond_2 */
/* iget-wide v0, p0, Lcom/doodlemobile/basket/graphics/g;->c:J */
v2 = this.f;
v2 = this.j;
/* iget v3, p0, Lcom/doodlemobile/basket/graphics/g;->a:I */
/* aget-object v2, v2, v3 */
/* iget v3, p0, Lcom/doodlemobile/basket/graphics/g;->b:I */
/* aget v2, v2, v3 */
/* int-to-long v2, v2 */
/* sub-long/2addr v0, v2 */
/* iput-wide v0, p0, Lcom/doodlemobile/basket/graphics/g;->c:J */
/* iget v0, p0, Lcom/doodlemobile/basket/graphics/g;->b:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lcom/doodlemobile/basket/graphics/g;->b:I */
/* iget v0, p0, Lcom/doodlemobile/basket/graphics/g;->b:I */
v1 = this.f;
v1 = this.i;
/* iget v2, p0, Lcom/doodlemobile/basket/graphics/g;->a:I */
/* aget-object v1, v1, v2 */
/* array-length v1, v1 */
/* if-lt v0, v1, :cond_1 */
v0 = this.f;
v0 = this.k;
/* iget v1, p0, Lcom/doodlemobile/basket/graphics/g;->a:I */
/* aget v0, v0, v1 */
/* invoke-direct {p0, v0}, Lcom/doodlemobile/basket/graphics/g;->b(I)V */
} // :cond_1
/* sget-boolean v0, Lcom/doodlemobile/basket/graphics/DTileAnimation;->g:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_2
/* iget v0, p0, Lcom/doodlemobile/basket/graphics/g;->a:I */
/* if-ltz v0, :cond_4 */
v0 = this.f;
v0 = this.i;
/* iget v1, p0, Lcom/doodlemobile/basket/graphics/g;->a:I */
/* aget-object v0, v0, v1 */
/* array-length v0, v0 */
/* iget v1, p0, Lcom/doodlemobile/basket/graphics/g;->b:I */
/* if-le v0, v1, :cond_4 */
v0 = this.f;
v0 = this.i;
/* iget v1, p0, Lcom/doodlemobile/basket/graphics/g;->a:I */
/* aget-object v0, v0, v1 */
/* iget v1, p0, Lcom/doodlemobile/basket/graphics/g;->b:I */
/* aget v0, v0, v1 */
/* iput v0, p0, Lcom/doodlemobile/basket/graphics/g;->e:I */
} // :goto_0
/* iget v0, p0, Lcom/doodlemobile/basket/graphics/g;->e:I */
v1 = this.f;
/* iget v1, v1, Lcom/doodlemobile/basket/graphics/DTileAnimation;->d:I */
v2 = this.f;
/* iget v2, v2, Lcom/doodlemobile/basket/graphics/DTileAnimation;->e:I */
/* mul-int/2addr v1, v2 */
/* if-le v0, v1, :cond_3 */
/* iput v6, p0, Lcom/doodlemobile/basket/graphics/g;->e:I */
} // :cond_3
return;
} // :cond_4
/* iput v6, p0, Lcom/doodlemobile/basket/graphics/g;->e:I */
} // .end method
public final Integer b ( ) {
/* .locals 2 */
int v1 = -1; // const/4 v1, -0x1
/* iget v0, p0, Lcom/doodlemobile/basket/graphics/g;->a:I */
/* if-ne v0, v1, :cond_0 */
/* move v0, v1 */
} // :goto_0
} // :cond_0
v0 = this.f;
v0 = this.h;
/* iget v1, p0, Lcom/doodlemobile/basket/graphics/g;->a:I */
/* aget v0, v0, v1 */
} // .end method
/* if-eq v3, v4, :cond_0 */
int v4 = 2; // const/4 v4, 0x2
/* if-ne v3, v4, :cond_2 */
final String v4 = "Module"; // const-string v4, "Module"
v3 = (( java.lang.String ) v4 ).equals ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_4
int v3 = 0; // const/4 v3, 0x0
final String v4 = "h"; // const-string v4, "h"
v3 = int v5 = 0; // const/4 v5, 0x0
int v4 = 0; // const/4 v4, 0x0
final String v5 = "w"; // const-string v5, "w"
v4 = int v6 = 0; // const/4 v6, 0x0
int v5 = 0; // const/4 v5, 0x0
final String v6 = "x"; // const-string v6, "x"
v5 = int v7 = 0; // const/4 v7, 0x0
int v6 = 0; // const/4 v6, 0x0
final String v7 = "y"; // const-string v7, "y"
v6 = int v8 = 0; // const/4 v8, 0x0
int v7 = 0; // const/4 v7, 0x0
final String v8 = "ml"; // const-string v8, "ml"
v7 = int v9 = 0; // const/4 v9, 0x0
int v8 = 0; // const/4 v8, 0x0
final String v9 = "mr"; // const-string v9, "mr"
v8 = int v10 = 0; // const/4 v10, 0x0
int v9 = 0; // const/4 v9, 0x0
final String v10 = "mt"; // const-string v10, "mt"
v9 = int v11 = 0; // const/4 v11, 0x0
int v10 = 0; // const/4 v10, 0x0
final String v11 = "mb"; // const-string v11, "mb"
v10 = int v12 = 0; // const/4 v12, 0x0
v11 = this.b;
/* add-int/lit8 v12, v2, 0x1 */
/* aput v5, v11, v2 */
v2 = this.b;
/* add-int/lit8 v5, v12, 0x1 */
/* aput v6, v2, v12 */
v2 = this.b;
/* add-int/lit8 v6, v5, 0x1 */
/* aput v4, v2, v5 */
v2 = this.b;
/* add-int/lit8 v4, v6, 0x1 */
/* aput v3, v2, v6 */
v2 = this.b;
/* add-int/lit8 v3, v4, 0x1 */
/* aput v7, v2, v4 */
v2 = this.b;
/* add-int/lit8 v4, v3, 0x1 */
/* aput v8, v2, v3 */
v2 = this.b;
/* add-int/lit8 v3, v4, 0x1 */
/* aput v9, v2, v4 */
v2 = this.b;
/* add-int/lit8 v4, v3, 0x1 */
/* aput v10, v2, v3 */
/* move v2, v4 */
/* goto/16 :goto_1 */
} // :cond_4
com.doodlemobile.basket.graphics.d .a ( p1 );
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 ..:try_end_0} :catch_1 */
/* goto/16 :goto_1 */
/* :catch_0 */
/* move-exception v0 */
/* new-instance v1, Landroid/view/InflateException; */
/* invoke-direct {v1, v0}, Landroid/view/InflateException;-><init>(Ljava/lang/Throwable;)V */
/* throw v1 */
} // :cond_5
try { // :try_start_1
com.doodlemobile.basket.graphics.d .a ( p1 );
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 ..:try_end_1} :catch_1 */
/* goto/16 :goto_0 */
/* :catch_1 */
/* move-exception v0 */
/* new-instance v1, Landroid/view/InflateException; */
/* invoke-direct {v1, v0}, Landroid/view/InflateException;-><init>(Ljava/lang/Throwable;)V */
/* throw v1 */
} // :cond_6
return;
} // .end method
/* # virtual methods */
public final Float a ( java.lang.CharSequence p0 ) {
/* .locals 8 */
v1 = int v0 = 0; // const/4 v0, 0x0
int v2 = 0; // const/4 v2, 0x0
/* move v7, v2 */
/* move v2, v0 */
/* move v0, v7 */
} // :goto_0
/* if-ge v0, v1, :cond_1 */
v4 = v3 = this.a;
v3 = (( java.lang.String ) v3 ).indexOf ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->indexOf(I)I
/* if-ltz v3, :cond_0 */
v4 = this.b;
/* mul-int/lit8 v5, v3, 0x8 */
/* add-int/lit8 v5, v5, 0x2 */
/* aget v4, v4, v5 */
v5 = this.b;
/* mul-int/lit8 v6, v3, 0x8 */
/* add-int/lit8 v6, v6, 0x4 */
/* aget v5, v5, v6 */
v6 = this.b;
/* mul-int/lit8 v3, v3, 0x8 */
/* add-int/lit8 v3, v3, 0x5 */
/* aget v3, v6, v3 */
/* int-to-float v4, v4 */
/* add-float/2addr v2, v4 */
/* int-to-float v4, v5 */
/* add-float/2addr v2, v4 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
} // :cond_0
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
/* iget v0, p0, Lcom/doodlemobile/basket/graphics/d;->d:F */
/* mul-float/2addr v0, v2 */
} // .end method
public final Float a ( java.lang.CharSequence p0, Float p1, Float p2 ) {
/* .locals 10 */
v0 = int v9 = 0; // const/4 v9, 0x0
int v1 = 0; // const/4 v1, 0x0
/* move v2, v9 */
/* move v3, v9 */
} // :goto_0
v4 = /* if-ge v1, v0, :cond_3 */
v5 = this.a;
v5 = (( java.lang.String ) v5 ).indexOf ( v4 ); // invoke-virtual {v5, v4}, Ljava/lang/String;->indexOf(I)I
/* if-gez v5, :cond_1 */
/* const/16 v5, 0xa */
/* if-ne v4, v5, :cond_0 */
/* add-float/2addr v2, p3 */
/* move v3, v9 */
} // :cond_0
} // :goto_1
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
/* mul-int/lit8 v4, v5, 0x8 */
v5 = this.b;
/* add-int/lit8 v6, v4, 0x2 */
/* aget v5, v5, v6 */
v6 = this.b;
/* add-int/lit8 v7, v4, 0x4 */
/* aget v6, v6, v7 */
v7 = this.b;
/* add-int/lit8 v4, v4, 0x5 */
/* aget v4, v7, v4 */
/* int-to-float v7, v6 */
/* add-float/2addr v7, v3 */
/* int-to-float v8, v5 */
/* add-float/2addr v7, v8 */
/* int-to-float v8, v4 */
/* add-float/2addr v7, v8 */
/* iget v8, p0, Lcom/doodlemobile/basket/graphics/d;->d:F */
/* mul-float/2addr v7, v8 */
/* cmpl-float v7, v7, p2 */
/* if-lez v7, :cond_2 */
/* add-float/2addr v2, p3 */
/* move v3, v9 */
} // :cond_2
/* int-to-float v6, v6 */
/* add-float/2addr v3, v6 */
/* int-to-float v5, v5 */
/* add-float/2addr v3, v5 */
/* int-to-float v4, v4 */
/* add-float/2addr v3, v4 */
} // :cond_3
if ( v0 != null) { // if-eqz v0, :cond_4
/* add-float v0, v2, p3 */
} // :goto_2
/* iget v1, p0, Lcom/doodlemobile/basket/graphics/d;->d:F */
/* mul-float/2addr v0, v1 */
} // :cond_4
/* move v0, v2 */
} // .end method
public final com.doodlemobile.basket.graphics.a a ( Integer p0 ) {
/* .locals 1 */
/* new-instance v0, Lcom/doodlemobile/basket/graphics/a; */
/* invoke-direct {v0, p0, p1}, Lcom/doodlemobile/basket/graphics/a;-><init>(Lcom/doodlemobile/basket/graphics/d;I)V */
} // .end method
public final void a ( ) {
/* .locals 1 */
v0 = this.c;
(( com.doodlemobile.basket.graphics.e ) v0 ).n ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/graphics/e;->n()V
return;
} // .end method
public final void a ( Object p0 ) {
/* .locals 1 */
v0 = this.c;
(( com.doodlemobile.basket.graphics.e ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lcom/doodlemobile/basket/graphics/e;->a(Lcom/doodlemobile/basket/opengl/m;)V
return;
} // .end method
public final Float b ( java.lang.CharSequence p0 ) {
/* .locals 8 */
v1 = int v0 = 0; // const/4 v0, 0x0
int v2 = 0; // const/4 v2, 0x0
/* move v7, v2 */
/* move v2, v0 */
/* move v0, v7 */
} // :goto_0
/* if-ge v0, v1, :cond_1 */
v4 = v3 = this.a;
v3 = (( java.lang.String ) v3 ).indexOf ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->indexOf(I)I
/* if-ltz v3, :cond_0 */
v4 = this.b;
/* mul-int/lit8 v5, v3, 0x8 */
/* add-int/lit8 v5, v5, 0x3 */
/* aget v4, v4, v5 */
v5 = this.b;
/* mul-int/lit8 v6, v3, 0x8 */
/* add-int/lit8 v6, v6, 0x6 */
/* aget v5, v5, v6 */
/* add-int/2addr v4, v5 */
v5 = this.b;
/* mul-int/lit8 v3, v3, 0x8 */
/* add-int/lit8 v3, v3, 0x7 */
/* aget v3, v5, v3 */
/* add-int/2addr v3, v4 */
/* int-to-float v3, v3 */
v2 = java.lang.Math .max ( v2,v3 );
} // :cond_0
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
/* iget v0, p0, Lcom/doodlemobile/basket/graphics/d;->d:F */
/* mul-float/2addr v0, v2 */
} // .end method
