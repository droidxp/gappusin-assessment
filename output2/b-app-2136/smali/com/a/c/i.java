public class com.a.c.i {
	 /* # instance fields */
	 com.a.a.a a;
	 public Float b;
	 public Float c;
	 public Integer d;
	 public Integer e;
	 public Integer f;
	 public Integer g;
	 public Integer h;
	 public Boolean i;
	 Boolean j;
	 Integer k;
	 Integer l;
	 Integer m;
	 Integer n;
	 Float o;
	 Float p;
	 /* # direct methods */
	 public com.a.c.i ( ) {
		 /* .locals 3 */
		 int v2 = 0; // const/4 v2, 0x0
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput-boolean v1, p0, Lcom/a/c/i;->j:Z */
		 /* const/16 v0, 0xa */
		 /* iput v0, p0, Lcom/a/c/i;->k:I */
		 /* iput v1, p0, Lcom/a/c/i;->l:I */
		 /* iput v1, p0, Lcom/a/c/i;->m:I */
		 /* iput v1, p0, Lcom/a/c/i;->n:I */
		 /* iput v2, p0, Lcom/a/c/i;->o:F */
		 /* iput v2, p0, Lcom/a/c/i;->p:F */
		 this.a = p1;
		 /* iput p2, p0, Lcom/a/c/i;->b:F */
		 /* iput p3, p0, Lcom/a/c/i;->c:F */
		 /* iget v0, p0, Lcom/a/c/i;->b:F */
		 /* iput v0, p0, Lcom/a/c/i;->o:F */
		 /* iget v0, p0, Lcom/a/c/i;->c:F */
		 /* iput v0, p0, Lcom/a/c/i;->p:F */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput v0, p0, Lcom/a/c/i;->g:I */
		 /* iput v1, p0, Lcom/a/c/i;->h:I */
		 /* iput p4, p0, Lcom/a/c/i;->f:I */
		 /* iput v1, p0, Lcom/a/c/i;->l:I */
		 /* iput-boolean v1, p0, Lcom/a/c/i;->i:Z */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( android.graphics.Canvas p0, android.graphics.Paint p1, Object p2, Float p3, Float p4 ) {
		 /* .locals 8 */
		 int v7 = 1; // const/4 v7, 0x1
		 int v5 = 0; // const/4 v5, 0x0
		 /* const/high16 v4, 0x41f00000 # 30.0f */
		 int v3 = 0; // const/4 v3, 0x0
		 /* const/high16 v6, 0x41200000 # 10.0f */
		 /* iget v0, p0, Lcom/a/c/i;->l:I */
		 /* packed-switch v0, :pswitch_data_0 */
	 } // :cond_0
} // :goto_0
/* iget v0, p0, Lcom/a/c/i;->b:F */
/* iget v1, p0, Lcom/a/c/i;->d:I */
/* int-to-float v1, v1 */
/* add-float/2addr v0, v1 */
/* add-float/2addr v0, v6 */
/* cmpg-float v0, v0, v3 */
/* if-ltz v0, :cond_1 */
/* iget v0, p0, Lcom/a/c/i;->c:F */
/* iget v1, p0, Lcom/a/c/i;->e:I */
/* int-to-float v1, v1 */
/* add-float/2addr v0, v1 */
/* add-float/2addr v0, v6 */
/* cmpg-float v0, v0, v3 */
/* if-ltz v0, :cond_1 */
/* iget v0, p0, Lcom/a/c/i;->b:F */
/* sub-float/2addr v0, v6 */
/* int-to-float v1, v1 */
/* cmpl-float v0, v0, v1 */
/* if-gtz v0, :cond_1 */
/* iget v0, p0, Lcom/a/c/i;->c:F */
/* sub-float/2addr v0, v6 */
/* int-to-float v1, v1 */
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_2 */
} // :cond_1
/* iput-boolean v7, p0, Lcom/a/c/i;->i:Z */
} // :cond_2
/* iget v0, p0, Lcom/a/c/i;->n:I */
int v1 = 4; // const/4 v1, 0x4
/* if-ge v0, v1, :cond_5 */
/* iget v0, p0, Lcom/a/c/i;->n:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lcom/a/c/i;->n:I */
} // :goto_1
v0 = this.a;
v0 = this.aD;
/* iget v1, p0, Lcom/a/c/i;->n:I */
/* div-int/lit8 v1, v1, 0x2 */
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.a;
v0 = this.aD;
/* iget v1, p0, Lcom/a/c/i;->n:I */
/* div-int/lit8 v1, v1, 0x2 */
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* iget v1, p0, Lcom/a/c/i;->b:F */
/* iget v2, p0, Lcom/a/c/i;->c:F */
/* const/high16 v5, 0x42200000 # 40.0f */
/* move v4, v3 */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
return;
/* :pswitch_0 */
/* iget v0, p0, Lcom/a/c/i;->m:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lcom/a/c/i;->m:I */
/* iget v0, p0, Lcom/a/c/i;->m:I */
/* const/16 v1, 0xa */
/* if-lt v0, v1, :cond_0 */
/* iput v5, p0, Lcom/a/c/i;->m:I */
/* iput v7, p0, Lcom/a/c/i;->l:I */
/* :pswitch_1 */
/* iget v0, p0, Lcom/a/c/i;->b:F */
/* div-int/lit8 v1, v1, 0x2 */
/* int-to-float v1, v1 */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_4 */
/* iget v0, p0, Lcom/a/c/i;->b:F */
/* div-int/lit8 v1, v1, 0x2 */
/* int-to-float v1, v1 */
/* iget v2, p0, Lcom/a/c/i;->o:F */
/* sub-float/2addr v1, v2 */
/* iget v2, p0, Lcom/a/c/i;->p:F */
/* div-float/2addr v2, v4 */
/* div-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lcom/a/c/i;->b:F */
/* iget v0, p0, Lcom/a/c/i;->b:F */
/* div-int/lit8 v1, v1, 0x2 */
/* int-to-float v1, v1 */
/* cmpl-float v0, v0, v1 */
/* if-ltz v0, :cond_3 */
/* div-int/lit8 v0, v0, 0x2 */
/* int-to-float v0, v0 */
/* iput v0, p0, Lcom/a/c/i;->b:F */
} // :cond_3
} // :goto_2
/* iget v0, p0, Lcom/a/c/i;->c:F */
/* sub-float/2addr v0, v4 */
/* iput v0, p0, Lcom/a/c/i;->c:F */
/* goto/16 :goto_0 */
} // :cond_4
/* iget v0, p0, Lcom/a/c/i;->b:F */
/* div-int/lit8 v1, v1, 0x2 */
/* int-to-float v1, v1 */
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_3 */
/* iget v0, p0, Lcom/a/c/i;->b:F */
/* iget v1, p0, Lcom/a/c/i;->o:F */
/* div-int/lit8 v2, v2, 0x2 */
/* int-to-float v2, v2 */
/* sub-float/2addr v1, v2 */
/* iget v2, p0, Lcom/a/c/i;->p:F */
/* div-float/2addr v2, v4 */
/* div-float/2addr v1, v2 */
/* sub-float/2addr v0, v1 */
/* iput v0, p0, Lcom/a/c/i;->b:F */
/* iget v0, p0, Lcom/a/c/i;->b:F */
/* div-int/lit8 v1, v1, 0x2 */
/* int-to-float v1, v1 */
/* cmpg-float v0, v0, v1 */
/* if-gtz v0, :cond_3 */
/* div-int/lit8 v0, v0, 0x2 */
/* int-to-float v0, v0 */
/* iput v0, p0, Lcom/a/c/i;->b:F */
} // :cond_5
/* iput v5, p0, Lcom/a/c/i;->n:I */
/* goto/16 :goto_1 */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
public Boolean a ( Float p0, Float p1, Integer p2, Integer p3 ) {
/* .locals 6 */
int v0 = 0; // const/4 v0, 0x0
/* iget v1, p0, Lcom/a/c/i;->b:F */
/* iget v2, p0, Lcom/a/c/i;->c:F */
/* iget v3, p0, Lcom/a/c/i;->d:I */
/* iget v4, p0, Lcom/a/c/i;->e:I */
/* cmpl-float v5, p1, v1 */
/* if-ltz v5, :cond_1 */
/* int-to-float v3, v3 */
/* add-float/2addr v3, v1 */
/* cmpl-float v3, p1, v3 */
/* if-ltz v3, :cond_1 */
} // :cond_0
} // :goto_0
} // :cond_1
/* cmpg-float v3, p1, v1 */
/* if-gtz v3, :cond_2 */
/* int-to-float v3, p3 */
/* add-float/2addr v3, p1 */
/* cmpg-float v1, v3, v1 */
/* if-lez v1, :cond_0 */
} // :cond_2
/* cmpl-float v1, p2, v2 */
/* if-ltz v1, :cond_3 */
/* int-to-float v1, v4 */
/* add-float/2addr v1, v2 */
/* cmpl-float v1, p2, v1 */
/* if-gez v1, :cond_0 */
} // :cond_3
/* cmpg-float v1, p2, v2 */
/* if-gtz v1, :cond_4 */
/* int-to-float v1, p4 */
/* add-float/2addr v1, p2 */
/* cmpg-float v1, v1, v2 */
/* if-lez v1, :cond_0 */
} // :cond_4
int v0 = 1; // const/4 v0, 0x1
} // .end method
