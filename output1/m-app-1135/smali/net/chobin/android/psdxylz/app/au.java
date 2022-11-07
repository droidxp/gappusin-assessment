public class net.chobin.android.psdxylz.app.au extends net.chobin.android.psdxylz.app.q {
	 /* # instance fields */
	 public Float c;
	 public Float d;
	 public Integer d;
	 public Float e;
	 public Float f;
	 public Float g;
	 public Float h;
	 public Float i;
	 /* # direct methods */
	 public net.chobin.android.psdxylz.app.au ( ) {
		 /* .locals 2 */
		 int v1 = -1; // const/4 v1, -0x1
		 /* invoke-direct {p0, p1, p2, p8}, Lnet/chobin/android/psdxylz/app/q;-><init>(Lnet/chobin/android/psdxylz/app/f;II)V */
		 /* iput p3, p0, Lnet/chobin/android/psdxylz/app/au;->c:F */
		 /* iput p4, p0, Lnet/chobin/android/psdxylz/app/au;->d:F */
		 /* iput p5, p0, Lnet/chobin/android/psdxylz/app/au;->e:F */
		 /* iget v0, p0, Lnet/chobin/android/psdxylz/app/au;->c:F */
		 /* iput v0, p0, Lnet/chobin/android/psdxylz/app/au;->f:F */
		 /* iget v0, p0, Lnet/chobin/android/psdxylz/app/au;->d:F */
		 /* iput v0, p0, Lnet/chobin/android/psdxylz/app/au;->g:F */
		 /* iput p6, p0, Lnet/chobin/android/psdxylz/app/au;->h:F */
		 /* iput p7, p0, Lnet/chobin/android/psdxylz/app/au;->i:F */
		 /* iput v1, p0, Lnet/chobin/android/psdxylz/app/au;->b:I */
		 /* iput v1, p0, Lnet/chobin/android/psdxylz/app/au;->d:I */
		 return;
	 } // .end method
	 private void a ( Integer p0, Integer p1 ) {
		 /* .locals 5 */
		 /* const/high16 v4, 0x447a0000 # 1000.0f */
		 /* iget v0, p0, Lnet/chobin/android/psdxylz/app/au;->c:F */
		 /* float-to-int v0, v0 */
		 /* iget v1, p0, Lnet/chobin/android/psdxylz/app/au;->d:F */
		 /* float-to-int v1, v1 */
		 /* const/16 v2, 0x500 */
		 v0 = 		 net.chobin.android.psdxylz.app.s .b ( v0,v1,p1,p2,v2 );
		 /* iget v1, p0, Lnet/chobin/android/psdxylz/app/au;->c:F */
		 /* iget v2, p0, Lnet/chobin/android/psdxylz/app/au;->h:F */
		 v3 = net.chobin.android.psdxylz.app.s.b;
		 /* aget v3, v3, v0 */
		 /* int-to-float v3, v3 */
		 /* mul-float/2addr v2, v3 */
		 /* div-float/2addr v2, v4 */
		 /* add-float/2addr v1, v2 */
		 /* iput v1, p0, Lnet/chobin/android/psdxylz/app/au;->f:F */
		 /* iget v1, p0, Lnet/chobin/android/psdxylz/app/au;->d:F */
		 /* iget v2, p0, Lnet/chobin/android/psdxylz/app/au;->h:F */
		 v3 = net.chobin.android.psdxylz.app.s.a;
		 /* aget v0, v3, v0 */
		 /* int-to-float v0, v0 */
		 /* mul-float/2addr v0, v2 */
		 /* div-float/2addr v0, v4 */
		 /* add-float/2addr v0, v1 */
		 /* iput v0, p0, Lnet/chobin/android/psdxylz/app/au;->g:F */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer a ( ) {
		 /* .locals 5 */
		 int v0 = -1; // const/4 v0, -0x1
		 /* iget v1, p0, Lnet/chobin/android/psdxylz/app/au;->b:I */
		 /* if-eq v1, v0, :cond_0 */
		 /* iget v0, p0, Lnet/chobin/android/psdxylz/app/au;->c:F */
		 /* float-to-int v0, v0 */
		 /* iget v1, p0, Lnet/chobin/android/psdxylz/app/au;->d:F */
		 /* float-to-int v1, v1 */
		 /* iget v2, p0, Lnet/chobin/android/psdxylz/app/au;->f:F */
		 /* float-to-int v2, v2 */
		 /* iget v3, p0, Lnet/chobin/android/psdxylz/app/au;->g:F */
		 /* float-to-int v3, v3 */
		 /* const/16 v4, 0x500 */
		 v0 = 		 net.chobin.android.psdxylz.app.s .b ( v0,v1,v2,v3,v4 );
	 } // :cond_0
} // .end method
public Boolean a ( android.graphics.PointF[] p0, Boolean[] p1 ) {
	 /* .locals 12 */
	 int v10 = 1; // const/4 v10, 0x1
	 int v11 = -1; // const/4 v11, -0x1
	 int v9 = 0; // const/4 v9, 0x0
	 /* iget v0, p0, Lnet/chobin/android/psdxylz/app/au;->b:I */
	 /* if-ne v0, v11, :cond_2 */
	 /* move v8, v9 */
} // :goto_0
/* array-length v0, p1 */
/* if-lt v8, v0, :cond_0 */
} // :goto_1
/* iput v11, p0, Lnet/chobin/android/psdxylz/app/au;->b:I */
} // :goto_2
} // :cond_0
/* aget-boolean v0, p2, v8 */
if ( v0 != null) { // if-eqz v0, :cond_1
/* iget v0, p0, Lnet/chobin/android/psdxylz/app/au;->c:F */
/* float-to-long v0, v0 */
/* iget v2, p0, Lnet/chobin/android/psdxylz/app/au;->d:F */
/* float-to-long v2, v2 */
/* aget-object v4, p1, v8 */
/* iget v4, v4, Landroid/graphics/PointF;->x:F */
/* float-to-long v4, v4 */
/* aget-object v6, p1, v8 */
/* iget v6, v6, Landroid/graphics/PointF;->y:F */
/* float-to-long v6, v6 */
/* invoke-static/range {v0 ..v7}, Lnet/chobin/android/psdxylz/app/s;->b(JJJJ)J */
/* move-result-wide v0 */
/* long-to-float v0, v0 */
/* iget v1, p0, Lnet/chobin/android/psdxylz/app/au;->h:F */
/* iget v2, p0, Lnet/chobin/android/psdxylz/app/au;->h:F */
/* mul-float/2addr v1, v2 */
/* cmpg-float v0, v0, v1 */
/* if-gtz v0, :cond_1 */
/* iget v0, p0, Lnet/chobin/android/psdxylz/app/au;->c:F */
/* float-to-long v0, v0 */
/* iget v2, p0, Lnet/chobin/android/psdxylz/app/au;->d:F */
/* float-to-long v2, v2 */
/* aget-object v4, p1, v8 */
/* iget v4, v4, Landroid/graphics/PointF;->x:F */
/* float-to-long v4, v4 */
/* aget-object v6, p1, v8 */
/* iget v6, v6, Landroid/graphics/PointF;->y:F */
/* float-to-long v6, v6 */
/* invoke-static/range {v0 ..v7}, Lnet/chobin/android/psdxylz/app/s;->b(JJJJ)J */
/* move-result-wide v0 */
/* long-to-float v0, v0 */
/* iget v1, p0, Lnet/chobin/android/psdxylz/app/au;->i:F */
/* iget v2, p0, Lnet/chobin/android/psdxylz/app/au;->i:F */
/* mul-float/2addr v1, v2 */
/* cmpl-float v0, v0, v1 */
/* if-ltz v0, :cond_1 */
/* aget-object v0, p1, v8 */
/* iget v0, v0, Landroid/graphics/PointF;->x:F */
/* iput v0, p0, Lnet/chobin/android/psdxylz/app/au;->a:F */
/* aget-object v0, p1, v8 */
/* iget v0, v0, Landroid/graphics/PointF;->y:F */
/* iput v0, p0, Lnet/chobin/android/psdxylz/app/au;->b:F */
/* aget-object v0, p1, v8 */
/* iget v0, v0, Landroid/graphics/PointF;->x:F */
/* float-to-int v0, v0 */
/* aget-object v1, p1, v8 */
/* iget v1, v1, Landroid/graphics/PointF;->y:F */
/* float-to-int v1, v1 */
/* invoke-direct {p0, v0, v1}, Lnet/chobin/android/psdxylz/app/au;->a(II)V */
/* iput v8, p0, Lnet/chobin/android/psdxylz/app/au;->b:I */
/* move v9, v10 */
} // :cond_1
/* add-int/lit8 v0, v8, 0x1 */
/* move v8, v0 */
} // :cond_2
/* iget v0, p0, Lnet/chobin/android/psdxylz/app/au;->b:I */
/* aget-boolean v0, p2, v0 */
if ( v0 != null) { // if-eqz v0, :cond_5
/* iget v0, p0, Lnet/chobin/android/psdxylz/app/au;->b:I */
/* aget-object v0, p1, v0 */
/* iget v0, v0, Landroid/graphics/PointF;->x:F */
/* iput v0, p0, Lnet/chobin/android/psdxylz/app/au;->a:F */
/* iget v0, p0, Lnet/chobin/android/psdxylz/app/au;->b:I */
/* aget-object v0, p1, v0 */
/* iget v0, v0, Landroid/graphics/PointF;->y:F */
/* iput v0, p0, Lnet/chobin/android/psdxylz/app/au;->b:F */
/* iget v0, p0, Lnet/chobin/android/psdxylz/app/au;->b:I */
/* aget-object v0, p1, v0 */
/* iget v0, v0, Landroid/graphics/PointF;->x:F */
/* iput v0, p0, Lnet/chobin/android/psdxylz/app/au;->f:F */
/* iget v0, p0, Lnet/chobin/android/psdxylz/app/au;->b:I */
/* aget-object v0, p1, v0 */
/* iget v0, v0, Landroid/graphics/PointF;->y:F */
/* iput v0, p0, Lnet/chobin/android/psdxylz/app/au;->g:F */
/* iget v0, p0, Lnet/chobin/android/psdxylz/app/au;->f:F */
/* float-to-int v0, v0 */
/* iget v1, p0, Lnet/chobin/android/psdxylz/app/au;->g:F */
/* float-to-int v1, v1 */
/* invoke-direct {p0, v0, v1}, Lnet/chobin/android/psdxylz/app/au;->a(II)V */
v0 = (( net.chobin.android.psdxylz.app.au ) p0 ).b ( ); // invoke-virtual {p0}, Lnet/chobin/android/psdxylz/app/au;->b()I
/* iget v1, p0, Lnet/chobin/android/psdxylz/app/au;->d:I */
/* if-eq v0, v1, :cond_3 */
/* move v9, v10 */
} // :cond_3
/* iget v1, p0, Lnet/chobin/android/psdxylz/app/au;->a:I */
/* packed-switch v1, :pswitch_data_0 */
} // :cond_4
} // :goto_3
/* iput v0, p0, Lnet/chobin/android/psdxylz/app/au;->d:I */
/* goto/16 :goto_2 */
/* :pswitch_0 */
if ( v9 != null) { // if-eqz v9, :cond_4
(( net.chobin.android.psdxylz.app.au ) p0 ).a ( ); // invoke-virtual {p0}, Lnet/chobin/android/psdxylz/app/au;->a()V
} // :cond_5
/* iget v0, p0, Lnet/chobin/android/psdxylz/app/au;->c:F */
/* iput v0, p0, Lnet/chobin/android/psdxylz/app/au;->f:F */
/* iget v0, p0, Lnet/chobin/android/psdxylz/app/au;->d:F */
/* iput v0, p0, Lnet/chobin/android/psdxylz/app/au;->g:F */
/* goto/16 :goto_1 */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public Integer b ( ) {
/* .locals 1 */
v0 = (( net.chobin.android.psdxylz.app.au ) p0 ).a ( ); // invoke-virtual {p0}, Lnet/chobin/android/psdxylz/app/au;->a()I
/* if-ltz v0, :cond_0 */
/* add-int/lit8 v0, v0, 0x50 */
/* rem-int/lit16 v0, v0, 0x500 */
/* div-int/lit16 v0, v0, 0xa0 */
} // :cond_0
} // .end method
