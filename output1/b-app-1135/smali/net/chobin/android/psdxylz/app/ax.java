public class net.chobin.android.psdxylz.app.ax extends java.lang.Thread {
	 /* # static fields */
	 private static Integer a;
	 /* # instance fields */
	 private java.lang.String a;
	 private net.chobin.android.psdxylz.app.k a;
	 private net.chobin.android.psdxylz.app.m a;
	 private Boolean a;
	 private Integer b;
	 private Integer c;
	 private Integer d;
	 private Integer e;
	 /* # direct methods */
	 public net.chobin.android.psdxylz.app.ax ( ) {
		 /* .locals 2 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Thread;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 this.a = v0;
		 /* iput-boolean v1, p0, Lnet/chobin/android/psdxylz/app/ax;->a:Z */
		 int v0 = -1; // const/4 v0, -0x1
		 /* iput v0, p0, Lnet/chobin/android/psdxylz/app/ax;->c:I */
		 /* iput v1, p0, Lnet/chobin/android/psdxylz/app/ax;->d:I */
		 this.a = p1;
		 this.a = p2;
		 this.a = p4;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 2 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lnet/chobin/android/psdxylz/app/ax;->a:Z */
		 /* iget v0, p0, Lnet/chobin/android/psdxylz/app/ax;->c:I */
		 /* iget v1, p0, Lnet/chobin/android/psdxylz/app/ax;->b:I */
		 /* if-ne v0, v1, :cond_0 */
		 int v0 = -1; // const/4 v0, -0x1
		 /* iput v0, p0, Lnet/chobin/android/psdxylz/app/ax;->c:I */
	 } // :cond_0
	 return;
} // .end method
public void a ( Object p0, java.lang.String p1, Object p2 ) {
	 /* .locals 12 */
	 /* if-nez p2, :cond_1 */
} // :cond_0
} // :goto_0
return;
} // :cond_1
/* const/16 v0, 0xdc */
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
try { // :try_start_0
v0 = android.graphics.Color .argb ( v0,v1,v2,v3 );
(( net.chobin.android.psdxylz.app.o ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lnet/chobin/android/psdxylz/app/o;->a(I)V
int v0 = 0; // const/4 v0, 0x0
v1 = this.b;
v1 = (( android.graphics.Canvas ) v1 ).getHeight ( ); // invoke-virtual {v1}, Landroid/graphics/Canvas;->getHeight()I
/* div-int/lit8 v1, v1, 0x2 */
/* int-to-float v1, v1 */
/* const/high16 v2, 0x41700000 # 15.0f */
/* iget v3, p1, Lnet/chobin/android/psdxylz/app/o;->b:F */
/* mul-float/2addr v2, v3 */
/* sub-float/2addr v1, v2 */
/* float-to-int v1, v1 */
v2 = this.b;
v2 = (( android.graphics.Canvas ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Canvas;->getWidth()I
/* const/high16 v3, 0x41f00000 # 30.0f */
/* iget v4, p1, Lnet/chobin/android/psdxylz/app/o;->b:F */
/* mul-float/2addr v3, v4 */
/* float-to-int v3, v3 */
(( net.chobin.android.psdxylz.app.o ) p1 ).b ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Lnet/chobin/android/psdxylz/app/o;->b(IIII)V
int v0 = -1; // const/4 v0, -0x1
(( net.chobin.android.psdxylz.app.o ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lnet/chobin/android/psdxylz/app/o;->a(I)V
/* if-nez p3, :cond_3 */
/* const/high16 v0, 0x72000000 */
net.chobin.android.psdxylz.app.n .a ( v0 );
v1 = this.b;
v1 = (( android.graphics.Canvas ) v1 ).getWidth ( ); // invoke-virtual {v1}, Landroid/graphics/Canvas;->getWidth()I
/* int-to-float v1, v1 */
v2 = this.a;
v2 = (( android.graphics.Paint ) v2 ).measureText ( p2 ); // invoke-virtual {v2, p2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
/* sub-float/2addr v1, v2 */
/* const/high16 v2, 0x40000000 # 2.0f */
/* div-float/2addr v1, v2 */
/* float-to-int v1, v1 */
v2 = this.b;
v2 = (( android.graphics.Canvas ) v2 ).getHeight ( ); // invoke-virtual {v2}, Landroid/graphics/Canvas;->getHeight()I
/* div-int/lit8 v2, v2, 0x2 */
/* int-to-float v2, v2 */
/* const/high16 v3, -0x3ec00000 # -12.0f */
v0 = (( net.chobin.android.psdxylz.app.n ) v0 ).a ( ); // invoke-virtual {v0}, Lnet/chobin/android/psdxylz/app/n;->a()F
/* add-float/2addr v0, v3 */
/* iget v3, p1, Lnet/chobin/android/psdxylz/app/o;->b:F */
/* mul-float/2addr v0, v3 */
/* add-float/2addr v0, v2 */
/* float-to-int v0, v0 */
(( net.chobin.android.psdxylz.app.o ) p1 ).a ( p2, v1, v0 ); // invoke-virtual {p1, p2, v1, v0}, Lnet/chobin/android/psdxylz/app/o;->a(Ljava/lang/String;II)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
} // :goto_1
/* const/16 v1, 0x8 */
/* if-lt v0, v1, :cond_4 */
} // :goto_2
/* iget v0, p0, Lnet/chobin/android/psdxylz/app/ax;->e:I */
/* add-int/2addr v0, v1 */
/* iput v0, p0, Lnet/chobin/android/psdxylz/app/ax;->e:I */
/* iget v0, p0, Lnet/chobin/android/psdxylz/app/ax;->e:I */
/* if-gez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lnet/chobin/android/psdxylz/app/ax;->e:I */
} // :cond_3
try { // :try_start_1
v0 = this.b;
v0 = (( android.graphics.Canvas ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/graphics/Canvas;->getWidth()I
/* int-to-float v0, v0 */
v1 = (( java.lang.String ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/lang/String;->length()I
/* mul-int/lit8 v1, v1, 0x7 */
/* int-to-float v1, v1 */
/* iget v2, p1, Lnet/chobin/android/psdxylz/app/o;->a:F */
/* mul-float/2addr v1, v2 */
/* sub-float/2addr v0, v1 */
/* const/high16 v1, 0x40000000 # 2.0f */
/* div-float/2addr v0, v1 */
/* float-to-int v11, v0 */
v0 = this.b;
v0 = (( android.graphics.Canvas ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/graphics/Canvas;->getHeight()I
/* div-int/lit8 v0, v0, 0x2 */
/* int-to-float v0, v0 */
/* const/high16 v1, -0x3ec00000 # -12.0f */
/* iget v2, p1, Lnet/chobin/android/psdxylz/app/o;->b:F */
/* mul-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
/* float-to-int v3, v0 */
int v0 = 0; // const/4 v0, 0x0
/* move v10, v0 */
} // :goto_3
v0 = (( java.lang.String ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/lang/String;->length()I
/* if-ge v10, v0, :cond_2 */
v0 = (( java.lang.String ) p2 ).charAt ( v10 ); // invoke-virtual {p2, v10}, Ljava/lang/String;->charAt(I)C
/* add-int/lit8 v0, v0, -0x20 */
/* int-to-float v1, v11 */
/* mul-int/lit8 v2, v10, 0x7 */
/* int-to-float v2, v2 */
/* iget v4, p1, Lnet/chobin/android/psdxylz/app/o;->a:F */
/* mul-float/2addr v2, v4 */
/* add-float/2addr v1, v2 */
/* float-to-int v2, v1 */
/* const/high16 v1, 0x41000000 # 8.0f */
/* iget v4, p1, Lnet/chobin/android/psdxylz/app/o;->a:F */
/* mul-float/2addr v1, v4 */
/* float-to-int v4, v1 */
/* const/high16 v1, 0x41300000 # 11.0f */
/* iget v5, p1, Lnet/chobin/android/psdxylz/app/o;->b:F */
/* mul-float/2addr v1, v5 */
/* float-to-int v5, v1 */
/* rem-int/lit8 v1, v0, 0x10 */
/* mul-int/lit8 v6, v1, 0x8 */
/* div-int/lit8 v0, v0, 0x10 */
/* mul-int/lit8 v7, v0, 0xb */
/* const/16 v8, 0x8 */
/* const/16 v9, 0xb */
/* move-object v0, p1 */
/* move-object v1, p3 */
/* invoke-virtual/range {v0 ..v9}, Lnet/chobin/android/psdxylz/app/o;->a(Lnet/chobin/android/psdxylz/app/p;IIIIIIII)V */
/* add-int/lit8 v0, v10, 0x1 */
/* move v10, v0 */
} // :cond_4
/* iget v1, p0, Lnet/chobin/android/psdxylz/app/ax;->e:I */
/* div-int/lit8 v1, v1, 0x32 */
/* rem-int/lit8 v1, v1, 0x8 */
/* if-ne v1, v0, :cond_5 */
int v1 = -1; // const/4 v1, -0x1
(( net.chobin.android.psdxylz.app.o ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Lnet/chobin/android/psdxylz/app/o;->a(I)V
} // :goto_4
v1 = this.b;
v1 = (( android.graphics.Canvas ) v1 ).getWidth ( ); // invoke-virtual {v1}, Landroid/graphics/Canvas;->getWidth()I
/* div-int/lit8 v1, v1, 0x2 */
/* int-to-float v1, v1 */
/* mul-int/lit8 v2, v0, 0x8 */
/* add-int/lit8 v2, v2, -0x1c */
/* int-to-float v2, v2 */
/* iget v3, p1, Lnet/chobin/android/psdxylz/app/o;->a:F */
/* mul-float/2addr v2, v3 */
/* add-float/2addr v1, v2 */
/* float-to-int v1, v1 */
v2 = this.b;
v2 = (( android.graphics.Canvas ) v2 ).getHeight ( ); // invoke-virtual {v2}, Landroid/graphics/Canvas;->getHeight()I
/* div-int/lit8 v2, v2, 0x2 */
/* int-to-float v2, v2 */
/* const/high16 v3, 0x41000000 # 8.0f */
/* iget v4, p1, Lnet/chobin/android/psdxylz/app/o;->b:F */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
/* float-to-int v2, v2 */
/* const/high16 v3, 0x40a00000 # 5.0f */
/* iget v4, p1, Lnet/chobin/android/psdxylz/app/o;->a:F */
/* mul-float/2addr v3, v4 */
/* float-to-int v3, v3 */
/* const/high16 v4, 0x40800000 # 4.0f */
/* iget v5, p1, Lnet/chobin/android/psdxylz/app/o;->b:F */
/* mul-float/2addr v4, v5 */
/* float-to-int v4, v4 */
(( net.chobin.android.psdxylz.app.o ) p1 ).b ( v1, v2, v3, v4 ); // invoke-virtual {p1, v1, v2, v3, v4}, Lnet/chobin/android/psdxylz/app/o;->b(IIII)V
/* add-int/lit8 v0, v0, 0x1 */
/* goto/16 :goto_1 */
} // :cond_5
/* iget v1, p0, Lnet/chobin/android/psdxylz/app/ax;->e:I */
/* div-int/lit8 v1, v1, 0x32 */
/* rem-int/lit8 v1, v1, 0x8 */
/* add-int/lit8 v2, v0, 0x1 */
/* rem-int/lit8 v2, v2, 0x8 */
/* if-ne v1, v2, :cond_6 */
/* const v1, -0x777778 */
(( net.chobin.android.psdxylz.app.o ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Lnet/chobin/android/psdxylz/app/o;->a(I)V
/* :catch_0 */
/* move-exception v0 */
/* goto/16 :goto_2 */
} // :cond_6
/* iget v1, p0, Lnet/chobin/android/psdxylz/app/ax;->e:I */
/* div-int/lit8 v1, v1, 0x32 */
/* rem-int/lit8 v1, v1, 0x8 */
/* add-int/lit8 v2, v0, 0x2 */
/* rem-int/lit8 v2, v2, 0x8 */
/* if-ne v1, v2, :cond_7 */
/* const v1, -0xbbbbbc */
(( net.chobin.android.psdxylz.app.o ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Lnet/chobin/android/psdxylz/app/o;->a(I)V
} // :cond_7
/* const/high16 v1, -0x1000000 */
(( net.chobin.android.psdxylz.app.o ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Lnet/chobin/android/psdxylz/app/o;->a(I)V
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
} // .end method
public void run ( ) {
/* .locals 5 */
net.chobin.android.psdxylz.app.ar .a ( );
v0 = this.a;
(( net.chobin.android.psdxylz.app.m ) v0 ).a ( ); // invoke-virtual {v0}, Lnet/chobin/android/psdxylz/app/m;->a()Lnet/chobin/android/psdxylz/app/o;
try { // :try_start_0
/* new-instance v0, Lnet/chobin/android/psdxylz/app/p; */
v2 = this.a;
v2 = this.a;
final String v3 = "IMG"; // const-string v3, "IMG"
/* const/16 v4, 0xd */
net.chobin.android.psdxylz.app.aj .a ( v2,v3,v4 );
/* invoke-direct {v0, v2}, Lnet/chobin/android/psdxylz/app/p;-><init>(Landroid/graphics/Bitmap;)V */
/* :try_end_0 */
/* .catch Lnet/chobin/android/psdxylz/app/ah; {:try_start_0 ..:try_end_0} :catch_0 */
} // :cond_0
} // :goto_0
/* iget-boolean v2, p0, Lnet/chobin/android/psdxylz/app/ax;->a:Z */
/* if-nez v2, :cond_2 */
} // :goto_1
if ( v0 != null) { // if-eqz v0, :cond_1
(( net.chobin.android.psdxylz.app.p ) v0 ).a ( ); // invoke-virtual {v0}, Lnet/chobin/android/psdxylz/app/p;->a()V
} // :cond_1
return;
/* :catch_0 */
/* move-exception v0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_2
/* iget v2, p0, Lnet/chobin/android/psdxylz/app/ax;->c:I */
int v3 = -1; // const/4 v3, -0x1
/* if-ne v2, v3, :cond_3 */
/* iget v2, p0, Lnet/chobin/android/psdxylz/app/ax;->b:I */
/* iput v2, p0, Lnet/chobin/android/psdxylz/app/ax;->c:I */
} // :cond_3
/* iget v2, p0, Lnet/chobin/android/psdxylz/app/ax;->c:I */
/* iget v3, p0, Lnet/chobin/android/psdxylz/app/ax;->b:I */
/* if-ne v2, v3, :cond_5 */
(( net.chobin.android.psdxylz.app.o ) v1 ).c ( ); // invoke-virtual {v1}, Lnet/chobin/android/psdxylz/app/o;->c()V
(( net.chobin.android.psdxylz.app.o ) v1 ).f ( ); // invoke-virtual {v1}, Lnet/chobin/android/psdxylz/app/o;->f()V
v2 = this.b;
v3 = this.a;
this.b = v3;
v3 = this.b;
if ( v3 != null) { // if-eqz v3, :cond_4
v3 = this.a;
(( net.chobin.android.psdxylz.app.ax ) p0 ).a ( v1, v3, v0 ); // invoke-virtual {p0, v1, v3, v0}, Lnet/chobin/android/psdxylz/app/ax;->a(Lnet/chobin/android/psdxylz/app/o;Ljava/lang/String;Lnet/chobin/android/psdxylz/app/p;)V
} // :cond_4
this.b = v2;
int v2 = 1; // const/4 v2, 0x1
(( net.chobin.android.psdxylz.app.o ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lnet/chobin/android/psdxylz/app/o;->a(Z)V
} // :cond_5
net.chobin.android.psdxylz.app.ar .a ( v2 );
v2 = this.a;
v2 = (( net.chobin.android.psdxylz.app.k ) v2 ).a ( ); // invoke-virtual {v2}, Lnet/chobin/android/psdxylz/app/k;->a()Z
if ( v2 != null) { // if-eqz v2, :cond_0
} // .end method
public void start ( ) {
/* .locals 2 */
/* iget v0, p0, Lnet/chobin/android/psdxylz/app/ax;->d:I */
/* iput v0, p0, Lnet/chobin/android/psdxylz/app/ax;->b:I */
/* iget v0, p0, Lnet/chobin/android/psdxylz/app/ax;->d:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lnet/chobin/android/psdxylz/app/ax;->d:I */
/* iget v0, p0, Lnet/chobin/android/psdxylz/app/ax;->c:I */
int v1 = -1; // const/4 v1, -0x1
/* if-ne v0, v1, :cond_0 */
/* iget v0, p0, Lnet/chobin/android/psdxylz/app/ax;->b:I */
/* iput v0, p0, Lnet/chobin/android/psdxylz/app/ax;->c:I */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lnet/chobin/android/psdxylz/app/ax;->e:I */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lnet/chobin/android/psdxylz/app/ax;->a:Z */
/* invoke-super {p0}, Ljava/lang/Thread;->start()V */
return;
} // .end method
