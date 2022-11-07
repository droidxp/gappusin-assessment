public class com.a.d.e {
	 /* # instance fields */
	 private Float a;
	 private Float b;
	 private Float c;
	 private Float d;
	 private Integer e;
	 private Integer f;
	 private Integer g;
	 private Integer h;
	 private Integer i;
	 private Integer j;
	 private java.lang.String k;
	 private java.util.Vector l;
	 private android.graphics.Paint m;
	 /* # direct methods */
	 public com.a.d.e ( ) {
		 /* .locals 3 */
		 int v2 = 0; // const/4 v2, 0x0
		 int v1 = 0; // const/4 v1, 0x0
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput v1, p0, Lcom/a/d/e;->a:F */
		 /* iput v1, p0, Lcom/a/d/e;->b:F */
		 /* iput v1, p0, Lcom/a/d/e;->c:F */
		 /* iput v1, p0, Lcom/a/d/e;->d:F */
		 /* iput v0, p0, Lcom/a/d/e;->e:I */
		 /* iput v0, p0, Lcom/a/d/e;->f:I */
		 /* iput v0, p0, Lcom/a/d/e;->g:I */
		 /* iput v0, p0, Lcom/a/d/e;->h:I */
		 /* iput v0, p0, Lcom/a/d/e;->i:I */
		 /* iput v0, p0, Lcom/a/d/e;->j:I */
		 final String v0 = ""; // const-string v0, ""
		 this.k = v0;
		 this.l = v2;
		 this.m = v2;
		 /* new-instance v0, Landroid/graphics/Paint; */
		 /* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
		 this.m = v0;
		 /* new-instance v0, Ljava/util/Vector; */
		 /* invoke-direct {v0}, Ljava/util/Vector;-><init>()V */
		 this.l = v0;
		 this.k = p1;
		 /* iput p2, p0, Lcom/a/d/e;->a:F */
		 /* iput p3, p0, Lcom/a/d/e;->b:F */
		 /* iput p4, p0, Lcom/a/d/e;->c:F */
		 /* iput p5, p0, Lcom/a/d/e;->d:F */
		 /* iput p6, p0, Lcom/a/d/e;->g:I */
		 /* iput p8, p0, Lcom/a/d/e;->j:I */
		 (( com.a.d.e ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/a/d/e;->a()V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 2 */
		 v0 = this.l;
		 (( java.util.Vector ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/Vector;->clear()V
		 v0 = this.m;
		 /* iget v1, p0, Lcom/a/d/e;->j:I */
		 /* int-to-float v1, v1 */
		 (( android.graphics.Paint ) v0 ).setTextSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V
		 v0 = this.m;
		 /* iget v1, p0, Lcom/a/d/e;->g:I */
		 (( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
		 v0 = this.m;
		 int v1 = 1; // const/4 v1, 0x1
		 (( android.graphics.Paint ) v0 ).setAntiAlias ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V
		 (( com.a.d.e ) p0 ).b ( ); // invoke-virtual {p0}, Lcom/a/d/e;->b()V
		 return;
	 } // .end method
	 public void b ( ) {
		 /* .locals 10 */
		 int v3 = 0; // const/4 v3, 0x0
		 v0 = this.m;
		 (( android.graphics.Paint ) v0 ).getFontMetrics ( ); // invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;
		 /* iget v1, v0, Landroid/graphics/Paint$FontMetrics;->descent:F */
		 /* iget v0, v0, Landroid/graphics/Paint$FontMetrics;->top:F */
		 /* sub-float v0, v1, v0 */
		 /* float-to-double v0, v0 */
		 java.lang.Math .ceil ( v0,v1 );
		 /* move-result-wide v0 */
		 /* const-wide/high16 v4, 0x4000000000000000L # 2.0 */
		 /* add-double/2addr v0, v4 */
		 /* double-to-int v0, v0 */
		 /* iput v0, p0, Lcom/a/d/e;->e:I */
		 /* iget v0, p0, Lcom/a/d/e;->d:F */
		 /* iget v1, p0, Lcom/a/d/e;->e:I */
		 /* int-to-float v1, v1 */
		 /* div-float/2addr v0, v1 */
		 /* float-to-int v0, v0 */
		 /* iput v0, p0, Lcom/a/d/e;->f:I */
		 v0 = this.k;
		 v4 = 		 (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
		 /* move v0, v3 */
		 /* move v1, v3 */
		 /* move v2, v3 */
	 } // :goto_0
	 /* if-lt v0, v4, :cond_0 */
	 return;
} // :cond_0
v5 = this.k;
v5 = (( java.lang.String ) v5 ).charAt ( v0 ); // invoke-virtual {v5, v0}, Ljava/lang/String;->charAt(I)C
int v6 = 1; // const/4 v6, 0x1
/* new-array v6, v6, [F */
java.lang.String .valueOf ( v5 );
v8 = this.m;
(( android.graphics.Paint ) v8 ).getTextWidths ( v7, v6 ); // invoke-virtual {v8, v7, v6}, Landroid/graphics/Paint;->getTextWidths(Ljava/lang/String;[F)I
/* const/16 v7, 0xa */
/* if-ne v5, v7, :cond_2 */
/* iget v2, p0, Lcom/a/d/e;->h:I */
/* add-int/lit8 v2, v2, 0x1 */
/* iput v2, p0, Lcom/a/d/e;->h:I */
v2 = this.l;
v5 = this.k;
(( java.lang.String ) v5 ).substring ( v1, v0 ); // invoke-virtual {v5, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
(( java.util.Vector ) v2 ).addElement ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V
/* add-int/lit8 v1, v0, 0x1 */
/* move v2, v3 */
} // :cond_1
} // :goto_1
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_2
/* aget v5, v6, v3 */
/* float-to-double v5, v5 */
java.lang.Math .ceil ( v5,v6 );
/* move-result-wide v5 */
/* double-to-int v5, v5 */
/* add-int/2addr v2, v5 */
/* int-to-float v5, v2 */
/* iget v6, p0, Lcom/a/d/e;->c:F */
/* cmpl-float v5, v5, v6 */
/* if-lez v5, :cond_3 */
/* iget v2, p0, Lcom/a/d/e;->h:I */
/* add-int/lit8 v2, v2, 0x1 */
/* iput v2, p0, Lcom/a/d/e;->h:I */
v2 = this.l;
v5 = this.k;
(( java.lang.String ) v5 ).substring ( v1, v0 ); // invoke-virtual {v5, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
(( java.util.Vector ) v2 ).addElement ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V
/* add-int/lit8 v1, v0, -0x1 */
/* move v2, v3 */
/* move v9, v0 */
/* move v0, v1 */
/* move v1, v9 */
} // :cond_3
/* add-int/lit8 v5, v4, -0x1 */
/* if-ne v0, v5, :cond_1 */
/* iget v5, p0, Lcom/a/d/e;->h:I */
/* add-int/lit8 v5, v5, 0x1 */
/* iput v5, p0, Lcom/a/d/e;->h:I */
v5 = this.l;
v6 = this.k;
(( java.lang.String ) v6 ).substring ( v1, v4 ); // invoke-virtual {v6, v1, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;
(( java.util.Vector ) v5 ).addElement ( v6 ); // invoke-virtual {v5, v6}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V
} // .end method
