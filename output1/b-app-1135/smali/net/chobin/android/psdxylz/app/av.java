public class net.chobin.android.psdxylz.app.av extends net.chobin.android.psdxylz.app.q {
	 /* # instance fields */
	 public Float c;
	 public Float d;
	 public Float e;
	 public Float f;
	 /* # direct methods */
	 public net.chobin.android.psdxylz.app.av ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2, p7}, Lnet/chobin/android/psdxylz/app/q;-><init>(Lnet/chobin/android/psdxylz/app/f;II)V */
		 /* iput p3, p0, Lnet/chobin/android/psdxylz/app/av;->c:F */
		 /* iput p4, p0, Lnet/chobin/android/psdxylz/app/av;->d:F */
		 /* iput p5, p0, Lnet/chobin/android/psdxylz/app/av;->e:F */
		 /* iput p6, p0, Lnet/chobin/android/psdxylz/app/av;->f:F */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean a ( android.graphics.PointF[] p0, Boolean[] p1 ) {
		 /* .locals 12 */
		 int v11 = -1; // const/4 v11, -0x1
		 /* const/high16 v2, 0x3f800000 # 1.0f */
		 /* const/high16 v10, 0x3f000000 # 0.5f */
		 int v9 = 0; // const/4 v9, 0x0
		 /* move v8, v9 */
	 } // :goto_0
	 /* array-length v0, p1 */
	 /* if-lt v8, v0, :cond_1 */
	 /* iput v11, p0, Lnet/chobin/android/psdxylz/app/av;->b:I */
} // :cond_0
} // :goto_1
} // :cond_1
/* aget-boolean v0, p2, v8 */
if ( v0 != null) { // if-eqz v0, :cond_2
/* aget-object v0, p1, v8 */
/* iget v0, v0, Landroid/graphics/PointF;->x:F */
/* sub-float/2addr v0, v10 */
/* aget-object v1, p1, v8 */
/* iget v1, v1, Landroid/graphics/PointF;->y:F */
/* sub-float/2addr v1, v10 */
/* iget v4, p0, Lnet/chobin/android/psdxylz/app/av;->c:F */
/* iget v5, p0, Lnet/chobin/android/psdxylz/app/av;->d:F */
/* iget v6, p0, Lnet/chobin/android/psdxylz/app/av;->e:F */
/* iget v7, p0, Lnet/chobin/android/psdxylz/app/av;->f:F */
/* move v3, v2 */
v0 = /* invoke-static/range {v0 ..v7}, Lnet/chobin/android/psdxylz/app/s;->a(FFFFFFFF)Z */
if ( v0 != null) { // if-eqz v0, :cond_2
/* aget-object v0, p1, v8 */
/* iget v0, v0, Landroid/graphics/PointF;->x:F */
/* iput v0, p0, Lnet/chobin/android/psdxylz/app/av;->a:F */
/* aget-object v0, p1, v8 */
/* iget v0, v0, Landroid/graphics/PointF;->y:F */
/* iput v0, p0, Lnet/chobin/android/psdxylz/app/av;->b:F */
/* iget v0, p0, Lnet/chobin/android/psdxylz/app/av;->b:I */
/* if-ne v0, v11, :cond_0 */
/* iput v8, p0, Lnet/chobin/android/psdxylz/app/av;->b:I */
int v9 = 1; // const/4 v9, 0x1
} // :cond_2
/* add-int/lit8 v0, v8, 0x1 */
/* move v8, v0 */
} // .end method
