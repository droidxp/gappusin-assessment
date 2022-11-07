public class net.chobin.android.psdxylz.app.as extends net.chobin.android.psdxylz.app.q {
	 /* # instance fields */
	 public Float c;
	 public Float d;
	 public Float e;
	 /* # direct methods */
	 public net.chobin.android.psdxylz.app.as ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2, p6}, Lnet/chobin/android/psdxylz/app/q;-><init>(Lnet/chobin/android/psdxylz/app/f;II)V */
		 /* iput p3, p0, Lnet/chobin/android/psdxylz/app/as;->c:F */
		 /* iput p4, p0, Lnet/chobin/android/psdxylz/app/as;->d:F */
		 /* iput p5, p0, Lnet/chobin/android/psdxylz/app/as;->e:F */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( Float p0, Float p1 ) {
		 /* .locals 0 */
		 /* iput p1, p0, Lnet/chobin/android/psdxylz/app/as;->c:F */
		 /* iput p2, p0, Lnet/chobin/android/psdxylz/app/as;->d:F */
		 return;
	 } // .end method
	 public Boolean a ( android.graphics.PointF[] p0, Boolean[] p1 ) {
		 /* .locals 11 */
		 int v9 = 0; // const/4 v9, 0x0
		 int v10 = -1; // const/4 v10, -0x1
		 /* move v8, v9 */
	 } // :goto_0
	 /* array-length v0, p1 */
	 /* if-lt v8, v0, :cond_1 */
	 /* iput v10, p0, Lnet/chobin/android/psdxylz/app/as;->b:I */
} // :cond_0
} // :goto_1
} // :cond_1
/* aget-boolean v0, p2, v8 */
if ( v0 != null) { // if-eqz v0, :cond_3
/* iget v0, p0, Lnet/chobin/android/psdxylz/app/as;->c:F */
/* float-to-long v0, v0 */
/* iget v2, p0, Lnet/chobin/android/psdxylz/app/as;->d:F */
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
/* iget v1, p0, Lnet/chobin/android/psdxylz/app/as;->e:F */
/* iget v2, p0, Lnet/chobin/android/psdxylz/app/as;->e:F */
/* mul-float/2addr v1, v2 */
/* cmpg-float v0, v0, v1 */
/* if-gtz v0, :cond_2 */
/* aget-object v0, p1, v8 */
/* iget v0, v0, Landroid/graphics/PointF;->x:F */
/* iput v0, p0, Lnet/chobin/android/psdxylz/app/as;->a:F */
/* aget-object v0, p1, v8 */
/* iget v0, v0, Landroid/graphics/PointF;->y:F */
/* iput v0, p0, Lnet/chobin/android/psdxylz/app/as;->b:F */
/* iget v0, p0, Lnet/chobin/android/psdxylz/app/as;->b:I */
/* if-ne v0, v10, :cond_0 */
/* iput v8, p0, Lnet/chobin/android/psdxylz/app/as;->b:I */
int v9 = 1; // const/4 v9, 0x1
} // :cond_2
/* iput v10, p0, Lnet/chobin/android/psdxylz/app/as;->c:I */
} // :cond_3
/* add-int/lit8 v0, v8, 0x1 */
/* move v8, v0 */
} // .end method
